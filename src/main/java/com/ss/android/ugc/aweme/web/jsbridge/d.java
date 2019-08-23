package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.c.b.e;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4319a;

    /* renamed from: b  reason: collision with root package name */
    private a f4320b;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|5|6|7|8|(1:10)|11|12|13|(1:15)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0063 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067 A[Catch:{ Exception -> 0x006e }] */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindMobileFinishEvent(com.ss.android.ugc.aweme.account.e.a r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f4319a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.account.e.a> r1 = com.ss.android.ugc.aweme.account.e.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 89934(0x15f4e, float:1.26024E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f4319a
            r3 = 0
            r4 = 89934(0x15f4e, float:1.26024E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.account.e.a> r1 = com.ss.android.ugc.aweme.account.e.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x006e }
            r0.<init>()     // Catch:{ Exception -> 0x006e }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x006e }
            r1.<init>()     // Catch:{ Exception -> 0x006e }
            java.lang.String r2 = "type"
            java.lang.String r3 = "bindPhone"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r2 = "code"
            java.lang.String r3 = r10.f31839a     // Catch:{ JSONException -> 0x0063 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0063 }
            r3 = r3 ^ r7
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r2 = r10.f31840b     // Catch:{ JSONException -> 0x0063 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0063 }
            if (r2 != 0) goto L_0x005e
            java.lang.String r2 = "_raw"
            java.lang.String r3 = r10.f31840b     // Catch:{ JSONException -> 0x0063 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0063 }
        L_0x005e:
            java.lang.String r2 = "args"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0063 }
        L_0x0063:
            com.bytedance.ies.f.a.a r1 = r9.f4320b     // Catch:{ Exception -> 0x006e }
            if (r1 == 0) goto L_0x006e
            com.bytedance.ies.f.a.a r1 = r9.f4320b     // Catch:{ Exception -> 0x006e }
            java.lang.String r2 = "H5_nativeEvent"
            r1.b(r2, r0)     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4319a
            r3 = 0
            r4 = 89935(0x15f4f, float:1.26026E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0092
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4319a
            r3 = 0
            r4 = 89935(0x15f4f, float:1.26026E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0092:
            com.ss.android.ugc.aweme.utils.bg.d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.d.onBindMobileFinishEvent(com.ss.android.ugc.aweme.account.e.a):void");
    }

    public d(a aVar, WeakReference<Context> weakReference) {
        super(weakReference);
        this.f4320b = aVar;
    }

    public void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f4319a, false, 89933, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f4319a, false, 89933, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        String string = hVar2.f20623d.getString("type");
        hVar2.f20622c = "open";
        hVar2.f20623d.put("type", string);
        hVar2.f20625f = false;
        bg.c(this);
        open(hVar2.f20623d);
    }
}
