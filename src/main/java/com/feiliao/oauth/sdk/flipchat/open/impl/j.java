package com.feiliao.oauth.sdk.flipchat.open.impl;

import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.feiliao.oauth.sdk.flipchat.open.a.c;
import com.feiliao.oauth.sdk.flipchat.open.a.d;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"monitor", "", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "type", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/FlipChatBaseResponse;", "flipchat_open_sdk_release"}, k = 2, mv = {1, 1, 13})
public final class j {
    public static final void a(@NotNull BaseApiResponse baseApiResponse, @NotNull m mVar) {
        Intrinsics.checkParameterIsNotNull(baseApiResponse, "receiver$0");
        Intrinsics.checkParameterIsNotNull(mVar, "type");
        String label = mVar.getLabel();
        try {
            FlipChatOpenDepend b2 = h.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_param_api", label);
            jSONObject.put("error_code", baseApiResponse.error);
            jSONObject.put("error_msg", baseApiResponse.errorMsg);
            b2.appLog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void a(@NotNull d dVar, @NotNull m mVar) {
        Integer num;
        Intrinsics.checkParameterIsNotNull(dVar, "receiver$0");
        Intrinsics.checkParameterIsNotNull(mVar, "type");
        String label = mVar.getLabel();
        try {
            FlipChatOpenDepend b2 = h.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_param_api", label);
            c a2 = dVar.a();
            String str = null;
            if (a2 != null) {
                num = Integer.valueOf(a2.f24262b);
            } else {
                num = null;
            }
            jSONObject.put("error_code", num);
            c a3 = dVar.a();
            if (a3 != null) {
                str = a3.f24263c;
            }
            jSONObject.put("error_msg", str);
            b2.appLog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
    }
}
