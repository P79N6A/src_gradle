package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.b.a;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.a;
import com.facebook.drawee.components.b;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public abstract class AbstractDraweeController<T, INFO> implements a.C0260a, a.C0261a, DraweeController {
    private static final Class<?> TAG = AbstractDraweeController.class;
    private Object mCallerContext;
    @Nullable
    private String mContentDescription;
    @Nullable
    private ControllerListener<INFO> mControllerListener;
    @Nullable
    private Drawable mControllerOverlay;
    @Nullable
    private b mControllerViewportVisibilityListener;
    @Nullable
    private DataSource<T> mDataSource;
    private final com.facebook.drawee.components.a mDeferredReleaser;
    @Nullable
    private Drawable mDrawable;
    private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();
    @Nullable
    private T mFetchedImage;
    @Nullable
    private com.facebook.drawee.b.a mGestureDetector;
    private boolean mHasFetchFailed;
    private String mId;
    private boolean mIsAttached;
    private boolean mIsRequestSubmitted;
    private boolean mIsVisibleInViewportHint;
    private boolean mJustConstructed = true;
    private boolean mRetainImageOnFailure;
    @Nullable
    private b mRetryManager;
    @Nullable
    private SettableDraweeHierarchy mSettableDraweeHierarchy;
    private final Executor mUiThreadImmediateExecutor;

    static class a<INFO> extends c<INFO> {
        a() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract Drawable createDrawable(T t);

    /* access modifiers changed from: protected */
    public T getCachedImage() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract DataSource<T> getDataSource();

    /* access modifiers changed from: protected */
    @Nullable
    public abstract INFO getImageInfo(T t);

    /* access modifiers changed from: protected */
    public void onImageLoadedFromCacheImmediately(String str, T t) {
    }

    /* access modifiers changed from: protected */
    public abstract void releaseDrawable(@Nullable Drawable drawable);

    /* access modifiers changed from: protected */
    public abstract void releaseImage(@Nullable T t);

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    @Nullable
    public String getContentDescription() {
        return this.mContentDescription;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public Drawable getControllerOverlay() {
        return this.mControllerOverlay;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public com.facebook.drawee.b.a getGestureDetector() {
        return this.mGestureDetector;
    }

    @Nullable
    public DraweeHierarchy getHierarchy() {
        return this.mSettableDraweeHierarchy;
    }

    public String getId() {
        return this.mId;
    }

    public boolean isAttached() {
        return this.mIsAttached;
    }

    public boolean isFetchFailed() {
        return this.mHasFetchFailed;
    }

    /* access modifiers changed from: protected */
    public boolean shouldHandleGesture() {
        return shouldRetryOnTap();
    }

    @Nullable
    public Animatable getAnimatable() {
        if (this.mDrawable instanceof Animatable) {
            return (Animatable) this.mDrawable;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public ControllerListener<INFO> getControllerListener() {
        if (this.mControllerListener == null) {
            return BaseControllerListener.getNoOpListener();
        }
        return this.mControllerListener;
    }

    /* access modifiers changed from: protected */
    @ReturnsOwnership
    public b getRetryManager() {
        if (this.mRetryManager == null) {
            this.mRetryManager = new b();
        }
        return this.mRetryManager;
    }

    private boolean shouldRetryOnTap() {
        boolean z;
        if (this.mHasFetchFailed && this.mRetryManager != null) {
            b bVar = this.mRetryManager;
            if (!bVar.f23685a || bVar.f23687c >= bVar.f23686b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean onClick() {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: onClick", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId);
        }
        if (!shouldRetryOnTap()) {
            return false;
        }
        this.mRetryManager.f23687c++;
        this.mSettableDraweeHierarchy.reset();
        submitRequest();
        return true;
    }

    public void release() {
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_RELEASE_CONTROLLER);
        if (this.mRetryManager != null) {
            this.mRetryManager.b();
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector.b();
        }
        if (this.mSettableDraweeHierarchy != null) {
            this.mSettableDraweeHierarchy.reset();
        }
        releaseFetch();
    }

    public String toString() {
        return Objects.toStringHelper((Object) this).add("isAttached", this.mIsAttached).add("isRequestSubmitted", this.mIsRequestSubmitted).add("hasFetchFailed", this.mHasFetchFailed).add("fetchedImage", getImageHash(this.mFetchedImage)).add("events", (Object) this.mEventTracker.toString()).toString();
    }

    private void releaseFetch() {
        boolean z = this.mIsRequestSubmitted;
        this.mIsRequestSubmitted = false;
        this.mHasFetchFailed = false;
        if (this.mDataSource != null) {
            this.mDataSource.close();
            this.mDataSource = null;
        }
        if (this.mDrawable != null) {
            releaseDrawable(this.mDrawable);
        }
        if (this.mContentDescription != null) {
            this.mContentDescription = null;
        }
        this.mDrawable = null;
        if (this.mFetchedImage != null) {
            logMessageAndImage("release", this.mFetchedImage);
            releaseImage(this.mFetchedImage);
            this.mFetchedImage = null;
        }
        if (z) {
            getControllerListener().onRelease(this.mId);
        }
    }

    public void onAttach() {
        String str;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#onAttach");
        }
        if (FLog.isLoggable(2)) {
            Class<?> cls = TAG;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.mId;
            if (this.mIsRequestSubmitted) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            FLog.v(cls, "controller %x %s: onAttach: %s", (Object) valueOf, (Object) str2, (Object) str);
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_ATTACH_CONTROLLER);
        Preconditions.checkNotNull(this.mSettableDraweeHierarchy);
        this.mDeferredReleaser.a(this);
        this.mIsAttached = true;
        if (!this.mIsRequestSubmitted) {
            submitRequest();
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    public void onDetach() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#onDetach");
        }
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: onDetach", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId);
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_DETACH_CONTROLLER);
        this.mIsAttached = false;
        com.facebook.drawee.components.a aVar = this.mDeferredReleaser;
        com.facebook.drawee.components.a.b();
        if (aVar.f23681a.add(this) && aVar.f23681a.size() == 1) {
            aVar.f23682b.post(aVar.f23683c);
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    /* access modifiers changed from: protected */
    public void submitRequest() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#submitRequest");
        }
        Object cachedImage = getCachedImage();
        if (cachedImage != null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#submitRequest->cache");
            }
            this.mDataSource = null;
            this.mIsRequestSubmitted = true;
            this.mHasFetchFailed = false;
            this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_SUBMIT_CACHE_HIT);
            getControllerListener().onSubmit(this.mId, this.mCallerContext);
            onImageLoadedFromCacheImmediately(this.mId, cachedImage);
            onNewResultInternal(this.mId, this.mDataSource, cachedImage, 1.0f, true, true, true);
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            return;
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_DATASOURCE_SUBMIT);
        getControllerListener().onSubmit(this.mId, this.mCallerContext);
        this.mSettableDraweeHierarchy.setProgress(0.0f, true);
        this.mIsRequestSubmitted = true;
        this.mHasFetchFailed = false;
        this.mDataSource = getDataSource();
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: submitRequest: dataSource: %x", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) Integer.valueOf(System.identityHashCode(this.mDataSource)));
        }
        final String str = this.mId;
        final boolean hasResult = this.mDataSource.hasResult();
        this.mDataSource.subscribe(new BaseDataSubscriber<T>() {
            public final void onFailureImpl(DataSource<T> dataSource) {
                AbstractDraweeController.this.onFailureInternal(str, dataSource, dataSource.getFailureCause(), true);
            }

            public final void onProgressUpdate(DataSource<T> dataSource) {
                boolean isFinished = dataSource.isFinished();
                AbstractDraweeController.this.onProgressUpdateInternal(str, dataSource, dataSource.getProgress(), isFinished);
            }

            public final void onNewResultImpl(DataSource<T> dataSource) {
                boolean isFinished = dataSource.isFinished();
                boolean hasMultipleResults = dataSource.hasMultipleResults();
                float progress = dataSource.getProgress();
                Object result = dataSource.getResult();
                if (result != null) {
                    AbstractDraweeController.this.onNewResultInternal(str, dataSource, result, progress, isFinished, hasResult, hasMultipleResults);
                    return;
                }
                if (isFinished) {
                    AbstractDraweeController.this.onFailureInternal(str, dataSource, new NullPointerException(), true);
                }
            }
        }, this.mUiThreadImmediateExecutor);
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    public void onViewportVisibilityHint(boolean z) {
        this.mIsVisibleInViewportHint = z;
    }

    public void setContentDescription(@Nullable String str) {
        this.mContentDescription = str;
    }

    public void setControllerViewportVisibilityListener(@Nullable b bVar) {
        this.mControllerViewportVisibilityListener = bVar;
    }

    /* access modifiers changed from: protected */
    public void setRetainImageOnFailure(boolean z) {
        this.mRetainImageOnFailure = z;
    }

    /* access modifiers changed from: protected */
    public int getImageHash(@Nullable T t) {
        return System.identityHashCode(t);
    }

    /* access modifiers changed from: protected */
    public String getImageClass(@Nullable T t) {
        if (t != null) {
            return t.getClass().getSimpleName();
        }
        return "<null>";
    }

    /* access modifiers changed from: protected */
    public void setControllerOverlay(@Nullable Drawable drawable) {
        this.mControllerOverlay = drawable;
        if (this.mSettableDraweeHierarchy != null) {
            this.mSettableDraweeHierarchy.setControllerOverlay(this.mControllerOverlay);
        }
    }

    /* access modifiers changed from: protected */
    public void setGestureDetector(@Nullable com.facebook.drawee.b.a aVar) {
        this.mGestureDetector = aVar;
        if (this.mGestureDetector != null) {
            this.mGestureDetector.f23627a = this;
        }
    }

    public void removeControllerListener(ControllerListener<? super INFO> controllerListener) {
        Preconditions.checkNotNull(controllerListener);
        if (this.mControllerListener instanceof a) {
            ((a) this.mControllerListener).b(controllerListener);
            return;
        }
        if (this.mControllerListener == controllerListener) {
            this.mControllerListener = null;
        }
    }

    public void addControllerListener(ControllerListener<? super INFO> controllerListener) {
        Preconditions.checkNotNull(controllerListener);
        if (this.mControllerListener instanceof a) {
            ((a) this.mControllerListener).a(controllerListener);
        } else if (this.mControllerListener != null) {
            ControllerListener<INFO> controllerListener2 = this.mControllerListener;
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#createInternal");
            }
            a aVar = new a();
            aVar.a(controllerListener2);
            aVar.a(controllerListener);
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            this.mControllerListener = aVar;
        } else {
            this.mControllerListener = controllerListener;
        }
    }

    public void setHierarchy(@Nullable DraweeHierarchy draweeHierarchy) {
        DraweeEventTracker.a aVar;
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: setHierarchy: %s", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) draweeHierarchy);
        }
        DraweeEventTracker draweeEventTracker = this.mEventTracker;
        if (draweeHierarchy != null) {
            aVar = DraweeEventTracker.a.ON_SET_HIERARCHY;
        } else {
            aVar = DraweeEventTracker.a.ON_CLEAR_HIERARCHY;
        }
        draweeEventTracker.recordEvent(aVar);
        if (this.mIsRequestSubmitted) {
            this.mDeferredReleaser.a(this);
            release();
        }
        if (this.mSettableDraweeHierarchy != null) {
            this.mSettableDraweeHierarchy.setControllerOverlay(null);
            this.mSettableDraweeHierarchy = null;
        }
        if (draweeHierarchy != null) {
            Preconditions.checkArgument(draweeHierarchy instanceof SettableDraweeHierarchy);
            this.mSettableDraweeHierarchy = (SettableDraweeHierarchy) draweeHierarchy;
            this.mSettableDraweeHierarchy.setControllerOverlay(this.mControllerOverlay);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: onTouchEvent %s", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) motionEvent);
        }
        if (this.mGestureDetector == null) {
            return false;
        }
        if (!this.mGestureDetector.f23629c && !shouldHandleGesture()) {
            return false;
        }
        com.facebook.drawee.b.a aVar = this.mGestureDetector;
        switch (motionEvent.getAction()) {
            case 0:
                aVar.f23629c = true;
                aVar.f23630d = true;
                aVar.f23631e = motionEvent.getEventTime();
                aVar.f23632f = motionEvent.getX();
                aVar.g = motionEvent.getY();
                break;
            case 1:
                aVar.f23629c = false;
                if (Math.abs(motionEvent.getX() - aVar.f23632f) > aVar.f23628b || Math.abs(motionEvent.getY() - aVar.g) > aVar.f23628b) {
                    aVar.f23630d = false;
                }
                if (aVar.f23630d && motionEvent.getEventTime() - aVar.f23631e <= ((long) ViewConfiguration.getLongPressTimeout()) && aVar.f23627a != null) {
                    aVar.f23627a.onClick();
                    break;
                }
            case 2:
                if (Math.abs(motionEvent.getX() - aVar.f23632f) > aVar.f23628b || Math.abs(motionEvent.getY() - aVar.g) > aVar.f23628b) {
                    aVar.f23630d = false;
                    break;
                }
            case 3:
                aVar.f23629c = false;
                break;
        }
        aVar.f23630d = false;
        return true;
    }

    /* access modifiers changed from: protected */
    public void initialize(String str, Object obj) {
        init(str, obj);
        this.mJustConstructed = false;
    }

    private boolean isExpectedDataSource(String str, DataSource<T> dataSource) {
        if (dataSource == null && this.mDataSource == null) {
            return true;
        }
        if (!str.equals(this.mId) || dataSource != this.mDataSource || !this.mIsRequestSubmitted) {
            return false;
        }
        return true;
    }

    private void logMessageAndFailure(String str, Throwable th) {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: %s: failure: %s", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) str, (Object) th);
        }
    }

    private void logMessageAndImage(String str, T t) {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.mId, str, getImageClass(t), Integer.valueOf(getImageHash(t)));
        }
    }

    private synchronized void init(String str, Object obj) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#init");
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_INIT_CONTROLLER);
        if (!this.mJustConstructed && this.mDeferredReleaser != null) {
            this.mDeferredReleaser.a(this);
        }
        this.mIsAttached = false;
        this.mIsVisibleInViewportHint = false;
        releaseFetch();
        this.mRetainImageOnFailure = false;
        if (this.mRetryManager != null) {
            this.mRetryManager.a();
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector.a();
            this.mGestureDetector.f23627a = this;
        }
        if (this.mControllerListener instanceof a) {
            ((a) this.mControllerListener).a();
        } else {
            this.mControllerListener = null;
        }
        this.mControllerViewportVisibilityListener = null;
        if (this.mSettableDraweeHierarchy != null) {
            this.mSettableDraweeHierarchy.reset();
            this.mSettableDraweeHierarchy.setControllerOverlay(null);
            this.mSettableDraweeHierarchy = null;
        }
        this.mControllerOverlay = null;
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s -> %s: initialize", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) str);
        }
        this.mId = str;
        this.mCallerContext = obj;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    public AbstractDraweeController(com.facebook.drawee.components.a aVar, Executor executor, String str, Object obj) {
        this.mDeferredReleaser = aVar;
        this.mUiThreadImmediateExecutor = executor;
        init(str, obj);
    }

    public void onProgressUpdateInternal(String str, DataSource<T> dataSource, float f2, boolean z) {
        if (!isExpectedDataSource(str, dataSource)) {
            logMessageAndFailure("ignore_old_datasource @ onProgress", null);
            dataSource.close();
            return;
        }
        if (!z) {
            this.mSettableDraweeHierarchy.setProgress(f2, false);
        }
    }

    public void onFailureInternal(String str, DataSource<T> dataSource, Throwable th, boolean z) {
        DraweeEventTracker.a aVar;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#onFailureInternal");
        }
        if (!isExpectedDataSource(str, dataSource)) {
            logMessageAndFailure("ignore_old_datasource @ onFailure", th);
            dataSource.close();
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            return;
        }
        DraweeEventTracker draweeEventTracker = this.mEventTracker;
        if (z) {
            aVar = DraweeEventTracker.a.ON_DATASOURCE_FAILURE;
        } else {
            aVar = DraweeEventTracker.a.ON_DATASOURCE_FAILURE_INT;
        }
        draweeEventTracker.recordEvent(aVar);
        if (z) {
            logMessageAndFailure("final_failed @ onFailure", th);
            this.mDataSource = null;
            this.mHasFetchFailed = true;
            if (this.mRetainImageOnFailure && this.mDrawable != null) {
                this.mSettableDraweeHierarchy.setImage(this.mDrawable, 1.0f, true);
            } else if (shouldRetryOnTap()) {
                this.mSettableDraweeHierarchy.setRetry(th);
            } else {
                this.mSettableDraweeHierarchy.setFailure(th);
            }
            getControllerListener().onFailure(this.mId, th);
        } else {
            logMessageAndFailure("intermediate_failed @ onFailure", th);
            getControllerListener().onIntermediateImageFailed(this.mId, th);
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    public void onNewResultInternal(String str, DataSource<T> dataSource, @Nullable T t, float f2, boolean z, boolean z2, boolean z3) {
        DraweeEventTracker.a aVar;
        Drawable createDrawable;
        T t2;
        Drawable drawable;
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("AbstractDraweeController#onNewResultInternal");
            }
            if (!isExpectedDataSource(str, dataSource)) {
                logMessageAndImage("ignore_old_datasource @ onNewResult", t);
                releaseImage(t);
                dataSource.close();
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
                return;
            }
            DraweeEventTracker draweeEventTracker = this.mEventTracker;
            if (z) {
                aVar = DraweeEventTracker.a.ON_DATASOURCE_RESULT;
            } else {
                aVar = DraweeEventTracker.a.ON_DATASOURCE_RESULT_INT;
            }
            draweeEventTracker.recordEvent(aVar);
            try {
                createDrawable = createDrawable(t);
                t2 = this.mFetchedImage;
                drawable = this.mDrawable;
                this.mFetchedImage = t;
                this.mDrawable = createDrawable;
                if (z) {
                    logMessageAndImage("set_final_result @ onNewResult", t);
                    this.mDataSource = null;
                    this.mSettableDraweeHierarchy.setImage(createDrawable, 1.0f, z2);
                    getControllerListener().onFinalImageSet(str, getImageInfo(t), getAnimatable());
                } else if (z3) {
                    logMessageAndImage("set_temporary_result @ onNewResult", t);
                    this.mSettableDraweeHierarchy.setImage(createDrawable, 1.0f, z2);
                    getControllerListener().onFinalImageSet(str, getImageInfo(t), getAnimatable());
                } else {
                    logMessageAndImage("set_intermediate_result @ onNewResult", t);
                    this.mSettableDraweeHierarchy.setImage(createDrawable, f2, z2);
                    getControllerListener().onIntermediateImageSet(str, getImageInfo(t));
                }
                if (!(drawable == null || drawable == createDrawable)) {
                    releaseDrawable(drawable);
                }
                if (!(t2 == null || t2 == t)) {
                    logMessageAndImage("release_previous_result @ onNewResult", t2);
                    releaseImage(t2);
                }
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            } catch (Exception e2) {
                logMessageAndImage("drawable_failed @ onNewResult", t);
                releaseImage(t);
                onFailureInternal(str, dataSource, e2, z);
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            }
        } catch (Throwable th) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            throw th;
        }
    }
}
