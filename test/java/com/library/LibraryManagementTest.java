
package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class LibraryManagementTest {

    @Test
    void testAddBook() {
        ArrayList<String> books = new ArrayList<>();

        books.add("Java Programming");

        assertTrue(books.contains("Java Programming"));
    }

    @Test
    void testRemoveBook() {
        ArrayList<String> books = new ArrayList<>();

        books.add("Python Programming");
        books.remove("Python Programming");

        assertFalse(books.contains("Python Programming"));
    }
}
