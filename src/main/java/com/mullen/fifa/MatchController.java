package com.mullen.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private MatchService mservice;

    @GetMapping("/all")
    public String getAllMatches(){
        List<Matches> matches = mservice.findAllMatches();
        StringBuilder resultBuilder = new StringBuilder();

        int matchCount = 1;
        resultBuilder.append("<ol>");
        for (Matches match : matches){
            resultBuilder.append(match.toString());
        }
        resultBuilder.append("<ol>");
        return resultBuilder.toString();
    }

    @GetMapping("/group/{gname}")
    public String getWinnerByGroup(@PathVariable String gname){
        return "";
    }

    @GetMapping("/group-winners")
    public String getGroupWinners(){
        return "group winners works";
    }

    @GetMapping("/overall-winner")
    public String getOverallWinner(){
        return "";
    }

}
