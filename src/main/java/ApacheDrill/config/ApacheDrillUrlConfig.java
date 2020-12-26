package ApacheDrill.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApacheDrillUrlConfig {

  @Value("${drill.connection.uri}")
  private String drillConnectionUri;

  public Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("org.apache.drill.jdbc.Driver");
    Connection connection = DriverManager.getConnection(drillConnectionUri);
    return connection;
  }

}
