package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.du;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class ag implements du.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76688a;

    /* renamed from: b  reason: collision with root package name */
    private final af f76689b;

    /* renamed from: c  reason: collision with root package name */
    private final h f76690c;

    ag(af afVar, h hVar) {
        this.f76689b = afVar;
        this.f76690c = hVar;
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f76688a, false, 90025, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f76688a, false, 90025, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        af afVar = this.f76689b;
        h hVar = this.f76690c;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            try {
                jSONObject.put("code", 0);
            } catch (JSONException unused) {
                return;
            }
        } else {
            jSONObject.put("code", 1);
            jSONObject.put("location", str);
        }
        afVar.f76686b.a(hVar.f20621b, jSONObject);
    }
}
