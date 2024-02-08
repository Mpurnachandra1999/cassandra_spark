package com.demo.springsparkcassandra.repo;

import lombok.extern.slf4j.Slf4j;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.cassandra.CassandraSQLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.demo.springsparkcassandra.entity.Employee;

@Repository
@Slf4j
public class EmployeeRepository {
    @Autowired
    CassandraSQLContext cassandraSQLContext;

//    @Autowired
//    JavaRDD<Employee> employee;

    public Long countEmp(){
//        return personTable.count();
        log.info("-----------" +cassandraSQLContext.getCluster() + "-----------");
        log.info("-----------" +cassandraSQLContext.getKeyspace() + "-----------");

        DataFrame people = cassandraSQLContext.sql("select * from Employee order by id");
        log.info("-----------" +people.count() + "-----------");
        return people.count();
    }

}
