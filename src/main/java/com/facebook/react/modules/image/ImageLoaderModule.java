package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nullable;

@ReactModule(name = "ImageLoader")
public class ImageLoaderModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<DataSource<Void>> mEnqueuedRequests;

    public String getName() {
        return "ImageLoader";
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                DataSource valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @ReactMethod
    public void abortRequest(int i) {
        DataSource<Void> removeRequest = removeRequest(i);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    @Nullable
    public DataSource<Void> removeRequest(int i) {
        DataSource<Void> dataSource;
        synchronized (this.mEnqueuedRequestMonitor) {
            dataSource = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return dataSource;
    }

    private void registerRequest(int i, DataSource<Void> dataSource) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, dataSource);
        }
    }

    @ReactMethod
    public void queryCache(final ReadableArray readableArray, final Promise promise) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap createMap = Arguments.createMap();
                ImagePipeline imagePipeline = Fresco.getImagePipeline();
                for (int i = 0; i < readableArray.size(); i++) {
                    String string = readableArray.getString(i);
                    Uri parse = Uri.parse(string);
                    if (imagePipeline.isInBitmapMemoryCache(parse)) {
                        createMap.putString(string, "memory");
                    } else if (imagePipeline.isInDiskCacheSync(parse)) {
                        createMap.putString(string, "disk");
                    }
                }
                promise.resolve(createMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }

    @ReactMethod
    public void getSize(String str, final Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject("E_INVALID_URI", "Cannot get the size of an image for an empty URI");
            return;
        }
        Fresco.getImagePipeline().fetchDecodedImage(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build(), this.mCallerContext).subscribe(new BaseDataSubscriber<CloseableReference<CloseableImage>>() {
            public void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                promise.reject("E_GET_SIZE_FAILURE", dataSource.getFailureCause());
            }

            public void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                if (dataSource.isFinished()) {
                    CloseableReference closeableReference = (CloseableReference) dataSource.getResult();
                    if (closeableReference != null) {
                        try {
                            CloseableImage closeableImage = (CloseableImage) closeableReference.get();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putInt("width", closeableImage.getWidth());
                            createMap.putInt("height", closeableImage.getHeight());
                            promise.resolve(createMap);
                        } catch (Exception e2) {
                            promise.reject("E_GET_SIZE_FAILURE", (Throwable) e2);
                        } catch (Throwable th) {
                            CloseableReference.closeSafely(closeableReference);
                            throw th;
                        }
                        CloseableReference.closeSafely(closeableReference);
                    } else {
                        promise.reject("E_GET_SIZE_FAILURE");
                    }
                }
            }
        }, CallerThreadExecutor.getInstance());
    }

    @ReactMethod
    public void prefetchImage(String str, final int i, final Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject("E_INVALID_URI", "Cannot prefetch an image for an empty URI");
            return;
        }
        DataSource<Void> prefetchToDiskCache = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build(), this.mCallerContext);
        AnonymousClass2 r0 = new BaseDataSubscriber<Void>() {
            public void onFailureImpl(DataSource<Void> dataSource) {
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    promise.reject("E_PREFETCH_FAILURE", dataSource.getFailureCause());
                } finally {
                    dataSource.close();
                }
            }

            public void onNewResultImpl(DataSource<Void> dataSource) {
                if (dataSource.isFinished()) {
                    try {
                        ImageLoaderModule.this.removeRequest(i);
                        promise.resolve(Boolean.TRUE);
                    } finally {
                        dataSource.close();
                    }
                }
            }
        };
        registerRequest(i, prefetchToDiskCache);
        prefetchToDiskCache.subscribe(r0, CallerThreadExecutor.getInstance());
    }
}
