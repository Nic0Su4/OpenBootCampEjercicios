public class Ejercicio {
    public static void main(String[] args) {
        int resultado =SumaDe3(5,7,9);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.nPuertas);
    }

    public static int SumaDe3(int a, int b, int c){
        return a+b+c;
    }
}
class Coche{
    public int nPuertas = 0;

    public void IncrementarPuertas(){
        nPuertas++;
    }
}

