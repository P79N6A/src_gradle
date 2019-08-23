package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CustomViewTarget<T extends View, Z> implements Target<Z> {
    @IdRes
    private static final int VIEW_TAG_ID = 2131166988;
    @Nullable
    private View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    @IdRes
    private int overrideTag;
    private final SizeDeterminer sizeDeterminer;
    protected final T view;

    @VisibleForTesting
    static final class SizeDeterminer {
        @Nullable
        @VisibleForTesting
        static Integer maxDisplayLength;
        private final List<SizeReadyCallback> cbs = new ArrayList();
        @Nullable
        private SizeDeterminerLayoutListener layoutListener;
        private final View view;
        boolean waitForLayout;

        static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<SizeDeterminer> sizeDeterminerRef;

            public final boolean onPreDraw() {
                SizeDeterminer sizeDeterminer = (SizeDeterminer) this.sizeDeterminerRef.get();
                if (sizeDeterminer != null) {
                    sizeDeterminer.checkCurrentDimens();
                }
                return true;
            }

            SizeDeterminerLayoutListener(@NonNull SizeDeterminer sizeDeterminer) {
                this.sizeDeterminerRef = new WeakReference<>(sizeDeterminer);
            }
        }

        private boolean isDimensionValid(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final void checkCurrentDimens() {
            if (!this.cbs.isEmpty()) {
                int targetWidth = getTargetWidth();
                int targetHeight = getTargetHeight();
                if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                    notifyCbs(targetWidth, targetHeight);
                    clearCallbacksAndListener();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void clearCallbacksAndListener() {
            ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.layoutListener);
            }
            this.layoutListener = null;
            this.cbs.clear();
        }

        private int getTargetHeight() {
            int i;
            int paddingTop = this.view.getPaddingTop() + this.view.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return getTargetDimen(this.view.getHeight(), i, paddingTop);
        }

        private int getTargetWidth() {
            int i;
            int paddingLeft = this.view.getPaddingLeft() + this.view.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return getTargetDimen(this.view.getWidth(), i, paddingLeft);
        }

        /* access modifiers changed from: package-private */
        public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
            this.cbs.remove(sizeReadyCallback);
        }

        SizeDeterminer(@NonNull View view2) {
            this.view = view2;
        }

        private static int getMaxDisplayLength(@NonNull Context context) {
            if (maxDisplayLength == null) {
                Display defaultDisplay = ((WindowManager) Preconditions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                maxDisplayLength = Integer.valueOf(Math.max(point.x, point.y));
            }
            return maxDisplayLength.intValue();
        }

        /* access modifiers changed from: package-private */
        public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                sizeReadyCallback.onSizeReady(targetWidth, targetHeight);
                return;
            }
            if (!this.cbs.contains(sizeReadyCallback)) {
                this.cbs.add(sizeReadyCallback);
            }
            if (this.layoutListener == null) {
                ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
                this.layoutListener = new SizeDeterminerLayoutListener(this);
                viewTreeObserver.addOnPreDrawListener(this.layoutListener);
            }
        }

        private boolean isViewStateAndSizeValid(int i, int i2) {
            if (!isDimensionValid(i) || !isDimensionValid(i2)) {
                return false;
            }
            return true;
        }

        private void notifyCbs(int i, int i2) {
            Iterator it2 = new ArrayList(this.cbs).iterator();
            while (it2.hasNext()) {
                ((SizeReadyCallback) it2.next()).onSizeReady(i, i2);
            }
        }

        private int getTargetDimen(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.waitForLayout && this.view.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return getMaxDisplayLength(this.view.getContext());
        }
    }

    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    public abstract void onResourceCleared(@Nullable Drawable drawable);

    /* access modifiers changed from: protected */
    public void onResourceLoading(@Nullable Drawable drawable) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    @NonNull
    public final T getView() {
        return this.view;
    }

    @NonNull
    public final CustomViewTarget<T, Z> waitForLayout() {
        this.sizeDeterminer.waitForLayout = true;
        return this;
    }

    @Nullable
    private Object getTag() {
        int i;
        T t = this.view;
        if (this.overrideTag == 0) {
            i = VIEW_TAG_ID;
        } else {
            i = this.overrideTag;
        }
        return t.getTag(i);
    }

    @NonNull
    public final CustomViewTarget<T, Z> clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                CustomViewTarget.this.resumeMyRequest();
            }

            public void onViewDetachedFromWindow(View view) {
                CustomViewTarget.this.pauseMyRequest();
            }
        };
        maybeAddAttachStateListener();
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void pauseMyRequest() {
        Request request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.clear();
            this.isClearedByUs = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void resumeMyRequest() {
        Request request = getRequest();
        if (request != null && request.isCleared()) {
            request.begin();
        }
    }

    private void maybeAddAttachStateListener() {
        if (this.attachStateListener != null && !this.isAttachStateListenerAdded) {
            this.view.addOnAttachStateChangeListener(this.attachStateListener);
            this.isAttachStateListenerAdded = true;
        }
    }

    private void maybeRemoveAttachStateListener() {
        if (this.attachStateListener != null && this.isAttachStateListenerAdded) {
            this.view.removeOnAttachStateChangeListener(this.attachStateListener);
            this.isAttachStateListenerAdded = false;
        }
    }

    @Nullable
    public final Request getRequest() {
        Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    public final void setRequest(@Nullable Request request) {
        setTag(request);
    }

    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.sizeDeterminer.getSize(sizeReadyCallback);
    }

    public final void onLoadStarted(@Nullable Drawable drawable) {
        maybeAddAttachStateListener();
        onResourceLoading(drawable);
    }

    public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.sizeDeterminer.removeCallback(sizeReadyCallback);
    }

    private void setTag(@Nullable Object obj) {
        int i;
        T t = this.view;
        if (this.overrideTag == 0) {
            i = VIEW_TAG_ID;
        } else {
            i = this.overrideTag;
        }
        t.setTag(i, obj);
    }

    public final void onLoadCleared(@Nullable Drawable drawable) {
        this.sizeDeterminer.clearCallbacksAndListener();
        onResourceCleared(drawable);
        if (!this.isClearedByUs) {
            maybeRemoveAttachStateListener();
        }
    }

    public final CustomViewTarget<T, Z> useTagId(@IdRes int i) {
        if (this.overrideTag == 0) {
            this.overrideTag = i;
            return this;
        }
        throw new IllegalArgumentException("You cannot change the tag id once it has been set.");
    }

    public CustomViewTarget(@NonNull T t) {
        this.view = (View) Preconditions.checkNotNull(t);
        this.sizeDeterminer = new SizeDeterminer(t);
    }
}
