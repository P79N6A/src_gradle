package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class ac implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12963a;

    /* renamed from: b  reason: collision with root package name */
    private final FullVideoButtonWidget f12964b;

    ac(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f12964b = fullVideoButtonWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12963a, false, 6818, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12963a, false, 6818, new Class[]{View.class}, Void.TYPE);
            return;
        }
        FullVideoButtonWidget fullVideoButtonWidget = this.f12964b;
        a.a().a((Object) new com.bytedance.android.livesdkapi.f.a(2));
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(fullVideoButtonWidget.f12515b));
        hashMap.put("type", "portrait_to_landscape");
        com.bytedance.android.livesdk.j.a.a().a("screen_rotate", hashMap, new j().f("click").b("live").a("live_detail"));
    }
}
