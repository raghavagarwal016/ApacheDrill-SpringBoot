package ApacheDrill.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ApacheDrill.repository.ApacheDrillRestUrlRepository;
import ApacheDrill.service.ApacheDrillRestUrlSevice;

@Service
public class ApacheDrillRestUrlSeviceImpl implements ApacheDrillRestUrlSevice {

  @Autowired
  private ApacheDrillRestUrlRepository apacheDrillRestUrlRepository;

  @Override
  public String getEventsFromTopic(String topicName, String limit) throws Exception {
   return apacheDrillRestUrlRepository.getEventsFromTopic(topicName, limit);
  }
}
