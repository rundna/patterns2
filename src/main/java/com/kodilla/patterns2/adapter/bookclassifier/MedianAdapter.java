package com.kodilla.patterns2.adapter.bookclassifier;

//import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;


import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> mapBook = bookSet.stream()
                .collect(Collectors.toMap(m -> new BookSignature(m.getSignature()),
                        b -> new Book(b.getAuthor(), b.getTitle(), b.getPublicationYear())));
        return medianPublicationYear(mapBook);
    }
}