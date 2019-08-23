package com.ss.android.sdk.activity;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.crossplatform.params.b;
import org.json.JSONObject;

@Deprecated
public final class a {

    /* renamed from: a  reason: collision with root package name */
    b f30636a;

    /* renamed from: b  reason: collision with root package name */
    final com.ss.android.ugc.aweme.crossplatform.business.a.a f30637b = new com.ss.android.ugc.aweme.crossplatform.business.a.a();

    /* renamed from: c  reason: collision with root package name */
    private long f30638c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30639d;

    public final void a() {
        this.f30638c = System.currentTimeMillis();
        this.f30639d = false;
        this.f30637b.a();
    }

    public a(b bVar) {
        this.f30636a = bVar;
    }

    static JSONObject a(b bVar) {
        JSONObject jSONObject;
        try {
            if (!TextUtils.isEmpty(bVar.l)) {
                jSONObject = new JSONObject(bVar.l);
            } else {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("log_extra", bVar.j);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final void a(WebView webView, String str) {
        this.f30637b.a(webView, str, this.f30636a.f40800b, a(this.f30636a));
    }

    public final void a(Context context, boolean z) {
        Activity a2 = v.a(context);
        if (a2 != null) {
            JSONObject a3 = a(this.f30636a);
            long currentTimeMillis = System.currentTimeMillis() - this.f30638c;
            this.f30638c = 0;
            if (this.f30636a.f40800b > 0) {
                if (currentTimeMillis > 0 && !this.f30639d) {
                    this.f30637b.a(currentTimeMillis, this.f30636a.f40800b, a3, (JSONObject) null);
                    this.f30639d = true;
                }
                if (a2.isFinishing()) {
                    this.f30637b.a(context, (String) null, this.f30636a.f40800b, a3, (JSONObject) null);
                }
            }
        }
    }
}
