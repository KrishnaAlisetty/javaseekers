package info.javaseekers.repositories;

import info.javaseekers.entity.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository  extends ListCrudRepository<Topic, Long> {

    @Query("select tpc from Topic tpc where tpc.user.id = :id")
    public List<Topic> findTopicsByUserId(@Param("id") Long id);
}
