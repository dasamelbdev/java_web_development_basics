package com.jee.core.exaples;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class App {

    public static void main(String[] ar) {

        /*ithin the servlet container new initial context will created by the container. use the following link
        https://stackoverflow.com/questions/15779510/javax-naming-noinitialcontextexception-java
        */

        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/release-app-db");
            Connection conn = ds.getConnection();

        }
        catch (Exception e){
            e.printStackTrace();

        }

    }


}
