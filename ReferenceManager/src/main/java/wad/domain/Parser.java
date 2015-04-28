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
        if (!"".equals(articleRef.getJournal()) && articleRef.getJournal() != null) {
            builder.append("journal = {").append(articleRef.getJournal()+e);
        }
        if (!"".equals(articleRef.getVolume()) && articleRef.getVolume() != null) {
            builder.append("volume = {" + articleRef.getVolume() + e);
        }
        if (!"".equals(articleRef.getNumber()) && articleRef.getNumber() != null) {
            builder.append("number = {" + articleRef.getNumber() + e);
        }
        if (!"".equals(articleRef.getPages()) && articleRef.getPages() != null) {
            builder.append("pages = {" + articleRef.getPages() + e);
        }
        if (!"".equals(articleRef.getMonth()) && articleRef.getMonth() != null) {
            builder.append("month = {" + articleRef.getMonth() + e);
        }
        if (!"".equals(articleRef.getNote()) && articleRef.getNote() != null) {
            builder.append("note = {" + articleRef.getNote() + e);
        }
        if (!"".equals(articleRef.getKey()) && articleRef.getKey() != null) {
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
        if (!"".equals(bookRef.getPublisher()) && bookRef.getPublisher() != null) {
            builder.append("publisher = {" + bookRef.getPublisher() + e);
        }
        if (!"".equals(bookRef.getVolume()) && bookRef.getVolume() != null) {
            builder.append("volume = {" + bookRef.getVolume() + e);
        }
        if (!"".equals(bookRef.getSeries()) && bookRef.getSeries() != null) {
            builder.append("series = {" + bookRef.getSeries() + e);
        }
        if (!"".equals(bookRef.getAddress()) && bookRef.getAddress() != null) {
            builder.append("address = {" + bookRef.getAddress() + e);
        }
        if (!"".equals(bookRef.getEdition()) && bookRef.getEdition() != null) {
            builder.append("edition = {" + bookRef.getEdition() + e);
        }
        if (!"".equals(bookRef.getMonth()) && bookRef.getMonth() != null) {
            builder.append("month = {" + bookRef.getMonth() + e);
        }
        if (!"".equals(bookRef.getNote()) && bookRef.getNote() != null) {
            builder.append("note = {" + bookRef.getNote() + e);
        }
        if (!"".equals(bookRef.getKey()) && bookRef.getKey() != null) {
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
        if (!"".equals(reference.getEditor()) && reference.getEditor() != null) {
            builder.append("editor = {" + reference.getEditor() + e);
        }
        if (!"".equals(reference.getVolume()) && reference.getVolume() != null) {
            builder.append("volume = {" + reference.getVolume() + e);
        }
        if (!"".equals(reference.getSeries()) && reference.getSeries() != null) {
            builder.append("series = {" + reference.getSeries() + e);
        }
        if (!"".equals(reference.getPages()) && reference.getPages() != null) {
            builder.append("pages = {" + reference.getPages() + e);
        }
        if (!"".equals(reference.getAddress()) && reference.getAddress() != null) {
            builder.append("address = {" + reference.getAddress() + e);
        }
        if (!"".equals(reference.getMonth()) && reference.getMonth() != null) {
            builder.append("month = {" + reference.getMonth() + e);
        }
        if (!"".equals(reference.getOrganization()) && reference.getOrganization() != null) {
            builder.append("organization = {" + reference.getOrganization() + e);
        }
        if (!"".equals(reference.getPublisher()) && reference.getPublisher() != null) {
            builder.append("publisher = {" + reference.getPublisher() + e);
        }
        if (!"".equals(reference.getNote()) && reference.getNote() != null) {
            builder.append("note = {" + reference.getNote() + e);
        }
        if (!"".equals(reference.getKey()) && reference.getKey() != null) {
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
        if (!"".equals(reference.getAuthor()) && reference.getAuthor() != null) {
            builder.append("author = {" + reference.getAuthor() + e);
        }
        if (!"".equals(reference.getHowpublished()) && reference.getHowpublished() != null) {
            builder.append("howpublished = {" + reference.getHowpublished() + e);
        }
        if (!"".equals(reference.getAddress()) && reference.getAddress() != null) {
            builder.append("address = {" + reference.getAddress() + e);
        }
        if (!"".equals(reference.getMonth()) && reference.getMonth() != null) {
            builder.append("month = {" + reference.getMonth() + e);
        }
        if (reference.getYear() > 0) {
            builder.append("year = {" + reference.getYear() + e);
        }
        if (!"".equals(reference.getNote()) && reference.getNote() != null) {
            builder.append("note = {" + reference.getNote() + e);
        }
        if (!"".equals(reference.getKey()) && reference.getKey() != null) {
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
        if (!"".equals(reference.getEditor()) && reference.getEditor() != null) {
            builder.append("editor = {" + reference.getEditor() + e);
        }
        if (!"".equals(reference.getVolume()) && reference.getVolume() != null) {
            builder.append("volume = {" + reference.getVolume() + e);
        }
        if (!"".equals(reference.getSeries()) && reference.getSeries() != null) {
            builder.append("series = {" + reference.getSeries() + e);
        }
        if (!"".equals(reference.getPages()) && reference.getPages() != null) {
            builder.append("pages = {" + reference.getPages() + e);
        }
        if (!"".equals(reference.getAddress()) && reference.getAddress() != null) {
            builder.append("address = {" + reference.getAddress() + e);
        }
        if (!"".equals(reference.getMonth()) && reference.getMonth() != null) {
            builder.append("month = {" + reference.getMonth() + e);
        }
        if (!"".equals(reference.getOrganization()) && reference.getOrganization() != null) {
            builder.append("organization = {" + reference.getOrganization() + e);
        }
        if (!"".equals(reference.getPublisher()) && reference.getPublisher() != null) {
            builder.append("publisher = {" + reference.getPublisher() + e);
        }
        if (!"".equals(reference.getNote()) && reference.getNote() != null) {
            builder.append("note = {" + reference.getNote() + e);
        }
        if (!"".equals(reference.getKey()) && reference.getKey() != null) {
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
        if (!"".equals(reference.getBooktitle()) && reference.getBooktitle() != null) {
            builder.append("booktitle = {" + reference.getBooktitle() + e);
        }
        if(!"".equals(reference.getPublisher()) && reference.getPublisher() !=null){
            builder.append("publisher = {" + reference.getPublisher() + e);
        }
        builder.append("year = {" + reference.getYear() + e);
        if (!"".equals(reference.getEditor()) && reference.getEditor() != null) {
            builder.append("editor = {" + reference.getEditor() + e);
        }
        if (!"".equals(reference.getNumber()) && reference.getNumber() != null) {
            builder.append("number = {" + reference.getNumber() + e);
        }
        if (!"".equals(reference.getVolume()) && reference.getVolume() != null) {
            builder.append("volume = {" + reference.getVolume() + e);
        }
        if (!"".equals(reference.getSeries()) && reference.getSeries() != null) {
            builder.append("series = {" + reference.getSeries() + e);
        }
        if (!"".equals(reference.getIncollectiontype()) && reference.getIncollectiontype() != null) {
            builder.append("type = {" + reference.getIncollectiontype() + e);
        }
        if(!"".equals(reference.getChapter()) && reference.getChapter()!=null){
            builder.append("chapter = {"+ reference.getChapter()+e);
        }
        if(!"".equals(reference.getPages()) && reference.getPages()!=null){
            builder.append("pages = {" +  reference.getPages()+e);
        }
        if(!"".equals(reference.getAddress()) && reference.getAddress()!=null){
            builder.append("address = {" + reference.getAddress()+e);
        }
        if(!"".equals(reference.getEdition()) && reference.getEdition()!=null){
            builder.append("edition = {" + reference.getEdition()+e);
        }
        if(!"".equals(reference.getMonth()) && reference.getMonth()!=null){
            builder.append("month = {"+reference.getMonth()+e);
        }
        if(!"".equals(reference.getNote()) && reference.getNote()!=null){
            builder.append("note = {"+reference.getNote()+e);
        }
        if(!"".equals(reference.getKey()) && reference.getKey()!=null){
            builder.append("key = {"+reference.getKey()+e);
        }
        builder.append(c);
        
        return builder.toString();
    }

}
