package wad.domain;

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

    public String createBibTexString(BookletReference reference) {
        return createBookletBib(reference);
    }

    public String createBibTexString(ConferenceReference reference) {
        return createConferenceBib(reference);
    }

    public String createBibTexString(IncollectionReference reference) {
        return createIncollectionBib(reference);
    }

    private String createArticleBib(ArticleReference articleRef) {
        StringBuilder builder = new StringBuilder();
        builder.append("@article{");
        builder.append(articleRef.getLabel() + ",\n");
        builder.append("author = {" + articleRef.getAuthor() + e);
        builder.append("title = {" + articleRef.getTitle() + e);
        builder.append("year = {" + articleRef.getYear() + e);
        if (articleRef.getJournal() != "" && articleRef.getJournal() != null) {
            builder.append("journal = {" + articleRef.getJournal() + e);
        }
        if (articleRef.getVolume() != "" && articleRef.getVolume() != null) {
            builder.append("volume = {" + articleRef.getVolume() + e);
        }
        if (articleRef.getNumber() != "" && articleRef.getNumber() != null) {
            builder.append("number = {" + articleRef.getNumber() + e);
        }
        if (articleRef.getPages() != "" && articleRef.getPages() != null) {
            builder.append("pages = {" + articleRef.getPages() + e);
        }
        if (articleRef.getMonth() != "" && articleRef.getMonth() != null) {
            builder.append("month = {" + articleRef.getMonth() + e);
        }
        if (articleRef.getNote() != "" && articleRef.getNote() != null) {
            builder.append("note = {" + articleRef.getNote() + e);
        }
        if (articleRef.getKey() != "" && articleRef.getKey() != null) {
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
        if (bookRef.getPublisher() != "" && bookRef.getPublisher() != null) {
            builder.append("publisher = {" + bookRef.getPublisher() + e);
        }
        if (bookRef.getVolume() != "" && bookRef.getVolume() != null) {
            builder.append("volume = {" + bookRef.getVolume() + e);
        }
        if (bookRef.getSeries() != "" && bookRef.getSeries() != null) {
            builder.append("series = {" + bookRef.getSeries() + e);
        }
        if (bookRef.getAddress() != "" && bookRef.getAddress() != null) {
            builder.append("address = {" + bookRef.getAddress() + e);
        }
        if (bookRef.getEdition() != "" && bookRef.getEdition() != null) {
            builder.append("edition = {" + bookRef.getEdition() + e);
        }
        if (bookRef.getMonth() != "" && bookRef.getMonth() != null) {
            builder.append("month = {" + bookRef.getMonth() + e);
        }
        if (bookRef.getNote() != "" && bookRef.getNote() != null) {
            builder.append("note = {" + bookRef.getNote() + e);
        }
        if (bookRef.getKey() != "" && bookRef.getKey() != null) {
            builder.append("key = {" + bookRef.getKey() + e);
        }
        builder.append(c);
        return builder.toString();
    }

    private String createInproceedingsBib(InproceedingsReference reference) {
        StringBuilder builder = new StringBuilder();
        builder.append("@inproceedings{");
        builder.append(reference.getLabel() + ",\n");
        builder.append("author = {" + reference.getAuthor() + e);
        builder.append("title = {" + reference.getTitle() + e);
        builder.append("year = {" + reference.getYear() + e);
        if (reference.getEditor() != "" && reference.getEditor() != null) {
            builder.append("editor = {" + reference.getEditor() + e);
        }
        if (reference.getVolume() != "" && reference.getVolume() != null) {
            builder.append("volume = {" + reference.getVolume() + e);
        }
        if (reference.getSeries() != "" && reference.getSeries() != null) {
            builder.append("series = {" + reference.getSeries() + e);
        }
        if (reference.getPages() != "" && reference.getPages() != null) {
            builder.append("pages = {" + reference.getPages() + e);
        }
        if (reference.getAddress() != "" && reference.getAddress() != null) {
            builder.append("address = {" + reference.getAddress() + e);
        }
        if (reference.getMonth() != "" && reference.getMonth() != null) {
            builder.append("month = {" + reference.getMonth() + e);
        }
        if (reference.getOrganization() != "" && reference.getOrganization() != null) {
            builder.append("organization = {" + reference.getOrganization() + e);
        }
        if (reference.getPublisher() != "" && reference.getPublisher() != null) {
            builder.append("publisher = {" + reference.getPublisher() + e);
        }
        if (reference.getNote() != "" && reference.getNote() != null) {
            builder.append("note = {" + reference.getNote() + e);
        }
        if (reference.getKey() != "" && reference.getKey() != null) {
            builder.append("key = {" + reference.getKey() + e);
        }
        builder.append(c);
        return builder.toString();
    }

    private String createBookletBib(BookletReference reference) {
        StringBuilder builder = new StringBuilder();
        builder.append("@booklet{");
        builder.append(reference.getLabel() + ",\n");
        builder.append("title = {" + reference.getTitle() + e);
        if (reference.getAuthor() != "" && reference.getAuthor() != null) {
            builder.append("author = {" + reference.getAuthor() + e);
        }
        if (reference.getHowpublished() != "" && reference.getHowpublished() != null) {
            builder.append("howpublished = {" + reference.getHowpublished() + e);
        }
        if (reference.getAddress() != "" && reference.getAddress() != null) {
            builder.append("address = {" + reference.getAddress() + e);
        }
        if (reference.getMonth() != "" && reference.getMonth() != null) {
            builder.append("month = {" + reference.getMonth() + e);
        }
        if (reference.getYear() > 0) {
            builder.append("year = {" + reference.getYear() + e);
        }
        if (reference.getNote() != "" && reference.getNote() != null) {
            builder.append("note = {" + reference.getNote() + e);
        }
        if (reference.getKey() != "" && reference.getKey() != null) {
            builder.append("key = {" + reference.getKey());
        }
        builder.append(c);
        return builder.toString();
    }

    private String createConferenceBib(ConferenceReference reference) {
        StringBuilder builder = new StringBuilder();
        builder.append("@conference{");
        builder.append(reference.getLabel() + ",\n");
        builder.append("author = {" + reference.getAuthor() + e);
        builder.append("title = {" + reference.getTitle() + e);
        builder.append("year = {" + reference.getYear() + e);
        if (reference.getEditor() != "" && reference.getEditor() != null) {
            builder.append("editor = {" + reference.getEditor() + e);
        }
        if (reference.getVolume() != "" && reference.getVolume() != null) {
            builder.append("volume = {" + reference.getVolume() + e);
        }
        if (reference.getSeries() != "" && reference.getSeries() != null) {
            builder.append("series = {" + reference.getSeries() + e);
        }
        if (reference.getPages() != "" && reference.getPages() != null) {
            builder.append("pages = {" + reference.getPages() + e);
        }
        if (reference.getAddress() != "" && reference.getAddress() != null) {
            builder.append("address = {" + reference.getAddress() + e);
        }
        if (reference.getMonth() != "" && reference.getMonth() != null) {
            builder.append("month = {" + reference.getMonth() + e);
        }
        if (reference.getOrganization() != "" && reference.getOrganization() != null) {
            builder.append("organization = {" + reference.getOrganization() + e);
        }
        if (reference.getPublisher() != "" && reference.getPublisher() != null) {
            builder.append("publisher = {" + reference.getPublisher() + e);
        }
        if (reference.getNote() != "" && reference.getNote() != null) {
            builder.append("note = {" + reference.getNote() + e);
        }
        if (reference.getKey() != "" && reference.getKey() != null) {
            builder.append("key = {" + reference.getKey() + e);
        }
        builder.append(c);
        return builder.toString();
    }

    private String createIncollectionBib(IncollectionReference reference) {
        StringBuilder builder = new StringBuilder();
        builder.append("@incollection{");
        builder.append(reference.getLabel() + ",\n");
        builder.append("author = {" + reference.getAuthor() + e);
        builder.append("title = {" + reference.getTitle() + e);
        if (reference.getBooktitle() != "" && reference.getBooktitle() != null) {
            builder.append("booktitle = {" + reference.getBooktitle() + e);
        }
        if(reference.getPublisher() != "" && reference.getPublisher() !=null){
            builder.append("publisher = {" + reference.getPublisher() + e);
        }
        builder.append("year = {" + reference.getYear() + e);
        if (reference.getEditor() != "" && reference.getEditor() != null) {
            builder.append("editor = {" + reference.getEditor() + e);
        }
        if (reference.getNumber() != "" && reference.getNumber() != null) {
            builder.append("number = {" + reference.getNumber() + e);
        }
        if (reference.getVolume() != "" && reference.getVolume() != null) {
            builder.append("volume = {" + reference.getVolume() + e);
        }
        if (reference.getSeries() != "" && reference.getSeries() != null) {
            builder.append("series = {" + reference.getSeries() + e);
        }
        if (reference.getIncollectiontype() != "" && reference.getIncollectiontype() != null) {
            builder.append("type = {" + reference.getIncollectiontype() + e);
        }
        if(reference.getChapter()!="" && reference.getChapter()!=null){
            builder.append("chapter = {"+ reference.getChapter()+e);
        }
        if(reference.getPages()!="" && reference.getPages()!=null){
            builder.append("pages = {" +  reference.getPages()+e);
        }
        if(reference.getAddress()!="" && reference.getAddress()!=null){
            builder.append("address = {" + reference.getAddress()+e);
        }
        if(reference.getEdition()!="" && reference.getEdition()!=null){
            builder.append("edition = {" + reference.getEdition()+e);
        }
        if(reference.getMonth()!="" && reference.getMonth()!=null){
            builder.append("month = {"+reference.getMonth()+e);
        }
        if(reference.getNote()!="" && reference.getNote()!=null){
            builder.append("note = {"+reference.getNote()+e);
        }
        if(reference.getKey()!="" && reference.getKey()!=null){
            builder.append("key = {"+reference.getKey()+e);
        }
        builder.append(c);
        
        return builder.toString();
    }

}
