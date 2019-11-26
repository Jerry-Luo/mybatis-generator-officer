package com;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Logger;

public class JDBCTest {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://dcdbt-qn07qqr4.sql.tencentcdb.com:7/qc_credits?useSSL=false",
                "test_shop", "dIJ6_pWKTe");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM user_credits LIMIT 10");
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData meta = rs.getMetaData();
        for(int i = 1; i<=meta.getColumnCount(); i++){
            System.out.print(meta.getColumnName(i)+" ");
        }
        System.out.println();
        while (rs.next()){
            System.out.println(String.format("%s %s %s %s %s %s %s %s",
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8)
            ));
        }

//        PreparedStatement ps1 = conn.prepareStatement("update user_credits set remark = ? where id = ?");
//        ps1.setString(1, "test jdbc");
//        ps1.setLong(2, 1173439021923942401L);
//        int r = ps1.executeUpdate();
//        System.out.println(r);
    }
}
