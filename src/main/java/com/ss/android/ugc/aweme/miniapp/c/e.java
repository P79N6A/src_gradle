package com.ss.android.ugc.aweme.miniapp.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55621a;

    @NonNull
    public final String getType() {
        return "getNetCommonParams";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55621a, false, 59351, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55621a, false, 59351, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        }
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, true);
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry != null) {
                try {
                    if (!(entry.getKey() == null || entry.getValue() == null)) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                } catch (Exception e2) {
                    AppBrandLogger.stacktrace(5, "GetNetCommonParamsHandler", e2.getStackTrace());
                }
            }
        }
        return CrossProcessDataEntity.Builder.create().put("netCommonParams", jSONObject).build();
    }
}
