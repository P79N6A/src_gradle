package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.MutableLiveData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.p;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.ad;
import dmt.av.video.s;
import org.jetbrains.annotations.NotNull;

public class ChooseCoverActivity extends AmeSSActivity implements VEChooseVideoCoverFragment.a, VEEditorAutoStartStopArbiter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71226a;

    /* renamed from: b  reason: collision with root package name */
    public cb f71227b;

    /* renamed from: c  reason: collision with root package name */
    public ad f71228c;

    /* renamed from: d  reason: collision with root package name */
    public VEChooseVideoCoverFragment f71229d;

    /* renamed from: e  reason: collision with root package name */
    public SurfaceView f71230e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f71231f;
    private LifecycleRegistry g = new LifecycleRegistry(this);
    private MutableLiveData<Bitmap> h = new MutableLiveData<>();
    private MutableLiveData<Boolean> i = new MutableLiveData<>();
    private int j;
    private int k;
    private MutableLiveData<s> l = new MutableLiveData<>();

    class ChooseVideoCoverFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71236a;

        ChooseVideoCoverFragmentLifecycleCallbacks() {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
            if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f71236a, false, 81100, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f71236a, false, 81100, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
                return;
            }
            super.onFragmentDetached(fragmentManager, fragment);
            if (fragment instanceof VEChooseVideoCoverFragment) {
                if (PatchProxy.isSupport(new Object[0], this, f71236a, false, 81101, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71236a, false, 81101, new Class[0], Void.TYPE);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", ChooseCoverActivity.this.f71227b);
                ChooseCoverActivity.this.setResult(-1, intent);
                ChooseCoverActivity.this.finish();
            }
        }

        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            Fragment fragment2 = fragment;
            if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, bundle}, this, f71236a, false, 81097, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, bundle}, this, f71236a, false, 81097, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
                return;
            }
            super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            if (fragment2 instanceof VEChooseVideoCoverFragment) {
                final VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) fragment2;
                if (ChooseCoverActivity.this.f71228c.p != null) {
                    ChooseCoverActivity.this.f71228c.p.a(true);
                }
                vEChooseVideoCoverFragment.getView().postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71238a;

                    public final void run() {
                        boolean z;
                        if (PatchProxy.isSupport(new Object[0], this, f71238a, false, 81102, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f71238a, false, 81102, new Class[0], Void.TYPE);
                            return;
                        }
                        FragmentActivity activity = vEChooseVideoCoverFragment.getActivity();
                        if (!vEChooseVideoCoverFragment.isDetached() && activity != null && !activity.isFinishing()) {
                            ChooseVideoCoverFragmentLifecycleCallbacks chooseVideoCoverFragmentLifecycleCallbacks = ChooseVideoCoverFragmentLifecycleCallbacks.this;
                            VEChooseVideoCoverFragment vEChooseVideoCoverFragment = vEChooseVideoCoverFragment;
                            int color = ChooseCoverActivity.this.getResources().getColor(C0906R.color.z5);
                            int b2 = vEChooseVideoCoverFragment.b();
                            int d2 = vEChooseVideoCoverFragment.d();
                            int c2 = vEChooseVideoCoverFragment.c();
                            int d3 = fc.d(activity);
                            if (PatchProxy.isSupport(new Object[]{vEChooseVideoCoverFragment, Integer.valueOf(color), Integer.valueOf(b2), Integer.valueOf(d2), Integer.valueOf(c2), 0, Integer.valueOf(d3)}, chooseVideoCoverFragmentLifecycleCallbacks, ChooseVideoCoverFragmentLifecycleCallbacks.f71236a, false, 81098, new Class[]{VEChooseVideoCoverFragment.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                ChooseVideoCoverFragmentLifecycleCallbacks chooseVideoCoverFragmentLifecycleCallbacks2 = chooseVideoCoverFragmentLifecycleCallbacks;
                                PatchProxy.accessDispatch(new Object[]{vEChooseVideoCoverFragment, Integer.valueOf(color), Integer.valueOf(b2), Integer.valueOf(d2), Integer.valueOf(c2), 0, Integer.valueOf(d3)}, chooseVideoCoverFragmentLifecycleCallbacks2, ChooseVideoCoverFragmentLifecycleCallbacks.f71236a, false, 81098, new Class[]{VEChooseVideoCoverFragment.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            ChooseCoverActivity.this.f71228c.q.b(color);
                            int e2 = fc.e(vEChooseVideoCoverFragment.getActivity());
                            int width = ChooseCoverActivity.this.f71230e.getWidth();
                            aj d4 = ChooseCoverActivity.this.f71228c.q.d();
                            float f2 = (float) d4.f77891b;
                            float f3 = ((float) d4.f77890a) / f2;
                            float f4 = (float) width;
                            float f5 = (float) c2;
                            if (f3 > f4 / f5) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, (float) ((int) (f4 / f3))});
                                ofFloat.setDuration(0);
                                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                                z = true;
                                AnonymousClass2 r9 = new ValueAnimator.AnimatorUpdateListener(f3, e2, d2, b2, 0, d3) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f71241a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ float f71242b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ int f71243c;

                                    /* renamed from: d  reason: collision with root package name */
                                    final /* synthetic */ int f71244d;

                                    /* renamed from: e  reason: collision with root package name */
                                    final /* synthetic */ int f71245e;

                                    /* renamed from: f  reason: collision with root package name */
                                    final /* synthetic */ int f71246f;
                                    final /* synthetic */ int g;

                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f71241a, false, 81103, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f71241a, false, 81103, new Class[]{ValueAnimator.class}, Void.TYPE);
                                            return;
                                        }
                                        float animatedFraction = valueAnimator.getAnimatedFraction();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        int i = (int) (((((((float) this.f71243c) - (((float) (this.f71244d - this.f71245e)) * animatedFraction)) - floatValue) / 2.0f) + ((float) this.f71246f)) - ((float) this.g));
                                        int i2 = (int) (this.f71242b * floatValue);
                                        int i3 = (int) floatValue;
                                        ChooseCoverActivity.this.f71228c.q.a(0, i, i2, i3);
                                        ChooseVideoCoverFragmentLifecycleCallbacks.this.a(0, i, i2, i3);
                                        ChooseCoverActivity.this.a(0, i, i2, i3);
                                    }

                                    {
                                        this.f71242b = r2;
                                        this.f71243c = r3;
                                        this.f71244d = r4;
                                        this.f71245e = r5;
                                        this.f71246f = r6;
                                        this.g = r7;
                                    }
                                };
                                ofFloat.addUpdateListener(r9);
                                ofFloat.start();
                            } else {
                                z = true;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f2, f5});
                                ofFloat2.setDuration(0);
                                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(f3, width, b2) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f71247a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ float f71248b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ int f71249c;

                                    /* renamed from: d  reason: collision with root package name */
                                    final /* synthetic */ int f71250d;

                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f71247a, false, 81104, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f71247a, false, 81104, new Class[]{ValueAnimator.class}, Void.TYPE);
                                            return;
                                        }
                                        float animatedFraction = valueAnimator.getAnimatedFraction();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        float f2 = this.f71248b * floatValue;
                                        float f3 = ((float) this.f71250d) * animatedFraction;
                                        int i = (int) ((((float) this.f71249c) - f2) / 2.0f);
                                        int i2 = (int) f3;
                                        int i3 = (int) f2;
                                        int i4 = (int) floatValue;
                                        ChooseCoverActivity.this.f71228c.q.a(i, i2, i3, i4);
                                        ChooseVideoCoverFragmentLifecycleCallbacks.this.a(i, i2, i3, i4);
                                        ChooseCoverActivity.this.a(i, i2, i3, i4);
                                    }

                                    {
                                        this.f71248b = r2;
                                        this.f71249c = r3;
                                        this.f71250d = r4;
                                    }
                                });
                                ofFloat2.start();
                            }
                            ChooseCoverActivity.this.f71228c.q.a(z);
                            if (!ChooseCoverActivity.this.f71227b.isMvThemeVideoType()) {
                                ChooseCoverActivity.this.f71229d.c(0.0f);
                            }
                        }
                    }
                }, 300);
            }
        }

        public final void a(int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f71236a, false, 81099, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f71236a, false, 81099, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ChooseCoverActivity.this.f71231f.getLayoutParams();
            layoutParams.topMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            ChooseCoverActivity.this.f71231f.setLayoutParams(layoutParams);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f71226a, false, 81092, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71226a, false, 81092, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71226a, false, 81093, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71226a, false, 81093, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final MutableLiveData<s> b() {
        return this.l;
    }

    public final cb c() {
        return this.f71227b;
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return this.g;
    }

    public final p a() {
        return this.f71228c.q;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f71226a, false, 81082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71226a, false, 81082, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.r, C0906R.anim.s);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f71226a, false, 81091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71226a, false, 81091, new Class[0], Void.TYPE);
            return;
        }
        if (this.f71229d != null && !this.f71229d.a()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f71226a, false, 81089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71226a, false, 81089, new Class[0], Void.TYPE);
            return;
        }
        this.g.markState(Lifecycle.State.DESTROYED);
        a().x();
        this.f71228c.a();
        super.onDestroy();
    }

    public final void N() {
        if (PatchProxy.isSupport(new Object[0], this, f71226a, false, 81090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71226a, false, 81090, new Class[0], Void.TYPE);
            return;
        }
        if (this.f71229d != null) {
            VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this.f71229d;
            if (PatchProxy.isSupport(new Object[0], vEChooseVideoCoverFragment, VEChooseVideoCoverFragment.f66090a, false, 75366, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], vEChooseVideoCoverFragment, VEChooseVideoCoverFragment.f66090a, false, 75366, new Class[0], Void.TYPE);
            } else if (vEChooseVideoCoverFragment.l) {
                Bitmap e2 = vEChooseVideoCoverFragment.j.a().e();
                if (e2 != null) {
                    vEChooseVideoCoverFragment.k = (float) vEChooseVideoCoverFragment.j.a().u();
                    vEChooseVideoCoverFragment.f66091b.setVideoCoverFrameView(e2);
                    e2.recycle();
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0234, code lost:
        if (r12.equals("3") != false) goto L_0x0256;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r7 = r14
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 81083(0x13cbb, float:1.13621E-40)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81083(0x13cbb, float:1.13621E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r15)
            android.view.Window r0 = r14.getWindow()
            r1 = 128(0x80, float:1.794E-43)
            r0.addFlags(r1)
            r0 = 2131689666(0x7f0f00c2, float:1.9008354E38)
            r14.setContentView((int) r0)
            boolean r0 = com.ss.android.ugc.aweme.app.a.a.a((android.app.Activity) r14)
            if (r0 != 0) goto L_0x0055
            com.ss.android.ugc.aweme.base.utils.v.a((android.app.Activity) r14)
        L_0x0055:
            com.ss.android.ugc.aweme.shortvideo.hm r0 = new com.ss.android.ugc.aweme.shortvideo.hm
            r0.<init>()
            com.ss.android.vesdk.i r0 = r0.a()
            com.ss.android.ugc.aweme.port.in.a.a((com.ss.android.vesdk.i) r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81084(0x13cbc, float:1.13623E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0085
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81084(0x13cbc, float:1.13623E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x009b
        L_0x0085:
            r0 = 2131171381(0x7f071835, float:1.7957147E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f71231f = r0
            r0 = 2131169122(0x7f070f62, float:1.7952565E38)
            android.view.View r0 = r14.findViewById(r0)
            android.view.SurfaceView r0 = (android.view.SurfaceView) r0
            r7.f71230e = r0
        L_0x009b:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81085(0x13cbd, float:1.13624E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81085(0x13cbd, float:1.13624E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03c0
        L_0x00c0:
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = "KEY_VIDEO_PUBLISH_EDIT_MODEL"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = (com.ss.android.ugc.aweme.shortvideo.edit.cb) r0
            r7.f71227b = r0
            dmt.av.video.ad r0 = new dmt.av.video.ad
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f71227b
            int r1 = r1.videoEditorType
            r0.<init>(r1)
            r7.f71228c = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.mVideoCanvasWidth
            if (r0 <= 0) goto L_0x00f2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.mVideoCanvasHeight
            if (r0 <= 0) goto L_0x00f2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.mVideoCanvasWidth
            r7.j = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.mVideoCanvasHeight
            r7.k = r0
            goto L_0x012c
        L_0x00f2:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.mVideoWidth
            r7.j = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.mVideoHeight
            r7.k = r0
            int r0 = r7.k
            if (r0 == 0) goto L_0x0106
            int r0 = r7.j
            if (r0 != 0) goto L_0x012c
        L_0x0106:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.getOriginal()
            if (r0 != 0) goto L_0x0111
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.r
            goto L_0x0113
        L_0x0111:
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.q
        L_0x0113:
            int r0 = r0.getVideoWidth()
            r7.j = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            int r0 = r0.getOriginal()
            if (r0 != 0) goto L_0x0124
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.r
            goto L_0x0126
        L_0x0124:
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.q
        L_0x0126:
            int r0 = r0.getVideoHeight()
            r7.k = r0
        L_0x012c:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r0 = r0.previewConfigure
            r1 = 0
            if (r0 != 0) goto L_0x0159
            dmt.av.video.u r0 = new dmt.av.video.u
            r0.<init>()
            java.lang.String[] r2 = new java.lang.String[r8]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            java.lang.String r3 = r3.mPath
            r2[r9] = r3
            r0.mVideoPaths = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            java.lang.String r2 = r2.getWavFile()
            if (r2 != 0) goto L_0x014c
            r2 = r1
            goto L_0x0156
        L_0x014c:
            java.lang.String[] r2 = new java.lang.String[r8]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            java.lang.String r3 = r3.getWavFile()
            r2[r9] = r3
        L_0x0156:
            r0.mAudioPaths = r2
            goto L_0x0178
        L_0x0159:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r0 = r0.previewConfigure
            r0.mAudioPaths = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "init ve_editor in publish choose cover page using preview configure:"
            r2.<init>(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r3 = r3.previewConfigure
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r2)
        L_0x0178:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            int r2 = r2.mVideoCanvasWidth
            r0.canvasWidth = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            int r2 = r2.mVideoCanvasHeight
            r0.canvasHeight = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            float r2 = r2.voiceVolume
            r0.mVolume = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            float r2 = r2.musicVolume
            r0.mMusicVolume = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            java.lang.String r2 = r2.mPath
            java.lang.String r2 = com.ss.android.ugc.aweme.shortvideo.a.d.a((java.lang.String) r2)
            r0.mWorkspace = r2
            r2 = 30
            r0.mFps = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            java.lang.String r2 = r2.mMusicPath
            r0.mMusicPath = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            int r2 = r2.mMusicStart
            r0.mMusicInPoint = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            int r2 = r2.mMusicEnd
            r0.mMusicOutPoint = r2
            r2 = 2
            r0.mPageType = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            boolean r3 = r3.mIsFromDraft
            r0.mIsFromDraft = r3
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            int r3 = r3.videoEditorType
            r0.videoEditorType = r3
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            com.ss.android.ugc.aweme.x.a r3 = r3.mvCreateVideoData
            r0.mvCreateVideoData = r3
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            r3.setValue(r0)
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            dmt.av.video.t r5 = new dmt.av.video.t
            r5.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r7.f71227b
            java.lang.String r6 = r6.mMusicPath
            r5.f83064b = r6
            com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r7.f71227b
            int r6 = r6.mMusicStart
            r5.f83065c = r6
            r6 = -1
            r5.f83066d = r6
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r7.f71227b
            float r10 = r10.musicVolume
            r5.f83067e = r10
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r7.f71227b
            java.lang.String r10 = r10.musicId
            r5.f83068f = r10
            r4.setValue(r5)
            dmt.av.video.f r5 = new dmt.av.video.f
            r5.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r7.f71227b
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r10 = r10.mEffectList
            if (r10 == 0) goto L_0x0207
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r7.f71227b
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r10 = r10.mEffectList
            dmt.av.video.q.a(r10, r5)
        L_0x0207:
            android.arch.lifecycle.MutableLiveData r10 = new android.arch.lifecycle.MutableLiveData
            r10.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r11 = r7.f71227b
            com.ss.android.ugc.aweme.n.a r11 = r11.infoStickerModel
            r10.setValue(r11)
            dmt.av.video.h r11 = new dmt.av.video.h
            r11.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r12 = r7.f71227b
            com.ss.android.ugc.aweme.effect.EffectPointModel r12 = r12.mTimeEffect
            if (r12 == 0) goto L_0x0287
            com.ss.android.ugc.aweme.shortvideo.edit.cb r12 = r7.f71227b
            com.ss.android.ugc.aweme.effect.EffectPointModel r12 = r12.mTimeEffect
            java.lang.String r12 = r12.getKey()
            int r13 = r12.hashCode()
            switch(r13) {
                case 48: goto L_0x024b;
                case 49: goto L_0x0241;
                case 50: goto L_0x0237;
                case 51: goto L_0x022e;
                default: goto L_0x022d;
            }
        L_0x022d:
            goto L_0x0255
        L_0x022e:
            java.lang.String r13 = "3"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0255
            goto L_0x0256
        L_0x0237:
            java.lang.String r2 = "2"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0255
            r2 = 1
            goto L_0x0256
        L_0x0241:
            java.lang.String r2 = "1"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0255
            r2 = 3
            goto L_0x0256
        L_0x024b:
            java.lang.String r2 = "0"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0255
            r2 = 0
            goto L_0x0256
        L_0x0255:
            r2 = -1
        L_0x0256:
            switch(r2) {
                case 0: goto L_0x0280;
                case 1: goto L_0x0272;
                case 2: goto L_0x0264;
                case 3: goto L_0x025f;
                default: goto L_0x0259;
            }
        L_0x0259:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x025f:
            dmt.av.video.x r2 = dmt.av.video.x.b()
            goto L_0x0284
        L_0x0264:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r2.mTimeEffect
            int r2 = r2.getEndPoint()
            long r12 = (long) r2
            dmt.av.video.x r2 = dmt.av.video.x.b(r12)
            goto L_0x0284
        L_0x0272:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f71227b
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r2.mTimeEffect
            int r2 = r2.getEndPoint()
            long r12 = (long) r2
            dmt.av.video.x r2 = dmt.av.video.x.a(r12)
            goto L_0x0284
        L_0x0280:
            dmt.av.video.x r2 = dmt.av.video.x.a()
        L_0x0284:
            r11.setValue(r2)
        L_0x0287:
            dmt.av.video.ad r2 = r7.f71228c
            r2.f82859e = r3
            dmt.av.video.ad r2 = r7.f71228c
            r2.f82860f = r4
            dmt.av.video.ad r2 = r7.f71228c
            r2.i = r5
            dmt.av.video.ad r2 = r7.f71228c
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            r2.g = r3
            dmt.av.video.ad r2 = r7.f71228c
            android.arch.lifecycle.MutableLiveData<dmt.av.video.s> r3 = r7.l
            r2.h = r3
            dmt.av.video.ad r2 = r7.f71228c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.a((java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel>) r3)
            dmt.av.video.ad r2 = r7.f71228c
            r2.j = r11
            dmt.av.video.h r2 = new dmt.av.video.h
            r2.<init>()
            dmt.av.video.ad r3 = r7.f71228c
            r3.k = r2
            dmt.av.video.ad r3 = r7.f71228c
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            r3.l = r4
            dmt.av.video.ad r3 = r7.f71228c
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            r3.m = r4
            dmt.av.video.ad r3 = r7.f71228c
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            r3.a((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) r4)
            dmt.av.video.ad r3 = r7.f71228c
            r3.n = r10
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.a.b r4 = new com.ss.android.ugc.aweme.shortvideo.edit.a.b
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r7.f71227b
            boolean r5 = r5.autoEnhanceOn
            com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r7.f71227b
            int r6 = r6.autoEnhanceType
            r4.<init>(r5, r6, r8)
            r3.setValue(r4)
            dmt.av.video.ad r4 = r7.f71228c
            r4.o = r3
            android.arch.lifecycle.LifecycleRegistry r3 = r7.g
            android.arch.lifecycle.Lifecycle$State r4 = android.arch.lifecycle.Lifecycle.State.STARTED
            r3.markState(r4)
            dmt.av.video.ad r3 = r7.f71228c
            android.view.SurfaceView r4 = r7.f71230e
            r3.a(r14, r14, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            com.ss.android.ugc.aweme.effect.EffectPointModel r3 = r3.mTimeEffect
            if (r3 == 0) goto L_0x0318
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            com.ss.android.ugc.aweme.effect.EffectPointModel r3 = r3.mTimeEffect
            java.lang.String r3 = r3.getKey()
            java.lang.String r4 = "1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0318
            r3 = 1
            goto L_0x0319
        L_0x0318:
            r3 = 0
        L_0x0319:
            if (r3 == 0) goto L_0x0385
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r3 = r3.previewConfigure
            if (r3 == 0) goto L_0x0348
            dmt.av.video.ad r3 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r4 = r4.previewConfigure
            java.lang.String[] r4 = r4.getReverseVideoArray()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r5 = r5.previewConfigure
            java.lang.String[] r5 = r5.getReverseAudioArray()
            r3.a((java.lang.String[]) r4, (java.lang.String[]) r5)
            dmt.av.video.ad r3 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r4 = r4.previewConfigure
            java.lang.String[] r4 = r4.getTempVideoArray()
            r3.b((java.lang.String[]) r4)
            goto L_0x0357
        L_0x0348:
            dmt.av.video.ad r3 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            java.lang.String[] r4 = new java.lang.String[r8]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r7.f71227b
            java.lang.String r5 = r5.mReversePath
            r4[r9] = r5
            r3.a((java.lang.String[]) r4)
        L_0x0357:
            dmt.av.video.ad r3 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            r3.c((boolean) r8)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.f71227b
            boolean r3 = r3.isFastImport
            if (r3 == 0) goto L_0x0385
            dmt.av.video.ad r3 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            com.ss.android.vesdk.runtime.b r3 = r3.f78038b
            if (r3 == 0) goto L_0x0385
            dmt.av.video.ad r3 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            dmt.av.video.ad r4 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r4 = r4.q
            com.ss.android.vesdk.runtime.b r4 = r4.f78038b
            int r4 = r4.h
            dmt.av.video.ad r5 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r5 = r5.q
            com.ss.android.vesdk.runtime.b r5 = r5.f78038b
            int r5 = r5.i
            float r0 = r0.mVolume
            r3.a((int) r4, (int) r5, (float) r0)
        L_0x0385:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            if (r0 == 0) goto L_0x03a4
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            r0.setShowErrorToast(r9)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            r0.setPreprocessResult(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f71227b
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            dmt.av.video.j r0 = dmt.av.video.j.a(r8, r0)
            r2.setValue(r0)
        L_0x03a4:
            dmt.av.video.ad r0 = r7.f71228c
            com.ss.android.ugc.aweme.shortvideo.b.b r0 = r0.q
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f71227b
            int r1 = r1.mSelectedId
            com.ss.android.ugc.aweme.filter.h r1 = com.ss.android.ugc.aweme.filter.y.a(r1)
            java.lang.String r1 = r1.j
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.a((java.lang.String) r1, (float) r2)
            android.view.SurfaceView r0 = r7.f71230e
            int r1 = r7.j
            int r2 = r7.k
            com.ss.android.ugc.aweme.shortvideo.fb.b(r0, r1, r2)
        L_0x03c0:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81086(0x13cbe, float:1.13626E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03f1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81086(0x13cbe, float:1.13626E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0495
        L_0x03f1:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81087(0x13cbf, float:1.13627E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0428
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f71226a
            r3 = 0
            r4 = 81087(0x13cbf, float:1.13627E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x043b
        L_0x0428:
            if (r15 != 0) goto L_0x042b
            goto L_0x043b
        L_0x042b:
            android.support.v4.app.FragmentManager r0 = r14.getSupportFragmentManager()
            java.lang.String r1 = "cover"
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment
            if (r0 != 0) goto L_0x043a
            goto L_0x043b
        L_0x043a:
            r8 = 0
        L_0x043b:
            if (r8 == 0) goto L_0x045b
            com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment r0 = new com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment
            r0.<init>()
            r7.f71229d = r0
            android.support.v4.app.FragmentManager r0 = r14.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131167957(0x7f070ad5, float:1.7950202E38)
            com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment r2 = r7.f71229d
            java.lang.String r3 = "cover"
            android.support.v4.app.FragmentTransaction r0 = r0.add(r1, r2, r3)
            r0.commitAllowingStateLoss()
            goto L_0x0469
        L_0x045b:
            android.support.v4.app.FragmentManager r0 = r14.getSupportFragmentManager()
            java.lang.String r1 = "cover"
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
            com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment r0 = (com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment) r0
            r7.f71229d = r0
        L_0x0469:
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r7.i
            com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$1 r1 = new com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$1
            r1.<init>()
            r0.observe(r14, r1)
            android.arch.lifecycle.MutableLiveData<android.graphics.Bitmap> r0 = r7.h
            com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$2 r1 = new com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$2
            r1.<init>()
            r0.observe(r14, r1)
            com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment r0 = r7.f71229d
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r7.i
            r0.o = r1
            com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment r0 = r7.f71229d
            android.arch.lifecycle.MutableLiveData<android.graphics.Bitmap> r1 = r7.h
            r0.n = r1
            android.support.v4.app.FragmentManager r0 = r14.getSupportFragmentManager()
            com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$ChooseVideoCoverFragmentLifecycleCallbacks r1 = new com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$ChooseVideoCoverFragmentLifecycleCallbacks
            r1.<init>()
            r0.registerFragmentLifecycleCallbacks(r1, r9)
        L_0x0495:
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity.onCreate(android.os.Bundle):void");
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71226a, false, 81088, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71226a, false, 81088, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f71227b != null && !StringUtils.isEmpty(this.f71227b.mainBusinessData)) {
            InteractStickerStruct a2 = b.a(this.f71227b.mainBusinessData, 1, d.TRACK_PAGE_EDIT);
            if (!(a2 == null || a2.getVoteStruct() == null)) {
                VotingStickerView votingStickerView = (VotingStickerView) findViewById(C0906R.id.c5r);
                View findViewById = findViewById(C0906R.id.dtw);
                if (a.b()) {
                    findViewById.setBackgroundColor(-1);
                }
                if (votingStickerView != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                    int top = this.f71230e.getTop() + i3;
                    if (top > 0) {
                        layoutParams.height = top;
                        findViewById.setLayoutParams(layoutParams);
                        findViewById.setVisibility(0);
                    }
                    int i6 = this.f71228c.q.d().f77890a;
                    int i7 = this.f71228c.q.d().f77891b;
                    float min = Math.min(((float) i4) / ((float) i6), ((float) i5) / ((float) i7));
                    votingStickerView.a(a2.getVoteStruct());
                    votingStickerView.setTouchEnable(true);
                    votingStickerView.b();
                    votingStickerView.setEditEnable(false);
                    a aVar = new a(this, a2, i6, min, i7, votingStickerView, i2, i3);
                    votingStickerView.post(aVar);
                }
            }
        }
    }
}
