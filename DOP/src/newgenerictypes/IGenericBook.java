package newgenerictypes;

public sealed interface IGenericBook<T> extends Comparable<IGenericBook<T>> permits GenericComic, GenericFiction, GenericTextBook
{
    T getTitleOrSubject();
}

