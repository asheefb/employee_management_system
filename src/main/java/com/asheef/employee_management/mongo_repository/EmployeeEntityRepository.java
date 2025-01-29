package com.asheef.employee_management.mongo_repository;

import com.asheef.employee_management.model_mongodb.EmployeeEntity;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeEntityRepository extends MongoRepository<EmployeeEntity, ObjectId> {
}
