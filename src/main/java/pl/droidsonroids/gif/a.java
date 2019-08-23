package pl.droidsonroids.gif;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.MediaController;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.c;

public final class a extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: a  reason: collision with root package name */
    final ScheduledThreadPoolExecutor f84198a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f84199b;

    /* renamed from: c  reason: collision with root package name */
    long f84200c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f84201d;

    /* renamed from: e  reason: collision with root package name */
    final Bitmap f84202e;

    /* renamed from: f  reason: collision with root package name */
    final GifInfoHandle f84203f;
    final ConcurrentLinkedQueue<Object> g;
    final boolean h;
    final d i;
    ScheduledFuture<?> j;
    public pl.droidsonroids.gif.a.a k;
    private final Rect l;
    private ColorStateList m;
    private PorterDuffColorFilter n;
    private PorterDuff.Mode o;
    private final g p;
    private final Rect q;
    private int r;
    private int s;

    public final boolean canPause() {
        return true;
    }

    public final int getAudioSessionId() {
        return 0;
    }

    public final int getBufferPercentage() {
        return 100;
    }

    public final int getIntrinsicHeight() {
        return this.s;
    }

    public final int getIntrinsicWidth() {
        return this.r;
    }

    public final boolean isPlaying() {
        return this.f84199b;
    }

    public final boolean isRunning() {
        return this.f84199b;
    }

    public final void pause() {
        stop();
    }

    public final int c() {
        return this.f84203f.n();
    }

    public final int d() {
        return this.f84203f.i();
    }

    public final int getAlpha() {
        return this.f84201d.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f84201d.getColorFilter();
    }

    public final int getCurrentPosition() {
        return this.f84203f.h();
    }

    public final int getDuration() {
        return this.f84203f.g();
    }

    private void f() {
        this.f84199b = false;
        this.i.removeMessages(-1);
        this.f84203f.a();
    }

    public final void a() {
        f();
        this.f84202e.recycle();
    }

    public final void b() {
        this.f84198a.execute(new h(this) {
            public final void a() {
                if (a.this.f84203f.c()) {
                    a.this.start();
                }
            }
        });
    }

    public final boolean canSeekBackward() {
        if (c() > 1) {
            return true;
        }
        return false;
    }

    public final boolean canSeekForward() {
        if (c() > 1) {
            return true;
        }
        return false;
    }

    private void g() {
        if (this.j != null) {
            this.j.cancel(false);
        }
        this.i.removeMessages(-1);
    }

    public final int e() {
        int j2 = this.f84203f.j();
        if (j2 == 0 || j2 < this.f84203f.e()) {
            return j2;
        }
        return j2 - 1;
    }

    public final int getOpacity() {
        if (!this.f84203f.o() || this.f84201d.getAlpha() < 255) {
            return -2;
        }
        return -1;
    }

    public final boolean isStateful() {
        if (super.isStateful() || (this.m != null && this.m.isStateful())) {
            return true;
        }
        return false;
    }

    public final void stop() {
        synchronized (this) {
            if (this.f84199b) {
                this.f84199b = false;
                g();
                this.f84203f.d();
            }
        }
    }

    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.h && this.f84199b && this.f84200c != Long.MIN_VALUE) {
            long max = Math.max(0, this.f84200c - SystemClock.uptimeMillis());
            this.f84200c = Long.MIN_VALUE;
            this.f84198a.remove(this.p);
            this.j = this.f84198a.schedule(this.p, max, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r6.f84200c = 0;
        r6.i.sendEmptyMessageAtTime(-1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        g();
        r6.j = r6.f84198a.schedule(r6.p, java.lang.Math.max(r0, 0), java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r0 = r6.f84203f.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r6.h == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f84199b     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return
        L_0x0007:
            r0 = 1
            r6.f84199b = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            pl.droidsonroids.gif.GifInfoHandle r0 = r6.f84203f
            long r0 = r0.b()
            boolean r2 = r6.h
            r3 = 0
            if (r2 == 0) goto L_0x0020
            r6.f84200c = r3
            pl.droidsonroids.gif.d r0 = r6.i
            r1 = -1
            r0.sendEmptyMessageAtTime(r1, r3)
            return
        L_0x0020:
            r6.g()
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r6.f84198a
            pl.droidsonroids.gif.g r5 = r6.p
            long r0 = java.lang.Math.max(r0, r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r2.schedule(r5, r0, r3)
            r6.j = r0
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.a.start():void");
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", new Object[]{Integer.valueOf(this.f84203f.l()), Integer.valueOf(this.f84203f.m()), Integer.valueOf(this.f84203f.n()), Integer.valueOf(this.f84203f.f())});
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.l.set(rect);
    }

    public final void setAlpha(@IntRange(from = 0, to = 255) int i2) {
        this.f84201d.setAlpha(i2);
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f84201d.setColorFilter(colorFilter);
    }

    public a(@NonNull String str) throws IOException {
        this(new GifInfoHandle(str), null, null, true);
    }

    @Deprecated
    public final void setDither(boolean z) {
        this.f84201d.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.f84201d.setFilterBitmap(z);
        invalidateSelf();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        this.n = a(colorStateList, this.o);
        invalidateSelf();
    }

    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.o = mode;
        this.n = a(this.m, mode);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.m == null || this.o == null) {
            return false;
        }
        this.n = a(this.m, this.o);
        return true;
    }

    public final void seekTo(@IntRange(from = 0, to = 2147483647L) final int i2) {
        if (i2 >= 0) {
            this.f84198a.execute(new h(this) {
                public final void a() {
                    a.this.f84203f.a(i2, a.this.f84202e);
                    this.f84212c.i.sendEmptyMessageAtTime(-1, 0);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public final void draw(@NonNull Canvas canvas) {
        boolean z;
        if (this.n == null || this.f84201d.getColorFilter() != null) {
            z = false;
        } else {
            this.f84201d.setColorFilter(this.n);
            z = true;
        }
        if (this.k == null) {
            canvas.drawBitmap(this.f84202e, this.q, this.l, this.f84201d);
        }
        if (z) {
            this.f84201d.setColorFilter(null);
        }
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.h) {
            if (z) {
                if (z2) {
                    b();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    private a(GifInfoHandle gifInfoHandle, a aVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f84199b = true;
        this.f84200c = Long.MIN_VALUE;
        this.l = new Rect();
        this.f84201d = new Paint(6);
        this.g = new ConcurrentLinkedQueue<>();
        this.p = new g(this);
        this.h = true;
        this.f84198a = c.a.f84207a;
        this.f84203f = gifInfoHandle;
        this.f84202e = Bitmap.createBitmap(this.f84203f.l(), this.f84203f.m(), Bitmap.Config.ARGB_8888);
        this.f84202e.setHasAlpha(!gifInfoHandle.o());
        this.q = new Rect(0, 0, this.f84203f.l(), this.f84203f.m());
        this.i = new d(this);
        this.p.a();
        this.r = this.f84203f.l();
        this.s = this.f84203f.m();
    }
}
