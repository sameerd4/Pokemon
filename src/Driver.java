import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Pokemon charmander;

        Move[] moves = new Move[4];
        moves[0] = new Move("Scratch", Type.NORMAL, 40);
        moves[1] = new Move("Growl", Type.NORMAL, 0);
        moves[2] = new Move("Ember", Type.FIRE, 40);
        moves[3] = new Move("Strength", Type.NORMAL, 80);

        Stats charmanderStats = new Stats(50, 120, 59, 48, 64, 67, 81);

        charmander = new Pokemon("Charmander", Type.FIRE, moves,
            charmanderStats);

        Pokemon squirtle;
        Move[] squirtleMoves = new Move[4];
        squirtleMoves[0] = new Move("Tackle", Type.NORMAL, 40);
        squirtleMoves[1] = new Move("Tail Whip", Type.NORMAL, 0);
        squirtleMoves[2] = new Move("Water Gun", Type.WATER, 60);
        squirtleMoves[3] = new Move("Ice Beam", Type.ICE, 95);

        Stats squirtleStats = new Stats(50, 123, 68, 71, 55, 72, 61);

        squirtle = new Pokemon("Squirtle", Type.WATER, squirtleMoves,
            squirtleStats);

        Pokemon pikachu;

        Move[] pikachuMoves = new Move[4];
        pikachuMoves[0] = new Move("Quick Attack", Type.NORMAL, 40);
        pikachuMoves[1] = new Move("Tail Whip", Type.NORMAL, 0);
        pikachuMoves[2] = new Move("Thundershock", Type.ELECTRIC, 40);
        pikachuMoves[3] = new Move("Iron Tail", Type.STEEL, 100);

        Stats pikachuStats = new Stats(50, 109, 78, 61, 80, 55, 121);

        pikachu = new Pokemon("Pikachu", Type.ELECTRIC, pikachuMoves,
            pikachuStats);

        // System.out.println(charmander + "\n");
        // System.out.println(squirtle);

        Scanner console = new Scanner(System.in);

// Battle battle = new Battle(squirtle, charmander);
// System.out.println(battle);
// battle.attack("Water Gun");
// battle.attack("Tackle");
// battle.attack("Tackle");
// battle.attack("Ice Beam");
// battle.attack("Water Gun");

        Battle battle2 = new Battle(pikachu, squirtle);
        System.out.println(battle2);

        battle2.attack(pikachu, "Thundershock");
        battle2.attack(squirtle, "Water Gun");
        battle2.attack(pikachu, "Quick Attack");
        battle2.attack(pikachu, "Quick Attack");
        battle2.attack(pikachu, "Quick Attack");
        battle2.attack(pikachu, "Quick Attack");
        battle2.attack(pikachu, "Thundershock");
        battle2.attack(pikachu, "Thundershock");
        battle2.attack(pikachu, "Thundershock");
    }
}
