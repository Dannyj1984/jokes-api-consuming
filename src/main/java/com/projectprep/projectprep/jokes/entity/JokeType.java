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
@Table(name = "jokes_type_tbl")
@JsonIgnoreProperties(ignoreUnknown = true)
public class JokeType {

    @Id
    @SequenceGenerator(
            name = "jokes_type",
            sequenceName = "jokes_type",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "jokes_type"
    )

    Long jokeTypeId;

    @Column(name = "joke_type_name")
    @JsonProperty(value = "lang")
    String typeName;

    @OneToOne(
        mappedBy = "jokeType"
          )
    private Jokes jokes;
}
