package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9743a;

    public static void a(Handler handler, long j) {
        final Handler handler2 = handler;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{handler2, new Long(j2)}, null, f9743a, true, 3910, new Class[]{Handler.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, new Long(j2)}, null, f9743a, true, 3910, new Class[]{Handler.class, Long.TYPE}, Void.TYPE);
            return;
        }
        ((EndPageRecommendRetrofitApi) j.q().d().a(EndPageRecommendRetrofitApi.class)).getLive(j2).compose(i.a()).subscribe(new Consumer<c<Room>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9748a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f9748a, false, 3913, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f9748a, false, 3913, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                if (handler2 != null) {
                    Message obtainMessage = handler2.obtainMessage(22);
                    obtainMessage.obj = cVar.f7867b;
                    try {
                        for (Room room : (List) obtainMessage.obj) {
                            room.setRequestId(cVar.f7868c.reqId);
                            room.setLog_pb(cVar.f7868c.logPb.toString());
                        }
                    } catch (Exception unused) {
                    }
                    handler2.sendMessage(obtainMessage);
                }
            }
        }, new Consumer<Throwable>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9750a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f9750a, false, 3914, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f9750a, false, 3914, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                if (handler2 != null) {
                    Message obtainMessage = handler2.obtainMessage(22);
                    obtainMessage.obj = th;
                    handler2.sendMessage(obtainMessage);
                }
            }
        });
    }
}
