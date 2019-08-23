package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.common.c;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.f;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class FollowGuideWidget extends LiveWidget implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12503a;
    private static final /* synthetic */ a.C0900a l;

    /* renamed from: b  reason: collision with root package name */
    public Room f12504b;

    /* renamed from: c  reason: collision with root package name */
    public a f12505c;

    /* renamed from: d  reason: collision with root package name */
    public View f12506d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f12507e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f12508f;
    public TextView g;
    public HSImageView h;
    private boolean i = true;
    private TextView j;
    private View.OnAttachStateChangeListener k = new View.OnAttachStateChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12509a;

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12509a, false, 6807, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12509a, false, 6807, new Class[]{View.class}, Void.TYPE);
                return;
            }
            d.INSTANCE.onMessageFinish();
        }
    };

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12511a;

        /* renamed from: b  reason: collision with root package name */
        private View f12512b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12513c;

        public final void dismiss() {
            if (PatchProxy.isSupport(new Object[0], this, f12511a, false, 6811, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12511a, false, 6811, new Class[0], Void.TYPE);
            } else if (this.f12513c) {
                super.dismiss();
            }
        }

        public final void onAttachedToWindow() {
            if (PatchProxy.isSupport(new Object[0], this, f12511a, false, 6812, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12511a, false, 6812, new Class[0], Void.TYPE);
                return;
            }
            super.onAttachedToWindow();
            this.f12513c = true;
        }

        public final void onDetachedFromWindow() {
            if (PatchProxy.isSupport(new Object[0], this, f12511a, false, 6813, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12511a, false, 6813, new Class[0], Void.TYPE);
                return;
            }
            super.onDetachedFromWindow();
            this.f12513c = false;
        }

        public final void onStart() {
            if (PatchProxy.isSupport(new Object[0], this, f12511a, false, 6809, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12511a, false, 6809, new Class[0], Void.TYPE);
                return;
            }
            super.onStart();
            if (getWindow() != null) {
                getWindow().setLayout(-1, -1);
            }
        }

        public final void show() {
            if (PatchProxy.isSupport(new Object[0], this, f12511a, false, 6810, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12511a, false, 6810, new Class[0], Void.TYPE);
            } else if ((!(getContext() instanceof Activity) || !((Activity) getContext()).isFinishing()) && !isShowing()) {
                super.show();
            }
        }

        public final void onCreate(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{bundle}, this, f12511a, false, 6808, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle}, this, f12511a, false, 6808, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.onCreate(bundle);
            setContentView(this.f12512b);
            setCanceledOnTouchOutside(true);
        }

        public a(Context context, boolean z, View view) {
            super(context, z);
            this.f12512b = view;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12503a, false, 6795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12503a, false, 6795, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12503a, true, 6804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12503a, true, 6804, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("FollowGuideWidget.java", FollowGuideWidget.class);
        l = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 139);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12503a, false, 6794, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12503a, false, 6794, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (PatchProxy.isSupport(new Object[0], this, f12503a, false, 6797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12503a, false, 6797, new Class[0], Void.TYPE);
        } else if (this.f12506d == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            frameLayout.setOnClickListener(new ab(this));
            this.f12506d = View.inflate(this.context, C0906R.layout.ag1, frameLayout);
            this.f12506d.removeOnAttachStateChangeListener(this.k);
            this.f12506d.addOnAttachStateChangeListener(this.k);
            this.h = (HSImageView) this.f12506d.findViewById(C0906R.id.ayr);
            this.f12507e = (TextView) this.f12506d.findViewById(C0906R.id.dfb);
            this.g = (TextView) this.f12506d.findViewById(C0906R.id.dbv);
            this.f12508f = (TextView) this.f12506d.findViewById(C0906R.id.dd2);
            this.j = (TextView) this.f12506d.findViewById(C0906R.id.o2);
            this.f12505c = new a(this.context, this.i, frameLayout);
        }
        if (PatchProxy.isSupport(new Object[0], this, f12503a, false, 6798, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12503a, false, 6798, new Class[0], Void.TYPE);
            return;
        }
        this.j.setOnClickListener(this);
    }

    public FollowGuideWidget(boolean z) {
        this.i = z;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12503a, false, 6800, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12503a, false, 6800, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(l, this, this, view));
        if (this.f12504b == null) {
            this.f12505c.dismiss();
            return;
        }
        if (view.equals(this.j)) {
            TTLiveSDKContext.getHostService().k().a(((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.a) f.a().a(this.f12504b.author().getId())).a(this.f12504b.getRequestId())).b("live_detail")).c("live")).b(this.f12504b.getId())).d(this.f12504b.getLabels())).c()).subscribe();
            if (PatchProxy.isSupport(new Object[0], this, f12503a, false, 6802, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12503a, false, 6802, new Class[0], Void.TYPE);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("scene_id", "1003");
                hashMap.put("request_page", "follow_card");
                hashMap.put("request_id", this.f12504b.getRequestId());
                hashMap.put("to_user_id", String.valueOf(this.f12504b.author().getId()));
                hashMap.put("anchor_id", String.valueOf(this.f12504b.author().getId()));
                hashMap.put("room_id", String.valueOf(this.f12504b.getId()));
                a(hashMap, "enter_from_merge", "enter_method", "action_type");
                com.bytedance.android.livesdk.j.a.a().a("livesdk_follow", hashMap, new Object[0]);
                if (j.b(this.dataCenter)) {
                    ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", j.c(this.dataCenter));
                }
            }
            this.f12505c.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.Map<java.lang.String, java.lang.String> r20, java.lang.String... r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f12503a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 6803(0x1a93, float:9.533E-42)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f12503a
            r15 = 0
            r16 = 6803(0x1a93, float:9.533E-42)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            com.bytedance.android.livesdk.j.a r2 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r3 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r2 = r2.a((java.lang.Class) r3)
            com.bytedance.android.livesdk.j.b.k r2 = (com.bytedance.android.livesdk.j.b.k) r2
            if (r2 != 0) goto L_0x0054
            return
        L_0x0054:
            int r3 = r1.length
            if (r3 > 0) goto L_0x0058
            return
        L_0x0058:
            int r3 = r1.length
        L_0x0059:
            if (r10 >= r3) goto L_0x0075
            r4 = r1[r10]
            java.util.Map r5 = r2.a()
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0072
            java.util.Map r5 = r2.a()
            java.lang.Object r5 = r5.get(r4)
            r0.put(r4, r5)
        L_0x0072:
            int r10 = r10 + 1
            goto L_0x0059
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.a(java.util.Map, java.lang.String[]):void");
    }
}
