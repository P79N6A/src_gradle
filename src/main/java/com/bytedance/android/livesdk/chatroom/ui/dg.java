package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.base.model.b;
import com.bytedance.android.livesdk.chatroom.ui.FansClubMedalAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dg implements FansClubMedalAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12073a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileSettingDialog f12074b;

    dg(LiveProfileSettingDialog liveProfileSettingDialog) {
        this.f12074b = liveProfileSettingDialog;
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f12073a, false, 6197, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f12073a, false, 6197, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f12074b.h = bVar2;
    }
}
