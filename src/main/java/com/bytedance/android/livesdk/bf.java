package com.bytedance.android.livesdk;

import android.webkit.WebView;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class bf implements b.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9136a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9137b;

    bf(StartLiveFragmentD startLiveFragmentD) {
        this.f9137b = startLiveFragmentD;
    }

    public final void a(WebView webView, String str) {
        WebView webView2 = webView;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{webView2, str}, this, f9136a, false, 2854, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, str}, this, f9136a, false, 2854, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentD startLiveFragmentD = this.f9137b;
        if (PatchProxy.isSupport(new Object[]{webView2}, startLiveFragmentD, StartLiveFragmentD.u, false, 2845, new Class[]{WebView.class}, Void.TYPE)) {
            StartLiveFragmentD startLiveFragmentD2 = startLiveFragmentD;
            PatchProxy.accessDispatch(new Object[]{webView2}, startLiveFragmentD2, StartLiveFragmentD.u, false, 2845, new Class[]{WebView.class}, Void.TYPE);
            return;
        }
        if (webView2 != null) {
            if (startLiveFragmentD.y == null || !startLiveFragmentD.y.f()) {
                z = false;
            }
            if (!z) {
                webView2.setVisibility(0);
            }
            if (startLiveFragmentD.C == null || StringUtils.isEmpty(startLiveFragmentD.C.f11117a) || t.a(startLiveFragmentD.C.f11118b)) {
                webView2.setVisibility(8);
            } else if (startLiveFragmentD.D != null && startLiveFragmentD.D.f9317b == webView2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", j.q().c().toJson((Object) startLiveFragmentD.C.f11118b));
                    jSONObject.put("type", "init");
                    j.q().f().a(startLiveFragmentD.D, "H5_roomStatusChange", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }
}
