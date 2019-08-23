package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class an implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62471a;

    /* renamed from: b  reason: collision with root package name */
    private final MusAbsProfileFragment f62472b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62473c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f62474d;

    an(MusAbsProfileFragment musAbsProfileFragment, View view, Context context) {
        this.f62472b = musAbsProfileFragment;
        this.f62473c = view;
        this.f62474d = context;
    }

    public final void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f62471a, false, 68232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62471a, false, 68232, new Class[0], Void.TYPE);
            return;
        }
        MusAbsProfileFragment musAbsProfileFragment = this.f62472b;
        View view = this.f62473c;
        Context context = this.f62474d;
        int measuredHeight = view.getMeasuredHeight();
        if (musAbsProfileFragment.aa != measuredHeight) {
            if (musAbsProfileFragment.k.isShowing()) {
                int i = musAbsProfileFragment.ab;
                if (musAbsProfileFragment.aa > measuredHeight) {
                    i += musAbsProfileFragment.a(context);
                }
                musAbsProfileFragment.k.update(0, i, musAbsProfileFragment.k.getWidth(), musAbsProfileFragment.k.getHeight());
            }
            musAbsProfileFragment.aa = measuredHeight;
        }
    }
}
