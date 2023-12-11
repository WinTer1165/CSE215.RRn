public class current_time {
    public static void main(String[] args) {
        System.out.print("Current Time: ");
        System.out.println(System.currentTimeMillis());
        long mil = System.currentTimeMillis();
        long seconds = (mil / 1000) % 60;
        long minutes = ((mil / (1000 * 60)) % 60);
        long hours = ((mil / (1000 * 60 * 60)) % 24) - 6;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}