package com.learn.spring.guru.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BaseEntity implements Serializable {

    private Long id;

}
