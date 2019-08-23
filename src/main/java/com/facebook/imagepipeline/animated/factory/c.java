package com.facebook.imagepipeline.animated.factory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.a.a;
import com.facebook.imagepipeline.animated.a.e;
import com.facebook.imagepipeline.animated.a.g;
import com.facebook.imagepipeline.animated.b.b;
import com.facebook.imagepipeline.animated.b.d;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.ArrayList;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    static a f23801a = a("com.facebook.animated.gif.GifImage");

    /* renamed from: b  reason: collision with root package name */
    static a f23802b = a("com.facebook.animated.webp.WebPImage");

    /* renamed from: c  reason: collision with root package name */
    private final b f23803c;

    /* renamed from: d  reason: collision with root package name */
    private final PlatformBitmapFactory f23804d;

    private static a a(String str) {
        try {
            return (a) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public c(b bVar, PlatformBitmapFactory platformBitmapFactory) {
        this.f23803c = bVar;
        this.f23804d = platformBitmapFactory;
    }

    private CloseableImage a(ImageDecodeOptions imageDecodeOptions, e eVar) {
        List<CloseableReference<Bitmap>> list;
        int i;
        CloseableReference<Bitmap> closeableReference = null;
        try {
            if (imageDecodeOptions.useLastFrameForPreview) {
                i = eVar.getFrameCount() - 1;
            } else {
                i = 0;
            }
            if (imageDecodeOptions.forceStaticImage) {
                CloseableStaticBitmap closeableStaticBitmap = new CloseableStaticBitmap(a(eVar, imageDecodeOptions.bitmapConfig, i), com.facebook.imagepipeline.image.c.FULL_QUALITY, 0);
                CloseableReference.closeSafely((CloseableReference<?>) null);
                CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) null);
                return closeableStaticBitmap;
            }
            if (imageDecodeOptions.decodeAllFrames) {
                Bitmap.Config config = imageDecodeOptions.bitmapConfig;
                a aVar = this.f23803c.get(g.forAnimatedImage(eVar), null);
                final ArrayList arrayList = new ArrayList(aVar.getFrameCount());
                d dVar = new d(aVar, new d.a() {
                    public final void onIntermediateResult(int i, Bitmap bitmap) {
                    }

                    public final CloseableReference<Bitmap> getCachedBitmap(int i) {
                        return CloseableReference.cloneOrNull((CloseableReference) arrayList.get(i));
                    }
                });
                for (int i2 = 0; i2 < aVar.getFrameCount(); i2++) {
                    CloseableReference<Bitmap> a2 = a(aVar.getWidth(), aVar.getHeight(), config);
                    dVar.renderFrame(i2, (Bitmap) a2.get());
                    arrayList.add(a2);
                }
                try {
                    if (arrayList.size() > i) {
                        closeableReference = CloseableReference.cloneOrNull(arrayList.get(i));
                    }
                    list = arrayList;
                } catch (Throwable th) {
                    th = th;
                    list = arrayList;
                    CloseableReference.closeSafely((CloseableReference<?>) null);
                    CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) list);
                    throw th;
                }
            } else if (imageDecodeOptions.preDecodeFrameCount > 0) {
                list = b(eVar, imageDecodeOptions.bitmapConfig, imageDecodeOptions.preDecodeFrameCount);
                try {
                    if (list.size() > i) {
                        closeableReference = CloseableReference.cloneOrNull(list.get(i));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CloseableReference.closeSafely((CloseableReference<?>) null);
                    CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (imageDecodeOptions.decodePreviewFrame && closeableReference == null) {
                closeableReference = a(eVar, imageDecodeOptions.bitmapConfig, i);
            }
            CloseableAnimatedImage closeableAnimatedImage = new CloseableAnimatedImage(g.newBuilder(eVar).setPreviewBitmap(closeableReference).setFrameForPreview(i).setDecodedFrames(list).build(), imageDecodeOptions);
            CloseableReference.closeSafely(closeableReference);
            CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) list);
            return closeableAnimatedImage;
        } catch (Throwable th3) {
            th = th3;
            list = null;
            CloseableReference.closeSafely((CloseableReference<?>) null);
            CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) list);
            throw th;
        }
    }

    @SuppressLint({"NewApi"})
    private CloseableReference<Bitmap> a(int i, int i2, Bitmap.Config config) {
        CloseableReference<Bitmap> createBitmapInternal = this.f23804d.createBitmapInternal(i, i2, config);
        ((Bitmap) createBitmapInternal.get()).eraseColor(0);
        if (Build.VERSION.SDK_INT >= 12) {
            ((Bitmap) createBitmapInternal.get()).setHasAlpha(true);
        }
        return createBitmapInternal;
    }

    private CloseableReference<Bitmap> a(e eVar, Bitmap.Config config, int i) {
        CloseableReference<Bitmap> a2 = a(eVar.getWidth(), eVar.getHeight(), config);
        new d(this.f23803c.get(g.forAnimatedImage(eVar), null), new d.a() {
            public final CloseableReference<Bitmap> getCachedBitmap(int i) {
                return null;
            }

            public final void onIntermediateResult(int i, Bitmap bitmap) {
            }
        }).renderFrame(i, (Bitmap) a2.get());
        return a2;
    }

    private List<CloseableReference<Bitmap>> b(e eVar, Bitmap.Config config, int i) {
        a aVar = this.f23803c.get(g.forAnimatedImage(eVar), null);
        int frameCount = aVar.getFrameCount();
        if (i > frameCount) {
            i = frameCount;
        }
        if (aVar instanceof com.facebook.imagepipeline.animated.b.a) {
            ((com.facebook.imagepipeline.animated.b.a) aVar).mDecodeType = 1;
        }
        final ArrayList arrayList = new ArrayList(i);
        d dVar = new d(aVar, new d.a() {
            public final void onIntermediateResult(int i, Bitmap bitmap) {
            }

            public final CloseableReference<Bitmap> getCachedBitmap(int i) {
                return CloseableReference.cloneOrNull((CloseableReference) arrayList.get(i));
            }
        });
        for (int i2 = 0; i2 < i; i2++) {
            CloseableReference<Bitmap> a2 = a(aVar.getWidth(), aVar.getHeight(), config);
            try {
                dVar.renderFrame(i2, (Bitmap) a2.get());
                arrayList.add(a2);
            } catch (IllegalStateException e2) {
                FLog.w("AnimatedImageFactoryImp", (Throwable) e2, "preview decode failed", new Object[0]);
            }
        }
        return arrayList;
    }

    public final CloseableImage decodeGif(com.facebook.imagepipeline.image.b bVar, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config) {
        e eVar;
        if (f23801a != null) {
            CloseableReference<com.facebook.common.memory.e> byteBufferRef = bVar.getByteBufferRef();
            Preconditions.checkNotNull(byteBufferRef);
            try {
                com.facebook.common.memory.e eVar2 = (com.facebook.common.memory.e) byteBufferRef.get();
                if (eVar2.getByteBuffer() != null) {
                    eVar = f23801a.decode(eVar2.getByteBuffer());
                } else {
                    eVar = f23801a.decode(eVar2.getNativePtr(), eVar2.size());
                }
                return a(imageDecodeOptions, eVar);
            } finally {
                CloseableReference.closeSafely(byteBufferRef);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }

    public final CloseableImage decodeWebP(com.facebook.imagepipeline.image.b bVar, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config) {
        e eVar;
        if (f23802b != null) {
            CloseableReference<com.facebook.common.memory.e> byteBufferRef = bVar.getByteBufferRef();
            Preconditions.checkNotNull(byteBufferRef);
            try {
                com.facebook.common.memory.e eVar2 = (com.facebook.common.memory.e) byteBufferRef.get();
                if (eVar2.getByteBuffer() != null) {
                    eVar = f23802b.decode(eVar2.getByteBuffer());
                } else {
                    eVar = f23802b.decode(eVar2.getNativePtr(), eVar2.size());
                }
                return a(imageDecodeOptions, eVar);
            } finally {
                CloseableReference.closeSafely(byteBufferRef);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }
}
