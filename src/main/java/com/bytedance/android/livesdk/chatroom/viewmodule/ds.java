package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.a.a;
import com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ds implements a.C0078a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13184a;

    /* renamed from: b  reason: collision with root package name */
    private final OBSBarrageWidget.a f13185b;

    ds(OBSBarrageWidget.a aVar) {
        this.f13185b = aVar;
    }

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13184a, false, 7318, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13184a, false, 7318, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = OBSBarrageWidget.this.contentView;
        if (!z) {
            i = 4;
        }
        view.setVisibility(i);
    }
}
