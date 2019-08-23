package com.ss.android.ugc.aweme.share.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.d;

public class g {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f64887d;

    /* renamed from: e  reason: collision with root package name */
    protected Activity f64888e;

    /* renamed from: f  reason: collision with root package name */
    protected String f64889f;
    protected int g;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64887d, false, 73754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64887d, false, 73754, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f64887d, false, 73755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64887d, false, 73755, new Class[0], Void.TYPE);
        } else if (ToolUtils.isInstalledApp((Context) this.f64888e, this.f64889f)) {
            ToolUtils.openInstalledApp(this.f64888e, this.f64889f);
        } else if (TextUtils.equals(this.f64889f, "com.tencent.mm")) {
            a.c((Context) this.f64888e, this.f64888e.getResources().getString(C0906R.string.c6b)).a();
        } else if (TextUtils.equals(this.f64889f, "com.tencent.mobileqq")) {
            a.c((Context) this.f64888e, this.f64888e.getResources().getString(C0906R.string.c6a)).a();
        } else {
            a.c((Context) this.f64888e, this.f64888e.getResources().getString(C0906R.string.c68)).a();
        }
    }

    public final void a(int i) {
        if (i >= 0 && i <= 2) {
            this.g = i;
        }
    }

    public static String b(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f64887d, true, 73756, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f64887d, true, 73756, new Class[]{Integer.TYPE}, String.class);
        } else if (i2 == 0) {
            return d.a().getResources().getString(C0906R.string.dti);
        } else {
            if (i2 == 2) {
                return d.a().getResources().getString(C0906R.string.dtk);
            }
            if (i2 == 1) {
                return d.a().getResources().getString(C0906R.string.bu7);
            }
            if (i2 == 3) {
                return d.a().getResources().getString(C0906R.string.buy);
            }
            return "";
        }
    }

    public g(Activity activity, String str) {
        this.f64888e = activity;
        this.f64889f = str;
    }
}
