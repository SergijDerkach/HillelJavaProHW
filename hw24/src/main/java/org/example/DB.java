package org.example;

import lombok.Getter;

@Getter
public class DB {
    public final String dbHost = "localhost";
    public final Integer dbPort = 3306;
    public final String dbUser = "root";
    public final String dbPass = "rootroot";
    public final String dbName = "student";
    public final String serverTimeZone = "UTC";

}
