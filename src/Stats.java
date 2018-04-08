
public class Stats {

    private int level;
    private int HP;
    private int attack;
    private int defense;
    private int specAttack;
    private int specDefense;
    private int speed;


    public Stats(
        int level,
        int hP,
        int attack,
        int defense,
        int specAttack,
        int specDefense,
        int speed) {
        super();
        this.level = level;
        this.HP = hP;
        this.attack = attack;
        this.defense = defense;
        this.specAttack = specAttack;
        this.specDefense = specDefense;
        this.speed = speed;
    }


    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }


    public int getHP() {
        return HP;
    }


    public void setHP(int hP) {
        HP = hP;
    }


    public int getAttack() {
        return attack;
    }


    public void setAttack(int attack) {
        this.attack = attack;
    }


    public int getDefense() {
        return defense;
    }


    public void setDefense(int defense) {
        this.defense = defense;
    }


    public int getSpecAttack() {
        return specAttack;
    }


    public void setSpecAttack(int specAttack) {
        this.specAttack = specAttack;
    }


    public int getSpecDefense() {
        return specDefense;
    }


    public void setSpecDefense(int specDefense) {
        this.specDefense = specDefense;
    }


    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public String toString() {
        return "Level: " + getLevel() + "\nHP: " + getHP() + "\nAttack: "
            + getAttack() + "\nDefense: " + getDefense() + "\nSpec. Attack: "
            + getSpecAttack() + "\nSpec. Defense: " + getSpecDefense()
            + "\nSpeed: " + getSpeed();
    }

}
