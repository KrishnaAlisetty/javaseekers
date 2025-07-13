package info.javaseekers.service;

import info.javaseekers.controller.TopicController;
import info.javaseekers.entity.Topic;
import info.javaseekers.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public void saveTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public List<Topic> fetchAllTopics() {
        return topicRepository.findAll();
    }
}
