package wad.domain.bibtex;

import org.springframework.beans.factory.annotation.Autowired;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
import wad.service.ReferenceService;
import wad.domain.ReferenceType;

public class Parser {

    private final String e = "},\n";
    private final String c = "}\n\n";

    public String createBibTexString(ArticleReference reference) {
        return createArticleBib(reference);
    }

    public String createBibTexString(InproceedingsReference reference) {
        return createInproceedingsBib(reference);
    }

    public String createBibTexString(BookReference reference) {
        return createBookBib(reference);
    }

    private String createArticleBib(ArticleReference articleRef) {
        StringBuilder builder = new StringBuilder();
        builder.append("@article{");
        builder.append(articleRef.getLabel() + ",\n");
        builder.append("author = {" + articleRef.getAuthor() + e);
        builder.append("title = {" + articleRef.getTitle() + e);
        builder.append("year = {" + articleRef.getYear() + e);
        if (articleRef.getJournal() != null) {
            builder.append("journal = {" + articleRef.getJournal() + e);
        }
        if (articleRef.getVolume() != null) {
            builder.append("volume = {" + articleRef.getVolume() + e);
        }
        if (articleRef.getNumber() != null) {
            builder.append("number = {" + articleRef.getNumber() + e);
        }
        if (articleRef.getPages() != null) {
            builder.append("pages = {" + articleRef.getPages() + e);
        }
        if (articleRef.getMonth() != null) {
            builder.append("month = {" + articleRef.getMonth() + e);
        }
        if (articleRef.getNote() != null) {
            builder.append("note = {" + articleRef.getNote() + e);
        }
        if (articleRef.getKey() != null) {
            builder.append("key = {" + articleRef.getKey() + e);
        }
        builder.append(c);
        return builder.toString();
    }

    private String createBookBib(BookReference bookRef) {
        StringBuilder builder = new StringBuilder();
        builder.append("@book{");
        builder.append(bookRef.getLabel() + ",\n");
        builder.append("author = {" + bookRef.getAuthor() + e);
        builder.append("title = {" + bookRef.getTitle() + e);
        builder.append("year = {" + bookRef.getYear() + e);
        if (bookRef.getPublisher() != null) {
            builder.append("publisher = {" + bookRef.getPublisher() + e);
        }
        if (bookRef.getVolume() != null) {
            builder.append("volume = {" + bookRef.getVolume() + e);
        }
        if (bookRef.getSeries() != null) {
            builder.append("series = {" + bookRef.getSeries() + e);
        }
        if (bookRef.getAddress() != null) {
            builder.append("address = {" + bookRef.getAddress() + e);
        }
        if (bookRef.getEdition() != null) {
            builder.append("edition = {" + bookRef.getEdition() + e);
        }
        if (bookRef.getMonth() != null) {
            builder.append("month = {" + bookRef.getMonth() + e);
        }
        if (bookRef.getNote() != null) {
            builder.append("note = {" + bookRef.getNote() + e);
        }
        if (bookRef.getKey() != null) {
            builder.append("key = {" + bookRef.getKey() + e);
        }
        builder.append(c);
        return builder.toString();
    }

    private String createInproceedingsBib(InproceedingsReference inproceedingsRef) {
        StringBuilder builder = new StringBuilder();
        builder.append("@inproceedings{");
        builder.append(inproceedingsRef.getLabel() + ",\n");
        builder.append("author = {" + inproceedingsRef.getAuthor() + e);
        builder.append("title = {" + inproceedingsRef.getTitle() + e);
        builder.append("year = {" + inproceedingsRef.getYear() + e);
        if (inproceedingsRef.getEditor() != null) {
            builder.append("editor = {" + inproceedingsRef.getEditor() + e);
        }
        if (inproceedingsRef.getVolume() != null) {
            builder.append("volume = {" + inproceedingsRef.getVolume() + e);
        }
        if (inproceedingsRef.getSeries() != null) {
            builder.append("series = {" + inproceedingsRef.getSeries() + e);
        }
        if (inproceedingsRef.getPages() != null) {
            builder.append("pages = {" + inproceedingsRef.getPages() + e);
        }
        if (inproceedingsRef.getAddress() != null) {
            builder.append("address = {" + inproceedingsRef.getAddress() + e);
        }
        if (inproceedingsRef.getMonth() != null) {
            builder.append("month = {" + inproceedingsRef.getMonth() + e);
        }
        if (inproceedingsRef.getOrganization() != null) {
            builder.append("organization = {" + inproceedingsRef.getOrganization() + e);
        }
        if (inproceedingsRef.getPublisher() != null) {
            builder.append("publisher = {" + inproceedingsRef.getPublisher() + e);
        }
        if (inproceedingsRef.getNote() != null) {
            builder.append("note = {" + inproceedingsRef.getNote() + e);
        }
        if (inproceedingsRef.getKey() != null) {
            builder.append("key = {" + inproceedingsRef.getKey() + e);
        }
        builder.append(c);
        return builder.toString();
    }

}
