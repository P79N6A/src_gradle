package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33520a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeLockOptionsFragment f33521b;

    c(TimeLockOptionsFragment timeLockOptionsFragment) {
        this.f33521b = timeLockOptionsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33520a, false, 21980, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33520a, false, 21980, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TimeLockOptionsFragment timeLockOptionsFragment = this.f33521b;
        new a.C0185a(timeLockOptionsFragment.getContext()).b((int) C0906R.string.a5p).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a5o, (DialogInterface.OnClickListener) new g(timeLockOptionsFragment)).a().a();
    }
}
