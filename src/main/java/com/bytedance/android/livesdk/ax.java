package com.bytedance.android.livesdk;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ax implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9074a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9075b;

    ax(StartLiveFragmentD startLiveFragmentD) {
        this.f9075b = startLiveFragmentD;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f9074a, false, 2847, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f9074a, false, 2847, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f9075b.a(view2);
    }
}
