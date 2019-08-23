package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.f.b;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.controller.ControllerListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DouyinGiftPanelBottomWidget extends FakeDouyinGiftPanelBottomWidget implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15247a;

    /* renamed from: b  reason: collision with root package name */
    TextView f15248b;

    /* renamed from: c  reason: collision with root package name */
    public HSImageView f15249c;

    /* renamed from: d  reason: collision with root package name */
    public CompositeDisposable f15250d = new CompositeDisposable();

    /* renamed from: e  reason: collision with root package name */
    public AnimatorSet f15251e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f15252f;
    private GiftDialogViewModel g;
    private Disposable h;

    public int getLayoutId() {
        return C0906R.layout.ag6;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9918, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().e();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9922, new Class[0], Void.TYPE);
            return;
        }
        this.f15252f.setAlpha(1.0f);
        this.f15248b.setBackground(null);
        Drawable a2 = a.a(this.context.getResources(), 2130841058);
        a2.setBounds(new Rect(0, 0, (int) ak.a(this.context, 10.0f), (int) UIUtils.dip2Px(this.context, 10.0f)));
        this.f15248b.setTextColor(ac.b((int) C0906R.color.acx));
        this.f15248b.setCompoundDrawables(null, null, a2, null);
        this.f15249c.setVisibility(8);
        if (this.f15251e != null) {
            this.f15251e.cancel();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9930, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.h != null && !this.h.isDisposed()) {
            this.h.dispose();
        }
        if (this.f15250d != null && !this.f15250d.isDisposed()) {
            this.f15250d.dispose();
        }
        this.f15251e = null;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9917, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9919, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9919, new Class[0], Void.TYPE);
        } else {
            this.f15252f = (TextView) this.contentView.findViewById(C0906R.id.db0);
            this.f15248b = (TextView) this.contentView.findViewById(C0906R.id.s2);
            this.f15249c = (HSImageView) this.contentView.findViewById(C0906R.id.aej);
            this.f15248b.setOnClickListener(this);
            Drawable a2 = a.a(this.context.getResources(), 2130841132);
            a2.setBounds(new Rect(0, 0, (int) ak.a(this.context, 16.0f), (int) UIUtils.dip2Px(this.context, 16.0f)));
            if (c.a(this.context)) {
                this.f15252f.setCompoundDrawables(null, null, a2, null);
            } else {
                this.f15252f.setCompoundDrawables(a2, null, null, null);
            }
            Drawable a3 = a.a(this.context.getResources(), 2130841058);
            a3.setBounds(new Rect(0, 0, (int) ak.a(this.context, 10.0f), (int) UIUtils.dip2Px(this.context, 10.0f)));
            if (c.a(this.context)) {
                this.f15248b.setCompoundDrawables(a3, null, null, null);
            } else {
                this.f15248b.setCompoundDrawables(null, null, a3, null);
            }
            if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9920, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9920, new Class[0], Void.TYPE);
            } else {
                User user = (User) this.dataCenter.get("data_user_in_room");
                if (user != null && user.isNeverRecharge()) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date());
                    if (!TextUtils.equals((String) com.bytedance.android.livesdk.w.b.aM.a(), format)) {
                        com.bytedance.android.livesdkapi.i.c cVar = (com.bytedance.android.livesdkapi.i.c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.a();
                        if (cVar != null && !TextUtils.isEmpty(cVar.f18813b) && cVar.f18815d == 1) {
                            if (PatchProxy.isSupport(new Object[]{cVar}, this, f15247a, false, 9921, new Class[]{com.bytedance.android.livesdkapi.i.c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{cVar}, this, f15247a, false, 9921, new Class[]{com.bytedance.android.livesdkapi.i.c.class}, Void.TYPE);
                            } else {
                                this.f15252f.setAlpha(0.24f);
                                this.f15248b.setCompoundDrawables(null, null, null, null);
                                this.f15248b.setBackground(ac.c(2130840736));
                                this.f15248b.setTextColor(ac.b((int) C0906R.color.ao4));
                                this.f15248b.setWidth(ac.a(52.0f));
                                this.f15249c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                this.f15249c.setOnClickListener(this);
                                String str = cVar.f18813b;
                                final long j = cVar.f18814c;
                                if (PatchProxy.isSupport(new Object[]{str, new Long(j)}, this, f15247a, false, 9923, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, new Long(j)}, this, f15247a, false, 9923, new Class[]{String.class, Long.TYPE}, Void.TYPE);
                                } else {
                                    com.bytedance.android.live.core.utils.fresco.a.a(this.containerView.getContext()).a(str).a(ImageView.ScaleType.CENTER_INSIDE).a((ControllerListener) new k.a(null, new q.a() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f15255a;

                                        public final void a(ImageModel imageModel) {
                                        }

                                        public final void a(ImageModel imageModel, Exception exc) {
                                            if (PatchProxy.isSupport(new Object[]{imageModel, exc}, this, f15255a, false, 9935, new Class[]{ImageModel.class, Exception.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{imageModel, exc}, this, f15255a, false, 9935, new Class[]{ImageModel.class, Exception.class}, Void.TYPE);
                                                return;
                                            }
                                            DouyinGiftPanelBottomWidget.this.a();
                                        }

                                        public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                                            if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f15255a, false, 9934, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f15255a, false, 9934, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            DouyinGiftPanelBottomWidget.this.f15251e = new AnimatorSet();
                                            DouyinGiftPanelBottomWidget.this.f15249c.clearAnimation();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(DouyinGiftPanelBottomWidget.this.f15249c, "scaleX", new float[]{0.8f, 1.0f, 1.0f});
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(DouyinGiftPanelBottomWidget.this.f15249c, "scaleY", new float[]{0.8f, 1.0f, 1.0f});
                                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(DouyinGiftPanelBottomWidget.this.f15249c, "alpha", new float[]{0.0f, 1.0f, 1.0f});
                                            DouyinGiftPanelBottomWidget.this.f15249c.setPivotX((float) (ac.c() - ac.a(72.0f)));
                                            DouyinGiftPanelBottomWidget.this.f15249c.setPivotY((float) (i2 / 2));
                                            DouyinGiftPanelBottomWidget.this.f15251e.setDuration(300);
                                            DouyinGiftPanelBottomWidget.this.f15251e.play(ofFloat).with(ofFloat2).with(ofFloat3);
                                            DouyinGiftPanelBottomWidget.this.f15251e.start();
                                            DouyinGiftPanelBottomWidget.this.f15251e.addListener(new Animator.AnimatorListener() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f15258a;

                                                public final void onAnimationRepeat(Animator animator) {
                                                }

                                                public final void onAnimationStart(Animator animator) {
                                                }

                                                public final void onAnimationCancel(Animator animator) {
                                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f15258a, false, 9937, new Class[]{Animator.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f15258a, false, 9937, new Class[]{Animator.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    DouyinGiftPanelBottomWidget.this.a();
                                                }

                                                public final void onAnimationEnd(Animator animator) {
                                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f15258a, false, 9936, new Class[]{Animator.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f15258a, false, 9936, new Class[]{Animator.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    DouyinGiftPanelBottomWidget.this.f15250d.add(Observable.timer(j, TimeUnit.MILLISECONDS).compose(i.a()).subscribe((Consumer<? super T>) new Consumer<Long>() {

                                                        /* renamed from: a  reason: collision with root package name */
                                                        public static ChangeQuickRedirect f15260a;

                                                        public final /* synthetic */ void accept(Object obj) throws Exception {
                                                            Long l = (Long) obj;
                                                            if (PatchProxy.isSupport(new Object[]{l}, this, f15260a, false, 9938, new Class[]{Long.class}, Void.TYPE)) {
                                                                PatchProxy.accessDispatch(new Object[]{l}, this, f15260a, false, 9938, new Class[]{Long.class}, Void.TYPE);
                                                                return;
                                                            }
                                                            DouyinGiftPanelBottomWidget.this.a();
                                                        }
                                                    }));
                                                }
                                            });
                                        }
                                    })).a((ImageView) this.f15249c);
                                }
                            }
                            com.bytedance.android.livesdk.w.b.aM.a(format);
                        }
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9924, new Class[0], Void.TYPE);
        } else {
            a((long) ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().b());
            ((ab) ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().a().as(autoDispose())).a(new a(this), b.f15343b);
        }
        this.f15250d.clear();
        this.f15250d.add(com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.g.c.class).subscribe((Consumer<? super T>) new Consumer<com.bytedance.android.livesdk.g.c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15253a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.livesdk.g.c cVar = (com.bytedance.android.livesdk.g.c) obj;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f15253a, false, 9933, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f15253a, false, 9933, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE);
                    return;
                }
                DouyinGiftPanelBottomWidget.this.onEvent(cVar);
            }
        }));
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15247a, false, 9925, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15247a, false, 9925, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.s2 || view.getId() == C0906R.id.aej) {
            if (PatchProxy.isSupport(new Object[0], this, f15247a, false, 9929, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f15247a, false, 9929, new Class[0], Void.TYPE);
            } else {
                this.g.q.postValue(Boolean.TRUE);
            }
            a();
        }
    }

    public void onEvent(com.bytedance.android.livesdk.g.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f15247a, false, 9928, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f15247a, false, 9928, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE);
            return;
        }
        ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().e();
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f15247a, false, 9926, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f15247a, false, 9926, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        TextView textView = this.f15252f;
        if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
            j2 = 0;
        }
        textView.setText(String.valueOf(j2));
    }
}
