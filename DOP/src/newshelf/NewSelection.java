package newshelf;
import oldshelf.FictionType;
public class NewSelection 
{
	public static String getAgeOrTitle(Object o) 
	{
		return switch(o)
		{
			case Comic (String title,int age) when title != null && !title.isEmpty() -> title;
			case Fiction (String name,FictionType fictype) when name != null && !name.isEmpty() -> name;
			case TextBook (String subject) when subject != null && !subject.isEmpty() -> subject;
			default -> "";
		};
	}

	public static void main(String[] args) 
	{
		TextBook t = new TextBook("Math");
		Comic c = new Comic("Superman", 30);
		Fiction f = new Fiction("Bridget Jones's Diary", FictionType.Comedy);

		System.out.println(NewSelection.getAgeOrTitle(t));
		System.out.println(NewSelection.getAgeOrTitle(c));
		System.out.println(NewSelection.getAgeOrTitle(f));	
	}
}


