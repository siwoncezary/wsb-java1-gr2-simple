package pl.wsb.jdbcdemo;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SQLInjectionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection connection = DemoConnection.getConnection()){
            System.out.println("Wpisz imię gracza");
            String name = scanner.nextLine();
            ResultSet set;
            //Polecenie podatne na SQLInjection!!!!
            //set = connection.createStatement().executeQuery("select * from players where name = " + name);
            PreparedStatement statement = connection.prepareStatement(
                    "select * from players where name like ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            statement.setString(1, name);
            set = statement.executeQuery();
            while(set.next()){
                int points = set.getInt("points");
                if (set.wasNull()){
                    System.out.println("Gracza : " + set.getString("name") + " nie ma punktów");
                } else {
                    System.out.println("Punkty gracza: " + set.getString("name") + " " + set.getInt("points"));
                }
            }
            set.beforeFirst();
            while(set.next()){
                System.out.println(set.getInt("id"));
            }
            set.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
