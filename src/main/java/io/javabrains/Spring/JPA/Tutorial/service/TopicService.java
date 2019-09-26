package io.javabrains.Spring.JPA.Tutorial.service;

import io.javabrains.Spring.JPA.Tutorial.model.Topic;
import io.javabrains.Spring.JPA.Tutorial.model.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll() //Iterable of ALL the topics in the database
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic); //Checks if the row exists and only update if it exists.
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
