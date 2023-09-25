public class App {
    public static void main(String[] args) throws Exception {
        int schaltJahr = 1600;
        String outputMessage = "";

        if (schaltJahr % 400 != 0 && schaltJahr % 4 == 0 && schaltJahr % 100 != 0) {
            outputMessage = "Schaltjahr";
        } else {
            outputMessage = "kein Schaltjahr";
        }


        System.out.println(outputMessage);
    }
}
