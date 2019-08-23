package com.ali.auth.third.ui.context;

import android.app.Activity;
import android.webkit.WebView;
import com.ali.auth.third.core.context.KernelContext;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public WebView f5053a;

    /* renamed from: b  reason: collision with root package name */
    public int f5054b;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
            c.a(str);
            webView.loadUrl(str);
        }
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        if (this.f5053a != null) {
            _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.f5053a, str);
        }
    }

    /* access modifiers changed from: private */
    public static String e(String str) {
        return str.replace("\\", "\\\\");
    }

    public Activity a() {
        return (Activity) this.f5053a.getContext();
    }

    public void a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            b(jSONObject.toString());
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void a(String str) {
        KernelContext.executorService.postUITask(new b(this, str));
    }

    public void b(String str) {
        KernelContext.executorService.postUITask(new c(this, str));
    }
}
