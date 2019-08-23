package com.ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.e.a;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40113a;

    /* renamed from: b  reason: collision with root package name */
    private final AvatarBackgroundImageView f40114b;

    public k(AvatarBackgroundImageView avatarBackgroundImageView) {
        this.f40114b = avatarBackgroundImageView;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40113a, false, 32789, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40113a, false, 32789, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a aVar = this.f40114b.f39879b;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f38676a, false, 31926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f38676a, false, 31926, new Class[0], Void.TYPE);
            return;
        }
        if (aVar.f38677b != null) {
            aVar.f38677b.a();
        }
    }
}
