package com.asheef.employee_management.model_mongodb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document("status")
public class StatusEntity {

    @Id
    @Field(targetType = FieldType.OBJECT_ID)
    private String id;

    @Field(name = "status_name")
    private String statusName;
}
