package linearAlgebra;

public class RMatrix {
public int rowNum = 1;
public int colNum = 1;
public RVector[] rowVectors;
//constructor
public RMatrix(int rows, int cols, RVector[] row_vectors){
	rowNum = rows;
	colNum = cols;
	rowVectors = row_vectors;
}
//mutator methods
public void matrix_add(RMatrix a){
	if (this.same_size(a)){
		for(int i = 0; i< rowNum; i++)
			this.rowVectors[i].addVector(a.rowVectors[i]);
	}
}
//other useful methods
public boolean same_size(RMatrix a){
	boolean x = false;
	if (this.rowNum == a.rowNum && this.colNum == a.colNum)
		x = true;
	return x;
}
}

