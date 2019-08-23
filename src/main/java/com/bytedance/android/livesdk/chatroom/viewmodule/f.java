package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.webkit.WebView;
import com.bytedance.android.live.core.utils.s;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class f implements b.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13260a;

    /* renamed from: b  reason: collision with root package name */
    private final BottomRightBannerWidget f13261b;

    f(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f13261b = bottomRightBannerWidget;
    }

    public final void a(WebView webView, String str) {
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{webView2, str}, this, f13260a, false, 6585, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, str}, this, f13260a, false, 6585, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        BottomRightBannerWidget bottomRightBannerWidget = this.f13261b;
        if (PatchProxy.isSupport(new Object[]{webView2}, bottomRightBannerWidget, BottomRightBannerWidget.f12363a, false, 6581, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2}, bottomRightBannerWidget, BottomRightBannerWidget.f12363a, false, 6581, new Class[]{WebView.class}, Void.TYPE);
        } else if (bottomRightBannerWidget.isViewValid() && webView2 != null) {
            webView2.setVisibility(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", s.a(bottomRightBannerWidget.g.f11114a.f11118b));
                jSONObject.put("type", "init");
                bottomRightBannerWidget.f12368f.a(bottomRightBannerWidget.f12365c, "H5_roomStatusChange", jSONObject);
                HashMap hashMap = new HashMap();
                for (e eVar : bottomRightBannerWidget.g.f11114a.f11118b) {
                    hashMap.put("banner_id", String.valueOf(eVar.f11108a));
                    hashMap.put("request_page", "bottomright");
                    a a2 = a.a();
                    Object[] objArr = new Object[2];
                    objArr[0] = new j().a(bottomRightBannerWidget.f12367e ? "live_take_detail" : "live_detail");
                    objArr[1] = Room.class;
                    a2.a("livesdk_live_banner_show", hashMap, objArr);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
