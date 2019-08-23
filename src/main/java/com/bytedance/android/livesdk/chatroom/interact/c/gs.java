package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.jsbridge.a.f;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashSet;
import java.util.Set;

public final class gs extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10766a;

    /* renamed from: b  reason: collision with root package name */
    LinkCrossRoomDataHolder f10767b = LinkCrossRoomDataHolder.a();

    /* renamed from: c  reason: collision with root package name */
    private Set<com.bytedance.android.livesdkapi.depend.f.a> f10768c = new HashSet();

    public interface a extends al {
        void a(int i);

        void b();
    }

    public final void onEvent(com.bytedance.android.livesdk.browser.jsbridge.a.a aVar) {
        com.bytedance.android.livesdk.browser.jsbridge.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f10766a, false, 5005, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f10766a, false, 5005, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.a.class}, Void.TYPE);
            return;
        }
        ((a) b()).a(aVar2.f9419a);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10766a, false, 5002, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10766a, false, 5002, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE_TASK.getIntType(), this);
        ((ab) com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.browser.jsbridge.a.a.class).as(o())).a((Consumer<? super T>) new gt<Object>(this));
        ((ab) com.bytedance.android.livesdk.u.a.a().a(f.class).as(o())).a((Consumer<? super T>) new gu<Object>(this));
    }

    public final void onEvent(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f10766a, false, 5004, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f10766a, false, 5004, new Class[]{f.class}, Void.TYPE);
            return;
        }
        for (com.bytedance.android.livesdkapi.depend.f.a next : this.f10768c) {
            if (!fVar.a().contains(next)) {
                this.y.removeMessageListener(next.getIntType(), this);
                this.f10768c.remove(next);
            }
        }
        for (com.bytedance.android.livesdkapi.depend.f.a next2 : fVar.a()) {
            if (!this.f10768c.contains(next2)) {
                this.y.addMessageListener(next2.getIntType(), this);
                this.f10768c.add(next2);
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f10766a, false, 5003, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f10766a, false, 5003, new Class[]{IMessage.class}, Void.TYPE);
        } else if (b() != null) {
            if (iMessage instanceof aj) {
                ((a) b()).b();
                this.f10768c.clear();
                return;
            }
            if (PatchProxy.isSupport(new Object[]{iMessage}, this, f10766a, false, 5007, new Class[]{IMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMessage}, this, f10766a, false, 5007, new Class[]{IMessage.class}, Void.TYPE);
                return;
            }
            ((ab) Observable.just(iMessage).subscribeOn(Schedulers.computation()).map(new gv(iMessage)).observeOn(AndroidSchedulers.mainThread()).as(o())).a(new gw(this), new gx(this));
        }
    }
}
