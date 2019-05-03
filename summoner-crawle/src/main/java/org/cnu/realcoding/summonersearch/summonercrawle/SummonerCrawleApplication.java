package org.cnu.realcoding.summonersearch.summonercrawle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SummonerCrawleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummonerCrawleApplication.class, args);
	}

}
