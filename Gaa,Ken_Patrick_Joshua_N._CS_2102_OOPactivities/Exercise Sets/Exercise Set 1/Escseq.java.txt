class Escseq {
    public static void main(String[] args) {
        int num = 5;
        int current = 7;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("\t" + current);
            } else {
                System.out.println(current);
            }
            current += 7;
        }
    }
}