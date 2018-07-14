package sample.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {
    @FXML
    private MenuItem openMenuItem;
    @FXML
    private MenuItem createMenuItem;
    @FXML
    private MenuItem closeMenuItem;
    @FXML
    private MenuItem deleteMenuItem;
    @FXML
    private MenuItem exportMenuItem;
    @FXML
    private MenuItem importMenuItem;
    @FXML
    private MenuItem aboutMenuItem;
    @FXML
    private Menu fileMenu;
    @FXML
    private Menu helpMenu;
    @FXML
    private SplitPane  leftSplitPane;
    @FXML
    private SplitPane  centralSplitPane;
    @FXML
    private SplitPane  rightSplitPane;
    @FXML
    private AnchorPane informationPane;
    @FXML
    private AnchorPane pathInformationPane;
}

