import java.io.IOException;

public class BlocNotas {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, indica el nombre del archivo como argumento.");
            return;
        }

        String archivo = args[0];

        try {
            // Ejecutamos Notepad con el archivo
            Runtime.getRuntime().exec(new String[]{"notepad.exe", archivo});

            System.out.println("Bloc de Notas abierto con el archivo: " + archivo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
