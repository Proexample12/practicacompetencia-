module ni.edu.uam.practica_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens ni.edu.uam.practica_java to javafx.fxml;
    exports ni.edu.uam.practica_java;
}