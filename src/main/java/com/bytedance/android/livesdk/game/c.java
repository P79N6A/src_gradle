package com.bytedance.android.livesdk.game;

import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14667a;

    /* renamed from: b  reason: collision with root package name */
    private final SelectGameDialogFragment f14668b;

    c(SelectGameDialogFragment selectGameDialogFragment) {
        this.f14668b = selectGameDialogFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14667a, false, 9190, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14667a, false, 9190, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        SelectGameDialogFragment selectGameDialogFragment = this.f14668b;
        l.a(selectGameDialogFragment.getContext(), (Throwable) obj);
        a.a(selectGameDialogFragment.getContext(), (int) C0906R.string.ctq);
    }
}
