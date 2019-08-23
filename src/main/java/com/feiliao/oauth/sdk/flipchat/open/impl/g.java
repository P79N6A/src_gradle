package com.feiliao.oauth.sdk.flipchat.open.impl;

import com.feiliao.oauth.sdk.flipchat.open.a.c;
import com.feiliao.oauth.sdk.flipchat.open.a.d;
import com.feiliao.oauth.sdk.flipchat.open.api.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toException", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatException;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/FlipChatBaseResponse;", "flipchat_open_sdk_release"}, k = 2, mv = {1, 1, 13})
public final class g {
    @NotNull
    public static final f a(@NotNull d dVar) {
        int i;
        String str;
        Intrinsics.checkParameterIsNotNull(dVar, "receiver$0");
        c a2 = dVar.a();
        if (a2 != null) {
            i = a2.f24262b;
        } else {
            i = -1;
        }
        c a3 = dVar.a();
        if (a3 != null) {
            str = a3.f24263c;
        } else {
            str = null;
        }
        return new f(i, str);
    }
}
