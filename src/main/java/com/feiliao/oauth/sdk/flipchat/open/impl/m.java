package com.feiliao.oauth.sdk.flipchat.open.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;", "", "label", "", "def", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDef", "()I", "getLabel", "()Ljava/lang/String;", "requestAuthBind", "requestAuthUnBind", "requestAuthLogin", "canSilentRegister", "canSilentBindPhone", "silentBindMobile", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public enum m {
    requestAuthBind("requestAuthBind", 2),
    requestAuthUnBind("requestAuthUnBind", 3),
    requestAuthLogin("requestAuthLogin", 4),
    canSilentRegister("canSilentRegister", 5),
    canSilentBindPhone("canSilentBindPhone", 6),
    silentBindMobile("silentBindMobile", 7);
    
    private final int def;
    @NotNull
    private final String label;

    public final int getDef() {
        return this.def;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    protected m(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "label");
        this.label = str;
        this.def = i;
    }
}
