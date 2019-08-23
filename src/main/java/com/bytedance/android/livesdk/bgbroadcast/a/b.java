package com.bytedance.android.livesdk.bgbroadcast.a;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.bgbroadcast.n;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.ui.ah;
import com.bytedance.android.livesdk.chatroom.ui.an;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.lang.a;

public final class b extends com.bytedance.android.livesdk.bgbroadcast.b implements RoomPlayer.a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f9165f;
    private RoomPlayer g;
    private View h;
    private View i;
    private an j;
    private ah k;
    private boolean l;
    private TextureView m;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9166a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f9167c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9166a, false, 3355, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9166a, false, 3355, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f9166a, false, 3357, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f9166a, false, 3357, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9166a, false, 3356, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9166a, false, 3356, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f9166a, true, 3354, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f9166a, true, 3354, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("ThirdPartyUiStrategy.java", a.class);
            f9167c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.bgbroadcast.thirdparty.ThirdPartyUiStrategy$ToolbarCopyUrlBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 206);
        }

        private a() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f9166a, false, 3353, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f9166a, false, 3353, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f9167c, this, this, view));
            b.this.n();
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    public final void a(Exception exc) {
    }

    public final void a(Object obj) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final boolean g() {
        return false;
    }

    public final boolean h() {
        return false;
    }

    public final void l() {
    }

    public final void m() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        if (this.f9173c.b_() && !this.l) {
            n();
        }
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3342, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(0);
        this.h.setVisibility(0);
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3343, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(8);
        this.h.setVisibility(8);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3348, new Class[0], Void.TYPE);
            return;
        }
        this.i.postDelayed(new c(this), 2000);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3349, new Class[0], Void.TYPE);
            return;
        }
        this.l = true;
        q();
        if (this.j != null && this.j.isShowing()) {
            this.j.dismiss();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3344, new Class[0], Void.TYPE);
            return;
        }
        if (!this.l) {
            p();
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3345, new Class[0], Void.TYPE);
            return;
        }
        q();
        this.f9173c.c(false);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3340, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.j != null && this.j.isShowing()) {
            this.j.dismiss();
        }
        this.j = null;
        if (this.g != null) {
            this.g.stop(true);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3351, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new an(this.f9174d, this.f9172b.getStreamUrl().a(), this.f9172b);
        }
        if (!this.j.isShowing()) {
            this.j.show();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3339, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.f9174d.findViewById(C0906R.id.j9);
        this.h = this.f9174d.findViewById(C0906R.id.c7n);
        p();
        this.m = (TextureView) this.f9174d.findViewById(C0906R.id.dt9);
        RoomPlayer roomPlayer = new RoomPlayer(this.f9172b.buildPullUrl(), this.f9172b.getStreamType(), this.f9172b.getStreamSrConfig(), this.m, this, this.f9174d, this.f9172b.getSdkParams());
        this.g = roomPlayer;
        this.g.start();
        this.l = false;
        j.b().a(f.PUSH_URL, (d.a) new a(this, (byte) 0));
    }

    public final void onEvent(s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, f9165f, false, 3347, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, f9165f, false, 3347, new Class[]{s.class}, Void.TYPE);
            return;
        }
        if (sVar.f10195a == 27) {
            if (PatchProxy.isSupport(new Object[0], this, f9165f, false, 3350, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9165f, false, 3350, new Class[0], Void.TYPE);
                return;
            }
            if (this.k == null) {
                this.k = new ah(this.f9174d);
            }
            if (!this.k.isShowing()) {
                this.k.show();
            }
        }
    }

    public b(Room room, n nVar) {
        super(room, nVar);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9165f, false, 3346, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9165f, false, 3346, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        if (i2 > i3) {
            marginLayoutParams.width = UIUtils.getScreenWidth(this.f9174d);
            marginLayoutParams.height = (marginLayoutParams.width * i3) / i2;
            marginLayoutParams.topMargin = (int) UIUtils.dip2Px(this.f9174d, 96.0f);
            this.m.setLayoutParams(marginLayoutParams);
            this.f9173c.a(i2, i3);
        }
    }
}
