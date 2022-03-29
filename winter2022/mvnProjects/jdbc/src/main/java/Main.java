import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static final String serverTimeZone = "UTC";
    public static final String serverName = "localhost"; // ip address db
    public static final String databaseName ="aero"; // bd name
    public static final int portNumber = 3306; // db port
    public static final String user = "root"; // login
    public static final String password = "rootroot"; // password

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setUseSSL( false );
        dataSource.setServerTimezone( serverTimeZone );
        dataSource.setServerName( serverName );
        dataSource.setDatabaseName( databaseName );
        dataSource.setPortNumber( portNumber );
        dataSource.setUser( user );
        dataSource.setPassword( password );

        Connection connection =  dataSource.getConnection();

        Statement statement = connection.createStatement();

//        statement.execute("insert into  Passenger (ID_psg, name) value  (555, 'Oleksandr Stepurko')");

//        PreparedStatement preparedStatement = connection.prepareStatement("insert into  Passenger (ID_psg, name) value  (?, ?)");
//        List<String> users = List.of("user 1", "user 2", "user 3", "user 4");
//        int j = 500;
//        for (String u : users) {
//            preparedStatement.setInt(1, j++);
//            preparedStatement.setString(2, u);
//            preparedStatement.executeUpdate();
//        }

        ResultSet rs = statement.executeQuery("select * from Passenger order By name");

        System.out.println("Table name : " + rs.getMetaData().getTableName(2)); //true
        System.out.println("------------");
        int columnCount = rs.getMetaData().getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.print("column name : " + rs.getMetaData().getColumnName(i) + ", ");
            System.out.print("column size : " + rs.getMetaData().getColumnDisplaySize(i) + ", ");
            System.out.println("column type : " + rs.getMetaData().getColumnTypeName(i));
        }
        List<Passenger> passengers = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("ID_psg");
            String name = rs.getString("name");
            passengers.add(new Passenger(id, name));
        }
        System.out.println(passengers.size());
        System.out.println("----------");

        for (Passenger ps : passengers)
            System.out.println(ps);;


//
//        Statement st = connection.createStatement();
//        st.executeQuery("insert into address(country) value ('Spain') ");
//
        connection.close();
    }
}
