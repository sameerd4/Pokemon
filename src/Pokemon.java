
public class Pokemon {

    private String name;
    private Type type;
    private Move[] moves;
    private Stats stats;


    public Pokemon(String name, Type type, Move[] moves, Stats stats) {
        this.name = name;
        this.type = type;
        this.moves = moves;
        this.stats = stats;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Type getType() {
        return type;
    }


    public void setType(Type type) {
        this.type = type;
    }


    public Move[] getMoves() {
        return moves;
    }


    public void setMoves(Move[] moves) {
        this.moves = moves;
    }


    public Stats getStats() {
        return stats;
    }


    public void setStats(Stats stats) {
        this.stats = stats;
    }


    public void attack(Pokemon other) {

    }


    public String toString() {
        return "Name: " + name + "\nType: " + type.getType() + "\n\n" + stats
            .toString() + "\n\nMoves:" + "\n" + moves[0].getMove() + "\n"
            + moves[1].getMove() + "\n" + moves[2].getMove() + "\n" + moves[3]
                .getMove();
    }

}
