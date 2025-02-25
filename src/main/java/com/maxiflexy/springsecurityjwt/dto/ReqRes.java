package com.maxiflexy.springsecurityjwt.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.maxiflexy.springsecurityjwt.entity.Product;
import com.maxiflexy.springsecurityjwt.entity.UserModel;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReqRes {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationDate;
    private String expirationTime;
    private String name;
    private String email;
    private String role;
    private String password;
    private List<Product> products;
    private UserModel ourUsers;
}
