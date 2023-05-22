public class HilosEjercicio {
    public static void conver(String Frace, int Tiempo) {
        // Convierte la cadena en un array de caracteres
        char[] Tamano = Frace.toCharArray();

        for (int i = 0; i < Tamano.length; i++) {  // Recorre cada caracter del array
            System.out.print(Tamano[i]);  // Imprime el carácter actual
            try {
                Thread.sleep(Tiempo);  // Pausa la ejecución durante el tiempo
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
///pruebassss
class lectura {
    //definimos el texto que se va a mostrar
    public static void main(String[] args) {
        String conversacion1 = "<(Meg: Hi, there)\n";
        String conversacion2 = "        (Kathyo: Hi, Megm)>\n";
        String conversacion3 = "<(Meg: What are you doing)\n";
        String conversacion4 = "        (Kathyo: I'm sitting on my bed with my laptop.I'm doing my homework)>\n";
        String conversacion5 = "<(Megm:I´m in a coffee with my friend Carmen. I´m having coffee, and she´s )>\n";
        String conversacion6 = "        (Kathyo: What are you working on?)>\n";
        String conversacion7 = "<(Megm: I'm writing an essay for Spanish clas. :> Where are you)\n";
        String conversacion8 = "        (Kathyo: They're all fine! My father's watching a baseball game with his friends. My mother is out shopping)>\n";
        String conversacion9 = "<(Megm: Where's your brother?)\n";
        String conversacion10 = "       (Kathyo: John's playing soccer in the park. Oh, wait. My phone is ringing. My mother's calling me. I have to go! Bye,bye!)>\n";
        String conversacion11 = "<(Megm: Ok! Bye!)\n";
      //hacemos que el texto se valla mostrando con su tiempo de espera
        HilosEjercicio.conver(conversacion1, 500);//muestra el primer texto y se espera 5 segundos
        HilosEjercicio.conver("_" , 500);//muestra un espaci en vlanco como un tiempo de reposos
        HilosEjercicio.conver(conversacion2, 500);
        HilosEjercicio.conver("_" , 500);
        HilosEjercicio.conver(conversacion3, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion4, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion5, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion6, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion7, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion8, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion9, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion10, 500);
        HilosEjercicio.conver(" " , 500);
        HilosEjercicio.conver(conversacion11, 500);
        System.out.println();
    }
}

