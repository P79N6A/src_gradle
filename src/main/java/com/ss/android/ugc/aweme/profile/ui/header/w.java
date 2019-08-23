package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.widget.SetNicknameDialog;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62935a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsMyCommonHeaderLayout f62936b;

    w(AbsMyCommonHeaderLayout absMyCommonHeaderLayout) {
        this.f62936b = absMyCommonHeaderLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62935a, false, 69480, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62935a, false, 69480, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        new SetNicknameDialog(this.f62936b.getContext()).show();
    }
}
