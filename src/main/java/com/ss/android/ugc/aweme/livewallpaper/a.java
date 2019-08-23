package com.ss.android.ugc.aweme.livewallpaper;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.livewallpaper.b.j;
import com.ss.android.ugc.aweme.livewallpaper.b.k;
import com.ss.android.ugc.aweme.video.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53558a;

    /* renamed from: b  reason: collision with root package name */
    MediaPlayer f53559b;

    /* renamed from: c  reason: collision with root package name */
    public String f53560c;

    /* renamed from: d  reason: collision with root package name */
    private C0619a f53561d;

    /* renamed from: e  reason: collision with root package name */
    private k f53562e;

    /* renamed from: f  reason: collision with root package name */
    private j f53563f;
    private SurfaceHolder g;
    private Surface h;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a$a  reason: collision with other inner class name */
    public interface C0619a {
        void a(boolean z, String str, String str2);
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f53558a, false, 56012, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f53558a, false, 56012, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.f53561d != null) {
            this.f53561d.a(z, this.f53560c, str);
        }
    }

    public a(C0619a aVar) {
        this.f53561d = aVar;
    }

    public final void a(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f53558a, false, 56009, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f53558a, false, 56009, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.f53559b != null) {
            this.f53559b.release();
            this.f53559b = null;
        }
        if (this.h != null) {
            this.h.release();
            this.h = null;
        }
        if (this.f53563f != null) {
            this.f53563f.d();
        }
        if (this.f53562e != null) {
            this.f53562e.release();
        }
        this.g = null;
    }

    public final void a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder surfaceHolder2 = surfaceHolder;
        if (PatchProxy.isSupport(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53558a, false, 56007, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53558a, false, 56007, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = surfaceHolder2;
        if (this.f53563f != null) {
            this.f53563f.a(i2, i3);
        }
    }

    public final void a(String str, int i, int i2, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f53558a, false, 56010, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f53558a, false, 56010, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!b.b(str)) {
            a(false, "onRefresh video is not exists");
        } else if (this.g != null) {
            Surface surface = this.g.getSurface();
            Rect surfaceFrame = this.g.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a2 = a(width, height, i, i2, true);
            if (this.f53559b != null) {
                this.f53559b.release();
                this.f53559b = null;
            }
            if (this.h != null) {
                this.h.release();
                this.h = null;
            }
            if (this.f53563f != null) {
                this.f53563f.d();
            }
            if (this.f53562e != null) {
                this.f53562e.release();
            }
            this.f53563f = new j(surface, null);
            this.f53563f.l = a2;
            this.f53563f.e();
            this.f53562e = this.f53563f.f();
            if (this.f53562e != null) {
                this.f53562e.setDefaultBufferSize(width, height);
                surface = new Surface(this.f53562e);
            }
            this.h = surface;
            this.f53559b = new MediaPlayer();
            try {
                this.f53559b.setSurface(surface);
                this.f53559b.setDataSource(str);
                this.f53559b.setLooping(true);
                this.f53559b.setVolume(0.0f, 0.0f);
                this.f53559b.prepare();
                this.f53559b.start();
                this.f53559b.setOnInfoListener(new MediaPlayer.OnInfoListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53566a;

                    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                        if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53566a, false, 56014, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53566a, false, 56014, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                        }
                        if (i == 3) {
                            a.this.a(true, "");
                        }
                        return false;
                    }
                });
                this.f53559b.setOnErrorListener(new MediaPlayer.OnErrorListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53568a;

                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53568a, false, 56015, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53568a, false, 56015, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                        }
                        a aVar = a.this;
                        aVar.a(false, "media play error what = " + i + " extra = " + i2);
                        return false;
                    }
                });
            } catch (Exception e2) {
                a(false, "media play exception " + e2.getMessage());
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WallPaperPlayerEngine", e2));
            }
        }
    }

    private Pair<Float, Float> a(int i, int i2, int i3, int i4, boolean z) {
        float f2;
        float f3;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, f53558a, false, 56011, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Pair.class)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)};
            return (Pair) PatchProxy.accessDispatch(objArr, this, f53558a, false, 56011, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Pair.class);
        }
        float f4 = 1.0f;
        if (i8 <= 0 || i7 <= 0 || i6 <= 0 || i5 <= 0) {
            return new Pair<>(Float.valueOf(1.0f), Float.valueOf(1.0f));
        }
        float f5 = ((float) i7) / ((float) i8);
        float f6 = ((float) i5) / ((float) i6);
        if (!z) {
            if (f5 > f6) {
                f3 = f6 / f5;
            } else {
                f2 = f5 / f6;
                return new Pair<>(Float.valueOf(f2), Float.valueOf(f4));
            }
        } else if (f5 < f6) {
            f3 = f6 / f5;
        } else {
            f2 = f5 / f6;
            return new Pair<>(Float.valueOf(f2), Float.valueOf(f4));
        }
        f4 = f3;
        f2 = 1.0f;
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f4));
    }

    public final void a(SurfaceHolder surfaceHolder, String str, int i, int i2, boolean z) {
        SurfaceHolder surfaceHolder2 = surfaceHolder;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{surfaceHolder2, str2, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f53558a, false, 56008, new Class[]{SurfaceHolder.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder2, str2, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f53558a, false, 56008, new Class[]{SurfaceHolder.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = surfaceHolder2;
        if (this.g != null) {
            Surface surface = this.g.getSurface();
            Rect surfaceFrame = this.g.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a2 = a(width, height, i, i2, true);
            if (this.f53559b != null) {
                this.f53559b.release();
                this.f53559b = null;
            }
            if (this.h != null) {
                this.h.release();
                this.h = null;
            }
            if (this.f53563f != null) {
                this.f53563f.d();
            }
            if (this.f53562e != null) {
                this.f53562e.release();
            }
            this.f53563f = new j(surface, null);
            this.f53563f.l = a2;
            this.f53563f.e();
            this.f53562e = this.f53563f.f();
            if (this.f53562e != null) {
                this.f53562e.setDefaultBufferSize(width, height);
                surface = new Surface(this.f53562e);
            }
            this.h = surface;
            this.f53559b = new MediaPlayer();
            try {
                this.f53559b.setSurface(surface);
                this.f53559b.setDataSource(str2);
                this.f53559b.setLooping(true);
                this.f53559b.setVolume(0.0f, 0.0f);
                this.f53559b.prepare();
                this.f53559b.start();
                this.f53559b.setOnErrorListener(new MediaPlayer.OnErrorListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53564a;

                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53564a, false, 56013, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53564a, false, 56013, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                        }
                        a aVar = a.this;
                        aVar.a(false, "onSurfaceCreated media play error what = " + i + " extra = " + i2);
                        return false;
                    }
                });
            } catch (Exception e2) {
                a(false, "onSurfaceCreated media play exception " + e2.getMessage());
            }
        }
    }
}
