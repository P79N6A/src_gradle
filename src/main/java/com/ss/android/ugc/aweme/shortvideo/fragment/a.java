package com.ss.android.ugc.aweme.shortvideo.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67800a;

    /* renamed from: b  reason: collision with root package name */
    private final OnlineMusicFragment f67801b;

    a(OnlineMusicFragment onlineMusicFragment) {
        this.f67801b = onlineMusicFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67800a, false, 77341, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67800a, false, 77341, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        OnlineMusicFragment onlineMusicFragment = this.f67801b;
        onlineMusicFragment.a(onlineMusicFragment.mSearchEditView.getText().toString());
    }
}
