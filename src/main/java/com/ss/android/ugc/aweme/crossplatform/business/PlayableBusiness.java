package com.ss.android.ugc.aweme.crossplatform.business;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.webkit.WebView;
import com.bytedance.ies.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import org.json.JSONException;
import org.json.JSONObject;

public class PlayableBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40750a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40751b;

    /* renamed from: c  reason: collision with root package name */
    private a f40752c;

    @Keep
    public PlayableBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40750a, false, 34275, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f40750a, false, 34275, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.i.f40806b.y == 1 && this.f40752c != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
                this.f40752c.b("endcard_control_event", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(WebView webView, String str, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{webView, str, aVar2}, this, f40750a, false, 34270, new Class[]{WebView.class, String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str, aVar2}, this, f40750a, false, 34270, new Class[]{WebView.class, String.class, a.class}, Void.TYPE);
            return;
        }
        this.f40752c = aVar2;
        a(false, true);
    }
}
