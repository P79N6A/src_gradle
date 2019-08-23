package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60786a;

    /* renamed from: b  reason: collision with root package name */
    final View f60787b;

    /* renamed from: c  reason: collision with root package name */
    public int f60788c;

    /* renamed from: d  reason: collision with root package name */
    public int f60789d;

    /* renamed from: e  reason: collision with root package name */
    public int f60790e;

    /* renamed from: f  reason: collision with root package name */
    public int f60791f;

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60786a, false, 66592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60786a, false, 66592, new Class[0], Void.TYPE);
            return;
        }
        ViewCompat.offsetTopAndBottom(this.f60787b, this.f60790e - (this.f60787b.getTop() - this.f60788c));
        ViewCompat.offsetLeftAndRight(this.f60787b, this.f60791f - (this.f60787b.getLeft() - this.f60789d));
    }

    public g(View view) {
        this.f60787b = view;
    }

    public final boolean b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60786a, false, 66594, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60786a, false, 66594, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f60791f == i) {
            return false;
        } else {
            this.f60791f = i;
            a();
            return true;
        }
    }

    public final boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60786a, false, 66593, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60786a, false, 66593, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        StringBuilder sb = new StringBuilder("setTopAndBottomOffset...");
        sb.append(i);
        sb.append("/");
        sb.append(this.f60790e);
        if (this.f60790e == i) {
            return false;
        }
        this.f60790e = i;
        a();
        return true;
    }
}
