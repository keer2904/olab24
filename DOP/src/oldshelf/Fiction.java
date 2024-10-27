package oldshelf;
public class Fiction extends Book 
{
	/* TODO: Add most strict modifiers here*/ 
	private final String name;
	private static FictionType type;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	public Fiction(String title) 
	{
		super(title,author);
		this.type=type;
		// TODO  correct the above.
	}
	public FictionType getType() 
	{
        	return type;
    	}
    	@Override
    	public String toString() 
	{
        	return "Fiction{" + "title= " + getTitle() + ", author= " + getAuthor() + ", type= " + type + "}";
    	}
}
