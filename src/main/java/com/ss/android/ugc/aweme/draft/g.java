package com.ss.android.ugc.aweme.draft;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43480a;

    /* renamed from: b  reason: collision with root package name */
    private final DraftBoxFragment f43481b;

    g(DraftBoxFragment draftBoxFragment) {
        this.f43481b = draftBoxFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43480a, false, 38420, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43480a, false, 38420, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        DraftBoxFragment draftBoxFragment = this.f43481b;
        if (PatchProxy.isSupport(new Object[]{view}, draftBoxFragment, DraftBoxFragment.f43401a, false, 38414, new Class[]{View.class}, Void.TYPE)) {
            DraftBoxFragment draftBoxFragment2 = draftBoxFragment;
            PatchProxy.accessDispatch(new Object[]{view}, draftBoxFragment2, DraftBoxFragment.f43401a, false, 38414, new Class[]{View.class}, Void.TYPE);
            return;
        }
        new a.C0185a(draftBoxFragment.getContext()).b((int) C0906R.string.a4o).b((int) C0906R.string.oy, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a4f, (DialogInterface.OnClickListener) new j(draftBoxFragment)).a().a();
    }
}
