package com.ss.android.ugc.aweme.main.guide;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.main.bm;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54821a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f54822b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54823c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54824d;

    /* renamed from: e  reason: collision with root package name */
    public View f54825e;

    /* renamed from: f  reason: collision with root package name */
    public AnimationImageView f54826f;
    private bm g;

    public bm a() {
        if (PatchProxy.isSupport(new Object[0], this, f54821a, false, 58082, new Class[0], bm.class)) {
            return (bm) PatchProxy.accessDispatch(new Object[0], this, f54821a, false, 58082, new Class[0], bm.class);
        }
        if (this.g == null) {
            this.g = (bm) c.a(i.a().getContext(), bm.class);
        }
        return this.g;
    }
}
