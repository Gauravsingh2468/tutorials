package basics;

public class print1To10 {
    void printMethod(){
        for(int i = 0; i <10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        print1To10 p = new print1To10();
        p.printMethod();
    }
}
