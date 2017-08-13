package com.chillout.backend.ChillOut.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubCategory {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column
    private String subCategoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
