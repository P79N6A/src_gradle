package com.bytedance.android.livesdk.kickout;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.kickout.api.BannedApiV2;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public final class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15727a;

    /* renamed from: b  reason: collision with root package name */
    public b f15728b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f15729c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    private boolean f15730d = true;

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f15727a, false, 10196, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f15727a, false, 10196, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message.what) {
            case 1:
                if (message.obj instanceof Exception) {
                    this.f15728b.a(true, (Exception) message.obj);
                    return;
                } else {
                    this.f15728b.b(true);
                    return;
                }
            case 2:
                if (message.obj instanceof Exception) {
                    this.f15728b.a(false, (Exception) message.obj);
                    return;
                } else {
                    this.f15728b.b(false);
                    return;
                }
            case 3:
                if (this.f15728b != null) {
                    this.f15728b.b();
                }
                if (!(message.obj instanceof Exception)) {
                    com.bytedance.android.livesdk.kickout.b.a aVar = (com.bytedance.android.livesdk.kickout.b.a) message.obj;
                    if (aVar != null) {
                        if (this.f15728b != null) {
                            this.f15728b.a(aVar, (Exception) null);
                        }
                        this.f15730d = aVar.f7868c.hasMore;
                        break;
                    }
                } else {
                    Exception exc = (Exception) message.obj;
                    if (this.f15728b != null) {
                        this.f15728b.a((com.bytedance.android.livesdk.kickout.b.a) null, exc);
                    }
                    return;
                }
                break;
        }
    }

    public final void a(boolean z, long j, long j2) {
        Observable observable;
        long j3 = j;
        long j4 = j2;
        final int i = 1;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j3), new Long(j4)}, this, f15727a, false, 10197, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j3), new Long(j4)}, this, f15727a, false, 10197, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            observable = ((BannedApiV2) j.q().d().a(BannedApiV2.class)).kickOut(j3, j4);
        } else {
            observable = ((BannedApiV2) j.q().d().a(BannedApiV2.class)).unKickOut(j3, j4);
        }
        if (!z) {
            i = 2;
        }
        observable.compose(i.a()).subscribe(new Consumer<d<Void>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15731a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                d dVar = (d) obj;
                if (PatchProxy.isSupport(new Object[]{dVar}, this, f15731a, false, 10199, new Class[]{d.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar}, this, f15731a, false, 10199, new Class[]{d.class}, Void.TYPE);
                    return;
                }
                if (a.this.f15729c != null) {
                    a.this.f15729c.sendMessage(a.this.f15729c.obtainMessage(i));
                }
            }
        }, new Consumer<Throwable>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15734a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f15734a, false, 10200, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f15734a, false, 10200, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                if ((th instanceof Exception) && a.this.f15729c != null) {
                    Message obtainMessage = a.this.f15729c.obtainMessage(i);
                    obtainMessage.obj = th;
                    a.this.f15729c.sendMessage(obtainMessage);
                }
            }
        });
    }

    public final void a(long j, String str, int i, int i2) {
        Observable observable;
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2, Integer.valueOf(i), 20}, this, f15727a, false, 10198, new Class[]{Long.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2, Integer.valueOf(i), 20}, this, f15727a, false, 10198, new Class[]{Long.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f15730d) {
            if (this.f15728b != null) {
                this.f15728b.a();
            }
            if (TextUtils.equals("activity_kick_out", str2)) {
                observable = ((BannedApiV2) j.q().d().a(BannedApiV2.class)).getKickedOutList(j, 20, i, TTLiveSDKContext.getHostService().k().a().getSecUid());
            } else {
                observable = ((BannedApiV2) j.q().d().a(BannedApiV2.class)).getBannedTalkList(j, 20, i, TTLiveSDKContext.getHostService().k().a().getSecUid());
            }
            observable.compose(i.a()).subscribe(new Consumer<com.bytedance.android.livesdk.kickout.b.a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15737a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    com.bytedance.android.livesdk.kickout.b.a aVar = (com.bytedance.android.livesdk.kickout.b.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f15737a, false, 10201, new Class[]{com.bytedance.android.livesdk.kickout.b.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f15737a, false, 10201, new Class[]{com.bytedance.android.livesdk.kickout.b.a.class}, Void.TYPE);
                        return;
                    }
                    if (a.this.f15729c != null) {
                        Message obtainMessage = a.this.f15729c.obtainMessage(3);
                        obtainMessage.obj = aVar;
                        a.this.f15729c.sendMessage(obtainMessage);
                    }
                }
            }, new Consumer<Throwable>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15739a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.isSupport(new Object[]{th}, this, f15739a, false, 10202, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f15739a, false, 10202, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if ((th instanceof Exception) && a.this.f15729c != null) {
                        Message obtainMessage = a.this.f15729c.obtainMessage(3);
                        obtainMessage.obj = th;
                        a.this.f15729c.sendMessage(obtainMessage);
                    }
                }
            });
        }
    }
}
