/**
 * button 添加监听
 */
Button w = new Button($displayInfo);
w.setOnAction(new EventHandler<ActionEvent>(){
@Override public void handle(ActionEvent arg0){
        $updateScene;
        Scene d=new Scene($children);

        $stage.setScene(d);
        $stage.show();
}
/**
 * 进度条
 */
for (int i = 0; i < 20; i++) {
    try {
        Thread.sleep(new Random().nextInt($interval));
    } catch (InterruptedException ex) {
        ex.printStackTrace();
    }
    final double prog = i * 0.05;
    Platform.runLater(new Runnable() {
        public void run() {
            progress.setProgress(prog);
        }
    });
}