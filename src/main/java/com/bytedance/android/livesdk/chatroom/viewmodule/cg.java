package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cg implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13073a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f13074b = new cg();

    private cg() {
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13073a, false, 7154, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13073a, false, 7154, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        ((TextView) view).setText(ah.a((long) ((Integer) obj).intValue()));
    }
}
