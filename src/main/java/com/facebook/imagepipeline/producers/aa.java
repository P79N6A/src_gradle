package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.util.Pair;
import com.facebook.common.internal.g;
import com.facebook.common.memory.e;
import com.facebook.common.memory.f;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.a;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;

public class aa implements az<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f24001a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f24002b;
    public final f mPooledByteBufferFactory;

    public boolean canProvideImageForSize(ResizeOptions resizeOptions) {
        return ba.isImageBigEnough(512, 512, resizeOptions);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }] */
    @com.facebook.common.internal.VisibleForTesting
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.ExifInterface a(android.net.Uri r3) {
        /*
            r2 = this;
            android.content.ContentResolver r0 = r2.f24002b
            java.lang.String r3 = com.facebook.common.f.f.a(r0, r3)
            if (r3 == 0) goto L_0x001b
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r1 == 0) goto L_0x001b
            boolean r0 = r0.canRead()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x002b
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            return r0
        L_0x0024:
            java.lang.Class<com.facebook.imagepipeline.producers.aa> r3 = com.facebook.imagepipeline.producers.aa.class
            java.lang.String r0 = "StackOverflowError in ExifInterface constructor"
            com.facebook.common.logging.FLog.e((java.lang.Class<?>) r3, (java.lang.String) r0)
        L_0x002b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.aa.a(android.net.Uri):android.media.ExifInterface");
    }

    public void produceResults(Consumer<b> consumer, am amVar) {
        ao listener = amVar.getListener();
        String id = amVar.getId();
        final ImageRequest imageRequest = amVar.getImageRequest();
        final AnonymousClass1 r0 = new at<b>(consumer, listener, "LocalExifThumbnailProducer", id) {
            public final /* synthetic */ Object getResult() throws Exception {
                ExifInterface a2 = aa.this.a(imageRequest.getSourceUri());
                if (a2 == null || !a2.hasThumbnail()) {
                    return null;
                }
                return aa.this.buildEncodedImage(aa.this.mPooledByteBufferFactory.newByteBuffer(a2.getThumbnail()), a2);
            }

            public final /* synthetic */ void disposeResult(Object obj) {
                b.closeSafely((b) obj);
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ Map a(Object obj) {
                boolean z;
                if (((b) obj) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return g.of("createdThumbnail", Boolean.toString(z));
            }
        };
        amVar.addCallbacks(new e() {
            public final void onCancellationRequested() {
                r0.cancel();
            }
        });
        this.f24001a.execute(r0);
    }

    /* JADX INFO: finally extract failed */
    public b buildEncodedImage(e eVar, ExifInterface exifInterface) {
        int i;
        Pair<Integer, Integer> a2 = a.a((InputStream) new com.facebook.common.memory.g(eVar));
        int a3 = com.facebook.imageutils.e.a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
        int i2 = -1;
        if (a2 != null) {
            i = ((Integer) a2.first).intValue();
        } else {
            i = -1;
        }
        if (a2 != null) {
            i2 = ((Integer) a2.second).intValue();
        }
        CloseableReference of = CloseableReference.of(eVar);
        try {
            b bVar = new b(of);
            CloseableReference.closeSafely(of);
            bVar.mImageFormat = com.facebook.b.b.f23288a;
            bVar.mRotationAngle = a3;
            bVar.mWidth = i;
            bVar.mHeight = i2;
            return bVar;
        } catch (Throwable th) {
            CloseableReference.closeSafely(of);
            throw th;
        }
    }

    public aa(Executor executor, f fVar, ContentResolver contentResolver) {
        this.f24001a = executor;
        this.mPooledByteBufferFactory = fVar;
        this.f24002b = contentResolver;
    }
}
