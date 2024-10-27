// TODO: Complete this with record components
package newshelf;
import oldshelf.TextBook as OldTextBook;
public record TextBook(String subject) implements IBook 
{
    public boolean isEquivalentToOldTextBook(OldTextBook oldTextBook) 
    {
        return oldTextBook != null && this.subject.equals(oldTextBook.getSubject());
    }
    @Override
    public String toString() 
    {
        return "NewShelf TextBook [Subject: " + subject + "]";
    }
}
