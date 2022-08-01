package jj;

class Data<T extends Number> {
	T obj;
	Data(T ob) {
		obj = ob;
	}
	int calcMultipe(int n) {
		return obj.intValue() * n;
	}

}
