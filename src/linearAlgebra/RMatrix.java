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
public void matrix_subtract(RMatrix a){
	if(this.same_size(a)){
		for(int i = 0; i< rowNum; i++)
			this.rowVectors[i].subtractVector(a.rowVectors[i]);
	}
}
//accessor methods
public float get_entry(int col, int row){
	if(colNum > col && rowNum > row){
		return this.rowVectors[row].values[col];
	}
	else 
		return 0;
}
public RVector get_column_vector(int col){
	int dims = rowNum;
	float[] colEntries = new float[dims];
	if(colNum > col){
		for (int row = 0; row < dims; row ++)
			colEntries[row] = this.get_entry(col, row);
	}
	return RVector(dims, colEntries);
}
//other useful methods
public boolean same_size(RMatrix a){
	boolean x = false;
	if (this.rowNum == a.rowNum && this.colNum == a.colNum)
		x = true;
	return x;
}
}

