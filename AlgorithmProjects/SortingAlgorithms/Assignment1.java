import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {

	// ************************************Quick Sort**********************
	int partition(ArrayList<String> lines, double[] newList, int low, int high) {
		double pivot = newList[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (newList[j] <= pivot) {
				i++;

				double temp = newList[i];
				newList[i] = newList[j];
				newList[j] = temp;
				swap(lines, i, j);
			}
		}

		double temp = newList[i + 1];
		newList[i + 1] = newList[high];
		newList[high] = temp;
		swap(lines, i + 1, high);

		return i + 1;
	}

	void quickSort(ArrayList<String> lines, double[] newList, int low, int high) {
		if (low < high) {

			int pi = partition(lines, newList, low, high);

			quickSort(lines, newList, low, pi - 1);
			quickSort(lines, newList, pi + 1, high);
		}
	}

	// ************************************Heap Sort**********************
	public void heapSort(ArrayList<String> lines, double[] newList) {
		int n = newList.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(lines, newList, n, i);

		for (int i = n - 1; i >= 0; i--) {

			double temp = newList[0];
			newList[0] = newList[i];
			newList[i] = temp;
			swap(lines, 0, i);

			heapify(lines, newList, i, 0);
		}
	}

	void heapify(ArrayList<String> lines, double[] newList, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && newList[l] > newList[largest])
			largest = l;

		if (r < n && newList[r] > newList[largest])
			largest = r;

		if (largest != i) {
			double swap = newList[i];
			newList[i] = newList[largest];
			newList[largest] = swap;
			swap(lines, i, largest);

			heapify(lines, newList, n, largest);
		}
	}

	// ************************************Insertion Sort**********************

	public void insSort(ArrayList<String> lines, double[] newList) {
		double temp;
		for (int i = 1; i < newList.length; i++) {
			for (int j = i; j > 0; j--) {
				if (newList[j] < newList[j - 1]) {
					temp = newList[j];
					newList[j] = newList[j - 1];
					newList[j - 1] = temp;
					swap(lines, j - 1, j);
				}
			}
		}
	}

	// ************************************Swap function**********************

	public static <E> void swap(ArrayList<String> lines, int i, int j) {
		String str = lines.get(i);
		lines.set(i, lines.get(j));
		lines.set(j, str);
	}

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Double> wordList = new ArrayList<Double>();
		ArrayList<String> satir = new ArrayList<String>();
		try {
			Scanner input = new Scanner(new File(args[0]));
			String ilkSatir = input.nextLine();
			while (input.hasNextLine()) {

				String line = input.nextLine();
				String[] split = line.split(",");
				satir.add(line);
				String argv = args[1];
				int arg = Integer.parseInt(argv);
				wordList.add(Double.parseDouble(split[arg - 1]));
			}
			double[] newList = new double[wordList.size()];
			for (int i = 0; i < wordList.size(); i++) {
				newList[i] = wordList.get(i);
			}
			Assignment1 gs = new Assignment1();

			long start = System.currentTimeMillis();

			// gs.insSort(satir, newList);
			// gs.heapSort(satir,newList);
			gs.quickSort(satir, newList, 0, wordList.size() - 1);

			for (int k = 0; k < satir.size(); k++) {
				// System.out.println(satir.get(k));
			}

			long end = System.currentTimeMillis();
			//System.out.println("Time :" + ((double) (end - start) / 1000.0));

			input.close();

			if (args[2].equals("T")) {
				PrintWriter file = new PrintWriter(args[0]);
				file.print("");
				file.println(ilkSatir);

				for (int i = 0; i < satir.size(); i++) {
					file.println(satir.get(i));

				}
				file.close();

			}

		} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("No argument acceseses!");
			return;
		}

	}

}
