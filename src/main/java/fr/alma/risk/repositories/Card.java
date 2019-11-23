package fr.alma.risk.repositories;

import fr.alma.risk.PieceType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String territoryName;
    private PieceType pieceType;

    public Card(){}



    public Long getId() {
        return id;
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
