package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.chatroom.e.x;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;

public class bu extends bx<a> implements OnInterceptListener, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11321a = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f11322e = "bu";

    /* renamed from: b  reason: collision with root package name */
    public b f11323b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f11324c = new ArrayList(200);

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f11325d = new ArrayList(200);

    /* renamed from: f  reason: collision with root package name */
    private long f11326f;
    private Room g;
    private List<ImageModel> h = null;
    private boolean i = false;
    private long j;

    public interface a extends al {
        void a(int i);

        void a(int i, boolean z);

        void a(bi biVar);

        void b(int i, boolean z);

        void c(int i, boolean z);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11321a, false, 5322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11321a, false, 5322, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.y.removeOnInterceptListener(this);
    }

    public bu(long j2) {
        this.f11326f = j2;
    }

    public void onIntercept(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11321a, false, 5318, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11321a, false, 5318, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        a(x.a((c) iMessage));
    }

    private void a(b<?> bVar) {
        b<?> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f11321a, false, 5320, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f11321a, false, 5320, new Class[]{b.class}, Void.TYPE);
            return;
        }
        long b2 = TTLiveSDKContext.getHostService().k().b();
        if (b2 == 0 || b2 != bVar.q()) {
            return;
        }
        T t = bVar2.f10013b;
        if (t.getMessageType() == com.bytedance.android.livesdkapi.depend.f.a.CHAT || t.getMessageType() == com.bytedance.android.livesdkapi.depend.f.a.GIFT || t.getMessageType() == com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT || t.getMessageType() == com.bytedance.android.livesdkapi.depend.f.a.GIFT_GROUP || t.getMessageType() == com.bytedance.android.livesdkapi.depend.f.a.DIGG || t.getMessageType() == com.bytedance.android.livesdkapi.depend.f.a.MEMBER || t.getMessageType() == com.bytedance.android.livesdkapi.depend.f.a.SCREEN) {
            this.h = bVar.j();
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11321a, false, 5315, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11321a, false, 5315, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.CHAT.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.GIFT.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.MEMBER.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DIGG.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ROOM.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.SOCIAL.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.CONTROL.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.SCREEN.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DEFAULT.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ROOM_RICH_CHAT_MESSAGE.getIntType(), this);
        if (!com.bytedance.android.livesdkapi.a.a.f18614b) {
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.PROMOTION_CARD_MESSAGE.getIntType(), this);
        }
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LUCKY_BOX.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LOTTERY.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.COMMENT_IMAGE.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.GOODS_ORDER.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ASSET_MESSAGE.getIntType(), this);
        this.y.addOnInterceptListener(this);
        this.g = (Room) this.x.get("data_room");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014c, code lost:
        if (r11.baseMessage.j != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0157, code lost:
        if (r11.baseMessage.j != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ae, code lost:
        if (r0.g != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b1, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r16) {
        /*
            r15 = this;
            r7 = r15
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 5316(0x14c4, float:7.45E-42)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0031
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            r3 = 0
            r4 = 5316(0x14c4, float:7.45E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0031:
            r11 = r16
            com.bytedance.android.livesdk.message.model.c r11 = (com.bytedance.android.livesdk.message.model.c) r11
            boolean r0 = r11 instanceof com.bytedance.android.livesdk.message.model.ab
            if (r0 == 0) goto L_0x0055
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.b.a(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            r1 = r11
            com.bytedance.android.livesdk.message.model.ab r1 = (com.bytedance.android.livesdk.message.model.ab) r1
            long r2 = r1.f16432d
            com.bytedance.android.livesdk.gift.model.b r0 = r0.findGiftById(r2)
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0055
            int r0 = r1.h
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            com.bytedance.android.livesdk.w.c<java.lang.Boolean> r0 = com.bytedance.android.livesdk.w.b.Q
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.android.livesdk.chatroom.e.b r12 = com.bytedance.android.livesdk.chatroom.e.x.a((com.bytedance.android.livesdk.message.model.c) r11)
            if (r12 != 0) goto L_0x0068
            return
        L_0x0068:
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r7.g
            if (r1 == 0) goto L_0x0074
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r7.g
            int r1 = r1.getOrientation()
            r12.f10015d = r1
        L_0x0074:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r7.x
            java.lang.String r2 = "data_is_anchor"
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.get((java.lang.String) r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r12.f10016e = r1
            if (r0 == 0) goto L_0x00a4
            com.bytedance.android.livesdk.w.c<java.lang.Boolean> r0 = com.bytedance.android.livesdk.w.b.X
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a4
            T r0 = r12.f10013b
            int r0 = r0.getIntType()
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.CHAT
            int r1 = r1.getIntType()
            if (r0 == r1) goto L_0x00a6
        L_0x00a4:
            r7.f11323b = r12
        L_0x00a6:
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11325d
            int r0 = r0.size()
            r13 = 200(0xc8, float:2.8E-43)
            r14 = 70
            if (r0 < r13) goto L_0x00bb
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11325d
            java.util.List r0 = r0.subList(r10, r14)
            r0.clear()
        L_0x00bb:
            T r0 = r12.f10013b
            int r0 = r0.getIntType()
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.GIFT
            int r1 = r1.getIntType()
            if (r0 == r1) goto L_0x00d9
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT
            int r1 = r1.getIntType()
            if (r0 == r1) goto L_0x00d9
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.CHAT
            int r1 = r1.getIntType()
            if (r0 != r1) goto L_0x00de
        L_0x00d9:
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11325d
            r0.add(r12)
        L_0x00de:
            com.bytedance.ies.a.a r0 = r15.b()
            if (r0 == 0) goto L_0x0417
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            r3 = 0
            r4 = 5321(0x14c9, float:7.456E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdkapi.h.a> r1 = com.bytedance.android.livesdkapi.h.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x011a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            r3 = 0
            r4 = 5321(0x14c9, float:7.456E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdkapi.h.a> r1 = com.bytedance.android.livesdkapi.h.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01b4
        L_0x011a:
            if (r11 == 0) goto L_0x01b3
            long r0 = r7.f11326f
            boolean r0 = r11.isCurrentRoom(r0)
            if (r0 == 0) goto L_0x01b3
            boolean r0 = r11.canText()
            if (r0 != 0) goto L_0x012c
            goto L_0x01b3
        L_0x012c:
            int[] r0 = com.bytedance.android.livesdk.chatroom.presenter.bu.AnonymousClass1.f11327a
            com.bytedance.android.livesdkapi.depend.f.a r1 = r11.getMessageType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0199;
                case 2: goto L_0x015a;
                case 3: goto L_0x014f;
                case 4: goto L_0x013d;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x01b1
        L_0x013d:
            r0 = r11
            com.bytedance.android.livesdk.message.model.a r0 = (com.bytedance.android.livesdk.message.model.a) r0
            boolean r1 = r0.f16422d
            if (r1 == 0) goto L_0x01b3
            com.bytedance.android.livesdkapi.h.b r0 = r0.baseMessage
            if (r0 == 0) goto L_0x01b3
            com.bytedance.android.livesdkapi.h.b r0 = r11.baseMessage
            com.bytedance.android.livesdkapi.h.e r0 = r0.j
            if (r0 != 0) goto L_0x01b1
            goto L_0x01b3
        L_0x014f:
            com.bytedance.android.livesdkapi.h.b r0 = r11.baseMessage
            if (r0 == 0) goto L_0x01b3
            com.bytedance.android.livesdkapi.h.b r0 = r11.baseMessage
            com.bytedance.android.livesdkapi.h.e r0 = r0.j
            if (r0 != 0) goto L_0x01b1
            goto L_0x01b3
        L_0x015a:
            r0 = r11
            com.bytedance.android.livesdk.message.model.at r0 = (com.bytedance.android.livesdk.message.model.at) r0
            com.bytedance.android.livesdk.message.model.au r1 = r0.f16497b
            if (r1 == 0) goto L_0x01b3
            com.bytedance.android.livesdk.message.model.au r0 = r0.f16497b
            java.lang.String r0 = r0.f16498a
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -984622807(0xffffffffc54fd929, float:-3325.5725)
            if (r2 == r3) goto L_0x017f
            r3 = -407856239(0xffffffffe7b09b91, float:-1.6680124E24)
            if (r2 == r3) goto L_0x0175
            goto L_0x0188
        L_0x0175:
            java.lang.String r2 = "enter_by_card"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0188
            r1 = 1
            goto L_0x0188
        L_0x017f:
            java.lang.String r2 = "buy_card"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0188
            r1 = 0
        L_0x0188:
            switch(r1) {
                case 0: goto L_0x018c;
                case 1: goto L_0x018c;
                default: goto L_0x018b;
            }
        L_0x018b:
            goto L_0x01b3
        L_0x018c:
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.a.Z
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01b4
        L_0x0199:
            r0 = r11
            com.bytedance.android.livesdk.message.model.ab r0 = (com.bytedance.android.livesdk.message.model.ab) r0
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r1 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.b.a(r1)
            com.bytedance.android.live.gift.IGiftService r1 = (com.bytedance.android.live.gift.IGiftService) r1
            long r2 = r0.f16432d
            com.bytedance.android.livesdk.gift.model.b r0 = r1.findGiftById(r2)
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r0 = 0
            goto L_0x01b4
        L_0x01b3:
            r0 = 1
        L_0x01b4:
            if (r0 == 0) goto L_0x01b8
            goto L_0x0417
        L_0x01b8:
            boolean r0 = r11 instanceof com.bytedance.android.livesdk.message.model.bi
            if (r0 == 0) goto L_0x01c9
            r0 = r16
            com.bytedance.android.livesdk.message.model.bi r0 = (com.bytedance.android.livesdk.message.model.bi) r0
            com.bytedance.ies.a.a r1 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r1 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r1
            r1.a((com.bytedance.android.livesdk.message.model.bi) r0)
        L_0x01c9:
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            int r0 = r0.size()
            if (r0 < r13) goto L_0x01e3
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            java.util.List r0 = r0.subList(r10, r14)
            r0.clear()
            com.bytedance.ies.a.a r0 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r0
            r0.a((int) r14)
        L_0x01e3:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            r3 = 0
            r4 = 5317(0x14c5, float:7.451E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.e.b> r1 = com.bytedance.android.livesdk.chatroom.e.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0211
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            r3 = 0
            r4 = 5317(0x14c5, float:7.451E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.e.b> r1 = com.bytedance.android.livesdk.chatroom.e.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0211:
            T r8 = r12.f10013b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            r3 = 0
            r4 = 5319(0x14c7, float:7.454E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdkapi.h.a> r1 = com.bytedance.android.livesdkapi.h.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0248
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11321a
            r3 = 0
            r4 = 5319(0x14c7, float:7.454E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdkapi.h.a> r1 = com.bytedance.android.livesdkapi.h.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0279
        L_0x0248:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.message.model.e
            if (r0 == 0) goto L_0x0262
            com.bytedance.android.livesdk.message.model.e r8 = (com.bytedance.android.livesdk.message.model.e) r8
            com.bytedance.android.live.base.model.user.User r0 = r8.f16615d
            com.bytedance.android.livesdk.v.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r1 = r1.k()
            com.bytedance.android.live.base.model.user.i r1 = r1.a()
            if (r0 != r1) goto L_0x0260
        L_0x025e:
            r0 = 1
            goto L_0x0279
        L_0x0260:
            r0 = 0
            goto L_0x0279
        L_0x0262:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.message.model.ab
            if (r0 == 0) goto L_0x0260
            com.bytedance.android.livesdk.message.model.ab r8 = (com.bytedance.android.livesdk.message.model.ab) r8
            com.bytedance.android.live.base.model.user.User r0 = r8.f16430b
            com.bytedance.android.livesdk.v.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r1 = r1.k()
            com.bytedance.android.live.base.model.user.i r1 = r1.a()
            if (r0 != r1) goto L_0x0260
            goto L_0x025e
        L_0x0279:
            if (r0 == 0) goto L_0x0280
            java.util.List<com.bytedance.android.live.base.model.ImageModel> r0 = r7.h
            r12.i = r0
            goto L_0x0283
        L_0x0280:
            r15.a((com.bytedance.android.livesdk.chatroom.e.b<?>) r12)
        L_0x0283:
            T r0 = r12.f10013b
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.message.model.av
            if (r0 == 0) goto L_0x02c7
            T r0 = r12.f10013b
            com.bytedance.android.livesdk.message.model.av r0 = (com.bytedance.android.livesdk.message.model.av) r0
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x02bc
            java.lang.ref.WeakReference<com.bytedance.android.livesdk.chatroom.e.b> r1 = r0.l
            if (r1 == 0) goto L_0x02bc
            java.lang.ref.WeakReference<com.bytedance.android.livesdk.chatroom.e.b> r1 = r0.l
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x02bc
            java.lang.ref.WeakReference<com.bytedance.android.livesdk.chatroom.e.b> r0 = r0.l
            java.lang.Object r0 = r0.get()
            com.bytedance.android.livesdk.chatroom.e.b r0 = (com.bytedance.android.livesdk.chatroom.e.b) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L_0x02c7
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            r1.remove(r0)
            com.bytedance.ies.a.a r1 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r1 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r1
            r1.a(r0, r10)
            goto L_0x02c7
        L_0x02bc:
            boolean r1 = r0.k
            if (r1 != 0) goto L_0x02c7
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r12)
            r0.l = r1
        L_0x02c7:
            T r0 = r12.f10013b
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.message.model.aq
            if (r0 == 0) goto L_0x0303
            T r0 = r12.f10013b
            com.bytedance.android.livesdk.message.model.aq r0 = (com.bytedance.android.livesdk.message.model.aq) r0
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x02f8
            java.lang.ref.WeakReference<com.bytedance.android.livesdk.chatroom.e.b> r1 = r0.r
            if (r1 == 0) goto L_0x02f8
            java.lang.ref.WeakReference<com.bytedance.android.livesdk.chatroom.e.b> r0 = r0.r
            java.lang.Object r0 = r0.get()
            com.bytedance.android.livesdk.chatroom.e.b r0 = (com.bytedance.android.livesdk.chatroom.e.b) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L_0x0303
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            r1.remove(r0)
            com.bytedance.ies.a.a r1 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r1 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r1
            r1.a(r0, r10)
            goto L_0x0303
        L_0x02f8:
            boolean r1 = r0.o
            if (r1 != 0) goto L_0x0303
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r12)
            r0.r = r1
        L_0x0303:
            T r0 = r12.f10013b
            com.bytedance.android.livesdkapi.depend.f.a r0 = r0.getMessageType()
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.DIGG
            if (r0 == r1) goto L_0x035e
            T r0 = r12.f10013b
            com.bytedance.android.livesdkapi.depend.f.a r0 = r0.getMessageType()
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.MEMBER
            if (r0 != r1) goto L_0x0326
            T r0 = r12.f10013b
            com.bytedance.android.livesdk.message.model.as r0 = (com.bytedance.android.livesdk.message.model.as) r0
            long r0 = r0.a()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0326
            goto L_0x035e
        L_0x0326:
            boolean r0 = r7.i
            if (r0 == 0) goto L_0x0348
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 - r9
            r0.add(r1, r12)
            com.bytedance.ies.a.a r0 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 + -2
            r0.b(r1, r9)
            return
        L_0x0348:
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            r0.add(r12)
            com.bytedance.ies.a.a r0 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 - r9
            r0.b(r1, r9)
            return
        L_0x035e:
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            r0.add(r12)
            boolean r0 = com.bytedance.android.live.uikit.a.a.f()
            r1 = 0
            if (r0 == 0) goto L_0x03a5
            boolean r0 = r7.i
            if (r0 == 0) goto L_0x0394
            long r3 = r7.j
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0394
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 + -2
            r0.remove(r1)
            com.bytedance.ies.a.a r0 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 - r9
            r0.c(r1, r10)
            goto L_0x040e
        L_0x0394:
            com.bytedance.ies.a.a r0 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 - r9
            r0.b(r1, r9)
            goto L_0x040e
        L_0x03a5:
            boolean r0 = r7.i
            if (r0 == 0) goto L_0x03fe
            long r3 = r7.j
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03fe
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.j
            long r0 = r0 - r2
            r2 = 3000(0xbb8, double:1.482E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x03fe
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 + -2
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdk.chatroom.e.b r0 = (com.bytedance.android.livesdk.chatroom.e.b) r0
            long r0 = r0.q()
            com.bytedance.android.livesdk.v.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r2 = r2.k()
            long r2 = r2.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x03ed
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r0 = r7.f11324c
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 + -2
            r0.remove(r1)
        L_0x03ed:
            com.bytedance.ies.a.a r0 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 - r9
            r0.c(r1, r10)
            goto L_0x040e
        L_0x03fe:
            com.bytedance.ies.a.a r0 = r15.b()
            com.bytedance.android.livesdk.chatroom.presenter.bu$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.bu.a) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r7.f11324c
            int r1 = r1.size()
            int r1 = r1 - r9
            r0.b(r1, r9)
        L_0x040e:
            long r0 = java.lang.System.currentTimeMillis()
            r7.j = r0
            r7.i = r9
            return
        L_0x0417:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.presenter.bu.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
