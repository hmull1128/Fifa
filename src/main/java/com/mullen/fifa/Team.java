package com.mullen.fifa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Team {
    private String name;
    private int points;
    private int wins;
    private int losses;
    private int ties;
    private String category;

    //@Override
    public int getPoints(){
        return (3*(this.wins));
    }

    public int getWins(){
        return 13;
    }
}


