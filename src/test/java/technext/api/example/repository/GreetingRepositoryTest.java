package technext.api.example.repository;

import net.bytebuddy.build.BuildLogger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import technext.api.example.model.Greeting;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GreetingRepositoryTest {
    @Autowired
    GreetingRepository repository;

    // JUnit test for saveEmployee
    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveEmployeeTest(){

        Greeting greeting = Greeting
                .builder()
                .content("gian")
                .build();

        repository.save(greeting);
        Assertions.assertThat(greeting.getId()).isGreaterThan(0);
    }
}