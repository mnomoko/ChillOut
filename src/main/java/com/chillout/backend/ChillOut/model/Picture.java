package com.chillout.backend.ChillOut.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by mnomoko on 18/08/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Picture {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Blob img;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablisment_id", nullable = false)
    private Etablisment etablisment;
}
