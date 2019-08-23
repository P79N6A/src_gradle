package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.List;

public final class SingleRequest<R> implements Request, ResourceCallback, SizeReadyCallback, FactoryPools.Poolable {
    private static final boolean IS_VERBOSE_LOGGABLE = Log.isLoggable("Request", 2);
    private static final Pools.Pool<SingleRequest<?>> POOL = FactoryPools.simple(150, new FactoryPools.Factory<SingleRequest<?>>() {
        public SingleRequest<?> create() {
            return new SingleRequest<>();
        }
    });
    private TransitionFactory<? super R> animationFactory;
    private Context context;
    private Engine engine;
    private Drawable errorDrawable;
    private Drawable fallbackDrawable;
    private GlideContext glideContext;
    private int height;
    private boolean isCallingCallbacks;
    private Engine.LoadStatus loadStatus;
    @Nullable
    private Object model;
    private int overrideHeight;
    private int overrideWidth;
    private Drawable placeholderDrawable;
    private Priority priority;
    private RequestCoordinator requestCoordinator;
    @Nullable
    private List<RequestListener<R>> requestListeners;
    private RequestOptions requestOptions;
    private Resource<R> resource;
    private long startTime;
    private final StateVerifier stateVerifier;
    private Status status;
    @Nullable
    private final String tag;
    private Target<R> target;
    @Nullable
    private RequestListener<R> targetListener;
    private Class<R> transcodeClass;
    private int width;

    enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private void logV(String str) {
    }

    @NonNull
    public final StateVerifier getVerifier() {
        return this.stateVerifier;
    }

    public final boolean isResourceSet() {
        return isComplete();
    }

