package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import com.facebook.common.f.f;
import com.facebook.common.internal.g;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.c;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ae implements al<CloseableReference<CloseableImage>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f24016a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f24017b;

    public static int calculateKind(ImageRequest imageRequest) {
        if (imageRequest.getPreferredWidth() > 96 || imageRequest.getPreferredHeight() > 96) {
            return 1;
        }
        return 3;
    }

    @Nullable
    public final String getLocalFilePath(ImageRequest imageRequest) {
        String[] strArr;
        String str;
        Uri uri;
        Uri sourceUri = imageRequest.getSourceUri();
        if (f.c(sourceUri)) {
            return imageRequest.getSourceFile().getPath();
        }
        if (f.d(sourceUri)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(sourceUri.getAuthority())) {
                uri = sourceUri;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(sourceUri);
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                str = "_id=?";
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f24017b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    public ae(Executor executor, ContentResolver contentResolver) {
        this.f24016a = executor;
        this.f24017b = contentResolver;
    }

    public final void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, am amVar) {
        final ao listener = amVar.getListener();
        final String id = amVar.getId();
        final ImageRequest imageRequest = amVar.getImageRequest();
        final AnonymousClass1 r0 = new at<CloseableReference<CloseableImage>>(consumer, listener, "VideoThumbnailProducer", id) {
            public final /* synthetic */ Object getResult() throws Exception {
                String localFilePath = ae.this.getLocalFilePath(imageRequest);
                if (localFilePath == null) {
                    return null;
                }
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(localFilePath, ae.calculateKind(imageRequest));
                if (createVideoThumbnail == null) {
                    return null;
                }
                return CloseableReference.of(new CloseableStaticBitmap(createVideoThumbnail, (b<Bitmap>) com.facebook.imagepipeline.bitmaps.f.getInstance(), c.FULL_QUALITY, 0));
            }

            public final /* synthetic */ void disposeResult(Object obj) {
                CloseableReference.closeSafely((CloseableReference) obj);
            }

            public final void onFailure(Exception exc) {
                super.onFailure(exc);
                listener.onUltimateProducerReached(id, "VideoThumbnailProducer", false);
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ Map a(Object obj) {
                boolean z;
                if (((CloseableReference) obj) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return g.of("createdThumbnail", String.valueOf(z));
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                boolean z;
                CloseableReference closeableReference = (CloseableReference) obj;
                super.onSuccess(closeableReference);
                ao aoVar = listener;
                String str = id;
                if (closeableReference != null) {
                    z = true;
                } else {
                    z = false;
                }
                aoVar.onUltimateProducerReached(str, "VideoThumbnailProducer", z);
            }
        };
        amVar.addCallbacks(new e() {
            public final void onCancellationRequested() {
                r0.cancel();
            }
        });
        this.f24016a.execute(r0);
    }
}
