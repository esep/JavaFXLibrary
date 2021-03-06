package javafxlibrary.testapps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.testfx.api.FxToolkit;

public class FinderApp extends Application {

    int scale = 200;

    @Override
    public void init() throws Exception {
        FxToolkit.registerStage(() -> new Stage());
    }

    @Override
    public void start(Stage firstStage) throws Exception {
        Stage secondStage = new Stage();
        Stage thirdStage = new Stage();
        Stage fourthStage = new Stage();
        Stage[] stages = new Stage[]{firstStage, secondStage, thirdStage, fourthStage};

        Parent firstRoot = FXMLLoader.load(getClass().getResource("/fxml/javafxlibrary/ui/FinderApp/FirstScene.fxml"));
        Parent secondRoot = FXMLLoader.load(getClass().getResource("/fxml/javafxlibrary/ui/FinderApp/SecondScene.fxml"));
        Parent thirdRoot = FXMLLoader.load(getClass().getResource("/fxml/javafxlibrary/ui/FinderApp/ThirdScene.fxml"));
        Parent fourthRoot = FXMLLoader.load(getClass().getResource("/fxml/javafxlibrary/ui/FinderApp/FirstScene.fxml"));

        Scene[] scenes = new Scene[]{new Scene(firstRoot), new Scene(secondRoot), new Scene(thirdRoot), new Scene(fourthRoot)};

        for (int i = 0; i < stages.length; i++) {
            Stage current = stages[i];
            current.initStyle(StageStyle.DECORATED);
            current.setWidth(scale);
            current.setHeight(scale);
            current.setX(i * scale);
            current.setY(100);
            current.setScene(scenes[i]);
            current.setTitle("Window " + (i + 1));
            current.show();
        }

    }
}
