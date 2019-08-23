package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class ez implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13257a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoWidget2.AnonymousClass3 f13258b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13259c;

    ez(VideoWidget2.AnonymousClass3 r1, String str) {
        this.f13258b = r1;
        this.f13259c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13257a, false, 7622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13257a, false, 7622, new Class[0], Void.TYPE);
            return;
        }
        VideoWidget2.AnonymousClass3 r1 = this.f13258b;
        String str = this.f13259c;
        if (VideoWidget2.this.v != null) {
            VideoWidget2.this.v.add(str);
        }
        VideoWidget2.this.z = true;
        HashMap hashMap = new HashMap();
        hashMap.put("beauty_type", str);
        a.a().a("livesdk_live_take_beauty_effective_use", hashMap, new j().a("live_take_detail"), Room.class);
    }
}
