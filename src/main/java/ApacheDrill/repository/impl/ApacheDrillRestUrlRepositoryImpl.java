package ApacheDrill.repository.impl;

import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ApacheDrill.config.ApacheDrillUrlConfig;
import ApacheDrill.repository.ApacheDrillRestUrlRepository;
import ApacheDrill.util.ResponseUtil;

@Repository
public class ApacheDrillRestUrlRepositoryImpl implements ApacheDrillRestUrlRepository {

  private static final String QUERY_FRAME = "SELECT * FROM Kafka_QA1.`%s` LIMIT %s";

  @Autowired
  private ApacheDrillUrlConfig apacheDrillUrlConfig;

  @Override
  public String getEventsFromTopic(String topicName, String limit) throws Exception{
    Statement statement = apacheDrillUrlConfig.getConnection().createStatement();
    String query = String.format(QUERY_FRAME, topicName, limit);
    ResultSet resultSet = statement.executeQuery(query);
    return ResponseUtil.getJsonString(resultSet);
  }

}
