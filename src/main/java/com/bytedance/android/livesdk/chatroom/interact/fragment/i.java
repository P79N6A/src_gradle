package com.bytedance.android.livesdk.chatroom.interact.fragment;

import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.popup.d;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10947a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKTypeFragment f10948b;

    i(InteractPKTypeFragment interactPKTypeFragment) {
        this.f10948b = interactPKTypeFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10947a, false, 4576, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10947a, false, 4576, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InteractPKTypeFragment interactPKTypeFragment = this.f10948b;
        b.m.a(Boolean.FALSE);
        ((d) ((d) ((d) ((d) d.a(interactPKTypeFragment.getContext()).a((int) C0906R.layout.anz)).b(ac.a(38.0f))).b(true)).b()).a(interactPKTypeFragment.k, 1, 4, ac.a(16.0f), ac.a(-4.0f));
    }
}
