package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.al;
import com.bytedance.android.livesdk.chatroom.model.u;
import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.chatroom.presenter.bh;
import com.bytedance.android.livesdk.chatroom.presenter.bi;
import com.bytedance.android.livesdk.j.c.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.RedEnvelopeProgressBar;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class dl extends Dialog implements View.OnClickListener, au.a {
    private static final /* synthetic */ a.C0900a I;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12084a;
    private ObjectAnimator A;
    private ObjectAnimator B;
    private TextView C;
    private TextView D;
    private HSImageView E;
    private View F;
    private ImageView G;
    private TextView H;

    /* renamed from: b  reason: collision with root package name */
    public final CompositeDisposable f12085b = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    public boolean f12086c;

    /* renamed from: d  reason: collision with root package name */
    boolean f12087d = true;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup f12088e;

    /* renamed from: f  reason: collision with root package name */
    View f12089f;
    View g;
    RecyclerView h;
    View i;
    View j;
    private au.c k;
    private au l;
    private Activity m;
    private int n = 0;
    private boolean o;
    private ViewGroup p;
    private ViewGroup q;
    private ViewGroup r;
    private RecyclerView s;
    private HSImageView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private RedEnvelopeProgressBar x;
    private TextView y;
    private View z;

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6224, new Class[0], Void.TYPE);
            return;
        }
        this.f12085b.add(this.l.a(this.k).subscribe(new du(this), new dv(this)));
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6228, new Class[0], Void.TYPE);
            return;
        }
        if (this.B != null && this.B.isRunning()) {
            this.B.cancel();
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6213, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6213, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f12086c = true;
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12084a, true, 6230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12084a, true, 6230, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LuckyBoxRushDialog.java", dl.class);
        I = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LuckyBoxRushDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 220);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6222, new Class[0], Void.TYPE);
            return;
        }
        int b2 = this.l.b(this.k.f11248a.f16478c);
        if (b2 > 0) {
            this.v.setText(ac.a((int) C0906R.string.diu, Integer.valueOf(b2)));
            return;
        }
        this.v.setVisibility(8);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6227, new Class[0], Void.TYPE);
            return;
        }
        ((ab) TTLiveSDKContext.getHostService().k().a(this.m, i.a().a(ac.a((int) C0906R.string.dev)).a(5).d("live_detail").e("red_envelope").c("live").a()).as(e.a((View) this.f12088e))).a((Observer<? super T>) new g<com.bytedance.android.live.base.model.user.i>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12092a;

            public final void onSubscribe(Disposable disposable) {
                Disposable disposable2 = disposable;
                if (PatchProxy.isSupport(new Object[]{disposable2}, this, f12092a, false, 6243, new Class[]{Disposable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{disposable2}, this, f12092a, false, 6243, new Class[]{Disposable.class}, Void.TYPE);
                    return;
                }
                super.onSubscribe(disposable);
                dl.this.f12085b.add(disposable2);
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6219, new Class[0], Void.TYPE);
            return;
        }
        this.n = 0;
        if (this.A != null && this.A.isRunning()) {
            this.A.cancel();
        }
        this.y.setVisibility(8);
        this.x.setVisibility(8);
        this.g.setVisibility(0);
        d();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6214, new Class[0], Void.TYPE);
            return;
        }
        this.f12086c = false;
        c();
        if (this.A != null && this.A.isRunning()) {
            this.A.cancel();
        }
        au auVar = this.l;
        auVar.g = null;
        auVar.f11245e = false;
        this.f12085b.clear();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        boolean z2;
        float f2;
        FrameLayout.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6221, new Class[0], Void.TYPE);
            return;
        }
        u uVar = this.k.f11248a.q;
        if (uVar != null) {
            this.n = 1;
            int i2 = 8;
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            this.u.setVisibility(8);
            this.r.setVisibility(0);
            this.j.setVisibility(8);
            this.s.setVisibility(8);
            if (com.bytedance.android.live.uikit.a.a.d()) {
                this.f12088e.setBackgroundResource(2130840708);
            }
            if (this.k.f11248a.f16481f != 1 || !uVar.f11168a) {
                z2 = false;
            } else {
                z2 = true;
            }
            View view = this.F;
            if (z2) {
                i2 = 0;
            }
            view.setVisibility(i2);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.p.getLayoutParams();
            layoutParams2.topMargin = ac.a(20.0f);
            this.p.setLayoutParams(layoutParams2);
            if (z2) {
                layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                f2 = 64.0f;
            } else {
                layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                if (com.bytedance.android.live.uikit.a.a.a()) {
                    f2 = 24.0f;
                } else {
                    f2 = 10.0f;
                }
            }
            layoutParams.bottomMargin = ac.a(f2);
            this.r.setLayoutParams(layoutParams);
            if (!uVar.f11168a) {
                this.C.setText(this.C.getContext().getString(C0906R.string.dii));
            } else if (uVar.f11170c == null) {
                String valueOf = String.valueOf(uVar.f11171d);
                String string = getContext().getString(C0906R.string.dkv);
                SpannableString spannableString = new SpannableString(getContext().getString(C0906R.string.dij, new Object[]{valueOf}));
                StyleSpan styleSpan = new StyleSpan(1);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) UIUtils.sp2px(getContext(), 24.0f));
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(valueOf)) {
                    int length = string.length();
                    int length2 = valueOf.length() + length;
                    spannableString.setSpan(styleSpan, length, length2, 33);
                    spannableString.setSpan(absoluteSizeSpan, length, length2, 33);
                }
                this.C.setText(spannableString);
            } else {
                this.C.setText(C0906R.string.dik);
                this.E.setVisibility(0);
                com.bytedance.android.livesdk.chatroom.f.b.a(this.E, uVar.f11170c);
            }
            this.h.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
            this.i.setVisibility(0);
            this.h.setVisibility(4);
            this.l.a(this.k);
            e();
            d();
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12084a, false, 6216, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12084a, false, 6216, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
            return;
        }
        this.f12087d = true;
        this.f12089f.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12084a, false, 6223, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12084a, false, 6223, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 <= 60) {
            this.y.setTextSize(32.0f);
            this.y.setText(String.valueOf(i2));
        } else {
            this.y.setText(this.y.getContext().getString(C0906R.string.dig, new Object[]{String.valueOf(i2 / 60)}));
        }
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12084a, false, 6217, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12084a, false, 6217, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.live.core.c.a.a("RushRedEnvelopeDialog", th2);
        l.a(getContext(), th2);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12084a, false, 6220, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f12084a, false, 6220, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.v.setVisibility(8);
        this.n = 2;
        this.q.setVisibility(8);
        this.w.setVisibility(0);
        this.s.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.p.getLayoutParams();
        layoutParams.topMargin = ac.a(48.0f);
        this.p.setLayoutParams(layoutParams);
        if (z2) {
            this.w.setText(C0906R.string.die);
        } else {
            this.z.setVisibility(0);
        }
        d();
    }

    public void onClick(View view) {
        Observable observable;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12084a, false, 6215, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f12084a, false, 6215, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(I, this, this, view2));
        int id = view.getId();
        if (this.f12089f.getId() == id) {
            if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6226, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6226, new Class[0], Void.TYPE);
            } else if (!TTLiveSDKContext.getHostService().k().c()) {
                f();
            } else {
                User user = this.k.f11248a.f16477b;
                if (user != null) {
                    this.l.a(user.getId());
                    if (PatchProxy.isSupport(new Object[]{user}, this, f12084a, false, 6229, new Class[]{User.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user}, this, f12084a, false, 6229, new Class[]{User.class}, Void.TYPE);
                    } else {
                        com.bytedance.android.livesdk.j.a.a().a("follow", new c("live_audience_c_audience", user.getId(), "red_packetage"), new j().b("live_interact").a("live_detail"), Room.class);
                    }
                }
            }
        } else if (this.g.getId() == id) {
            if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6225, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6225, new Class[0], Void.TYPE);
            } else if (!(this.n == 2 || this.n == 1)) {
                if (!TTLiveSDKContext.getHostService().k().c()) {
                    f();
                } else {
                    this.B = ObjectAnimator.ofFloat(this.g, "rotationY", new float[]{0.0f, 360.0f, 0.0f});
                    this.B.setDuration(2000);
                    this.B.setRepeatMode(1);
                    this.B.setRepeatCount(2);
                    this.B.start();
                    this.g.setOnClickListener(null);
                    CompositeDisposable compositeDisposable = this.f12085b;
                    au auVar = this.l;
                    au.c cVar = this.k;
                    if (PatchProxy.isSupport(new Object[]{cVar}, auVar, au.f11241a, false, 5257, new Class[]{au.c.class}, Observable.class)) {
                        au auVar2 = auVar;
                        observable = (Observable) PatchProxy.accessDispatch(new Object[]{cVar}, auVar2, au.f11241a, false, 5257, new Class[]{au.c.class}, Observable.class);
                    } else {
                        Observable a2 = ((com.bytedance.android.livesdk.utils.b.b) com.bytedance.android.livesdk.v.j.q().d().c().rush(cVar.f11248a.f16478c, auVar.f11242b.getId(), cVar.f11248a.f16481f, cVar.f11248a.f16479d, cVar.f11248a.f16480e, auVar.f11242b.getLabels()).compose(com.bytedance.android.live.core.rxutils.i.a()).as(com.bytedance.android.livesdk.utils.b.c.a())).a();
                        ((ab) a2.as(auVar.o())).a(new bh(auVar, cVar), new bi(auVar));
                        observable = a2;
                    }
                    compositeDisposable.add(observable.subscribe(new dw(this), new Cdo(this)));
                }
            }
        } else if (this.z.getId() == id) {
            b();
        } else if (this.j.getId() == id) {
            this.l.a(this.k);
            e();
        } else if (this.G.getId() == id) {
            if (this.k.f11248a.f16477b != null) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent(this.k.f11248a.f16477b));
            }
        } else if (this.F.getId() == id) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new al(com.bytedance.android.livesdk.gift.panel.widget.ab.PROP));
            dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12084a, false, 6212, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12084a, false, 6212, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            dismiss();
            return;
        }
        window.requestFeature(1);
        setContentView(C0906R.layout.agy);
        this.f12088e = (ViewGroup) findViewById(C0906R.id.chy);
        if (!this.o) {
            this.f12088e.post(new dm(this));
        }
        window.getAttributes().gravity = 17;
        window.setLayout(-2, -2);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.t = (HSImageView) findViewById(C0906R.id.b0d);
        this.p = (ViewGroup) findViewById(C0906R.id.agf);
        this.G = (ImageView) this.p.findViewById(C0906R.id.as5);
        this.H = (TextView) this.p.findViewById(C0906R.id.df7);
        this.f12089f = this.p.findViewById(C0906R.id.dby);
        this.s = (RecyclerView) findViewById(C0906R.id.bcq);
        this.q = (ViewGroup) findViewById(C0906R.id.ag3);
        this.x = (RedEnvelopeProgressBar) this.q.findViewById(C0906R.id.c7n);
        this.y = (TextView) this.q.findViewById(C0906R.id.dab);
        this.g = this.q.findViewById(C0906R.id.ci_);
        this.r = (ViewGroup) findViewById(C0906R.id.bcp);
        this.C = (TextView) this.r.findViewById(C0906R.id.dht);
        this.D = (TextView) this.r.findViewById(C0906R.id.dhs);
        this.E = (HSImageView) this.r.findViewById(C0906R.id.b4o);
        this.h = (RecyclerView) this.r.findViewById(C0906R.id.cia);
        this.i = this.r.findViewById(C0906R.id.bcs);
        this.j = this.r.findViewById(C0906R.id.bcr);
        this.u = (TextView) findViewById(C0906R.id.daw);
        this.w = (TextView) findViewById(C0906R.id.dhr);
        this.v = (TextView) findViewById(C0906R.id.d9m);
        this.F = findViewById(C0906R.id.dig);
        this.z = findViewById(C0906R.id.dia);
        this.l.g = this;
        this.z.setOnClickListener(this);
        this.f12089f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.F.setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[0], this, f12084a, false, 6218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12084a, false, 6218, new Class[0], Void.TYPE);
            return;
        }
        aq aqVar = this.k.f11248a;
        Observable<Integer> observable = this.k.f11249b;
        u uVar = aqVar.q;
        if (aqVar.l != null) {
            com.bytedance.android.livesdk.chatroom.f.b.a(this.t, aqVar.l);
        }
        if (aqVar.f16477b != null) {
            User user = aqVar.f16477b;
            com.bytedance.android.livesdk.chatroom.f.b.b(this.G, user.getAvatarThumb(), this.G.getWidth(), this.G.getHeight(), 0);
            if (user.getId() != TTLiveSDKContext.getHostService().k().b()) {
                this.f12085b.add(TTLiveSDKContext.getHostService().k().b(user.getId()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new dn(this), dp.f12101b));
            }
            this.H.setText(user.getNickName());
            this.G.setOnClickListener(this);
        }
        int i2 = aqVar.h;
        SpannableString spannableString = new SpannableString(ac.a((int) C0906R.string.dib, Integer.valueOf(i2), aqVar.g));
        int length = String.valueOf(i2).length() + 4;
        dx.a(spannableString, new AbsoluteSizeSpan(ac.a(18.0f)), 4, length, 33);
        dx.a(spannableString, new ForegroundColorSpan(Color.parseColor("#ffffff")), 4, length, 33);
        this.u.setText(spannableString);
        d();
        if (!Lists.isEmpty(aqVar.k)) {
            LuckyBoxDescriptionAdapter luckyBoxDescriptionAdapter = new LuckyBoxDescriptionAdapter(LayoutInflater.from(getContext()), C0906R.layout.anb);
            this.s.setAdapter(luckyBoxDescriptionAdapter);
            this.s.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            luckyBoxDescriptionAdapter.a(aqVar.k);
            this.s.setVisibility(0);
        }
        if (uVar != null) {
            b();
            return;
        }
        if (observable == null) {
            a();
        } else {
            this.x.setVisibility(0);
            this.y.setVisibility(0);
            int a2 = (int) (this.l.a(aqVar) / 1000);
            if (a2 < 0) {
                a2 = 0;
            }
            int i3 = ((aqVar.f16480e - a2) * 100) / aqVar.f16480e;
            this.x.setProgress(i3);
            this.A = ObjectAnimator.ofInt(this.x, "progress", new int[]{i3, 100});
            this.A.setInterpolator(new LinearInterpolator());
            this.A.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12090a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12090a, false, 6242, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12090a, false, 6242, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (dl.this.f12086c) {
                        dl.this.a();
                    }
                }
            });
            this.A.setDuration((long) (a2 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            this.A.start();
            a(a2);
            this.f12085b.add(observable.subscribe(new dq(this), dr.f12105b));
        }
        this.f12085b.add(TTLiveSDKContext.getHostService().k().d(aqVar.f16477b.getId()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ds(this, aqVar), dt.f12110b));
    }

    public dl(@NonNull Context context, @NonNull au.c cVar, @NonNull au auVar, @NonNull DataCenter dataCenter) {
        super(context, C0906R.style.v_);
        this.m = (Activity) context;
        this.k = cVar;
        this.l = auVar;
        this.o = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
    }
}
