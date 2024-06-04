package com.mullen.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepo mrepo;
    private List<Team> teams = new ArrayList<Team>();

    public List<Matches> findAllMatches(){
        return mrepo.findAll();
    }

    //Groups A-H Each group has 2-4 matches and 4 teams each
    public String getGroupWinners(String group){
        return "";
    }

    public String getOverallWinner(){
        return "";
    }

    public List<Team> getAllTeams(){
        return this.teams;
    }

    private Team findOrAddTeam(String teamName){
        return null;
    }

    private void playMatch(Team home, Team other, int goals, int oGoals){
        if(oGoals>goals){
            home.setLosses(home.getLosses()+1);
            other.setWins(other.getWins()+1);
        }else if (goals > oGoals){
            home.setWins(home.getWins()+1);
            other.setLosses(other.getLosses()+1);
        }else {
            home.setTies(home.getTies()+1);
            other.setTies(other.getTies()+1);
        }
    }
}
