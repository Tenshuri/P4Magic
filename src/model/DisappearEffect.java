/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author p1501174
 */
public class DisappearEffect extends Effect {

    /**
     * This effect changes the color of the tile that has just been played and
     * thus the owner of the tile)
     *
     * @param line
     * @param column
     * @param game
     */
    @Override
    public void playEffect(int line, int column, Game game) {

        int tile_id = game.getBoard().getTileIJ(line, column).getStatus();
        int player1_id = game.getPlayer1().getId();

        if (tile_id == player1_id) {
            tile_id = -1;
        } else {
            tile_id = player1_id;
        }
        game.getBoard().getTileIJ(line, column).setStatus(tile_id);
    }

}
