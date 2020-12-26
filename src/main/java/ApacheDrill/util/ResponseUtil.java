package ApacheDrill.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ResponseUtil {

  public static String getJsonString(ResultSet resultSet) throws SQLException {
    JSONArray array = new JSONArray();
    while(resultSet.next()){
      JSONObject record = new JSONObject();
      for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
        record.put(resultSet.getMetaData().getColumnName(i), resultSet.getString(i));
      }
      array.add(record);
    }
    return array.toJSONString();
  }

}
