package com.dimagesharevn.app.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRegistResponse {
    private String username;
    private String message;
}
