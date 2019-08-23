package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.profile.a;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61348a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f61349b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61350c;

    /* renamed from: d  reason: collision with root package name */
    private final VerticalViewPager f61351d;

    /* renamed from: e  reason: collision with root package name */
    private final View f61352e;

    /* renamed from: f  reason: collision with root package name */
    private final View f61353f;
    private final a.b g;

    public c(Activity activity, int i, VerticalViewPager verticalViewPager, View view, View view2, a.b bVar) {
        this.f61349b = activity;
        this.f61350c = i;
        this.f61351d = verticalViewPager;
        this.f61352e = view;
        this.f61353f = view2;
        this.g = bVar;
    }

    public final void run() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f61348a, false, 67230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61348a, false, 67230, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.f61349b;
        int i2 = this.f61350c;
        VerticalViewPager verticalViewPager = this.f61351d;
        View view = this.f61352e;
        View view2 = this.f61353f;
        a.b bVar = this.g;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception unused) {
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            boolean z = true;
            boolean z2 = ToolUtils.isMiui() && a.a(activity);
            if (!ToolUtils.isMiui() || Build.VERSION.SDK_INT < 28 || a.a(activity)) {
                z = false;
            }
            if (!z2) {
                i = a.c();
            }
            boolean b2 = a.b(activity);
            int c2 = a.c(activity);
            int c3 = p.c();
            if ((b2 && c2 > 0) || z) {
                i -= c3;
            }
            g gVar = new g(activity, verticalViewPager, view, view2, displayMetrics, b2, i, c3, u.a((double) i2), c2, bVar);
            com.ss.android.b.a.a.a.b(gVar);
        }
    }
}
