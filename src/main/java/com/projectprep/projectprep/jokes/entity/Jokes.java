package com.projectprep.projectprep.jokes.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@Table(name = "jokes_tbl")
@JsonIgnoreProperties(ignoreUnknown = false)
public class Jokes {

    @Id
      /*      @SequenceGenerator(
                    name = "jokes_sequence",
                    sequenceName = "jokes_sequence",
                    allocationSize = 1
            )
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "jokes_sequence"
            )*/

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long jokeId;

    @Column(name = "joke_description")
    @JsonProperty(value = "joke")
    String jokeDescription;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "jokes_type_id",
            referencedColumnName = "jokeTypeId"
    )
    @JsonProperty(value = "lang")
    private JokeType jokeType;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "joke_category_id",
            referencedColumnName = "jokeCategoryId"
    )
    @JsonProperty(value = "category")
    private JokeCategory jokeCategory;


    @ManyToMany()
    @JoinTable(name = "client_map",
            joinColumns =@JoinColumn(
                    name = "joke_id",
                    referencedColumnName = "jokeId"
            ),
            inverseJoinColumns =@JoinColumn(
                    name = "client_id",
                    referencedColumnName = "clientId"
            )

    )
    private List<Client> clientList;


}
