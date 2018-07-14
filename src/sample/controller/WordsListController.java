package sample.controller;

import com.ustyugov.core.impls.dictionary.Word;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class WordsListController {
    @FXML
    private TableView<Word> wordsListTableView;
    @FXML
    private TableColumn<Word, String> wordTableColumn;
    @FXML
    private TableColumn<Word, String> scanwordNumberTableColumn;
    @FXML
    private TableColumn<Word, String> infoTableColumn;
}
