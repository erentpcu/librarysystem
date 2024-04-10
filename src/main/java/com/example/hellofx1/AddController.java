package com.example.hellofx1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import static com.example.hellofx1.MainController.observableBookList;

public class AddController {
    @FXML
    private TextField title;
    @FXML
    private TextField subtitle;
    @FXML
    private TextField isbn;
    @FXML
    private TextField authors;
    @FXML
    private TextField translators;
    @FXML
    private TextField publisher;
    @FXML
    private DatePicker date;
    @FXML
    private TextField covertype;
    @FXML
    private TextField edition;
    @FXML
    private TextField page;
    @FXML
    private TextField image;
    @FXML
    private TextField tag;
    @FXML
    private Button resetButton;
    @FXML
    private Button addButton;


    @FXML
    public void AddNewBook(){
        Book newbook = new Book();

        newbook.setTitle(title.getText());
        newbook.setSubtitle(subtitle.getText());
        newbook.setIsbn(isbn.getText());

        newbook.setAuthors(authors.getText());
        newbook.setTranslators(translators.getText());

        newbook.setPublisher(publisher.getText());
        if(date.getValue() != null){
            newbook.setDate(date.getValue().toString());
        }
        newbook.setCovertype(covertype.getText());
        newbook.setEdition(edition.getText());
        if(!page.getText().isEmpty()){
            newbook.setPage(Integer.parseInt(page.getText()));
        }
       // newbook.setCoverImage(image.getText());


        newbook.setTags(tag.getText());

        observableBookList.add(newbook);

        ResetInput();

    }
    @FXML
    public void ResetInput(){
        title.clear();
        subtitle.clear();
        isbn.clear();
        authors.clear();
        translators.clear();
        publisher.clear();
        edition.clear();
        page.clear();
        // image.clear();
        tag.clear();
        covertype.clear();
        date.setValue(null);
    }
}
