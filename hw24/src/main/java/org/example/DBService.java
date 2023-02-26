package org.example;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBService {
    public DBService() throws SQLException {
        Connection connection = greateConnection();
        createStatement(connection);
        closeConnection(connection);
    }

    public Connection greateConnection() throws SQLException {
        DB dbParameters = new DB();
        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setUseSSL(false);
        dataSource.setServerTimezone(dbParameters.serverTimeZone);
        dataSource.setServerName(dbParameters.dbHost);
        dataSource.setDatabaseName(dbParameters.dbName);
        dataSource.setPortNumber(dbParameters.dbPort);
        dataSource.setUser(dbParameters.dbUser);
        dataSource.setPassword(dbParameters.dbPass);

        Connection connection = dataSource.getConnection();
        return connection;
    }
    public Statement createStatement (Connection con) throws SQLException {
        return con.createStatement();
    }
    public void closeConnection(Connection con) throws SQLException {
        con.close();
    }
}
