package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.bc;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cu implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13123a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomNotifyWidget f13124b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13125c;

    /* renamed from: d  reason: collision with root package name */
    private final User f13126d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13127e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13128f;
    private final bc g;

    cu(LiveRoomNotifyWidget liveRoomNotifyWidget, String str, User user, long j, int i, bc bcVar) {
        this.f13124b = liveRoomNotifyWidget;
        this.f13125c = str;
        this.f13126d = user;
        this.f13127e = j;
        this.f13128f = i;
        this.g = bcVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13123a, false, 7227, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13123a, false, 7227, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f13124b;
        String str = this.f13125c;
        User user = this.f13126d;
        long j = this.f13127e;
        int i = this.f13128f;
        bc bcVar = this.g;
        liveRoomNotifyWidget.a(str, user, j, i);
        liveRoomNotifyWidget.a(bcVar, "click");
    }
}
