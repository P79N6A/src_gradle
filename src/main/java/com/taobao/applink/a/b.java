package com.taobao.applink.a;

import android.content.Context;
import com.taobao.applink.auth.TBAppLinkAuthListener;
import com.taobao.applink.auth.a;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public TBAppLinkAuthListener f79143a;

    /* renamed from: b  reason: collision with root package name */
    public String f79144b;

    public b(TBAppLinkAuthListener tBAppLinkAuthListener, String str) {
        this.f79143a = tBAppLinkAuthListener;
        this.f79144b = str;
    }

    public void a() {
        if (this.f79143a != null) {
            new a(this.f79143a).a(this.f79144b);
        }
    }

    public void a(Context context) {
        if (this.f79143a == null) {
        }
    }

    public void a(Context context, com.taobao.applink.f.a.b bVar) {
        if (context != null && bVar != null) {
            c cVar = new c(this, bVar);
            this.f79147c = bVar;
            this.f79143a = cVar;
        }
    }

    public void a(Exception exc) {
    }
}
