package oldshelf;
public class TextBook extends Book 
{
	// TODO: Make this a final field with most strict visiibility possible.
	private final String subject;
	public TextBook(String subject) 
	{
		super(subject);
	}

	// TODO : create a getter if required.
	
	// TODO: Create a setter if required
	
	// TODO: write a toString method
    	public String getSubject() 
	{
        	return subject;
    	}
	@Override
    	public String toString() 
	{
        	return "TextBook{" + "subject='" + subject + "'}";
   	}
}
