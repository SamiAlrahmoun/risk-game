package fr.alma.risk;

import fr.alma.risk.repositories.Card;
import fr.alma.risk.repositories.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
 class AcessJpaApp {

    private static final Logger log = LoggerFactory.getLogger(AcessJpaApp.class);

    public static void main(String[] args) {
        SpringApplication.run(AcessJpaApp.class);
    }

    @Bean
    public CommandLineRunner demo(CardRepository repository) {
        return (args) -> {
            // save a few Cards
            repository.save(new Card());


            // fetch all Cards
            log.info("Cards found with findAll():");
            log.info("-------------------------------");
            for (Card Card : repository.findAll()) {
                log.info(Card.toString());
            }
            log.info("");

            // fetch an individual Card by ID
            Optional<Card> Card = repository.findById(1L);
            log.info("Card found with findById(1L):");
            log.info("--------------------------------");
            log.info(Card.toString());
            log.info("");

            // for (Card bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };
    }

}