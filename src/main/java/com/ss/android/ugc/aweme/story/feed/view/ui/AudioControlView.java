package com.ss.android.ugc.aweme.story.feed.view.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.AudioManager;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.R$styleable;

public class AudioControlView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72792a;

    /* renamed from: b  reason: collision with root package name */
    int f72793b;

    /* renamed from: c  reason: collision with root package name */
    int f72794c;

    /* renamed from: d  reason: collision with root package name */
    public int f72795d;

    /* renamed from: e  reason: collision with root package name */
    public int f72796e;

    /* renamed from: f  reason: collision with root package name */
    public int f72797f;
    public boolean g;
    public a h;
    public ValueAnimator i;
    private Paint j;
    private Context k;
    private AudioManager l;
    private int m;
    private int n;
    private float o;
    private boolean p;

    public interface a {
        void a();
    }

    public int getStepVolume() {
        return this.f72796e;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84088, new Class[0], Void.TYPE);
            return;
        }
        this.f72797f = this.l.getStreamVolume(3);
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84095, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.l.setStreamVolume(3, this.f72797f, 8);
        } catch (SecurityException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        this.o = ((float) this.f72797f) / ((float) this.f72795d);
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84097, new Class[0], Void.TYPE);
            return;
        }
        postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72798a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f72798a, false, 84104, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72798a, false, 84104, new Class[0], Void.TYPE);
                    return;
                }
                AudioControlView.this.invalidate();
                AudioControlView audioControlView = AudioControlView.this;
                if (PatchProxy.isSupport(new Object[0], audioControlView, AudioControlView.f72792a, false, 84098, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], audioControlView, AudioControlView.f72792a, false, 84098, new Class[0], Void.TYPE);
                    return;
                }
                if (audioControlView.i != null) {
                    audioControlView.i.removeAllListeners();
                    audioControlView.i.cancel();
                    audioControlView.i = null;
                }
                audioControlView.i = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                audioControlView.i.setDuration(1400);
                audioControlView.i.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72800a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f72800a, false, 84105, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f72800a, false, 84105, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        if (AudioControlView.this.h != null) {
                            AudioControlView.this.h.a();
                            AudioControlView.this.i = null;
                        }
                    }
                });
                audioControlView.i.start();
            }
        }, 0);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84101, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.i != null) {
            this.i.removeAllListeners();
            this.i.cancel();
            this.i = null;
        }
        this.h = null;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84086, new Class[0], Void.TYPE);
            return;
        }
        if (this.l == null) {
            if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84087, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84087, new Class[0], Void.TYPE);
                return;
            }
            this.l = (AudioManager) this.k.getSystemService("audio");
            this.f72795d = this.l.getStreamMaxVolume(3);
            this.f72796e = this.f72795d / 15;
            if (this.f72796e == 0) {
                this.f72796e = 1;
            }
            this.f72797f = this.l.getStreamVolume(3);
        }
    }

    public ObjectAnimator getHideVolumeAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84102, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84102, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowVolumeAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84103, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84103, new Class[0], ObjectAnimator.class);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72802a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f72802a, false, 84106, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f72802a, false, 84106, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                AudioControlView.this.a();
            }
        });
        return duration;
    }

    public void setAllowShow(boolean z) {
        this.g = z;
    }

    public void setOnAudioControlViewHideListener(a aVar) {
        this.h = aVar;
    }

    public void setStepVolume(int i2) {
        this.f72796e = i2;
    }

    public AudioControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!PatchProxy.isSupport(new Object[]{keyEvent}, this, f72792a, false, 84096, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f72792a, false, 84096, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f72792a, false, 84090, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f72792a, false, 84090, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.p) {
            canvas.drawLine((float) this.f72793b, (float) (this.f72794c / 2), ((float) this.f72793b) - (((float) this.f72793b) * this.o), (float) (this.f72794c / 2), this.j);
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.drawLine(0.0f, (float) (this.f72794c / 2), this.o * ((float) this.f72793b), (float) (this.f72794c / 2), this.j);
    }

    public void setForegroundColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72792a, false, 84085, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72792a, false, 84085, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n = i2;
        this.j.setColor(this.n);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72792a, false, 84089, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72792a, false, 84089, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f72793b = getMeasuredWidth();
        this.f72794c = getMeasuredHeight();
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        }
        this.p = z;
    }

    public AudioControlView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioControlView);
        this.m = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, C0906R.color.a0i));
        this.n = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, C0906R.color.a09));
        obtainStyledAttributes.recycle();
        if (PatchProxy.isSupport(new Object[0], this, f72792a, false, 84084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72792a, false, 84084, new Class[0], Void.TYPE);
            return;
        }
        this.j = new Paint();
        this.j.setAntiAlias(true);
        this.j.setColor(this.n);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setStrokeWidth(2.0f);
    }
}
