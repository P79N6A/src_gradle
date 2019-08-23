package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.chatroom.event.af;
import com.bytedance.android.livesdk.chatroom.presenter.n;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.g.c;
import com.bytedance.android.livesdk.gift.l;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.w.e;
import com.bytedance.android.livesdk.widget.d;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public final class at extends FrameLayout implements n.a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11868a;
    private int A;
    private int B;
    private WeakHandler C;
    private boolean D;
    private boolean E;
    private boolean F;
    private TextView G;
    private a H;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f11869b;

    /* renamed from: c  reason: collision with root package name */
    public Dialog f11870c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11871d;

    /* renamed from: e  reason: collision with root package name */
    public n f11872e;

    /* renamed from: f  reason: collision with root package name */
    public DataCenter f11873f;
    public Room g;
    public boolean h;
    public boolean i;
    public Activity j;
    public boolean k;
    public String l;
    public Runnable m;
    public Runnable n;
    private int o;
    private AutoRTLImageView p;
    private d q;
    private ObjectAnimator r;
    private View s;
    private TextView t;
    private ObjectAnimator u;
    private Dialog v;
    private Dialog w;
    private boolean x;
    private int y;
    private int z;

    public interface a {
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5710, new Class[0], Void.TYPE);
            return;
        }
        if (this.G != null) {
            ViewParent parent = this.G.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.G);
            }
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5712, new Class[0], Void.TYPE);
            return;
        }
        a(this.f11872e.g);
        this.f11872e.g();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5708, new Class[0], Void.TYPE);
            return;
        }
        if (this.f11871d) {
            ai.a((int) C0906R.string.d2r);
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5716, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.j.a.a().a("shortcut_gift_show", Room.class, new j().a("live_detail").c("bottom_tab").b("live").f("other"));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5701, new Class[0], Void.TYPE);
        } else if (this.f11871d && this.f11872e.a()) {
            ai.a((int) C0906R.string.dje);
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.a()).intValue() == 1) {
                f();
                return;
            }
            Activity a2 = com.bytedance.android.live.core.utils.d.a(getContext());
            if (a2 != null) {
                ((IHostApp) b.a(IHostApp.class)).a(a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5702, new Class[0], Void.TYPE);
            return;
        }
        if (this.j instanceof FragmentActivity) {
            ((com.bytedance.android.live.f.b) b.a(com.bytedance.android.live.f.b.class)).showRechargeDialogInH5((FragmentActivity) this.j, this.h, "shortcut_gift", this.f11873f, null);
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5715, new Class[0], Void.TYPE);
            return;
        }
        this.f11871d = false;
        this.f11872e.d();
        removeCallbacks(this.n);
        if (this.w != null && this.w.isShowing()) {
            ay.a(this.w);
        }
        if (this.v != null && this.v.isShowing()) {
            ay.a(this.v);
        }
        if (this.f11870c != null && this.f11870c.isShowing()) {
            ay.a(this.f11870c);
        }
        this.j = null;
        this.f11873f = null;
        this.x = false;
        this.D = false;
        this.i = false;
        this.E = false;
        this.F = false;
        this.B = this.o;
        this.C.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5703, new Class[0], Void.TYPE);
        } else if (this.f11871d && this.i) {
            if (this.h) {
                this.f11873f.lambda$put$1$DataCenter("data_has_fast_gift", Boolean.FALSE);
                this.x = true;
            } else if (!this.x && this.f11872e.a()) {
                this.x = true;
                com.bytedance.android.livesdk.chatroom.f.b.b(this.p, this.f11872e.f11376c.f15103b, this.z, this.z, 0);
                this.f11873f.lambda$put$1$DataCenter("data_has_fast_gift", Boolean.TRUE);
                postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11884a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f11884a, false, 5731, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f11884a, false, 5731, new Class[0], Void.TYPE);
                            return;
                        }
                        if (at.this.f11871d && com.bytedance.android.live.uikit.a.a.d() && ((com.bytedance.android.livesdkapi.d) b.a(com.bytedance.android.livesdkapi.d.class)).a(e.NEED_FAST_GIFT_HINT)) {
                            int[] iArr = new int[2];
                            at.this.getLocationOnScreen(iArr);
                            at.this.f11870c = new as(at.this.getContext(), iArr, at.this.getWidth());
                            at.this.f11870c.setOnDismissListener(new DialogInterface.OnDismissListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f11886a;

                                public final void onDismiss(DialogInterface dialogInterface) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f11886a, false, 5732, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f11886a, false, 5732, new Class[]{DialogInterface.class}, Void.TYPE);
                                        return;
                                    }
                                    at.this.f11870c = null;
                                    at.this.removeCallbacks(at.this.n);
                                }
                            });
                            at.this.f11870c.show();
                            at.this.postDelayed(at.this.n, 3000);
                            ((com.bytedance.android.livesdkapi.d) b.a(com.bytedance.android.livesdkapi.d.class)).a((d.a) e.NEED_FAST_GIFT_HINT, false);
                        }
                    }
                }, 500);
                i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5700, new Class[0], Void.TYPE);
        } else if (((com.bytedance.android.livesdkapi.host.d) b.a(com.bytedance.android.livesdkapi.host.d.class)).k()) {
            ai.a((int) C0906R.string.d_b);
        } else {
            if (!((com.bytedance.android.live.f.b) b.a(com.bytedance.android.live.f.b.class)).walletCenter().b(this.f11872e.e())) {
                String c2 = ((com.bytedance.android.livesdkapi.host.d) b.a(com.bytedance.android.livesdkapi.host.d.class)).c();
                if (!"test".equals(c2) && !"local_test".equals(c2)) {
                    a();
                    return;
                }
            }
            if (this.f11871d && this.f11872e.a() && !this.f11872e.f11378e) {
                this.f11872e.a(getContext());
            }
        }
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5714, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f11871d = true;
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5693, new Class[0], Void.TYPE);
        } else {
            b(true);
            this.q = new com.bytedance.android.livesdk.widget.d(getContext());
            this.q.setLayoutParams(new ViewGroup.LayoutParams(this.y, this.y));
            this.q.setVisibility(8);
            addView(this.q);
            this.s = new View(getContext());
            this.s.setLayoutParams(new ViewGroup.LayoutParams(this.y, this.y));
            this.s.setBackgroundResource(2130841184);
            this.s.setVisibility(8);
            addView(this.s);
            this.t = new TextView(getContext());
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 32.0f);
            int dip2Px2 = (int) UIUtils.dip2Px(getContext(), 2.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dip2Px, dip2Px);
            layoutParams.topMargin = dip2Px2;
            layoutParams.leftMargin = dip2Px2;
            this.t.setLayoutParams(layoutParams);
            this.t.setBackgroundResource(2130841481);
            this.t.setTextSize(16.0f);
            this.t.setGravity(17);
            this.t.setTextColor(-1);
            this.t.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11878a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f11878a, false, 5728, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f11878a, false, 5728, new Class[]{View.class}, Void.TYPE);
                    } else if (at.this.f11871d && !at.this.f11872e.f11378e) {
                        at.this.d();
                    }
                }
            });
            this.t.setVisibility(8);
            addView(this.t);
            this.p = new AutoRTLImageView(getContext());
            int dip2Px3 = (int) UIUtils.dip2Px(getContext(), 5.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.z, this.z);
            layoutParams2.topMargin = dip2Px3;
            layoutParams2.leftMargin = dip2Px3;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginStart(dip2Px3);
            }
            this.p.setLayoutParams(layoutParams2);
            RoundingParams roundingParams = new GenericDraweeHierarchyBuilder(getResources()).build().getRoundingParams();
            if (roundingParams != null) {
                roundingParams.setCornersRadius((float) this.A);
            }
            this.p.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11880a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f11880a, false, 5729, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f11880a, false, 5729, new Class[]{View.class}, Void.TYPE);
                    } else if (at.this.f11871d && !at.this.f11872e.f11378e && (at.this.f11869b == null || !at.this.f11869b.isRunning())) {
                        if (!at.this.f11872e.f()) {
                            if (at.this.f11869b == null) {
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(at.this, "scaleX", new float[]{1.0f, 1.3f, 1.0f});
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(at.this, "scaleY", new float[]{1.0f, 1.3f, 1.0f});
                                at.this.f11869b = new AnimatorSet();
                                at.this.f11869b.setInterpolator(new LinearInterpolator());
                                at.this.f11869b.setDuration(300);
                                at.this.f11869b.playTogether(new Animator[]{ofFloat, ofFloat2});
                            }
                            at.this.f11869b.start();
                            at.this.postDelayed(at.this.m, 300);
                            return;
                        }
                        at.this.d();
                    }
                }
            });
            addView(this.p);
        }
        this.f11872e.a((n.a) this);
        b();
        ((ab) com.bytedance.android.livesdk.u.a.a().a(c.class).as(com.bytedance.android.live.core.rxutils.autodispose.e.a((View) this))).a((Consumer<? super T>) new Consumer<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11888a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f11888a, false, 5733, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f11888a, false, 5733, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                at.this.onEvent(cVar);
            }
        });
    }

    public final void d() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5696, new Class[0], Void.TYPE);
            return;
        }
        i a2 = ((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().a();
        if (a2 != null && a2.childrenManagerForbidWalletFunctions()) {
            com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.cqq);
        } else if (this.f11871d && this.f11872e.a() && !this.f11872e.f11378e) {
            if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5717, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5717, new Class[0], Void.TYPE);
            } else {
                com.bytedance.android.livesdk.j.a.a().a("shortcut_gift_click", Room.class, new j().b("live").f("click").a("live_detail").c("bottom_tab"));
            }
            if (!((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().c()) {
                ((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().a(getContext(), com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.der)).a(-1).d("live_detail").e("enableGift").c("bottom_tab").a()).subscribe((Observer<? super T>) new g<Object>());
            } else if (!((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().a(h.GIFT)) {
                if (!this.E || !com.bytedance.android.live.uikit.a.a.g()) {
                    if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5697, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5697, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        User user = (User) this.f11873f.get("data_user_in_room");
                        com.bytedance.android.livesdkapi.i.c cVar = (com.bytedance.android.livesdkapi.i.c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.a();
                        if (!com.bytedance.android.live.uikit.a.a.a() || user == null || !user.isNeverRecharge() || cVar == null || cVar.f18815d != 2 || cVar.f18816e == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        this.f11873f.lambda$put$1$DataCenter("cmd_show_pay_dialog", new af(((com.bytedance.android.livesdkapi.i.c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.a()).f18816e, "gift", "live_detail", 2));
                    } else if (this.f11872e.f11377d) {
                        if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5699, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5699, new Class[0], Void.TYPE);
                        } else if (this.f11871d && this.f11872e.a()) {
                            com.bytedance.android.livesdk.gift.model.b bVar = this.f11872e.f11376c;
                            String string = getContext().getString(C0906R.string.d2h, new Object[]{Integer.valueOf(bVar.f15107f)});
                            com.bytedance.android.livesdk.j.a.a().a("shortcut_popup_show", Room.class, j.class);
                            if (this.w != null) {
                                if (!this.w.isShowing()) {
                                    this.w.show();
                                }
                                return;
                            }
                            com.bytedance.android.livesdk.widget.n.a().a(getContext()).d(C0906R.string.d2i).c((CharSequence) string).b(0, C0906R.string.d2q, new aw(this)).b(1, C0906R.string.d2g, new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f11882a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11882a, false, 5730, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11882a, false, 5730, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("button_type", "cancel");
                                    com.bytedance.android.livesdk.j.a.a().a("shortcut_popup_click", hashMap, Room.class, j.class);
                                }
                            }).c();
                        }
                    } else {
                        e();
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5698, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5698, new Class[0], Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.widget.n.a().a(getContext()).d(C0906R.string.d2k).c((int) C0906R.string.d2j).b(0, C0906R.string.d2m, new au(this)).b(1, C0906R.string.cpz, av.f11893b).c();
                    if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5718, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5718, new Class[0], Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.j.a.a().a("first_recharge_popup_show", Room.class, new j().a("live_detail").c("popup").b("live").f("show"));
                }
            }
        }
    }

    public final void setOnGiftClickListener(a aVar) {
        this.H = aVar;
    }

    public at(@NonNull Context context) {
        this(context, null);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11868a, false, 5707, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11868a, false, 5707, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f11871d) {
            ai.a(str);
        }
    }

    private void b(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11868a, false, 5695, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11868a, false, 5695, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            i2 = 2130841491;
        }
        setBackgroundResource(i2);
    }

    public final void setNeverPay(boolean z2) {
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11868a, false, 5692, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11868a, false, 5692, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z3 || ((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().b() > 0) {
            this.E = z3;
        }
    }

    public final void a(boolean z2) {
        TextView textView;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11868a, false, 5709, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11868a, false, 5709, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f11871d && this.i) {
            com.bytedance.android.livesdk.chatroom.f.b.b(this.p, this.f11872e.f11376c.f15103b, this.z, this.z, 0);
            if (z2) {
                if (this.G == null) {
                    if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5694, new Class[0], TextView.class)) {
                        textView = (TextView) PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5694, new Class[0], TextView.class);
                    } else {
                        textView = new TextView(getContext());
                        int dip2Px = (int) UIUtils.dip2Px(getContext(), 4.0f);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 28.0f), (int) UIUtils.dip2Px(getContext(), 12.0f));
                        layoutParams.topMargin = (int) UIUtils.dip2Px(getContext(), 24.0f);
                        layoutParams.leftMargin = dip2Px;
                        layoutParams.rightMargin = dip2Px;
                        textView.setLayoutParams(layoutParams);
                        textView.setBackgroundResource(2130841482);
                        textView.setTextSize(8.0f);
                        textView.setGravity(17);
                        textView.setTextColor(-1);
                        textView.setText(C0906R.string.d2l);
                    }
                    this.G = textView;
                } else {
                    g();
                }
                addView(this.G);
                return;
            }
            g();
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f11868a, false, 5711, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f11868a, false, 5711, new Class[]{Message.class}, Void.TYPE);
        } else if (message != null) {
            switch (message.what) {
                case 1:
                    this.B--;
                    if (this.B <= 0) {
                        this.D = false;
                        this.p.setVisibility(0);
                        this.s.setVisibility(8);
                        this.t.setVisibility(8);
                        b(true);
                        this.C.removeMessages(1);
                        if (this.u != null && this.u.isRunning()) {
                            this.u.end();
                        }
                        h();
                        return;
                    }
                    this.D = true;
                    this.t.setText(String.valueOf(this.B));
                    this.C.sendEmptyMessageDelayed(1, 1000);
                    return;
                case 2:
                    this.q.setVisibility(8);
                    h();
                    break;
            }
        }
    }

    public final void onEvent(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f11868a, false, 5713, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f11868a, false, 5713, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (this.E && this.F) {
            if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5720, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5720, new Class[0], Void.TYPE);
            } else {
                com.bytedance.android.livesdk.j.a.a().a("first_recharge_success", Room.class, new j().a("live_detail").c("live").b("live").f("other"));
            }
        }
        this.E = false;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11868a, false, 5721, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11868a, false, 5721, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("gift_type", "convenient_gift");
            hashMap.put("gift_cnt", String.valueOf(i2));
            hashMap.put("gift_id", String.valueOf(this.f11872e.c()));
            hashMap.put("money", String.valueOf(this.f11872e.e() * i2));
            hashMap.put("request_page", "shortcut");
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Long.valueOf(this.f11872e.c()), Integer.valueOf(i2));
            hashMap.put("gift_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(((com.bytedance.android.live.f.b) b.a(com.bytedance.android.live.f.b.class)).isFirstConsume(((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().a())));
            hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            com.bytedance.android.livesdk.j.a.a().a("send_gift", hashMap, new j().a("live_detail").c("bottom_tab").b("live_interact").f("other"), Room.class, ((com.bytedance.android.live.d.a) b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog());
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.model.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f11868a, false, 5704, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f11868a, false, 5704, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
        } else if (this.f11871d && iVar != null) {
            ((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().a(true);
            if (this.f11873f != null) {
                ((IMessageManager) this.f11873f.get("data_message_manager")).insertMessage(l.a(this.g.getId(), iVar, (User) this.f11873f.get("data_user_in_room")));
            }
            this.f11872e.g++;
            if (((Integer) LiveSettingKeys.LIVE_FAST_GIFT_COMBO_STYLE.a()).intValue() == 1) {
                if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5706, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5706, new Class[0], Void.TYPE);
                } else if (this.f11872e.f()) {
                    if (this.r == null) {
                        this.r = ObjectAnimator.ofFloat(this.q, "progress", new float[]{360.0f, 0.0f});
                        this.r.setDuration(((long) this.o) * 1000);
                    } else if (this.r.isRunning()) {
                        this.r.cancel();
                    }
                    this.q.setVisibility(0);
                    this.r.start();
                    if (this.C.hasMessages(2)) {
                        this.C.removeMessages(2);
                    }
                    this.C.sendEmptyMessageDelayed(2, ((long) this.o) * 1000);
                } else {
                    this.D = false;
                    this.p.setVisibility(0);
                    this.q.setVisibility(8);
                    h();
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f11868a, false, 5705, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11868a, false, 5705, new Class[0], Void.TYPE);
                } else if (this.f11872e.f()) {
                    if (!this.D) {
                        this.p.setVisibility(8);
                        this.s.setVisibility(0);
                        this.t.setVisibility(0);
                        b(false);
                    }
                    if (this.u == null) {
                        this.u = ObjectAnimator.ofFloat(this.s, "rotation", new float[]{0.0f, 360.0f});
                        this.u.setDuration(500);
                        this.u.setInterpolator(new LinearInterpolator());
                        this.u.setRepeatCount(-1);
                        this.u.setRepeatMode(1);
                    } else if (this.u.isRunning()) {
                        this.u.cancel();
                    }
                    this.D = true;
                    this.B = this.o;
                    this.t.setText(String.valueOf(this.B));
                    this.u.start();
                    this.C.removeMessages(1);
                    this.C.sendEmptyMessageDelayed(1, 1000);
                } else {
                    this.D = false;
                    this.p.setVisibility(0);
                    this.s.setVisibility(8);
                    this.t.setVisibility(8);
                    b(true);
                    h();
                }
            }
        }
    }

    private at(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private at(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
        super(context, attributeSet, 0);
        this.B = this.o;
        this.l = "";
        this.m = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11874a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f11874a, false, 5725, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11874a, false, 5725, new Class[0], Void.TYPE);
                    return;
                }
                at.this.d();
            }
        };
        this.n = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11876a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f11876a, false, 5726, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11876a, false, 5726, new Class[0], Void.TYPE);
                    return;
                }
                if (at.this.f11871d && at.this.f11870c != null && at.this.f11870c.isShowing()) {
                    Dialog dialog = at.this.f11870c;
                    if (PatchProxy.isSupport(new Object[]{dialog}, null, ax.f11896a, true, 5727, new Class[]{Dialog.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialog}, null, ax.f11896a, true, 5727, new Class[]{Dialog.class}, Void.TYPE);
                    } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        dialog.dismiss();
                    } else {
                        throw new IllegalStateException("debug check! this method should be called from main thread!");
                    }
                }
            }
        };
        this.H = null;
        this.y = (int) UIUtils.dip2Px(getContext(), 36.0f);
        this.z = (int) UIUtils.dip2Px(getContext(), 26.0f);
        this.A = (int) UIUtils.dip2Px(getContext(), 20.0f);
        this.o = ((Integer) com.bytedance.android.livesdk.config.a.G.a()).intValue();
        this.f11872e = new n();
        this.C = new WeakHandler(this);
    }
}
