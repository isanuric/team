package com.isanuric.team.hafez;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Poem {

    private Integer id;
    private String poemName;
    private String poem;

    public Poem() {
    }

    public Poem(String poemName, String poem) {
        this.poemName = poemName;
        this.poem = poem;
    }

    public String getPoemName() {
        return poemName;
    }

    public void setPoemName(String poemName) {
        this.poemName = poemName;
    }

    public String getPoem() {
        return poem;
    }

    public void setPoem(String poem) {
        this.poem = poem;
    }
}
