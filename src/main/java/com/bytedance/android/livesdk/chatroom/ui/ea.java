package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.livesdk.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class ea implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12128a;

    /* renamed from: b  reason: collision with root package name */
    private final dy f12129b;

    ea(dy dyVar) {
        this.f12129b = dyVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12128a, false, 6262, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12128a, false, 6262, new Class[]{View.class}, Void.TYPE);
            return;
        }
        dy dyVar = this.f12129b;
        new m.a(dyVar.getContext(), 1).a((CharSequence) dyVar.f12121d.f11175b).c((CharSequence) dyVar.f12121d.f11176c.f11180b).b(2, (int) C0906R.string.cqy, ee.f12138b).c();
    }
}
