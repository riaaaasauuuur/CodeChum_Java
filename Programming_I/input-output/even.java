public class even{
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            if (i % 4 == 0) {
                System.out.println (i);
            } else {
                System.out.print(i + "\n" + "\t" );
            }
        }
    }
}