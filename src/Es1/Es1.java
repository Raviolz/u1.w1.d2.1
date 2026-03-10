package Es1;

public class Es1 {

    static boolean stringaPariDispari(String inputString) {
        if (inputString.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    static boolean annoBisestile(int inputYear) {

        if (inputYear % 400 == 0) {
            return true;
        } else if (inputYear % 4 == 0 && inputYear % 100 != 0) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(stringaPariDispari("tre"));
        System.out.println(stringaPariDispari("otto"));

        System.out.println(annoBisestile(2014));
        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(1998));
        System.out.println(annoBisestile(1900));
        System.out.println(annoBisestile(2024));
        System.out.println(annoBisestile(2100));
    }
}


