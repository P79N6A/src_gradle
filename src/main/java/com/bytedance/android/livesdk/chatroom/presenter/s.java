package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.f;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdk.message.model.ac;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.message.model.y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.LinkedList;
import java.util.List;

public final class s extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11398a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11399b;

    /* renamed from: c  reason: collision with root package name */
    public Room f11400c;

    /* renamed from: d  reason: collision with root package name */
    private Disposable f11401d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11402e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11403f;
    private boolean g;
    private LinkedList<ab> h = new LinkedList<>();

    public interface a extends al {
        void a(i iVar);

        void a(com.bytedance.android.livesdk.message.model.a aVar);

        void a(ab abVar, boolean z);

        void a(q qVar, boolean z);

        void a(List<TaskGiftEvent> list);

        void b(Throwable th);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11398a, false, 5199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11398a, false, 5199, new Class[0], Void.TYPE);
            return;
        }
        if (this.f11401d != null && !this.f11401d.isDisposed()) {
            this.f11401d.dispose();
        }
        super.d();
    }

    public final void onEvent(com.bytedance.android.livesdkapi.f.a aVar) {
        if (aVar.f18759b == 3) {
            this.f11402e = true;
            return;
        }
        if (aVar.f18759b == 4) {
            this.f11402e = false;
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11398a, false, 5196, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11398a, false, 5196, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f11400c = (Room) this.x.get("data_room");
        this.g = ((Boolean) this.x.get("data_is_anchor", Boolean.FALSE)).booleanValue();
        this.f11403f = ((Boolean) this.x.get("data_is_portrait", Boolean.TRUE)).booleanValue();
        if (this.y != null) {
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.GIFT_UPDATE.getIntType(), this);
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.GIFT.getIntType(), this);
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT.getIntType(), this);
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ASSET_MESSAGE.getIntType(), this);
        }
        this.f11401d = com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdkapi.f.a.class).subscribe((Consumer<? super T>) new Consumer<com.bytedance.android.livesdkapi.f.a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11404a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.livesdkapi.f.a aVar = (com.bytedance.android.livesdkapi.f.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f11404a, false, 5207, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f11404a, false, 5207, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE);
                    return;
                }
                s.this.onEvent(aVar);
            }
        });
    }

    public final void onMessage(IMessage iMessage) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11398a, false, 5197, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11398a, false, 5197, new Class[]{IMessage.class}, Void.TYPE);
        } else if (b() != null) {
            if (iMessage instanceof ac) {
                int i = ((ac) iMessage).f16436b;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11398a, false, 5198, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11398a, false, 5198, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (i == 1) {
                    GiftManager.inst().syncGiftList(null, this.f11400c.getId(), 5, this.g);
                } else {
                    if (i == 2) {
                        f.a("effects").a(5, this.g);
                    }
                }
            } else if (iMessage instanceof ab) {
                ab abVar = (ab) iMessage;
                a aVar = (a) b();
                if (this.f11403f || !this.f11402e) {
                    z = false;
                }
                aVar.a(abVar, z);
            } else if (iMessage instanceof q) {
                q qVar = (q) iMessage;
                a aVar2 = (a) b();
                if (this.f11403f || !this.f11402e) {
                    z = false;
                }
                aVar2.a(qVar, z);
            } else if (iMessage instanceof y) {
                ab a2 = y.a((y) iMessage);
                if (a2 != null) {
                    a aVar3 = (a) b();
                    if (this.f11403f || !this.f11402e) {
                        z = false;
                    }
                    aVar3.a(a2, z);
                }
            } else if (iMessage instanceof com.bytedance.android.livesdk.message.model.a) {
                ((a) b()).a((com.bytedance.android.livesdk.message.model.a) iMessage);
            }
        }
    }
}
