package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import javax.annotation.Nullable;

public class DraweeHolder<DH extends DraweeHierarchy> implements VisibilityCallback {
    private DraweeController mController;
    private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();
    private DH mHierarchy;
    private boolean mIsControllerAttached;
    private boolean mIsHolderAttached;
    private boolean mIsVisible = true;

    public void registerWithContext(Context context) {
    }

    @Nullable
    public DraweeController getController() {
        return this.mController;
    }

    /* access modifiers changed from: protected */
    public DraweeEventTracker getDraweeEventTracker() {
        return this.mEventTracker;
    }

    public boolean isAttached() {
        return this.mIsHolderAttached;
    }

    public boolean hasHierarchy() {
        if (this.mHierarchy != null) {
            return true;
        }
        return false;
    }

    private void attachOrDetachController() {
        if (!this.mIsHolderAttached || !this.mIsVisible) {
            detachController();
        } else {
            attachController();
        }
    }

    public DH getHierarchy() {
        return (DraweeHierarchy) Preconditions.checkNotNull(this.mHierarchy);
    }

    public Drawable getTopLevelDrawable() {
        if (this.mHierarchy == null) {
            return null;
        }
        return this.mHierarchy.getTopLevelDrawable();
    }

    public void onAttach() {
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_HOLDER_ATTACH);
        this.mIsHolderAttached = true;
        attachOrDetachController();
    }

    public void onDetach() {
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_HOLDER_DETACH);
        this.mIsHolderAttached = false;
        attachOrDetachController();
    }

    private void detachController() {
        if (this.mIsControllerAttached) {
            this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_DETACH_CONTROLLER);
            this.mIsControllerAttached = false;
            if (isControllerValid()) {
                this.mController.onDetach();
            }
        }
    }

    public boolean isControllerValid() {
        if (this.mController == null || this.mController.getHierarchy() != this.mHierarchy) {
            return false;
        }
        return true;
    }

    private void attachController() {
        if (!this.mIsControllerAttached) {
            this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_ATTACH_CONTROLLER);
            this.mIsControllerAttached = true;
            if (!(this.mController == null || this.mController.getHierarchy() == null)) {
                this.mController.onAttach();
            }
        }
    }

    public void onDraw() {
        if (!this.mIsControllerAttached) {
            FLog.w(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.mController)), toString());
            this.mIsHolderAttached = true;
            this.mIsVisible = true;
            attachOrDetachController();
        }
    }

    public String toString() {
        return Objects.toStringHelper((Object) this).add("controllerAttached", this.mIsControllerAttached).add("holderAttached", this.mIsHolderAttached).add("drawableVisible", this.mIsVisible).add("events", (Object) this.mEventTracker.toString()).toString();
    }

    private void setVisibilityCallback(@Nullable VisibilityCallback visibilityCallback) {
        Drawable topLevelDrawable = getTopLevelDrawable();
        if (topLevelDrawable instanceof VisibilityAwareDrawable) {
            ((VisibilityAwareDrawable) topLevelDrawable).setVisibilityCallback(visibilityCallback);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isControllerValid()) {
            return false;
        }
        return this.mController.onTouchEvent(motionEvent);
    }

    public DraweeHolder(@Nullable DH dh) {
        if (dh != null) {
            setHierarchy(dh);
        }
    }

    public void onVisibilityChange(boolean z) {
        DraweeEventTracker.a aVar;
        if (this.mIsVisible != z) {
            DraweeEventTracker draweeEventTracker = this.mEventTracker;
            if (z) {
                aVar = DraweeEventTracker.a.ON_DRAWABLE_SHOW;
            } else {
                aVar = DraweeEventTracker.a.ON_DRAWABLE_HIDE;
            }
            draweeEventTracker.recordEvent(aVar);
            this.mIsVisible = z;
            attachOrDetachController();
        }
    }

    public void setController(@Nullable DraweeController draweeController) {
        boolean z = this.mIsControllerAttached;
        if (z) {
            detachController();
        }
        if (isControllerValid()) {
            this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_CLEAR_OLD_CONTROLLER);
            this.mController.setHierarchy(null);
        }
        this.mController = draweeController;
        if (this.mController != null) {
            this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_SET_CONTROLLER);
            this.mController.setHierarchy(this.mHierarchy);
        } else {
            this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            attachController();
        }
    }

    public void setHierarchy(DH dh) {
        boolean z;
        this.mEventTracker.recordEvent(DraweeEventTracker.a.ON_SET_HIERARCHY);
        boolean isControllerValid = isControllerValid();
        setVisibilityCallback(null);
        this.mHierarchy = (DraweeHierarchy) Preconditions.checkNotNull(dh);
        Drawable topLevelDrawable = this.mHierarchy.getTopLevelDrawable();
        if (topLevelDrawable == null || topLevelDrawable.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        onVisibilityChange(z);
        setVisibilityCallback(this);
        if (isControllerValid) {
            this.mController.setHierarchy(dh);
        }
    }

    public static <DH extends DraweeHierarchy> DraweeHolder<DH> create(@Nullable DH dh, Context context) {
        DraweeHolder<DH> draweeHolder = new DraweeHolder<>(dh);
        draweeHolder.registerWithContext(context);
        return draweeHolder;
    }
}
