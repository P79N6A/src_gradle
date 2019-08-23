package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j;
import com.bytedance.android.livesdk.message.model.bh;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.message.model.e;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.g;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;

public final class b extends bx<a> implements a.C0132a, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11261a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11262b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11263c = true;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.c.a f11264d = new com.bytedance.android.livesdkapi.depend.c.a(this);

    /* renamed from: e  reason: collision with root package name */
    public Room f11265e;

    /* renamed from: f  reason: collision with root package name */
    public int f11266f;
    private boolean g = true;
    private boolean h = true;
    private Disposable i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11267a = new int[com.bytedance.android.livesdkapi.depend.f.a.values().length];

        static {
            try {
                f11267a[com.bytedance.android.livesdkapi.depend.f.a.ROOM_VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public interface a extends al {
        void a(Barrage barrage);

        void a(e eVar);

        void a(Exception exc);

        void a(boolean z);

        void b();

        void b(Exception exc);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11261a, false, 5130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11261a, false, 5130, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f11264d.removeCallbacksAndMessages(null);
        if (this.i != null && !this.i.isDisposed()) {
            this.i.dispose();
        }
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11261a, false, 5136, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11261a, false, 5136, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        j.c().a(f.GIFT, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) new com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b(i2));
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11261a, false, 5137, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11261a, false, 5137, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b bVar = new com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b(i2);
        j.c().a(f.EMOTION, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) bVar);
        j.c().a(f.DIVIDER, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) bVar);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11261a, false, 5129, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11261a, false, 5129, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f11265e = (Room) this.x.get("data_room");
        this.f11262b = true;
        this.f11263c = true;
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ROOM_VERIFY.getIntType(), this);
        if (this.i != null && !this.i.isDisposed()) {
            this.i.dispose();
        }
        this.i = com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.i.a.class).subscribe((Consumer<? super T>) new c<Object>(this));
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11261a, false, 5135, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11261a, false, 5135, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (b() != null && iMessage != null && (iMessage instanceof c) && AnonymousClass1.f11267a[((c) iMessage).getMessageType().ordinal()] == 1 && (iMessage instanceof bh)) {
            switch (((bh) iMessage).f16566b) {
                case 3:
                    this.g = false;
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableChat = false;
                    }
                    ((a) b()).b();
                    return;
                case 4:
                    this.g = true;
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableChat = true;
                    }
                    ((a) b()).b();
                    return;
                case 5:
                    this.h = false;
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableDanmaku = false;
                    }
                    ((a) b()).a(this.h);
                    return;
                case 6:
                    this.h = true;
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableDanmaku = true;
                    }
                    ((a) b()).a(this.h);
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableGift = false;
                    }
                    a(8);
                    return;
                case 8:
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableGift = true;
                    }
                    a(0);
                    return;
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableDigg = false;
                    }
                    b(8);
                    return;
                case 13:
                    if (!(this.f11265e == null || this.f11265e.mRoomAuthStatus == null)) {
                        this.f11265e.mRoomAuthStatus.enableDigg = true;
                    }
                    b(0);
                    break;
            }
        }
    }

    public final void a(Message message) {
        e eVar;
        User user;
        boolean z;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f11261a, false, 5134, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f11261a, false, 5134, new Class[]{Message.class}, Void.TYPE);
        } else if (b() != null) {
            int i2 = message2.what;
            if (i2 == 2) {
                this.f11263c = true;
                if (message2.obj instanceof com.bytedance.android.live.a.a.b.a) {
                    ((a) b()).b((com.bytedance.android.live.a.a.b.a) message2.obj);
                } else if (message2.obj instanceof Exception) {
                    ((a) b()).b((Exception) message2.obj);
                } else if (message2.obj instanceof ChatResult) {
                    if (this.x != null) {
                        this.x.get("data_user_in_room");
                    }
                    ChatResult chatResult = (ChatResult) message2.obj;
                    long id = this.f11265e.getId();
                    User user2 = chatResult.getUser();
                    if (PatchProxy.isSupport(new Object[]{new Long(id), chatResult, user2}, null, com.bytedance.android.livesdk.chatroom.bl.c.f9787a, true, 3956, new Class[]{Long.TYPE, ChatResult.class, User.class}, e.class)) {
                        eVar = (e) PatchProxy.accessDispatch(new Object[]{new Long(id), chatResult, user2}, null, com.bytedance.android.livesdk.chatroom.bl.c.f9787a, true, 3956, new Class[]{Long.TYPE, ChatResult.class, User.class}, e.class);
                    } else {
                        e eVar2 = new e();
                        eVar2.f16613b = chatResult.getMsgId();
                        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
                        bVar.f18776c = id;
                        bVar.f18777d = chatResult.getMsgId();
                        bVar.g = true;
                        bVar.j = chatResult.getDisplayText();
                        eVar2.baseMessage = bVar;
                        com.bytedance.android.livesdkapi.h.e displayText = chatResult.getDisplayText();
                        if (displayText != null && !CollectionUtils.isEmpty(displayText.f18785d)) {
                            Iterator<g> it2 = displayText.f18785d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                g next = it2.next();
                                if (!(next.f18792d == null || next.f18792d.f18800a == null)) {
                                    User user3 = next.f18792d.f18800a;
                                    long b2 = TTLiveSDKContext.getHostService().k().b();
                                    if (PatchProxy.isSupport(new Object[]{user3, new Long(b2)}, null, com.bytedance.android.livesdk.chatroom.bl.c.f9787a, true, 3957, new Class[]{User.class, Long.TYPE}, Boolean.TYPE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{user3, new Long(b2)}, null, com.bytedance.android.livesdk.chatroom.bl.c.f9787a, true, 3957, new Class[]{User.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
                                    } else if (user3.getId() == b2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        user = next.f18792d.f18800a;
                                        break;
                                    }
                                }
                            }
                        }
                        user = null;
                        eVar2.f16617f = chatResult.getBackground();
                        eVar2.f16614c = chatResult.getContent();
                        if (user != null) {
                            eVar2.f16615d = user;
                        } else if (user2 != null) {
                            eVar2.f16615d = user2;
                        } else {
                            eVar2.f16615d = User.from(TTLiveSDKContext.getHostService().k().a());
                        }
                        eVar = eVar2;
                    }
                    eVar.g = String.valueOf(chatResult.getMsgId());
                    ((a) b()).a(eVar);
                    if (this.f11266f == 1) {
                        ai.a((int) C0906R.string.dew);
                        com.bytedance.android.livesdk.i.c cVar = new com.bytedance.android.livesdk.i.c();
                        cVar.f15568a = 1;
                        com.bytedance.android.livesdk.u.a.a().a((Object) cVar);
                    }
                    if (com.bytedance.android.livesdk.utils.j.b(this.x)) {
                        ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "live_comment", com.bytedance.android.livesdk.utils.j.c(this.x));
                    }
                }
            } else if (i2 == 18) {
                this.f11262b = true;
                if (message2.obj instanceof com.bytedance.android.live.a.a.b.a) {
                    ((a) b()).a((Exception) (com.bytedance.android.live.a.a.b.a) message2.obj);
                } else if (message2.obj instanceof Exception) {
                    ((a) b()).a((Exception) message2.obj);
                } else if (message2.obj instanceof Barrage) {
                    ((a) b()).a((Barrage) message2.obj);
                }
            }
        }
    }
}
