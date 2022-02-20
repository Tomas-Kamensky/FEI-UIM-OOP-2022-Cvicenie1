package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args){
        System.out.println("Hello world");

        int celeCislo = 5;
        long celeCisloVacsie = 5L;
        float desatinneCislo = 5.5f;
        double desatinneCisloDlhsie = 5.5;
        char znak = 'c';
        String retazecZnakov = "text v uvodzovkach";
        boolean bool = true;

        int podiel = 2/3;
        float zvysok = 2%3.0f;


        int cislo = Integer.parseInt(args[0]);
        if(cislo == 0){
            System.out.println("ta toto je nula");
        }else if(cislo > 0){
            System.out.println("ta toto je kladne cislo");
        }else{
            System.out.println("ta zaporne cislo je tot o");
        }

        cislo = 4;
        for (int i = 1; i<= cislo;i++) {
            switch (i) {
                case 1:
                    System.out.println("jedna");
                    break;
                case 2:
                    System.out.println("dve");
                    break;
                default:
                    System.out.println("ani jedna ani dve");
                    break;
            }
        }


        int[] pole = new int[10];

        for(int i = 0;i<pole.length;i++){
            pole[i] =  i;
        }

        for(int i = 0;i<pole.length;i++){
            vypis(i); // da sa zavolat aj this.vypis(i) alebo App.vypis(i)
        }

    }

    public static void vypis(int a){
        System.out.println(a);
    }
}
