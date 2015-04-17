package wad.domain;

import org.springframework.beans.factory.annotation.Autowired;
import wad.service.ReferenceService;
import wad.domain.ReferenceType;

public class Parser {
    
    private final String e = "},\n";
    private final String c = "}\n\n";

    public String createBibTexString(Reference reference) {
        ReferenceType type = reference.getType();

        switch (type) {
            case ARTICLE:
                return createArticleBib(reference);
            case BOOK:
                return createBookBib(reference);
            case INPROCEEDINGS:
                return createInproceedingsBib(reference);
        }

        return "";
    }

    private String createArticleBib(Reference reference) {
        ArticleReference articleRef = (ArticleReference) reference;
        StringBuilder builder = new StringBuilder();
        builder.append("@article{");
        appendCommonFields(articleRef, builder);
        if(articleRef.getJournal()!=null) builder.append("journal = {"+articleRef.getJournal()+e);
        if(articleRef.getVolume()!=null) builder.append("volume = {"+articleRef.getVolume()+e);
        if(articleRef.getNumber()!=null) builder.append("number = {"+articleRef.getNumber()+e);
        if(articleRef.getPages()!=null) builder.append("pages = {"+articleRef.getPages()+e);
        if(articleRef.getMonth()!=null) builder.append("month = {"+articleRef.getMonth()+e);
        if(articleRef.getNote()!=null) builder.append("note = {"+articleRef.getNote()+e);
        if(articleRef.getKey()!=null) builder.append("key = {"+articleRef.getKey()+e);
        builder.append(c);
        return builder.toString();
    }
    
    private String createBookBib(Reference reference) {
        BookReference bookRef = (BookReference) reference;
        StringBuilder builder = new StringBuilder();
        builder.append("@book{");
        appendCommonFields(bookRef, builder);
        if(bookRef.getPublisher()!=null) builder.append("publisher = {"+bookRef.getPublisher()+e);
        if(bookRef.getVolume()!=null) builder.append("volume = {"+bookRef.getVolume()+e);
        if(bookRef.getSeries()!=null) builder.append("series = {"+bookRef.getSeries()+e);
        if(bookRef.getAddress()!=null) builder.append("address = {"+bookRef.getAddress()+e);
        if(bookRef.getEdition()!=null) builder.append("edition = {"+bookRef.getEdition()+e);
        if(bookRef.getMonth()!=null) builder.append("month = {"+bookRef.getMonth()+e);
        if(bookRef.getNote()!=null) builder.append("note = {"+bookRef.getNote()+e);
        if(bookRef.getKey()!=null) builder.append("key = {"+bookRef.getKey()+e);
        builder.append(c);
        return builder.toString();
    }

    private String createInproceedingsBib(Reference reference) {
        InproceedingsReference inproceedingsRef = (InproceedingsReference) reference;
        StringBuilder builder = new StringBuilder();
        builder.append("@inproceedings{");
        appendCommonFields(inproceedingsRef, builder);
        if(inproceedingsRef.getEditor()!=null) builder.append("editor = {"+inproceedingsRef.getEditor()+e);
        if(inproceedingsRef.getVolume()!=null) builder.append("volume = {"+inproceedingsRef.getVolume()+e);
        if(inproceedingsRef.getSeries()!=null) builder.append("series = {"+inproceedingsRef.getSeries()+e);
        if(inproceedingsRef.getPages()!=null) builder.append("pages = {"+inproceedingsRef.getPages()+e);
        if(inproceedingsRef.getAddress()!=null) builder.append("address = {"+inproceedingsRef.getAddress()+e);
        if(inproceedingsRef.getMonth()!=null) builder.append("month = {"+inproceedingsRef.getMonth()+e);
        if(inproceedingsRef.getOrganization()!=null) builder.append("organization = {"+inproceedingsRef.getOrganization()+e);
        if(inproceedingsRef.getPublisher()!=null) builder.append("publisher = {"+inproceedingsRef.getPublisher()+e);
        if(inproceedingsRef.getNote()!=null) builder.append("note = {"+inproceedingsRef.getNote()+e);
        if(inproceedingsRef.getKey()!=null) builder.append("key = {"+inproceedingsRef.getKey()+e);
        builder.append(c);
        return builder.toString();
    }

    private void appendCommonFields(Reference reference, StringBuilder builder) {
        builder.append(reference.getLabel() + ",\n");
        builder.append("author = {" + reference.getAuthor() +e);
        builder.append("title = {" + reference.getTitle() +e);
        builder.append("year = {" + reference.getYear() +e);
    }

}
