package com.ss.android.ugc.aweme.miniapp.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import org.json.JSONObject;

public final class c implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55619a;

    @NonNull
    public final String getType() {
        return "appBrandMonitor";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2}, this, f55619a, false, 59349, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2}, this, f55619a, false, 59349, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        } else if (crossProcessDataEntity2 == null) {
            return null;
        } else {
            String string = crossProcessDataEntity2.getString("mpMonitorServiceName");
            String string2 = crossProcessDataEntity2.getString("mpMonitorStatusCode");
            JSONObject jSONObject = crossProcessDataEntity2.getJSONObject("mpMonitorData");
            if (!TextUtils.isEmpty(string)) {
                try {
                    MonitorUtils.monitorStatusRate(string, Integer.valueOf(string2).intValue(), jSONObject);
                } catch (Exception e2) {
                    AppBrandLogger.stacktrace(5, "AppbrandMonitorHandler", e2.getStackTrace());
                }
            }
            return null;
        }
    }
}
