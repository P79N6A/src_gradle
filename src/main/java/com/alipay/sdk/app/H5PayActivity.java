package com.alipay.sdk.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.j.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class H5PayActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private WebView f5411a;

    /* renamed from: b  reason: collision with root package name */
    private WebViewClient f5412b;

    public void finish() {
        a();
        super.finish();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            java.lang.Object r0 = com.alipay.sdk.app.b.f5425a
            monitor-enter(r0)
            r0.notify()     // Catch:{ Exception -> 0x0009 }
            goto L_0x0009
        L_0x0007:
            r1 = move-exception
            goto L_0x000b
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x000b:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.H5PayActivity.a():void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f5411a != null) {
            this.f5411a.removeAllViews();
            try {
                this.f5411a.destroy();
            } catch (Throwable unused) {
            }
            this.f5411a = null;
        }
    }

    public void onBackPressed() {
        if (!this.f5411a.canGoBack()) {
            j.f5444a = j.a();
            finish();
        } else if (((d) this.f5412b).f5432a) {
            k a2 = k.a(k.NETWORK_ERROR.h);
            j.f5444a = j.a(a2.h, a2.i, "");
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            String string = extras.getString(PushConstants.WEB_URL);
            if (!i.a(string)) {
                finish();
                return;
            }
            String string2 = extras.getString("cookie");
            super.requestWindowFeature(1);
            this.f5411a = i.a((Activity) this, string, string2);
            this.f5412b = new d(this);
            this.f5411a.setWebViewClient(this.f5412b);
        } catch (Exception unused) {
            finish();
        }
    }
}
