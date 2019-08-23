package com.ss.android.ugc.aweme.miniapp.c.a;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.z;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55602a;

    public final CrossProcessDataEntity a(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2}, this, f55602a, false, 59355, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2}, this, f55602a, false, 59355, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        } else if (crossProcessDataEntity2 == null) {
            return null;
        } else {
            try {
                String string = crossProcessDataEntity2.getString("category");
                String string2 = crossProcessDataEntity2.getString("logEventName");
                String string3 = crossProcessDataEntity2.getString("labelName");
                long j = crossProcessDataEntity2.getLong("logVIValue");
                long j2 = crossProcessDataEntity2.getLong("logVIExtValue");
                JSONObject jSONObject = crossProcessDataEntity2.getJSONObject("logEventData");
                Object[] objArr = {null, string, string2, string3, new Long(j), new Long(j2), jSONObject};
                if (PatchProxy.isSupport(objArr, null, z.f28227a, true, 15621, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                    Object[] objArr2 = {null, string, string2, string3, new Long(j), new Long(j2), jSONObject};
                    Object[] objArr3 = objArr2;
                    PatchProxy.accessDispatch(objArr3, null, z.f28227a, true, 15621, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
                } else {
                    Object[] objArr4 = {null, string, string2, string3, new Long(j), new Long(j2), (byte) 0, jSONObject};
                    if (PatchProxy.isSupport(objArr4, null, z.f28227a, true, 15626, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
                        Object[] objArr5 = {null, string, string2, string3, new Long(j), new Long(j2), (byte) 0, jSONObject};
                        Object[] objArr6 = objArr5;
                        PatchProxy.accessDispatch(objArr6, null, z.f28227a, true, 15626, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE);
                    } else {
                        AppLog.onEvent(null, string, string2, string3, j, j2, false, jSONObject);
                    }
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(5, "AppV1LogHandler", e2.getStackTrace());
            }
            return null;
        }
    }
}
