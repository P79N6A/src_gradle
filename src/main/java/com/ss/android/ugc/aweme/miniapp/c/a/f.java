package com.ss.android.ugc.aweme.miniapp.c.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;
import org.json.JSONObject;

public final class f implements IAsyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55617a;

    @NonNull
    public final String getType() {
        return "handleUserRelation";
    }

    public final void action(@Nullable CrossProcessDataEntity crossProcessDataEntity, @NonNull AsyncIpcHandler asyncIpcHandler) {
        CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
        AsyncIpcHandler asyncIpcHandler2 = asyncIpcHandler;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2, asyncIpcHandler2}, this, f55617a, false, 59375, new Class[]{CrossProcessDataEntity.class, AsyncIpcHandler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2, asyncIpcHandler2}, this, f55617a, false, 59375, new Class[]{CrossProcessDataEntity.class, AsyncIpcHandler.class}, Void.TYPE);
        } else if (crossProcessDataEntity2 == null) {
            asyncIpcHandler2.callback(null);
        } else {
            try {
                if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2, asyncIpcHandler2}, null, f55617a, true, 59376, new Class[]{CrossProcessDataEntity.class, AsyncIpcHandler.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2, asyncIpcHandler2}, null, f55617a, true, 59376, new Class[]{CrossProcessDataEntity.class, AsyncIpcHandler.class}, Void.TYPE);
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject("apiData");
                        String optString = jSONObject.optString("action");
                        jSONObject.getString("userId");
                        crossProcessDataEntity2.getString("ttId");
                        if (!TextUtils.equals(optString, "follow")) {
                            TextUtils.equals(optString, "unfollow");
                        }
                    } catch (Exception e2) {
                        AppBrandLogger.e("UserRelationHandler", "", e2);
                    }
                }
            } catch (Exception e3) {
                AppBrandLogger.e("UserRelationHandler", "", e3);
                asyncIpcHandler2.callback(null);
            }
        }
    }
}
