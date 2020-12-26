package ApacheDrill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ApacheDrill.service.ApacheDrillRestUrlSevice;
import lombok.SneakyThrows;

@RestController
@RequestMapping("/drill")
public class ApacheDrillController {

  @Autowired
  private ApacheDrillRestUrlSevice apacheDrillRestUrlSevice;

  @SneakyThrows
  @GetMapping("/{topicName}/{limit}")
  public ResponseEntity<String> getEventsForTopic(@PathVariable("topicName") String topicName,
      @PathVariable("limit") String limit) {
    return new ResponseEntity<>(apacheDrillRestUrlSevice.getEventsFromTopic(topicName, limit), HttpStatus.OK);
  }

}
