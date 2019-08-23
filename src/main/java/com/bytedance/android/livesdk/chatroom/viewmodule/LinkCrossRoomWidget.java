package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.annotation.StringRes;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.o;
import com.bytedance.android.livesdk.chatroom.interact.c.cl;
import com.bytedance.android.livesdk.chatroom.interact.z;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.c.d;
import com.bytedance.b.a.a.f.b;
import com.bytedance.b.a.a.f.c;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkCrossRoomWidget extends LiveWidget implements Observer<KVData>, cl.a, d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12600a;
    private static int h;
    private static int i;
    private static int j;
    private LinkPKWidget A;
    private c B;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12601b;

    /* renamed from: c  reason: collision with root package name */
    Room f12602c;

    /* renamed from: d  reason: collision with root package name */
    cl f12603d;

    /* renamed from: e  reason: collision with root package name */
    public d f12604e;

    /* renamed from: f  reason: collision with root package name */
    public AbsInteractionFragment.d f12605f;
    public boolean g;
    private int k;
    private LinkCrossRoomDataHolder l;
    private z m;
    private ViewGroup n;
    private ImageView o;
    private TextView p;
    private FrameLayout q;
    private View r;
    private Guideline s;
    private TextView t;
    private TextView u;
    private com.bytedance.android.livesdk.chatroom.c.d v;
    private com.bytedance.android.livesdk.chatroom.c.c<TextView> w;
    private com.bytedance.android.livesdk.chatroom.c.c<VHeadView> x;
    private com.bytedance.android.livesdk.chatroom.c.c<HSImageView> y;
    private m z;

    static abstract class SubWidget extends LiveWidget {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12606a;

        /* renamed from: b  reason: collision with root package name */
        LinkCrossRoomDataHolder f12607b;

        /* renamed from: c  reason: collision with root package name */
        Room f12608c;

        /* renamed from: d  reason: collision with root package name */
        boolean f12609d;

        public void onCreate() {
            if (PatchProxy.isSupport(new Object[0], this, f12606a, false, 7037, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12606a, false, 7037, new Class[0], Void.TYPE);
                return;
            }
            super.onCreate();
            this.f12607b = LinkCrossRoomDataHolder.a();
            this.f12608c = (Room) this.dataCenter.get("data_room");
            this.f12609d = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        }

        SubWidget(View view, ViewGroup viewGroup) {
            this.contentView = view;
            this.containerView = viewGroup;
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12600a, false, 7021, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7021, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12600a, false, 7022, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12600a, false, 7022, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.amu;
    }

    public static int i() {
        return h;
    }

    public static int j() {
        return i;
    }

    public static int k() {
        return j;
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12600a, false, 7001, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12600a, false, 7001, new Class[]{c.class}, Void.TYPE);
        } else if (!this.f12601b && isViewValid() && cVar.f19214d != null && !cVar.f19214d.isEmpty()) {
            b bVar = cVar.f19214d.get(0);
            if (bVar != null) {
                this.B = cVar;
                this.g = true;
                if (this.l.f9032f <= 0) {
                    Iterator<b> it2 = cVar.f19214d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().f19207c != TTLiveSDKContext.getHostService().k().b()) {
                                this.l.f9032f = bVar.f19207c;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f12603d.a();
                float f2 = (((float) this.k) * 1.0f) / ((float) cVar.g);
                double d2 = (double) cVar.f19216f;
                double d3 = bVar.f19209e;
                Double.isNaN(d2);
                double d4 = d2 * d3;
                double d5 = (double) f2;
                Double.isNaN(d5);
                h = (int) (d4 * d5);
                double d6 = bVar.g;
                double d7 = (double) cVar.f19216f;
                Double.isNaN(d7);
                Double.isNaN(d5);
                j = (int) (d6 * d7 * d5);
                this.dataCenter.lambda$put$1$DataCenter("cmd_adjust_video_interact_stream_bottom", Integer.valueOf(h + j));
                a(h, j);
                if (bVar.h == 0) {
                    a(0);
                } else if (bVar.h == 1) {
                    a((int) C0906R.string.d6u);
                }
                a("SEI Updated");
                a("SEI Debug Stream Height", ",marginTop:" + h + ",height:" + j + ",region.getHeight()=" + bVar.g + ",region.getWidth()=" + bVar.f19210f + ",region.getY()=" + bVar.f19209e);
            }
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12600a, false, 7005, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f12600a, false, 7005, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z2 ? 0 : C0906R.string.d6u);
        if (a.a()) {
            if (this.f12601b) {
                this.q.setVisibility(z2 ? 0 : 4);
            }
            this.u.setText(C0906R.string.d6u);
            int i2 = 8;
            this.u.setVisibility(z2 ? 8 : 0);
            HSImageView hSImageView = (HSImageView) this.y.f9861c;
            if (!z2) {
                i2 = 0;
            }
            hSImageView.setVisibility(i2);
        }
        StringBuilder sb = new StringBuilder("Guest entered");
        sb.append(z2 ? "foreground" : "background");
        a(sb.toString());
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12600a, false, 7017, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12600a, false, 7017, new Class[]{String.class}, Void.TYPE);
            return;
        }
        b(str);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7006, new Class[0], Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.cz8, 1);
        this.f12603d.c();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7007, new Class[0], Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.d7w);
        this.f12603d.c();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7008, new Class[0], Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.cz9);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7009, new Class[0], Void.TYPE);
            return;
        }
        a(0);
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7012, new Class[0], Void.TYPE);
            return;
        }
        l();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 6996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 6996, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f12601b) {
            this.f12603d.a(false);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 6995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 6995, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f12601b) {
            this.f12603d.a(true);
        }
    }

    private void m() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7015, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.core.utils.a.b.b() && com.bytedance.android.live.core.utils.a.b.a() == 0) {
            z2 = true;
        }
        this.k = ac.c();
        if (z2) {
            this.k = (int) (((float) ac.b()) * 0.5625f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentView.getLayoutParams();
        if (z2) {
            layoutParams.width = this.k;
            layoutParams.gravity = 17;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        this.contentView.setLayoutParams(layoutParams);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 6998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 6998, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f12603d.d();
            this.v.a();
            this.l.removeObserver(this);
            this.l.c();
        } catch (Throwable unused) {
            com.bytedance.android.live.core.c.a.c("DATA_CENTER", "should crash at onDestroy()");
        }
        this.q.removeAllViews();
        this.q.setBackgroundColor(0);
        this.q.setVisibility(8);
        super.onDestroy();
    }

    private void l() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7013, new Class[0], Void.TYPE);
            return;
        }
        if (LinkCrossRoomDataHolder.a.CONNECTION_SUCCEED.compareTo((LinkCrossRoomDataHolder.a) this.l.get("data_link_state", LinkCrossRoomDataHolder.a.DISABLED)) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ai.a((int) C0906R.string.cz7);
        } else if (this.A != null) {
            this.A.f();
        } else {
            if (this.z == null) {
                this.z = new m.a(this.context).a((CharSequence) ac.a((int) C0906R.string.d4x)).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new ay(this)).b(1, (int) C0906R.string.cpz, az.f13004b).d((int) C0906R.string.d4x).a();
                this.z.f18500c.setVisibility(8);
            }
            if (!this.z.isShowing()) {
                this.z.show();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7004, new Class[0], Void.TYPE);
            return;
        }
        if (this.A == null) {
            enableSubWidgetManager();
            this.A = new LinkPKWidget(this.contentView, this.containerView);
            this.subWidgetManager.load(this.A);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 7014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 7014, new Class[0], Void.TYPE);
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.l.f9032f);
        userProfileEvent.interactLogLabel = "right_anchor";
        this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", userProfileEvent);
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(this.f12602c.getOwnerUserId()));
        if (this.l.i == 0) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
        }
        com.bytedance.android.livesdk.j.a.a().a("right_anchor_click", hashMap, new j().b("live").f("click").a("live_detail").e("live_detail"), LinkCrossRoomDataHolder.a().b(), Room.class);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 6994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 6994, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f12602c = (Room) this.dataCenter.get("data_room");
        this.f12601b = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.l = LinkCrossRoomDataHolder.a();
        boolean z2 = true;
        this.l.f9029c = true;
        if (this.l.lifecycleOwner == null) {
            com.bytedance.android.live.core.c.a.c("DATA_CENTER", "LifecycleOwner == null! ");
            return;
        }
        if (this.l != LinkCrossRoomDataHolder.f9028b) {
            this.l.observeForever("data_link_state", this).observeForever("cmd_log_link", this);
        }
        this.k = ac.c();
        if (!com.bytedance.android.live.core.utils.a.b.b() || com.bytedance.android.live.core.utils.a.b.a() != 0) {
            z2 = false;
        }
        if (z2) {
            this.k = (int) (((float) ac.b()) * 0.5625f);
        }
        double d2 = (double) ((((float) this.k) * 1.0f) / 360.0f);
        Double.isNaN(d2);
        h = (int) (d2 * 108.0d);
        int i2 = this.k / 2;
        i = i2;
        j = (int) (((((float) i2) * 1.0f) / 9.0f) * 13.0f);
        m();
        this.q.setVisibility(0);
        this.u = (TextView) this.contentView.findViewById(C0906R.id.dcj);
        this.r = this.contentView.findViewById(C0906R.id.z1);
        this.s = (Guideline) this.contentView.findViewById(C0906R.id.akt);
        this.n = (ViewGroup) this.contentView.findViewById(C0906R.id.bac);
        this.o = (ImageView) this.contentView.findViewById(C0906R.id.b40);
        this.p = (TextView) this.contentView.findViewById(C0906R.id.dkg);
        if (PatchProxy.isSupport(new Object[0], this, f12600a, false, 6999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12600a, false, 6999, new Class[0], Void.TYPE);
        } else {
            this.v = new com.bytedance.android.livesdk.chatroom.c.d(this.l, this.contentView);
            if (!(this.l.lifecycleOwner == null || this.l.lifecycleOwner.getLifecycle() == null)) {
                this.w = this.v.a(C0906R.id.dfb).a(new aw(this)).a("data_guest_user", new ax(this)).a();
                this.x = this.v.a(C0906R.id.ane).a(new bc(this)).a("data_guest_user", new bd(this)).a();
                this.y = this.v.a(C0906R.id.b4j).a(new be(this)).a("data_guest_user", new bf(this)).a();
            }
        }
        if (this.f12601b) {
            a(h, j);
        } else {
            this.f12604e = new d(this);
            this.u.setVisibility(8);
        }
        this.f12603d = new cl(this.dataCenter, this.m);
        this.f12603d.a((cl.a) this);
        if (this.f12601b) {
            this.f12603d.a();
        }
        if (this.f12601b || this.l.i <= 0) {
            if (!a.a()) {
                this.n.setVisibility(0);
            }
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        b();
    }

    public final boolean c(int i2) {
        if (this.f12601b || i2 != 2) {
            return false;
        }
        return true;
    }

    private void a(Enum enumR) {
        if (PatchProxy.isSupport(new Object[]{enumR}, this, f12600a, false, 7018, new Class[]{Enum.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{enumR}, this, f12600a, false, 7018, new Class[]{Enum.class}, Void.TYPE);
            return;
        }
        b(enumR.name());
    }

    private void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12600a, false, 7019, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f12600a, false, 7019, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, "");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f12600a, false, 6997, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f12600a, false, 6997, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        m();
        if (this.B != null) {
            a(this.B);
        }
        b(h, j);
    }

    private void a(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12600a, false, 7002, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12600a, false, 7002, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q.removeView(this.t);
        if (i2 == 0) {
            ((HSImageView) this.y.f9861c).setVisibility(8);
            this.u.setVisibility(8);
            return;
        }
        this.t = new TextView(this.context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, j);
        layoutParams.topMargin = h;
        layoutParams.leftMargin = i;
        this.t.setLayoutParams(layoutParams);
        this.t.setGravity(17);
        if (i2 == C0906R.string.cza) {
            int i3 = -1;
            if (a.a()) {
                i3 = Color.parseColor("#57ffffff");
            }
            this.t.setTextColor(i3);
        } else {
            int i4 = -16777216;
            if (a.a()) {
                i4 = Color.parseColor("#57ffffff");
            }
            this.t.setTextColor(i4);
        }
        this.t.setTextSize(16.0f);
        this.t.setText(i2);
        this.q.addView(this.t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r0.equals("data_pk_state") != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.bytedance.ies.sdk.widgets.KVData r7 = (com.bytedance.ies.sdk.widgets.KVData) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12600a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6993(0x1b51, float:9.799E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12600a
            r3 = 0
            r4 = 6993(0x1b51, float:9.799E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            if (r7 == 0) goto L_0x00b6
            java.lang.String r0 = r7.getKey()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r7.getData()
            if (r0 != 0) goto L_0x0043
            goto L_0x00b6
        L_0x0043:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -612633460: goto L_0x0077;
                case 436641052: goto L_0x006d;
                case 872172481: goto L_0x0063;
                case 1227596154: goto L_0x0059;
                case 1505611330: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0081
        L_0x0050:
            java.lang.String r2 = "data_pk_state"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0059:
            java.lang.String r2 = "cmd_log_link"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r8 = 4
            goto L_0x0082
        L_0x0063:
            java.lang.String r2 = "data_link_state"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r8 = 0
            goto L_0x0082
        L_0x006d:
            java.lang.String r2 = "data_pk_steal_tower_state"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r8 = 2
            goto L_0x0082
        L_0x0077:
            java.lang.String r2 = "data_pk_result"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r8 = 3
            goto L_0x0082
        L_0x0081:
            r8 = -1
        L_0x0082:
            switch(r8) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0090;
                case 2: goto L_0x0090;
                case 3: goto L_0x0090;
                case 4: goto L_0x0086;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x00b5
        L_0x0086:
            java.lang.Object r0 = r7.getData()
            java.lang.String r0 = (java.lang.String) r0
            r10.b(r0)
            goto L_0x00b5
        L_0x0090:
            java.lang.Object r0 = r7.getData()
            java.lang.Enum r0 = (java.lang.Enum) r0
            r10.a((java.lang.Enum) r0)
            return
        L_0x009a:
            java.lang.Object r0 = r7.getData()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$a r0 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a) r0
            r10.a((java.lang.Enum) r0)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$a r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a.CONNECTION_SUCCEED
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b5
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r10.l
            int r0 = r0.i
            if (r0 <= 0) goto L_0x00b5
            r10.b()
            return
        L_0x00b5:
            return
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget.onChanged(java.lang.Object):void");
    }

    public LinkCrossRoomWidget(z zVar, FrameLayout frameLayout) {
        this.m = zVar;
        this.q = frameLayout;
    }

    private void b(int i2, int i3) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12600a, false, 7016, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12600a, false, 7016, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        o oVar = new o(0);
        oVar.f10188b = Integer.valueOf(i2 + i3 + ac.a(64.0f));
        if (this.l.i > 0) {
            z2 = true;
        }
        oVar.f10189c = z2;
        this.dataCenter.lambda$put$1$DataCenter("cmd_pk_state_change", oVar);
    }

    private void a(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12600a, false, 7003, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12600a, false, 7003, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i2, i3);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams.height = i3;
        this.r.setLayoutParams(layoutParams);
        if ((a.a() || a.d() || a.g()) && this.f12601b && g.a(getContext())) {
            i4 = ac.d() + i2;
        } else {
            i4 = i2;
        }
        this.s.setGuidelineBegin(i4);
        if (!this.f12601b) {
            ((VHeadView) this.x.f9861c).setVisibility(0);
            ((TextView) this.w.f9861c).setVisibility(0);
        }
        if (this.A != null) {
            this.A.e();
        }
        if (this.r.getVisibility() == 4) {
            this.r.setVisibility(0);
            if (StringUtils.isEmpty(this.f12602c.getLinkMicInfo())) {
                com.bytedance.android.livesdk.j.c.g gVar = new com.bytedance.android.livesdk.j.c.g();
                if (this.f12601b) {
                    if (this.f12602c.getId() == this.l.f9030d) {
                        gVar.a(this.f12602c.getOwner().getId()).b(this.l.f9032f);
                    } else {
                        gVar.a(this.l.f9032f).b(this.f12602c.getOwner().getId());
                    }
                    com.bytedance.android.livesdk.j.a.a().a("connection_success", new j().a("live_detail").f("other").b("live"), gVar, LinkCrossRoomDataHolder.a(), Room.class);
                    return;
                }
                if (!a.f()) {
                    com.bytedance.android.livesdk.j.a.a().a("connection_transform", new j().b("live").f("other").a("live_detail"), gVar, LinkCrossRoomDataHolder.a(), Room.class);
                }
                if (this.l.i > 0) {
                    com.bytedance.android.livesdk.j.a.a().a("pk_transform", new j().b("live_function").a("live_detail"), gVar, LinkCrossRoomDataHolder.a(), Room.class);
                }
            }
        }
    }

    private void a(String str, String str2) {
        String str3;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f12600a, false, 7020, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f12600a, false, 7020, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        new StringBuilder();
        if (!this.f12601b) {
            str3 = "audience";
        } else if (this.l.h) {
            str3 = "inviter";
        } else {
            str3 = "invitee";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", str);
        hashMap.put("role", str3);
        hashMap.put("channel_id", Long.valueOf(this.l.f9030d));
        hashMap.put("room_id", Long.valueOf(this.f12602c.getId()));
        hashMap.put("guest_uid", Long.valueOf(this.l.f9032f));
        hashMap.put("start_time", Long.valueOf(this.l.k));
        hashMap.put("duration", Integer.valueOf(this.l.i));
        hashMap.put("pk_id", Long.valueOf(this.l.f9031e));
        hashMap.put("link_mic_id", Integer.valueOf(this.l.n));
        hashMap.put("guest_link_mic_id", Integer.valueOf(this.l.g));
        hashMap.put("vendor", this.f12603d.h().name());
        hashMap.put(PushConstants.EXTRA, str2);
        com.bytedance.android.livesdk.j.c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }

    public final void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f12600a, false, 7010, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f12600a, false, 7010, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f12605f != null) {
            this.f12605f.a(j4, j5);
        }
    }
}
