public class Encryptor {
    private Encryptor(){}

    public static String decrypt(String original, int cols, int rows) {
        return encrypt(original, rows, cols).stripTrailing();
    }

    public static String encrypt(String original, int rows, int cols) {
        StringBuilder encrypted = new StringBuilder();
        String[][] block = new String[rows][cols];

        for (int letter = 0; letter < original.length(); letter++) {
            int row = (letter - encrypted.length()) / cols;
            int col = (letter - encrypted.length()) % cols;

            block[row][col] = String.valueOf(original.charAt(letter));

            if (row == rows - 1 && col == cols - 1 || letter == original.length() - 1) {
                encrypted.append(blockToString(block));
                block = new String[rows][cols];
            }
        }

        return encrypted.toString();
    }

    private static String blockToString(String[][] block) {
        StringBuilder blockVal = new StringBuilder();

        for (int col = 0; col < block[0].length; col++) {
            for (String[] strings : block) {
                blockVal.append(strings[col] == null ? "A" : strings[col]);
            }
        }

        return blockVal.toString();
    }
}
