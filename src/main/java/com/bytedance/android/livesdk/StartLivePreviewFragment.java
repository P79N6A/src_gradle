package com.bytedance.android.livesdk;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.effect.k;
import com.bytedance.android.livesdk.sticker.a.c;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.a.a.d;
import java.util.HashMap;

public class StartLivePreviewFragment extends BaseFragment implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8869a = null;
    private static int m = 720;
    private static int n = 1280;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.ugc.live.a.a f8870b;

    /* renamed from: c  reason: collision with root package name */
    public View f8871c;
    public com.bytedance.android.livesdk.effect.f h;
    public com.bytedance.android.livesdk.effect.a i;
    public d j;
    public GestureDetector k;
    public boolean l;
    private SurfaceView o;
    private TextView p;
    private AnimationSet q;
    private AnimationSet r;
    private int s;
    private GestureDetectLayout t;
    private e u;
    private com.bytedance.android.livesdkapi.depend.model.a.d v = new com.bytedance.android.livesdkapi.depend.model.a.d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8877a;

        public final void a(boolean z) {
        }

        public final void b() {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f8877a, false, 3019, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8877a, false, 3019, new Class[0], Void.TYPE);
                return;
            }
            StartLivePreviewFragment.this.getActivity().finish();
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3012, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3012, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            if (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a != 0.0f) {
                StartLivePreviewFragment.this.i.d(f2 / ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a);
            }
        }

        public final void b(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3013, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3013, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            StartLivePreviewFragment.this.i.a(f2);
        }

        public final void c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3014, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3014, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            StartLivePreviewFragment.this.i.b(f2);
        }

        public final void d(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3015, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8877a, false, 3015, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            StartLivePreviewFragment.this.i.c(f2);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8877a, false, 3016, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8877a, false, 3016, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (StartLivePreviewFragment.this.f8870b != null) {
                StartLivePreviewFragment.this.f8870b.d();
            }
        }

        public final void b(int i) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8877a, false, 3018, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8877a, false, 3018, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            int a2 = StartLivePreviewFragment.this.h.a();
            float a3 = com.bytedance.android.livesdk.effect.f.a(j.a().f13785b, i);
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
                if (!Lists.isEmpty(j.a().f13785b) && i >= 0 && i < j.a().f13785b.size()) {
                    com.bytedance.android.livesdk.sticker.b.a b2 = com.bytedance.android.livesdk.v.j.q().p().a().b(h.a("beautyTag", j.a().f13785b.get(i)));
                    if (!(b2 == null || b2.h == null)) {
                        c o = com.bytedance.android.livesdk.v.j.q().o();
                        o.a(com.bytedance.android.livesdk.sticker.c.a.f17264e, b2);
                        Float c2 = o.c(b2.h.f17256b);
                        if (c2 == null) {
                            c2 = Float.valueOf(k.a(b2, b2.h.f17255a));
                        }
                        int i2 = (int) a3;
                        if (c2.floatValue() > k.a(b2, i2)) {
                            o.a(b2.h.f17256b, k.a(b2, i2));
                        }
                    }
                }
            } else if (StartLivePreviewFragment.this.i.f13710e > (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * a3) / 100.0f) {
                StartLivePreviewFragment.this.i.d(a3 / 100.0f);
            }
            if (a2 != i) {
                StartLivePreviewFragment.this.h.a(i);
            }
            StartLivePreviewFragment startLivePreviewFragment = StartLivePreviewFragment.this;
            if (i >= a2) {
                z = false;
            }
            startLivePreviewFragment.a(z);
        }
    };
    private View.OnTouchListener w = new View.OnTouchListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8879a;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f8879a, false, 3020, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f8879a, false, 3020, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            StartLivePreviewFragment.this.k.onTouchEvent(motionEvent2);
            return false;
        }
    };

    final class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8881a;

        private a() {
        }

        /* synthetic */ a(StartLivePreviewFragment startLivePreviewFragment, byte b2) {
            this();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8881a, false, 3021, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8881a, false, 3021, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (motionEvent == null || motionEvent2 == null) {
                return false;
            } else {
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) <= 200.0f || Math.abs(f2) <= 100.0f) {
                    return false;
                }
                if (x > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    com.bytedance.android.livesdk.effect.f fVar = StartLivePreviewFragment.this.h;
                    if (PatchProxy.isSupport(new Object[0], fVar, com.bytedance.android.livesdk.effect.f.f13767a, false, 8166, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], fVar, com.bytedance.android.livesdk.effect.f.f13767a, false, 8166, new Class[0], Void.TYPE);
                    } else {
                        fVar.b("live_take_page", new HashMap());
                    }
                } else {
                    com.bytedance.android.livesdk.effect.f fVar2 = StartLivePreviewFragment.this.h;
                    if (PatchProxy.isSupport(new Object[0], fVar2, com.bytedance.android.livesdk.effect.f.f13767a, false, 8164, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], fVar2, com.bytedance.android.livesdk.effect.f.f13767a, false, 8164, new Class[0], Void.TYPE);
                    } else {
                        fVar2.a("live_take_page", new HashMap<>());
                    }
                }
                StartLivePreviewFragment.this.a(z);
                return true;
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8869a, false, 2998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8869a, false, 2998, new Class[0], Void.TYPE);
            return;
        }
        if (this.f8870b != null) {
            this.f8870b.c();
        }
        TTLiveSDKContext.getLiveService().i().b(this);
        super.onDestroy();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8869a, false, 2997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8869a, false, 2997, new Class[0], Void.TYPE);
            return;
        }
        this.u.k();
        if (this.f8870b != null) {
            this.f8870b.b();
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8869a, false, 2996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8869a, false, 2996, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f8870b.a();
        this.u.j();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8869a, false, 2999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8869a, false, 2999, new Class[0], Void.TYPE);
            return;
        }
        if (this.f8870b != null) {
            this.f8870b.b();
            this.f8870b.c();
            this.f8870b = null;
        }
        this.h.d();
        getActivity().finish();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8869a, false, PushConstants.WORK_RECEIVER_EVENTCORE_ERROR, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8869a, false, PushConstants.WORK_RECEIVER_EVENTCORE_ERROR, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        String c2 = this.h.c();
        if (!TextUtils.isEmpty(c2)) {
            this.p.setText(c2);
            if (z) {
                if (this.q == null) {
                    this.q = b(true);
                } else {
                    this.f8871c.clearAnimation();
                }
                this.f8871c.startAnimation(this.q);
                return;
            }
            if (this.r == null) {
                this.r = b(false);
            } else {
                this.f8871c.clearAnimation();
            }
            this.f8871c.startAnimation(this.r);
        }
    }

    private AnimationSet b(boolean z) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8869a, false, 3005, new Class[]{Boolean.TYPE}, AnimationSet.class)) {
            return (AnimationSet) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8869a, false, 3005, new Class[]{Boolean.TYPE}, AnimationSet.class);
        }
        int width = (this.s - this.p.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        alphaAnimation.setDuration(300);
        if (z) {
            f2 = (float) (-width);
        } else {
            f2 = (float) width;
        }
        float f6 = 50.0f;
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, f3, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        translateAnimation.setDuration(300);
        if (z) {
            f4 = -50.0f;
        } else {
            f4 = 50.0f;
        }
        if (z) {
            f5 = 50.0f;
        } else {
            f5 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f4, f5, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new FastOutSlowInInterpolator());
        alphaAnimation2.setDuration(300);
        if (!z) {
            f6 = -50.0f;
        }
        if (!z) {
            width = -width;
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, (float) width, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new FastOutSlowInInterpolator());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8875a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f8875a, false, 3008, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f8875a, false, 3008, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                StartLivePreviewFragment.this.f8871c.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f8875a, false, 3007, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f8875a, false, 3007, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                StartLivePreviewFragment.this.f8871c.setVisibility(0);
            }
        });
        return animationSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(@android.support.annotation.NonNull android.view.View r11, @android.support.annotation.Nullable android.os.Bundle r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 2995(0xbb3, float:4.197E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 2995(0xbb3, float:4.197E-42)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003d:
            super.onViewCreated(r11, r12)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3001(0xbb9, float:4.205E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3001(0xbb9, float:4.205E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00a2
        L_0x0062:
            int r0 = com.bytedance.android.live.core.utils.ac.c()
            r10.s = r0
            android.view.View r0 = r10.getView()
            r1 = 2131166734(0x7f07060e, float:1.7947722E38)
            android.view.View r0 = r0.findViewById(r1)
            r10.f8871c = r0
            android.view.View r0 = r10.getView()
            r1 = 2131168782(0x7f070e0e, float:1.7951876E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.livesdk.widget.GestureDetectLayout r0 = (com.bytedance.android.livesdk.widget.GestureDetectLayout) r0
            r10.t = r0
            android.view.View r0 = r10.getView()
            r1 = 2131170188(0x7f07138c, float:1.7954727E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.SurfaceView r0 = (android.view.SurfaceView) r0
            r10.o = r0
            android.view.View r0 = r10.getView()
            r1 = 2131166735(0x7f07060f, float:1.7947724E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.p = r0
        L_0x00a2:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3003(0xbbb, float:4.208E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3003(0xbbb, float:4.208E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0195
        L_0x00c5:
            com.bytedance.android.livesdk.w.c<java.lang.Integer> r0 = com.bytedance.android.livesdk.w.b.g
            java.lang.Object r0 = r0.b()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00d5
            r0 = 0
            goto L_0x00d6
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            com.bytedance.android.livesdk.s r1 = com.bytedance.android.livesdk.s.INST
            java.lang.String r1 = r1.getModelFilePath()
            android.support.v4.app.FragmentActivity r2 = r10.getActivity()
            if (r2 == 0) goto L_0x0104
            android.content.Intent r2 = r2.getIntent()
            r3 = 1280(0x500, float:1.794E-42)
            r4 = 720(0x2d0, float:1.009E-42)
            if (r2 == 0) goto L_0x0100
            java.lang.String r5 = "orientation"
            java.lang.String r2 = r2.getStringExtra(r5)
            java.lang.String r5 = "landscape"
            boolean r2 = com.bytedance.common.utility.StringUtils.equal(r2, r5)
            if (r2 == 0) goto L_0x0100
            m = r3
            n = r4
            r2 = 1
            goto L_0x0105
        L_0x0100:
            m = r4
            n = r3
        L_0x0104:
            r2 = 0
        L_0x0105:
            com.ss.ugc.live.a.d$a r3 = new com.ss.ugc.live.a.d$a
            android.support.v4.app.FragmentActivity r4 = r10.getActivity()
            r3.<init>(r4)
            com.ss.ugc.live.a.d$a r1 = r3.a((java.lang.String) r1)
            com.ss.ugc.live.a.d$a r0 = r1.a((int) r0)
            int r1 = m
            int r3 = n
            com.ss.ugc.live.a.d$a r0 = r0.a(r1, r3)
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.USE_NEW_RENDER_CHAIN
            java.lang.Object r1 = r1.a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r9) goto L_0x012e
            r1 = 1
            goto L_0x012f
        L_0x012e:
            r1 = 0
        L_0x012f:
            com.ss.ugc.live.a.d$a r0 = r0.a((boolean) r1)
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdk.live.model.Camera2AB> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.CAMERA_AB_SETTING_KEY
            java.lang.Object r1 = r1.a()
            com.bytedance.android.livesdk.live.model.Camera2AB r1 = (com.bytedance.android.livesdk.live.model.Camera2AB) r1
            int r1 = r1.getCameraType()
            if (r1 != r7) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r7 = 1
        L_0x0143:
            com.ss.ugc.live.a.d$a r0 = r0.b(r7)
            com.bytedance.android.livesdk.s r1 = com.bytedance.android.livesdk.s.INST
            android.content.Context r3 = r10.getContext()
            com.bef.effectsdk.b r1 = r1.getResourceFinder(r3)
            com.ss.ugc.live.a.d$a r0 = r0.a((com.bef.effectsdk.b) r1)
            com.ss.ugc.live.a.d r0 = r0.a()
            com.ss.ugc.live.a.b r1 = new com.ss.ugc.live.a.b
            android.view.SurfaceView r3 = r10.o
            com.bytedance.android.livesdk.StartLivePreviewFragment$1 r4 = new com.bytedance.android.livesdk.StartLivePreviewFragment$1
            r4.<init>()
            r1.<init>(r3, r0, r4)
            r10.f8870b = r1
            com.bytedance.android.livesdk.effect.f r0 = new com.bytedance.android.livesdk.effect.f
            com.ss.ugc.live.a.a r1 = r10.f8870b
            r0.<init>(r1)
            r10.h = r0
            com.bytedance.android.livesdk.effect.c r0 = new com.bytedance.android.livesdk.effect.c
            r0.<init>()
            r10.i = r0
            com.ss.ugc.live.a.a.d r0 = new com.ss.ugc.live.a.a.d
            r0.<init>()
            r10.j = r0
            com.ss.ugc.live.a.a r0 = r10.f8870b
            com.ss.ugc.live.a.a.d r1 = r10.j
            r0.a((com.ss.ugc.live.a.a.a) r1)
            if (r2 == 0) goto L_0x0195
            android.view.SurfaceView r0 = r10.o
            android.view.SurfaceHolder r0 = r0.getHolder()
            com.bytedance.android.livesdk.StartLivePreviewFragment$2 r1 = new com.bytedance.android.livesdk.StartLivePreviewFragment$2
            r1.<init>()
            r0.addCallback(r1)
        L_0x0195:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3002(0xbba, float:4.207E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01b7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3002(0xbba, float:4.207E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01f5
        L_0x01b7:
            com.bytedance.android.livesdkapi.service.c r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            com.bytedance.android.livesdkapi.depend.model.a.e r0 = r0.b()
            r10.u = r0
            com.bytedance.android.livesdkapi.depend.model.a.e r0 = r10.u
            com.bytedance.android.livesdkapi.depend.model.a.d r1 = r10.v
            r0.a((com.bytedance.android.livesdkapi.depend.model.a.d) r1)
            com.bytedance.android.livesdkapi.depend.model.a.e r0 = r10.u
            r1 = 10
            r0.c(r1)
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            android.support.v4.app.FragmentManager r0 = r0.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131166139(0x7f0703bb, float:1.7946515E38)
            com.bytedance.android.livesdkapi.depend.model.a.e r2 = r10.u
            android.support.v4.app.Fragment r2 = r2.l()
            r0.replace(r1, r2)
            r0.commitAllowingStateLoss()
            com.bytedance.android.livesdkapi.service.c r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            com.bytedance.android.livesdkapi.depend.model.a.f r0 = r0.i()
            r0.a(r10)
        L_0x01f5:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3004(0xbbc, float:4.21E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0217
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f8869a
            r3 = 0
            r4 = 3004(0xbbc, float:4.21E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0217:
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.support.v4.app.FragmentActivity r1 = r10.getActivity()
            com.bytedance.android.livesdk.StartLivePreviewFragment$a r2 = new com.bytedance.android.livesdk.StartLivePreviewFragment$a
            r2.<init>(r10, r8)
            r0.<init>(r1, r2)
            r10.k = r0
            com.bytedance.android.livesdk.widget.GestureDetectLayout r0 = r10.t
            android.view.View$OnTouchListener r1 = r10.w
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.StartLivePreviewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8869a, false, 2994, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.aep, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8869a, false, 2994, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
