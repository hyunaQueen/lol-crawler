package org.cnu.realcoding.summonersearch.summonercrawle.repository;

import org.cnu.realcoding.summonersearch.summonercrawle.domain.LeaguePositionEncryptedID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
public class LeaguePositionRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertSummoner(List<LeaguePositionRepository> leaguePositionEncryptedIDs){
        mongoTemplate.insert(leaguePositionEncryptedIDs);

    }
}