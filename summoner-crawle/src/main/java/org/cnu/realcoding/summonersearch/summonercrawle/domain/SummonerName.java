package org.cnu.realcoding.summonersearch.summonercrawle.domain;

import lombok.Data;

@Data
public class SummonerName {
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private long revisionDate;
    private String id; //encryptedId
    private String accountId;
}