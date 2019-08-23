package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Intent;
import com.bytedance.android.livesdk.chatroom.viewmodule.co;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ek implements co.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12162a;

    /* renamed from: b  reason: collision with root package name */
    private final PortraitInteractionFragment f12163b;

    ek(PortraitInteractionFragment portraitInteractionFragment) {
        this.f12163b = portraitInteractionFragment;
    }

    public final void a(Intent intent, int i) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, 42342}, this, f12162a, false, 6326, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, 42342}, this, f12162a, false, 6326, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f12163b.startActivityForResult(intent2, 42342);
    }
}
