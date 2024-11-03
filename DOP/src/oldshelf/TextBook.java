package oldshelf;
public class TextBook extends Book 
{
	private final String subject;
	public TextBook(String sub) 
    {
		super(sub);
        this.subject = sub;
	}
	public String getSubject() 
    {
        return subject;
    }
	
	@Override
    public String toString() 
    {
        return "TextBook{" +
               "subject='" + subject + '\'' +
               '}';
    }
}