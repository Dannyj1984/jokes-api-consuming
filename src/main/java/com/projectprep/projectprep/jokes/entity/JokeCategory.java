package com.projectprep.projectprep.jokes.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@Table(name = "jokes_category_tbl")
@JsonIgnoreProperties(ignoreUnknown = true)
public class JokeCategory {

    @Id
    @SequenceGenerator(
            name = "jokes_category",
            sequenceName = "jokes_category",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "jokes_category"
    )
    Long jokeCategoryId;

    @Column(name="joke_category")
    @JsonProperty(value = "category")
    String jokeCategory;

    @OneToOne(
        mappedBy = "jokeCategory"
     )
    private Jokes jokes;

}
