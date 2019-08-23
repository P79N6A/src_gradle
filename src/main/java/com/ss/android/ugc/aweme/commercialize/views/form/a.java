package com.ss.android.ugc.aweme.commercialize.views.form;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.b.f;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40099a;

    /* renamed from: b  reason: collision with root package name */
    private final AdFormBrowserFragment f40100b;

    a(AdFormBrowserFragment adFormBrowserFragment) {
        this.f40100b = adFormBrowserFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f40099a, false, 33124, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f40099a, false, 33124, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        FragmentActivity activity = this.f40100b.getActivity();
        if (activity != null) {
            f fVar = new f(z);
            fVar.f38514b = activity.hashCode();
            bg.a(fVar);
        }
    }
}
