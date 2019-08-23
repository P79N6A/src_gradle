package com.ss.android.ugc.aweme.profile.ui;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.an;

public final /* synthetic */ class j implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62946a;

    /* renamed from: b  reason: collision with root package name */
    private final BindAccountView f62947b;

    j(BindAccountView bindAccountView) {
        this.f62947b = bindAccountView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f62946a, false, 67901, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f62946a, false, 67901, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        BindAccountView bindAccountView = this.f62947b;
        switch (motionEvent.getAction()) {
            case 0:
                an.a(bindAccountView.f61751b, 1.0f, 0.5f, 150);
                break;
            case 1:
                break;
        }
        an.a(bindAccountView.f61751b, 0.5f, 1.0f, 150);
        if (bindAccountView.f61752c != null) {
            bindAccountView.f61752c.a();
        }
        return false;
    }
}
