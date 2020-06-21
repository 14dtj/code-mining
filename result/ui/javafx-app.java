/**
 * 应用的初始化
 */
public class $App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final Stage $stage = new Stage();
        $Set stage parameters;
        Container $container = new Container();
        $container.getChildren().add($children);
        Scene $scene = new Scene($container);
        $stage.setScene($scene);
        $stage.show();
    }
}