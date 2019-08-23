package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.c.c;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10112a;

    /* renamed from: b  reason: collision with root package name */
    public final CompositeDisposable f10113b = new CompositeDisposable();

    public interface a {
        void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar);

        void a(Throwable th);
    }

    public final void a(long j, Room room, String str, a aVar) {
        boolean z;
        String str2;
        long j2 = j;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), room, str, aVar2}, this, f10112a, false, 4257, new Class[]{Long.TYPE, Room.class, String.class, a.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), room, str, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f10112a, false, 4257, new Class[]{Long.TYPE, Room.class, String.class, a.class}, Void.TYPE);
        } else if (room != null) {
            TTLiveSDKContext.getHostService().k().a(((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.a) f.a().a(j2)).a(room.getRequestId())).b("live_detail")).c("live_over")).b(0)).d(room.getLabels())).c()).subscribe((Observer<? super T>) new Observer<com.bytedance.android.livesdkapi.depend.model.b.a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f10114a;

                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f10114a, false, 4261, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f10114a, false, 4261, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.a(th);
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    com.bytedance.android.livesdkapi.depend.model.b.a aVar = (com.bytedance.android.livesdkapi.depend.model.b.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f10114a, false, 4260, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f10114a, false, 4260, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.a(aVar);
                    }
                }

                public final void onSubscribe(Disposable disposable) {
                    Disposable disposable2 = disposable;
                    if (PatchProxy.isSupport(new Object[]{disposable2}, this, f10114a, false, 4259, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable2}, this, f10114a, false, 4259, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    j.this.f10113b.add(disposable2);
                }
            });
            if (room.getOwner() == null || room.getOwner().getId() != j2) {
                z = false;
            } else {
                z = true;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                Object[] objArr3 = new Object[3];
                if (z) {
                    str2 = "live_over";
                } else {
                    str2 = "live_anchor_c_audience";
                }
                objArr3[0] = new c(str2, j2);
                objArr3[1] = new com.bytedance.android.livesdk.j.c.j().b("live_interact").f("core").a("live_detail");
                objArr3[2] = Room.class;
                a2.a("follow", hashMap, objArr3);
            } catch (Exception unused) {
            }
        }
    }
}
