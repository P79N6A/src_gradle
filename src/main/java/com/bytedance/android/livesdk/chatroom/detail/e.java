package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.ag;
import com.bytedance.android.livesdk.chatroom.bl.ah;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.model.j;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdkapi.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public final class e implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9926a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHandler f9927b;

    /* renamed from: c  reason: collision with root package name */
    public final Queue<com.bytedance.android.livesdkapi.h.a> f9928c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f9929d = false;

    /* renamed from: e  reason: collision with root package name */
    public j f9930e;

    /* renamed from: f  reason: collision with root package name */
    private final a f9931f;
    private final long g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final c m = new c() {
    };
    private boolean n = false;

    public interface a {
        void a(int i, String str, String str2);

        void a(@NonNull j jVar);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9926a, false, 4060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9926a, false, 4060, new Class[0], Void.TYPE);
            return;
        }
        this.f9929d = false;
        this.n = true;
        this.f9930e = null;
        this.f9927b.removeCallbacksAndMessages(null);
        this.f9928c.clear();
    }

    public final void a() {
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f9926a, false, 4059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9926a, false, 4059, new Class[0], Void.TYPE);
        } else if (!this.f9929d) {
            this.n = false;
            this.f9929d = true;
            h a2 = h.a();
            WeakHandler weakHandler = this.f9927b;
            long j3 = this.g;
            String str = this.h;
            String str2 = this.i;
            String str3 = this.j;
            String str4 = this.l;
            String str5 = str4;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{weakHandler, new Long(j3), str, str2, str3, str4}, a2, h.f9797a, false, 3988, new Class[]{Handler.class, Long.TYPE, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                h hVar = a2;
                PatchProxy.accessDispatch(new Object[]{weakHandler, new Long(j3), str, str2, str6, str5}, hVar, h.f9797a, false, 3988, new Class[]{Handler.class, Long.TYPE, String.class, String.class, String.class, String.class}, Void.TYPE);
            } else {
                HashMap<String, String> hashMap = new o().a("common_label_list", str6).a("enter_source", str5).a("request_id", str).a("enter_type", str2).f17622b;
                if (TTLiveSDKContext.getHostService().k().c()) {
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                ((RoomRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(RoomRetrofitApi.class)).enterRoom(j3, 1, j2, hashMap).compose(i.a()).subscribe(new ag(a2, weakHandler), new ah(weakHandler));
            }
            this.f9928c.clear();
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f9926a, false, 4062, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f9926a, false, 4062, new Class[]{Message.class}, Void.TYPE);
        } else if (message.what == 32 && !this.n) {
            a();
        } else if (message.what == 4 && this.f9929d) {
            if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) message.obj;
                a(aVar.getErrorCode(), aVar.getErrorMsg(), aVar.getPrompt());
            } else if (message.obj instanceof Exception) {
                a(0, message.obj.toString(), null);
            } else if (!(message.obj instanceof j) || ((j) message.obj).f11127a == null || !Room.isValid(((j) message.obj).f11127a)) {
                String str = "invalid room data";
                if (!(message.obj instanceof j)) {
                    str = "response unexpected";
                } else if (((j) message.obj).f11127a == null) {
                    str = "room is null";
                }
                a(0, str, null);
            } else {
                j jVar = (j) message.obj;
                if (PatchProxy.isSupport(new Object[]{jVar}, this, f9926a, false, 4064, new Class[]{j.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jVar}, this, f9926a, false, 4064, new Class[]{j.class}, Void.TYPE);
                    return;
                }
                this.f9930e = jVar;
                this.f9929d = false;
                this.f9931f.a(jVar);
            }
        }
    }

    private void a(int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, str4}, this, f9926a, false, 4063, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3, str4}, this, f9926a, false, 4063, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        this.f9929d = false;
        int i3 = i2;
        this.f9931f.a(i2, str3, str4);
    }

    public e(@NonNull a aVar, long j2, String str, String str2, String str3, String str4, String str5) {
        this.f9931f = aVar;
        this.g = j2;
        this.h = str;
        this.i = str2;
        this.f9927b = new WeakHandler(Looper.getMainLooper(), this);
        this.j = str3;
        this.k = str4;
        this.l = str5;
    }
}
