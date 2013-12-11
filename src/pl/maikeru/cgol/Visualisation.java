package pl.maikeru.cgol;

import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author maikeru
 */
class Visualisation {

    private static final int offset = 100;
    private static final int cellSize = 10;
    private static final int cells = 50;
    private static final int boardSize = cellSize * cells;

    private final Playable game;
    private final List<List<Rectangle>> board = new ArrayList<>();
    
    public static Visualisation startGame(Stage stage, Playable game) {
        Visualisation visualisation = new Visualisation(stage, game);
        visualisation.start();
        return visualisation;
    }

    public void activate(int x, int y) {
        board.get(y).get(x).setFill(Color.LIMEGREEN);
    }

    public void deactivate(int x, int y) {
        board.get(y).get(x).setFill(Color.BLACK);
    }

    public void update(Boolean[][] board) {
        int maxWidth = Math.min(cells, board.length);
        for (int i = 0; i < maxWidth; i++) {
            int maxHeight = Math.min(cells, board[i].length);
            for (int j = 0; j < maxHeight; j++) {
                if (board[i][j] != null) {
                    if (board[i][j] == true) {
                        activate(i, j);
                    } else {
                        deactivate(i, j);
                    }
                }
            }
        }
    }

    public void start() {
        update(game.toArray());
    }

    public Visualisation(Stage stage, Playable game) {
        this.game = game;
        stage.setTitle("cgol display");

        Pane root = new Pane();
        addButton(root, getTickButton(), 0, 0);
        addButton(root, getResetButton(), 0, 25);
        addPlaceholders(root);
        stage.setScene(new Scene(root, boardSize + offset, boardSize + offset));
        stage.show();
    }

    private void addPlaceholders(Pane pane) {
        List<Rectangle> rects;
        for (int row = 0; row < cells; row++) {
            rects = new ArrayList<>();
            board.add(rects);
            for (int col = 0; col < cells; col++) {
                rects.add(addPlaceholder(pane, col * cellSize, row * cellSize));
            }
        }
    }

    private void addButton(Pane pane, Button btn, int x, int y) {
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        pane.getChildren().add(btn);
    }

    private Rectangle addPlaceholder(Pane pane, int x, int y) {
        y = y + 100;
        x = x + 100;
        Rectangle rectangle = new Rectangle(cellSize, cellSize);
        rectangle.setFill(Color.BLACK);
        rectangle.setLayoutX(x);
        rectangle.setLayoutY(y);
        pane.getChildren().add(rectangle);
        return rectangle;
    }

    private Button getTickButton() {
        Button btn = new Button();
        btn.setText("Tick");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                game.nextState();
                update(game.toArray());
            }
        });
        return btn;
    }

    private Button getResetButton() {
        Button btn = new Button();
        btn.setText("Reset");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                game.resetState();
                update(game.toArray());
            }
        });
        return btn;
    }

}
