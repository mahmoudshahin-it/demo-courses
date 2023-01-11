package com.example.democourses.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;


    @MappedSuperclass
    @Data
    public class BaseEntity {

        @Id
        @Column(name = "id")
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid",strategy = "uuid2")
        private UUID id;

        @Column(name = "create_time", nullable = false, updatable = false)
        @CreationTimestamp
        private LocalDateTime createTime;

        @Column(name = "update_time")
        @UpdateTimestamp
        private LocalDateTime updateTime;

        @Column(name = "created_by", nullable = false, updatable = false)
        private String createdBy;

        @Column(name = "updated_by")
        private String updatedBy;

        @Column(name = "active")
        private Boolean active;
}
