package com.dimagesharevn.app.models.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ofUser")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class User {
    @Column
    @Id
    @ApiModelProperty(notes = "User name")
    private String username;
    @Column
    @ApiModelProperty(notes = "Stored key")
    private String storedKey;
    @Column
    @ApiModelProperty(notes = "Server key")
    private String serverKey;
    @Column
    @ApiModelProperty(notes = "Salt")
    private String salt;
    @Column
    @ApiModelProperty(notes = "Iterations")
    private Integer iterations;
    @Column
    @ApiModelProperty(notes = "Plain password")
    private String plainPassword;
    @Column
    @ApiModelProperty(notes = "Password after encrypted")
    private String encryptedPassword;
    @Column
    @ApiModelProperty(notes = "Name of user")
    private String name;
    @Column
    @ApiModelProperty(notes = "Email of user")
    private String email;
}
