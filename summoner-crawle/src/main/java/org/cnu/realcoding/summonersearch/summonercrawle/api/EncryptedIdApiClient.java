package org.cnu.realcoding.summonersearch.summonercrawle.api;

import org.cnu.realcoding.summonersearch.summonercrawle.repository.LeaguePositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EncryptedIdApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{encryptedID}?api_key={apiKey}";

    public Set<LeaguePositionRepository> getLeaguePositionEncryptedIDs(String ID) {
        Set<LeaguePositionRepository> set = new HashSet<>();
        set.add(restTemplate.exchange(requestUrl,
                HttpMethod.GET,
                null,
                LeaguePositionRepository.class,
                ID,
                "RGAPI-4d63e51e-bc50-4f51-b530-8b0e951d7b3c").getBody());
        return set;
    }
}
