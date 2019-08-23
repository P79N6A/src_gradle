package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.jsbridge.a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PreloadWebViewWidget extends LiveRecyclableWidget implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12740a;

    /* renamed from: b  reason: collision with root package name */
    private int f12741b;

    /* renamed from: c  reason: collision with root package name */
    private b.e f12742c;

    public void onClear() {
        if (PatchProxy.isSupport(new Object[0], this, f12740a, false, 7385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12740a, false, 7385, new Class[0], Void.TYPE);
            return;
        }
        if (this.f12741b == 0) {
            j.q().f().a(this.f12742c);
        }
    }

    @Nullable
    public final b.e a() {
        if (PatchProxy.isSupport(new Object[0], this, f12740a, false, 7386, new Class[0], b.e.class)) {
            return (b.e) PatchProxy.accessDispatch(new Object[0], this, f12740a, false, 7386, new Class[0], b.e.class);
        } else if (this.f12741b != 0 || this.f12742c.f9317b.getParent() != this.containerView) {
            return null;
        } else {
            if (this.f12742c != null) {
                this.f12741b = this.f12742c.f9317b.hashCode();
                this.containerView.removeView(this.f12742c.f9317b);
            }
            return this.f12742c;
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12740a, false, 7384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12740a, false, 7384, new Class[0], Void.TYPE);
            return;
        }
        j.q().f().b((b.c) this);
        if (this.f12742c != null && this.containerView == this.f12742c.f9317b.getParent()) {
            this.containerView.removeView(this.f12742c.f9317b);
        }
    }

    public void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12740a, false, 7382, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12740a, false, 7382, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        try {
            this.f12742c = j.q().f().a((Activity) this.context, (b.d) null);
            j.q().f().b((a) this.f12742c);
        } catch (Exception unused) {
        }
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12740a, false, 7383, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12740a, false, 7383, new Class[]{Object[].class}, Void.TYPE);
        } else if (this.f12742c != null) {
            String str = (String) LiveConfigSettingKeys.IN_ROOM_PRELOAD_WEB_VIEW_URL.a();
            if (this.f12742c.f9317b.getParent() == null) {
                if (!TextUtils.isEmpty(str)) {
                    j.q().f().a(this.f12742c, str);
                }
                this.containerView.addView(this.f12742c.f9317b);
            }
            j.q().f().a((b.c) this);
        }
    }

    public final boolean a(WebView webView) {
        if (PatchProxy.isSupport(new Object[]{webView}, this, f12740a, false, 7387, new Class[]{WebView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView}, this, f12740a, false, 7387, new Class[]{WebView.class}, Boolean.TYPE)).booleanValue();
        } else if (webView.hashCode() != this.f12741b) {
            return false;
        } else {
            this.f12741b = 0;
            if (this.f12742c != null) {
                this.f12742c.f9317b.setWebChromeClient(this.f12742c.f9319d);
                this.f12742c.f9317b.setWebViewClient(this.f12742c.f9320e);
                this.f12742c.f9317b.setBackgroundColor(Color.parseColor("#ffffff"));
                this.f12742c.f9317b.loadUrl("about:blank");
                this.f12742c.f9317b.clearHistory();
                this.f12742c.f9317b.setRadius(0.0f, 0.0f, 0.0f, 0.0f);
                this.containerView.addView(this.f12742c.f9317b);
            }
            return true;
        }
    }
}
