package com.ss.android.ugc.aweme.hotsearch.a;

import android.support.design.widget.AppBarLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a implements AppBarLayout.OnOffsetChangedListener {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f49644c;

    /* renamed from: a  reason: collision with root package name */
    private C0590a f49645a = C0590a.IDLE;

    /* renamed from: com.ss.android.ugc.aweme.hotsearch.a.a$a  reason: collision with other inner class name */
    public enum C0590a {
        EXPANDED,
        COLLAPSED,
        IDLE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public abstract void a(AppBarLayout appBarLayout, int i);

    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (PatchProxy.isSupport(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f49644c, false, 49630, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f49644c, false, 49630, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 0) {
            this.f49645a = C0590a.EXPANDED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            this.f49645a = C0590a.COLLAPSED;
        } else {
            this.f49645a = C0590a.IDLE;
        }
        a(appBarLayout, i);
    }
}
