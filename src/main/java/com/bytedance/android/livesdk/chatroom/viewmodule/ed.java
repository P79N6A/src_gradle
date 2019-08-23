package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ed implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13207a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioWidget f13208b;

    ed(RadioWidget radioWidget) {
        this.f13208b = radioWidget;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13207a, false, 7439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13207a, false, 7439, new Class[0], Void.TYPE);
        }
    }

    public final void a(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, this, f13207a, false, 7438, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str2}, this, f13207a, false, 7438, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        RadioWidget radioWidget = this.f13208b;
        radioWidget.f12779e.b();
        radioWidget.f12778d.a(str3);
        a.a().a("background_pic_confirm", new j().a("live_take_detail").b("live_take"), Room.class);
    }
}
