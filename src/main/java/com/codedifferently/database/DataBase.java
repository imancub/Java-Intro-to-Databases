package com.codedifferently.database;

import com.codedifferently.Person;

import java.sql.*;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class DataBase {
    private static final Logger logger = Logger.getGlobal();
    private Connection connection;

    private void getConnection() throws DataBaseConnectionException {
        try{
            // this establishes the connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook?createDatabaseIfNotExist=true&useSSL=false",
                    "developer01", "pass");
            connection.setAutoCommit(false);
            logger.info("Successful Connection");
        }catch (Exception e) {
            logger.warning(e.getMessage());
            throw new DataBaseConnectionException();
        }
    }

    public DataBase() throws DataBaseConnectionException {
        getConnection();
    }

    public boolean savePerson(Person person) throws SQLException {
        // create a statement from the connection
        Statement statement = connection.createStatement();
        // inserting the data
        int result = statement.executeUpdate(String.format("INSERT INTO Person VALUES (%d, %s, %s, %s, %d)",
                person.getId(), person.getFirstName(), person.getLastName(), person.getEmail(), person.getAge()));
        connection.commit();
        return result == 1;
    }

    public Person findPersonByEmail(String person) {
        try {
            String sql = "SELECT ID, NAME, DESIGNATION from EMPLOYEE";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                String name = rs.getString("NAME");
                System.out.println("Found "+ name);
            }
        }catch(SQLException se) {
            }
        return null;
    }

    public List<Person> getAllPeople(){
        try{
            String sql = "SELECT * from EMPLOYEE";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                String allPeople = resultSet.getString("NAME");
                System.out.println("Found "+ allPeople);
            }
        } catch(SQLException se) {
            }
        return null;
    }

    public boolean updatePerson(Person person){

        return  true;
    }

}
