class Area{
	int area (int a){
		return(a);
	}
	int area(int a,int b){
		return(a*b);
	}
	int area(int a,int b,int c){
		return(a*b*c);
	}
	
	public static void main(String args[]){
		Area a=new Area();
		System.out.println(a.area(5));
		System.out.println(a.area(4,6));
		System.out.println(a.area(7,10,14));
	
	}


}