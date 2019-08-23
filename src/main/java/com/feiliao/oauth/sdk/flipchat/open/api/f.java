package com.feiliao.oauth.sdk.flipchat.open.api;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatException;", "Ljava/lang/Exception;", "errorCode", "", "errorMsg", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMsg", "()Ljava/lang/String;", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class f extends Exception {
    private final int errorCode;
    @Nullable
    private final String errorMsg;

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public f(int i, @Nullable String str) {
        super(i + ':' + str);
        this.errorCode = i;
        this.errorMsg = str;
    }
}
