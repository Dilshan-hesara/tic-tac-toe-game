/*
 * Copyright (c) 2024 Dilshan Hesara
 * Author: Dilshan Hesara
 * GitHub: https://github.com/Dilshan-hesara
 *
 * All Rights Reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to use
 * the Software for **personal or educational purposes only**, subject to the following conditions:
 *
 * - The Software may **not be sold** for commercial purposes.
 * - The Software may **not be modified** or altered in any way.
 * - Redistribution of this Software is permitted, provided that the original
 *   copyright notice and this permission notice appear in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES, OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT, OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package lk.edu.tictacgame.tictactoe.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import lk.edu.tictacgame.tictactoe.Board.BoardImpl;
import lk.edu.tictacgame.tictactoe.Board.BoardUi;
import lk.edu.tictacgame.tictactoe.Servers.Piece;

import java.io.IOException;

public class dashBoadController implements BoardUi {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Text winnerText;
    @FXML
    private AnchorPane anDash;

    BoardImpl boardGame;

    @FXML
    void homePage(ActionEvent event) throws IOException {

        anDash.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/logingPage.fxml"));
        anDash.getChildren().add(load);
    }
    @FXML
    void onButtClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonId = clickedButton.getId();

        int row = -1, col = -1;
        switch (buttonId) {
            case "button1": row = 0; col = 0; break;
            case "button2": row = 0; col = 1; break;
            case "button3": row = 0; col = 2; break;
            case "button4": row = 1; col = 0; break;
            case "button5": row = 1; col = 1; break;
            case "button6": row = 1; col = 2; break;
            case "button7": row = 2; col = 0; break;
            case "button8": row = 2; col = 1; break;
            case "button9": row = 2; col = 2; break;
        }


    }

    @Override
    public void updateBoard(int i, int j, Piece piece) {

    }

    @FXML
    void restartGame(ActionEvent event) {
        boardGame.reset();
        winnerText.setText("Play Again!");
        resetBoardUi();
    }

    private void resetBoardUi() {
        button1.setDisable(false); button1.setText("");
        button2.setDisable(false); button2.setText("");
        button3.setDisable(false); button3.setText("");
        button4.setDisable(false); button4.setText("");
        button5.setDisable(false); button5.setText("");
        button6.setDisable(false); button6.setText("");
        button7.setDisable(false); button7.setText("");
        button8.setDisable(false); button8.setText("");
        button9.setDisable(false); button9.setText("");
    }

}

