package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ao implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49443a;

    /* renamed from: b  reason: collision with root package name */
    private final SummonFriendsFragment f49444b;

    ao(SummonFriendsFragment summonFriendsFragment) {
        this.f49444b = summonFriendsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49443a, false, 47496, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49443a, false, 47496, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        SummonFriendsFragment summonFriendsFragment = this.f49444b;
        summonFriendsFragment.f49354c.a(Boolean.FALSE, summonFriendsFragment.mEditView.getText().toString(), SummonFriendsFragment.a(summonFriendsFragment.f49357f));
    }
}
