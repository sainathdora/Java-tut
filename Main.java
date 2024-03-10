import java.util.*;;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        while (t-- > 0) {
            int n = scanner.nextInt(); // Read N but you don't actually use it directly
            scanner.nextLine(); // Consume newline left-over
            String s = scanner.nextLine(); // Read binary string S

            System.out.println(encode(s)); // Process and print the encoded string
        }
    }

    public static String encode(String value) {
        StringBuilder finalEncoded = new StringBuilder(); // Use StringBuilder for efficiency
        int times = value.length() / 2;

        for (int i = 0; i < times; i++) {
            int start = i * 2;
            int end = start + 2;
            String sub = value.substring(start, end);
            finalEncoded.append(encodeTwoChars(sub));
        }

        return finalEncoded.toString();
    }

    public static String encodeTwoChars(String s) {
        switch (s) {
            case "00":
                return "A";
            case "01":
                return "T";
            case "10":
                return "C";
            case "11":
                return "G";
            default:
                return " "; // It shouldn't reach here if input is valid.
        }
    }
}
