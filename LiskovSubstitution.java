class Bird{
	public void getInfo() {
		System.out.println("I am a bird");
	}
}

class FBird extends Bird{
	public void fly() {
		System.out.println("I am a flying bird");
	}
	public void getInfo() {
		System.out.println("I am a bird");
	}
}
 class sparrow extends FBird{
	 
 }
 class ostrich extends Bird{
	 
 }
class lsp {
    public static void main(String[] args) {
        sparrow sp=new sparrow();
        sp.fly();
        ostrich os=new ostrich();
        os.getInfo();
    }
}