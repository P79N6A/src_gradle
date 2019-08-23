package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.m;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.chatroom.ui.dl;
import com.bytedance.android.livesdk.chatroom.ui.dy;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.b.c;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.RechargeDialog;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LuckyBoxWidget extends LiveRecyclableWidget implements DialogInterface.OnDismissListener, View.OnClickListener, au.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12669a;
    private static final /* synthetic */ a.C0900a s;

    /* renamed from: b  reason: collision with root package name */
    au f12670b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f12671c;

    /* renamed from: d  reason: collision with root package name */
    TextView f12672d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f12673e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f12674f;
    public ObjectAnimator g;
    public AnimatorSet h;
    dy i;
    private boolean j;
    private Disposable k;
    private boolean l;
    private TextView m;
    private HSImageView n;
    private HSImageView o;
    private View p;
    private AnimatorSet q;
    private dl r;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12687a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12688c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12687a, false, 7293, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12687a, false, 7293, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12687a, false, 7295, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12687a, false, 7295, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12687a, false, 7294, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12687a, false, 7294, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12687a, true, 7292, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12687a, true, 7292, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LuckyBoxWidget.java", a.class);
            f12688c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LuckyBoxWidget$ToolbarMagicBoxBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 505);
        }

        private a() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12687a, false, 7291, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12687a, false, 7291, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f12688c, this, this, view));
            LuckyBoxWidget.this.b();
        }

        /* synthetic */ a(LuckyBoxWidget luckyBoxWidget, byte b2) {
            this();
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12669a, false, 7277, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12669a, false, 7277, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12669a, false, 7278, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12669a, false, 7278, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.an_;
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12669a, true, 7276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12669a, true, 7276, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LuckyBoxWidget.java", LuckyBoxWidget.class);
        s = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LuckyBoxWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 281);
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12669a, false, 7265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12669a, false, 7265, new Class[0], Void.TYPE);
            return;
        }
        this.f12670b.d();
        if (this.i != null) {
            this.i.dismiss();
        }
        if (this.r != null) {
            this.r.dismiss();
        }
        this.contentView.setVisibility(8);
        a((Animator) this.q);
        a(this.f12674f);
        a((Animator) this.g);
        a((Animator) this.h);
        a(this.k);
        this.l = false;
    }

    public final void b() {
        Observable observable;
        if (PatchProxy.isSupport(new Object[0], this, f12669a, false, 7266, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12669a, false, 7266, new Class[0], Void.TYPE);
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            ((ab) TTLiveSDKContext.getHostService().k().a(this.context, i.a().a(ac.a((int) C0906R.string.csf)).c("red_envelope").a(-1).a()).compose(com.bytedance.android.live.core.rxutils.i.a()).as(autoDispose())).a((Observer<? super T>) new g<com.bytedance.android.live.base.model.user.i>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12675a;

                public final /* synthetic */ void onNext(Object obj) {
                    com.bytedance.android.live.base.model.user.i iVar = (com.bytedance.android.live.base.model.user.i) obj;
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f12675a, false, 7286, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iVar}, this, f12675a, false, 7286, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE);
                        return;
                    }
                    super.onNext(iVar);
                    LuckyBoxWidget.this.b();
                }
            });
        } else {
            au auVar = this.f12670b;
            if (PatchProxy.isSupport(new Object[0], auVar, au.f11241a, false, 5254, new Class[0], Observable.class)) {
                observable = (Observable) PatchProxy.accessDispatch(new Object[0], auVar, au.f11241a, false, 5254, new Class[0], Observable.class);
            } else {
                observable = ((com.bytedance.android.livesdk.utils.b.b) j.q().d().c().fetchTypeList(auVar.f11242b.getId()).compose(com.bytedance.android.live.core.rxutils.i.a()).as(c.a())).a();
            }
            ((ab) observable.as(autoDispose())).a(new dk(this), new dl(this));
        }
    }

    public final void c() {
        aq aqVar;
        if (PatchProxy.isSupport(new Object[0], this, f12669a, false, 7269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12669a, false, 7269, new Class[0], Void.TYPE);
            return;
        }
        a(this.k);
        a((Animator) this.q);
        au.c c2 = this.f12670b.c();
        if (c2 == null) {
            aqVar = null;
        } else {
            aqVar = c2.f11248a;
        }
        if (aqVar == null) {
            this.contentView.setVisibility(8);
            return;
        }
        this.contentView.setVisibility(0);
        int a2 = this.f12670b.a();
        if (a2 > 1) {
            this.m.setText(String.valueOf(a2));
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
        if (aqVar.j) {
            this.l = true;
            if (!aqVar.p) {
                a(aqVar);
            }
        } else {
            this.l = false;
        }
        if (aqVar.f16477b != null) {
            User user = aqVar.f16477b;
            this.n.setVisibility(0);
            com.bytedance.android.livesdk.chatroom.f.b.b(this.n, user.getAvatarThumb());
            m userHonor = user.getUserHonor();
            if (userHonor == null || userHonor.k() == null) {
                this.o.setVisibility(8);
            } else {
                this.o.setVisibility(0);
                com.bytedance.android.livesdk.chatroom.f.b.a(this.o, userHonor.k());
            }
        } else {
            this.n.setVisibility(8);
            this.o.setVisibility(8);
        }
        if (c2.f11249b == null) {
            if (PatchProxy.isSupport(new Object[0], this, f12669a, false, 7271, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12669a, false, 7271, new Class[0], Void.TYPE);
            } else {
                this.p.setVisibility(0);
                this.n.setVisibility(8);
                this.o.setVisibility(8);
                this.f12672d.setVisibility(8);
                a(this.k);
                if (PatchProxy.isSupport(new Object[0], this, f12669a, false, 7272, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f12669a, false, 7272, new Class[0], Void.TYPE);
                } else {
                    View findViewById = this.contentView.findViewById(C0906R.id.kp);
                    a((Animator) this.q);
                    if (this.q == null) {
                        this.q = new AnimatorSet();
                        Animator loadAnimator = AnimatorInflater.loadAnimator(this.context, C0906R.animator.k);
                        Animator clone = loadAnimator.clone();
                        loadAnimator.setTarget(findViewById);
                        clone.setTarget(findViewById);
                        clone.setStartDelay(1000);
                        this.q.playSequentially(new Animator[]{loadAnimator, clone});
                    }
                    this.q.start();
                }
            }
        } else {
            this.p.setVisibility(8);
            this.f12672d.setVisibility(0);
            this.f12672d.setText(ah.a(this.f12670b.a(c2.f11248a) / 1000));
            this.k = ((ab) c2.f11249b.as(autoDispose())).a(new Cdo(this), dp.f13177b);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (dialogInterface instanceof dl) {
            this.r = null;
            return;
        }
        if (dialogInterface instanceof dy) {
            this.i = null;
        }
    }

    private void a(Disposable disposable) {
        if (PatchProxy.isSupport(new Object[]{disposable}, this, f12669a, false, 7275, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable}, this, f12669a, false, 7275, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12669a, false, 7270, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12669a, false, 7270, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(s, this, this, view));
        if (this.r == null) {
            a(this.f12670b.c());
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12669a, false, 7264, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12669a, false, 7264, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12671c = (ViewGroup) this.contentView.getParent().getParent();
        this.j = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(f.RED_ENVELOPE, (d.a) new a(this, (byte) 0));
        this.f12670b.a((au.b) this);
    }

    public final void a(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f12669a, false, 7274, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f12669a, false, 7274, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12669a, false, 7263, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12669a, false, 7263, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12670b = new au();
        this.m = (TextView) this.contentView.findViewById(C0906R.id.dh_);
        this.n = (HSImageView) this.contentView.findViewById(C0906R.id.hk);
        this.o = (HSImageView) this.contentView.findViewById(C0906R.id.bb7);
        this.f12672d = (TextView) this.contentView.findViewById(C0906R.id.dab);
        this.p = this.contentView.findViewById(C0906R.id.ci_);
        this.contentView.setOnClickListener(new dj(this));
    }

    public final void a(au.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12669a, false, 7267, new Class[]{au.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12669a, false, 7267, new Class[]{au.c.class}, Void.TYPE);
            return;
        }
        if (cVar != null) {
            this.r = new dl(this.context, cVar, this.f12670b, this.dataCenter);
            this.r.setOnDismissListener(this);
            this.r.show();
        }
    }

    public final void b(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12669a, false, 7268, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12669a, false, 7268, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            if (40001 != aVar.getErrorCode()) {
                ai.a(aVar.getPrompt());
            } else if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.a()).intValue() == 1) {
                ai.a((int) C0906R.string.dje);
                if (this.context instanceof FragmentActivity) {
                    RechargeDialog.a((FragmentActivity) this.context, this.j, "gift_redpackage", this.dataCenter);
                }
            } else {
                new m.a(this.context, 0).a((CharSequence) this.context.getString(C0906R.string.dfy)).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new dm(this)).b(1, (int) C0906R.string.cpz, dn.f13173b).c();
            }
            return;
        }
        ai.a((int) C0906R.string.dio);
    }

    public final void a(aq aqVar) {
        if (PatchProxy.isSupport(new Object[]{aqVar}, this, f12669a, false, 7273, new Class[]{aq.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aqVar}, this, f12669a, false, 7273, new Class[]{aq.class}, Void.TYPE);
            return;
        }
        aqVar.p = true;
        if (this.f12673e != null) {
            a(this.f12674f);
            a((Animator) this.g);
            a((Animator) this.h);
            this.f12671c.removeView(this.f12673e);
            this.f12673e = null;
        }
        this.f12673e = (FrameLayout) LayoutInflater.from(this.context).inflate(C0906R.layout.ana, this.f12671c, false);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12673e.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.bottomMargin = ac.a(30.0f);
        this.f12673e.setLayoutParams(layoutParams);
        final TextView textView = (TextView) this.f12673e.findViewById(C0906R.id.db1);
        if (com.bytedance.android.live.uikit.a.a.a()) {
            textView.setText(String.valueOf(aqVar.h));
        } else {
            int length = String.valueOf(aqVar.h).length();
            SpannableString spannableString = new SpannableString(this.context.getString(C0906R.string.di_, new Object[]{Integer.valueOf(aqVar.h)}));
            dr.a(spannableString, new RelativeSizeSpan(1.67f), 0, length, 33);
            textView.setText(spannableString);
        }
        this.f12671c.addView(this.f12673e);
        final ImageView imageView = (ImageView) this.f12673e.findViewById(C0906R.id.hk);
        final View findViewById = this.f12673e.findViewById(C0906R.id.hq);
        com.bytedance.android.livesdk.chatroom.f.b.b(imageView, aqVar.f16477b.getAvatarThumb());
        final ImageView imageView2 = (ImageView) this.f12673e.findViewById(C0906R.id.bb7);
        com.bytedance.android.live.base.model.user.m userHonor = aqVar.f16477b.getUserHonor();
        if (userHonor == null || userHonor.n() == null) {
            imageView2.setImageDrawable(null);
        } else {
            imageView2.setVisibility(0);
            com.bytedance.android.livesdk.chatroom.f.b.b(imageView2, aqVar.f16477b.getUserHonor().n(), imageView2.getWidth(), imageView2.getHeight(), 0);
        }
        final View findViewById2 = this.f12673e.findViewById(C0906R.id.d1v);
        a(this.f12674f);
        this.f12674f = AnimatorInflater.loadAnimator(this.context, C0906R.animator.j);
        this.f12674f.setTarget(this.f12673e);
        Animator animator = this.f12674f;
        AnonymousClass2 r0 = new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12677a;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f12677a, false, 7287, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12677a, false, 7287, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                findViewById2.setVisibility(0);
                LuckyBoxWidget.this.f12674f.removeAllListeners();
                LuckyBoxWidget.this.a((Animator) LuckyBoxWidget.this.g);
                LuckyBoxWidget.this.g = ObjectAnimator.ofFloat(findViewById2, "translationX", new float[]{0.0f, (float) textView.getWidth()});
                LuckyBoxWidget.this.g.setDuration(520);
                LuckyBoxWidget.this.g.addListener(new Animator.AnimatorListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12683a;

                    public final void onAnimationCancel(Animator animator) {
                    }

                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f12683a, false, 7288, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f12683a, false, 7288, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        LuckyBoxWidget.this.g.removeAllListeners();
                        findViewById2.setVisibility(8);
                        View findViewById = LuckyBoxWidget.this.contentView.findViewById(C0906R.id.kp);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f12673e, "rotation", new float[]{0.0f, 720.0f});
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f12673e, "translationX", new float[]{0.0f, ((findViewById.getX() + ((View) LuckyBoxWidget.this.contentView.getParent()).getX()) - LuckyBoxWidget.this.f12673e.getX()) - (((float) LuckyBoxWidget.this.f12673e.getMeasuredWidth()) * 0.4f)});
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f12673e, "translationY", new float[]{0.0f, ((findViewById.getY() + ((View) LuckyBoxWidget.this.contentView.getParent()).getY()) - LuckyBoxWidget.this.f12673e.getY()) - (((float) LuckyBoxWidget.this.f12673e.getMeasuredHeight()) * 0.4f)});
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f12673e, "scaleX", new float[]{1.0f, 0.2f});
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f12673e, "scaleY", new float[]{1.0f, 0.2f});
                        ofFloat.setDuration(520);
                        ofFloat2.setDuration(520);
                        ofFloat2.setDuration(520);
                        ofFloat4.setDuration(520);
                        ofFloat5.setDuration(520);
                        LuckyBoxWidget.this.f12673e.postDelayed(new dq(imageView, imageView2, findViewById, textView), 500);
                        LuckyBoxWidget.this.a((Animator) LuckyBoxWidget.this.h);
                        LuckyBoxWidget.this.h = new AnimatorSet();
                        LuckyBoxWidget.this.h.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
                        LuckyBoxWidget.this.h.setStartDelay(500);
                        LuckyBoxWidget.this.h.addListener(new Animator.AnimatorListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f12685a;

                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f12685a, false, 7290, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12685a, false, 7290, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                LuckyBoxWidget.this.h.removeAllListeners();
                                LuckyBoxWidget.this.f12671c.removeView(LuckyBoxWidget.this.f12673e);
                                LuckyBoxWidget.this.f12673e = null;
                            }
                        });
                        LuckyBoxWidget.this.h.start();
                    }
                });
                LuckyBoxWidget.this.g.start();
            }
        };
        animator.addListener(r0);
        this.f12674f.start();
    }
}
