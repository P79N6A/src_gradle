package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.api.TaskGiftApi;
import com.bytedance.android.livesdk.chatroom.event.al;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.model.ag;
import com.bytedance.android.livesdk.chatroom.presenter.s;
import com.bytedance.android.livesdk.chatroom.presenter.v;
import com.bytedance.android.livesdk.chatroom.presenter.w;
import com.bytedance.android.livesdk.chatroom.ui.at;
import com.bytedance.android.livesdk.chatroom.ui.ez;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.l;
import com.bytedance.android.livesdk.gift.n;
import com.bytedance.android.livesdk.gift.panel.GiftDialogFragment;
import com.bytedance.android.livesdk.gift.panel.widget.ab;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.shortvideo.ea;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class GiftWidget extends LiveRecyclableWidget implements Observer<KVData>, s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12550a = null;
    private static final String h = "com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget";

    /* renamed from: b  reason: collision with root package name */
    public boolean f12551b;

    /* renamed from: c  reason: collision with root package name */
    Room f12552c;

    /* renamed from: d  reason: collision with root package name */
    User f12553d;

    /* renamed from: e  reason: collision with root package name */
    VideoGiftWidget f12554e;

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.android.livesdk.gift.impl.b f12555f;
    long g;
    private s i;
    private boolean j;
    private JSONObject k;
    private DoodleWidget l;
    private NormalGiftAnimWidget m;
    private GiftDialogFragment n;
    private c o;
    private a p;
    private b q;
    private d r;
    private boolean s;
    private int t;
    private Disposable u;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12565a = new int[com.bytedance.android.live.gift.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.live.gift.b[] r0 = com.bytedance.android.live.gift.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12565a = r0
                int[] r0 = f12565a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.live.gift.b r1 = com.bytedance.android.live.gift.b.GOLDEN_BEAN_CELL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12565a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.live.gift.b r1 = com.bytedance.android.live.gift.b.FREE_CELL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12565a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.live.gift.b r1 = com.bytedance.android.live.gift.b.NORMAL_GIFT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12565a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.live.gift.b r1 = com.bytedance.android.live.gift.b.TASK_GIFT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12565a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.live.gift.b r1 = com.bytedance.android.live.gift.b.STICKER_GIFT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f12565a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.live.gift.b r1 = com.bytedance.android.live.gift.b.MIDDLE_GIFT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f12565a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.live.gift.b r1 = com.bytedance.android.live.gift.b.SPECIAL_GIFT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.AnonymousClass5.<clinit>():void");
        }
    }

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12566a;

        /* renamed from: c  reason: collision with root package name */
        private View f12568c;

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12566a, false, 6915, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12566a, false, 6915, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void onClick(View view) {
        }

        private a() {
        }

        public final void a(@NonNull com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12566a, false, 6914, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12566a, false, 6914, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
                return;
            }
            if ((aVar instanceof com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b) && this.f12568c != null) {
                this.f12568c.setVisibility(((com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b) aVar).f12947a);
            }
        }

        /* synthetic */ a(GiftWidget giftWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            View view2 = view;
            DataCenter dataCenter2 = dataCenter;
            if (PatchProxy.isSupport(new Object[]{view2, dataCenter2}, this, f12566a, false, 6913, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, dataCenter2}, this, f12566a, false, 6913, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f12568c = view2;
            at atVar = new at(GiftWidget.this.getContext());
            ((FrameLayout) view2).addView(atVar);
            Activity activity = (Activity) GiftWidget.this.context;
            String str = (String) dataCenter2.get("log_enter_live_source");
            if (PatchProxy.isSupport(new Object[]{dataCenter2, activity, str}, atVar, at.f11868a, false, 5691, new Class[]{DataCenter.class, Activity.class, String.class}, Void.TYPE)) {
                Object[] objArr = {dataCenter2, activity, str};
                at atVar2 = atVar;
                ChangeQuickRedirect changeQuickRedirect = at.f11868a;
                PatchProxy.accessDispatch(objArr, atVar2, changeQuickRedirect, false, 5691, new Class[]{DataCenter.class, Activity.class, String.class}, Void.TYPE);
            } else {
                atVar.f11873f = dataCenter2;
                atVar.g = (Room) dataCenter2.get("data_room");
                atVar.f11872e.f11379f = atVar.g;
                atVar.h = ((Boolean) dataCenter2.get("data_is_anchor")).booleanValue();
                atVar.j = activity;
                atVar.l = str;
                atVar.i = true;
                atVar.k = ((Boolean) dataCenter2.get("data_is_portrait")).booleanValue();
                atVar.f11872e.f11375b = atVar.l;
                atVar.b();
            }
            if (GiftManager.inst().getFastGift() == null) {
                this.f12568c.setVisibility(8);
            }
        }
    }

    class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12569a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12571c;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12569a, false, 6919, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12569a, false, 6919, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12569a, false, 6918, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12569a, false, 6918, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        private b() {
            this.f12571c = true;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            int i3;
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f12569a, false, 6917, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12569a, false, 6917, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (this.f12571c) {
                i = 2130841526;
            } else {
                i = 2130841527;
            }
            view.setBackgroundResource(i);
            com.bytedance.android.livesdk.u.a a2 = com.bytedance.android.livesdk.u.a.a();
            if (this.f12571c) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            a2.a((Object) new com.bytedance.android.livesdkapi.f.a(i2));
            if (this.f12571c) {
                i3 = C0906R.string.d3f;
            } else {
                i3 = C0906R.string.d3g;
            }
            ai.a(i3);
            this.f12571c = !this.f12571c;
            GiftWidget giftWidget = GiftWidget.this;
            giftWidget.a("更新礼物特效开启状态，是否开启: " + this.f12571c);
            com.bytedance.android.livesdk.w.b.z.a(Boolean.valueOf(this.f12571c));
            com.bytedance.android.livesdk.j.a a3 = com.bytedance.android.livesdk.j.a.a();
            Object[] objArr = new Object[2];
            objArr[0] = Room.class;
            j f2 = new j().b("live").f("click");
            if (GiftWidget.this.f12551b) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[1] = f2.a(str);
            a3.a("gift_hide", objArr);
        }

        /* synthetic */ b(GiftWidget giftWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            int i;
            int i2;
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12569a, false, 6916, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12569a, false, 6916, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f12571c = ((Boolean) com.bytedance.android.livesdk.w.b.z.a()).booleanValue();
            if (this.f12571c) {
                i = 2130841527;
            } else {
                i = 2130841526;
            }
            view.setBackgroundResource(i);
            com.bytedance.android.livesdk.u.a a2 = com.bytedance.android.livesdk.u.a.a();
            if (this.f12571c) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            a2.a((Object) new com.bytedance.android.livesdkapi.f.a(i2));
            GiftWidget giftWidget = GiftWidget.this;
            giftWidget.a("是否开启礼物特效: " + this.f12571c);
        }
    }

    class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12572a;

        /* renamed from: c  reason: collision with root package name */
        private com.bytedance.android.livesdk.popup.a f12574c;

        /* renamed from: d  reason: collision with root package name */
        private View f12575d;

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12572a, false, 6924, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12572a, false, 6924, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        private c() {
        }

        public final void a(@NonNull com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            String str;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12572a, false, 6922, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12572a, false, 6922, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
                return;
            }
            if (aVar instanceof com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b) {
                if (this.f12575d != null) {
                    this.f12575d.setVisibility(((com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b) aVar).f12947a);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_name", "TOOLBAR_GIFT_ON_COMMAND");
                if (this.f12575d.getVisibility() == 0) {
                    str = "VISIBLE";
                } else {
                    str = "GONE";
                }
                hashMap.put("view_status", str);
                com.bytedance.android.livesdk.j.c.b().b("ttlive_gift", (Map<String, Object>) hashMap);
            }
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12572a, false, 6921, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12572a, false, 6921, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f12572a, false, 6923, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12572a, false, 6923, new Class[0], Void.TYPE);
                return;
            }
            if (GiftWidget.this.dataCenter != null) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "bottom_tab");
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("data_gift_panel_type", ab.GIFT);
                GiftWidget.this.a((User) null);
            }
            if (this.f12574c != null && this.f12574c.f()) {
                this.f12574c.dismiss();
            }
        }

        /* synthetic */ c(GiftWidget giftWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12572a, false, 6920, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12572a, false, 6920, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            if (com.bytedance.android.live.uikit.a.a.d() && !GiftWidget.this.f12551b) {
                String newGiftTip = GiftManager.inst().getNewGiftTip();
                if (!TextUtils.isEmpty(newGiftTip)) {
                    this.f12574c = ((com.bytedance.android.livesdk.popup.d) ((com.bytedance.android.livesdk.popup.d) com.bytedance.android.livesdk.popup.d.a(GiftWidget.this.getContext()).a((int) C0906R.layout.ang)).b(true)).b();
                    ((TextView) this.f12574c.e().findViewById(C0906R.id.da0)).setText(newGiftTip);
                    this.f12574c.a(view, 1, 4, ac.a(0.0f), ac.a(-4.0f));
                }
            }
            this.f12575d = view;
            Room room = (Room) dataCenter.get("data_enter_room");
            if (room != null && room.getOrientation() == 2 && room.mRoomAuthStatus != null && !room.mRoomAuthStatus.enableGift) {
                UIUtils.setViewVisibility(view, 8);
            }
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12550a, false, 6902, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12550a, false, 6902, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12550a, false, 6903, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12550a, false, 6903, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.aos;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Throwable r17, java.lang.Runnable r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            r11 = 1
            r0[r11] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r10] = r1
            java.lang.Class<java.lang.Runnable> r1 = java.lang.Runnable.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6887(0x1ae7, float:9.651E-42)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0043
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            r0[r11] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6887(0x1ae7, float:9.651E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r10] = r1
            java.lang.Class<java.lang.Runnable> r1 = java.lang.Runnable.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0043:
            boolean r0 = r16.isViewValid()
            if (r0 == 0) goto L_0x0206
            android.content.Context r0 = r7.context
            if (r0 != 0) goto L_0x004f
            goto L_0x0206
        L_0x004f:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.dataCenter
            java.lang.String r1 = "data_is_portrait"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r12 = r0.booleanValue()
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.gift.c.a
            if (r0 != 0) goto L_0x013f
            boolean r0 = r8 instanceof com.bytedance.android.live.a.a.b.a
            if (r0 == 0) goto L_0x0073
            r1 = r8
            com.bytedance.android.live.a.a.b.a r1 = (com.bytedance.android.live.a.a.b.a) r1
            int r1 = r1.getErrorCode()
            r2 = 40001(0x9c41, float:5.6053E-41)
            if (r1 != r2) goto L_0x0073
            goto L_0x013f
        L_0x0073:
            if (r0 == 0) goto L_0x00ab
            r1 = r8
            com.bytedance.android.live.a.a.b.a r1 = (com.bytedance.android.live.a.a.b.a) r1
            int r1 = r1.getErrorCode()
            r2 = 90501(0x16185, float:1.26819E-40)
            if (r1 != r2) goto L_0x00ab
            com.bytedance.android.livesdk.gift.q r0 = com.bytedance.android.livesdk.gift.q.a()
            r0.b()
            com.bytedance.android.livesdk.widget.m$a r0 = new com.bytedance.android.livesdk.widget.m$a
            android.content.Context r1 = r7.context
            r0.<init>(r1)
            com.bytedance.android.livesdk.widget.m$a r0 = r0.a((boolean) r11)
            r1 = 2131563902(0x7f0d157e, float:1.8753274E38)
            com.bytedance.android.livesdk.widget.m$a r0 = r0.d((int) r1)
            r1 = 2131563516(0x7f0d13fc, float:1.8752491E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$4 r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$4
            r2.<init>()
            com.bytedance.android.livesdk.widget.m$a r0 = r0.b((int) r10, (int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r0.c()
            goto L_0x0200
        L_0x00ab:
            if (r0 == 0) goto L_0x00d4
            r0 = r8
            com.bytedance.android.live.a.a.b.a r0 = (com.bytedance.android.live.a.a.b.a) r0
            java.lang.String r1 = r0.getPrompt()
            com.bytedance.android.livesdk.utils.ai.a((java.lang.String) r1)
            android.content.Context r1 = r7.context
            com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r1)
            java.lang.String r10 = "send_gift_fail"
            int r0 = r0.getErrorCode()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f12552c
            long r12 = r0.getId()
            r14 = 0
            r9.a(r10, r11, r12, r14)
            goto L_0x0200
        L_0x00d4:
            boolean r0 = r8 instanceof com.bytedance.android.live.a.a.a.b
            if (r0 == 0) goto L_0x00ee
            android.content.Context r0 = r7.context
            com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r0)
            java.lang.String r10 = "send_gift_fail"
            java.lang.String r11 = "server return empty response"
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f12552c
            long r12 = r0.getId()
            r14 = 0
            r9.a(r10, r11, r12, r14)
            goto L_0x0137
        L_0x00ee:
            boolean r0 = r8 instanceof com.bytedance.android.live.a.a.a.c
            if (r0 == 0) goto L_0x0108
            android.content.Context r0 = r7.context
            com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r0)
            java.lang.String r10 = "send_gift_fail"
            java.lang.String r11 = "server return has no data field"
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f12552c
            long r12 = r0.getId()
            r14 = 0
            r9.a(r10, r11, r12, r14)
            goto L_0x0137
        L_0x0108:
            boolean r0 = r8 instanceof com.bytedance.android.live.a.a.a.d
            if (r0 == 0) goto L_0x0122
            android.content.Context r0 = r7.context
            com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r0)
            java.lang.String r10 = "send_gift_fail"
            java.lang.String r11 = "server return wrong format"
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f12552c
            long r12 = r0.getId()
            r14 = 0
            r9.a(r10, r11, r12, r14)
            goto L_0x0137
        L_0x0122:
            android.content.Context r0 = r7.context
            com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r0)
            java.lang.String r10 = "send_gift_fail"
            java.lang.String r11 = "unknown error"
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f12552c
            long r12 = r0.getId()
            r14 = 0
            r9.a(r10, r11, r12, r14)
        L_0x0137:
            r0 = 2131564282(0x7f0d16fa, float:1.8754045E38)
            com.bytedance.android.livesdk.utils.ai.a((int) r0)
            goto L_0x0200
        L_0x013f:
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = com.bytedance.android.livesdkapi.a.a.f18614b
            if (r1 == 0) goto L_0x018b
            if (r0 == r11) goto L_0x018b
            boolean r0 = r7.f12551b
            if (r0 == 0) goto L_0x0156
            goto L_0x018b
        L_0x0156:
            com.bytedance.android.livesdk.widget.m$a r0 = new com.bytedance.android.livesdk.widget.m$a
            android.content.Context r1 = r7.context
            r0.<init>(r1, r10)
            android.content.Context r1 = r7.context
            r2 = 2131564149(0x7f0d1675, float:1.8753775E38)
            java.lang.String r1 = r1.getString(r2)
            com.bytedance.android.livesdk.widget.m$a r0 = r0.c((java.lang.CharSequence) r1)
            r1 = 2131564161(0x7f0d1681, float:1.87538E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.ai r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.ai
            r2.<init>(r7)
            com.bytedance.android.livesdk.widget.m$a r0 = r0.b((int) r10, (int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r1 = 2131563151(0x7f0d128f, float:1.875175E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.aj r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.aj
            r2.<init>(r7)
            com.bytedance.android.livesdk.widget.m$a r0 = r0.b((int) r11, (int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r0.c()
            android.content.Context r0 = r7.context
            com.bytedance.android.livesdk.j.f.a((android.content.Context) r0)
            goto L_0x0200
        L_0x018b:
            r0 = 2131564277(0x7f0d16f5, float:1.8754035E38)
            com.bytedance.android.livesdk.utils.ai.a((int) r0)
            android.content.Context r8 = r7.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r13 = r7.f12552c
            r14 = 3
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r10] = r8
            r0[r11] = r13
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6888(0x1ae8, float:9.652E-42)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r10] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01e6
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r10] = r8
            r0[r11] = r13
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6888(0x1ae8, float:9.652E-42)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r10] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0200
        L_0x01e6:
            boolean r0 = r8 instanceof android.support.v4.app.FragmentActivity
            if (r0 == 0) goto L_0x0200
            java.lang.Class<com.bytedance.android.live.f.b> r0 = com.bytedance.android.live.f.b.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.b.a(r0)
            r1 = r0
            com.bytedance.android.live.f.b r1 = (com.bytedance.android.live.f.b) r1
            r2 = r8
            android.support.v4.app.FragmentActivity r2 = (android.support.v4.app.FragmentActivity) r2
            boolean r3 = r7.f12551b
            java.lang.String r4 = "gift"
            com.bytedance.ies.sdk.widgets.DataCenter r5 = r7.dataCenter
            r6 = 0
            r1.showRechargeDialogInH5(r2, r3, r4, r5, r6)
        L_0x0200:
            if (r18 == 0) goto L_0x0205
            r18.run()
        L_0x0205:
            return
        L_0x0206:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.a(java.lang.Throwable, java.lang.Runnable):void");
    }

    public final void a(com.bytedance.android.livesdk.message.model.ab abVar, boolean z) {
        com.bytedance.android.live.gift.c cVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{abVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12550a, false, 6889, new Class[]{com.bytedance.android.livesdk.message.model.ab.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar, Byte.valueOf(z)}, this, f12550a, false, 6889, new Class[]{com.bytedance.android.livesdk.message.model.ab.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            long j2 = (long) abVar.f16434f;
            if ((abVar.f16431c == null || 0 == abVar.f16431c.getId() || abVar.f16431c.getId() == this.f12552c.getOwner().getId()) && !abVar.o) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(j2));
                this.dataCenter.lambda$put$1$DataCenter("data_current_room_ticket_count", Long.valueOf(abVar.g));
            }
            if (!z || abVar.o || abVar.h == 1) {
                com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(abVar.f16432d);
                if (findGiftById == null) {
                    String str = h;
                    com.bytedance.android.live.core.c.a.c(str, "用户本地没有该礼物， giftMessageId = " + abVar.getMessageId() + ",  giftId = " + abVar.f16432d);
                    return;
                }
                com.bytedance.android.live.gift.b giftType = GiftManager.inst().getGiftType(findGiftById);
                if (PatchProxy.isSupport(new Object[]{abVar, giftType}, this, f12550a, false, 6891, new Class[]{com.bytedance.android.livesdk.message.model.ab.class, com.bytedance.android.live.gift.b.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{abVar, giftType}, this, f12550a, false, 6891, new Class[]{com.bytedance.android.livesdk.message.model.ab.class, com.bytedance.android.live.gift.b.class}, Boolean.TYPE)).booleanValue();
                } else {
                    com.bytedance.android.live.gift.a a2 = com.bytedance.android.live.gift.a.a();
                    if (PatchProxy.isSupport(new Object[]{giftType}, a2, com.bytedance.android.live.gift.a.f8454a, false, 1701, new Class[]{com.bytedance.android.live.gift.b.class}, com.bytedance.android.live.gift.c.class)) {
                        com.bytedance.android.live.gift.a aVar = a2;
                        cVar = (com.bytedance.android.live.gift.c) PatchProxy.accessDispatch(new Object[]{giftType}, aVar, com.bytedance.android.live.gift.a.f8454a, false, 1701, new Class[]{com.bytedance.android.live.gift.b.class}, com.bytedance.android.live.gift.c.class);
                    } else {
                        cVar = a2.f8456b.get(giftType);
                    }
                    if (cVar != null) {
                        cVar.a(abVar);
                    }
                }
                if (!z2) {
                    switch (AnonymousClass5.f12565a[giftType.ordinal()]) {
                        case 1:
                            this.m.a(abVar);
                            return;
                        case 2:
                            this.m.a(abVar);
                            return;
                        case 3:
                            this.m.a(abVar);
                            return;
                        case 4:
                            this.m.a(abVar);
                            return;
                        case 5:
                            this.m.a(abVar);
                            return;
                        case 6:
                            this.f12554e.a(abVar);
                            return;
                        case e.l /*?: ONE_ARG  (7 int)*/:
                            this.f12554e.a(abVar);
                            break;
                    }
                }
            }
        }
    }

    public final void a(q qVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{qVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12550a, false, 6890, new Class[]{q.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar, Byte.valueOf(z)}, this, f12550a, false, 6890, new Class[]{q.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && qVar != null) {
            if (qVar.f16672c == null || 0 == qVar.f16672c.getId() || qVar.f16672c.getId() == this.f12552c.getOwner().getId()) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(qVar.f16675f));
            }
            if (this.j || !z) {
                this.l.a(qVar);
                return;
            }
            if (qVar.f16671b != null && qVar.f16671b.getId() == ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().b()) {
                this.l.a(qVar);
            }
        }
    }

    public final void a(List<TaskGiftEvent> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f12550a, false, 6897, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f12550a, false, 6897, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid()) {
            new ez(this.context, this.f12552c, list, null).show();
        }
    }

    public final void a(com.bytedance.android.livesdk.message.model.ab abVar) {
        com.bytedance.android.livesdk.message.model.ab abVar2 = abVar;
        if (PatchProxy.isSupport(new Object[]{abVar2}, this, f12550a, false, 6898, new Class[]{com.bytedance.android.livesdk.message.model.ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar2}, this, f12550a, false, 6898, new Class[]{com.bytedance.android.livesdk.message.model.ab.class}, Void.TYPE);
        } else if (abVar2 != null) {
            abVar2.n = true;
            a(abVar2, false);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12550a, false, 6899, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f12550a, false, 6899, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, null, null);
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f12550a, false, 6900, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f12550a, false, 6900, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str4);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gift_id", str5);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("msg_id", str6);
        }
        com.bytedance.android.livesdk.j.c.b().a("ttlive_gift", (Map<String, Object>) hashMap);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12550a, false, 6881, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12550a, false, 6881, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null && this.n.isViewValid()) {
            this.n.dismissAllowingStateLoss();
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12550a, false, 6892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12550a, false, 6892, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.live.gift.a.a().b();
        this.m.a();
        this.l.a();
        this.f12554e.b();
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12550a, false, 6874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12550a, false, 6874, new Class[0], Void.TYPE);
            return;
        }
        this.r.b(f.GIFT, this.o);
        this.r.b(f.FAST_GIFT, this.p);
        this.r.b(f.GIFT_ANIMATION, this.q);
        c();
        b();
        if (PatchProxy.isSupport(new Object[0], this, f12550a, false, 6883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12550a, false, 6883, new Class[0], Void.TYPE);
        } else if (this.f12555f != null && this.f12555f.isShowing()) {
            this.f12555f.dismiss();
        }
        if (this.u != null && !this.u.isDisposed()) {
            this.u.dispose();
        }
        this.dataCenter.removeObserver(this);
        this.i.d();
        if (this.n != null && this.n.isViewValid()) {
            this.n.dismiss();
        }
        a("GiftWidget unLoad");
    }

    public void onEvent(com.bytedance.android.livesdk.gift.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12550a, false, 6886, new Class[]{com.bytedance.android.livesdk.gift.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12550a, false, 6886, new Class[]{com.bytedance.android.livesdk.gift.b.c.class}, Void.TYPE);
        } else if (this.isViewValid && cVar.f14750a == 1) {
            a((User) null, true);
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12550a, false, 6869, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12550a, false, 6869, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.i = new s();
    }

    private <T> void a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f12550a, false, 6873, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, this, f12550a, false, 6873, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a(cls2).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12559a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f12559a, false, 6909, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f12559a, false, 6909, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof al) {
                    GiftWidget.this.onEvent((al) t);
                } else if (t instanceof ag) {
                    GiftWidget.this.onEvent((ag) t);
                } else {
                    if (t instanceof com.bytedance.android.livesdk.gift.b.c) {
                        GiftWidget.this.onEvent((com.bytedance.android.livesdk.gift.b.c) t);
                    }
                }
            }
        });
    }

    public final void b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12550a, false, 6896, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12550a, false, 6896, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        a(th2, (Runnable) null);
    }

    public void onEvent(al alVar) {
        if (PatchProxy.isSupport(new Object[]{alVar}, this, f12550a, false, 6884, new Class[]{al.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{alVar}, this, f12550a, false, 6884, new Class[]{al.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_gift_panel_type", alVar.f10155c);
            this.dataCenter.lambda$put$1$DataCenter("data_gift_log_extra", alVar.f10154b);
            this.g = alVar.f10156d;
            a(alVar.f10153a);
        }
    }

    public final void a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f12550a, false, 6879, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f12550a, false, 6879, new Class[]{User.class}, Void.TYPE);
            return;
        }
        a(user2, false);
    }

    public void onEvent(ag agVar) {
        if (PatchProxy.isSupport(new Object[]{agVar}, this, f12550a, false, 6885, new Class[]{ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{agVar}, this, f12550a, false, 6885, new Class[]{ag.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            s sVar = this.i;
            if (PatchProxy.isSupport(new Object[0], sVar, s.f11398a, false, 5201, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], sVar, s.f11398a, false, 5201, new Class[0], Void.TYPE);
            } else if (!sVar.f11399b) {
                sVar.f11399b = true;
                ((TaskGiftApi) ((h) com.bytedance.android.live.utility.b.a(h.class)).c().create(TaskGiftApi.class)).getHotsoonTaskGiftEvent().compose(i.a()).subscribe(new v(sVar), new w(sVar));
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.model.i iVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f12550a, false, 6893, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f12550a, false, 6893, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
        } else if (iVar != null) {
            ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().a(iVar.f15131c);
            if (((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).messageManagerHelper().a() != null && isViewValid()) {
                ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).messageManagerHelper().a().insertMessage(l.a(this.f12552c.getId(), iVar, (User) this.dataCenter.get("data_user_in_room")));
            }
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f12550a, false, 6895, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f12550a, false, 6895, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(iVar.t)) {
                hashMap.put("request_page", iVar.t);
            }
            hashMap.put("is_first_consume", String.valueOf(((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).isFirstConsume(((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a())));
            hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
            Object[] objArr = new Object[3];
            j jVar = new j();
            if (this.f12551b) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[0] = jVar.a(str).c("bottom_tab").b("live_interact").f("other");
            objArr[1] = Room.class;
            objArr[2] = l.a(iVar);
            a2.a("send_gift", hashMap, objArr);
        }
    }

    public void onLoad(Object... objArr) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12550a, false, 6870, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12550a, false, 6870, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12551b = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.j = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.TRUE)).booleanValue();
        this.f12552c = (Room) this.dataCenter.get("data_room");
        this.i.a((s.a) this);
        ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().e();
        if (PatchProxy.isSupport(new Object[0], this, f12550a, false, 6871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12550a, false, 6871, new Class[0], Void.TYPE);
        } else {
            enableSubWidgetManager();
            this.m = new NormalGiftAnimWidget();
            this.l = new DoodleWidget();
            this.f12554e = new VideoGiftWidget();
            this.subWidgetManager.load(C0906R.id.br_, this.m);
            if (!com.bytedance.android.live.uikit.a.a.a() && !com.bytedance.android.live.uikit.a.a.b() && !com.bytedance.android.live.uikit.a.a.j()) {
                this.subWidgetManager.load(C0906R.id.a68, this.l);
            }
            if (com.bytedance.android.live.uikit.a.a.d()) {
                this.subWidgetManager.load(C0906R.id.ak6, new GiftRelayWidget());
                this.subWidgetManager.load(C0906R.id.ak2, new GiftRelayAnimWidget());
            }
            this.subWidgetManager.load(C0906R.id.drr, this.f12554e, false);
        }
        this.r = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).toolbarManagerHelper().a();
        this.o = new c(this, (byte) 0);
        this.p = new a(this, (byte) 0);
        this.q = new b(this, (byte) 0);
        this.r.a(f.GIFT, (d.a) this.o);
        this.r.a(f.FAST_GIFT, (d.a) this.p);
        this.r.a(f.GIFT_ANIMATION, (d.a) this.q);
        a("Load GiftWidget,ToolbarManager load Gift and FastGift behavior");
        a(al.class);
        a(ag.class);
        a(com.bytedance.android.livesdk.gift.b.c.class);
        this.f12551b = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12552c = (Room) this.dataCenter.get("data_room");
        this.i.a((s.a) this);
        this.dataCenter.observeForever("cmd_clear_gift_message", this).observe("cmd_stop_special_gift", this).observe("cmd_send_gift", this).observe("cmd_show_special_group_gift", this).observe("cmd_show_notify_special_gift", this).observe("cmd_do_send_gift", this).observe("cmd_show_gift_relay_dialog", this).observe("cmd_gift_entry_click", this).observe("data_pre_show_keyboard", this).observe("cmd_normal_gift_layout_bottom_margin_update", this, true).observe("cmd_gift_dialog_switch", this);
        this.u = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).observePkState().subscribe(new ag(this), i.b());
        a(al.class);
        a(ag.class);
        a(com.bytedance.android.livesdk.gift.b.c.class);
        this.k = new JSONObject();
        try {
            this.k.put("source", this.f12552c.getUserFrom());
            this.k.put("live_source", this.dataCenter.get("log_live_feed_layout"));
            this.k.put("request_id", this.f12552c.getRequestId());
            this.k.put("log_pb", this.f12552c.getLog_pb());
            this.k.put("enter_from", this.dataCenter.get("log_enter_live_source"));
        } catch (Exception unused) {
        }
        if (PatchProxy.isSupport(new Object[0], this, f12550a, false, 6872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12550a, false, 6872, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.live.room.a.a crossRoomGift = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).getCrossRoomGift();
        if (crossRoomGift != null) {
            Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
            if (a2 != null) {
                if (PatchProxy.isSupport(new Object[0], crossRoomGift, com.bytedance.android.live.room.a.a.f8457a, false, 1743, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], crossRoomGift, com.bytedance.android.live.room.a.a.f8457a, false, 1743, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (System.currentTimeMillis() - crossRoomGift.f8461e <= ea.f66827f) {
                    z = false;
                }
                if (!z && !TextUtils.isEmpty(crossRoomGift.f8458b) && crossRoomGift.f8459c != null && crossRoomGift.f8460d > 0) {
                    try {
                        String queryParameter = Uri.parse(crossRoomGift.f8458b).getQueryParameter("room_id");
                        if (!StringUtils.isEmpty(queryParameter)) {
                            if (a2.getId() == Long.parseLong(queryParameter)) {
                                try {
                                    String queryParameter2 = Uri.parse(crossRoomGift.f8458b).getQueryParameter("gift_id");
                                    if (!StringUtils.isEmpty(queryParameter2)) {
                                        long parseLong = Long.parseLong(queryParameter2);
                                        User user = crossRoomGift.f8459c;
                                        if (GiftManager.inst().findGiftById(parseLong) != null) {
                                            com.bytedance.android.livesdk.message.model.ab abVar = new com.bytedance.android.livesdk.message.model.ab();
                                            com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
                                            bVar.f18777d = crossRoomGift.f8460d;
                                            abVar.baseMessage = bVar;
                                            abVar.f16432d = parseLong;
                                            abVar.f16430b = user;
                                            this.dataCenter.lambda$put$1$DataCenter("cmd_show_notify_special_gift", abVar);
                                        }
                                    } else {
                                        throw new IllegalStateException("schema not contain enableGift id");
                                    }
                                } catch (Exception e2) {
                                    com.bytedance.android.live.core.c.a.a(6, h, e2.getStackTrace());
                                }
                            }
                        } else {
                            throw new IllegalStateException("schema not contain room id");
                        }
                    } catch (Exception e3) {
                        com.bytedance.android.live.core.c.a.a(6, h, e3.getStackTrace());
                    }
                }
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.message.model.a aVar) {
        com.bytedance.android.livesdk.gift.effect.b.a aVar2;
        String str;
        com.bytedance.android.livesdk.message.model.a aVar3 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar3}, this, f12550a, false, 6894, new Class[]{com.bytedance.android.livesdk.message.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar3}, this, f12550a, false, 6894, new Class[]{com.bytedance.android.livesdk.message.model.a.class}, Void.TYPE);
            return;
        }
        VideoGiftWidget videoGiftWidget = this.f12554e;
        if (PatchProxy.isSupport(new Object[]{aVar3}, videoGiftWidget, VideoGiftWidget.f12859a, false, 7555, new Class[]{com.bytedance.android.livesdk.message.model.a.class}, Void.TYPE)) {
            VideoGiftWidget videoGiftWidget2 = videoGiftWidget;
            PatchProxy.accessDispatch(new Object[]{aVar3}, videoGiftWidget2, VideoGiftWidget.f12859a, false, 7555, new Class[]{com.bytedance.android.livesdk.message.model.a.class}, Void.TYPE);
            return;
        }
        if (videoGiftWidget.isViewValid() && videoGiftWidget.f12860b.c(aVar3.f16420b) != null) {
            if (PatchProxy.isSupport(new Object[]{aVar3}, null, l.f15092a, true, 9277, new Class[]{com.bytedance.android.livesdk.message.model.a.class}, com.bytedance.android.livesdk.gift.effect.b.a.class)) {
                aVar2 = (com.bytedance.android.livesdk.gift.effect.b.a) PatchProxy.accessDispatch(new Object[]{aVar3}, null, l.f15092a, true, 9277, new Class[]{com.bytedance.android.livesdk.message.model.a.class}, com.bytedance.android.livesdk.gift.effect.b.a.class);
            } else if (aVar3 == null || aVar.getMessageId() == 0) {
                aVar2 = null;
            } else {
                String b2 = com.bytedance.android.livesdk.gift.assets.f.a("effects").b(aVar3.f16420b);
                Spannable spannableString = new SpannableString("");
                if (aVar3.f16421c != null) {
                    if (aVar3.f16421c.f18782a == null || TextUtils.isEmpty(((com.bytedance.android.live.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.c.a.class)).getI18nString(aVar3.f16421c.f18782a))) {
                        str = aVar3.f16421c.f18783b;
                    } else {
                        str = ((com.bytedance.android.live.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.c.a.class)).getI18nString(aVar3.f16421c.f18782a);
                    }
                    spannableString = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).parsePatternAndGetSpannable(str, aVar3.f16421c);
                }
                com.bytedance.android.livesdk.gift.effect.b.a b3 = new com.bytedance.android.livesdk.gift.effect.b.a().a(aVar.getMessageId()).b(aVar3.f16420b).a(b2).a(true).a(aVar3.g).b(aVar3.f16424f);
                b3.l = aVar3.f16422d;
                b3.m = aVar3.f16423e;
                b3.n = spannableString;
                aVar2 = b3;
            }
            videoGiftWidget.a(aVar2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015a, code lost:
        if (r1.bottomMargin < r2) goto L_0x0174;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r24) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            com.bytedance.ies.sdk.widgets.KVData r8 = (com.bytedance.ies.sdk.widgets.KVData) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6868(0x1ad4, float:9.624E-42)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6868(0x1ad4, float:9.624E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            if (r8 == 0) goto L_0x0460
            java.lang.String r0 = r8.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0046
            goto L_0x0460
        L_0x0046:
            java.lang.String r0 = r8.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r13 = 2
            r14 = 3
            switch(r2) {
                case -2034855137: goto L_0x00bd;
                case -1357019912: goto L_0x00b3;
                case -1328547149: goto L_0x00a9;
                case -763908145: goto L_0x009f;
                case -171438776: goto L_0x0094;
                case 333436001: goto L_0x0089;
                case 908414801: goto L_0x007f;
                case 948744782: goto L_0x0075;
                case 1055337807: goto L_0x006b;
                case 1433895618: goto L_0x0061;
                case 1954026424: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x00c8
        L_0x0056:
            java.lang.String r2 = "cmd_do_send_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 5
            goto L_0x00c9
        L_0x0061:
            java.lang.String r2 = "cmd_send_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 2
            goto L_0x00c9
        L_0x006b:
            java.lang.String r2 = "cmd_show_notify_special_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 4
            goto L_0x00c9
        L_0x0075:
            java.lang.String r2 = "cmd_stop_special_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 1
            goto L_0x00c9
        L_0x007f:
            java.lang.String r2 = "cmd_gift_entry_click"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 7
            goto L_0x00c9
        L_0x0089:
            java.lang.String r2 = "cmd_gift_dialog_switch"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 9
            goto L_0x00c9
        L_0x0094:
            java.lang.String r2 = "cmd_show_gift_relay_dialog"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 10
            goto L_0x00c9
        L_0x009f:
            java.lang.String r2 = "cmd_clear_gift_message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 0
            goto L_0x00c9
        L_0x00a9:
            java.lang.String r2 = "cmd_show_special_group_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 3
            goto L_0x00c9
        L_0x00b3:
            java.lang.String r2 = "data_pre_show_keyboard"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 6
            goto L_0x00c9
        L_0x00bd:
            java.lang.String r2 = "cmd_normal_gift_layout_bottom_margin_update"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 8
            goto L_0x00c9
        L_0x00c8:
            r0 = -1
        L_0x00c9:
            r15 = 2131168591(0x7f070d4f, float:1.7951488E38)
            r6 = 0
            switch(r0) {
                case 0: goto L_0x045b;
                case 1: goto L_0x03d6;
                case 2: goto L_0x03c6;
                case 3: goto L_0x03aa;
                case 4: goto L_0x039f;
                case 5: goto L_0x0229;
                case 6: goto L_0x0223;
                case 7: goto L_0x0219;
                case 8: goto L_0x01ae;
                case 9: goto L_0x00d7;
                case 10: goto L_0x00d2;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            goto L_0x045f
        L_0x00d2:
            r23.b()
            goto L_0x045f
        L_0x00d7:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.chatroom.event.j r8 = (com.bytedance.android.livesdk.chatroom.event.j) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6875(0x1adb, float:9.634E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.j> r1 = com.bytedance.android.livesdk.chatroom.event.j.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x010f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6875(0x1adb, float:9.634E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.j> r1 = com.bytedance.android.livesdk.chatroom.event.j.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x045f
        L_0x010f:
            boolean r0 = r23.isViewValid()
            if (r0 == 0) goto L_0x045f
            android.content.Context r0 = r23.getContext()
            if (r0 != 0) goto L_0x011d
            goto L_0x045f
        L_0x011d:
            boolean r0 = r8.f10180a
            r7.s = r0
            android.view.View r0 = r7.contentView
            android.view.View r0 = r0.findViewById(r15)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            android.content.Context r2 = r23.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131427874(0x7f0b0222, float:1.8477377E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            boolean r3 = com.bytedance.android.livesdkapi.a.a.f18616d
            if (r3 == 0) goto L_0x0154
            android.content.Context r3 = r23.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131427876(0x7f0b0224, float:1.847738E38)
            float r3 = r3.getDimension(r4)
            int r3 = (int) r3
            int r2 = r2 + r3
        L_0x0154:
            boolean r3 = r8.f10180a
            if (r3 == 0) goto L_0x015d
            int r3 = r1.bottomMargin
            if (r3 >= r2) goto L_0x045f
            goto L_0x0174
        L_0x015d:
            int r2 = r7.t
            if (r2 == 0) goto L_0x0164
            int r2 = r7.t
            goto L_0x0174
        L_0x0164:
            android.content.Context r2 = r23.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131427872(0x7f0b0220, float:1.8477373E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
        L_0x0174:
            java.lang.String r3 = "translationY"
            float[] r4 = new float[r9]
            int r5 = r1.bottomMargin
            int r5 = r5 - r2
            float r5 = (float) r5
            r4[r10] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r3, r4)
            r3 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r0 = r0.setDuration(r3)
            android.view.View r5 = r7.contentView
            r6 = 2131166957(0x7f0706ed, float:1.7948174E38)
            android.view.View r5 = r5.findViewById(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x01aa
            java.lang.String r6 = "translationY"
            float[] r8 = new float[r9]
            int r1 = r1.bottomMargin
            int r1 = r1 - r2
            float r1 = (float) r1
            r8[r10] = r1
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r5, r6, r8)
            android.animation.ObjectAnimator r1 = r1.setDuration(r3)
            r1.start()
        L_0x01aa:
            r0.start()
            return
        L_0x01ae:
            java.lang.Object r0 = r8.getData()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6876(0x1adc, float:9.635E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6876(0x1adc, float:9.635E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x045f
        L_0x01f1:
            boolean r0 = r23.isViewValid()
            if (r0 == 0) goto L_0x045f
            android.content.Context r0 = r23.getContext()
            if (r0 != 0) goto L_0x01ff
            goto L_0x045f
        L_0x01ff:
            r7.t = r8
            boolean r0 = r7.s
            if (r0 != 0) goto L_0x0218
            android.view.View r0 = r7.contentView
            android.view.View r0 = r0.findViewById(r15)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            r1.bottomMargin = r8
            r0.setLayoutParams(r1)
        L_0x0218:
            return
        L_0x0219:
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$c r0 = r7.o
            if (r0 == 0) goto L_0x045f
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$c r0 = r7.o
            r0.onClick(r6)
            return
        L_0x0223:
            android.view.ViewGroup r0 = r7.containerView
            r0.requestFocus()
            return
        L_0x0229:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.f r0 = (com.bytedance.android.livesdk.chatroom.event.f) r0
            long r4 = r0.f10170c
            int r8 = r0.f10171d
            java.lang.String r15 = r0.f10169b
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r9] = r1
            r0[r13] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r16 = 6877(0x1add, float:9.637E-42)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class r17 = java.lang.Long.TYPE
            r1[r10] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r1[r9] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r1[r13] = r17
            java.lang.Class r17 = java.lang.Void.TYPE
            r18 = r1
            r1 = r23
            r11 = r4
            r4 = r16
            r5 = r18
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0299
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r9] = r1
            r0[r13] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6877(0x1add, float:9.637E-42)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x045f
        L_0x0299:
            boolean r0 = r23.isViewValid()
            if (r0 == 0) goto L_0x039e
            java.lang.Class<com.bytedance.android.livesdkapi.host.d> r0 = com.bytedance.android.livesdkapi.host.d.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.b.a(r0)
            com.bytedance.android.livesdkapi.host.d r0 = (com.bytedance.android.livesdkapi.host.d) r0
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x02b5
            r0 = 2131563904(0x7f0d1580, float:1.8753278E38)
            com.bytedance.android.livesdk.utils.ai.a((int) r0)
            goto L_0x045f
        L_0x02b5:
            com.bytedance.android.livesdk.chatroom.presenter.s r0 = r7.i
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r7.dataCenter
            java.lang.String r2 = "log_enter_live_source"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 5
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r1
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r11)
            r3[r9] = r2
            r2 = 0
            r3[r13] = r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3[r14] = r4
            r4 = 4
            r3[r4] = r15
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.chatroom.presenter.s.f11398a
            r19 = 0
            r20 = 5200(0x1450, float:7.287E-42)
            r4 = 5
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5[r10] = r4
            java.lang.Class r4 = java.lang.Long.TYPE
            r5[r9] = r4
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r4 = com.bytedance.android.live.base.model.user.User.class
            r5[r13] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r5[r14] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r6 = 4
            r5[r6] = r4
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r3
            r17 = r0
            r21 = r5
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r3 == 0) goto L_0x0344
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r10] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r4[r9] = r1
            r4[r13] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r4[r14] = r1
            r1 = 4
            r4[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r1 = com.bytedance.android.livesdk.chatroom.presenter.s.f11398a
            r11 = 0
            r12 = 5200(0x1450, float:7.287E-42)
            r2 = 5
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class r3 = java.lang.Long.TYPE
            r2[r9] = r3
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r3 = com.bytedance.android.live.base.model.user.User.class
            r2[r13] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r14] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r5 = 4
            r2[r5] = r3
            java.lang.Class r14 = java.lang.Void.TYPE
            r8 = r4
            r9 = r0
            r10 = r1
            r13 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x045f
        L_0x0344:
            com.bytedance.android.livesdk.gift.GiftManager r1 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            com.bytedance.android.livesdk.gift.model.b r1 = r1.findGiftById(r11)
            if (r1 == 0) goto L_0x039e
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.Class<com.bytedance.android.livesdkapi.host.h> r3 = com.bytedance.android.livesdkapi.host.h.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.utility.b.a(r3)
            com.bytedance.android.livesdkapi.host.h r3 = (com.bytedance.android.livesdkapi.host.h) r3
            com.bytedance.retrofit2.Retrofit r3 = r3.c()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi> r4 = com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi.class
            java.lang.Object r3 = r3.create(r4)
            com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi r3 = (com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi) r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r0.f11400c
            long r18 = r4.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r0.f11400c
            com.bytedance.android.live.base.model.user.User r4 = r4.getOwner()
            long r20 = r4.getId()
            r4 = r15
            r15 = r3
            r16 = r11
            r22 = r8
            io.reactivex.Observable r3 = r15.send(r16, r18, r20, r22)
            com.bytedance.android.live.core.rxutils.g r5 = com.bytedance.android.live.core.rxutils.i.a()
            io.reactivex.Observable r3 = r3.compose(r5)
            com.bytedance.android.livesdk.chatroom.presenter.t r5 = new com.bytedance.android.livesdk.chatroom.presenter.t
            r15 = r5
            r16 = r0
            r17 = r11
            r19 = r1
            r21 = r4
            r15.<init>(r16, r17, r19, r21)
            com.bytedance.android.livesdk.chatroom.presenter.u r1 = new com.bytedance.android.livesdk.chatroom.presenter.u
            r1.<init>(r0, r11)
            r3.subscribe(r5, r1)
        L_0x039e:
            return
        L_0x039f:
            android.view.ViewGroup r0 = r7.containerView
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$1 r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$1
            r1.<init>(r8)
            r0.post(r1)
            return
        L_0x03aa:
            r2 = r6
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.message.model.ab r0 = (com.bytedance.android.livesdk.message.model.ab) r0
            boolean r1 = r23.isViewValid()
            if (r1 == 0) goto L_0x045f
            java.lang.String r1 = "处理小礼物的连发特效"
            long r3 = r0.f16432d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.a(r1, r3, r2)
            r7.a((com.bytedance.android.livesdk.message.model.ab) r0)
            return
        L_0x03c6:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            boolean r1 = r23.isViewValid()
            if (r1 == 0) goto L_0x045f
            r7.a((com.bytedance.android.live.base.model.user.User) r0)
            return
        L_0x03d6:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6878(0x1ade, float:9.638E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03fa
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f12550a
            r3 = 0
            r4 = 6878(0x1ade, float:9.638E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x045f
        L_0x03fa:
            com.bytedance.android.livesdk.chatroom.viewmodule.VideoGiftWidget r9 = r7.f12554e
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.VideoGiftWidget.f12859a
            r14 = 0
            r15 = 7562(0x1d8a, float:1.0597E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r9
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0420
            java.lang.Object[] r8 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r0 = com.bytedance.android.livesdk.chatroom.viewmodule.VideoGiftWidget.f12859a
            r11 = 0
            r12 = 7562(0x1d8a, float:1.0597E-41)
            java.lang.Class[] r13 = new java.lang.Class[r10]
            java.lang.Class r14 = java.lang.Void.TYPE
            r10 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x045f
        L_0x0420:
            com.bytedance.android.livesdk.gift.effect.video.VideoGiftView r0 = r9.f12861c
            java.lang.Object[] r15 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r17 = com.bytedance.android.livesdk.gift.effect.video.VideoGiftView.f14964a
            r18 = 0
            r19 = 9624(0x2598, float:1.3486E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x044c
            java.lang.Object[] r15 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r17 = com.bytedance.android.livesdk.gift.effect.video.VideoGiftView.f14964a
            r18 = 0
            r19 = 9624(0x2598, float:1.3486E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0455
        L_0x044c:
            com.bytedance.android.livesdkapi.depend.d.a.a r1 = r0.i
            if (r1 == 0) goto L_0x0455
            com.bytedance.android.livesdkapi.depend.d.a.a r0 = r0.i
            r0.b()
        L_0x0455:
            com.bytedance.android.livesdkapi.depend.d.a.c r0 = r9.h
            r0.b()
            return
        L_0x045b:
            r23.c()
            return
        L_0x045f:
            return
        L_0x0460:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.onChanged(java.lang.Object):void");
    }

    private void a(User user, boolean z) {
        User user2;
        User user3 = user;
        if (PatchProxy.isSupport(new Object[]{user3, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12550a, false, 6880, new Class[]{User.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user3, Byte.valueOf(z)}, this, f12550a, false, 6880, new Class[]{User.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.f12552c != null && (this.n == null || !this.n.isShowing())) {
            com.bytedance.android.live.base.model.user.i a2 = ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a();
            if (a2 != null && a2.childrenManagerForbidWalletFunctions()) {
                com.bytedance.android.live.uikit.d.a.a(this.context, (int) C0906R.string.cqq);
            } else if (((com.bytedance.android.livesdkapi.host.d) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.d.class)).k()) {
                ai.a((int) C0906R.string.d_b);
            } else {
                this.f12553d = user3;
                boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
                ab abVar = ab.GIFT;
                if (this.dataCenter.has("data_gift_panel_type")) {
                    abVar = (ab) this.dataCenter.get("data_gift_panel_type");
                }
                ab abVar2 = abVar;
                Bundle bundle = (Bundle) this.dataCenter.get("data_gift_log_extra");
                String str = (String) this.dataCenter.get("log_enter_live_source");
                Activity activity = (Activity) this.context;
                Room room = this.f12552c;
                if (user3 == null) {
                    user2 = this.f12552c.getOwner();
                } else {
                    user2 = user3;
                }
                this.n = GiftDialogFragment.a(activity, room, user2, abVar2, this.f12551b, booleanValue, str, z);
                this.dataCenter.lambda$put$1$DataCenter("data_gift_group_id", Long.valueOf(this.g));
                this.n.f15149c = this.dataCenter;
                this.n.f15151e = new n.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12561a;

                    public final boolean a(Exception exc, Runnable runnable) {
                        if (PatchProxy.isSupport(new Object[]{exc, runnable}, this, f12561a, false, 6911, new Class[]{Exception.class, Runnable.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{exc, runnable}, this, f12561a, false, 6911, new Class[]{Exception.class, Runnable.class}, Boolean.TYPE)).booleanValue();
                        }
                        GiftWidget.this.a((Throwable) exc, runnable);
                        return GiftWidget.this.isViewValid();
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:24:0x0138  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean a(com.bytedance.android.livesdk.gift.model.i r19, int r20, boolean r21) {
                        /*
                            r18 = this;
                            r7 = r18
                            r15 = r19
                            r8 = 3
                            java.lang.Object[] r0 = new java.lang.Object[r8]
                            r17 = 0
                            r0[r17] = r15
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                            r14 = 1
                            r0[r14] = r1
                            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
                            r9 = 2
                            r0[r9] = r1
                            com.meituan.robust.ChangeQuickRedirect r2 = f12561a
                            java.lang.Class[] r5 = new java.lang.Class[r8]
                            java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                            r5[r17] = r1
                            java.lang.Class r1 = java.lang.Integer.TYPE
                            r5[r14] = r1
                            java.lang.Class r1 = java.lang.Boolean.TYPE
                            r5[r9] = r1
                            java.lang.Class r6 = java.lang.Boolean.TYPE
                            r3 = 0
                            r4 = 6910(0x1afe, float:9.683E-42)
                            r1 = r18
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x0068
                            java.lang.Object[] r0 = new java.lang.Object[r8]
                            r0[r17] = r15
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                            r0[r14] = r1
                            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
                            r0[r9] = r1
                            com.meituan.robust.ChangeQuickRedirect r2 = f12561a
                            r3 = 0
                            r4 = 6910(0x1afe, float:9.683E-42)
                            java.lang.Class[] r5 = new java.lang.Class[r8]
                            java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                            r5[r17] = r1
                            java.lang.Class r1 = java.lang.Integer.TYPE
                            r5[r14] = r1
                            java.lang.Class r1 = java.lang.Boolean.TYPE
                            r5[r9] = r1
                            java.lang.Class r6 = java.lang.Boolean.TYPE
                            r1 = r18
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            return r0
                        L_0x0068:
                            if (r21 == 0) goto L_0x012c
                            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget r13 = com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.this
                            java.lang.Object[] r0 = new java.lang.Object[r9]
                            r0[r17] = r15
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                            r0[r14] = r1
                            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.f12550a
                            r3 = 0
                            r4 = 6882(0x1ae2, float:9.644E-42)
                            java.lang.Class[] r5 = new java.lang.Class[r9]
                            java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                            r5[r17] = r1
                            java.lang.Class r1 = java.lang.Integer.TYPE
                            r5[r14] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r1 = r13
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x00af
                            java.lang.Object[] r0 = new java.lang.Object[r9]
                            r0[r17] = r15
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                            r0[r14] = r1
                            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.f12550a
                            r3 = 0
                            r4 = 6882(0x1ae2, float:9.644E-42)
                            java.lang.Class[] r5 = new java.lang.Class[r9]
                            java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                            r5[r17] = r1
                            java.lang.Class r1 = java.lang.Integer.TYPE
                            r5[r14] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r1 = r13
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            goto L_0x012c
                        L_0x00af:
                            boolean r0 = r13.isViewValid()
                            if (r0 == 0) goto L_0x012c
                            com.bytedance.android.livesdk.gift.impl.b r0 = r13.f12555f
                            if (r0 == 0) goto L_0x00c1
                            com.bytedance.android.livesdk.gift.impl.b r0 = r13.f12555f
                            boolean r0 = r0.isShowing()
                            if (r0 != 0) goto L_0x012c
                        L_0x00c1:
                            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
                            long r1 = r15.f15133e
                            com.bytedance.android.livesdk.gift.model.b r0 = r0.findGiftById(r1)
                            if (r0 == 0) goto L_0x012c
                            int r1 = r0.f15106e
                            if (r1 == r9) goto L_0x00d8
                            int r0 = r0.f15106e
                            r1 = 8
                            if (r0 == r1) goto L_0x00d8
                            goto L_0x012c
                        L_0x00d8:
                            com.bytedance.ies.sdk.widgets.DataCenter r0 = r13.dataCenter
                            java.lang.String r1 = "log_enter_live_source"
                            java.lang.Object r0 = r0.get(r1)
                            java.lang.String r0 = (java.lang.String) r0
                            com.bytedance.ies.sdk.widgets.DataCenter r1 = r13.dataCenter
                            java.lang.String r2 = "data_is_portrait"
                            java.lang.Object r1 = r1.get(r2)
                            java.lang.Boolean r1 = (java.lang.Boolean) r1
                            boolean r1 = r1.booleanValue()
                            com.bytedance.android.livesdk.gift.impl.b r2 = new com.bytedance.android.livesdk.gift.impl.b
                            android.content.Context r3 = r13.context
                            r9 = r3
                            android.app.Activity r9 = (android.app.Activity) r9
                            com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r13.f12552c
                            com.bytedance.android.live.base.model.user.User r11 = r13.f12553d
                            boolean r12 = r13.f12551b
                            r8 = r2
                            r3 = r13
                            r13 = r1
                            r1 = 1
                            r14 = r19
                            r4 = r15
                            r15 = r0
                            r16 = r20
                            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                            r3.f12555f = r2
                            com.bytedance.android.livesdk.gift.impl.b r0 = r3.f12555f
                            long r5 = r3.g
                            r0.f15063f = r5
                            com.bytedance.android.livesdk.gift.impl.b r0 = r3.f12555f
                            com.bytedance.ies.sdk.widgets.DataCenter r2 = r3.dataCenter
                            r0.f15060c = r2
                            com.bytedance.android.livesdk.gift.impl.b r0 = r3.f12555f
                            com.bytedance.android.livesdk.chatroom.viewmodule.ah r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.ah
                            r2.<init>(r3)
                            r0.f15061d = r2
                            com.bytedance.android.livesdk.gift.impl.b r0 = r3.f12555f
                            r0.setCanceledOnTouchOutside(r1)
                            com.bytedance.android.livesdk.gift.impl.b r0 = r3.f12555f
                            r0.show()
                            goto L_0x012e
                        L_0x012c:
                            r4 = r15
                            r1 = 1
                        L_0x012e:
                            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget r0 = com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.this
                            com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.dataCenter
                            boolean r0 = com.bytedance.android.livesdk.utils.j.b(r0)
                            if (r0 == 0) goto L_0x0173
                            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
                            long r2 = r4.f15133e
                            com.bytedance.android.livesdk.gift.model.b r0 = r0.findGiftById(r2)
                            java.lang.Class<com.bytedance.android.livesdkapi.c.a> r2 = com.bytedance.android.livesdkapi.c.a.class
                            com.bytedance.android.live.base.b r2 = com.bytedance.android.live.utility.b.a(r2)
                            com.bytedance.android.livesdkapi.c.a r2 = (com.bytedance.android.livesdkapi.c.a) r2
                            java.lang.String r3 = "live_ad"
                            java.lang.String r4 = "live_gift"
                            com.bytedance.android.livesdk.j.d$a r5 = com.bytedance.android.livesdk.j.d.a.a()
                            java.lang.String r6 = "amount"
                            if (r0 != 0) goto L_0x0158
                            r0 = 0
                            goto L_0x015a
                        L_0x0158:
                            int r0 = r0.f15107f
                        L_0x015a:
                            java.lang.String r0 = java.lang.String.valueOf(r0)
                            com.bytedance.android.livesdk.j.d$a r0 = r5.a((java.lang.String) r6, (java.lang.String) r0)
                            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget r5 = com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.this
                            com.bytedance.ies.sdk.widgets.DataCenter r5 = r5.dataCenter
                            java.util.Map r5 = com.bytedance.android.livesdk.utils.j.c(r5)
                            com.bytedance.android.livesdk.j.d$a r0 = r0.a(r5)
                            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f15712b
                            r2.a((boolean) r1, (java.lang.String) r3, (java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.String>) r0)
                        L_0x0173:
                            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget r0 = com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.this
                            boolean r0 = r0.isViewValid()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.AnonymousClass3.a(com.bytedance.android.livesdk.gift.model.i, int, boolean):boolean");
                    }
                };
                if (this.context instanceof FragmentActivity) {
                    this.n.show(((FragmentActivity) this.context).getSupportFragmentManager(), "GiftDialogFragment");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("live_source", this.k.opt("live_source"));
                        jSONObject.put("request_id", this.f12552c.getRequestId());
                        jSONObject.put("log_pb", this.f12552c.getLog_pb());
                    } catch (Exception unused) {
                    }
                    com.bytedance.android.livesdk.j.f.a(this.context).a("enableGift", "show", this.f12552c.getId(), 0, jSONObject);
                    HashMap hashMap = new HashMap();
                    if (bundle != null) {
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                                hashMap.put(str2, String.valueOf(obj));
                            }
                        }
                    }
                    com.bytedance.android.livesdk.j.a.a().a("gift_show", hashMap, Room.class, new j().b("live_interact").a("live_detail"), new k());
                }
            }
        }
    }
}
