package com;

import com.dao.PersonDaoNeo4j;
import com.domain.Person;
import org.junit.jupiter.api.Test;
import org.neo4j.driver.internal.value.NodeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot21Neo4jApplicationTests {
	@Autowired
	PersonDaoNeo4j personDaoNeo4j;


	@Test
	void contextLoads() {
		Person la = personDaoNeo4j.getknowledges("La");
		System.out.println(la);



	}

}
