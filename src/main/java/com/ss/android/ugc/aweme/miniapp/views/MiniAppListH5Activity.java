package com.ss.android.ugc.aweme.miniapp.views;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.lancet.c;
import com.ss.android.ugc.aweme.miniapp.l.k;
import com.ss.android.ugc.aweme.miniapp_api.model.b;

public class MiniAppListH5Activity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55939a;

    /* renamed from: b  reason: collision with root package name */
    private WebView f55940b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f55939a, false, 59624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55939a, false, 59624, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MiniAppListH5Activity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MiniAppListH5Activity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f55939a, false, 59625, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f55939a, false, 59625, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MiniAppListH5Activity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55939a, false, 59622, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55939a, false, 59622, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MiniAppListH5Activity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cj);
        this.f55940b = (WebView) findViewById(C0906R.id.dx6);
        this.f55940b.setWebViewClient(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55941a;

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{webView, str2}, this, f55941a, false, 59626, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str2}, this, f55941a, false, 59626, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
                }
                if (k.a((Context) MiniAppListH5Activity.this, str2, new b.a().b("local_test_list").a()) || super.shouldOverrideUrlLoading(webView, str)) {
                    return true;
                }
                return false;
            }
        });
        WebView webView = this.f55940b;
        if (PatchProxy.isSupport(new Object[]{webView, "http://developer.toutiao.com/allapplist?channel=local_test&device_id=40413922381"}, null, c.f55965a, true, 59627, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, "http://developer.toutiao.com/allapplist?channel=local_test&device_id=40413922381"}, null, c.f55965a, true, 59627, new Class[]{WebView.class, String.class}, Void.TYPE);
        } else {
            c.a("http://developer.toutiao.com/allapplist?channel=local_test&device_id=40413922381");
            webView.loadUrl("http://developer.toutiao.com/allapplist?channel=local_test&device_id=40413922381");
        }
        this.f55940b.getSettings().setJavaScriptEnabled(true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MiniAppListH5Activity", "onCreate", false);
    }
}
