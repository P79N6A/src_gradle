package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.f.f;

public class VideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70565a;

    /* renamed from: b  reason: collision with root package name */
    public int f70566b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f70567c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f70568d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f70569e;

    /* renamed from: f  reason: collision with root package name */
    private float f70570f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private long l;

    private long getProgressbarThreshold() {
        return this.l;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70565a, false, 80364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70565a, false, 80364, new Class[0], Void.TYPE);
            return;
        }
        postDelayed(this.f70568d, 50);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f70565a, false, 80368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70565a, false, 80368, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacks(this.f70568d);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f70565a, false, 80369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70565a, false, 80369, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f70565a, false, 80377, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70565a, false, 80377, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        removeCallbacks(this.f70568d);
    }

    public ObjectAnimator getHideAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f70565a, false, 80375, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f70565a, false, 80375, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f70565a, false, 80376, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f70565a, false, 80376, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
    }

    public void setProgressbarThreshold(long j2) {
        this.l = j2;
    }

    public void setReachedBarColor(int i2) {
        this.h = i2;
    }

    public void setReachedProgressBarHeight(float f2) {
        this.f70570f = f2;
    }

    public VideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70565a, false, 80365, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70565a, false, 80365, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70567c = false;
        removeCallbacks(this.f70568d);
        setMax(i2);
        setProgress(0);
        a();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f70565a, false, 80362, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f70565a, false, 80362, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.save();
        float progress = (float) ((int) (((float) this.g) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f70569e.setColor(this.h);
            this.f70569e.setStrokeWidth(this.f70570f);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f70569e);
        }
        canvas.restore();
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70565a, false, 80367, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70565a, false, 80367, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        removeCallbacks(this.f70568d);
        setMax(i2);
        setProgress(i3);
        b();
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70565a, false, 80366, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70565a, false, 80366, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70567c = false;
        removeCallbacks(this.f70568d);
        setMax(i2);
        setProgress(i3);
        a();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70565a, false, 80359, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70565a, false, 80359, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f70565a, false, 80360, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f70565a, false, 80360, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int mode = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode == 1073741824) {
                i4 = size2;
            } else {
                int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f70570f, Math.abs(this.f70569e.descent() - this.f70569e.ascent())));
                if (mode == Integer.MIN_VALUE) {
                    i4 = Math.min(paddingTop, size2);
                } else {
                    i4 = paddingTop;
                }
            }
        }
        setMeasuredDimension(size, i4);
        this.g = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public final void a(f fVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i2)}, this, f70565a, false, 80373, new Class[]{f.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i2)}, this, f70565a, false, 80373, new Class[]{f.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != 0) {
            this.k = i2;
        }
        switch (fVar.f67648c) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                if (((long) this.k) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    c();
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 4:
                b();
                return;
            case 5:
                if (((long) this.k) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    a(this.k, (int) fVar.f67647b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 6:
                if (((long) this.k) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    a(this.k);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case e.l:
                this.i = false;
                if (((long) this.k) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    a(this.k);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 8:
                if (this.i && fVar.f67649d) {
                    setVisibility(4);
                    b();
                } else if (this.i && ((long) this.k) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    c();
                }
                this.j = !this.j;
                return;
            case 9:
                return;
            case 10:
                this.i = true;
                setProgress(0);
                break;
            case 11:
                if (((long) this.k) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    a(this.k, (int) fVar.f67647b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                if (((long) this.k) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    b(this.k, (int) fVar.f67647b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
        }
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        this.f70569e = new Paint();
        if (PatchProxy.isSupport(new Object[]{6}, this, f70565a, false, 80371, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{6}, this, f70565a, false, 80371, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            i3 = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        }
        this.f70570f = (float) i3;
        this.i = true;
        this.j = true;
        this.k = 0;
        this.l = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().progressBarThreshold();
        this.f70568d = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70571a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f70571a, false, 80378, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70571a, false, 80378, new Class[0], Void.TYPE);
                } else if (!VideoPlayerProgressbar.this.f70567c) {
                    VideoPlayerProgressbar.this.incrementProgressBy(50);
                    VideoPlayerProgressbar.this.f70566b = VideoPlayerProgressbar.this.getProgress();
                    if (VideoPlayerProgressbar.this.getMax() < VideoPlayerProgressbar.this.f70566b) {
                        VideoPlayerProgressbar.this.removeCallbacks(VideoPlayerProgressbar.this.f70568d);
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j = uptimeMillis + (50 - (uptimeMillis % 50));
                    VideoPlayerProgressbar videoPlayerProgressbar = VideoPlayerProgressbar.this;
                    if (PatchProxy.isSupport(new Object[]{new Long(j)}, videoPlayerProgressbar, VideoPlayerProgressbar.f70565a, false, 80363, new Class[]{Long.TYPE}, Void.TYPE)) {
                        VideoPlayerProgressbar videoPlayerProgressbar2 = videoPlayerProgressbar;
                        PatchProxy.accessDispatch(new Object[]{new Long(j)}, videoPlayerProgressbar2, VideoPlayerProgressbar.f70565a, false, 80363, new Class[]{Long.TYPE}, Void.TYPE);
                        return;
                    }
                    if (videoPlayerProgressbar.getHandler() != null) {
                        videoPlayerProgressbar.getHandler().postAtTime(videoPlayerProgressbar.f70568d, j);
                    }
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f70565a, false, 80361, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f70565a, false, 80361, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerProgressbar);
        this.h = obtainStyledAttributes.getColor(0, -261935);
        this.f70570f = obtainStyledAttributes.getDimension(1, this.f70570f);
        obtainStyledAttributes.recycle();
    }
}
