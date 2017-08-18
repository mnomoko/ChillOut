package com.chillout.backend.ChillOut.enums;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mnomoko on 18/08/2017.
 */
@Getter
@Entity
public enum TypeSocialNetwork {

    FACEBOOK(0, ""),
    TWITTER(1, ""),
    STACKOVERFLOW(2, ""),
    INSTAGRAM(3, "");

    @Id
    private int id;
    private String fontAwesome;

    TypeSocialNetwork(int id, String fAwesome) {
        this.id = id;
        this.fontAwesome = fAwesome;
    }
}
