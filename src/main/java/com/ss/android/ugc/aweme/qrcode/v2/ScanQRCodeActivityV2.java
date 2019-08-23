package com.ss.android.ugc.aweme.qrcode.v2;

import a.i;
import a.j;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.d;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.h;
import com.ss.android.medialib.model.Enigma;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.qr.EnigmaScanner;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.qrcode.BaseScanQRCodeActivity;
import com.ss.android.ugc.aweme.qrcode.b.a;
import com.ss.android.ugc.aweme.qrcode.c.e;
import com.ss.android.ugc.aweme.qrcode.d.f;
import com.ss.android.ugc.aweme.qrcode.d.m;
import com.ss.android.ugc.aweme.qrcode.f.c;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.vesdk.ai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;

public class ScanQRCodeActivityV2 extends BaseScanQRCodeActivity implements View.OnClickListener, l, m.a {
    public static ChangeQuickRedirect g;
    c A;
    EnigmaScanner.a B = new EnigmaScanner.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63501a;

        public final void a(EnigmaResult enigmaResult) {
            if (PatchProxy.isSupport(new Object[]{enigmaResult}, this, f63501a, false, 70590, new Class[]{EnigmaResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{enigmaResult}, this, f63501a, false, 70590, new Class[]{EnigmaResult.class}, Void.TYPE);
                return;
            }
            if (ScanQRCodeActivityV2.this.r && !ScanQRCodeActivityV2.this.p && ScanQRCodeActivityV2.this.j != null && enigmaResult != null && enigmaResult.getResult() != null && enigmaResult.getResult().length > 0) {
                ScanQRCodeActivityV2.this.p = true;
                Enigma[] result = enigmaResult.getResult();
                ScanQRCodeActivityV2.this.j.a(ScanQRCodeActivityV2.this.n, result[0].getType(), result[0].getText(), ScanQRCodeActivityV2.this.s);
            }
            ScanQRCodeActivityV2.this.n = false;
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f63501a, false, 70591, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f63501a, false, 70591, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (ScanQRCodeActivityV2.this.r && ScanQRCodeActivityV2.this.j != null) {
                ScanQRCodeActivityV2.this.j.a(ScanQRCodeActivityV2.this.n, i, i2);
            }
            ScanQRCodeActivityV2.this.n = false;
        }
    };
    MessageCenter.a C = new e(this);
    private f D;
    private com.ss.android.ugc.aweme.profile.presenter.a E;
    private TextView F;
    private boolean G;
    private TextView H;
    private ImageView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private GestureDetector M;
    private ScaleGestureDetector N;
    SurfaceView h;
    public EnigmaScanner i;
    public m.b j;
    public com.ss.android.ugc.aweme.qrcode.d.c k;
    public com.ss.android.ugc.aweme.qrcode.c.f l;
    public e m;
    public boolean n;
    public boolean o;
    public boolean p;
    boolean q;
    public boolean r;
    public int s;
    public LinearLayout t;
    public RemoteImageView u;
    FrameLayout v;
    RelativeLayout w;
    public g x = g.b();
    public float y = 1.0f;
    boolean z = false;

    class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63526a;

        /* renamed from: c  reason: collision with root package name */
        private final float f63528c;

        /* renamed from: d  reason: collision with root package name */
        private long f63529d;

