package com.dqvoice.spring.oauth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作用:
 * User: duqi
 * Date: 2017/4/16
 * Time: 19:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;
}
