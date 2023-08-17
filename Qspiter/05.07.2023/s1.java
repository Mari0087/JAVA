class s1 {
    public static void main(String[] args) {
         double wallet=1000;
         int lipstick=50;
         int makeup_kit = 20;
        System.out.println("Amount Present in the wallet : "+ wallet);
        System.out.println("2Kg Lipstick Price : " + lipstick);
        wallet -=lipstick;
        System.out.println("Available Balance : "+ wallet);
        System.out.println("makeup Kit Price : " + makeup_kit);
        wallet -=makeup_kit;
        System.out.println("Available Balance : "+ wallet);
    }
}
