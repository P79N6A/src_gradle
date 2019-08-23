package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class GameInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("game_score")
    public int gameScore;
    @SerializedName("game_type")
    public int gameType;

    public int getGameScore() {
        return this.gameScore;
    }

    public int getGameType() {
        return this.gameType;
    }

    public void setGameScore(int i) {
        this.gameScore = i;
    }

    public void setGameType(int i) {
        this.gameType = i;
    }
}
