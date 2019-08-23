package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.ViewGroup;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.effect.doodle.view.a;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public class DoodleWidget extends LiveRecyclableWidget implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12488a;

    /* renamed from: b  reason: collision with root package name */
    private a f12489b;

    /* renamed from: c  reason: collision with root package name */
    private Room f12490c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12491d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12492e;

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12488a, false, 6776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12488a, false, 6776, new Class[0], Void.TYPE);
            return;
        }
        this.containerView.removeView(this.f12489b);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12488a, false, 6779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12488a, false, 6779, new Class[0], Void.TYPE);
            return;
        }
        if (this.f12489b != null) {
            a aVar = this.f12489b;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f14804a, false, 9409, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f14804a, false, 9409, new Class[0], Void.TYPE);
            } else if (aVar.f14805b != null) {
                aVar.f14805b.clear();
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdkapi.f.a aVar) {
        if (aVar.f18759b == 3) {
            this.f12491d = true;
            return;
        }
        if (aVar.f18759b == 4) {
            this.f12491d = false;
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12488a, false, 6774, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12488a, false, 6774, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12489b = new a(this.context);
        this.f12489b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f12489b.setUserEventListener(this);
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12488a, false, 6775, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12488a, false, 6775, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.containerView.addView(this.f12489b);
        this.f12490c = (Room) this.dataCenter.get("data_room");
        this.f12492e = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.TRUE)).booleanValue();
        com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdkapi.f.a.class).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<com.bytedance.android.livesdkapi.f.a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12493a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.livesdkapi.f.a aVar = (com.bytedance.android.livesdkapi.f.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f12493a, false, 6781, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f12493a, false, 6781, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE);
                    return;
                }
                DoodleWidget.this.onEvent(aVar);
            }
        });
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f12488a, false, 6777, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f12488a, false, 6777, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (j2 != 0) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j2));
        }
    }

    public final void a(q qVar) {
        if (PatchProxy.isSupport(new Object[]{qVar}, this, f12488a, false, 6778, new Class[]{q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar}, this, f12488a, false, 6778, new Class[]{q.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{qVar}, this, f12488a, false, 6780, new Class[]{q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar}, this, f12488a, false, 6780, new Class[]{q.class}, Void.TYPE);
        } else if (isViewValid() && qVar != null && this.f12489b != null) {
            if (qVar.f16672c == null || 0 == qVar.f16672c.getId() || qVar.f16672c.getId() == this.f12490c.getOwner().getId()) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(qVar.f16675f));
                this.dataCenter.lambda$put$1$DataCenter("data_current_room_ticket_count", Long.valueOf(qVar.g));
            }
            if (this.f12492e || !this.f12491d) {
                this.f12489b.a(qVar);
                return;
            }
            if (qVar.f16671b != null && qVar.f16671b.getId() == ((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().b()) {
                this.f12489b.a(qVar);
            }
        }
    }
}
