package pl.wsb.jdbcdemo;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DemoConnection {

    public static Connection getConnection() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("org.hsqldb.jdbc.JDBCDriver").getConstructor().newInstance();
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:c:/data/testbase");
        Statement statement = connection.createStatement();
        statement.execute("drop table if exists players");
        //metoda do wykonania dowolnych poleceń SQL
        boolean execute = statement.execute("create table if not exists players (id integer primary key, name varchar(20), points integer)");
        //metoda do operacji INSERT, UPDATE i DELETE
        int rowInserted = statement.executeUpdate("insert into players values(1, 'adam', 123)");
        rowInserted += statement.executeUpdate("insert into players values(2, 'karol', 13)");
        rowInserted += statement.executeUpdate("insert into players values(3, 'ewa', null)");
        return connection;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class.forName("org.hsqldb.jdbc.JDBCDriver").getConstructor().newInstance();
        try(
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:c:/data/testbase");
            Statement statement = connection.createStatement();
        ) {
            statement.execute("drop table players");
            //metoda do wykonania dowolnych poleceń SQL
            boolean execute = statement.execute("create table if not exists players (id integer primary key, name varchar(20), points integer)");
            //metoda do operacji INSERT, UPDATE i DELETE
            int rowInserted = statement.executeUpdate("insert into players values(1, 'adam', 123)");
            rowInserted += statement.executeUpdate("insert into players values(2, 'karol', 13)");
            rowInserted += statement.executeUpdate("insert into players values(3, 'ewa', 43)");
            System.out.println("Czy jest wynik wykonania create table: " + execute);
            System.out.println("Ilość wstawionych wierszy: " + rowInserted);
            //metoda do wykonywania polecen SELECT, które zwracają ResultSet
            ResultSet set = statement.executeQuery("select * from players");
            while(set.next()){
                int id = set.getInt("id");
                String name = set.getString("name");
                int points = set.getInt("points");
                System.out.println("Gracz: " + name + " o id: " + id +" i liczbie punktów: " + points);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
