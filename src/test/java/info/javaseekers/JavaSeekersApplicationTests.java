package info.javaseekers;

import info.javaseekers.entity.Topic;
import info.javaseekers.entity.User;
import info.javaseekers.repositories.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestPropertySource(locations = "classpath:test-application.properties")
class JavaSeekersApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @BeforeAll
    void beforeAll() {
            Topic topic = new Topic();
            topic.setTopicName("Generics");
            User user = new User();
            user.setUserName("Krishna");
            user.setPassword("Password");
            user.setTopics(List.of(topic));
            userRepository.save(user);
    }

    @Test
    public void userTest() {
        List<User> users = userRepository.findAll();
        assertEquals(1, users.size());
    }

    @Test
    public void afterAll() {
        userRepository.deleteAll();
    }

}
