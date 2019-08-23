package com.ss.android.ugc.aweme.base.ui;

import a.i;
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
import android.os.Message;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public class AudioControlView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34899a;

    /* renamed from: b  reason: collision with root package name */
    int f34900b;

    /* renamed from: c  reason: collision with root package name */
    int f34901c;

    /* renamed from: d  reason: collision with root package name */
    public b f34902d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f34903e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f34904f;
    private Paint g;
    private int h;
    private float i;
    private boolean j;
    private HandlerThread k;
    private Handler l;

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34909a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<AudioControlView> f34910b;

        /* renamed from: c  reason: collision with root package name */
        private AudioManager f34911c;

        /* renamed from: d  reason: collision with root package name */
        private int f34912d;

        /* renamed from: e  reason: collision with root package name */
        private int f34913e;

        /* renamed from: f  reason: collision with root package name */
        private int f34914f;

        private void b() {
            if (PatchProxy.isSupport(new Object[0], this, f34909a, false, 24944, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34909a, false, 24944, new Class[0], Void.TYPE);
                return;
            }
            this.f34914f = this.f34911c.getStreamVolume(3);
        }

        private void c() {
            if (PatchProxy.isSupport(new Object[0], this, f34909a, false, 24947, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34909a, false, 24947, new Class[0], Void.TYPE);
                return;
            }
            e();
            d();
        }

        private void d() {
            if (PatchProxy.isSupport(new Object[0], this, f34909a, false, 24948, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34909a, false, 24948, new Class[0], Void.TYPE);
                return;
            }
            i.a((Callable<TResult>) new b<TResult>(this), i.f1052b);
        }

        private void e() {
            if (PatchProxy.isSupport(new Object[0], this, f34909a, false, 24949, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34909a, false, 24949, new Class[0], Void.TYPE);
                return;
            }
            try {
                this.f34911c.setStreamVolume(3, this.f34914f, 8);
            } catch (SecurityException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object a() throws Exception {
            AudioControlView audioControlView = (AudioControlView) this.f34910b.get();
            if (audioControlView != null) {
                audioControlView.setProgress(((float) this.f34914f) / ((float) this.f34912d));
                if (PatchProxy.isSupport(new Object[0], audioControlView, AudioControlView.f34899a, false, 24933, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], audioControlView, AudioControlView.f34899a, false, 24933, new Class[0], Void.TYPE);
                } else if (!audioControlView.f34904f) {
                    audioControlView.invalidate();
                    if (PatchProxy.isSupport(new Object[0], audioControlView, AudioControlView.f34899a, false, 24935, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], audioControlView, AudioControlView.f34899a, false, 24935, new Class[0], Void.TYPE);
                    } else {
                        audioControlView.d();
                        if (audioControlView.f34902d != null) {
                            audioControlView.f34902d.b();
                        }
                        audioControlView.f34903e = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                        audioControlView.f34903e.setDuration(1400);
                        audioControlView.f34903e.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f34905a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f34905a, false, 24940, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f34905a, false, 24940, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                if (AudioControlView.this.f34902d != null) {
                                    AudioControlView.this.f34902d.a();
                                    AudioControlView.this.f34903e = null;
                                }
                            }
                        });
                        audioControlView.f34903e.start();
                    }
                }
            }
            return null;
        }

        public final void handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f34909a, false, 24942, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f34909a, false, 24942, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            switch (message.what) {
                case 1:
                    if (PatchProxy.isSupport(new Object[0], this, f34909a, false, 24943, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34909a, false, 24943, new Class[0], Void.TYPE);
                        break;
                    } else {
                        this.f34912d = this.f34911c.getStreamMaxVolume(3);
                        this.f34913e = this.f34912d / 15;
                        if (this.f34913e == 0) {
                            this.f34913e = 1;
                        }
                        b();
                        return;
                    }
                case 2:
                    if (PatchProxy.isSupport(new Object[0], this, f34909a, false, 24945, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34909a, false, 24945, new Class[0], Void.TYPE);
                        break;
                    } else {
                        b();
                        this.f34914f += this.f34913e;
                        if (this.f34914f > this.f34912d) {
                            this.f34914f = this.f34912d;
                        }
                        c();
                        return;
                    }
                case 3:
                    if (!PatchProxy.isSupport(new Object[0], this, f34909a, false, 24946, new Class[0], Void.TYPE)) {
                        b();
                        this.f34914f -= this.f34913e;
                        if (this.f34914f < 0) {
                            this.f34914f = 0;
                        }
                        c();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f34909a, false, 24946, new Class[0], Void.TYPE);
                        return;
                    }
            }
        }

        private a(Looper looper, AudioControlView audioControlView) {
            super(looper);
            this.f34910b = new WeakReference<>(audioControlView);
            this.f34911c = (AudioManager) audioControlView.getContext().getSystemService("audio");
            sendEmptyMessage(1);
        }

        /* synthetic */ a(Looper looper, AudioControlView audioControlView, byte b2) {
            this(looper, audioControlView);
        }
    }

    public interface b {
        void a();

        void b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24930, new Class[0], Void.TYPE);
            return;
        }
        a();
        this.l.sendEmptyMessage(3);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24931, new Class[0], Void.TYPE);
            return;
        }
        a();
        this.l.sendEmptyMessage(2);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24934, new Class[0], Void.TYPE);
            return;
        }
        if (this.f34903e != null) {
            this.f34903e.removeAllListeners();
            this.f34903e.cancel();
            this.f34903e = null;
        }
    }

    public ObjectAnimator getHideVolumeAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24938, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24938, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24936, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f34904f = false;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24937, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        d();
        this.f34902d = null;
        if (this.k != null) {
            this.k.quit();
            this.k = null;
            this.l = null;
        }
        this.f34904f = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24927, new Class[0], Void.TYPE);
            return;
        }
        if (this.k == null) {
            this.k = new HandlerThread("Audio-Api-Thread");
            this.k.start();
            this.l = new a(this.k.getLooper(), this, (byte) 0);
        }
    }

    public ObjectAnimator getShowVolumeAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24939, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24939, new Class[0], ObjectAnimator.class);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34907a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f34907a, false, 24941, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f34907a, false, 24941, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                AudioControlView.this.a();
            }
        });
        return duration;
    }

    public void setOnAudioControlViewHideListener(b bVar) {
        this.f34902d = bVar;
    }

    public void setProgress(float f2) {
        this.i = f2;
    }

    public AudioControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!PatchProxy.isSupport(new Object[]{keyEvent}, this, f34899a, false, 24932, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f34899a, false, 24932, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f34899a, false, 24929, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f34899a, false, 24929, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.j) {
            canvas.drawLine((float) this.f34900b, (float) (this.f34901c / 2), ((float) this.f34900b) - (((float) this.f34900b) * this.i), (float) (this.f34901c / 2), this.g);
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.drawLine(0.0f, (float) (this.f34901c / 2), this.i * ((float) this.f34900b), (float) (this.f34901c / 2), this.g);
    }

    public void setForegroundColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34899a, false, 24926, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34899a, false, 24926, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = i2;
        this.g.setColor(this.h);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34899a, false, 24928, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34899a, false, 24928, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f34900b = getMeasuredWidth();
        this.f34901c = getMeasuredHeight();
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        }
        this.j = z;
    }

    public AudioControlView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioControlView);
        this.h = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, C0906R.color.a09));
        obtainStyledAttributes.recycle();
        if (PatchProxy.isSupport(new Object[0], this, f34899a, false, 24925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34899a, false, 24925, new Class[0], Void.TYPE);
            return;
        }
        this.g = new Paint();
        this.g.setAntiAlias(true);
        this.g.setColor(this.h);
        this.g.setStyle(Paint.Style.FILL);
        this.g.setStrokeWidth(2.0f);
    }
}
