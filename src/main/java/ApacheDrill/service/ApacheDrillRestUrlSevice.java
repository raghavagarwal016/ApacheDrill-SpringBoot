package ApacheDrill.service;

public interface ApacheDrillRestUrlSevice {
  String getEventsFromTopic(String topicName, String limit) throws Exception;
}
