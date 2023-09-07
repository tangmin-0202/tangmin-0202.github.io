package com.dao;

import com.domain.Person;
import org.neo4j.driver.internal.value.NodeValue;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//被spring管理
public interface PersonDaoNeo4j extends Neo4jRepository<Person,Long> {


    @Query("MATCH(n:Employee{name:$name})-->(m:person) return m")
    public  Person getknowledges(@Param("name")String name);








}
