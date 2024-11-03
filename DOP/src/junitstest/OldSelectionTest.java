package junitstest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import oldshelf.Comic;
import oldshelf.Fiction;
import oldshelf.FictionType;
import oldshelf.OldSelection;
import oldshelf.TextBook;

public class OldSelectionTest 
{

    @Test
    public void test_get_age_or_title_with_comic() 
    {
        Comic comic = new Comic("Superhero", 25);
        String result = OldSelection.getAgeOrTitle(comic);
        assertEquals("Superhero", result, "Correct outcome obtained.");
    }

    @Test
    public void test_get_age_or_title_with_fiction() 
    {
        Fiction fiction = new Fiction("Minds", FictionType.Tragedy);
        String result = OldSelection.getAgeOrTitle(fiction);
        assertEquals("Minds", result, "Correct outcome obtained.");
    }

    @Test
    public void test_get_age_or_title_with_textBook() 
    {
        TextBook textbook = new TextBook("Maths");
        String result = OldSelection.getAgeOrTitle(textbook);
        assertEquals("Maths", result, "Correct outcome obtained.");
    }

    @Test
    public void test_get_age_or_title_with_invalidobj() 
    {
        String result = OldSelection.getAgeOrTitle("NotABook");
        assertEquals("", result, "Expected empty string for NotABook instance");
    }
}
