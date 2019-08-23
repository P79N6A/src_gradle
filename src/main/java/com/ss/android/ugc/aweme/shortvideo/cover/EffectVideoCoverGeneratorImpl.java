package com.ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.jni.EffectThumb;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.d;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import com.ss.android.ugc.aweme.shortvideo.b.a;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import dmt.av.video.ah;
import java.util.List;

public class EffectVideoCoverGeneratorImpl implements LifecycleObserver, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3903a;

    /* renamed from: b  reason: collision with root package name */
    public EffectThumb f3904b;

    /* renamed from: c  reason: collision with root package name */
    public String f3905c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3906d;

    /* renamed from: e  reason: collision with root package name */
    public int f3907e;

    /* renamed from: f  reason: collision with root package name */
    private int f3908f;
    private List<EffectPointModel> g;
    private String h;
    private long i;
    private VEPreviewConfigure j;

    public final int a() {
        return this.f3908f;
    }

    public final long b() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3903a, false, 75347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3903a, false, 75347, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3904b != null) {
            this.f3904b.stopRender();
        }
    }

    private static long[] a(long j2, int i2) {
        long[] jArr = new long[i2];
        long j3 = j2 / ((long) i2);
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = ((long) i3) * j3;
        }
        return jArr;
    }

    public final void a(int i2, int i3, @NonNull b.a aVar) {
        int i4;
        VEVideoSegment vEVideoSegment;
        final b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), aVar2}, this, f3903a, false, 75345, new Class[]{Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), aVar2}, this, f3903a, false, 75345, new Class[]{Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE);
            return;
        }
        for (final int i5 = 0; i5 < this.f3908f; i5++) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i3), aVar2}, this, f3903a, false, 75344, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i3), aVar2}, this, f3903a, false, 75344, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE);
            } else {
                if (this.f3904b == null) {
                    this.f3904b = new a();
                    if (this.j == null) {
                        i4 = this.f3904b.init(this.f3905c);
                    } else {
                        if (this.j.getVideoSegments().size() > 0) {
                            vEVideoSegment = (VEVideoSegment) this.j.getVideoSegments().get(0);
                        } else {
                            vEVideoSegment = null;
                        }
                        if (vEVideoSegment == null) {
                            i4 = this.f3904b.init(this.f3905c);
                        } else {
                            int i6 = vEVideoSegment.start;
                            int end = vEVideoSegment.getEnd();
                            float f2 = vEVideoSegment.speed;
                            this.f3907e = vEVideoSegment.rotate;
                            i4 = this.f3904b.init(this.f3905c, (long) i6, (long) end, f2);
                        }
                    }
                    if (i4 < 0) {
                        this.f3904b = null;
                    } else {
                        this.i = this.f3904b.getDuration();
                        this.f3904b.renderVideo(a(this.i, this.f3908f), d.a(this.g, this.f3906d, (int) this.i).setFilter(this.h), i2, i3);
                    }
                } else {
                    int i7 = i2;
                    int i8 = i3;
                }
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f66082a;

                    public final void run() {
                        int i = 0;
                        if (PatchProxy.isSupport(new Object[0], this, f66082a, false, 75348, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f66082a, false, 75348, new Class[0], Void.TYPE);
                            return;
                        }
                        if (!EffectVideoCoverGeneratorImpl.this.f3906d) {
                            i = ah.d(EffectVideoCoverGeneratorImpl.this.f3905c) + EffectVideoCoverGeneratorImpl.this.f3907e;
                        }
                        CoverInfo thumb = EffectVideoCoverGeneratorImpl.this.f3904b.getThumb(i5);
                        final Bitmap bitmap = null;
                        if (!(thumb == null || thumb.getData() == null)) {
                            Bitmap createBitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Bitmap.Config.ARGB_8888);
                            if (i > 0) {
                                Matrix matrix = new Matrix();
                                matrix.postRotate((float) i);
                                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
                            } else {
                                bitmap = createBitmap;
                            }
                        }
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f66086a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f66086a, false, 75349, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f66086a, false, 75349, new Class[0], Void.TYPE);
                                    return;
                                }
                                aVar2.a(bitmap);
                            }
                        });
                    }
                });
            }
            int i9 = i2;
            int i10 = i3;
        }
    }

    public EffectVideoCoverGeneratorImpl(@NonNull LifecycleOwner lifecycleOwner, @NonNull String str, @NonNull List<EffectPointModel> list, @NonNull String str2, int i2, boolean z, VEPreviewConfigure vEPreviewConfigure) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.f3908f = i2;
        this.f3905c = str;
        this.g = list;
        this.h = str2;
        this.f3906d = z;
        this.j = vEPreviewConfigure;
    }
}
