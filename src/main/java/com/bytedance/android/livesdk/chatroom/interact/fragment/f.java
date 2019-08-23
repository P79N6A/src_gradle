package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10941a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKSettingFragment f10942b;

    f(InteractPKSettingFragment interactPKSettingFragment) {
        this.f10942b = interactPKSettingFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10941a, false, 4556, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10941a, false, 4556, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10942b.j();
    }
}
