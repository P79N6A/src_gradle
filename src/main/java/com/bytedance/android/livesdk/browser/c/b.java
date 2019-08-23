package com.bytedance.android.livesdk.browser.c;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.app.DialogFragment;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import org.json.JSONObject;

public interface b {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9304a;

        /* renamed from: b  reason: collision with root package name */
        public String f9305b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9306c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9307d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9308e;

        /* renamed from: f  reason: collision with root package name */
        public String f9309f;
        public String g;

        public final a a(String str) {
            this.f9305b = str;
            return this;
        }

        public final a b(String str) {
            this.f9309f = str;
            return this;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }

        private a(String str) {
            this.f9304a = str;
        }

        public final a a(boolean z) {
            this.f9306c = z;
            return this;
        }

        public final a b(boolean z) {
            this.f9307d = z;
            return this;
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$b  reason: collision with other inner class name */
    public static class C0073b {

        /* renamed from: a  reason: collision with root package name */
        public String f9310a;

        /* renamed from: b  reason: collision with root package name */
        public int f9311b;

        /* renamed from: c  reason: collision with root package name */
        public int f9312c;

        /* renamed from: d  reason: collision with root package name */
        public int f9313d;

        /* renamed from: e  reason: collision with root package name */
        public int f9314e;

        /* renamed from: f  reason: collision with root package name */
        public int f9315f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public String l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public com.bytedance.android.live.b.b r;
        public String s;

        public final C0073b a(int i2) {
            this.f9311b = i2;
            return this;
        }

        public final C0073b b(int i2) {
            this.f9312c = i2;
            return this;
        }

        public final C0073b c(int i2) {
            this.f9313d = i2;
            return this;
        }

        public final C0073b e(int i2) {
            this.j = i2;
            return this;
        }

        public final C0073b a(com.bytedance.android.live.b.b bVar) {
            this.r = bVar;
            return this;
        }

        public final C0073b b(String str) {
            this.s = str;
            return this;
        }

        public final C0073b c(boolean z) {
            this.q = false;
            return this;
        }

        public final C0073b b(boolean z) {
            this.o = z;
            return this;
        }

        public final C0073b d(int i2) {
            this.m = false;
            this.f9314e = i2;
            this.f9315f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            return this;
        }

        private C0073b(String str) {
            this.k = -1;
            this.l = "";
            this.q = true;
            this.s = "";
            this.f9310a = str;
        }

        public final C0073b a(String str) {
            this.l = str;
            return this;
        }

        public final C0073b a(boolean z) {
            this.n = z;
            return this;
        }

        /* synthetic */ C0073b(String str, byte b2) {
            this(str);
        }

        public final C0073b a(int i2, int i3, int i4, int i5) {
            this.m = true;
            this.f9315f = i2;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            return this;
        }
    }

    public interface c {
        @Nullable
        e a();

        boolean a(WebView webView);
    }

    public interface d {
        void a(WebView webView, String str);
    }

    public static class e implements com.bytedance.android.livesdk.browser.jsbridge.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9316a;
        @IgnoreStyleCheck

        /* renamed from: b  reason: collision with root package name */
        public RoundRectWebView f9317b;
        @IgnoreStyleCheck

        /* renamed from: c  reason: collision with root package name */
        public a f9318c;
        @IgnoreStyleCheck

        /* renamed from: d  reason: collision with root package name */
        public WebChromeClient f9319d;
        @IgnoreStyleCheck

        /* renamed from: e  reason: collision with root package name */
        public WebViewClient f9320e;

        /* renamed from: f  reason: collision with root package name */
        public List<com.bytedance.android.livesdk.browser.e.c> f9321f;

        public final void a(String str, JSONObject jSONObject) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f9316a, false, 3430, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f9316a, false, 3430, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                return;
            }
            this.f9318c.a().a(str2, jSONObject2);
        }

        public e(RoundRectWebView roundRectWebView, a aVar, WebChromeClient webChromeClient, WebViewClient webViewClient, List<com.bytedance.android.livesdk.browser.e.c> list) {
            this.f9317b = roundRectWebView;
            this.f9318c = aVar;
            this.f9319d = webChromeClient;
            this.f9320e = webViewClient;
            this.f9321f = list;
        }
    }

    WebView a(Context context);

    @UiThread
    @Deprecated
    BaseDialogFragment a(Context context, String str, String str2);

    @UiThread
    BaseDialogFragment a(C0073b bVar);

    @UiThread
    e a(Activity activity, d dVar);

    void a(Context context, a aVar);

    void a(DialogFragment dialogFragment);

    void a(WebView webView);

    void a(c cVar);

    @UiThread
    void a(e eVar);

    @UiThread
    void a(e eVar, String str);

    @UiThread
    void a(e eVar, String str, JSONObject jSONObject);

    @UiThread
    void a(com.bytedance.android.livesdk.browser.jsbridge.a aVar);

    @UiThread
    void a(String str, JSONObject jSONObject);

    boolean a();

    boolean a(WebView webView, String str);

    void b();

    void b(DialogFragment dialogFragment);

    void b(c cVar);

    @UiThread
    void b(com.bytedance.android.livesdk.browser.jsbridge.a aVar);
}
