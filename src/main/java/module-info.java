module cn.fhyjs.cirno.csgo.cirnocsgo {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;

        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
            /*
            requires eu.hansolo.tilesfx;
            requires com.almasb.fxgl.all;

             */

    opens cn.fhyjs.cirno.csgo.cirnocsgo to javafx.fxml;
    exports cn.fhyjs.cirno.csgo.cirnocsgo;
}