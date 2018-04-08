
public class Move {

    private String move;
    private Type type;
    private int power;


    public Move(String move, Type type, int power) {
        this.move = move;
        this.type = type;
        this.power = power;
    }


    public String getMove() {
        return move;
    }


    public void setMove(String move) {
        this.move = move;
    }


    public Type getType() {
        return type;
    }


    public void setType(Type type) {
        this.type = type;
    }


    public int getPower() {
        return power;
    }


    public void setPower(int power) {
        this.power = power;
    }

}
