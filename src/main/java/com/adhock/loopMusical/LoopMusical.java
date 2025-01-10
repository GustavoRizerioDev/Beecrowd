package main.java.com.adhock.loopMusical;

import java.util.Scanner;

public class LoopMusical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;

            int[] samples = new int[N];
            for (int i = 0; i < N; i++) {
                samples[i] = scanner.nextInt();
            }

            int peaks = 0;
            for (int i = 0; i < N; i++) {
                int prev = samples[(i - 1 + N) % N];
                int curr = samples[i];
                int next = samples[(i + 1) % N];

                if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                    peaks++;
                }
            }

            System.out.println(peaks);
        }

        scanner.close();
    }
}
