package com.bytedance.android.livesdk.chatroom.bl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.bytedance.ies.d.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.concurrent.Callable;

@SuppressLint({"ignoreSubscription"})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9797a;

    /* renamed from: c  reason: collision with root package name */
    private static h f9798c = new h();

    /* renamed from: b  reason: collision with root package name */
    public boolean f9799b = TTLiveSDKContext.getHostService().k().c();

    public static h a() {
        return f9798c;
    }

    public final void a(Handler handler, String str, String str2, a aVar, int i, long j, boolean z, int i2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{handler, str, str2, aVar, Integer.valueOf(i), new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), 1}, this, f9797a, false, 3985, new Class[]{Handler.class, String.class, String.class, a.class, Integer.TYPE, Long.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler, str, str2, aVar, Integer.valueOf(i), new Long(j2), Byte.valueOf(z), 1}, this, f9797a, false, 3985, new Class[]{Handler.class, String.class, String.class, a.class, Integer.TYPE, Long.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(handler, str, str2, aVar, i, j, z, 1, 0);
    }

    public final void a(Handler handler, String str, String str2, long j, String str3, @Nullable String str4) {
        Handler handler2 = handler;
        String str5 = str;
        String str6 = str2;
        long j2 = j;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{handler2, str5, str6, new Long(j2), str7, str8}, this, f9797a, false, 3987, new Class[]{Handler.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str5, str6, new Long(j2), str7, str8}, this, f9797a, false, 3987, new Class[]{Handler.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).sendTextMessage(new o().a("room_id", String.valueOf(j)).a(PushConstants.CONTENT, str7).a("common_label_list", str8).a("request_id", str5).a("enter_source", str6).f17622b).compose(i.a()).subscribe(new ae(handler2), new af(handler2));
    }

    public final void a(Handler handler, long j, long j2, boolean z, int i) {
        Handler handler2 = handler;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{handler2, new Long(j3), new Long(j4), Byte.valueOf(z ? (byte) 1 : 0), 7}, this, f9797a, false, 3992, new Class[]{Handler.class, Long.TYPE, Long.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, new Long(j3), new Long(j4), Byte.valueOf(z), 7}, this, f9797a, false, 3992, new Class[]{Handler.class, Long.TYPE, Long.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).sendPlayingPing(j3, z ? 1 : 0).compose(i.a()).subscribe(new ai(handler2, 7), new aj(handler2, 7));
    }

    public final void a(Handler handler, boolean z, long j, int i, int i2) {
        Handler handler2 = handler;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{handler2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f9797a, false, 3995, new Class[]{Handler.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, Byte.valueOf(z), new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f9797a, false, 3995, new Class[]{Handler.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b a2 = b.a();
        final boolean z2 = z;
        final long j3 = j;
        final int i3 = i;
        AnonymousClass1 r1 = new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9800a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f9800a, false, 4040, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f9800a, false, 4040, new Class[0], Object.class);
                }
                boolean z = z2;
                long j = j3;
                int i = i3;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j), Integer.valueOf(i)}, null, g.f9796a, true, 3978, new Class[]{Boolean.TYPE, Long.TYPE, Integer.TYPE}, Room.class)) {
                    return (Room) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j), Integer.valueOf(i)}, null, g.f9796a, true, 3978, new Class[]{Boolean.TYPE, Long.TYPE, Integer.TYPE}, Room.class);
                }
                d dVar = (d) ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getRoomStats(z, j, i).execute().body();
                if (dVar.f7872c != null) {
                    ((Room) dVar.f7871b).nowTime = dVar.f7872c.now / 1000;
                }
                return (Room) dVar.f7871b;
            }
        };
        a2.a(handler2, r1, i2);
    }

    public final void a(Handler handler, long j, long j2, int i, int i2) {
        Handler handler2 = handler;
        long j3 = j;
        long j4 = j2;
        int i3 = i;
        int i4 = 1;
        if (PatchProxy.isSupport(new Object[]{handler2, new Long(j3), new Long(j4), Integer.valueOf(i), Integer.valueOf(i2)}, this, f9797a, false, 4001, new Class[]{Handler.class, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, new Long(j3), new Long(j4), Integer.valueOf(i), Integer.valueOf(i2)}, this, f9797a, false, 4001, new Class[]{Handler.class, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 != 22) {
            i4 = i3 == 23 ? 2 : i3;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getDailyRankContent(new o().a("anchor_id", String.valueOf(j)).a("sec_anchor_id", TTLiveSDKContext.getHostService().k().a(j3)).a("rank_type", String.valueOf(i4)).a("room_id", String.valueOf(j2)).a("hour_info", String.valueOf(i2)).a("sec_user_id", TTLiveSDKContext.getHostService().k().a().getSecUid()).f17622b).compose(i.a()).subscribe(new n(handler2, i3), new o(handler2, i3));
    }

    private h() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.reactivex.Observable<com.bytedance.android.live.core.network.response.d<java.util.Map<java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room>>> a(long[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f9797a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<long[]> r3 = long[].class
            r7[r9] = r3
            java.lang.Class<io.reactivex.Observable> r8 = io.reactivex.Observable.class
            r5 = 0
            r6 = 3990(0xf96, float:5.591E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f9797a
            r13 = 0
            r14 = 3990(0xf96, float:5.591E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<long[]> r0 = long[].class
            r15[r9] = r0
            java.lang.Class<io.reactivex.Observable> r16 = io.reactivex.Observable.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            io.reactivex.Observable r0 = (io.reactivex.Observable) r0
            return r0
        L_0x0037:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r0 == 0) goto L_0x0052
        L_0x003e:
            int r3 = r0.length
            if (r9 >= r3) goto L_0x0052
            r3 = r0[r9]
            r2.append(r3)
            int r3 = r0.length
            int r3 = r3 - r1
            if (r3 == r9) goto L_0x004f
            java.lang.String r3 = ","
            r2.append(r3)
        L_0x004f:
            int r9 = r9 + 1
            goto L_0x003e
        L_0x0052:
            com.bytedance.android.livesdk.v.f r0 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.y r0 = r0.d()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi> r1 = com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi.class
            java.lang.Object r0 = r0.a(r1)
            com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi r0 = (com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi) r0
            java.lang.String r1 = r2.toString()
            io.reactivex.Observable r0 = r0.getMultipleRoomInfo(r1)
            com.bytedance.android.live.core.rxutils.g r1 = com.bytedance.android.live.core.rxutils.i.a()
            io.reactivex.Observable r0 = r0.compose(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.bl.h.a(long[]):io.reactivex.Observable");
    }

    public final void a(Handler handler) {
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2}, this, f9797a, false, 3997, new Class[]{Handler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2}, this, f9797a, false, 3997, new Class[]{Handler.class}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getTotalHealthInfo().compose(i.a()).subscribe(new k(handler2), i.b());
    }

    public final void b(Handler handler, long j) {
        Handler handler2 = handler;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{handler2, new Long(j2)}, this, f9797a, false, 4005, new Class[]{Handler.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, new Long(j2)}, this, f9797a, false, 4005, new Class[]{Handler.class, Long.TYPE}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).unblockRoom(j2).compose(i.a()).subscribe(i.c(), new u(handler2));
    }

    public final void c(Handler handler, long j) {
        Handler handler2 = handler;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{handler2, new Long(j2)}, this, f9797a, false, 4006, new Class[]{Handler.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, new Long(j2)}, this, f9797a, false, 4006, new Class[]{Handler.class, Long.TYPE}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getReviewInfo(j2).compose(i.a()).subscribe(new v(handler2), new w(handler2));
    }

    public final void a(Handler handler, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{null, new Long(j2)}, this, f9797a, false, 3991, new Class[]{Handler.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null, new Long(j2)}, this, f9797a, false, 3991, new Class[]{Handler.class, Long.TYPE}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).leaveRoom(j2).compose(i.a()).subscribe(i.c(), i.b());
    }

    public final void a(Handler handler, long j, long j2, int i) {
        Handler handler2 = handler;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{handler2, new Long(j3), new Long(j4), Integer.valueOf(i)}, this, f9797a, false, 4002, new Class[]{Handler.class, Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, new Long(j3), new Long(j4), Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f9797a, false, 4002, new Class[]{Handler.class, Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getUserRankContent(j3, new o().a("anchor_id", String.valueOf(j2)).a("sec_anchor_id", TTLiveSDKContext.getHostService().k().a(j4)).a("room_id", String.valueOf(j)).a("rank_type", String.valueOf(i)).a("sec_user_id", TTLiveSDKContext.getHostService().k().a().getSecUid()).f17622b).compose(i.a()).subscribe(new p(handler2), new q(handler2));
    }

    private void a(Handler handler, String str, String str2, a aVar, int i, long j, boolean z, int i2, int i3) {
        String str3;
        String str4;
        Handler handler2 = handler;
        String str5 = str;
        String str6 = str2;
        a aVar2 = aVar;
        long j2 = j;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{handler2, str5, str6, aVar2, Integer.valueOf(i), new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), 0}, this, f9797a, false, 3986, new Class[]{Handler.class, String.class, String.class, a.class, Integer.TYPE, Long.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str5, str6, aVar2, Integer.valueOf(i), new Long(j2), Byte.valueOf(z), Integer.valueOf(i2), 0}, this, f9797a, false, 3986, new Class[]{Handler.class, String.class, String.class, a.class, Integer.TYPE, Long.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        o a2 = new o().a(PushConstants.TITLE, str5).a("cover_uri", str6);
        if (j2 != 0) {
            str3 = String.valueOf(j);
        } else {
            str3 = "";
        }
        o a3 = a2.a("game", str3);
        if (i != -1) {
            str4 = String.valueOf(i);
        } else {
            str4 = "";
        }
        HashMap<String, String> hashMap = a3.a("tags", str4).f17622b;
        hashMap.put("live_agreement", PushConstants.PUSH_TYPE_NOTIFY);
        if (aVar2 == a.AUDIO) {
            hashMap.put("live_audio", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else if (aVar2 == a.THIRD_PARTY) {
            hashMap.put("third_party", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else if (aVar2 == a.SCREEN_RECORD) {
            hashMap.put("screen_shot", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        if (z) {
            hashMap.put("has_commerce_goods", "true");
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).createRoom(hashMap).compose(i.a()).subscribe(new t(handler2, i4), new ad(handler2, i4));
    }
}
