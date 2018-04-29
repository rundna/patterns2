package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class BookMedianTestSuite {

    @Test
    public void testBookMedianCalculation(){
        Set<Book> items = new HashSet<>();
        MedianAdapter calculateMedian = new MedianAdapter();
        items.add(new Book("Henning Mankel","O krok",2008,"7878332"));
        items.add(new Book("John Smith","Nim rozpęta się burza",2015,"3385000"));
        items.add(new Book("Diana Moss","Skradzione Dziecko",2004,"2602148"));
        items.add(new Book("Maciej Kowalski","Małpka w buszu",2017,"4455836"));
        items.add(new Book("Nick Nolte","Palma",2001,"111111"));

        int result = calculateMedian.publicationYearMedian(items);
        System.out.println(result);
        assertEquals(2008,result);
    }
}
