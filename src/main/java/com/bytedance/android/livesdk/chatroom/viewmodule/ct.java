package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.bc;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ct implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13117a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomNotifyWidget f13118b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13119c;

    /* renamed from: d  reason: collision with root package name */
    private final User f13120d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13121e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13122f;
    private final bc g;

    ct(LiveRoomNotifyWidget liveRoomNotifyWidget, String str, User user, long j, int i, bc bcVar) {
        this.f13118b = liveRoomNotifyWidget;
        this.f13119c = str;
        this.f13120d = user;
        this.f13121e = j;
        this.f13122f = i;
        this.g = bcVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13117a, false, 7226, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13117a, false, 7226, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f13118b;
        String str = this.f13119c;
        User user = this.f13120d;
        long j = this.f13121e;
        int i = this.f13122f;
        bc bcVar = this.g;
        liveRoomNotifyWidget.a(str, user, j, i);
        liveRoomNotifyWidget.a(bcVar, "click");
    }
}
