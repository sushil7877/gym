package com.gpc.jodhpur.gym.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Pawan Saini
 * Created on 08/06/24.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity<T extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected T id;

    @Column(name = "created_time", nullable = false)
    protected Date createdTime;

    @Column(name = "updated_time", nullable = false)
    protected Date updatedTime;

    @PrePersist
    protected void onCreate() {
        if (this.createdTime == null)
            this.createdTime = new Date();
        if (this.updatedTime == null)
            this.updatedTime = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        if (this.createdTime == null)
            this.createdTime = new Date();
        this.updatedTime = new Date();
    }
}
