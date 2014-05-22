package linearAlgebra;
public class RVector {
	public int dimensions = 1;
	public float[] values = {0};
	//constructor
	public RVector(int dim, float[] vals){
		dimensions = dim;
		values = vals;
	}
	//mutator methods
	public void changeVals(float[] newvals){
		if (newvals.length == dimensions){
			values = newvals;
		}
	}
	public void changeValue(int position, float value){
		if(values.length > position){
			values[position] = value;
		}
	}
	
	public void addVector(RVector b){
		if(dimensions == b.dimensions){
			for(int i = 0; i < dimensions; i ++ ){
				values[i] += b.values[i];
			}
		}
	}
	public void subtractVector(RVector b){
		if(dimensions == b.dimensions){
			for(int i = 0; i < dimensions; i ++ ){
				values[i] -= b.values[i];
			}
		}
	}
	public void scalarMultiply(float b){
		for(int i = 0; i < dimensions; i++){
			values[i] *= b;
		}
	}
	public void addVectorList(RVector[] vList){
		if (sameDimension(vList)){
			for(int i = 0; i < vList.length; i++){
				this.addVector(vList[i]);
			}
		}
	}

	public void subtractVectorList(RVector[] vList){
		if (sameDimension(vList)){
			for(int i = 0; i < vList.length; i++){
				this.subtractVector(vList[i]);
			}
		}
	}
	//other useful functions
	public boolean sameDimension(RVector[] vList){
		for (int i = 0; i<vList.length; i++){
			if(vList[i].dimensions != dimensions){
				return false;
			}
		}
		return true;
	}
	public float dotProduct(RVector b){
		float product = 0;
		if (dimensions == b.dimensions){

			for (int i = 0; i < dimensions; i ++){
				product =+ values[i] * b.values[i];
			}
		}
		return product;
	}
	
	
}
