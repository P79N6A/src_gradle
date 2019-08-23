package com.bytedance.android.livesdk.chatroom.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class VolumeControlView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12314a;

    /* renamed from: b  reason: collision with root package name */
    Context f12315b;

    /* renamed from: c  reason: collision with root package name */
    int f12316c;

    /* renamed from: d  reason: collision with root package name */
    int f12317d;

    /* renamed from: e  reason: collision with root package name */
    AudioManager f12318e;

    /* renamed from: f  reason: collision with root package name */
    public int f12319f;
    public int g;
    public int h;
    public a i;
    public ValueAnimator j;
    public volatile Handler k;
    private Paint l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private HandlerThread q;
    private Handler r;

    public interface a {
        void a();

        void b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6516, new Class[0], Void.TYPE);
            return;
        }
        this.h = this.f12318e.getStreamVolume(3);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6523, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f12318e.setStreamVolume(3, this.h, 8);
        } catch (SecurityException unused) {
        }
        this.o = ((float) this.h) / ((float) this.f12319f);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6525, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.r.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12326a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f12326a, false, 6534, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12326a, false, 6534, new Class[0], Void.TYPE);
                        return;
                    }
                    VolumeControlView volumeControlView = VolumeControlView.this;
                    if (PatchProxy.isSupport(new Object[0], volumeControlView, VolumeControlView.f12314a, false, 6526, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], volumeControlView, VolumeControlView.f12314a, false, 6526, new Class[0], Void.TYPE);
                        return;
                    }
                    volumeControlView.postDelayed(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f12328a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f12328a, false, 6535, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f12328a, false, 6535, new Class[0], Void.TYPE);
                                return;
                            }
                            if (VolumeControlView.this.k != null) {
                                VolumeControlView.this.invalidate();
                                VolumeControlView volumeControlView = VolumeControlView.this;
                                if (PatchProxy.isSupport(new Object[0], volumeControlView, VolumeControlView.f12314a, false, 6527, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], volumeControlView, VolumeControlView.f12314a, false, 6527, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (volumeControlView.j != null) {
                                    volumeControlView.j.removeAllListeners();
                                    volumeControlView.j.cancel();
                                    volumeControlView.j = null;
                                }
                                if (volumeControlView.i != null) {
                                    volumeControlView.i.b();
                                }
                                volumeControlView.j = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                                volumeControlView.j.setDuration(1400);
                                volumeControlView.j.addListener(new AnimatorListenerAdapter() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f12330a;

                                    public final void onAnimationEnd(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f12330a, false, 6536, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f12330a, false, 6536, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        if (VolumeControlView.this.i != null) {
                                            VolumeControlView.this.i.a();
                                            VolumeControlView.this.j = null;
                                        }
                                    }
                                });
                                volumeControlView.j.start();
                            }
                        }
                    }, 0);
                }
            });
        }
    }

    public ObjectAnimator getHideVolumeAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6529, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6529, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6514, new Class[0], Void.TYPE);
            return;
        }
        if (this.q == null) {
            this.q = new HandlerThread("Audio-Api-Thread");
            this.q.start();
            this.k = new Handler(this.q.getLooper());
        }
        if (this.f12318e == null) {
            this.k.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12320a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f12320a, false, 6531, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12320a, false, 6531, new Class[0], Void.TYPE);
                        return;
                    }
                    VolumeControlView volumeControlView = VolumeControlView.this;
                    if (PatchProxy.isSupport(new Object[0], volumeControlView, VolumeControlView.f12314a, false, 6515, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], volumeControlView, VolumeControlView.f12314a, false, 6515, new Class[0], Void.TYPE);
                        return;
                    }
                    volumeControlView.f12318e = (AudioManager) volumeControlView.f12315b.getSystemService("audio");
                    volumeControlView.f12319f = volumeControlView.f12318e.getStreamMaxVolume(3);
                    volumeControlView.g = volumeControlView.f12319f / 15;
                    if (volumeControlView.g == 0) {
                        volumeControlView.g = 1;
                    }
                    volumeControlView.b();
                }
            });
        }
    }

    public ObjectAnimator getShowVolumeAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6530, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6530, new Class[0], ObjectAnimator.class);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12332a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f12332a, false, 6537, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12332a, false, 6537, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                VolumeControlView.this.a();
            }
        });
        return duration;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6528, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.j != null) {
            this.j.removeAllListeners();
            this.j.cancel();
            this.j = null;
        }
        this.i = null;
        if (this.q != null) {
            this.q.quit();
            this.q = null;
            this.k = null;
        }
    }

    public void setOnAudioControlViewHideListener(a aVar) {
        this.i = aVar;
    }

    public VolumeControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!PatchProxy.isSupport(new Object[]{keyEvent}, this, f12314a, false, 6524, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f12314a, false, 6524, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f12314a, false, 6518, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f12314a, false, 6518, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.p) {
            canvas.drawLine((float) this.f12316c, (float) (this.f12317d / 2), ((float) this.f12316c) - (((float) this.f12316c) * this.o), (float) (this.f12317d / 2), this.l);
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.drawLine(0.0f, (float) (this.f12317d / 2), this.o * ((float) this.f12316c), (float) (this.f12317d / 2), this.l);
    }

    public void setForegroundColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12314a, false, 6513, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12314a, false, 6513, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n = i2;
        this.l.setColor(this.n);
    }

    public VolumeControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12314a, false, 6517, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12314a, false, 6517, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f12316c = getMeasuredWidth();
        this.f12317d = getMeasuredHeight();
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        }
        this.p = z;
    }

    public VolumeControlView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.r = new Handler(Looper.getMainLooper());
        this.f12315b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_VolumeControlView);
        this.m = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, C0906R.color.ahb));
        this.n = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, C0906R.color.aha));
        obtainStyledAttributes.recycle();
        if (PatchProxy.isSupport(new Object[0], this, f12314a, false, 6512, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12314a, false, 6512, new Class[0], Void.TYPE);
            return;
        }
        this.l = new Paint();
        this.l.setAntiAlias(true);
        this.l.setColor(this.n);
        this.l.setStyle(Paint.Style.FILL);
        this.l.setStrokeWidth(2.0f);
    }
}
