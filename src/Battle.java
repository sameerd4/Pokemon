import java.util.Random;

public class Battle {

    private Pokemon user;
    private Pokemon opponent;
    private int userHP;
    private int opponentHP;


    public Battle(Pokemon user, Pokemon opponent) {
        this.user = user;
        this.opponent = opponent;
        userHP = user.getStats().getHP();
        opponentHP = opponent.getStats().getHP();
    }


    public String toString() {
        return user.getName() + " HP: " + userHP + "\n" + opponent.getName()
            + " HP: " + opponentHP + "\n";
    }


    public void attack(Pokemon user, String move) {
        int i = 0;
        if (userHP <= 0) {
            System.out.println(user.getName() + " fainted!");
        }
        else if (opponentHP <= 0) {
            System.out.println(opponent.getName() + " fainted!");
        }

        else {
            while (i <= 3) {
                // checks if move is known
                if (move.equals(user.getMoves()[i].getMove())) {

                    Move moveDone = user.getMoves()[i];

                    // subtracts appropriate amount of damage from opponent
                    opponentHP = opponentHP - damageDone(user, opponent,
                        moveDone);

                    // sets HP to 0 when done
                    if (opponentHP < 0) {
                        opponentHP = 0;
                    }

                    // displays use of moves, changes in HP
                    System.out.println(user.getName() + " used " + move + "!");
                    System.out.println("\n" + user.getName() + " HP: " + userHP
                        + "\n" + opponent.getName() + " HP: " + opponentHP
                        + "\n");

                }
                i++;
            }

        }

    }


    // damage calculator
    private int damageDone(Pokemon user, Pokemon opponent, Move move) {
        int damage = (2 + (((2 * user.getStats().getLevel()) / 5) * move
            .getPower() * user.getStats().getAttack() / opponent.getStats()
                .getDefense()) / 50);

        double modifier;

        // accounts for randomness
        Random r = new Random();
        double randomValue = 0.85 + (1.00 - 0.85) * r.nextDouble();

        // accounts for same-type attack bonus
        double STAB = 1;
        Type userType = user.getType();

        Type moveType = move.getType();

        if (userType == moveType) {
            STAB = 1.5;
        }

        // accounts for type effectiveness
        double typeEffective = 1;

        modifier = randomValue * STAB * typeEffective;
        damage = (int)(damage * modifier);
        return damage;
    }
}
