package com.ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.bitmaps.f;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.cache.m;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.jni.FrameThumb;
import java.util.concurrent.Executor;

public interface VideoCoverBitmapCache {

    public static class DefaultVideoCover extends VideoCoverCacheImpl {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4044a;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<CloseableReference<CloseableImage>> f4045b;

        /* access modifiers changed from: package-private */
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            if (PatchProxy.isSupport(new Object[0], this, f4044a, false, 81054, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4044a, false, 81054, new Class[0], Void.TYPE);
                return;
            }
            this.h.unInitVideoToGraph();
            for (int i = 0; i < this.f4045b.size(); i++) {
                CloseableReference.closeSafely(this.f4045b.valueAt(i));
            }
        }

        public final void a(int i, @NonNull a aVar) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar}, this, f4044a, false, 81051, new Class[]{Integer.TYPE, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar}, this, f4044a, false, 81051, new Class[]{Integer.TYPE, a.class}, Void.TYPE);
                return;
            }
            super.a(i, aVar);
            CloseableReference closeableReference = this.f4045b.get(i);
            if (closeableReference == null || !closeableReference.isValid()) {
                this.g.execute(b(i, aVar));
                return;
            }
            aVar.a(closeableReference.clone());
            CloseableReference.closeSafely(closeableReference);
        }

        public final Runnable b(int i, @NonNull a aVar) {
            final a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2}, this, f4044a, false, 81052, new Class[]{Integer.TYPE, a.class}, Runnable.class)) {
                return (Runnable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2}, this, f4044a, false, 81052, new Class[]{Integer.TYPE, a.class}, Runnable.class);
            }
            final int i2 = i;
            return new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71046a;

                public final void run() {
                    CloseableReference closeableReference;
                    if (PatchProxy.isSupport(new Object[0], this, f71046a, false, 81055, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71046a, false, 81055, new Class[0], Void.TYPE);
                        return;
                    }
                    int[] frameThumbnail = DefaultVideoCover.this.h.getFrameThumbnail(i2);
                    if (frameThumbnail != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(frameThumbnail, DefaultVideoCover.this.f4047d, DefaultVideoCover.this.f4048e, Bitmap.Config.ARGB_8888);
                        DefaultVideoCover defaultVideoCover = DefaultVideoCover.this;
                        if (PatchProxy.isSupport(new Object[]{createBitmap}, defaultVideoCover, DefaultVideoCover.f4044a, false, 81053, new Class[]{Bitmap.class}, CloseableReference.class)) {
                            DefaultVideoCover defaultVideoCover2 = defaultVideoCover;
                            closeableReference = (CloseableReference) PatchProxy.accessDispatch(new Object[]{createBitmap}, defaultVideoCover2, DefaultVideoCover.f4044a, false, 81053, new Class[]{Bitmap.class}, CloseableReference.class);
                        } else {
                            closeableReference = CloseableReference.of(new CloseableStaticBitmap(createBitmap, (b<Bitmap>) f.getInstance(), c.FULL_QUALITY, 0));
                        }
                        final CloseableReference clone = closeableReference.clone();
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71050a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f71050a, false, 81056, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f71050a, false, 81056, new Class[0], Void.TYPE);
                                    return;
                                }
                                aVar2.a(clone);
                            }
                        });
                        DefaultVideoCover.this.f4045b.put(i2, closeableReference);
                    }
                }
            };
        }
    }

    public static class VideoCoverCacheImpl implements LifecycleObserver, VideoCoverBitmapCache {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f4046c;

        /* renamed from: d  reason: collision with root package name */
        int f4047d;

        /* renamed from: e  reason: collision with root package name */
        int f4048e;

        /* renamed from: f  reason: collision with root package name */
        String f4049f;
        Executor g;
        FrameThumb h;

        /* access modifiers changed from: package-private */
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            if (PatchProxy.isSupport(new Object[0], this, f4046c, false, 81058, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4046c, false, 81058, new Class[0], Void.TYPE);
                return;
            }
            if (this.h != null) {
                this.h.unInitVideoToGraph();
            }
        }

        public Runnable b(int i, @NonNull a aVar) {
            final a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2}, this, f4046c, false, 81060, new Class[]{Integer.TYPE, a.class}, Runnable.class)) {
                return (Runnable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2}, this, f4046c, false, 81060, new Class[]{Integer.TYPE, a.class}, Runnable.class);
            }
            final int i2 = i;
            return new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71053a;

                public final void run() {
                    CloseableReference closeableReference;
                    if (PatchProxy.isSupport(new Object[0], this, f71053a, false, 81064, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71053a, false, 81064, new Class[0], Void.TYPE);
                        return;
                    }
                    int[] frameThumbnail = VideoCoverCacheImpl.this.h.getFrameThumbnail(i2);
                    if (frameThumbnail != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(frameThumbnail, VideoCoverCacheImpl.this.f4047d, VideoCoverCacheImpl.this.f4048e, Bitmap.Config.ARGB_8888);
                        VideoCoverCacheImpl videoCoverCacheImpl = VideoCoverCacheImpl.this;
                        if (PatchProxy.isSupport(new Object[]{createBitmap}, videoCoverCacheImpl, VideoCoverCacheImpl.f4046c, false, 81061, new Class[]{Bitmap.class}, CloseableReference.class)) {
                            closeableReference = (CloseableReference) PatchProxy.accessDispatch(new Object[]{createBitmap}, videoCoverCacheImpl, VideoCoverCacheImpl.f4046c, false, 81061, new Class[]{Bitmap.class}, CloseableReference.class);
                        } else {
                            closeableReference = CloseableReference.of(new CloseableStaticBitmap(createBitmap, (b<Bitmap>) f.getInstance(), c.FULL_QUALITY, 0));
                        }
                        final CloseableReference clone = closeableReference.clone();
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71057a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f71057a, false, 81065, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f71057a, false, 81065, new Class[0], Void.TYPE);
                                    return;
                                }
                                aVar2.a(clone);
                            }
                        });
                        VideoCoverCacheImpl videoCoverCacheImpl2 = VideoCoverCacheImpl.this;
                        String str = VideoCoverCacheImpl.this.f4049f + i2;
                        if (PatchProxy.isSupport(new Object[]{closeableReference, str}, videoCoverCacheImpl2, VideoCoverCacheImpl.f4046c, false, 81062, new Class[]{CloseableReference.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{closeableReference, str}, videoCoverCacheImpl2, VideoCoverCacheImpl.f4046c, false, 81062, new Class[]{CloseableReference.class, String.class}, Void.TYPE);
                            return;
                        }
                        Fresco.getImagePipelineFactory().getBitmapMemoryCache().cache(DefaultCacheKeyFactory.getInstance().getBitmapCacheKey(ImageRequest.fromUri("file://" + str), null), closeableReference);
                    }
                }
            };
        }

        public void a(int i, @NonNull a aVar) {
            CloseableReference closeableReference;
            a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2}, this, f4046c, false, 81059, new Class[]{Integer.TYPE, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2}, this, f4046c, false, 81059, new Class[]{Integer.TYPE, a.class}, Void.TYPE);
                return;
            }
            String str = this.f4049f + i;
            if (PatchProxy.isSupport(new Object[]{str}, this, f4046c, false, 81063, new Class[]{String.class}, CloseableReference.class)) {
                closeableReference = (CloseableReference) PatchProxy.accessDispatch(new Object[]{str}, this, f4046c, false, 81063, new Class[]{String.class}, CloseableReference.class);
            } else {
                m<CacheKey, CloseableImage> bitmapMemoryCache = Fresco.getImagePipelineFactory().getBitmapMemoryCache();
                com.facebook.imagepipeline.cache.c cVar = new com.facebook.imagepipeline.cache.c("file://" + str, null, RotationOptions.autoRotate(), ImageDecodeOptions.defaults(), null, null, null);
                closeableReference = bitmapMemoryCache.get(cVar);
            }
            if (closeableReference != null) {
                aVar2.a(closeableReference.clone());
                CloseableReference.closeSafely(closeableReference);
                return;
            }
            this.g.execute(b(i, aVar));
        }
    }

    public interface a {
        void a(@NonNull CloseableReference<CloseableImage> closeableReference);
    }

    void a(int i, @NonNull a aVar);
}
