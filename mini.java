package rrrr;

class navya
{
	int a=100;
	public void ritu()
	{
	    System.out.println("hiiii");
   }
}
class pooja extends navya
{
	public void ritu(int a)
	{	
		super.ritu();
       System.out.println("ok bye");
	}
	public void ritu(int a,int b)
	{	
		super.ritu();
       System.out.println("ok bye");
	}


public class mini 
{
	public void main(String[] args) 
	{
		pooja a= new pooja();
		a.ritu();
		a.ritu(20);
		a.ritu(30,40);
	}
}
}
