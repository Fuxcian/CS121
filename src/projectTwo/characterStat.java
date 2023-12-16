//Class #2

package projectTwo;

public class characterStat extends statBlock {

    //Character Specific Stats:
    private int level;
    private String mainClass;
    private String subClass;

    //ENCAPSULATION
    public characterStat(String name, String type, String race, int level, String mainClass, String subClass) {
        super(name, type, race);
        this.level = level;
        this.mainClass = mainClass;
        this.subClass = subClass;
    }

    //Setters and Getters:
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    //Overrides:
    @Override
    public void characterCR(int level){
        int CR = (int) (level * .7);
        System.out.println("The hypothetical CR for this player character " +
                "is 70% of the total level: " + CR);

    }
    @Override
    public void monsterLevel(int CR) {

    }
}
