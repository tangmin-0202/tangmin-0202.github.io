package com.domain;


import com.domain.relationship.同事关系;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.io.Serializable;

@Data

@Node(labels = "person")
public class Person implements Serializable {
    @Id//表明这个neo4j的id
    @GeneratedValue//采用ne4j的自己的生成策略
    private Long id;
    @Property("name")//节点的属性
    private String name;




}
