package count.pairs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	
	static int numberOfPairs(int[] a, long k) {
		Map<Integer, Integer> frequency = new HashMap<>();
		int pairCount = 0;

		for (int i = 0; i < a.length; i++) {
			int value = a[i];
			int complement = (int) (k - a[i]);

			if (frequency.containsKey(complement)) {
				int freq = frequency.get(complement) - 1;
				pairCount++;
				// System.out.println(value + ", " + complement);
				if (freq == 0) {
					frequency.remove(complement);
				} else {
					frequency.put(complement, freq);
				}
			} else {
				if (frequency.containsKey(value)) {
					frequency.put(value, frequency.get(value) + 1);
				} else {
					frequency.put(value, 1);
				}
			}
		}
		return pairCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int aCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[aCount];

		for (int i = 0; i < aCount; i++) {
			int aItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			a[i] = aItem;
		}

		long k = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int res = numberOfPairs(a, k);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
