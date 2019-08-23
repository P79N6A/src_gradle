package com.ss.android.ugc.aweme.share.c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class k extends g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64909a;

    /* renamed from: b  reason: collision with root package name */
    protected String f64910b;

    /* renamed from: c  reason: collision with root package name */
    public String f64911c;
    protected String h;
    protected String i;
    protected String j;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64909a, false, 73774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64909a, false, 73774, new Class[0], Void.TYPE);
            return;
        }
        a.b((Context) this.f64888e, "H5分享暂时只支持SDK分享").a();
    }

    public k(Activity activity, String str, String str2, String str3, String str4, String str5, String str6) {
        super(activity, str);
        this.f64910b = str2;
        this.f64911c = str3;
        this.i = str5;
        this.h = str4;
        this.j = str6;
    }
}
