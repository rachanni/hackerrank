package nestedloop;

public class NestedLoopDemo2 {

	public static void main(String[] args) {

		int count = 1;
		int arr[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				arr[i][j] = count;
				
				count++;
			}
			
		}

		System.out.println(arr[2][1]);
	}
}
