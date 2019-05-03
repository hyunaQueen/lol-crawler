package org.cnu.realcoding.summonersearch.summonercrawle.domain;

import lombok.Data;

@Data
public class LeaguePositionEncryptedID {
    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private int wins;
    private boolean veteran;
    private int losses;
    private String rank;
    private String leagueId;
    private boolean inactive;
    private boolean freshBlood;
    private String leagueName;
    private String position;
    private String tier;
    private String summonerId; //encrypted
    private int leaguePoints;
}