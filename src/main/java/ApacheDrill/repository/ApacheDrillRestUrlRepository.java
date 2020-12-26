package ApacheDrill.repository;

public interface ApacheDrillRestUrlRepository {
  String getEventsFromTopic(String topicName, String limit) throws Exception;
}
