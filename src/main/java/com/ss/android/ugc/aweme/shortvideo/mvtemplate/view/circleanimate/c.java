package com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.circleanimate;

import android.graphics.drawable.GradientDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68751a;

    /* renamed from: b  reason: collision with root package name */
    public int f68752b;

    /* renamed from: c  reason: collision with root package name */
    public int f68753c;

    /* renamed from: d  reason: collision with root package name */
    public GradientDrawable f68754d;

    public c(GradientDrawable gradientDrawable) {
        this.f68754d = gradientDrawable;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f68751a, false, 78122, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f68751a, false, 78122, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f68752b = 0;
        this.f68754d.setStroke(0, this.f68753c);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68751a, false, 78123, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68751a, false, 78123, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f68753c = i;
        this.f68754d.setStroke(this.f68752b, i);
    }
}
