package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.autodispose.af;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.contract.a;
import com.bytedance.android.livesdk.chatroom.ui.LinkStickerAdapter;
import com.bytedance.android.livesdk.chatroom.widget.LevelSelectView;
import com.bytedance.android.livesdk.chatroom.widget.k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.c.b;
import com.bytedance.android.livesdk.sticker.f;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.RechargeDialog;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.a;

public class bf extends Dialog implements View.OnClickListener, a.b, LevelSelectView.a, a.b {
    private static final /* synthetic */ a.C0900a F;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11915a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f11916b = bf.class.getSimpleName();
    private View A;
    private View B;
    private m C;
    private RechargeDialog D;
    private boolean E;

    /* renamed from: c  reason: collision with root package name */
    public View f11917c;

    /* renamed from: d  reason: collision with root package name */
    a.C0087a f11918d;

    /* renamed from: e  reason: collision with root package name */
    public b f11919e;

    /* renamed from: f  reason: collision with root package name */
    public LinkStickerAdapter f11920f;
    public int g;
    protected boolean h;
    DataCenter i;
    public final CompositeDisposable j = new CompositeDisposable();
    public a.C0122a k = new a.C0122a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11927a;

        public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        }

        public final void b(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
            String str2 = str;
            com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f11927a, false, 5799, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f11927a, false, 5799, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            bf.this.a(str2, aVar2, 3);
        }

        public final void c(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
            String str2 = str;
            com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f11927a, false, 5800, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f11927a, false, 5800, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            bf.this.a(str2, aVar2, 2);
        }
    };
    private Activity l;
    private HSImageView m;
    private k n;
    private LottieAnimationView o;
    private ImageView p;
    private View q;
    private TextView r;
    private TextView s;
    private TextView t;
    private View u;
    private LevelSelectView v;
    private RecyclerView w;
    private View x;
    private TextView y;
    private TextView z;

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f11915a, false, 5776, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f11915a, false, 5776, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        b(false);
        if (!(th instanceof com.bytedance.android.live.a.a.b.a) || ((com.bytedance.android.live.a.a.b.a) th).getErrorCode() != 40001) {
            l.a(getContext(), th, (int) C0906R.string.d4g);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5777, new Class[0], Void.TYPE);
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            Bundle bundle = new Bundle();
            bundle.putString("v1_source", "comment_live");
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "gift_send");
            bundle.putString("source", "enableGift");
            TTLiveSDKContext.getHostService().k().a(getContext(), i.a().a(ac.a((int) C0906R.string.des)).d("live_detail").e("gift_send").c("enableGift").a(0).a()).subscribe((Observer<? super T>) new g<com.bytedance.android.live.base.model.user.i>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11923a;

                public final void onSubscribe(Disposable disposable) {
                    Disposable disposable2 = disposable;
                    if (PatchProxy.isSupport(new Object[]{disposable2}, this, f11923a, false, 5796, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable2}, this, f11923a, false, 5796, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    super.onSubscribe(disposable);
                    bf.this.j.add(disposable2);
                }
            });
        } else {
            if (!TTLiveSDKContext.getHostService().k().a(h.INTERACT)) {
                if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.a()).intValue() != 1) {
                    TTLiveSDKContext.getHostService().c().a((Activity) getContext());
                } else if (this.l instanceof FragmentActivity) {
                    RechargeDialog.a((FragmentActivity) this.l, false, "connection", this.i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<com.bytedance.android.livesdk.sticker.b.a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f11915a, false, 5781, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f11915a, false, 5781, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list.isEmpty()) {
            list.add(new com.bytedance.android.livesdk.sticker.b.a());
        }
        this.f11920f = new LinkStickerAdapter(getContext(), list, new LinkStickerAdapter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11925a;

            public final void a(com.bytedance.android.livesdk.sticker.b.a aVar) {
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f11925a, false, 5797, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f11925a, false, 5797, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                } else if (bf.this.f11919e.a(aVar)) {
                    bf.this.f11920f.a(com.bytedance.android.livesdk.sticker.c.a.f17263d, aVar, 2);
                } else {
                    bf.this.f11919e.a(com.bytedance.android.livesdk.sticker.c.a.f17263d, aVar, bf.this.k);
                }
            }

            public final void b(com.bytedance.android.livesdk.sticker.b.a aVar) {
                com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
                if (PatchProxy.isSupport(new Object[]{aVar2}, this, f11925a, false, 5798, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar2}, this, f11925a, false, 5798, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                    return;
                }
                bf bfVar = bf.this;
                if (PatchProxy.isSupport(new Object[]{aVar2}, bfVar, bf.f11915a, false, 5787, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                    bf bfVar2 = bfVar;
                    PatchProxy.accessDispatch(new Object[]{aVar2}, bfVar2, bf.f11915a, false, 5787, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                    return;
                }
                if (!TextUtils.equals(aVar.a(), bfVar.f11918d.b())) {
                    bfVar.f11918d.a(aVar.a());
                    j.q().o().b(com.bytedance.android.livesdk.sticker.c.a.f17263d);
                    if (TextUtils.equals(aVar.a(), "")) {
                        bfVar.f11918d.a((com.bytedance.android.livesdk.sticker.b.a) null);
                    } else {
                        j.q().o().a(com.bytedance.android.livesdk.sticker.c.a.f17263d, aVar2);
                        bfVar.f11918d.a(aVar2);
                    }
                    f fVar = new f("liveinteract", aVar2);
                    if (bfVar.i != null) {
                        bfVar.i.lambda$put$1$DataCenter("cmd_sticker_is_selected", fVar);
                    }
                }
            }
        });
        this.w.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.w.setAdapter(this.f11920f);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5780, new Class[0], Void.TYPE);
            return;
        }
        a((List<com.bytedance.android.livesdk.sticker.b.a>) new ArrayList<com.bytedance.android.livesdk.sticker.b.a>());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5775, new Class[0], Void.TYPE);
            return;
        }
        b(false);
        dismiss();
        ai.a((int) C0906R.string.d4h);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5773, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f11918d.a(this);
        this.v.setCurrentLevel(this.f11918d.a());
        this.h = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5774, new Class[0], Void.TYPE);
            return;
        }
        this.f11918d.h();
        this.o.cancelAnimation();
        this.f11919e.a();
        this.h = false;
        this.j.clear();
        super.onDetachedFromWindow();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11915a, true, 5791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11915a, true, 5791, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("InteractApplyDialog.java", bf.class);
            F = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.InteractApplyDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 476);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5790, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5790, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null && this.D.isShowing()) {
            this.D.dismiss();
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, bj.f11935a, true, 5801, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, bj.f11935a, true, 5801, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    private static int a(int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int i3 = i2 / 60;
        if (i2 % 60 > 0) {
            i3++;
        }
        return i3;
    }

    private void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11915a, false, 5789, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11915a, false, 5789, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            if (this.C == null) {
                this.C = new m.a(getContext(), 2).c((int) C0906R.string.d4i).a();
            }
            if (!this.C.isShowing()) {
                this.C.show();
            }
        } else if (this.C != null && this.C.isShowing()) {
            this.C.dismiss();
        }
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11915a, false, 5786, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11915a, false, 5786, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            ((View) this.n).setVisibility(0);
            this.q.setVisibility(0);
            this.m.setVisibility(4);
            this.o.setVisibility(4);
            this.o.cancelAnimation();
            this.p.setVisibility(4);
            this.f11918d.a(1);
        } else {
            ((View) this.n).setVisibility(4);
            this.q.setVisibility(4);
            this.m.setVisibility(0);
            this.o.setVisibility(0);
            this.o.playAnimation();
            if (!this.E) {
                ImageModel c2 = this.f11918d.c();
                com.bytedance.android.livesdk.chatroom.f.b.a(this.m, c2, (Postprocessor) new u(5, 0.0f, null));
                com.bytedance.android.livesdk.chatroom.f.b.b(this.p, c2, this.p.getWidth(), this.p.getHeight(), 2130841141);
                this.E = true;
            }
            this.p.setVisibility(0);
            this.f11918d.a(2);
        }
    }

    public final void a(EffectChannelResponse effectChannelResponse) {
        if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f11915a, false, 5779, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f11915a, false, 5779, new Class[]{EffectChannelResponse.class}, Void.TYPE);
            return;
        }
        ((af) Observable.fromIterable(effectChannelResponse.allCategoryEffects).map(bg.f11930b).toList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).as(e.a((View) this.w))).a(new bh(this), bi.f11934b);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11915a, false, 5788, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11915a, false, 5788, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(F, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.q1) {
            com.bytedance.android.livesdk.app.dataholder.e.a().h = !com.bytedance.android.livesdk.app.dataholder.e.a().h;
            this.n.g();
        } else if (id == C0906R.id.ti) {
            dismiss();
        } else {
            if (id == C0906R.id.jz) {
                if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5783, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5783, new Class[0], Void.TYPE);
                } else {
                    a(true);
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.u.getLayoutParams();
                    layoutParams.bottomToBottom = C0906R.id.jz;
                    layoutParams.rightToRight = C0906R.id.jz;
                    layoutParams.leftToLeft = C0906R.id.jz;
                    this.u.setLayoutParams(layoutParams);
                    this.v.setVisibility(0);
                    this.w.setVisibility(8);
                    this.x.setVisibility(8);
                    this.r.setTextColor(-1);
                    this.s.setTextColor(-855638017);
                    this.t.setTextColor(-855638017);
                }
            } else if (id == C0906R.id.cvx) {
                if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5784, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5784, new Class[0], Void.TYPE);
                } else {
                    a(true);
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.u.getLayoutParams();
                    layoutParams2.bottomToBottom = C0906R.id.cvx;
                    layoutParams2.rightToRight = C0906R.id.cvx;
                    layoutParams2.leftToLeft = C0906R.id.cvx;
                    this.u.setLayoutParams(layoutParams2);
                    this.v.setVisibility(8);
                    this.w.setVisibility(0);
                    this.x.setVisibility(8);
                    this.r.setTextColor(-855638017);
                    this.s.setTextColor(-1);
                    this.t.setTextColor(-855638017);
                }
            } else if (id == C0906R.id.gj) {
                if (PatchProxy.isSupport(new Object[0], this, f11915a, false, 5785, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11915a, false, 5785, new Class[0], Void.TYPE);
                } else {
                    a(false);
                    ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.u.getLayoutParams();
                    layoutParams3.bottomToBottom = C0906R.id.gj;
                    layoutParams3.rightToRight = C0906R.id.gj;
                    layoutParams3.leftToLeft = C0906R.id.gj;
                    this.u.setLayoutParams(layoutParams3);
                    this.v.setVisibility(8);
                    this.w.setVisibility(8);
                    this.x.setVisibility(0);
                    this.r.setTextColor(-855638017);
                    this.s.setTextColor(-855638017);
                    this.t.setTextColor(-1);
                }
            } else if (id == C0906R.id.ff) {
                if (!this.f11918d.d()) {
                    b(true);
                    this.f11918d.e();
                } else if (!com.bytedance.android.livesdkapi.a.a.f18614b || !c.a(getContext())) {
                    this.f11917c.scrollTo(this.g, 0);
                } else {
                    this.f11917c.scrollTo(-this.g, 0);
                }
            } else if (id == C0906R.id.iu) {
                this.f11917c.scrollTo(0, 0);
            } else if (id == C0906R.id.c9w) {
                String g2 = this.f11918d.g();
                if (TextUtils.isEmpty(g2)) {
                    g2 = ac.a((int) C0906R.string.d5t);
                }
                ai.a(g2);
            } else if (id == C0906R.id.bwp || id == C0906R.id.bwq) {
                if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                    this.A.setBackgroundResource(2130840776);
                    this.B.setBackgroundResource(2130840777);
                } else {
                    this.y.setBackgroundResource(2130840776);
                    this.z.setBackgroundResource(2130840777);
                }
                this.f11918d.b(0);
            } else if (id == C0906R.id.bwt || id == C0906R.id.bwu) {
                if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                    this.B.setBackgroundResource(2130840776);
                    this.A.setBackgroundResource(2130840777);
                } else {
                    this.y.setBackgroundResource(2130840777);
                    this.z.setBackgroundResource(2130840776);
                }
                this.f11918d.b(1);
            } else if (id == C0906R.id.bwm) {
                b(true);
                this.f11918d.e();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11915a, false, 5771, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11915a, false, 5771, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.agg);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        this.n = (k) findViewById(C0906R.id.c5p);
        this.m = (HSImageView) findViewById(C0906R.id.hq);
        this.o = (LottieAnimationView) findViewById(C0906R.id.ge);
        this.p = (ImageView) findViewById(C0906R.id.hk);
        this.q = findViewById(C0906R.id.q1);
        this.f11917c = findViewById(C0906R.id.bw1);
        this.r = (TextView) findViewById(C0906R.id.jz);
        this.s = (TextView) findViewById(C0906R.id.cvx);
        this.t = (TextView) findViewById(C0906R.id.gj);
        this.u = findViewById(C0906R.id.au6);
        this.v = (LevelSelectView) findViewById(C0906R.id.bb8);
        this.w = (RecyclerView) findViewById(C0906R.id.cvv);
        this.x = findViewById(C0906R.id.gf);
        if (com.bytedance.android.livesdkapi.a.a.f18614b) {
            a(findViewById(C0906R.id.apb), 8);
            a(findViewById(C0906R.id.dv0), 0);
            this.A = findViewById(C0906R.id.bwq);
            this.B = findViewById(C0906R.id.bwu);
            this.A.setOnClickListener(this);
            this.B.setOnClickListener(this);
        } else {
            a(findViewById(C0906R.id.apb), 0);
            a(findViewById(C0906R.id.dv0), 8);
            this.y = (TextView) findViewById(C0906R.id.bwp);
            this.z = (TextView) findViewById(C0906R.id.bwt);
            this.y.setOnClickListener(this);
            this.z.setOnClickListener(this);
        }
        this.q.setOnClickListener(this);
        findViewById(C0906R.id.ti).setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.v.setOnClickListener(this);
        findViewById(C0906R.id.ff).setOnClickListener(this);
        findViewById(C0906R.id.iu).setOnClickListener(this);
        findViewById(C0906R.id.c9w).setOnClickListener(this);
        findViewById(C0906R.id.bwm).setOnClickListener(this);
        this.v.setLevelChangedListener(this);
        this.o.setAnimation("audio_interact_effect.json");
        this.o.loop(true);
        List f2 = this.f11918d.f();
        if (f2 != null) {
            if (f2.size() > 0) {
                com.bytedance.android.livesdk.chatroom.model.a.i iVar = (com.bytedance.android.livesdk.chatroom.model.a.i) f2.get(0);
                if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                    ((TextView) findViewById(C0906R.id.bwr)).setText(String.valueOf(iVar.f11046a));
                    ((TextView) findViewById(C0906R.id.bws)).setText(String.valueOf(a(iVar.f11047b)) + ac.a((int) C0906R.plurals.j, a(iVar.f11047b)));
                    this.A.setVisibility(0);
                    this.A.setBackgroundResource(2130840776);
                } else {
                    this.y.setText(ac.a((int) C0906R.string.d5u, Integer.valueOf(iVar.f11046a), Integer.valueOf(a(iVar.f11047b))));
                    this.y.setVisibility(0);
                    this.y.setBackgroundResource(2130840776);
                }
            } else if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                this.A.setVisibility(8);
                this.B.setVisibility(8);
            } else {
                this.y.setVisibility(8);
                this.z.setVisibility(8);
            }
            if (f2.size() >= 2) {
                com.bytedance.android.livesdk.chatroom.model.a.i iVar2 = (com.bytedance.android.livesdk.chatroom.model.a.i) f2.get(1);
                if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                    ((TextView) findViewById(C0906R.id.bwv)).setText(String.valueOf(iVar2.f11046a));
                    ((TextView) findViewById(C0906R.id.bww)).setText(a(iVar2.f11047b) + ac.a((int) C0906R.plurals.j, a(iVar2.f11047b)));
                    this.A.setVisibility(0);
                    this.B.setBackgroundResource(2130840777);
                } else {
                    this.z.setText(ac.a((int) C0906R.string.d5u, Integer.valueOf(iVar2.f11046a), Integer.valueOf(a(iVar2.f11047b))));
                    this.z.setVisibility(0);
                    this.z.setBackgroundResource(2130840777);
                }
            } else if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                this.B.setVisibility(8);
            } else {
                this.z.setVisibility(8);
            }
        }
        this.f11917c.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11921a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f11921a, false, 5795, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11921a, false, 5795, new Class[0], Void.TYPE);
                } else if (bf.this.h) {
                    bf.this.g = UIUtils.getScreenWidth(bf.this.getContext());
                    View findViewById = bf.this.f11917c.findViewById(C0906R.id.bvz);
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    layoutParams.width = bf.this.g;
                    findViewById.setLayoutParams(layoutParams);
                    View findViewById2 = bf.this.f11917c.findViewById(C0906R.id.bw0);
                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    layoutParams2.width = bf.this.g;
                    findViewById2.setLayoutParams(layoutParams2);
                    bf.this.f11917c.scrollTo(0, 0);
                    bf.this.f11919e.a(com.bytedance.android.livesdk.sticker.c.a.f17263d, (a.b) bf.this);
                }
            }
        });
    }

    private void a(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f11915a, false, 5772, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f11915a, false, 5772, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public bf(Activity activity, a.C0087a aVar, DataCenter dataCenter) {
        super(activity, C0906R.style.v3);
        this.l = activity;
        this.f11918d = aVar;
        this.i = dataCenter;
        this.f11919e = j.q().p().a();
    }

    public final void a(LevelSelectView levelSelectView, int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{levelSelectView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11915a, false, 5782, new Class[]{LevelSelectView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{levelSelectView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11915a, false, 5782, new Class[]{LevelSelectView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f11918d.c(i2);
        this.n.a(i2);
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar, int i2) {
        String str2 = str;
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2, Integer.valueOf(i2)}, this, f11915a, false, 5778, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2, Integer.valueOf(i2)}, this, f11915a, false, 5778, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.livesdk.sticker.c.a.f17263d.equals(str2)) {
            this.f11920f.a(str2, aVar2, i2);
        }
    }
}
