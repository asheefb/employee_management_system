package com.asheef.employee_management.model_mongodb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import javax.persistence.Id;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document("project")
public class ProjectEntity {

    @Id
    @Field(targetType = FieldType.OBJECT_ID)
    private String id;

    private String name;

    private String description;

    private String clientName;

    private Date startDate;

    private Date endDate;

    private double budget;
}
