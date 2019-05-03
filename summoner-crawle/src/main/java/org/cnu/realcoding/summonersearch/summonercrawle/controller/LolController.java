package org.cnu.realcoding.summonersearch.summonercrawle.controller;


import org.cnu.realcoding.summonersearch.summonercrawle.api.EncryptedIdApiClient;
import org.cnu.realcoding.summonersearch.summonercrawle.api.SummonerNameApiClient;
import org.cnu.realcoding.summonersearch.summonercrawle.domain.SummonerName;
import org.cnu.realcoding.summonersearch.summonercrawle.repository.LeaguePositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LolController {
    @Autowired
    private SummonerNameApiClient summonerNameApiClient;
    private SummonerName summonerName;

    @Autowired
    private EncryptedIdApiClient encryptedIdApiClient;
    private List<LeaguePositionRepository> leaguePositionEncryptedIDs;

    @Autowired
    LeaguePositionRepository leaguePositionRepository;

//    @RequestMapping("/summonerEncryptedID/{name}")
//    public SummonerName index(@PathVariable String name){
//        summonerName = summonerNameApiClient.getLeaguePositionByName(name);
//        return summonerName;
//    }

    @GetMapping("/search/{name}")
    public void indexFromID(@PathVariable String name){
        String id = "";
        String all = summonerNameApiClient.getLeaguePositionByName(name);
//        id = summonerName.getId();
//        leaguePositionEncryptedIDs = encryptedIdApiClient.getLeaguePositionEncryptedIDs(id);
//        leaguePositionRepository.insertSummoner(leaguePositionEncryptedIDs);
//        return leaguePositionEncryptedIDs;
    }
}