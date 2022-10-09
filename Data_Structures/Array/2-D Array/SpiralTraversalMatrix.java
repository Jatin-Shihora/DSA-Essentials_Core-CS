import java.util.ArrayList;
import java.util.List;
public class SpiralTraversalMatrix {
    /*
	 * Given an m x n matrix, return all elements of the matrix in spiral order.
	 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
	 * 
	 * Output: [1,2,3,6,9,8,7,4,5]
	 */

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		List<Integer> result = printSpiral_better_approach(matrix);

		System.out.println(result.toString());
	}

	private static List<Integer> printSpiral_better_approach(int[][] matrix) {

		int height = matrix.length;
		int legth = matrix[0].length;
		List<Integer> res = new ArrayList<>();
		int up = 0, down = height - 1, left = 0, right = legth - 1;

		while (up <= down || left <= right) {

			for (int i = left; i <= right; i++) {
				res.add(matrix[up][i]);
			}

			up++;
			if (up > down)
				break;

			for (int i = up; i <= down; i++) {
				res.add(matrix[i][right]);
			}
			right--;

			if (left > right)
				break;

			for (int i = right; i >= left; i--) {
				res.add(matrix[down][i]);
			}
			down--;

			if (up > down)
				break;

			for (int i = down; i >= up; i--) {
				res.add(matrix[i][left]);
			}
			left++;

			if (left > right)
				break;

		}
		return res;
	}
}
