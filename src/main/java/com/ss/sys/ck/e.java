package com.ss.sys.ck;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;
import com.ss.sys.ck.b;

public final class e extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    protected SCWebView f78578a;

    /* renamed from: b  reason: collision with root package name */
    b.a f78579b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f78580c;

    /* renamed from: d  reason: collision with root package name */
    private int f78581d;

    /* renamed from: e  reason: collision with root package name */
    private int f78582e;

    /* renamed from: f  reason: collision with root package name */
    private String f78583f;
    private boolean g;
    private String h;

    public e(Activity activity, View view, String str, String str2) {
        super(activity, C0906R.style.fl);
        setContentView(view);
        this.f78580c = activity;
        this.f78583f = str;
        this.h = str2;
        setCancelable(true);
    }

    public final void hide() {
        this.g = false;
        super.hide();
    }

    public final void show() {
        super.show();
        this.g = true;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisplayMetrics displayMetrics = this.f78580c.getResources().getDisplayMetrics();
        this.f78581d = displayMetrics.heightPixels;
        this.f78582e = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        if (this.f78581d < this.f78582e) {
            this.f78582e = (this.f78581d * 3) / 4;
        }
        this.f78582e = (this.f78582e * 4) / 5;
        this.f78581d = (int) (((float) this.f78582e) * this.f78579b.f78572b);
        if (((int) ((((float) this.f78582e) / f2) + 0.5f)) < this.f78579b.f78573c) {
            this.f78582e = (int) (((float) this.f78579b.f78573c) * f2);
            this.f78581d = (int) (displayMetrics.density * ((float) this.f78579b.f78573c) * this.f78579b.f78572b);
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = this.f78582e;
        attributes.height = this.f78581d;
        if (b.f78567c >= 0.0f) {
            attributes.dimAmount = b.f78567c;
        }
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f78578a = (SCWebView) findViewById(C0906R.id.cm_);
        this.f78578a.a();
        SCWebView sCWebView = this.f78578a;
        String str = this.f78583f;
        String str2 = this.h;
        CookieSyncManager.createInstance(sCWebView.f78522a);
        CookieManager instance = CookieManager.getInstance();
        instance.setCookie(str, "sec_sessionid=" + str2);
        CookieSyncManager.getInstance().sync();
        this.f78578a.loadUrl(this.f78583f);
        this.f78578a.buildLayer();
    }

    public final void dismiss() {
        this.g = false;
        if (this.f78578a != null) {
            ViewParent parent = this.f78578a.getParent();
            if (parent != null) {
                SCWebView sCWebView = this.f78578a;
                sCWebView.loadUrl("javascript:prompt('" + b.f78565a + "',points.getLogToString())");
                ((ViewGroup) parent).removeView(this.f78578a);
            }
            this.f78578a.removeAllViews();
        }
        if (this.f78580c != null && !this.f78580c.isFinishing()) {
            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                super.dismiss();
            } else {
                throw new IllegalStateException("debug check! this method should be called from main thread!");
            }
        }
        this.f78580c = null;
    }
}
