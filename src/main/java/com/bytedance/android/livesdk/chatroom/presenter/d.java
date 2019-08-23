package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.l;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11338a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11339b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public boolean f11340c = false;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11338a, false, 5140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11338a, false, 5140, new Class[0], Void.TYPE);
        } else if (this.f11340c) {
            this.f11340c = false;
            this.f11339b.removeCallbacksAndMessages(null);
        }
    }

    public final boolean a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, this, f11338a, false, 5141, new Class[]{Room.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{room}, this, f11338a, false, 5141, new Class[]{Room.class}, Boolean.TYPE)).booleanValue();
        } else if (room == null || room.getUserCount() >= 3500) {
            return false;
        } else {
            if (TTLiveSDKContext.getHostService().k().c() && room.getOwner().isFollowing()) {
                return false;
            }
            return true;
        }
    }

    public static void a(ay ayVar, Map<String, String> map) {
        ay ayVar2 = ayVar;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{ayVar2, map2}, null, f11338a, true, 5143, new Class[]{ay.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ayVar2, map2}, null, f11338a, true, 5143, new Class[]{ay.class, Map.class}, Void.TYPE);
            return;
        }
        l lVar = new l();
        if (!(ayVar2 == null || ayVar2.f16526b == null)) {
            lVar.f15699a = ayVar2.f16526b.f16531e;
        }
        a.a().a("audience_live_message", map2, lVar, Room.class, new j().a("live_detail").c("comment"));
    }
}
