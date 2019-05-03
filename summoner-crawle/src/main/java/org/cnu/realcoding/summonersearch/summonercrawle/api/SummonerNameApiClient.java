package org.cnu.realcoding.summonersearch.summonercrawle.api;

import org.cnu.realcoding.summonersearch.summonercrawle.domain.SummonerName;
import org.springframework.http.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SummonerNameApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{paramName}?api_key={apiKey}";

    public String getLeaguePositionByName(String summonerName) {
        return restTemplate.exchange(requestUrl,
                HttpMethod.GET,
                null,
                String.class,
                summonerName,
                "RGAPI-4d63e51e-bc50-4f51-b530-8b0e951d7b3c").getBody();
    }
}