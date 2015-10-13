package com.jcloisterzone.wsio.message;

import com.jcloisterzone.wsio.WsMessageCommand;

@WsMessageCommand("PLAYER_TIMEOUT")
public class PlayerTimeoutMessage implements WsInGameMessage {

    private String gameId;
    private boolean undo;

    public PlayerTimeoutMessage(String gameId, boolean undo) {
        super();
        this.gameId = gameId;
        this.undo = undo;
    }

    @Override
    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public boolean isUndo() {
        return undo;
    }

    public void setUndo(boolean undo) {
        this.undo = undo;
    }
}
