package oldshelf;
public class OldSelection 
{
	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) 
	{
		if (o instanceof Comic comic) 
		{
			return comic.getTitle();
		}
		else if(o instanceof Fiction fiction)
		{
			return fiction.getName();
		}
		elseif(o instanceof Textbook textbook)
		{
			return textbook.getSubject();
		}
		return null;
	}
	public static void main(String[] args) 
	{
        // TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("History");
		Comic c = new Comic("Superhero Comics", 18);
		Fiction f = new Fiction("Mystery Novel");
		System.out.println(getAgeOrTitle(t));  
		System.out.println(getAgeOrTitle(c));  
		System.out.println(getAgeOrTitle(f)); 
        }
}
