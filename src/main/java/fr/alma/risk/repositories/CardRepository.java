package fr.alma.risk.repositories;

import org.springframework.data.repository.CrudRepository;


public interface CardRepository extends CrudRepository<Card, Long>{

    public interface CustomerRepository extends CrudRepository<Card, Long> {


        Card findById(long id);
    }
}
