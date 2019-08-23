package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13483a;

    /* renamed from: b  reason: collision with root package name */
    private final e.AnonymousClass1 f13484b;

    f(e.AnonymousClass1 r1) {
        this.f13484b = r1;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13483a, false, 7831, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13483a, false, 7831, new Class[]{View.class}, Void.TYPE);
            return;
        }
        e.AnonymousClass1 r1 = this.f13484b;
        if (e.this.l != null) {
            e.this.l.c(e.this.k);
        }
    }
}
