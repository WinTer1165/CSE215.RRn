public class Main {
    public static void main(String[] args) {
        Faculty f = new Faculty("RRn", 45, "ECE", "Prof.");
        Department[] arr = new Department[5];
        arr[0] = new Department("PHY", "Cat");
        arr[1] = new Department("ECE", "RjP");
        arr[2] = new Department("BBA", "Meow");
        arr[3] = new Department("ECY", "Rj");
        arr[4] = new Department("ARC", "Cat2");
        int hash, hash2;
        for (int i =0; i<5; i++){
            hash = f.getDept_name().hashCode();
            hash2  = arr[i].getDept_name().hashCode();
            if (hash == hash2){
                System.out.println("department chair name = " + arr[i].getChair_name());
            }
        }
    }
}
