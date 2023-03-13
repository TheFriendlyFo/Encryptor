public class Main {
    public static void main(String[] args) {
        System.out.println(Encryptor.encrypt(Encryptor.encrypt("hello darkness my old friend", 3, 3),3,3));
    }
}
