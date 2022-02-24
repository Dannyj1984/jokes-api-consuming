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
import java.io.Serializable;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "joke")
    private String joke;

    @Column(name = "setup")
    private String setup;

    @Column(name = "delivery")
    private String delivery;

    @Column(name = "type")
    private String type;

    @Column(name = "category")
    private String category;

    @Column(name = "safe")
    private boolean safe;

    @Column(name = "lang")
    private String lang;

    public Jokes(Jokes joke) {
        this.setup = joke.getSetup();
        this.delivery = joke.getDelivery();
        this.type = joke.getType();
        this.category = joke.getCategory();
        this.safe = joke.isSafe();
        this.lang = joke.getLang();
        this.joke = joke.getJoke();
    }
}
