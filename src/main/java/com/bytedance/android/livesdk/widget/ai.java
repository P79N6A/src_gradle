package com.bytedance.android.livesdk.widget;

import android.content.Context;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.commerce.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ai implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18430a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18431b;

    ai(aa aaVar) {
        this.f18431b = aaVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18430a, false, 14696, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18430a, false, 14696, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        aa aaVar = this.f18431b;
        if (((Boolean) obj).booleanValue()) {
            BaseDialogFragment a2 = c.a(aaVar.j.getActivity(), null);
            a2.getLifecycle().addObserver(new StartLiveSetController$5(aaVar, a2));
            a2.show(aaVar.j.getFragmentManager(), "LIVE_SHOP_EDIT");
            return;
        }
        a.a((Context) aaVar.j.getActivity(), (int) C0906R.string.dcd);
    }
}
