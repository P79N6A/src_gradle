package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.livesdk.chatroom.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements a.C0081a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13472a;

    /* renamed from: b  reason: collision with root package name */
    private final DebugInfoView f13473b;

    d(DebugInfoView debugInfoView) {
        this.f13473b = debugInfoView;
    }

    public final void a(com.bytedance.android.livesdkapi.depend.f.a aVar, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aVar, new Long(j2)}, this, f13472a, false, 7813, new Class[]{com.bytedance.android.livesdkapi.depend.f.a.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, new Long(j2)}, this, f13472a, false, 7813, new Class[]{com.bytedance.android.livesdkapi.depend.f.a.class, Long.TYPE}, Void.TYPE);
            return;
        }
        DebugInfoView debugInfoView = this.f13473b;
        switch (aVar) {
            case GIFT:
                debugInfoView.f13370b.setText(String.valueOf(j));
                return;
            case DIGG:
                debugInfoView.f13372d.setText(String.valueOf(j));
                return;
            case CHAT:
                debugInfoView.f13371c.setText(String.valueOf(j));
                return;
            case MEMBER:
                debugInfoView.f13373e.setText(String.valueOf(j));
                break;
        }
    }
}