        private a() {
            this.f63528c = 0.03f;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f63526a, false, 70604, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f63526a, false, 70604, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f63529d < 500) {
                return false;
            }
            this.f63529d = currentTimeMillis;
            if (ScanQRCodeActivityV2.this.y > 1.0f) {
                while (ScanQRCodeActivityV2.this.y > 1.0f) {
                    ScanQRCodeActivityV2.this.y -= 0.03f;
                    ScanQRCodeActivityV2.this.x.a(ScanQRCodeActivityV2.this.y);
                }
            } else {
                while (ScanQRCodeActivityV2.this.y < 3.0f) {
                    ScanQRCodeActivityV2.this.y += 0.03f;
                    ScanQRCodeActivityV2.this.x.a(ScanQRCodeActivityV2.this.y);
                }
            }
            return false;
        }

        /* synthetic */ a(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b2) {
            this();
        }
    }

    class b implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63530a;

        /* renamed from: c  reason: collision with root package name */
        private final float f63532c;

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        private b() {
            this.f63532c = 0.05f;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f63530a, false, 70605, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f63530a, false, 70605, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            }
            if (scaleGestureDetector.getScaleFactor() >= 1.0f && ScanQRCodeActivityV2.this.y <= 3.0f) {
                ScanQRCodeActivityV2.this.y += 0.05f;
            } else if (ScanQRCodeActivityV2.this.y >= 1.0f) {
                ScanQRCodeActivityV2.this.y -= 0.05f;
            }
            ScanQRCodeActivityV2.this.x.a(ScanQRCodeActivityV2.this.y);
            return false;
        }

        /* synthetic */ b(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b2) {
            this();
        }
    }

    public final void a(AvatarUri avatarUri) {
    }

    public final void a(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 70585, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 70585, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onCreate", false);
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, g, false, 70586, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, g, false, 70586, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, g, false, 70578, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, g, false, 70578, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dip2Px = (int) UIUtils.dip2Px(this, 21.0f);
        if (z2) {
            this.f3842c.setTitle((int) C0906R.string.c1n);
            this.f3842c.getEndText().setVisibility(8);
            this.J.setText(C0906R.string.c07);
            com.ss.android.ugc.aweme.base.c.a(this.u, 2130839800);
            this.t.setAlpha(0.0f);
            if (this.m != null && !TextUtils.isEmpty(this.m.f63376b)) {
                this.K.setText(this.m.f63376b);
            }
            this.K.setVisibility(0);
            this.K.setAlpha(0.0f);
            this.L.setVisibility(4);
            this.f3841b.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.v, "scaleX", new float[]{1.0f, 1.16f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.v, "scaleY", new float[]{1.0f, 1.16f});
            ofFloat.addUpdateListener(new f(this));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, "translationY", new float[]{0.0f, (float) dip2Px});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.t, "alpha", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.K, "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.play(ofFloat4).with(ofFloat5).after(ofFloat2);
            animatorSet.setDuration(300);
            animatorSet.start();
            return;
        }
        this.f3842c.setTitle((int) C0906R.string.c1k);
        this.f3842c.getEndText().setVisibility(0);
        this.J.setText(C0906R.string.ajr);
        if (this.m == null || this.m.f63375a == null) {
            com.ss.android.ugc.aweme.base.c.a(this.u, 2130839278);
        } else {
            com.ss.android.ugc.aweme.base.c.b(this.u, this.m.f63375a);
        }
        this.t.setAlpha(0.0f);
        this.K.setVisibility(8);
        this.L.setVisibility(0);
        this.f3841b.setVisibility(0);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.v, "scaleX", new float[]{1.16f, 1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.v, "scaleY", new float[]{1.16f, 1.0f});
        ofFloat6.addUpdateListener(new g(this));
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.F, "translationY", new float[]{(float) dip2Px, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.t, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat6).with(ofFloat7).with(ofFloat8);
        animatorSet2.play(ofFloat9).after(ofFloat7);
        animatorSet2.setDuration(200);
        animatorSet2.start();
    }

    private EnigmaScanner l() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70563, new Class[0], EnigmaScanner.class)) {
            return (EnigmaScanner) PatchProxy.accessDispatch(new Object[0], this, g, false, 70563, new Class[0], EnigmaScanner.class);
        }
        this.p = false;
        this.q = false;
        EnigmaScanner enigmaScanner = new EnigmaScanner();
        a(enigmaScanner);
        return enigmaScanner;
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70579, new Class[0], Void.TYPE);
            return;
        }
        g.b().a(false);
        this.G = false;
        this.F.setAlpha(0.8f);
        this.F.setText(C0906R.string.b5e);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70564, new Class[0], Void.TYPE);
            return;
        }
        this.E.b(2);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70567, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new Callable<Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63519a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f63519a, false, 70599, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f63519a, false, 70599, new Class[0], Object.class);
                }
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.i != null) {
                        ScanQRCodeActivityV2.this.i.stopCameraScan();
                    }
                }
                return null;
            }
        });
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70562, new Class[0], Void.TYPE);
            return;
        }
        this.I.clearAnimation();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70569, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3843d != null && this.f3843d.isShowing()) {
            this.f3843d.dismiss();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70570, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63521a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f63521a, false, 70600, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f63521a, false, 70600, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!ScanQRCodeActivityV2.this.isFinishing()) {
                        ScanQRCodeActivityV2.this.finish();
                    }
                }
            }, 700);
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70571, new Class[0], Void.TYPE);
            return;
        }
        this.p = false;
        this.q = false;
        if (this.i != null) {
            this.i.enableCameraScan(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70576, new Class[0], Void.TYPE);
            return;
        }
        this.j.c();
        a(this.i);
        this.i.enableCameraScanWithRequirement(true, this.j.a());
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70573, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70573, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.G) {
            m();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70559, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onResume", true);
        com.ss.android.ugc.aweme.share.a.f.a(false);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onResume", false);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70561, new Class[0], Void.TYPE);
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.I.getHeight()), (float) (this.v.getHeight() - u.a(20.0d)));
        translateAnimation.setDuration(2000);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.I.startAnimation(translateAnimation);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70568, new Class[0], Void.TYPE);
        } else if (this.f3843d == null) {
            this.f3843d = com.ss.android.ugc.aweme.qrcode.f.a.a(this, "");
            this.f3843d.setIndeterminate(false);
        } else {
            if (!this.f3843d.isShowing()) {
                this.f3843d.show();
                this.f3843d.a();
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70581, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.j != null) {
            this.j.b();
        }
        if (this.E != null) {
            this.E.c();
            this.E.f61562c = null;
        }
        this.j = null;
        if (this.C != null) {
            h.a().b(this.C);
        }
        i.a((Callable<TResult>) new Callable<Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63505a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f63505a, false, 70592, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f63505a, false, 70592, new Class[0], Object.class);
                }
                if (ScanQRCodeActivityV2.this.i != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        if (ScanQRCodeActivityV2.this.i != null) {
                            ScanQRCodeActivityV2.this.i.stop();
                            ScanQRCodeActivityV2.this.i.release();
                            ScanQRCodeActivityV2.this.i.setListener(null);
                            ScanQRCodeActivityV2.this.i = null;
                        }
                    }
                }
                return null;
            }
        });
        this.M.setOnDoubleTapListener(null);
    }

    public final void ae_() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70566, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = l();
        }
        this.q = false;
        final d dVar = new d(com.ss.android.ugc.aweme.app.i.a().getContext(), 1);
        final ScanSettings scanSettings = new ScanSettings();
        scanSettings.width = 1280;
        scanSettings.height = 720;
        float b2 = (float) p.b(this);
        float a2 = (float) p.a(this);
        scanSettings.detectRectLeft = this.v.getX() / b2;
        scanSettings.detectRectTop = this.v.getY() / a2;
        scanSettings.detectRectWidth = ((float) this.v.getWidth()) / b2;
        scanSettings.detectRectHeight = ((float) this.v.getHeight()) / a2;
        scanSettings.detectRequirement = this.j.a();
        scanSettings.buildChainFlag = 1;
        scanSettings.enableDetectRect = true;
        ai.a(((IAVService) ServiceManager.get().getService(IAVService.class)).provideResourceFinder());
        i.a((Callable<TResult>) new Callable<Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63515a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f63515a, false, 70598, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f63515a, false, 70598, new Class[0], Object.class);
                }
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.i != null && ScanQRCodeActivityV2.this.o) {
                        ScanQRCodeActivityV2.this.i.startScan(ScanQRCodeActivityV2.this, dVar, ScanQRCodeActivityV2.this.h.getHolder(), scanSettings);
                    }
                }
                return null;
            }
        }).a((a.g<TResult, TContinuationResult>) new a.g<Object, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63513a;

            public final Object then(i<Object> iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f63513a, false, 70597, new Class[]{i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar}, this, f63513a, false, 70597, new Class[]{i.class}, Object.class);
                }
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.i != null && !ScanQRCodeActivityV2.this.o) {
                        ScanQRCodeActivityV2.this.i.stopCameraScan();
                    }
                }
                return null;
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70555, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.s = getIntent().getIntExtra("scan_page_from", 0);
        this.o = false;
        this.h = (SurfaceView) findViewById(C0906R.id.cxe);
        this.F = (TextView) findViewById(C0906R.id.ddr);
        this.H = (TextView) findViewById(C0906R.id.d_8);
        this.I = (ImageView) findViewById(C0906R.id.cjm);
        this.t = (LinearLayout) findViewById(C0906R.id.bfw);
        this.J = (TextView) findViewById(C0906R.id.d_6);
        this.u = (RemoteImageView) findViewById(C0906R.id.azp);
        this.K = (TextView) findViewById(C0906R.id.dei);
        this.L = (TextView) findViewById(C0906R.id.dgx);
        this.v = (FrameLayout) findViewById(C0906R.id.ag5);
        this.w = (RelativeLayout) findViewById(C0906R.id.ci4);
        this.t.setOnClickListener(this);
        if (com.ss.android.g.a.b()) {
            this.f3842c.getBackBtn().setImageResource(2130838797);
        }
        this.h.getHolder().addCallback(new SurfaceHolder.Callback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63507a;

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f63507a, false, 70594, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f63507a, false, 70594, new Class[]{SurfaceHolder.class}, Void.TYPE);
                    return;
                }
                ScanQRCodeActivityV2.this.f();
                synchronized (this) {
                    ScanQRCodeActivityV2.this.o = false;
                }
                i.a((Callable<TResult>) new Callable<Object>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63509a;

                    public final Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f63509a, false, 70595, new Class[0], Object.class)) {
                            return PatchProxy.accessDispatch(new Object[0], this, f63509a, false, 70595, new Class[0], Object.class);
                        }
                        if (ScanQRCodeActivityV2.this.i != null) {
                            synchronized (ScanQRCodeActivityV2.this) {
                                if (ScanQRCodeActivityV2.this.i != null) {
                                    ScanQRCodeActivityV2.this.i.stop();
                                    ScanQRCodeActivityV2.this.i.release();
                                    ScanQRCodeActivityV2.this.i = null;
                                }
                            }
                        }
                        return null;
                    }
                });
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f63507a, false, 70593, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f63507a, false, 70593, new Class[]{SurfaceHolder.class}, Void.TYPE);
                    return;
                }
                synchronized (this) {
                    ScanQRCodeActivityV2.this.o = true;
                }
                ScanQRCodeActivityV2.this.ae_();
                ScanQRCodeActivityV2.this.e();
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = ScanQRCodeActivityV2.this;
                if (PatchProxy.isSupport(new Object[0], scanQRCodeActivityV2, ScanQRCodeActivityV2.g, false, 70584, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], scanQRCodeActivityV2, ScanQRCodeActivityV2.g, false, 70584, new Class[0], Void.TYPE);
                    return;
                }
                if (!scanQRCodeActivityV2.z) {
                    c cVar = new c(scanQRCodeActivityV2, (float) scanQRCodeActivityV2.v.getLeft(), (float) scanQRCodeActivityV2.v.getTop(), (float) scanQRCodeActivityV2.v.getRight(), (float) scanQRCodeActivityV2.v.getBottom());
                    scanQRCodeActivityV2.A = cVar;
                    scanQRCodeActivityV2.w.addView(scanQRCodeActivityV2.A, 2);
                    scanQRCodeActivityV2.z = true;
                }
            }
        });
        this.f3842c.showLine(false);
        this.f3842c.getEndText().setTextColor(getResources().getColor(C0906R.color.hx));
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70565, new Class[0], Void.TYPE);
        } else {
            v.b((Activity) this);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f3844e.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
            }
        }
        this.M = new GestureDetector(this, new a(this, (byte) 0));
        this.N = new ScaleGestureDetector(this, new b(this, (byte) 0));
    }

    @Subscribe
    public void onNetStateChangeEvent(com.ss.android.ugc.aweme.qrcode.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, g, false, 70583, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, g, false, 70583, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (com.ss.android.ugc.aweme.base.utils.m.a().c()) {
                this.H.setVisibility(8);
                this.r = true;
                return;
            }
            this.H.setVisibility(0);
            this.r = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, g, false, 70560, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, g, false, 70560, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.M.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return this.N.onTouchEvent(motionEvent);
        }
    }

    private void a(EnigmaScanner enigmaScanner) {
        if (PatchProxy.isSupport(new Object[]{enigmaScanner}, this, g, false, 70577, new Class[]{EnigmaScanner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{enigmaScanner}, this, g, false, 70577, new Class[]{EnigmaScanner.class}, Void.TYPE);
        } else if (this.j == this.D) {
            enigmaScanner.setListener(this.B);
            h.a().b(this.C);
        } else {
            if (this.j == this.k) {
                enigmaScanner.setListener(null);
                h.a().a(this.C);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, g, false, 70574, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, g, false, 70574, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        super.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.ddr) {
            if (this.G) {
                m();
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, g, false, 70580, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 70580, new Class[0], Void.TYPE);
            } else {
                g.b().a(true);
                this.G = true;
                this.F.setAlpha(1.0f);
                this.F.setText(C0906R.string.b5d);
            }
        } else if (id == C0906R.id.bfw) {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 70575, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 70575, new Class[0], Void.TYPE);
                return;
            }
            if (this.j == this.D) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from", "qr_code_scan");
                r.a("click_variable_entrance", (Map) hashMap);
                final j jVar = new j();
                ((IAVService) ServiceManager.get().getService(IAVService.class)).fetchResourcesNeededByRequirements(new String[]{"arscan", "ObjectScan"}, new IAVService.IFetchResourcesListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63523a;

                    public final void onFailed(Exception exc) {
                        Exception exc2 = exc;
                        if (PatchProxy.isSupport(new Object[]{exc2}, this, f63523a, false, 70602, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc2}, this, f63523a, false, 70602, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        jVar.b(exc2);
                    }

                    public final void onSuccess(String[] strArr) {
                        if (PatchProxy.isSupport(new Object[]{strArr}, this, f63523a, false, 70601, new Class[]{String[].class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strArr}, this, f63523a, false, 70601, new Class[]{String[].class}, Void.TYPE);
                            return;
                        }
                        jVar.b(null);
                    }
                });
                jVar.f1091a.a((a.g<TResult, TContinuationResult>) new a.g<Void, Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63503a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(i<Void> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f63503a, false, 70603, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f63503a, false, 70603, new Class[]{i.class}, Void.class);
                        } else if (ScanQRCodeActivityV2.this.j == null) {
                            return null;
                        } else {
                            if (iVar.d()) {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) ScanQRCodeActivityV2.this, (int) C0906R.string.abl, 0).a();
                                return null;
                            }
                            ScanQRCodeActivityV2.this.j = ScanQRCodeActivityV2.this.k;
                            ScanQRCodeActivityV2.this.k();
                            return null;
                        }
                    }
                }, i.f1052b);
            } else if (this.j == this.k) {
                this.j = this.D;
                k();
            }
            if (this.G) {
                m();
            }
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 70556, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 70556, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        this.i = l();
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 70557, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 70557, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            this.D = new f(this, this);
            f fVar = this.D;
            if (PatchProxy.isSupport(new Object[]{bundle}, fVar, f.f63407a, false, 70453, new Class[]{Bundle.class}, Void.TYPE)) {
                f fVar2 = fVar;
                PatchProxy.accessDispatch(new Object[]{bundle}, fVar2, f.f63407a, false, 70453, new Class[]{Bundle.class}, Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], fVar, f.f63407a, false, 70454, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], fVar, f.f63407a, false, 70454, new Class[0], Void.TYPE);
                } else {
                    fVar.i = new ArrayList();
                    f.AnonymousClass1 r1 = new a.C0684a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f63413a;

                        public final boolean a(int i, String str, String str2, int i2) {
                            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}, this, f63413a, false, 70470, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
                                return f.this.a(f.this.f63408b, i, str, str2, "scan", i2);
                            }
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}, this, f63413a, false, 70470, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                        }
                    };
                    fVar.i.add(new com.ss.android.ugc.aweme.qrcode.b.f(r1));
                    fVar.i.add(new com.ss.android.ugc.aweme.qrcode.b.b(r1));
                    fVar.i.add(new com.ss.android.ugc.aweme.qrcode.b.e(r1));
                    fVar.i.add(new com.ss.android.ugc.aweme.qrcode.b.g(r1));
                    fVar.j = new ArrayList();
                    fVar.j.add(new com.ss.android.ugc.aweme.qrcode.b.h());
                    fVar.j.add(new com.ss.android.ugc.aweme.qrcode.b.d(r1));
                }
            }
            this.k = new com.ss.android.ugc.aweme.qrcode.d.c(this, this);
            this.j = this.D;
            this.j.c();
        }
        this.E = new com.ss.android.ugc.aweme.profile.presenter.a();
        this.E.f61562c = this;
        this.E.a((Activity) this, (Fragment) null);
        this.F.setOnClickListener(this);
        if (com.ss.android.ugc.aweme.base.utils.m.a().c()) {
            this.H.setVisibility(8);
            this.r = true;
        } else {
            this.r = false;
        }
        if (PatchProxy.isSupport(new Object[0], this, g, false, 70558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 70558, new Class[0], Void.TYPE);
            return;
        }
        this.l = new com.ss.android.ugc.aweme.qrcode.c.f();
        this.l.addNotifyListener(new com.ss.android.ugc.aweme.common.p() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63511a;

            public final void a(Exception exc) {
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f63511a, false, 70596, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63511a, false, 70596, new Class[0], Void.TYPE);
                    return;
                }
                ScanQRCodeActivityV2.this.m = (e) ScanQRCodeActivityV2.this.l.mData;
                if (ScanQRCodeActivityV2.this.m != null && ScanQRCodeActivityV2.this.m.status_code == 0 && !TimeLockRuler.isTeenModeON()) {
                    ScanQRCodeActivityV2.this.t.setVisibility(0);
                    if (ScanQRCodeActivityV2.this.m.f63375a == null) {
                        com.ss.android.ugc.aweme.base.c.a(ScanQRCodeActivityV2.this.u, 2130839278);
                    } else {
                        com.ss.android.ugc.aweme.base.c.b(ScanQRCodeActivityV2.this.u, ScanQRCodeActivityV2.this.m.f63375a);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "qr_code_scan");
                    r.a("show_variable_entrance", (Map) hashMap);
                }
            }
        });
        this.l.a();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, g, false, 70582, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, g, false, 70582, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = l();
        }
        ScanSettings scanSettings = new ScanSettings();
        scanSettings.width = 1280;
        scanSettings.height = 720;
        scanSettings.buildChainFlag = 1;
        scanSettings.detectModelDir = "";
        this.n = true;
        this.i.startScan(str, scanSettings, 1000);
    }

    public static void a(Context context, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2)}, null, g, true, 70554, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2)}, null, g, true, 70554, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, ScanQRCodeActivityV2.class);
        intent.putExtra("scan_page_from", i2);
        context2.startActivity(intent);
    }

    public static void a(Context context, boolean z2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, g, true, 70553, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z2)}, null, g, true, 70553, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, ScanQRCodeActivityV2.class);
        intent.putExtra("enter_from", z2);
        context2.startActivity(intent);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, g, false, 70572, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, g, false, 70572, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (this.j != null) {
            this.j.a(i4, i5, intent2);
        }
        if (!this.E.a(i4, i5, intent2)) {
        }
    }
}
