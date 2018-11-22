package cvt.bootdb.cvtbootdb.repository;

import cvt.bootdb.cvtbootdb.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends CrudRepository<Topic,String> {
    //getAllTopic()
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)



}
