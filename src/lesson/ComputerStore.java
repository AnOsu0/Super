package lesson;

public class ComputerStore {
    public static void main(String[] args) {
        Computer computer1 = new Computer(45,16384);

        Notebook notebook1 = new Notebook(40,8192,1000);

        System.out.println(notebook1.getBaterryCapacity());




    }


}
