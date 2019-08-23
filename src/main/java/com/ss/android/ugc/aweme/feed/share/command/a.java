package com.ss.android.ugc.aweme.feed.share.command;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("command")
    String command;

    public String getCommand() {
        return this.command;
    }

    public void setCommand(String str) {
        this.command = str;
    }
}
