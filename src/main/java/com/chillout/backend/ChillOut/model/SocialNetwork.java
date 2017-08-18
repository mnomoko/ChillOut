package com.chillout.backend.ChillOut.model;

import com.chillout.backend.ChillOut.enums.TypeSocialNetwork;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by mnomoko on 18/08/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SocialNetwork {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String url;

    @Column
    private TypeSocialNetwork typeSocialNetwork;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablisment_id", nullable = false)
    private Etablisment etablisment;
}
