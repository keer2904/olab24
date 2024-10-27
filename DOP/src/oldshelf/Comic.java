package oldshelf;
public class Comic extends Book 
{
	/* TODO: Add most strict modifiers here*/ 
	private final String Title;
	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;
	// TODO Correct the error
	public Comic(String title, int ageOfMainCharacter) 
	{
		this.title=title;
		this.ageOfMainCharacter=ageOfMainCharacter;
	}
	// TODO : create a getter if required.
	// TODO: Create a setter if required
	// TODO: write a toString method
	public String getTitle()
	{
		return title;
	}
	@Override
	public String toString() 
	{
		return "Comic{" + "title=" + title + ", ageOfMainCharacter=" + ageOfMainCharacter + "}";
        }
	// TODO: Bonus: 
	@Override
	public int hashCode() 
	{
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main character and the String title
		return title.hashCode() * 31 + ageOfMainCharacter;
	}
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) 
	{
		// TODO: Based on the information about hashCode write the equals method.
		if (this==o)
		{
			return true;
		}
		if (o==null || getClass() != o.getClass())
		{
			return false;
		}
		Comic comic=(Comic) o;
		return ageOfMainCharacter == comic.ageOfMainCharacter && title.equals(comic.title);
	}
}
