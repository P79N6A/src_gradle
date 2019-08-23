package com.ss.android.ugc.aweme.net.a;

import a.i;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.i18n.c;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements e.b<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56840a;

    public final String a(String str) {
        return str;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56840a, false, 60864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56840a, false, 60864, new Class[0], Void.TYPE);
            return;
        }
        if (!c.a()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            String curProcessName = ToolUtils.getCurProcessName(GlobalContext.getContext());
            if (TextUtils.isEmpty(curProcessName) || !curProcessName.contains("miniapp")) {
                AppLog.tryWaitDeviceInit();
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 > 1000) {
                i.a((Callable<TResult>) new e<TResult>(uptimeMillis2));
            }
        }
    }

    static final /* synthetic */ Object a(long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException unused) {
        }
        AppLogNewUtils.onEventV3("api_stuck", jSONObject);
        return null;
    }

    public final String a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f56840a, false, 60863, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f56840a, false, 60863, new Class[]{String.class, Boolean.TYPE}, String.class);
        } else if (str2 == null || (!str2.contains("/get_domains/") && !str2.contains("/ttnet_crash/"))) {
            return str2;
        } else {
            return AppLog.addCommonParams(str, z);
        }
    }
}
