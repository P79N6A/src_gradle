package com.facebook.react.flat;

import android.graphics.Bitmap;
import com.facebook.common.executors.h;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.a;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

public final class PipelineRequestHelper implements DataSubscriber<CloseableReference<CloseableImage>> {
    private int mAttachCounter;
    @Nullable
    private BitmapUpdateListener mBitmapUpdateListener;
    @Nullable
    private DataSource<CloseableReference<CloseableImage>> mDataSource;
    @Nullable
    private CloseableReference<CloseableImage> mImageRef;
    private final ImageRequest mImageRequest;

    public final void onProgressUpdate(DataSource<CloseableReference<CloseableImage>> dataSource) {
    }

    /* access modifiers changed from: package-private */
    public final boolean isDetached() {
        if (this.mAttachCounter == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void detach() {
        this.mAttachCounter--;
        if (this.mAttachCounter == 0) {
            if (this.mDataSource != null) {
                this.mDataSource.close();
                this.mDataSource = null;
            }
            if (this.mImageRef != null) {
                this.mImageRef.close();
                this.mImageRef = null;
            }
            this.mBitmapUpdateListener = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Bitmap getBitmap() {
        if (this.mImageRef == null) {
            return null;
        }
        CloseableImage closeableImage = (CloseableImage) this.mImageRef.get();
        if (closeableImage instanceof a) {
            return ((a) closeableImage).getUnderlyingBitmap();
        }
        this.mImageRef.close();
        this.mImageRef = null;
        return null;
    }

    PipelineRequestHelper(ImageRequest imageRequest) {
        this.mImageRequest = imageRequest;
    }

    public final void onCancellation(DataSource<CloseableReference<CloseableImage>> dataSource) {
        if (this.mDataSource == dataSource) {
            this.mDataSource = null;
        }
        dataSource.close();
    }

    public final void onFailure(DataSource<CloseableReference<CloseableImage>> dataSource) {
        if (this.mDataSource == dataSource) {
            ((BitmapUpdateListener) com.facebook.infer.annotation.a.a(this.mBitmapUpdateListener)).onImageLoadEvent(1);
            ((BitmapUpdateListener) com.facebook.infer.annotation.a.a(this.mBitmapUpdateListener)).onImageLoadEvent(3);
            this.mDataSource = null;
        }
        dataSource.close();
    }

    /* access modifiers changed from: package-private */
    public final void attach(BitmapUpdateListener bitmapUpdateListener) {
        boolean z;
        this.mBitmapUpdateListener = bitmapUpdateListener;
        this.mAttachCounter++;
        if (this.mAttachCounter != 1) {
            Bitmap bitmap = getBitmap();
            if (bitmap != null) {
                bitmapUpdateListener.onSecondaryAttach(bitmap);
            }
            return;
        }
        bitmapUpdateListener.onImageLoadEvent(4);
        boolean z2 = false;
        if (this.mDataSource == null) {
            z = true;
        } else {
            z = false;
        }
        com.facebook.infer.annotation.a.a(z);
        if (this.mImageRef == null) {
            z2 = true;
        }
        com.facebook.infer.annotation.a.a(z2);
        this.mDataSource = ImagePipelineFactory.getInstance().getImagePipeline().fetchDecodedImage(this.mImageRequest, RCTImageView.getCallerContext());
        this.mDataSource.subscribe(this, h.a());
    }

    public final void onNewResult(DataSource<CloseableReference<CloseableImage>> dataSource) {
        if (dataSource.isFinished()) {
            try {
                if (this.mDataSource == dataSource) {
                    this.mDataSource = null;
                    CloseableReference<CloseableImage> closeableReference = (CloseableReference) dataSource.getResult();
                    if (closeableReference == null) {
                        dataSource.close();
                    } else if (!(((CloseableImage) closeableReference.get()) instanceof a)) {
                        closeableReference.close();
                        dataSource.close();
                    } else {
                        this.mImageRef = closeableReference;
                        Bitmap bitmap = getBitmap();
                        if (bitmap == null) {
                            dataSource.close();
                            return;
                        }
                        BitmapUpdateListener bitmapUpdateListener = (BitmapUpdateListener) com.facebook.infer.annotation.a.a(this.mBitmapUpdateListener);
                        bitmapUpdateListener.onBitmapReady(bitmap);
                        bitmapUpdateListener.onImageLoadEvent(2);
                        bitmapUpdateListener.onImageLoadEvent(3);
                        dataSource.close();
                    }
                }
            } finally {
                dataSource.close();
            }
        }
    }
}
