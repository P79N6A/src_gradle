package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.presenter.aa;
import com.bytedance.android.livesdk.chatroom.presenter.x;
import com.bytedance.android.livesdk.chatroom.presenter.z;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.relay.a.c;
import com.bytedance.android.livesdk.gift.relay.view.CountDownAnimationView;
import com.bytedance.android.livesdk.message.model.y;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class GiftRelayAnimWidget extends LiveRecyclableWidget implements View.OnClickListener, x.a, a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12528a;

    /* renamed from: b  reason: collision with root package name */
    public View f12529b;

    /* renamed from: c  reason: collision with root package name */
    public CountDownAnimationView f12530c;

    /* renamed from: d  reason: collision with root package name */
    public View f12531d;

    /* renamed from: e  reason: collision with root package name */
    public View f12532e;

    /* renamed from: f  reason: collision with root package name */
    public SimpleDraweeView f12533f;
    public View g;
    public TextView h;
    public TextView i;
    boolean j;
    User k;
    private SimpleDraweeView l;
    private ObjectAnimator m;
    private CountDownTimer n;
    private SimpleDraweeView o;
    private HSImageView p;
    private TextView q;
    private View r;
    private HSImageView s;
    private a t;
    private boolean u;
    private boolean v;
    private x w;
    private long x;
    private long y;
    private boolean z;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12528a, false, 6851, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12528a, false, 6851, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12528a, false, 6852, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12528a, false, 6852, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.ain;
    }

    public final void a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f12528a, false, 6846, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f12528a, false, 6846, new Class[]{Message.class}, Void.TYPE);
        } else if (message != null) {
            switch (message.what) {
                case 0:
                    this.v = false;
                    this.l.setVisibility(8);
                    return;
                case 1:
                    this.u = false;
                    this.o.setVisibility(8);
                    d(15);
                    return;
                case 2:
                    a(false);
                    break;
            }
        }
    }

    public final void a(y yVar) {
        if (PatchProxy.isSupport(new Object[]{yVar}, this, f12528a, false, 6848, new Class[]{y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar}, this, f12528a, false, 6848, new Class[]{y.class}, Void.TYPE);
        } else if (yVar != null) {
            this.x = yVar.f16709b;
            a(yVar.i, yVar.f16711d, true);
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.relay.a.a aVar) {
        com.bytedance.android.livesdk.gift.relay.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f12528a, false, 6849, new Class[]{com.bytedance.android.livesdk.gift.relay.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f12528a, false, 6849, new Class[]{com.bytedance.android.livesdk.gift.relay.a.a.class}, Void.TYPE);
            return;
        }
        a(aVar2, 0, false);
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12528a, false, 6836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12528a, false, 6836, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.cancel();
            this.n = null;
        }
        if (this.m != null && this.m.isRunning()) {
            this.m.cancel();
        }
        if (this.f12529b != null) {
            this.f12529b.animate().cancel();
            this.f12529b.setVisibility(8);
        }
        if (this.f12531d != null) {
            this.f12531d.animate().cancel();
            this.f12531d.setVisibility(8);
        }
        if (this.f12532e != null) {
            this.f12532e.setVisibility(8);
        }
        a(true);
        if (this.g != null) {
            this.g.animate().cancel();
            this.g.setVisibility(8);
        }
        if (this.l != null) {
            this.v = false;
            this.l.setVisibility(8);
        }
        if (this.o != null) {
            this.u = false;
            this.o.setVisibility(8);
        }
        if (this.t != null) {
            this.t.removeMessages(0);
            this.t.removeMessages(1);
        }
        if (this.w != null) {
            this.w.d();
        }
        this.k = null;
        this.j = false;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6837, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6837, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.v) {
            this.t.removeMessages(0);
            this.t.sendEmptyMessageDelayed(0, (long) i2);
        } else {
            this.v = true;
            this.l.setVisibility(0);
            this.l.setController(((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri("asset://com.ss.android.ies.live.sdk/double_prize.webp").setAutoPlayAnimations(true)).build());
            this.t.sendEmptyMessageDelayed(0, (long) i2);
        }
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6838, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6838, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.u) {
            this.t.removeMessages(1);
        }
        this.u = true;
        this.f12530c.setVisibility(4);
        this.n.cancel();
        this.o.setVisibility(0);
        this.o.setController(((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri("asset://com.ss.android.ies.live.sdk/freeze.webp").setAutoPlayAnimations(true)).build());
        this.t.sendEmptyMessageDelayed(1, (long) i2);
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6839, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6839, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j = true;
        this.dataCenter.lambda$put$1$DataCenter("data_is_gift_relay_showing", Boolean.TRUE);
        this.f12529b.setX(-UIUtils.dip2Px(this.context, 160.0f));
        this.f12529b.setVisibility(0);
        d(i2);
        this.f12529b.animate().translationX(0.0f).setDuration(333).start();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12528a, false, 6847, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12528a, false, 6847, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.ak1) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_gift_relay_dialog", "endless_pallet");
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12528a, false, 6842, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12528a, false, 6842, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.h.setText(this.context.getResources().getString(C0906R.string.cyb));
        this.i.setText(str);
        this.f12532e.setVisibility(8);
        this.f12531d.setVisibility(0);
        this.f12533f.setVisibility(0);
        this.f12533f.setController(((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri("asset://com.ss.android.ies.live.sdk/world_notify.webp").setAutoPlayAnimations(true)).build());
        this.g.setX(-UIUtils.dip2Px(this.context, 157.0f));
        this.g.setVisibility(0);
        this.g.animate().translationX(0.0f).setDuration(333).start();
        this.z = true;
        this.t.sendEmptyMessageDelayed(2, 650);
    }

    private void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6845, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12528a, false, 6845, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!this.u) {
            if (this.m != null && this.m.isRunning()) {
                this.m.cancel();
            }
            if (this.n != null) {
                this.n.cancel();
            }
            this.f12530c.setTime(i2);
            long j2 = ((long) i2) * 1000;
            AnonymousClass4 r0 = new CountDownTimer(j2, 1000) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12542a;

                public final void onFinish() {
                    if (PatchProxy.isSupport(new Object[0], this, f12542a, false, 6857, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12542a, false, 6857, new Class[0], Void.TYPE);
                        return;
                    }
                    GiftRelayAnimWidget giftRelayAnimWidget = GiftRelayAnimWidget.this;
                    if (PatchProxy.isSupport(new Object[0], giftRelayAnimWidget, GiftRelayAnimWidget.f12528a, false, 6844, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], giftRelayAnimWidget, GiftRelayAnimWidget.f12528a, false, 6844, new Class[0], Void.TYPE);
                        return;
                    }
                    giftRelayAnimWidget.j = false;
                    giftRelayAnimWidget.dataCenter.lambda$put$1$DataCenter("data_is_gift_relay_showing", Boolean.FALSE);
                    giftRelayAnimWidget.k = null;
                    giftRelayAnimWidget.f12529b.animate().translationX(-UIUtils.dip2Px(giftRelayAnimWidget.context, 160.0f)).setListener(new Animator.AnimatorListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f12538a;

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f12538a, false, 6854, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f12538a, false, 6854, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            GiftRelayAnimWidget.this.f12529b.animate().setListener(null);
                            GiftRelayAnimWidget.this.f12529b.setVisibility(8);
                        }
                    }).setDuration(333).start();
                    giftRelayAnimWidget.f12531d.animate().translationX(-UIUtils.dip2Px(giftRelayAnimWidget.context, 157.0f)).setListener(new Animator.AnimatorListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f12540a;

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f12540a, false, 6855, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f12540a, false, 6855, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            GiftRelayAnimWidget.this.f12531d.animate().setListener(null);
                            GiftRelayAnimWidget.this.f12529b.setVisibility(8);
                            GiftRelayAnimWidget.this.f12532e.setVisibility(8);
                            GiftRelayAnimWidget.this.f12533f.setVisibility(8);
                        }
                    }).setDuration(333).start();
                }

                public final void onTick(long j) {
                    long j2 = j;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f12542a, false, 6856, new Class[]{Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f12542a, false, 6856, new Class[]{Long.TYPE}, Void.TYPE);
                        return;
                    }
                    double d2 = (double) j2;
                    Double.isNaN(d2);
                    int ceil = (int) Math.ceil(d2 / 1000.0d);
                    int i = 15;
                    if (ceil <= 15) {
                        i = ceil;
                    }
                    GiftRelayAnimWidget.this.f12530c.setTime(i);
                }
            };
            this.n = r0;
            this.n.start();
            this.f12530c.setVisibility(0);
            this.f12530c.setCountDownTime(i2);
            this.m = ObjectAnimator.ofFloat(this.f12530c, "progress", new float[]{360.0f, 0.0f}).setDuration(j2);
            this.m.start();
        }
    }

    public void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12528a, false, 6834, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12528a, false, 6834, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12529b = this.contentView.findViewById(C0906R.id.ak1);
        this.l = (SimpleDraweeView) this.contentView.findViewById(C0906R.id.a6t);
        this.f12530c = (CountDownAnimationView) this.contentView.findViewById(C0906R.id.a0f);
        this.o = (SimpleDraweeView) this.contentView.findViewById(C0906R.id.aiq);
        this.p = (HSImageView) this.contentView.findViewById(C0906R.id.akb);
        this.q = (TextView) this.contentView.findViewById(C0906R.id.akh);
        this.f12531d = this.contentView.findViewById(C0906R.id.akf);
        this.f12532e = this.contentView.findViewById(C0906R.id.akc);
        this.r = this.contentView.findViewById(C0906R.id.akd);
        this.f12533f = (SimpleDraweeView) this.contentView.findViewById(C0906R.id.ake);
        this.g = this.contentView.findViewById(C0906R.id.akg);
        this.h = (TextView) this.contentView.findViewById(C0906R.id.auj);
        this.i = (TextView) this.contentView.findViewById(C0906R.id.auk);
        this.s = (HSImageView) this.contentView.findViewById(C0906R.id.auc);
        this.t = new a(this);
        this.w = new x();
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12528a, false, 6835, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12528a, false, 6835, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12529b.setOnClickListener(this);
        this.w.a((x.a) this);
        Room room = (Room) this.dataCenter.get("data_room", null);
        if (room != null) {
            c giftRelayInfo = GiftManager.inst().getGiftRelayInfo(0);
            x xVar = this.w;
            long j2 = 0;
            long longValue = ((Long) this.dataCenter.get("data_room_id", 0L)).longValue();
            long ownerUserId = room.getOwnerUserId();
            if (giftRelayInfo != null) {
                j2 = giftRelayInfo.f15438c;
            }
            Object[] objArr2 = {new Long(longValue), new Long(ownerUserId), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = x.f11418a;
            Class[] clsArr = {Long.TYPE, Long.TYPE, Long.TYPE};
            long j3 = ownerUserId;
            if (PatchProxy.isSupport(objArr2, xVar, changeQuickRedirect, false, 5211, clsArr, Void.TYPE)) {
                x xVar2 = xVar;
                PatchProxy.accessDispatch(new Object[]{new Long(longValue), new Long(j3), new Long(j2)}, xVar2, x.f11418a, false, 5211, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
                return;
            }
            xVar.f11419b = ((GiftRetrofitApi) ((h) b.a(h.class)).c().create(GiftRetrofitApi.class)).checkFreeCellStatus(longValue, j3, j2).compose(i.a()).subscribe(new com.bytedance.android.livesdk.chatroom.presenter.y(xVar), z.f11423b, aa.f11198b);
        }
    }

    private void a(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12528a, false, 6843, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f12528a, false, 6843, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.z = false;
        View view = this.r;
        if (z2) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.f12533f.setVisibility(8);
    }

    private void b(final String str, final String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f12528a, false, 6841, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f12528a, false, 6841, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.g.setVisibility(0);
        this.g.animate().alpha(0.0f).setDuration(333).setListener(new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12534a;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f12534a, false, 6853, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12534a, false, 6853, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                GiftRelayAnimWidget.this.h.setText(GiftRelayAnimWidget.this.context.getResources().getString(C0906R.string.cya, new Object[]{str}));
                GiftRelayAnimWidget.this.i.setText(str2);
                GiftRelayAnimWidget.this.g.animate().setListener(null);
                GiftRelayAnimWidget.this.g.setX(-UIUtils.dip2Px(GiftRelayAnimWidget.this.context, 157.0f));
                GiftRelayAnimWidget.this.g.animate().alpha(1.0f).translationX(0.0f).setDuration(333).start();
            }
        }).start();
    }

    private void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f12528a, false, 6840, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f12528a, false, 6840, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.h.setText(this.context.getResources().getString(C0906R.string.cya, new Object[]{str}));
        this.i.setText(str2);
        this.f12531d.setX(-UIUtils.dip2Px(this.context, 157.0f));
        this.r.setVisibility(8);
        this.g.setVisibility(0);
        this.f12531d.setVisibility(0);
        this.f12532e.setVisibility(0);
        this.f12531d.animate().translationX(0.0f).setDuration(333).start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.bytedance.android.livesdk.gift.relay.a.a r21, long r22, boolean r24) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r9)
            r13 = 1
            r0[r13] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r24)
            r14 = 2
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f12528a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.livesdk.gift.relay.a.a> r1 = com.bytedance.android.livesdk.gift.relay.a.a.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6850(0x1ac2, float:9.599E-42)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r9)
            r0[r13] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r24)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f12528a
            r3 = 0
            r4 = 6850(0x1ac2, float:9.599E-42)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.livesdk.gift.relay.a.a> r1 = com.bytedance.android.livesdk.gift.relay.a.a.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0064:
            if (r8 != 0) goto L_0x0067
            return
        L_0x0067:
            long r0 = r8.h
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0070
            return
        L_0x0070:
            android.widget.TextView r2 = r7.q
            android.content.Context r3 = r7.context
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131563461(0x7f0d13c5, float:1.875238E38)
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r6.append(r11)
            java.lang.String r11 = " "
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r5[r12] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            r2.setText(r3)
            if (r24 == 0) goto L_0x00a0
            long r2 = r7.x
            goto L_0x00a2
        L_0x00a0:
            long r2 = r8.f15430b
        L_0x00a2:
            com.bytedance.android.livesdk.gift.GiftManager r4 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            com.bytedance.android.livesdk.gift.model.b r2 = r4.findGiftById(r2)
            if (r2 != 0) goto L_0x00ad
            return
        L_0x00ad:
            com.bytedance.android.live.core.widget.HSImageView r3 = r7.p
            com.bytedance.android.live.base.model.ImageModel r4 = r2.f15103b
            com.bytedance.android.livesdk.chatroom.f.b.a((com.bytedance.android.live.core.widget.HSImageView) r3, (com.bytedance.android.live.base.model.ImageModel) r4)
            com.bytedance.android.live.core.widget.HSImageView r3 = r7.s
            com.bytedance.android.live.base.model.ImageModel r2 = r2.f15103b
            com.bytedance.android.livesdk.chatroom.f.b.a((com.bytedance.android.live.core.widget.HSImageView) r3, (com.bytedance.android.live.base.model.ImageModel) r2)
            long r2 = r8.l
            r4 = 5000(0x1388, double:2.4703E-320)
            r15 = 6000(0x1770, double:2.9644E-320)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x00d3
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x00d3
            long r15 = r15 - r0
            java.lang.String r2 = java.lang.String.valueOf(r15)
            r7.a((java.lang.String) r2)
            goto L_0x014e
        L_0x00d3:
            r17 = 10
            int r6 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r6 < 0) goto L_0x014e
            com.bytedance.android.live.base.model.user.User r2 = r8.k
            if (r2 != 0) goto L_0x00de
            return
        L_0x00de:
            java.lang.String r3 = r2.getNickName()
            if (r3 == 0) goto L_0x0101
            int r6 = r3.length()
            r11 = 6
            if (r6 <= r11) goto L_0x0101
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r11 = 5
            java.lang.String r3 = r3.substring(r12, r11)
            r6.append(r3)
            java.lang.String r3 = "..."
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        L_0x0101:
            long r12 = r8.l
            com.bytedance.android.live.base.model.user.User r6 = r7.k
            if (r6 == 0) goto L_0x0135
            long r9 = r7.y
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0114
            long r4 = r7.y
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x0114
            goto L_0x0135
        L_0x0114:
            com.bytedance.android.live.base.model.user.User r4 = r7.k
            long r4 = r4.getId()
            long r9 = r2.getId()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x012b
            java.lang.String r4 = java.lang.String.valueOf(r12)
            r7.b(r3, r4)
        L_0x0129:
            r4 = 1
            goto L_0x014b
        L_0x012b:
            android.widget.TextView r3 = r7.i
            java.lang.String r4 = java.lang.String.valueOf(r12)
            r3.setText(r4)
            goto L_0x0129
        L_0x0135:
            boolean r4 = r7.z
            if (r4 == 0) goto L_0x0143
            com.bytedance.android.livesdkapi.depend.c.a r4 = r7.t
            r4.removeMessages(r14)
            r4 = 1
            r7.a((boolean) r4)
            goto L_0x0144
        L_0x0143:
            r4 = 1
        L_0x0144:
            java.lang.String r5 = java.lang.String.valueOf(r12)
            r7.a(r3, r5)
        L_0x014b:
            r7.k = r2
            goto L_0x014f
        L_0x014e:
            r4 = 1
        L_0x014f:
            r7.y = r0
            long r0 = r8.g
            long r2 = r8.f15431c
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r0 = (int) r0
            boolean r1 = r7.j
            if (r1 == 0) goto L_0x0162
            r7.d(r0)
            goto L_0x0165
        L_0x0162:
            r7.c(r0)
        L_0x0165:
            if (r24 == 0) goto L_0x018a
            boolean r0 = r8.i
            if (r0 == 0) goto L_0x0175
            r0 = 100
            r2 = r22
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0177
            r0 = 1
            goto L_0x0178
        L_0x0175:
            r2 = r22
        L_0x0177:
            r0 = 0
        L_0x0178:
            boolean r1 = r8.j
            if (r1 == 0) goto L_0x0185
            r5 = 500(0x1f4, double:2.47E-321)
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0185
            r19 = 1
            goto L_0x0187
        L_0x0185:
            r19 = 0
        L_0x0187:
            r1 = r19
            goto L_0x018e
        L_0x018a:
            boolean r0 = r8.i
            boolean r1 = r8.j
        L_0x018e:
            if (r0 == 0) goto L_0x019f
            long r2 = r8.f15433e
            long r4 = r8.f15431c
            long r2 = r2 - r4
            int r0 = (int) r2
            r2 = 4500(0x1194, float:6.306E-42)
            if (r0 <= r2) goto L_0x019c
            r0 = 4500(0x1194, float:6.306E-42)
        L_0x019c:
            r7.b(r0)
        L_0x019f:
            if (r1 == 0) goto L_0x01aa
            long r0 = r8.f15434f
            long r2 = r8.f15431c
            long r0 = r0 - r2
            int r0 = (int) r0
            r7.a((int) r0)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftRelayAnimWidget.a(com.bytedance.android.livesdk.gift.relay.a.a, long, boolean):void");
    }
}
