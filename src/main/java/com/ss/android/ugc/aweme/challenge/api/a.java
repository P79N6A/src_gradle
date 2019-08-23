package com.ss.android.ugc.aweme.challenge.api;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public final class a extends com.ss.android.ugc.aweme.base.api.a.b.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("challenge")
    Challenge challenge;

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getErrorMsg() {
        return this.mErrorMsg;
    }

    public final String getPrompt() {
        return this.mPrompt;
    }

    public a(int i) {
        super(i);
    }

    public final void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public final a setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public final a setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }
}
