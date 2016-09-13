public class MainClass {
    public static void main(String[] args) {
        Human h1 = new Human("BobWithoutTransport");
        Human h2 = new Human("BobOnHorse");
        Human h3 = new Human("BobOnMoto");
        h2.getOn(new Horse("Almaz"));
        h3.getOn(new Moto());

        Sportsman[] participants = {h1, h2, h3, new Horse("Dikoobraz")};
        Team[] t = new Team[]{};
        TrimTrail[] tt = new TrimTrail[]{new Trail(100.0f), new Wall(1.0f), new Pool(10.0f), new Wall(1.5f), new Trail(200.0f)};
        tt.doIt(t);
//        for (Sportsman s : participants) {
//            for (Obstacle o : trimTrail) {
//                o.doIt(s);
//                if (!s.isOnDistance()) break;
//            }
//        }

        System.out.println("====================");
        for (Sportsman o : participants) {
            o.showResults();
        }
    }
}
