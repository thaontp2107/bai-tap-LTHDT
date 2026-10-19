
public class CATR extends ANIMAL implements IDOSOMETHING, ISLEEP{
   private String Type;

public CATR() {
	super();
}
public CATR(String name, String type) {
	super(name);
	Type = type;
}
@Override
public  void Xuat()
{
    System.out.print("Name"+ super.name);
    System.out.print("Type"+ this.Type);
}
@Override
public void Move() {
	// TODO Auto-generated method stub
	
}
@Override
public void Run() {
	// TODO Auto-generated method stub
	
}
@Override
public void Hunt() {
	// TODO Auto-generated method stub
	
}
@Override
public void Sleep() {
	// TODO Auto-generated method stub
	
}
@Override
public void DoSomeThing() {
	// TODO Auto-generated method stub
	
}


   
}
