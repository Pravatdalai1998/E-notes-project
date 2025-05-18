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
@Table(name = "category")  // Explicitly specify table name (optional but good practice)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @Column(name = "is_active")  // matches your DB column
    private Boolean isActive;

    @Column(name = "is_deleted")  // matches your DB column
    private Boolean isDeleted;

    @Column(name = "created_on")  // match DB column name (not createdDate)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "created_by")  // matches your DB column
    private Integer createdBy;

    @Column(name = "updated_by")  // matches your DB column
    private Integer updatedBy;

    @Column(name = "updated_on")  // match DB column name (not updatedDate)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

}
