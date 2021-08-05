package com.project.personapi.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;


@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("HOME"),
    MOBILE("MOBILE"),
    COMMERCIAL("COMMERCIAL");


    private final String description;
}
