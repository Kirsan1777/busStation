package dao;

import creator.CreateBus;
import entity.BusStation;
import exception.ProgramException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BusDAOImplement {

    public void addBus(BusStation busStation){
        try (Connection connection = ConnectionCreator.provideConnection();
             PreparedStatement statement = connection.prepareStatement(SqlRequest.ADD_BUS)) {
            statement.setString(1, busStation.getNameBus());
            statement.setInt(2, busStation.getNumberOfBus());
            statement.setInt(3, busStation.getCountOfTicket());
            statement.setString(4, busStation.getTypeOfBus());
            statement.setDouble(5, busStation.getCostTicket());
            statement.executeUpdate();//command from update DB
        } catch (SQLException ex) {
            System.out.println("We have problem with connection");
        }
    }

    public void deleteBus(int numberOfBus){
        try(Connection connection = ConnectionCreator.provideConnection();
            PreparedStatement statement = connection.prepareStatement(SqlRequest.REMOVE_BUS_BY_NUMBER)){
            statement.setInt(1, numberOfBus);
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println("We have problem with connection!");
        }
    }



    public List<BusStation> findAllBuses() throws ProgramException {
        List<BusStation> buses = null;
        try (Connection connection = ConnectionCreator.provideConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SqlRequest.SELECT_ALL_ROUTE);
            buses = readBusesInfo(resultSet);
        } catch (SQLException ex) {
            throw new ProgramException(ex);
        }
        return buses;
    }

    private List<BusStation> readBusesInfo(ResultSet resultSet) throws SQLException{
        CreateBus creator = new CreateBus();
        List<BusStation> buses = new ArrayList<>();
        while (resultSet.next()) {
            String nameBusStation = resultSet.getString(1);
            int numberOfBus = resultSet.getInt(2);
            int countOfTicket = resultSet.getInt(3);
            String typeOfBus = resultSet.getString(4);
            double costTicket = resultSet.getDouble(5);
            buses.add(creator.createOneBus(nameBusStation, numberOfBus, countOfTicket, typeOfBus, costTicket));
        }
        return buses;
    }
}
