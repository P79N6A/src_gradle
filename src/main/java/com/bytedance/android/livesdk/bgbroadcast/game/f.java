package com.bytedance.android.livesdk.bgbroadcast.game;

import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.ag;
import com.bytedance.android.livesdk.bgbroadcast.b;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.ui.ah;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j;
import com.bytedance.android.livesdk.chatroom.widget.n;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.e;
import com.bytedance.android.livesdk.floatwindow.g;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.android.livesdk.floatwindow.i;
import com.bytedance.android.livesdk.floatwindow.ui.GameMsgView;
import com.bytedance.android.livesdk.floatwindow.ui.c;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;

public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f9206f;
    Dialog g;
    public boolean h;
    public Disposable i;
    public GameMsgView j;
    boolean k;
    public n l;
    private Dialog m;
    private ah n;
    private boolean o;
    private Disposable p;
    private boolean q;
    private BroadcastReceiver r;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9226a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f9227c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9226a, false, 3335, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9226a, false, 3335, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f9226a, false, 3337, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f9226a, false, 3337, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9226a, false, 3336, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9226a, false, 3336, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f9226a, true, 3334, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f9226a, true, 3334, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("GameUiStrategy.java", a.class);
            f9227c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.bgbroadcast.game.GameUiStrategy$ToolbarMessagePushBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 620);
        }

        private a() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f9226a, false, 3333, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f9226a, false, 3333, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f9227c, this, this, view));
            if (f.this.l != null) {
                f.this.l.dismiss();
                f.this.l = null;
            }
            f.this.l = new n(f.this.f9174d, ((Boolean) com.bytedance.android.livesdk.w.b.X.a()).booleanValue(), ((Boolean) com.bytedance.android.livesdk.w.b.Y.a()).booleanValue(), f.this.h);
            f.this.l.show();
        }

        /* synthetic */ a(f fVar, byte b2) {
            this();
        }
    }

    public final void f() {
    }

    public final boolean g() {
        return true;
    }

    public final boolean h() {
        return this.h;
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3308, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3308, new Class[0], Void.TYPE);
            return;
        }
        this.m = new m.a(this.f9174d, 0).d((int) C0906R.string.dja).c((int) C0906R.string.d93).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9211a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9211a, false, 3322, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9211a, false, 3322, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                i.b(f.this.f9174d);
                dialogInterface.dismiss();
            }
        }).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9209a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9209a, false, 3321, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9209a, false, 3321, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dialogInterface.dismiss();
            }
        }).a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3301, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        this.f9174d.registerReceiver(this.r, intentFilter);
        j.b().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.MESSAGE_PUSH, (d.a) new a(this, (byte) 0));
        if (com.bytedance.android.live.uikit.a.a.f()) {
            j.a().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.MESSAGE_PUSH, (d.a) new a(this, (byte) 0));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3303, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3303, new Class[0], Void.TYPE);
            return;
        }
        this.p = Observable.timer(500, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new g(this), h.f9232b);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3306, new Class[0], Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = new m.a(this.f9174d, 1).d((int) C0906R.string.dja).c((int) C0906R.string.dj_).b(2, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f9207a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9207a, false, 3320, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9207a, false, 3320, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).a();
        }
        if (!this.g.isShowing()) {
            this.g.show();
        }
        if (i.a(this.f9174d)) {
            l();
            return;
        }
        this.o = false;
        k();
        if (!this.m.isShowing()) {
            this.m.show();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3307, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        if (this.g != null && this.g.isShowing()) {
            l.a(this.g);
        }
        if (this.m != null && this.m.isShowing()) {
            l.a(this.m);
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3310, new Class[0], Void.TYPE);
            return;
        }
        g gVar = (g) h.a("control_view");
        if (gVar != null) {
            if (this.i != null) {
                this.i.dispose();
            }
            com.bytedance.android.livesdk.floatwindow.f fVar = gVar.f14548b;
            if (fVar == null || fVar.a() <= 0) {
                this.i = Observable.timer(3000, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new j(this, gVar), k.f9239b);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3302, new Class[0], Void.TYPE);
            return;
        }
        if (h.a("control_view") != null) {
            h.a("control_view").b();
        }
        if (h.a("msg_view") != null) {
            h.a("msg_view").b();
        }
        if (!((Boolean) com.bytedance.android.livesdk.w.b.U.a()).booleanValue() && !this.o) {
            if (i.a(this.f9174d)) {
                l();
            } else if (!this.m.isShowing() && (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.a()).intValue() != 1 || !this.k)) {
                k();
                this.m.show();
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3304, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.g != null && this.g.isShowing()) {
            l.a(this.g);
        }
        if (this.l != null) {
            this.l.dismiss();
        }
        if (!((Boolean) com.bytedance.android.livesdk.w.b.U.a()).booleanValue()) {
            if (this.m != null && this.m.isShowing()) {
                l.a(this.m);
            }
            if (this.i != null) {
                this.i.dispose();
            }
            try {
                com.bytedance.android.livesdk.floatwindow.b a2 = h.a("control_view");
                if (a2 != null && a2.c()) {
                    a2.dismiss();
                }
            } catch (Throwable unused) {
            }
            try {
                com.bytedance.android.livesdk.floatwindow.b a3 = h.a("msg_view");
                if (a3 != null && a3.c()) {
                    a3.dismiss();
                }
            } catch (Throwable unused2) {
            }
        }
        if (this.p != null) {
            this.p.dispose();
        }
        this.f9174d.unregisterReceiver(this.r);
        this.g = null;
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3309, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3309, new Class[0], Void.TYPE);
            return;
        }
        if (!this.q) {
            try {
                if (h.a("control_view") != null && h.a("control_view").c()) {
                    h.a("control_view").dismiss();
                }
            } catch (Throwable unused) {
            }
            try {
                if (h.a("msg_view") != null && h.a("msg_view").c()) {
                    h.a("msg_view").dismiss();
                }
            } catch (Throwable unused2) {
            }
            if (this.f9174d != null) {
                if (Build.VERSION.SDK_INT < 17 || !this.f9174d.isDestroyed()) {
                    final c cVar = new c(this.f9174d);
                    this.j = new GameMsgView(this.f9174d);
                    if (this.f9173c.f()) {
                        this.j.setPresenter(this.f9173c.j());
                    }
                    h.a(ac.e()).a((View) cVar).a("control_view").a((int) UIUtils.dip2Px(ac.e(), 220.0f)).b((int) UIUtils.dip2Px(ac.e(), 40.0f)).a(0, 0.1f).b(1, 0.5f).c(2).a(0, 0).a(300, (TimeInterpolator) new AccelerateDecelerateInterpolator()).a(true).a((e) new e() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f9213a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f9213a, false, 3324, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f9213a, false, 3324, new Class[0], Void.TYPE);
                                return;
                            }
                            f.this.j();
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f9213a, false, 3325, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f9213a, false, 3325, new Class[0], Void.TYPE);
                                return;
                            }
                            g gVar = (g) h.a("control_view");
                            if (gVar != null) {
                                c cVar = (c) gVar.d();
                                if (PatchProxy.isSupport(new Object[0], cVar, c.f14608a, false, 9144, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], cVar, c.f14608a, false, 9144, new Class[0], Void.TYPE);
                                } else if (cVar.f14612e.getVisibility() == 0) {
                                    cVar.a();
                                } else {
                                    if (PatchProxy.isSupport(new Object[0], cVar, c.f14608a, false, 9143, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], cVar, c.f14608a, false, 9143, new Class[0], Void.TYPE);
                                    } else {
                                        cVar.f14612e.setVisibility(0);
                                    }
                                }
                                float screenWidth = ((float) UIUtils.getScreenWidth(ac.e())) - UIUtils.dip2Px(ac.e(), 220.0f);
                                if (cVar.b() && ((float) gVar.f14548b.a()) > screenWidth) {
                                    gVar.f14548b.a((int) screenWidth);
                                }
                                if (!cVar.b()) {
                                    f.this.j();
                                }
                            }
                        }

                        public final void a(int i, int i2) {
                            float f2;
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f9213a, false, 3323, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f9213a, false, 3323, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (f.this.i != null) {
                                f.this.i.dispose();
                            }
                            if (cVar.b()) {
                                f2 = 220.0f;
                            } else {
                                f2 = 38.0f;
                            }
                            f.this.a(1, i, i2, (int) f2);
                        }
                    }).a();
                    h.a(ac.e()).a((View) this.j).a("msg_view").c(2).a((int) UIUtils.dip2Px(ac.e(), 280.0f)).b((int) UIUtils.dip2Px(ac.e(), 24.0f)).a(0, 0.1f).b(1, 0.1f).a(0, 0).a(300, (TimeInterpolator) new AccelerateDecelerateInterpolator()).a((e) new e() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f9216a;

                        public final void a() {
                        }

                        public final void b() {
                        }

                        public final void a(int i, int i2) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f9216a, false, 3326, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f9216a, false, 3326, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            f.this.a(2, i, i2, 0);
                        }
                    }).a(true).a();
                    cVar.setOnViewClickListener(new c.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f9218a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f9218a, false, 3327, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f9218a, false, 3327, new Class[0], Void.TYPE);
                                return;
                            }
                            f.this.f9173c.b(true);
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f9218a, false, 3330, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f9218a, false, 3330, new Class[0], Void.TYPE);
                                return;
                            }
                            f.this.f9173c.m();
                        }

                        public final void a(boolean z) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9218a, false, 3328, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9218a, false, 3328, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else if (z) {
                                f.this.f9173c.k();
                            } else {
                                f.this.f9173c.l();
                            }
                        }

                        public final void b(boolean z) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9218a, false, 3329, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9218a, false, 3329, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else if (z) {
                                com.bytedance.android.livesdk.w.b.W.a(0);
                                h.a("msg_view").a();
                            } else {
                                com.bytedance.android.livesdk.w.b.W.a(1);
                                h.a("msg_view").b();
                            }
                        }
                    });
                    this.j.setOnViewClickListener(i.f9234b);
                    this.q = true;
                }
            }
        }
    }

    public final void onEvent(s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, f9206f, false, 3305, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, f9206f, false, 3305, new Class[]{s.class}, Void.TYPE);
            return;
        }
        if (sVar.f10195a == 27) {
            if (PatchProxy.isSupport(new Object[0], this, f9206f, false, 3312, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9206f, false, 3312, new Class[0], Void.TYPE);
                return;
            }
            if (this.n == null) {
                this.n = new ah(this.f9174d);
            }
            if (!this.n.isShowing()) {
                this.n.show();
            }
        }
    }

    public f(Room room, com.bytedance.android.livesdk.bgbroadcast.n nVar) {
        super(room, nVar);
        this.h = true;
        this.o = true;
        this.k = true;
        this.r = new GameUiStrategy$1(this);
        this.h = this.f9174d.getIntent().getBooleanExtra("hotsoon.intent.extra.IS_LANDSCAPE", true);
        if (this.h) {
            this.f9174d.setRequestedOrientation(0);
            ag.a(this.f9174d);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        String str;
        float f2;
        float f3;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f9206f, false, 3311, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f9206f, false, 3311, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i6 == 1) {
            str = "control_view";
        } else {
            str = "msg_view";
        }
        Context e2 = ac.e();
        if (i6 == 1) {
            f2 = 220.0f;
        } else {
            f2 = 280.0f;
        }
        int dip2Px = (int) UIUtils.dip2Px(e2, f2);
        Context e3 = ac.e();
        if (i6 == 1) {
            f3 = 40.0f;
        } else {
            f3 = 24.0f;
        }
        g gVar = (g) h.a(str);
        int screenWidth = UIUtils.getScreenWidth(ac.e());
        int screenHeight = UIUtils.getScreenHeight(ac.e());
        int dip2Px2 = (int) UIUtils.dip2Px(ac.e(), 46.0f);
        int dip2Px3 = screenHeight - ((int) UIUtils.dip2Px(e3, f3));
        int dip2Px4 = (int) (((float) dip2Px3) - UIUtils.dip2Px(ac.e(), 46.0f));
        if (i5 > 0) {
            dip2Px = i5;
        }
        int i9 = screenWidth - dip2Px;
        if (i8 < UIUtils.getStatusBarHeight(ac.e()) * 2) {
            gVar.f14548b.b(dip2Px2);
        }
        if (i8 > dip2Px3) {
            gVar.f14548b.b(dip2Px4);
        }
        if (i7 < 0) {
            gVar.f14548b.a(0);
        }
        if (i7 > i9) {
            gVar.f14548b.a(i9);
        }
    }
}
