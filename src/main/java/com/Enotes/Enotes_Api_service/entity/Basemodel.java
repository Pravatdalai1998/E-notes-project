package com.Enotes.Enotes_Api_service.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@MappedSuperclass
public class Basemodel {
     private Boolean inAactive;
     private Boolean inDeleted;
     private Integer createdon;
     private Date  creatDate;
     private Integer updatedby;
     private Integer updatedon;
}
