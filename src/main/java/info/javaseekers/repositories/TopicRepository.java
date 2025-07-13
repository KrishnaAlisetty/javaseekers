package info.javaseekers.repositories;

import info.javaseekers.entity.Topic;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository  extends ListCrudRepository<Topic, Long> {
}
