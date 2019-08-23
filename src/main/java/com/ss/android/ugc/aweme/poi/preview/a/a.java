package com.ss.android.ugc.aweme.poi.preview.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.common.utility.StringUtils;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.transfer.g;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import com.ss.android.ugc.aweme.utils.bh;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60120a;

    public final void a(String str, ImageView imageView, Drawable drawable, g gVar, c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, imageView, drawable, gVar, aVar}, this, f60120a, false, 65393, new Class[]{String.class, ImageView.class, Drawable.class, g.class, c.a.class}, Void.TYPE)) {
            Object[] objArr = {str, imageView, drawable, gVar, aVar};
            PatchProxy.accessDispatch(objArr, this, f60120a, false, 65393, new Class[]{String.class, ImageView.class, Drawable.class, g.class, c.a.class}, Void.TYPE);
            return;
        }
        ImagePipeline imagePipeline = Fresco.getImagePipeline();
        ImageRequest build = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build();
        final DataSource<CloseableReference<CloseableImage>> fetchDecodedImage = imagePipeline.fetchDecodedImage(build, null);
        TransferImage transferImage = (TransferImage) imageView;
        final c.a aVar2 = aVar;
        final ImageView imageView2 = imageView;
        final g gVar2 = gVar;
        final String str2 = str;
        final Drawable drawable2 = drawable;
        AnonymousClass1 r0 = new BaseControllerListener<ImageInfo>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60121a;

            public final void onFailure(String str, Throwable th) {
                if (PatchProxy.isSupport(new Object[]{str, th}, this, f60121a, false, 65403, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f60121a, false, 65403, new Class[]{String.class, Throwable.class}, Void.TYPE);
                    return;
                }
                if (drawable2 != null) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                if (aVar2 != null) {
                    aVar2.a(0);
                }
            }

            public final void onSubmit(String str, Object obj) {
                if (PatchProxy.isSupport(new Object[]{str, obj}, this, f60121a, false, 65401, new Class[]{String.class, Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, obj}, this, f60121a, false, 65401, new Class[]{String.class, Object.class}, Void.TYPE);
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a();
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.facebook.common.references.CloseableReference} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onFinalImageSet(java.lang.String r15, @javax.annotation.Nullable java.lang.Object r16, @javax.annotation.Nullable android.graphics.drawable.Animatable r17) {
                /*
                    r14 = this;
                    r8 = r14
                    r9 = r16
                    com.facebook.imagepipeline.image.ImageInfo r9 = (com.facebook.imagepipeline.image.ImageInfo) r9
                    r10 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r10]
                    r11 = 0
                    r1[r11] = r15
                    r12 = 1
                    r1[r12] = r9
                    r13 = 2
                    r1[r13] = r17
                    com.meituan.robust.ChangeQuickRedirect r3 = f60121a
                    java.lang.Class[] r6 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r6[r11] = r2
                    java.lang.Class<com.facebook.imagepipeline.image.ImageInfo> r2 = com.facebook.imagepipeline.image.ImageInfo.class
                    r6[r12] = r2
                    java.lang.Class<android.graphics.drawable.Animatable> r2 = android.graphics.drawable.Animatable.class
                    r6[r13] = r2
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 65402(0xff7a, float:9.1648E-41)
                    r2 = r14
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0051
                    java.lang.Object[] r1 = new java.lang.Object[r10]
                    r1[r11] = r15
                    r1[r12] = r9
                    r1[r13] = r17
                    com.meituan.robust.ChangeQuickRedirect r3 = f60121a
                    r4 = 0
                    r5 = 65402(0xff7a, float:9.1648E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    r6[r11] = r0
                    java.lang.Class<com.facebook.imagepipeline.image.ImageInfo> r0 = com.facebook.imagepipeline.image.ImageInfo.class
                    r6[r12] = r0
                    java.lang.Class<android.graphics.drawable.Animatable> r0 = android.graphics.drawable.Animatable.class
                    r6[r13] = r0
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r2 = r14
                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    return
                L_0x0051:
                    r1 = 0
                    com.facebook.datasource.DataSource r0 = r3     // Catch:{ all -> 0x00a5 }
                    java.lang.Object r0 = r0.getResult()     // Catch:{ all -> 0x00a5 }
                    r2 = r0
                    com.facebook.common.references.CloseableReference r2 = (com.facebook.common.references.CloseableReference) r2     // Catch:{ all -> 0x00a5 }
                    if (r2 == 0) goto L_0x0093
                    java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0091 }
                    com.facebook.imagepipeline.image.CloseableImage r0 = (com.facebook.imagepipeline.image.CloseableImage) r0     // Catch:{ all -> 0x0091 }
                    if (r0 == 0) goto L_0x0093
                    boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap     // Catch:{ all -> 0x0091 }
                    if (r1 == 0) goto L_0x0093
                    com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0     // Catch:{ all -> 0x0091 }
                    android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()     // Catch:{ all -> 0x0091 }
                    if (r0 == 0) goto L_0x0093
                    android.widget.ImageView r1 = r4     // Catch:{ all -> 0x0091 }
                    com.ss.android.ugc.aweme.poi.preview.a.a r3 = com.ss.android.ugc.aweme.poi.preview.a.a.this     // Catch:{ all -> 0x0091 }
                    com.ss.android.ugc.aweme.poi.preview.transfer.g r4 = r5     // Catch:{ all -> 0x0091 }
                    if (r4 == 0) goto L_0x007e
                    com.ss.android.ugc.aweme.poi.preview.transfer.g r4 = r5     // Catch:{ all -> 0x0091 }
                    java.lang.String r4 = r4.x     // Catch:{ all -> 0x0091 }
                    goto L_0x0080
                L_0x007e:
                    java.lang.String r4 = ""
                L_0x0080:
                    java.lang.String r5 = r6     // Catch:{ all -> 0x0091 }
                    android.graphics.Bitmap r0 = r3.a((android.graphics.Bitmap) r0, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0091 }
                    r1.setImageBitmap(r0)     // Catch:{ all -> 0x0091 }
                    android.widget.ImageView r0 = r4     // Catch:{ all -> 0x0091 }
                    android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x0091 }
                    r0.setScaleType(r1)     // Catch:{ all -> 0x0091 }
                    goto L_0x0093
                L_0x0091:
                    r0 = move-exception
                    goto L_0x00a7
                L_0x0093:
                    com.facebook.datasource.DataSource r0 = r3
                    r0.close()
                    com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r2)
                    com.ss.android.ugc.aweme.poi.preview.a.c$a r0 = r2
                    if (r0 == 0) goto L_0x00a4
                    com.ss.android.ugc.aweme.poi.preview.a.c$a r0 = r2
                    r0.a(r12)
                L_0x00a4:
                    return
                L_0x00a5:
                    r0 = move-exception
                    r2 = r1
                L_0x00a7:
                    com.facebook.datasource.DataSource r1 = r3
                    r1.close()
                    com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.a.a.AnonymousClass1.onFinalImageSet(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
            }
        };
        transferImage.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(build)).setOldController(transferImage.getController())).setControllerListener(r0)).build());
    }

    public final boolean a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f60120a, false, 65396, new Class[]{String.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.base.c.a(Uri.parse(str));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f60120a, false, 65396, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final Drawable a(String str, g gVar) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str, gVar}, this, f60120a, false, 65395, new Class[]{String.class, g.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{str, gVar}, this, f60120a, false, 65395, new Class[]{String.class, g.class}, Drawable.class);
        }
        String a2 = com.ss.android.ugc.aweme.base.c.a(str);
        if (!StringUtils.isEmpty(a2)) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(a2, options);
                float a3 = (float) p.a();
                if (((float) options.outWidth) <= a3 || ((float) options.outHeight) <= a3) {
                    return BitmapDrawable.createFromPath(a2);
                }
                options.inSampleSize = a(options.outWidth, options.outHeight, a3, a3);
                options.inJustDecodeBounds = false;
                if (gVar != null) {
                    str2 = gVar.x;
                } else {
                    str2 = "";
                }
                a(str2, str, options.outWidth, options.outHeight);
                return new BitmapDrawable(BitmapFactory.decodeFile(a2, options));
            } catch (Exception | OutOfMemoryError unused) {
            }
        }
        return null;
    }

    public final void a(String str, g gVar, c.b bVar) {
        String str2 = str;
        g gVar2 = gVar;
        c.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, gVar2, bVar2}, this, f60120a, false, 65394, new Class[]{String.class, g.class, c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, gVar2, bVar2}, this, f60120a, false, 65394, new Class[]{String.class, g.class, c.b.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.base.c.a(new UrlModel(), 0, 0, (b<Bitmap>) new b<Bitmap>(this, bVar2, gVar2, str2));
    }

    public final Bitmap a(Bitmap bitmap, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{bitmap, str3, str4}, this, f60120a, false, 65397, new Class[]{Bitmap.class, String.class, String.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap, str3, str4}, this, f60120a, false, 65397, new Class[]{Bitmap.class, String.class, String.class}, Bitmap.class);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float a2 = (float) p.a();
        float f2 = (float) width;
        if (f2 > a2) {
            float f3 = (float) height;
            if (f3 > a2) {
                float max = Math.max(f2 / a2, f3 / a2);
                Matrix matrix = new Matrix();
                float f4 = 1.0f / max;
                matrix.setScale(f4, f4);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                a(str3, str4, width, height);
                return createBitmap;
            }
        }
        return bitmap;
    }

    private int a(int i, int i2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3)}, this, f60120a, false, 65399, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3)}, this, f60120a, false, 65399, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        float f4 = 1.0f;
        while (true) {
            float f5 = 2.0f * f4;
            if (f5 > Math.min(((float) i) / f2, ((float) i2) / f3)) {
                return (int) f4;
            }
            f4 = f5;
        }
    }

    private void a(String str, String str2, int i, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60120a, false, 65398, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60120a, false, 65398, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        bh a2 = bh.a();
        a2.a("item_id", str3);
        a2.a(PushConstants.WEB_URL, str4);
        a2.a("width", Integer.valueOf(i));
        a2.a("height", Integer.valueOf(i2));
        n.a("poi_log", "poi_preview", a2.b());
    }
}
