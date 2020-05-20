package com.moneymedia.boot230bug.repository;

import com.moneymedia.boot230bug.entity.Counter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJdbcTest
public class CounterRepositoryTest {

    @Autowired
    private CounterRepository counterRepository;

    @Test
    public void createCounter() {
        Counter counter = new Counter();

        Counter saved = counterRepository.save(counter);

        assertNotNull(saved.getCounterId());
    }

}