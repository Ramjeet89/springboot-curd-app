package com.curd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "ID of the User", name = "id", required = true)
    private long id;

    @Column(name = "first_name", nullable = false)
    @NotNull
    @ApiModelProperty(notes = "First Name of the User", name = "first_name", required = true, value = "test_first_name")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotNull
    @ApiModelProperty(notes = "Last Name of the User", name = "last_name", required = true, value = "test_last_name")
    private String lastName;

    @Column(name = "email_address", nullable = false)
    @Email
    @NotNull
    @ApiModelProperty(notes = "Email Address of the User", name = "email_address", required = true, value = "test_email")
    private String emailId;

    @Column(name = "created_by", nullable = false)
    @NotNull
    @ApiModelProperty(notes = "Who has created the User", name = "created_by", required = true, value = "created_name")
    @CreatedBy
    private String createdBy;

    @Column(name = "updated_by", nullable = false)
    @NotNull
    @ApiModelProperty(notes = "Who has updated the User", name = "updated_by", required = true, value = "updated_name")
    @LastModifiedBy
    private String updatedby;
}
