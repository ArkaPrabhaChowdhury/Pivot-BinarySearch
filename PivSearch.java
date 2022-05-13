import java.util.*;

public class PivSearch {

	public static void main(String[] args) {
		int a[] = { 5, 6, 7, 8, 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to be found");
		int key = sc.nextInt();
		int n = a.length;
		int p = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				p = i;
				break;

			}

		}
		System.out.println("Pivot element is" + " " + p);
		System.out.println(Bin(a, key, 0, p));
		System.out.println(Bin2(a, key, p, n - 1));
	}

	public static int Bin(int a[], int key, int low, int pivot) {
		if (low > pivot) {
			return -1;
		}
		int mid = (low + pivot) / 2;
		if (a[mid] == key) {
			return mid;
		} else if (a[mid] < key) {
			return Bin(a, key, mid + 1, pivot);
		} else {
			return Bin(a, key, low, mid - 1);
		}

	}

	public static int Bin2(int a[], int key, int pivot, int high) {
		if (pivot + 1 > high) {
			return -1;

		}
		int mid = (pivot + 1 + high) / 2;
		if (a[mid] == key) {
			return mid;
		} else if (a[mid] < key) {
			return Bin(a, key, mid + 1, high);
		} else {
			return Bin(a, key, pivot + 1, mid - 1);
		}

	}
}