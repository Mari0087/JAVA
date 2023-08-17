class m1 {
    public static void main(String[] args) {
        double wallet = 80000;
        double per_shue=25000;

        System.out.println("Total wallet Balance : "+ wallet);;

        System.out.println("2 per shues : "+ (per_shue*2));

        wallet=wallet-(per_shue*2);
        System.out.println("Available Balance : "+ wallet);
    }
}
