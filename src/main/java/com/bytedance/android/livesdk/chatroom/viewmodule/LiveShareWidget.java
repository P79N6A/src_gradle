package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.TimeUnit;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LiveShareWidget extends LiveWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12657a;

    /* renamed from: b  reason: collision with root package name */
    public final CompositeDisposable f12658b = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    public Room f12659c;

    /* renamed from: d  reason: collision with root package name */
    User f12660d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12661e;

    /* renamed from: f  reason: collision with root package name */
    private Observer<KVData> f12662f = new da(this);

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12665a;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12666d;

        /* renamed from: b  reason: collision with root package name */
        com.bytedance.android.livesdk.popup.d f12667b;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12665a, false, 7256, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12665a, false, 7256, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12665a, false, 7255, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12665a, false, 7255, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12665a, true, 7254, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12665a, true, 7254, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LiveShareWidget.java", a.class);
            f12666d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget$ToolbarShareBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 234);
        }

        private a() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12665a, false, 7253, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12665a, false, 7253, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f12666d, this, this, view));
            LiveShareWidget.this.a();
        }

        /* synthetic */ a(LiveShareWidget liveShareWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12665a, false, 7252, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12665a, false, 7252, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            if (com.bytedance.android.livesdkapi.a.a.f18614b && ((Boolean) com.bytedance.android.livesdk.w.b.V.a()).booleanValue()) {
                LiveShareWidget.this.f12658b.add(Observable.timer((long) ((Integer) LiveSettingKeys.LIVE_SHARE_GET_DIAMONDS_TIME.a()).intValue(), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new dd(this, view), de.f13152b));
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12657a, false, 7242, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12657a, false, 7242, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.dataCenter.removeObserver(this.f12662f);
        this.f12658b.clear();
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f12657a, false, 7243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12657a, false, 7243, new Class[0], Void.TYPE);
            return;
        }
        String str2 = (String) this.dataCenter.get("log_action_type");
        com.bytedance.android.livesdk.share.b g = TTLiveSDKContext.getHostService().g();
        FragmentActivity fragmentActivity = (FragmentActivity) this.context;
        b.a a2 = com.bytedance.android.livesdkapi.depend.h.b.a(this.f12659c);
        if (this.f12661e) {
            str = this.f12659c.getAnchorShareText();
        } else {
            str = this.f12659c.getUserShareText();
        }
        g.a((Activity) fragmentActivity, a2.a(str).a(this.f12661e).a(j.a(this.dataCenter)).e(str2).a(), (com.bytedance.android.livesdkapi.depend.h.a) new com.bytedance.android.livesdkapi.depend.h.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12663a;

            public final void a(Throwable th) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:37:0x0163  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x0165  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x0167  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0169  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x016b  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(java.lang.String r22, java.lang.String r23) {
                /*
                    r21 = this;
                    r7 = r21
                    r8 = r22
                    r9 = r23
                    r10 = 2
                    java.lang.Object[] r0 = new java.lang.Object[r10]
                    r11 = 0
                    r0[r11] = r8
                    r12 = 1
                    r0[r12] = r9
                    com.meituan.robust.ChangeQuickRedirect r2 = f12663a
                    java.lang.Class[] r5 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r11] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r12] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 7251(0x1c53, float:1.0161E-41)
                    r1 = r21
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Object[] r0 = new java.lang.Object[r10]
                    r0[r11] = r8
                    r0[r12] = r9
                    com.meituan.robust.ChangeQuickRedirect r2 = f12663a
                    r3 = 0
                    r4 = 7251(0x1c53, float:1.0161E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r11] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r12] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r21
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0045:
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r0 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r1.f12659c
                    long r1 = r1.getId()
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f12659c
                    java.lang.String r3 = r3.getLabels()
                    r4 = 4
                    java.lang.Object[] r13 = new java.lang.Object[r4]
                    java.lang.Long r5 = new java.lang.Long
                    r5.<init>(r1)
                    r13[r11] = r5
                    r13[r12] = r9
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
                    r13[r10] = r5
                    r5 = 3
                    r13[r5] = r3
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.f12657a
                    r16 = 0
                    r17 = 7244(0x1c4c, float:1.0151E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r4]
                    java.lang.Class r14 = java.lang.Long.TYPE
                    r6[r11] = r14
                    java.lang.Class<java.lang.String> r14 = java.lang.String.class
                    r6[r12] = r14
                    java.lang.Class r14 = java.lang.Integer.TYPE
                    r6[r10] = r14
                    java.lang.Class<java.lang.String> r14 = java.lang.String.class
                    r6[r5] = r14
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r6
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                    if (r6 == 0) goto L_0x00c4
                    java.lang.Object[] r13 = new java.lang.Object[r4]
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r1)
                    r13[r11] = r6
                    r13[r12] = r9
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                    r13[r10] = r1
                    r13[r5] = r3
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.f12657a
                    r16 = 0
                    r17 = 7244(0x1c4c, float:1.0151E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r4]
                    java.lang.Class r2 = java.lang.Long.TYPE
                    r1[r11] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r12] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r1[r10] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r5] = r2
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                    goto L_0x01b0
                L_0x00c4:
                    com.bytedance.android.livesdk.utils.o r6 = new com.bytedance.android.livesdk.utils.o
                    r6.<init>()
                    java.lang.String r15 = "target_id"
                    java.lang.Object[] r13 = new java.lang.Object[r12]
                    r13[r11] = r9
                    com.meituan.robust.ChangeQuickRedirect r16 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.f12657a
                    r17 = 0
                    r18 = 7246(0x1c4e, float:1.0154E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r12]
                    java.lang.Class<java.lang.String> r19 = java.lang.String.class
                    r14[r11] = r19
                    java.lang.Class r19 = java.lang.Integer.TYPE
                    r20 = r14
                    r14 = r0
                    r4 = r15
                    r15 = r16
                    r16 = r17
                    r17 = r18
                    r18 = r20
                    boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                    r14 = -1
                    if (r13 == 0) goto L_0x0110
                    java.lang.Object[] r13 = new java.lang.Object[r12]
                    r13[r11] = r9
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.f12657a
                    r16 = 0
                    r17 = 7246(0x1c4e, float:1.0154E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r12]
                    java.lang.Class<java.lang.String> r14 = java.lang.String.class
                    r5[r11] = r14
                    java.lang.Class r19 = java.lang.Integer.TYPE
                    r14 = r0
                    r18 = r5
                    java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    int r5 = r5.intValue()
                    goto L_0x016c
                L_0x0110:
                    int r13 = r23.hashCode()
                    r15 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
                    if (r13 == r15) goto L_0x0155
                    r15 = 3616(0xe20, float:5.067E-42)
                    if (r13 == r15) goto L_0x014b
                    r15 = 108102557(0x671839d, float:4.5423756E-35)
                    if (r13 == r15) goto L_0x0141
                    r15 = 113011944(0x6bc6ce8, float:7.0877763E-35)
                    if (r13 == r15) goto L_0x0137
                    r15 = 1355475581(0x50caea7d, float:2.72349204E10)
                    if (r13 == r15) goto L_0x012d
                    goto L_0x015f
                L_0x012d:
                    java.lang.String r13 = "weixin_moment"
                    boolean r13 = r9.equals(r13)
                    if (r13 == 0) goto L_0x015f
                    r13 = 3
                    goto L_0x0160
                L_0x0137:
                    java.lang.String r13 = "weibo"
                    boolean r13 = r9.equals(r13)
                    if (r13 == 0) goto L_0x015f
                    r13 = 4
                    goto L_0x0160
                L_0x0141:
                    java.lang.String r13 = "qzone"
                    boolean r13 = r9.equals(r13)
                    if (r13 == 0) goto L_0x015f
                    r13 = 1
                    goto L_0x0160
                L_0x014b:
                    java.lang.String r13 = "qq"
                    boolean r13 = r9.equals(r13)
                    if (r13 == 0) goto L_0x015f
                    r13 = 0
                    goto L_0x0160
                L_0x0155:
                    java.lang.String r13 = "weixin"
                    boolean r13 = r9.equals(r13)
                    if (r13 == 0) goto L_0x015f
                    r13 = 2
                    goto L_0x0160
                L_0x015f:
                    r13 = -1
                L_0x0160:
                    switch(r13) {
                        case 0: goto L_0x016b;
                        case 1: goto L_0x0169;
                        case 2: goto L_0x016c;
                        case 3: goto L_0x0167;
                        case 4: goto L_0x0165;
                        default: goto L_0x0163;
                    }
                L_0x0163:
                    r5 = -1
                    goto L_0x016c
                L_0x0165:
                    r5 = 5
                    goto L_0x016c
                L_0x0167:
                    r5 = 4
                    goto L_0x016c
                L_0x0169:
                    r5 = 2
                    goto L_0x016c
                L_0x016b:
                    r5 = 1
                L_0x016c:
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    com.bytedance.android.livesdk.utils.o r4 = r6.a(r4, r5)
                    java.lang.String r5 = "share_type"
                    java.lang.String r6 = "1"
                    com.bytedance.android.livesdk.utils.o r4 = r4.a(r5, r6)
                    java.lang.String r5 = "common_label_list"
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    com.bytedance.android.livesdk.utils.o r3 = r4.a(r5, r3)
                    java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f17622b
                    com.bytedance.android.livesdk.v.f r4 = com.bytedance.android.livesdk.v.j.q()
                    com.bytedance.android.livesdk.y r4 = r4.d()
                    java.lang.Class<com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi> r5 = com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi.class
                    java.lang.Object r4 = r4.a(r5)
                    com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi r4 = (com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi) r4
                    io.reactivex.Observable r1 = r4.sendShare(r1, r3)
                    com.bytedance.android.live.core.rxutils.g r2 = com.bytedance.android.live.core.rxutils.i.a()
                    io.reactivex.Observable r1 = r1.compose(r2)
                    com.bytedance.android.livesdk.chatroom.viewmodule.dc r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.dc
                    r2.<init>(r0)
                    io.reactivex.functions.Consumer r0 = com.bytedance.android.live.core.rxutils.i.b()
                    r1.subscribe(r2, r0)
                L_0x01b0:
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r0 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    java.lang.Object[] r13 = new java.lang.Object[r10]
                    r13[r11] = r8
                    r13[r12] = r9
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.f12657a
                    r16 = 0
                    r17 = 7247(0x1c4f, float:1.0155E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r11] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r12] = r2
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                    if (r1 == 0) goto L_0x01f2
                    java.lang.Object[] r13 = new java.lang.Object[r10]
                    r13[r11] = r8
                    r13[r12] = r9
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.f12657a
                    r16 = 0
                    r17 = 7247(0x1c4f, float:1.0155E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r11] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r12] = r2
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                    goto L_0x022f
                L_0x01f2:
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    java.lang.String r2 = "platform"
                    r1.put(r2, r8)
                    java.lang.String r2 = "is_pyramid_sale"
                    java.lang.String r3 = "0"
                    r1.put(r2, r3)
                    java.lang.String r2 = "type"
                    r1.put(r2, r9)
                    java.lang.String r2 = "log_pb"
                    com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f12659c
                    java.lang.String r0 = r0.getLog_pb()
                    r1.put(r2, r0)
                    com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()
                    java.lang.String r2 = "share"
                    java.lang.Object[] r3 = new java.lang.Object[r10]
                    com.bytedance.android.livesdk.j.c.j r4 = new com.bytedance.android.livesdk.j.c.j
                    r4.<init>()
                    java.lang.String r5 = "click"
                    com.bytedance.android.livesdk.j.c.j r4 = r4.g(r5)
                    r3[r11] = r4
                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                    r3[r12] = r4
                    r0.a(r2, r1, r3)
                L_0x022f:
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r0 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.dataCenter
                    boolean r0 = com.bytedance.android.livesdk.utils.j.b(r0)
                    if (r0 == 0) goto L_0x0250
                    java.lang.Class<com.bytedance.android.livesdkapi.c.a> r0 = com.bytedance.android.livesdkapi.c.a.class
                    com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.b.a(r0)
                    com.bytedance.android.livesdkapi.c.a r0 = (com.bytedance.android.livesdkapi.c.a) r0
                    java.lang.String r1 = "live_ad"
                    java.lang.String r2 = "live_share"
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.dataCenter
                    java.util.Map r3 = com.bytedance.android.livesdk.utils.j.c(r3)
                    r0.a((boolean) r12, (java.lang.String) r1, (java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)
                L_0x0250:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.AnonymousClass1.a(java.lang.String, java.lang.String):void");
            }
        });
    }

    public void onCreate() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f12657a, false, 7241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12657a, false, 7241, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.TRUE)).booleanValue();
        this.f12661e = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.FALSE)).booleanValue();
        this.f12659c = (Room) this.dataCenter.get("data_room");
        this.f12660d = (User) this.dataCenter.get("data_user_in_room");
        if (!com.bytedance.android.live.uikit.a.a.a() || booleanValue) {
            com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.c().a(f.SHARE, (d.a) new a(this, (byte) 0));
        }
        this.dataCenter.observe("cmd_wanna_share_live", this.f12662f);
        if (com.bytedance.android.live.uikit.a.a.a()) {
            com.bytedance.android.livesdkapi.c.a aVar = (com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class);
            String secUid = this.f12659c.author().getSecUid();
            long id = this.f12659c.getId();
            if (this.f12661e) {
                str = "tool_panel";
            } else {
                str = "share_panel";
            }
            aVar.a(secUid, id, str, (c<com.bytedance.android.live.base.model.c.a>) new db<com.bytedance.android.live.base.model.c.a>(this));
        }
    }
}
