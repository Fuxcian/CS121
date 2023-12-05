//Class #1

package projectTwo;

public abstract class statBlock {
    //Protected Variables:
    protected String creatureName;
    protected String creatureType;
    protected String raceType;

    //ENCAPSULATION:
    public statBlock(String name, String type, String race) {
        this.creatureName = name;
        this.creatureType = type;
        this.raceType = race;
    }

    //Setters and Getters:
    public String getCreatureName() {
        return creatureName;
    }

    public void setCreatureName(String name) {
        this.creatureName = name;
    }

    public String getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(String type) {
        this.creatureType = type;
    }

    public String getRaceType() {
        return raceType;
    }

    public void setRaceType(String race) {
        this.raceType = race;
    }

    //Overrides:
    public abstract void characterCR(int level);

    public abstract void monsterLevel(int CR);
}