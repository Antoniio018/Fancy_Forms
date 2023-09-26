module es.ieslosmontecillos.fancy_forms {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.fancy_forms to javafx.fxml;
    exports es.ieslosmontecillos.fancy_forms;
}