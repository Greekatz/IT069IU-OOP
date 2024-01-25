package Final.ObserverPattern.PvZ;

public class PvzGame {
    public static void main(String[] args) {
       Plant plant1 = new Plant();
       Plant plant2 = new Plant();
       Zombie zombie1 = new Zombie();
       Zombie zombie2 = new Zombie();

       Rewards rewards1 = new Rewards(plant1);
       Rewards rewards2 = new Rewards(zombie1);

       plant1.Attach(rewards1);
       plant2.Attach(rewards1);
       zombie1.Attach(rewards2);
       zombie2.Attach(rewards2);

       for (int i = 0; i < 100; i++) {
           plant1.hasKilledAZombie();
           plant2.hasKilledAZombie();

           zombie1.hasKillAPlant();
           zombie2.hasKillAPlant();
       }
    }
}
