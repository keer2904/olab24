package oldshelf;
import newshelf.IBook;
public abstract class Book 
{
	public Book(String title, String author) // TODO: Finish Code here if anything to be done?
	{
		this.title=title;
		this.author=author;
	}
	@Override
	public String getTitle()
	{
		return title;
	}
	@Override
	public String getAuthor()
	{
		return author;
	}
}
