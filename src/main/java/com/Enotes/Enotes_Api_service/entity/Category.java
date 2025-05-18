package com.Enotes.Enotes_Api_service.entity;

import java.util.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")  
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @Column(name = "is_active")  
    private Boolean isActive;

    @Column(name = "is_deleted")  
    private Boolean isDeleted;

    @Column(name = "created_on")  
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "created_by")  
    private Integer createdBy;

    @Column(name = "updated_by")  
    private Integer updatedBy;

    @Column(name = "updated_on")  
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

}
