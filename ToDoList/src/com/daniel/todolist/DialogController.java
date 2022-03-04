package com.daniel.todolist;

import com.daniel.todolist.datamodel.ToDoData;
import com.daniel.todolist.datamodel.ToDoItem;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadLinePicker;


    public ToDoItem processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadLineValue = deadLinePicker.getValue();


        ToDoItem newItem = new ToDoItem(shortDescription, details, deadLineValue);
        ToDoData.getInstance().addToDoItem(newItem);
        return newItem;
    }


    public void initializeField(ToDoItem item) {
        System.out.println(item.getShortDescription());
        shortDescriptionField.setText(item.getShortDescription());

    }

}

