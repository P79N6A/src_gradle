package com.ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36048a;

    /* renamed from: b  reason: collision with root package name */
    private final ChooseMusicFragmentView f36049b;

    public c(ChooseMusicFragmentView chooseMusicFragmentView) {
        this.f36049b = chooseMusicFragmentView;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36048a, false, 26843, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36048a, false, 26843, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f36049b.mSearchEditView.setText("");
    }
}
