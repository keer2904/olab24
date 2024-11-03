package newgenerictypes;

public record GenericComic<T extends Comparable<T>>(T title, int age) implements IGenericBook<T> 
{
    @Override
    public T getTitleOrSubject() 
    {
        return title;
    }

    @Override
    public int compareTo(IGenericBook<T> obj) 
    {
        if (obj instanceof GenericComic<T> otherComic) 
        {
            return this.title.compareTo(otherComic.title);
        }
        return 0; // Default to equal if other types are compared
    }
}
