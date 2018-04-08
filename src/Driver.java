
public class Driver {

    public static void main(String[] args) {
        Pokemon charmander;
        Type fire = new Type("Fire");
        Type normal = new Type("Normal");
        Move[] moves = new Move[4];
        moves[0] = new Move("Scratch", normal, 40);
        moves[1] = new Move("Growl", normal, 0);
        moves[2] = new Move("Ember", fire, 40);
        moves[3] = new Move("Strength", normal, 80);

        Stats charmanderStats = new Stats(50, 120, 59, 48, 64, 67, 81);

        charmander = new Pokemon("Charmander", fire, moves, charmanderStats);

        Pokemon squirtle;
        Type water = new Type("Water");
        Move[] squirtleMoves = new Move[4];
        squirtleMoves[0] = new Move("Tackle", normal, 40);
        squirtleMoves[1] = new Move("Tail Whip", normal, 0);
        squirtleMoves[2] = new Move("Water Gun", water, 60);
        squirtleMoves[3] = new Move("Ice Beam", new Type("Ice"), 95);

        Stats squirtleStats = new Stats(50, 123, 68, 71, 55, 72, 61);

        squirtle = new Pokemon("Squirtle", water, squirtleMoves, squirtleStats);

        Pokemon pikachu;
        Type electric = new Type("Electric");
        Move[] pikachuMoves = new Move[4];
        pikachuMoves[0] = new Move("Quick Attack", normal, 40);
        pikachuMoves[1] = new Move("Tail Whip", normal, 0);
        pikachuMoves[2] = new Move("Thundershock", electric, 40);
        pikachuMoves[3] = new Move("Iron Tail", new Type("Ice"), 95);

        Stats pikachuStats = new Stats(50, 123, 68, 71, 55, 72, 61);

        pikachu = new Pokemon("Pikachu", electric, pikachuMoves, pikachuStats);
        
       // System.out.println(charmander + "\n");
       // System.out.println(squirtle);
        
    //    Battle battle = new Battle(squirtle, charmander);
    //    System.out.println(battle);
    //    battle.attack("Water Gun");
    //    battle.attack("Tackle");
    //    battle.attack("Tackle");
    //    battle.attack("Ice Beam");
    //    battle.attack("Water Gun");
        
        Battle battle2 = new Battle(pikachu, squirtle);
        System.out.println(battle2);
        battle2.attack("Thundershock");
        battle2.attack("Quick Attack");
        battle2.attack("Quick Attack");
        battle2.attack("Quick Attack");
//        battle2.attack("Quick Attack");
        battle2.attack("Thundershock");
        battle2.attack("Thundershock");
    }
}