    private void assertNotCallingCallbacks() {
        if (this.isCallingCallbacks) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private void notifyLoadFailed() {
        if (this.requestCoordinator != null) {
            this.requestCoordinator.onRequestFailed(this);
        }
    }

    private void notifyLoadSuccess() {
        if (this.requestCoordinator != null) {
            this.requestCoordinator.onRequestSuccess(this);
        }
    }

    public final boolean isCleared() {
        if (this.status == Status.CLEARED) {
            return true;
        }
        return false;
    }

    public final boolean isComplete() {
        if (this.status == Status.COMPLETE) {
            return true;
        }
        return false;
    }

    public final boolean isFailed() {
        if (this.status == Status.FAILED) {
            return true;
        }
        return false;
    }

    SingleRequest() {
        String str;
        if (IS_VERBOSE_LOGGABLE) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.tag = str;
        this.stateVerifier = StateVerifier.newInstance();
    }

    private boolean canNotifyCleared() {
        if (this.requestCoordinator == null || this.requestCoordinator.canNotifyCleared(this)) {
            return true;
        }
        return false;
    }

    private boolean canNotifyStatusChanged() {
        if (this.requestCoordinator == null || this.requestCoordinator.canNotifyStatusChanged(this)) {
            return true;
        }
        return false;
    }

    private boolean canSetResource() {
        if (this.requestCoordinator == null || this.requestCoordinator.canSetImage(this)) {
            return true;
        }
        return false;
    }

    private void cancel() {
        assertNotCallingCallbacks();
        this.stateVerifier.throwIfRecycled();
        this.target.removeCallback(this);
        if (this.loadStatus != null) {
            this.loadStatus.cancel();
            this.loadStatus = null;
        }
    }

    private boolean isFirstReadyResource() {
        if (this.requestCoordinator == null || !this.requestCoordinator.isAnyResourceSet()) {
            return true;
        }
        return false;
    }

    public final boolean isRunning() {
        if (this.status == Status.RUNNING || this.status == Status.WAITING_FOR_SIZE) {
            return true;
        }
        return false;
    }

    private Drawable getErrorDrawable() {
        if (this.errorDrawable == null) {
            this.errorDrawable = this.requestOptions.getErrorPlaceholder();
            if (this.errorDrawable == null && this.requestOptions.getErrorId() > 0) {
                this.errorDrawable = loadDrawable(this.requestOptions.getErrorId());
            }
        }
        return this.errorDrawable;
    }

    private Drawable getFallbackDrawable() {
        if (this.fallbackDrawable == null) {
            this.fallbackDrawable = this.requestOptions.getFallbackDrawable();
            if (this.fallbackDrawable == null && this.requestOptions.getFallbackId() > 0) {
                this.fallbackDrawable = loadDrawable(this.requestOptions.getFallbackId());
            }
        }
        return this.fallbackDrawable;
    }

    private Drawable getPlaceholderDrawable() {
        if (this.placeholderDrawable == null) {
            this.placeholderDrawable = this.requestOptions.getPlaceholderDrawable();
            if (this.placeholderDrawable == null && this.requestOptions.getPlaceholderId() > 0) {
                this.placeholderDrawable = loadDrawable(this.requestOptions.getPlaceholderId());
            }
        }
        return this.placeholderDrawable;
    }

    private void setErrorPlaceholder() {
        if (canNotifyStatusChanged()) {
            Drawable drawable = null;
            if (this.model == null) {
                drawable = getFallbackDrawable();
            }
            if (drawable == null) {
                drawable = getErrorDrawable();
            }
            if (drawable == null) {
                drawable = getPlaceholderDrawable();
            }
            this.target.onLoadFailed(drawable);
        }
    }

    public final void clear() {
        Util.assertMainThread();
        assertNotCallingCallbacks();
        this.stateVerifier.throwIfRecycled();
        if (this.status != Status.CLEARED) {
            cancel();
            if (this.resource != null) {
                releaseResource(this.resource);
            }
            if (canNotifyCleared()) {
                this.target.onLoadCleared(getPlaceholderDrawable());
            }
            this.status = Status.CLEARED;
        }
    }

    public final void recycle() {
        assertNotCallingCallbacks();
        this.context = null;
        this.glideContext = null;
        this.model = null;
        this.transcodeClass = null;
        this.requestOptions = null;
        this.overrideWidth = -1;
        this.overrideHeight = -1;
        this.target = null;
        this.requestListeners = null;
        this.targetListener = null;
        this.requestCoordinator = null;
        this.animationFactory = null;
        this.loadStatus = null;
        this.errorDrawable = null;
        this.placeholderDrawable = null;
        this.fallbackDrawable = null;
        this.width = -1;
        this.height = -1;
        POOL.release(this);
    }

    public final void begin() {
        int i;
        assertNotCallingCallbacks();
        this.stateVerifier.throwIfRecycled();
        this.startTime = LogTime.getLogTime();
        if (this.model == null) {
            if (Util.isValidDimensions(this.overrideWidth, this.overrideHeight)) {
                this.width = this.overrideWidth;
                this.height = this.overrideHeight;
            }
            if (getFallbackDrawable() == null) {
                i = 5;
            } else {
                i = 3;
            }
            onLoadFailed(new GlideException("Received null model"), i);
        } else if (this.status == Status.RUNNING) {
            throw new IllegalArgumentException("Cannot restart a running request");
        } else if (this.status == Status.COMPLETE) {
            onResourceReady(this.resource, DataSource.MEMORY_CACHE);
        } else {
            this.status = Status.WAITING_FOR_SIZE;
            if (Util.isValidDimensions(this.overrideWidth, this.overrideHeight)) {
                onSizeReady(this.overrideWidth, this.overrideHeight);
            } else {
                this.target.getSize(this);
            }
            if ((this.status == Status.RUNNING || this.status == Status.WAITING_FOR_SIZE) && canNotifyStatusChanged()) {
                this.target.onLoadStarted(getPlaceholderDrawable());
            }
            if (IS_VERBOSE_LOGGABLE) {
                logV("finished run method in " + LogTime.getElapsedMillis(this.startTime));
            }
        }
    }

    public final void onLoadFailed(GlideException glideException) {
        onLoadFailed(glideException, 5);
    }

    private void releaseResource(Resource<?> resource2) {
        this.engine.release(resource2);
        this.resource = null;
    }

    private Drawable loadDrawable(@DrawableRes int i) {
        Resources.Theme theme;
        if (this.requestOptions.getTheme() != null) {
            theme = this.requestOptions.getTheme();
        } else {
            theme = this.context.getTheme();
        }
        return DrawableDecoderCompat.getDrawable((Context) this.glideContext, i, theme);
    }

    public final boolean isEquivalentTo(Request request) {
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        SingleRequest singleRequest = (SingleRequest) request;
        if (this.overrideWidth != singleRequest.overrideWidth || this.overrideHeight != singleRequest.overrideHeight || !Util.bothModelsNullEquivalentOrEquals(this.model, singleRequest.model) || !this.transcodeClass.equals(singleRequest.transcodeClass) || !this.requestOptions.equals(singleRequest.requestOptions) || this.priority != singleRequest.priority || !listenerCountEquals(this, singleRequest)) {
            return false;
        }
        return true;
    }

    private static int maybeApplySizeMultiplier(int i, float f2) {
        if (i == Integer.MIN_VALUE) {
            return i;
        }
        return Math.round(f2 * ((float) i));
    }

    private static boolean listenerCountEquals(SingleRequest<?> singleRequest, SingleRequest<?> singleRequest2) {
        int i;
        int i2;
        if (singleRequest.requestListeners == null) {
            i = 0;
        } else {
            i = singleRequest.requestListeners.size();
        }
        if (singleRequest2.requestListeners == null) {
            i2 = 0;
        } else {
            i2 = singleRequest2.requestListeners.size();
        }
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private void onLoadFailed(GlideException glideException, int i) {
        boolean z;
        this.stateVerifier.throwIfRecycled();
        int logLevel = this.glideContext.getLogLevel();
        if (logLevel <= i && logLevel <= 4) {
            glideException.logRootCauses("Glide");
        }
        this.loadStatus = null;
        this.status = Status.FAILED;
        boolean z2 = true;
        this.isCallingCallbacks = true;
        try {
            if (this.requestListeners != null) {
                z = false;
                for (RequestListener<R> onLoadFailed : this.requestListeners) {
                    z |= onLoadFailed.onLoadFailed(glideException, this.model, this.target, isFirstReadyResource());
                }
            } else {
                z = false;
            }
            if (this.targetListener == null || !this.targetListener.onLoadFailed(glideException, this.model, this.target, isFirstReadyResource())) {
                z2 = false;
            }
            if (!z && !z2) {
                setErrorPlaceholder();
            }
            this.isCallingCallbacks = false;
            notifyLoadFailed();
        } catch (Throwable th) {
            this.isCallingCallbacks = false;
            throw th;
        }
    }

    public final void onResourceReady(Resource<?> resource2, DataSource dataSource) {
        Object obj;
        String str;
        this.stateVerifier.throwIfRecycled();
        this.loadStatus = null;
        if (resource2 == null) {
            onLoadFailed(new GlideException("Expected to receive a Resource<R> with an object of " + this.transcodeClass + " inside, but instead got null."));
            return;
        }
        Object obj2 = resource2.get();
        if (obj2 == null || !this.transcodeClass.isAssignableFrom(obj2.getClass())) {
            releaseResource(resource2);
            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
            sb.append(this.transcodeClass);
            sb.append(" but instead got ");
            if (obj2 != null) {
                obj = obj2.getClass();
            } else {
                obj = "";
            }
            sb.append(obj);
            sb.append("{");
            sb.append(obj2);
            sb.append("} inside Resource{");
            sb.append(resource2);
            sb.append("}.");
            if (obj2 != null) {
                str = "";
            } else {
                str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            sb.append(str);
            onLoadFailed(new GlideException(sb.toString()));
        } else if (!canSetResource()) {
            releaseResource(resource2);
            this.status = Status.COMPLETE;
        } else {
            onResourceReady(resource2, obj2, dataSource);
        }
    }

    public final void onSizeReady(int i, int i2) {
        this.stateVerifier.throwIfRecycled();
        if (IS_VERBOSE_LOGGABLE) {
            logV("Got onSizeReady in " + LogTime.getElapsedMillis(this.startTime));
        }
        if (this.status == Status.WAITING_FOR_SIZE) {
            this.status = Status.RUNNING;
            float sizeMultiplier = this.requestOptions.getSizeMultiplier();
            this.width = maybeApplySizeMultiplier(i, sizeMultiplier);
            this.height = maybeApplySizeMultiplier(i2, sizeMultiplier);
            if (IS_VERBOSE_LOGGABLE) {
                logV("finished setup for calling load in " + LogTime.getElapsedMillis(this.startTime));
            }
            Engine engine2 = this.engine;
            GlideContext glideContext2 = this.glideContext;
            Engine.LoadStatus load = engine2.load(glideContext2, this.model, this.requestOptions.getSignature(), this.width, this.height, this.requestOptions.getResourceClass(), this.transcodeClass, this.priority, this.requestOptions.getDiskCacheStrategy(), this.requestOptions.getTransformations(), this.requestOptions.isTransformationRequired(), this.requestOptions.isScaleOnlyOrNoTransform(), this.requestOptions.getOptions(), this.requestOptions.isMemoryCacheable(), this.requestOptions.getUseUnlimitedSourceGeneratorsPool(), this.requestOptions.getUseAnimationPool(), this.requestOptions.getOnlyRetrieveFromCache(), this);
            this.loadStatus = load;
            if (this.status != Status.RUNNING) {
                this.loadStatus = null;
            }
            if (IS_VERBOSE_LOGGABLE) {
                logV("finished onSizeReady in " + LogTime.getElapsedMillis(this.startTime));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[Catch:{ all -> 0x0061 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onResourceReady(com.bumptech.glide.load.engine.Resource<R> r11, R r12, com.bumptech.glide.load.DataSource r13) {
        /*
            r10 = this;
            boolean r6 = r10.isFirstReadyResource()
            com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
            r10.status = r0
            r10.resource = r11
            com.bumptech.glide.GlideContext r11 = r10.glideContext
            r11.getLogLevel()
            r11 = 1
            r10.isCallingCallbacks = r11
            r7 = 0
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r10.requestListeners     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0037
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r10.requestListeners     // Catch:{ all -> 0x0061 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0061 }
            r9 = 0
        L_0x001e:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0061 }
            com.bumptech.glide.request.RequestListener r0 = (com.bumptech.glide.request.RequestListener) r0     // Catch:{ all -> 0x0061 }
            java.lang.Object r2 = r10.model     // Catch:{ all -> 0x0061 }
            com.bumptech.glide.request.target.Target<R> r3 = r10.target     // Catch:{ all -> 0x0061 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            r9 = r9 | r0
            goto L_0x001e
        L_0x0037:
            r9 = 0
        L_0x0038:
            com.bumptech.glide.request.RequestListener<R> r0 = r10.targetListener     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004c
            com.bumptech.glide.request.RequestListener<R> r0 = r10.targetListener     // Catch:{ all -> 0x0061 }
            java.lang.Object r2 = r10.model     // Catch:{ all -> 0x0061 }
            com.bumptech.glide.request.target.Target<R> r3 = r10.target     // Catch:{ all -> 0x0061 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r11 = 0
        L_0x004d:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x005b
            com.bumptech.glide.request.transition.TransitionFactory<? super R> r11 = r10.animationFactory     // Catch:{ all -> 0x0061 }
            com.bumptech.glide.request.transition.Transition r11 = r11.build(r13, r6)     // Catch:{ all -> 0x0061 }
            com.bumptech.glide.request.target.Target<R> r13 = r10.target     // Catch:{ all -> 0x0061 }
            r13.onResourceReady(r12, r11)     // Catch:{ all -> 0x0061 }
        L_0x005b:
            r10.isCallingCallbacks = r7
            r10.notifyLoadSuccess()
            return
        L_0x0061:
            r11 = move-exception
            r10.isCallingCallbacks = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.onResourceReady(com.bumptech.glide.load.engine.Resource, java.lang.Object, com.bumptech.glide.load.DataSource):void");
    }

    private void init(Context context2, GlideContext glideContext2, Object obj, Class<R> cls, RequestOptions requestOptions2, int i, int i2, Priority priority2, Target<R> target2, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator2, Engine engine2, TransitionFactory<? super R> transitionFactory) {
        this.context = context2;
        this.glideContext = glideContext2;
        this.model = obj;
        this.transcodeClass = cls;
        this.requestOptions = requestOptions2;
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.priority = priority2;
        this.target = target2;
        this.targetListener = requestListener;
        this.requestListeners = list;
        this.requestCoordinator = requestCoordinator2;
        this.engine = engine2;
        this.animationFactory = transitionFactory;
        this.status = Status.PENDING;
    }

    public static <R> SingleRequest<R> obtain(Context context2, GlideContext glideContext2, Object obj, Class<R> cls, RequestOptions requestOptions2, int i, int i2, Priority priority2, Target<R> target2, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator2, Engine engine2, TransitionFactory<? super R> transitionFactory) {
        SingleRequest<R> singleRequest = (SingleRequest) POOL.acquire();
        if (singleRequest == null) {
            singleRequest = new SingleRequest<>();
        }
        singleRequest.init(context2, glideContext2, obj, cls, requestOptions2, i, i2, priority2, target2, requestListener, list, requestCoordinator2, engine2, transitionFactory);
        return singleRequest;
    }
}
