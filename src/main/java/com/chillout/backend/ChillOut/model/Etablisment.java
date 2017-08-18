package com.chillout.backend.ChillOut.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etablisment {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column
    private String name;

    @Column
    private String siren;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String cp;

    @Column
    private String longitude;

    @Column
    private String lattitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_id", nullable = false)
    private SubCategory subCategory;

    /*
    TODO : A AJOUTER DANS LA TABLE
     */

    @Column
    private String homePhone;

    @Column
    private String mobilePhone;

    @Column
    private Picture logo;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="etablisment")
    private List<Picture> pictures;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="etablisment")
    private List<SocialNetwork> socialNetworks;

}
