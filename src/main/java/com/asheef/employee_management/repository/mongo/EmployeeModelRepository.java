package com.asheef.employee_management.repository.mongo;

import com.asheef.employee_management.model.mongo.entity.EmployeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeModelRepository extends MongoRepository<EmployeeModel,String> {
}
