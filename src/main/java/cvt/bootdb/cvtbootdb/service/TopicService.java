package cvt.bootdb.cvtbootdb.service;


import cvt.bootdb.cvtbootdb.model.Topic;
import cvt.bootdb.cvtbootdb.repository.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepo theTopicRepo;

    private List<Topic> topicList= new ArrayList<Topic>(Arrays.asList(
            new Topic("java","java","core java "),
            new Topic("ad_java","ad_java","Advance java ")
    ));


    public List<Topic> getAllTopics(){
        List<Topic> topic=new ArrayList<>();
        theTopicRepo.findAll().forEach(topic::add);
        return topic;
    }

    public Topic getTopic(String id){

        return theTopicRepo.findById(id).orElse(null);
    }

    public void addtopic(Topic topic) {
        theTopicRepo.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        theTopicRepo.save(topic);
    }

    public void deleteTopic(String id){
        theTopicRepo.deleteById(id);
    }
}
