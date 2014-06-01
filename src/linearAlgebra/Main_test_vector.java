package linearAlgebra;
import java.util.Scanner;
public class Main_test_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get dimension of vectors
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of dimensions");
		int dim = in.nextInt();
		System.out.println("You entered "+dim);
		System.out.println("Enter the number of vectors to input");
		int numV = in.nextInt();
		System.out.println("You entered "+numV);
		RVector[] vList = new RVector[numV];
		for(int i = 0; i < numV; i ++){
			float[] valTemp = new float[dim];
			int current = i + 1;
			System.out.println("Enter values of vector "+current);
			for(int j = 0; j < dim; j++){
				int ithvalue = j + 1;
				System.out.println("Enter the value "+ithvalue);	
				valTemp[j] = in.nextFloat();
			}
			vList[i] = new RVector(dim, valTemp);
			//print vector
		}
			
		//get number of vectors
		//for number of vectors, enter the values, then the operation
		//display output
		in.close();
	}
/*stuff

 */
}
