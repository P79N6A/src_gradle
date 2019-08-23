package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.g;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ea implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10598a;

    /* renamed from: b  reason: collision with root package name */
    private final cy.AnonymousClass2 f10599b;

    ea(cy.AnonymousClass2 r1) {
        this.f10599b = r1;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10598a, false, 4853, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10598a, false, 4853, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy.AnonymousClass2 r3 = this.f10599b;
        Integer num = (Integer) obj;
        if (num.equals(2)) {
            g.a().b();
            cy.this.k();
        } else if (num.equals(1)) {
            ai.a((int) C0906R.string.diy);
        } else {
            ai.a((int) C0906R.string.dix);
        }
    }
}
