import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Books
{
	String Name;
	int ID;
	String Author;
	String Category;
	public void Books1(String Name,int ID,String Author,String Category)
	{
		this.Name=Name;
		this.ID=ID;
		this.Author=Author;
		this.Category=Category;
		
	}		
	public int getId() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		this.Category = category;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
		}
	public void newBook(List<Books> a)
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).Name);
			System.out.println(a.get(i).ID);
			System.out.println(a.get(i).Author);
			System.out.println(a.get(i).Category);

			System.out.println();
		}
		
	}
	public void listBook(List<Books> a)
	{
		
		for(int i=0;i<a.size();i++)
		{
		

				System.out.println(a.get(i).Name);
				System.out.println(a.get(i).ID);
				System.out.println(a.get(i).Author);
				System.out.println(a.get(i).Category);
			    System.out.println("\n");
			}
		}
		
	
	public void searchBook(int id,List<Books> a)
	{
		int k=id;
		int c=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).ID==k)
			{
				System.out.println(a.get(i).Name);
				System.out.println(a.get(i).ID);
				System.out.println(a.get(i).Author);
				System.out.println(a.get(i).Category);

				
				c++;
			}
		}
			if(c==0)
				System.out.println("Book not found");
			
		
	}

	public void deleteBook(int id1,List<Books> a)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).ID==id1)
			{
				a.remove(i);
				break;
			}
		}
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).Name);
			System.out.println(a.get(i).ID);
			System.out.println(a.get(i).Author);
			System.out.println(a.get(i).Category);

			System.out.println();
		}
	
	}
}
public class LibraryManagementSystem {

	public static void main(String[] args) 
	{
		Books obj=new Books();
		Scanner ip=new Scanner(System.in);
		List<Books> a=new ArrayList<Books>(10);
		int nos=3;
		a.add(new Books());
		a.get(0).Books1("Gambit",1,"Deva","Adventure");
		a.add(new Books());
		a.get(1).Books1("Subtle Life",2,"Rajni","Literature");
		a.add(new Books());
		a.get(2).Books1("3 Musketeers",3,"Pattison","RomCom");
		System.out.println("****Welcome To Library Management System****\n"
				+ "\n"
				+ "1) Add a new Book, id, author\r\n"
				+ "\n"
				+ "2) List all Book with name, Id\r\n"
				+ "\n"
				+ "3) Search Book with ID\r\n"
				+ "\r\n"
				+ "4) Edit Book by name\r\n"
				+ "\n"
				+ "5) Delete Book by ID\r\n"
				+ "\n"
				+ "6) Exit");
		System.out.println();
		System.out.println("Enter your Choice");
		int n=ip.nextInt();
		while(true) {
		switch(n)
		{
		case 1 : System.out.println("Enter Book Name:");
				String name=ip.next();
				System.out.println("Enter Book ID:");
				int n1=ip.nextInt();
				System.out.println("Enter Book Author:");
				String author=ip.next();
				System.out.println("Enter Book Category");
				String Category=ip.next();
				a.add(new Books());
				a.get(nos).Books1(name, n1, author,Category);
				obj.newBook(a);
				nos++;
				break;
		case 2 : System.out.println("The List of Books are: \n");
			obj.listBook(a);
			    break;
		case 3 : System.out.println("Enter ID to search");
				 int id=ip.nextInt();
				 obj.searchBook(id,a);
				 break;
		case 4 :System.out.println("Enter Id Of Book Which You Have to Edit");
			id = ip.nextInt();
			
			for(Books book : a) {
				if(book.getId() == id) {
					System.out.println("Enter New Name Of Book");
					name = ip.next();
					
					book.setName(name);
					
					System.out.println("Your Updated Book Is\n ");
					System.out.println(""+ book.getName());
					System.out.println(""+ book.getId());
					System.out.println(""+ book.getAuthor());
					System.out.println(""+ book.getCategory());
				}
			}
			break;
		case 5 : System.out.println("Enter Book ID");
		 		int id1=ip.nextInt();
		 		obj.deleteBook(id1,a);
		 		break;
		case 6 : System.exit(0);
		}
		System.out.println("\n ReEnter your Choice");
		

		System.out.println("\n 1. Add a new Book, id,Author \n 2. List all Books with name, Id  \n 3.Search Book with ID \n 4. Edit Book by name \n 5.Delete Book by ID \n 6. Exit");
		  n = ip.nextInt();
				}
	}

