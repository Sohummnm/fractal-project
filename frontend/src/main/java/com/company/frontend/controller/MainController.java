package com.company.frontend.controller;

import com.company.frontend.model.Employee;
import com.company.frontend.service.ApiClient;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

    @FXML private TextField nameField;
    @FXML private TextField roleField;
    @FXML private TableView<Employee> employeeTable;

    private final ApiClient api = new ApiClient();

    @FXML
    public void initialize() {
        refresh();
    }

    @FXML
    public void addEmployee() {
        api.addEmployee(nameField.getText(), roleField.getText());
        refresh();
    }

    private void refresh() {
        employeeTable.getItems().setAll(api.listEmployees());
    }
}
