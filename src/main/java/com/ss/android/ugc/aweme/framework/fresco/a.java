package com.ss.android.ugc.aweme.framework.fresco;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.cache.d;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.cache.h;
import com.facebook.imagepipeline.cache.s;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.e.i;
import com.ss.android.ugc.aweme.framework.fresco.a.b;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48516a;

    /* renamed from: b  reason: collision with root package name */
    public g<CacheKey, CloseableImage> f48517b;

    /* renamed from: c  reason: collision with root package name */
    public int f48518c;

    /* renamed from: d  reason: collision with root package name */
    private b f48519d;

    /* renamed from: com.ss.android.ugc.aweme.framework.fresco.a$a  reason: collision with other inner class name */
    static final class C0574a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48528a = new a((byte) 0);
    }

    public static a b() {
        return C0574a.f48528a;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48516a, false, 45904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48516a, false, 45904, new Class[0], Void.TYPE);
            return;
        }
        if (this.f48517b != null) {
            this.f48517b.clear();
        }
    }

    private a() {
        int i;
        ExecutorService executorService;
        Object obj;
        boolean z;
        int i2;
        Application a2 = com.bytedance.lighten.core.g.a();
        if (PatchProxy.isSupport(new Object[]{a2}, null, i.f48510a, true, 46001, new Class[]{Context.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{a2}, null, i.f48510a, true, 46001, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else {
            if (PatchProxy.isSupport(new Object[]{a2, PushConstants.INTENT_ACTIVITY_NAME}, null, i.f48510a, true, 46003, new Class[]{Context.class, String.class}, Object.class)) {
                obj = PatchProxy.accessDispatch(new Object[]{a2, PushConstants.INTENT_ACTIVITY_NAME}, null, i.f48510a, true, 46003, new Class[]{Context.class, String.class}, Object.class);
            } else {
                obj = a2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            }
            ActivityManager activityManager = (ActivityManager) obj;
            if ((a2.getApplicationInfo().flags & 1048576) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = activityManager.getLargeMemoryClass();
            } else {
                i2 = activityManager.getMemoryClass();
            }
            int i3 = (int) ((((long) i2) * 1048576) / 10);
            if (PatchProxy.isSupport(new Object[]{a2}, null, i.f48510a, true, 46002, new Class[]{Context.class}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{a2}, null, i.f48510a, true, 46002, new Class[]{Context.class}, Integer.TYPE)).intValue();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) a2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i = displayMetrics.widthPixels * displayMetrics.heightPixels * 4 * 4;
            }
            if (i3 <= i) {
                if (i3 < 6291456) {
                    i = 6291456;
                } else {
                    i = i3;
                }
            }
        }
        this.f48518c = i;
        if (PatchProxy.isSupport(new Object[0], this, f48516a, false, 45905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48516a, false, 45905, new Class[0], Void.TYPE);
        } else {
            this.f48517b = new g<>(new s<CloseableImage>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48524a;

                public final /* synthetic */ int getSizeInBytes(Object obj) {
                    CloseableImage closeableImage = (CloseableImage) obj;
                    if (!PatchProxy.isSupport(new Object[]{closeableImage}, this, f48524a, false, 45909, new Class[]{CloseableImage.class}, Integer.TYPE)) {
                        return closeableImage.getSizeInBytes();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{closeableImage}, this, f48524a, false, 45909, new Class[]{CloseableImage.class}, Integer.TYPE)).intValue();
                }
            }, new d(), new h((ActivityManager) com.bytedance.lighten.core.g.a().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48526a;

                public final MemoryCacheParams get() {
                    if (PatchProxy.isSupport(new Object[0], this, f48526a, false, 45910, new Class[0], MemoryCacheParams.class)) {
                        return (MemoryCacheParams) PatchProxy.accessDispatch(new Object[0], this, f48526a, false, 45910, new Class[0], MemoryCacheParams.class);
                    }
                    MemoryCacheParams memoryCacheParams = new MemoryCacheParams(a.this.f48518c, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    return memoryCacheParams;
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f48516a, false, 45906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48516a, false, 45906, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, b.f48530a, true, 45911, new Class[0], ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, b.f48530a, true, 45911, new Class[0], ExecutorService.class);
        } else {
            executorService = com.ss.android.ugc.aweme.thread.h.a(m.a(p.FIXED).a(1).a());
        }
        this.f48519d = new b(executorService, 10);
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    private CloseableReference<Bitmap> a(@Nullable CloseableReference<CloseableImage> closeableReference) {
        if (PatchProxy.isSupport(new Object[]{closeableReference}, this, f48516a, false, 45907, new Class[]{CloseableReference.class}, CloseableReference.class)) {
            return (CloseableReference) PatchProxy.accessDispatch(new Object[]{closeableReference}, this, f48516a, false, 45907, new Class[]{CloseableReference.class}, CloseableReference.class);
        }
        try {
            if (CloseableReference.isValid(closeableReference) && (closeableReference.get() instanceof CloseableStaticBitmap)) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableReference.get();
                if (closeableStaticBitmap != null) {
                    return closeableStaticBitmap.cloneUnderlyingBitmapReference();
                }
            }
            CloseableReference.closeSafely(closeableReference);
            return null;
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    public final CloseableReference<Bitmap> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48516a, false, 45903, new Class[]{String.class}, CloseableReference.class)) {
            return (CloseableReference) PatchProxy.accessDispatch(new Object[]{str}, this, f48516a, false, 45903, new Class[]{String.class}, CloseableReference.class);
        }
        CloseableReference closeableReference = this.f48517b.get(new SimpleCacheKey(str));
        if (closeableReference != null) {
            return a(closeableReference);
        }
        return null;
    }

    public final void a(final String str, CloseableAnimatedImage closeableAnimatedImage) {
        if (PatchProxy.isSupport(new Object[]{str, closeableAnimatedImage}, this, f48516a, false, 45902, new Class[]{String.class, CloseableAnimatedImage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, closeableAnimatedImage}, this, f48516a, false, 45902, new Class[]{String.class, CloseableAnimatedImage.class}, Void.TYPE);
            return;
        }
        if (!(TextUtils.isEmpty(str) || closeableAnimatedImage == null || closeableAnimatedImage.getImageResult() == null)) {
            final CloseableReference<Bitmap> previewBitmap = closeableAnimatedImage.getImageResult().getPreviewBitmap();
            if (previewBitmap != null && previewBitmap.isValid()) {
                a.i.a((Callable<TResult>) new Callable<Object>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48520a;

                    public final Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f48520a, false, 45908, new Class[0], Object.class)) {
                            return PatchProxy.accessDispatch(new Object[0], this, f48520a, false, 45908, new Class[0], Object.class);
                        }
                        if (previewBitmap != null && previewBitmap.isValid()) {
                            CloseableReference<Bitmap> createBitmap = ImagePipelineFactory.getInstance().getPlatformBitmapFactory().createBitmap((Bitmap) previewBitmap.get());
                            CloseableReference of = CloseableReference.of(new CloseableStaticBitmap(createBitmap, c.FULL_QUALITY, 0));
                            CloseableReference cache = a.this.f48517b.cache(new SimpleCacheKey(str), of);
                            CloseableReference.closeSafely(createBitmap);
                            CloseableReference.closeSafely(cache);
                            CloseableReference.closeSafely(of);
                        }
                        return null;
                    }
                }, (Executor) this.f48519d);
            }
        }
    }
}
