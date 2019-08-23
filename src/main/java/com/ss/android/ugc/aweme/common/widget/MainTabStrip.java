package com.ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.f.w;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.d.b;
import com.ss.android.ugc.aweme.utils.bg;

public class MainTabStrip extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40394a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f40395b;

    /* renamed from: c  reason: collision with root package name */
    public float f40396c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f40397d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f40398e;

    /* renamed from: f  reason: collision with root package name */
    public String f40399f;
    public String g;
    public boolean h;
    public int i;
    private ViewPager j;
    private a k;
    @Constants.MainPageTabMode
    private int l;
    @BindView(2131495703)
    public View mIndicator;
    @BindView(2131497437)
    ImageView mIvFollowDot;
    @BindView(2131495329)
    View mLeftLine;
    @BindView(2131496745)
    View mRightLine;
    @BindView(2131497916)
    TextView mTvFollow;
    @BindView(2131497438)
    TextView mTvFollowDotCount;
    @BindView(2131497922)
    public TextView mTvFresh;
    @BindView(2131497949)
    TextView mTvHot;
    @BindView(2131498017)
    public TextView mTvNearByLeft;

    @interface AnimDirect {
    }

    public interface a {
        boolean a(int i);
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33666, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33666, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (v.a((View) this.mTvFresh) || v.a((View) this.mTvNearByLeft)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f40394a, false, 33676, new Class[0], Boolean.TYPE)) {
            return v.a((View) this.mTvFollow);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33676, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33681, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33681, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mIvFollowDot.getVisibility() == 0) {
            z = true;
        }
        return z;
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33682, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33682, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f40398e.getVisibility() == 0) {
            z = true;
        }
        return z;
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33683, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33683, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mTvFollowDotCount.getVisibility() == 0) {
            z = true;
        }
        return z;
    }

    public String getNearbyTitle() {
        TextView textView;
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33685, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33685, new Class[0], String.class);
        }
        if (MainPageExperimentHelper.c()) {
            textView = this.mTvNearByLeft;
        } else {
            textView = this.mTvFresh;
        }
        return textView.getText().toString();
    }

    /* access modifiers changed from: package-private */
    public float getTvHotPivotX() {
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33674, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33674, new Class[0], Float.TYPE)).floatValue();
        } else if (this.l != 2) {
            return 0.0f;
        } else {
            return (float) this.mTvHot.getWidth();
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33660, new Class[0], Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTvHot.getLayoutParams();
        layoutParams.addRule(1, C0906R.id.bay);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(17, C0906R.id.bay);
        }
        this.mTvHot.setLayoutParams(layoutParams);
    }

    private void h() {
        final TextView textView;
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33688, new Class[0], Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.c()) {
            textView = this.mTvNearByLeft;
        } else {
            textView = this.mTvFresh;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "rotationX", new float[]{0.0f, 90.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "rotationX", new float[]{-90.0f, 0.0f});
        ofFloat.addListener(new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40411a;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f40411a, false, 33700, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f40411a, false, 33700, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                textView.post(new f(this, textView));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.start();
    }

    public final void f() {
        final TextView textView;
        if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33690, new Class[0], Void.TYPE);
        } else if (!this.h && !TextUtils.isEmpty(this.g)) {
            if (MainPageExperimentHelper.c()) {
                textView = this.mTvNearByLeft;
            } else {
                textView = this.mTvFresh;
            }
            this.h = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "rotationX", new float[]{0.0f, -90.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "rotationX", new float[]{90.0f, 0.0f});
            ofFloat.addListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40414a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f40414a, false, 33702, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f40414a, false, 33702, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (!TextUtils.isEmpty(MainTabStrip.this.f40399f)) {
                        textView.setText(MainTabStrip.this.f40399f);
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.play(ofFloat).before(ofFloat2);
            animatorSet.start();
        }
    }

    public void setTabOnClickListener(a aVar) {
        this.k = aVar;
    }

    public MainTabStrip(Context context) {
        this(context, null);
    }

    public void setViewPager(@NonNull ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f40394a, false, 33667, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f40394a, false, 33667, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        this.j = viewPager;
        this.j.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40408a;

            /* renamed from: b  reason: collision with root package name */
            boolean f40409b = true;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageSelected(int i) {
                boolean z;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40408a, false, 33699, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40408a, false, 33699, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                switch (i) {
                    case 0:
                        if (MainPageExperimentHelper.c()) {
                            MainTabStrip mainTabStrip = MainTabStrip.this;
                            if (PatchProxy.isSupport(new Object[0], mainTabStrip, MainTabStrip.f40394a, false, 33671, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], mainTabStrip, MainTabStrip.f40394a, false, 33671, new Class[0], Void.TYPE);
                                break;
                            } else {
                                mainTabStrip.f();
                                MainTabStrip.a(mainTabStrip.mTvNearByLeft, 3, 0.0f);
                                MainTabStrip.a(mainTabStrip.mTvHot, 4, mainTabStrip.getTvHotPivotX());
                                if (mainTabStrip.b()) {
                                    MainTabStrip.a(mainTabStrip.mTvFollow, 4, (float) mainTabStrip.mTvFollow.getWidth());
                                }
                                return;
                            }
                        } else {
                            MainTabStrip mainTabStrip2 = MainTabStrip.this;
                            if (PatchProxy.isSupport(new Object[0], mainTabStrip2, MainTabStrip.f40394a, false, 33670, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], mainTabStrip2, MainTabStrip.f40394a, false, 33670, new Class[0], Void.TYPE);
                                break;
                            } else {
                                MainTabStrip.a(mainTabStrip2.mTvFollow, 3, (float) mainTabStrip2.mTvFollow.getWidth());
                                MainTabStrip.a(mainTabStrip2.mTvHot, 4, mainTabStrip2.getTvHotPivotX());
                                if (v.a((View) mainTabStrip2.mTvFresh)) {
                                    MainTabStrip.a(mainTabStrip2.mTvFresh, 4, 0.0f);
                                }
                                return;
                            }
                        }
                    case 1:
                        MainTabStrip mainTabStrip3 = MainTabStrip.this;
                        if (PatchProxy.isSupport(new Object[0], mainTabStrip3, MainTabStrip.f40394a, false, 33672, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], mainTabStrip3, MainTabStrip.f40394a, false, 33672, new Class[0], Void.TYPE);
                            break;
                        } else {
                            MainTabStrip.a(mainTabStrip3.mTvHot, 3, mainTabStrip3.getTvHotPivotX());
                            if (mainTabStrip3.b()) {
                                MainTabStrip.a(mainTabStrip3.mTvFollow, 4, (float) mainTabStrip3.mTvFollow.getWidth());
                            }
                            if (PatchProxy.isSupport(new Object[0], mainTabStrip3, MainTabStrip.f40394a, false, 33677, new Class[0], Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], mainTabStrip3, MainTabStrip.f40394a, false, 33677, new Class[0], Boolean.TYPE)).booleanValue();
                            } else {
                                z = v.a((View) mainTabStrip3.mTvNearByLeft);
                            }
                            if (z) {
                                MainTabStrip.a(mainTabStrip3.mTvNearByLeft, 4, (float) mainTabStrip3.mTvNearByLeft.getWidth());
                            }
                            if (v.a((View) mainTabStrip3.mTvFresh)) {
                                MainTabStrip.a(mainTabStrip3.mTvFresh, 4, 0.0f);
                            }
                            return;
                        }
                    case 2:
                        MainTabStrip mainTabStrip4 = MainTabStrip.this;
                        if (!PatchProxy.isSupport(new Object[0], mainTabStrip4, MainTabStrip.f40394a, false, 33673, new Class[0], Void.TYPE)) {
                            mainTabStrip4.f();
                            MainTabStrip.a(mainTabStrip4.mTvFresh, 3, 0.0f);
                            MainTabStrip.a(mainTabStrip4.mTvHot, 4, mainTabStrip4.getTvHotPivotX());
                            if (mainTabStrip4.b()) {
                                MainTabStrip.a(mainTabStrip4.mTvFollow, 4, (float) mainTabStrip4.mTvFollow.getWidth());
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], mainTabStrip4, MainTabStrip.f40394a, false, 33673, new Class[0], Void.TYPE);
                            return;
                        }
                        break;
                }
            }

            public void onPageScrolled(int i, float f2, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f40408a, false, 33698, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f40408a, false, 33698, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (this.f40409b && f2 == 0.0f && i2 == 0) {
                    onPageSelected(i);
                    this.f40409b = false;
                }
                if (v.a(MainTabStrip.this.mIndicator)) {
                    MainTabStrip.this.mIndicator.setTranslationX(((float) MainTabStrip.this.i) * (((float) i) + f2));
                }
            }
        });
    }

    private static void a(@NonNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f40394a, true, 33659, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f40394a, true, 33659, new Class[]{View.class}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(14);
        view2.setLayoutParams(layoutParams);
    }

    private static void setLineVisibility(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f40394a, true, 33662, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f40394a, true, 33662, new Class[]{View.class}, Void.TYPE);
        } else if (MainPageExperimentHelper.p()) {
            b.a(view);
        } else if (MainPageExperimentHelper.q()) {
            b.a(view);
        } else {
            view2.setVisibility(0);
        }
    }

    @OnClick({2131497916, 2131498017, 2131497949, 2131497922})
    public void click(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40394a, false, 33668, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40394a, false, 33668, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.dbu) {
            a("homepage_follow", 0);
        } else if (id == C0906R.id.df8) {
            a("homepage_fresh", 0);
        } else if (id == C0906R.id.dcx) {
            a("homepage_hot", 1);
        } else {
            if (id == C0906R.id.dc2) {
                a("homepage_fresh", 2);
            }
        }
    }

    public void setShowFollowDot(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40394a, false, 33678, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40394a, false, 33678, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!b()) {
            com.ss.android.ugc.aweme.framework.a.a.a(5, "MainTabStrip", "setShowFollowDot called when follow not visible");
        } else {
            ImageView imageView = this.mIvFollowDot;
            if (!z) {
                i2 = 4;
            }
            v.a((View) imageView, i2);
        }
    }

    public void setShowFollowDotCount(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40394a, false, 33679, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40394a, false, 33679, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!b()) {
            com.ss.android.ugc.aweme.framework.a.a.a(5, "MainTabStrip", "setShowFollowDotCount called when follow not visible");
        } else if (i2 > 0) {
            v.a(this.mTvFollowDotCount, (CharSequence) String.valueOf(i2));
            v.a((View) this.mTvFollowDotCount, 0);
            com.ss.android.ugc.aweme.main.d.a.a(true, "homepage_hot", "number_dot");
        } else {
            v.a((View) this.mTvFollowDotCount, 4);
        }
    }

    public void setShowFollowDotLive(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40394a, false, 33680, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40394a, false, 33680, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!b()) {
            com.ss.android.ugc.aweme.framework.a.a.a(5, "MainTabStrip", "setShowFollowDotLive called when follow not visible");
        } else {
            int i2 = 4;
            if (z) {
                com.ss.android.ugc.aweme.main.d.a.a(true, "homepage_hot", "live");
                v.a((View) this.mIvFollowDot, 4);
                v.a((View) this.mTvFollowDotCount, 4);
            }
            ImageView imageView = this.f40398e;
            if (z) {
                i2 = 0;
            }
            v.a((View) imageView, i2);
        }
    }

    public void setTabPadding(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40394a, false, 33691, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40394a, false, 33691, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.h && !TextUtils.isEmpty(this.g)) {
            a(false, z);
        }
    }

    public void setTabMode(@Constants.MainPageTabMode int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40394a, false, 33663, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40394a, false, 33663, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i2) {
            case 1:
                v.a(true, this.mTvFollow);
                setLineVisibility(this.mLeftLine);
                a(this.mLeftLine);
                g();
                v.a(false, this.mTvNearByLeft, this.mTvFresh, this.mRightLine);
                break;
            case 2:
                v.a(true, this.mTvFresh);
                setLineVisibility(this.mRightLine);
                a(this.mRightLine);
                if (PatchProxy.isSupport(new Object[0], this, f40394a, false, 33661, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40394a, false, 33661, new Class[0], Void.TYPE);
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTvHot.getLayoutParams();
                    layoutParams.addRule(0, C0906R.id.cen);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams.addRule(16, C0906R.id.cen);
                    }
                    this.mTvHot.setLayoutParams(layoutParams);
                }
                v.a(false, this.mTvNearByLeft, this.mTvFollow, this.mLeftLine);
                break;
            case 3:
                v.a(true, this.mTvNearByLeft);
                setLineVisibility(this.mLeftLine);
                a(this.mLeftLine);
                g();
                v.a(false, this.mTvFollow, this.mTvFresh, this.mRightLine);
                break;
        }
        this.l = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MainTabStrip(android.content.Context r12, @android.support.annotation.Nullable android.util.AttributeSet r13) {
        /*
            r11 = this;
            r11.<init>(r12, r13)
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            r11.f40395b = r13
            r13 = 0
            r11.f40396c = r13
            r13 = 1
            r11.f40397d = r13
            r0 = 0
            r11.i = r0
            r1 = 2131691524(0x7f0f0804, float:1.9012122E38)
            android.view.View r1 = com.bytedance.ies.x2c.d.a(r12, r1, r11, r13)
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r4 = f40394a
            java.lang.Class[] r7 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r7[r0] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 33656(0x8378, float:4.7162E-41)
            r3 = r11
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004a
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r3[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f40394a
            r6 = 0
            r7 = 33656(0x8378, float:4.7162E-41)
            java.lang.Class[] r8 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r8[r0] = r2
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0072
        L_0x004a:
            boolean r2 = com.ss.android.g.a.a()     // Catch:{ Exception -> 0x0060 }
            if (r2 != 0) goto L_0x0060
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x0060 }
            java.lang.Integer r2 = r2.bi()     // Catch:{ Exception -> 0x0060 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0060 }
            if (r2 != r13) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x0067
            r2 = 2131167764(0x7f070a14, float:1.794981E38)
            goto L_0x006a
        L_0x0067:
            r2 = 2131167763(0x7f070a13, float:1.7949809E38)
        L_0x006a:
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r11.f40398e = r2
        L_0x0072:
            butterknife.ButterKnife.bind((android.view.View) r1)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f40394a
            r6 = 0
            r7 = 33658(0x837a, float:4.7165E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x0099
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f40394a
            r5 = 0
            r6 = 33658(0x837a, float:4.7165E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00e1
        L_0x0099:
            android.widget.TextView r1 = r11.mTvFollow
            r1.setLines(r13)
            android.widget.TextView r1 = r11.mTvFollow
            android.text.TextPaint r1 = r1.getPaint()
            r1.setFakeBoldText(r13)
            android.widget.TextView r1 = r11.mTvNearByLeft
            r1.setLines(r13)
            android.widget.TextView r1 = r11.mTvNearByLeft
            android.text.TextPaint r1 = r1.getPaint()
            r1.setFakeBoldText(r13)
            android.widget.TextView r1 = r11.mTvNearByLeft
            r2 = -1
            r1.setMarqueeRepeatLimit(r2)
            android.widget.TextView r1 = r11.mTvNearByLeft
            r1.setHorizontallyScrolling(r13)
            android.widget.TextView r1 = r11.mTvHot
            android.text.TextPaint r1 = r1.getPaint()
            r1.setFakeBoldText(r13)
            android.widget.TextView r1 = r11.mTvFresh
            r1.setLines(r13)
            android.widget.TextView r1 = r11.mTvFresh
            android.text.TextPaint r1 = r1.getPaint()
            r1.setFakeBoldText(r13)
            android.widget.TextView r1 = r11.mTvFresh
            r1.setMarqueeRepeatLimit(r2)
            android.widget.TextView r1 = r11.mTvFresh
            r1.setHorizontallyScrolling(r13)
        L_0x00e1:
            boolean r1 = com.ss.android.ugc.aweme.main.MainPageExperimentHelper.p()
            r2 = 2
            r3 = 3
            r4 = 2131427645(0x7f0b013d, float:1.8476912E38)
            if (r1 == 0) goto L_0x0116
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getDimensionPixelSize(r4)
            r11.i = r12
            android.content.res.Resources r12 = r11.getResources()
            android.widget.TextView[] r1 = new android.widget.TextView[r3]
            android.widget.TextView r3 = r11.mTvFollow
            r1[r0] = r3
            android.widget.TextView r3 = r11.mTvHot
            r1[r13] = r3
            android.widget.TextView r3 = r11.mTvFresh
            r1[r2] = r3
            com.ss.android.ugc.aweme.main.d.b.a((android.content.res.Resources) r12, (android.widget.TextView[]) r1)
            android.view.View[] r12 = new android.view.View[r13]
            android.view.View r1 = r11.mIndicator
            r12[r0] = r1
            com.ss.android.ugc.aweme.base.utils.v.a((boolean) r13, (android.view.View[]) r12)
            goto L_0x01a3
        L_0x0116:
            boolean r1 = com.ss.android.ugc.aweme.main.MainPageExperimentHelper.q()
            if (r1 == 0) goto L_0x019a
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getDimensionPixelSize(r4)
            r11.i = r12
            android.content.res.Resources r12 = r11.getResources()
            android.widget.TextView[] r1 = new android.widget.TextView[r3]
            android.widget.TextView r3 = r11.mTvNearByLeft
            r1[r0] = r3
            android.widget.TextView r3 = r11.mTvHot
            r1[r13] = r3
            android.widget.TextView r3 = r11.mTvFresh
            r1[r2] = r3
            com.ss.android.ugc.aweme.main.d.b.a((android.content.res.Resources) r12, (android.widget.TextView[]) r1)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f40394a
            r7 = 0
            r8 = 33655(0x8377, float:4.716E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x015f
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f40394a
            r4 = 0
            r5 = 33655(0x8377, float:4.716E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0190
        L_0x015f:
            android.view.View r12 = r11.mIndicator
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            r1 = 5
            r12.addRule(r1, r0)
            r2 = 7
            r12.addRule(r2, r0)
            r3 = 8
            r12.addRule(r3, r0)
            r4 = 2131170884(0x7f071644, float:1.7956139E38)
            r12.addRule(r1, r4)
            r12.addRule(r2, r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x018d
            r1 = 18
            r12.addRule(r1, r4)
            r1 = 19
            r12.addRule(r1, r4)
        L_0x018d:
            r12.addRule(r3, r4)
        L_0x0190:
            android.view.View[] r12 = new android.view.View[r13]
            android.view.View r1 = r11.mIndicator
            r12[r0] = r1
            com.ss.android.ugc.aweme.base.utils.v.a((boolean) r13, (android.view.View[]) r12)
            goto L_0x01a3
        L_0x019a:
            android.view.View[] r12 = new android.view.View[r13]
            android.view.View r13 = r11.mIndicator
            r12[r0] = r13
            com.ss.android.ugc.aweme.base.utils.v.a((boolean) r0, (android.view.View[]) r12)
        L_0x01a3:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f40394a
            r4 = 0
            r5 = 33657(0x8379, float:4.7164E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r12 == 0) goto L_0x01c7
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f40394a
            r4 = 0
            r5 = 33657(0x8379, float:4.7164E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x01c7:
            android.widget.TextView r12 = r11.mTvHot
            com.ss.android.ugc.aweme.common.widget.MainTabStrip$1 r13 = new com.ss.android.ugc.aweme.common.widget.MainTabStrip$1
            r13.<init>()
            android.support.v4.app.AccessibilityUtil.setAccessibilityDelegate(r12, r13)
            android.widget.TextView r12 = r11.mTvFresh
            com.ss.android.ugc.aweme.common.widget.MainTabStrip$2 r13 = new com.ss.android.ugc.aweme.common.widget.MainTabStrip$2
            r13.<init>()
            android.support.v4.app.AccessibilityUtil.setAccessibilityDelegate(r12, r13)
            android.widget.TextView r12 = r11.mTvNearByLeft
            com.ss.android.ugc.aweme.common.widget.MainTabStrip$3 r13 = new com.ss.android.ugc.aweme.common.widget.MainTabStrip$3
            r13.<init>()
            android.support.v4.app.AccessibilityUtil.setAccessibilityDelegate(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.MainTabStrip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f40394a, false, 33669, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f40394a, false, 33669, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.c.f33271c = str;
        if ((this.k == null || !this.k.a(i2)) && this.j != null) {
            bg.a(new w(str));
            this.j.setCurrentItem(i2, false);
        }
    }

    public final void a(String str, boolean z) {
        TextView textView;
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f40394a, false, 33684, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f40394a, false, 33684, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.c()) {
            textView = this.mTvNearByLeft;
        } else {
            textView = this.mTvFresh;
        }
        if (!af.b(getContext()) || z) {
            if (!TextUtils.isEmpty(str)) {
                this.f40399f = str;
                textView.setText(str);
            } else {
                textView.setText(C0906R.string.ae9);
            }
            textView.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        textView.setText(C0906R.string.ae9);
    }

    public void a(boolean z, boolean z2) {
        TextView textView;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40394a, false, 33687, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f40394a, false, 33687, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.c()) {
            textView = this.mTvNearByLeft;
        } else {
            textView = this.mTvFresh;
        }
        TextView textView2 = textView;
        if (z2) {
            i2 = (int) UIUtils.dip2Px(getContext(), 80.0f);
        } else {
            i2 = (int) UIUtils.dip2Px(getContext(), 50.0f);
        }
        setPadding(i2, 0, i2, 0);
        if (z) {
            h();
        } else {
            textView2.post(new e(this, textView2));
        }
    }

    static void a(View view, @AnimDirect int i2, float f2) {
        float f3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Float.valueOf(f2)}, null, f40394a, true, 33675, new Class[]{View.class, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Float.valueOf(f2)}, null, f40394a, true, 33675, new Class[]{View.class, Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 3) {
            f3 = 1.0f;
        } else {
            f3 = 0.6f;
        }
        float f4 = f2;
        view2.post(new d(view2, f4, new AnimatorSet(), ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), f3}).setDuration(200)));
    }
}
