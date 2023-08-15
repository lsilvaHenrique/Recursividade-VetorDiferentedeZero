package controller;

public class VetController {
	
	public int Vet (int[] a, int size) {
		if (size == 0) {
			return 0;
		} else {
			int count = Vet(a, size - 1);
			if (a[size - 1] % 2 == 0) {
				return count + 1;
			} else {
				return count;
			}
		}
		
	}
}
