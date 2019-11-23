package fr.alma.risk;

import java.util.ArrayList;

public class Continent {
    private String name;
    private ArrayList<Territory> territories;

    public Continent (){

    }

    /**
     * return array of countries belong to this continent.
     */
    public Territory[] getterritories() {
        return this.territories.toArray(new Territory[this.territories.size()]);
    }

    /**
     * return name of continent.
     */
    public String getContinentName() {
        return this.name;
    }

}
