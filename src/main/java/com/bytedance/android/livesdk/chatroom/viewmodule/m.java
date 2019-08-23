package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdkapi.host.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13281a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentWidget f13282b;

    m(CommentWidget commentWidget) {
        this.f13282b = commentWidget;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13281a, false, 6640, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13281a, false, 6640, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        CommentWidget commentWidget = this.f13282b;
        if (commentWidget.isViewValid() && z) {
            commentWidget.c();
        }
    }
}
