package seminare;

public class seminar01 {
    static boolean isPrime(int num) {
        for(int i = 2; i <= num/i; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primes(int upperBound) {
        for(int n = 2; n <= upperBound; n++) {
            if(isPrime(n)) {
                if(n > 2)
                    System.out.print(", ");
                System.out.print(n);
            }
        }
    }

    static int multiply(int left, int right) {
        int result = 0;
        for(int i = 0; i < Math.abs(right); i++) {
            if(right >= 0) {
                result += left;
            } else {
                result -= left;
            }
        }
        return Math.multiplyExact(left, right);
        // return (int)Math.floor(Math.scalb((float)left, (int)Math.ceil(right / 2)));
    }

    static String nameNumber(int num) {
        switch(num) {
            case 0: return "Nula";
            case 1: return "Jedna";
            case 2: return "Dva";
            case 3: return "Tri";
            case 4: return "Ctyri";
            case 5: return "Pet";
            case 6: return "Sest";
            case 7: return "Sedm";
            case 8: return "Osm";
            case 9: return "Devet";
            case 10: return "Deset";
            default: return "Neznam";
        }
    }

    static void printTriangle(int n) {
        for(int y = 0; y < n - 1; y++) {
            int x = 0;
            for(x = 0; x < n - y - 1; x++) {
                System.out.print(" ");
            }
            System.out.print("*");
            x++;
            for(; x < n - 1; x++) {
                System.out.print(" ");
            }
            if(x != n)
                System.out.println("*");
            else
                System.out.println();
        }

        /* spodni hrana */
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void CustomMain(String[] args) {
        primes(100);

        System.out.println();
        System.out.println(multiply(5, 6));
        System.out.println(nameNumber(3));

        printTriangle(5);
    }
}
