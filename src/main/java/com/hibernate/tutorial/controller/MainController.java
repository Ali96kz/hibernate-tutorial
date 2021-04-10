package com.hibernate.tutorial.controller;

import com.hibernate.tutorial.dto.CategoryTableDto;
import com.hibernate.tutorial.dto.ClientTableDto;
import com.hibernate.tutorial.dto.ProductTableDto;
import com.hibernate.tutorial.model.Category;
import com.hibernate.tutorial.model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    private ObservableList<Product> productData = FXCollections.observableArrayList();
    private ObservableList<ClientTableDto> clientData = FXCollections.observableArrayList();
    private ObservableList<Category> categoryData = FXCollections.observableArrayList();

    @FXML
    private TableView<ClientTableDto> clientsTable;
    @FXML
    private TableColumn<ClientTableDto, String> clientNameColumn;
    @FXML
    private TableColumn<ClientTableDto, String> clientProductsColumn;

    @FXML
    private TableView<ProductTableDto> productsTable;
    @FXML
    private TableColumn<ProductTableDto, String> productNameColumn;
    @FXML
    private TableColumn<ProductTableDto, String> productClientsColumn;
    @FXML
    private TableColumn<ProductTableDto, String> productCategoryColumn;

    @FXML
    private TableView<CategoryTableDto> categoryTable;
    @FXML
    private TableColumn<CategoryTableDto, String> categoryNameColumn;

    @FXML
    private void initialize() {
        clientNameColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        clientProductsColumn.setCellValueFactory(new PropertyValueFactory<>("products"));

        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        productClientsColumn.setCellValueFactory(new PropertyValueFactory<>("clients"));
        productCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));

        categoryNameColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
    }
}
