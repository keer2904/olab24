package newshelf;
public class NewSelection 
{
	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) 
	{
		if (o instanceof oldshelf.Comic comic) 
		{
			return comic.getTitle();
		}
		else if(o instanceof oldshelf.Fiction fiction)
		{
			return fiction.getName();
		}
		else if ( o instanceof oldhself.Textbook textbook)
		{
			return textbook.getSubject();
		}
		return null;
	}

	public static void main(String[] args) 
	{	
		// TODO: Write a test code here and execute and text.
		oldshelf.Textbook t= new oldshelf.Textbook("Theory of computation");
		System.out.println(getAgeORTitle(t));	
		
		oldshelf.Comic c = new oldshelf.Comic("Superhero Comics", 18);
        	System.out.println(getAgeOrTitle(c));  
        	
		oldshelf.Fiction f = new oldshelf.Fiction("Joker of clowns", oldshelf.FictionType.Comedy);
        	System.out.println(getAgeOrTitle(f));  
	}
}
