package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.c.b.e;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class o extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76804a;

    public final void open(JSONObject jSONObject) {
    }

    public o(WeakReference<Context> weakReference) {
        super(weakReference);
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76804a, false, 89958, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76804a, false, 89958, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        super.call(hVar, jSONObject);
        JSONObject jSONObject2 = hVar2.f20623d;
        final String optString = jSONObject2.optString("download_url");
        final String optString2 = jSONObject2.optString("app_name");
        if (PatchProxy.isSupport(new Object[]{optString, optString2}, this, f76804a, false, 89959, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{optString, optString2}, this, f76804a, false, 89959, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        final Activity e2 = p.a().e();
        if (e2 != null) {
            l.a(e2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76805a;

                public final void a(String[] strArr, int[] iArr) {
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f76805a, false, 89960, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f76805a, false, 89960, new Class[]{String[].class, int[].class}, Void.TYPE);
                        return;
                    }
                    if (iArr[0] == 0) {
                        com.ss.android.newmedia.e.a(optString, optString2, (Context) e2, true, (JSONObject) null);
                    }
                }
            });
        }
    }
}
