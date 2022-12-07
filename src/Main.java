public class Main {

    public static void main(String[] args) {

        System.out.println(tipoDeNumero(0));

        System.out.println(tipoDeNumero(1));

        System.out.println(tipoDeNumero(-1));

        System.out.println(bucleWhile());

        System.out.println(bucleDoWhile());

        System.out.println(bucleFor());

        System.out.println(bucleSwich("VERANO"));

        System.out.println(bucleSwich("INVIERNO"));

        System.out.println(bucleSwich("OTOÑO"));

        System.out.println(bucleSwich("PRIMAVERA"));

        System.out.println(bucleSwich("Test"));






    }

    public static String tipoDeNumero(int num) {
        if (num == 0)
        {
            return "El numero es 0";
        } else if (num >0) {
            return "El numero es Positivo";
        }
        else {
            return "El numero es negativo";
        }
    }

    public static String bucleWhile(){
        int contador = 0;

        while (contador <3){
            System.out.println("Contador = " + contador);
            contador ++;
        }
        return "Blucle Finalizado";
    }

    public static String bucleDoWhile(){
        int contador = 3;

        do {
            System.out.println("Contador = " + contador);
            contador ++;
        }while (contador <3);
        return "Blucle Finalizado";
    }
    public static String bucleFor(){

        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor ++){
            System.out.println("NumeroFor = " + numeroFor);
        }
        return "Blucle Finalizado";
    }

    public static String bucleSwich(String estacion){

        String estacionActual = estacion;

        switch (estacionActual){
            case "VERANO":
                System.out.println("Estas en Verano");
                break;
            case "INVIERNO":
                    System.out.println("Estas en Invierno");
                    break;
            case "OTOÑO":
                System.out.println("Estas en Otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Estas en Primavera");
                break;
            default:
                System.out.println("No es una estacion valida");
        }
        return "Bucle Finalizado";

    }
}
