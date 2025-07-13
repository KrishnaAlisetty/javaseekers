package info.javaseekers.controller;

import info.javaseekers.entity.Topic;
import info.javaseekers.service.TopicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tpc")
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping("/save")
    public void saveTopic(@RequestBody Topic topic) {
        topicService.saveTopic(topic);
    }

    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return  topicService.fetchAllTopics();
    }
}
