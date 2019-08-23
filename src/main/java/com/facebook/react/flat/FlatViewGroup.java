package com.facebook.react.flat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.image.ImageLoadEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.annotation.Nullable;

public final class FlatViewGroup extends ViewGroup implements FlatMeasuredViewGroup, ReactHitSlopView, ReactInterceptingViewGroup, ReactClippingViewGroup, ReactCompoundViewGroup, ReactPointerEventsView {
    private static final SparseArray<View> EMPTY_DETACHED_VIEWS = new SparseArray<>(0);
    private static final ArrayList<FlatViewGroup> LAYOUT_REQUESTS = new ArrayList<>();
    private static final Rect VIEW_BOUNDS = new Rect();
    private static Paint sDebugCornerPaint;
    private static Rect sDebugRect;
    private static Paint sDebugRectPaint;
    private static Paint sDebugTextBackgroundPaint;
    private static Paint sDebugTextPaint;
    private boolean mAndroidDebugDraw;
    private AttachDetachListener[] mAttachDetachListeners = AttachDetachListener.EMPTY_ARRAY;
    private int mDrawChildIndex;
    @Nullable
    private DrawCommandManager mDrawCommandManager;
    private DrawCommand[] mDrawCommands = DrawCommand.EMPTY_ARRAY;
    @Nullable
    private Rect mHitSlopRect;
    private Drawable mHotspot;
    @Nullable
    private InvalidateCallback mInvalidateCallback;
    private boolean mIsAttached;
    private boolean mIsLayoutRequested;
    private long mLastTouchDownTime;
    private boolean mNeedsOffscreenAlphaCompositing;
    private NodeRegion[] mNodeRegions = NodeRegion.EMPTY_ARRAY;
    @Nullable
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;
    private PointerEvents mPointerEvents = PointerEvents.AUTO;

    static final class InvalidateCallback extends WeakReference<FlatViewGroup> {
        public final void invalidate() {
            FlatViewGroup flatViewGroup = (FlatViewGroup) get();
            if (flatViewGroup != null) {
                flatViewGroup.invalidate();
            }
        }

        private InvalidateCallback(FlatViewGroup flatViewGroup) {
            super(flatViewGroup);
        }

        public final void dispatchImageLoadEvent(int i, int i2) {
            FlatViewGroup flatViewGroup = (FlatViewGroup) get();
            if (flatViewGroup != null) {
                ((UIManagerModule) ((ReactContext) flatViewGroup.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ImageLoadEvent(i, i2));
            }
        }
    }

    private static int sign(float f2) {
        return f2 >= 0.0f ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void detachAllViewsFromParent() {
        super.detachAllViewsFromParent();
    }

    @Nullable
    public final Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public final PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    public final boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    public final boolean getRemoveClippedSubviews() {
        if (this.mDrawCommandManager != null) {
            return true;
        }
        return false;
    }

    public final void removeAllViewsInLayout() {
        this.mDrawCommands = DrawCommand.EMPTY_ARRAY;
        super.removeAllViewsInLayout();
    }

    private InvalidateCallback getInvalidateCallback() {
        if (this.mInvalidateCallback == null) {
            this.mInvalidateCallback = new InvalidateCallback();
        }
        return this.mInvalidateCallback;
    }

    /* access modifiers changed from: package-private */
    public final SparseArray<View> getDetachedViews() {
        if (this.mDrawCommandManager == null) {
            return EMPTY_DETACHED_VIEWS;
        }
        return this.mDrawCommandManager.getDetachedViews();
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.mHotspot != null) {
            this.mHotspot.jumpToCurrentState();
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        if (!this.mIsLayoutRequested) {
            this.mIsLayoutRequested = true;
            LAYOUT_REQUESTS.add(this);
        }
    }

    static void processLayoutRequests() {
        int size = LAYOUT_REQUESTS.size();
        for (int i = 0; i != size; i++) {
            LAYOUT_REQUESTS.get(i).processLayoutRequest();
        }
        LAYOUT_REQUESTS.clear();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mHotspot != null && this.mHotspot.isStateful()) {
            this.mHotspot.setState(getDrawableState());
        }
    }

    public final void invalidate() {
        invalidate(0, 0, getWidth() + 1, getHeight() + 1);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        if (!this.mIsAttached) {
            this.mIsAttached = true;
            super.onAttachedToWindow();
            dispatchOnAttached(this.mAttachDetachListeners);
            updateClippingRect();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.mIsAttached) {
            this.mIsAttached = false;
            super.onDetachedFromWindow();
            dispatchOnDetached(this.mAttachDetachListeners);
            return;
        }
        throw new RuntimeException("Double detach");
    }

    public final void updateClippingRect() {
        if (this.mDrawCommandManager != null && this.mDrawCommandManager.updateClippingRect()) {
            invalidate();
        }
    }

    private void processLayoutRequest() {
        this.mIsLayoutRequested = false;
        int childCount = getChildCount();
        for (int i = 0; i != childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
        }
    }

    private void initDebugDrawResources() {
        if (sDebugTextPaint == null) {
            Paint paint = new Paint();
            sDebugTextPaint = paint;
            paint.setTextAlign(Paint.Align.RIGHT);
            sDebugTextPaint.setTextSize((float) dipsToPixels(9));
            sDebugTextPaint.setTypeface(Typeface.MONOSPACE);
            sDebugTextPaint.setAntiAlias(true);
            sDebugTextPaint.setColor(-65536);
        }
        if (sDebugTextBackgroundPaint == null) {
            Paint paint2 = new Paint();
            sDebugTextBackgroundPaint = paint2;
            paint2.setColor(-1);
            sDebugTextBackgroundPaint.setAlpha(200);
            sDebugTextBackgroundPaint.setStyle(Paint.Style.FILL);
        }
        if (sDebugRectPaint == null) {
            Paint paint3 = new Paint();
            sDebugRectPaint = paint3;
            paint3.setAlpha(100);
            sDebugRectPaint.setStyle(Paint.Style.STROKE);
        }
        if (sDebugCornerPaint == null) {
            Paint paint4 = new Paint();
            sDebugCornerPaint = paint4;
            paint4.setAlpha(200);
            sDebugCornerPaint.setColor(Color.rgb(63, 127, 255));
            sDebugCornerPaint.setStyle(Paint.Style.FILL);
        }
        if (sDebugRect == null) {
            sDebugRect = new Rect();
        }
    }

    public final Rect measureWithCommands() {
        int childCount = getChildCount();
        if (childCount == 0 && this.mDrawCommands.length == 0) {
            return new Rect(0, 0, 0, 0);
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            i = Math.min(i, childAt.getLeft());
            i2 = Math.min(i2, childAt.getTop());
            i3 = Math.max(i3, childAt.getRight());
            i4 = Math.max(i4, childAt.getBottom());
        }
        for (DrawCommand drawCommand : this.mDrawCommands) {
            if (drawCommand instanceof AbstractDrawCommand) {
                AbstractDrawCommand abstractDrawCommand = (AbstractDrawCommand) drawCommand;
                i = Math.min(i, Math.round(abstractDrawCommand.getLeft()));
                i2 = Math.min(i2, Math.round(abstractDrawCommand.getTop()));
                i3 = Math.max(i3, Math.round(abstractDrawCommand.getRight()));
                i4 = Math.max(i4, Math.round(abstractDrawCommand.getBottom()));
            }
        }
        return new Rect(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public final void mountNodeRegions(NodeRegion[] nodeRegionArr) {
        this.mNodeRegions = nodeRegionArr;
    }

    /* access modifiers changed from: protected */
    public final void onDebugDraw(Canvas canvas) {
        this.mAndroidDebugDraw = true;
    }

    /* access modifiers changed from: package-private */
    public final void setHitSlopRect(@Nullable Rect rect) {
        this.mHitSlopRect = rect;
    }

    /* access modifiers changed from: package-private */
    public final void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    public final void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    /* access modifiers changed from: package-private */
    public final void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    /* access modifiers changed from: package-private */
    public final void mountDrawCommands(DrawCommand[] drawCommandArr) {
        this.mDrawCommands = drawCommandArr;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void removeDetachedView(View view) {
        removeDetachedView(view, false);
    }

    private static void dispatchOnDetached(AttachDetachListener[] attachDetachListenerArr) {
        for (AttachDetachListener onDetached : attachDetachListenerArr) {
            onDetached.onDetached();
        }
    }

    private ViewGroup.LayoutParams ensureLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (checkLayoutParams(layoutParams)) {
            return layoutParams;
        }
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: package-private */
    public final void addViewInLayout(View view) {
        addViewInLayout(view, -1, ensureLayoutParams(view.getLayoutParams()), true);
    }

    /* access modifiers changed from: package-private */
    public final void attachViewToParent(View view) {
        attachViewToParent(view, -1, ensureLayoutParams(view.getLayoutParams()));
    }

    /* access modifiers changed from: package-private */
    public final void mountAttachDetachListeners(AttachDetachListener[] attachDetachListenerArr) {
        if (this.mIsAttached) {
            dispatchOnAttached(attachDetachListenerArr);
            dispatchOnDetached(this.mAttachDetachListeners);
        }
        this.mAttachDetachListeners = attachDetachListenerArr;
    }

    /* access modifiers changed from: package-private */
    public final void onViewDropped(View view) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.onClippedViewDropped(view);
        }
    }

    FlatViewGroup(Context context) {
        super(context);
        setClipChildren(false);
    }

    private void debugDraw(Canvas canvas) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.debugDraw(canvas);
        } else {
            for (DrawCommand debugDraw : this.mDrawCommands) {
                debugDraw.debugDraw(this, canvas);
            }
        }
        this.mDrawChildIndex = 0;
    }

    private void dispatchOnAttached(AttachDetachListener[] attachDetachListenerArr) {
        if (attachDetachListenerArr.length != 0) {
            InvalidateCallback invalidateCallback = getInvalidateCallback();
            for (AttachDetachListener onAttached : attachDetachListenerArr) {
                onAttached.onAttached(invalidateCallback);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int dipsToPixels(int i) {
        return (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void getClippingRect(Rect rect) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.getClippingRect(rect);
            return;
        }
        throw new RuntimeException("Trying to get the clipping rect for a non-clipping FlatViewGroup");
    }

    /* access modifiers changed from: package-private */
    public final NodeRegion getNodeRegionForTag(int i) {
        for (NodeRegion nodeRegion : this.mNodeRegions) {
            if (nodeRegion.matchesTag(i)) {
                return nodeRegion;
            }
        }
        return NodeRegion.EMPTY;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mPointerEvents == PointerEvents.NONE) {
            return false;
        }
        if (this.mPointerEvents == PointerEvents.BOX_NONE && virtualNodeRegionWithinBounds(motionEvent.getX(), motionEvent.getY()) == null) {
            return false;
        }
        return true;
    }

    public final void setRemoveClippedSubviews(boolean z) {
        boolean removeClippedSubviews = getRemoveClippedSubviews();
        if (z != removeClippedSubviews) {
            if (!removeClippedSubviews) {
                this.mDrawCommandManager = DrawCommandManager.getVerticalClippingInstance(this, this.mDrawCommands);
                this.mDrawCommands = DrawCommand.EMPTY_ARRAY;
                return;
            }
            throw new RuntimeException("Trying to transition FlatViewGroup from clipping to non-clipping state");
        }
    }

    private static void ensureViewHasNoParent(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            throw new RuntimeException("Cannot add view " + view + " to FlatViewGroup while it has a parent " + parent);
        }
    }

    /* access modifiers changed from: package-private */
    public final void debugDrawNextChild(Canvas canvas) {
        int i;
        View childAt = getChildAt(this.mDrawChildIndex);
        if (childAt instanceof FlatViewGroup) {
            i = -12303292;
        } else {
            i = -65536;
        }
        debugDrawRect(canvas, i, (float) childAt.getLeft(), (float) childAt.getTop(), (float) childAt.getRight(), (float) childAt.getBottom());
        this.mDrawChildIndex++;
    }

    /* access modifiers changed from: package-private */
    public final void drawNextChild(Canvas canvas) {
        View childAt = getChildAt(this.mDrawChildIndex);
        if (childAt instanceof FlatViewGroup) {
            super.drawChild(canvas, childAt, getDrawingTime());
        } else {
            canvas.save(2);
            childAt.getHitRect(VIEW_BOUNDS);
            canvas.clipRect(VIEW_BOUNDS);
            super.drawChild(canvas, childAt, getDrawingTime());
            canvas.restore();
        }
        this.mDrawChildIndex++;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        long downTime = motionEvent.getDownTime();
        if (downTime != this.mLastTouchDownTime) {
            this.mLastTouchDownTime = downTime;
            if (interceptsTouchEvent(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        if ((this.mOnInterceptTouchEventListener != null && this.mOnInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent)) || this.mPointerEvents == PointerEvents.NONE || this.mPointerEvents == PointerEvents.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public final void setHotspot(Drawable drawable) {
        if (this.mHotspot != null) {
            this.mHotspot.setCallback(null);
            unscheduleDrawable(this.mHotspot);
        }
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        this.mHotspot = drawable;
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        this.mAndroidDebugDraw = false;
        super.dispatchDraw(canvas);
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.draw(canvas);
        } else {
            for (DrawCommand draw : this.mDrawCommands) {
                draw.draw(this, canvas);
            }
        }
        if (this.mDrawChildIndex == getChildCount()) {
            this.mDrawChildIndex = 0;
            if (this.mAndroidDebugDraw) {
                initDebugDrawResources();
                debugDraw(canvas);
            }
            if (this.mHotspot != null) {
                this.mHotspot.draw(canvas);
                return;
            }
            return;
        }
        throw new RuntimeException("Did not draw all children: " + this.mDrawChildIndex + " / " + getChildCount());
    }

    public final void dispatchDrawableHotspotChanged(float f2, float f3) {
        if (this.mHotspot != null) {
            this.mHotspot.setHotspot(f2, f3);
            invalidate();
        }
    }

    public final boolean interceptsTouchEvent(float f2, float f3) {
        NodeRegion anyNodeRegionWithinBounds = anyNodeRegionWithinBounds(f2, f3);
        if (anyNodeRegionWithinBounds == null || !anyNodeRegionWithinBounds.mIsVirtual) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void addViewInLayout(View view, int i) {
        addViewInLayout(view, i, ensureLayoutParams(view.getLayoutParams()), true);
    }

    /* access modifiers changed from: package-private */
    public final void attachViewToParent(View view, int i) {
        attachViewToParent(view, i, ensureLayoutParams(view.getLayoutParams()));
    }

    @Nullable
    private NodeRegion anyNodeRegionWithinBounds(float f2, float f3) {
        if (this.mDrawCommandManager != null) {
            return this.mDrawCommandManager.anyNodeRegionWithinBounds(f2, f3);
        }
        for (int length = this.mNodeRegions.length - 1; length >= 0; length--) {
            NodeRegion nodeRegion = this.mNodeRegions[length];
            if (nodeRegion.withinBounds(f2, f3)) {
                return nodeRegion;
            }
        }
        return null;
    }

    @Nullable
    private NodeRegion virtualNodeRegionWithinBounds(float f2, float f3) {
        if (this.mDrawCommandManager != null) {
            return this.mDrawCommandManager.virtualNodeRegionWithinBounds(f2, f3);
        }
        for (int length = this.mNodeRegions.length - 1; length >= 0; length--) {
            NodeRegion nodeRegion = this.mNodeRegions[length];
            if (nodeRegion.mIsVirtual && nodeRegion.withinBounds(f2, f3)) {
                return nodeRegion;
            }
        }
        return null;
    }

    public final int reactTagForTouch(float f2, float f3) {
        boolean z;
        if (this.mPointerEvents != PointerEvents.NONE) {
            z = true;
        } else {
            z = false;
        }
        SoftAssertions.assertCondition(z, "TouchTargetHelper should not allow calling this method when pointer events are NONE");
        if (this.mPointerEvents != PointerEvents.BOX_ONLY) {
            NodeRegion virtualNodeRegionWithinBounds = virtualNodeRegionWithinBounds(f2, f3);
            if (virtualNodeRegionWithinBounds != null) {
                return virtualNodeRegionWithinBounds.getReactTag(f2, f3);
            }
        }
        return getId();
    }

    /* access modifiers changed from: package-private */
    public final void mountClippingNodeRegions(NodeRegion[] nodeRegionArr, float[] fArr, float[] fArr2) {
        this.mNodeRegions = nodeRegionArr;
        ((DrawCommandManager) a.b(this.mDrawCommandManager)).mountNodeRegions(nodeRegionArr, fArr, fArr2);
    }

    /* access modifiers changed from: package-private */
    public final void mountViews(ViewResolver viewResolver, int[] iArr, int[] iArr2) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.mountViews(viewResolver, iArr, iArr2);
        } else {
            for (int i : iArr) {
                if (i > 0) {
                    View view = viewResolver.getView(i);
                    ensureViewHasNoParent(view);
                    addViewInLayout(view);
                } else {
                    View view2 = viewResolver.getView(-i);
                    ensureViewHasNoParent(view2);
                    attachViewToParent(view2);
                }
            }
            int length = iArr2.length;
            int i2 = 0;
            while (i2 < length) {
                View view3 = viewResolver.getView(iArr2[i2]);
                if (view3.getParent() == null) {
                    removeDetachedView(view3, false);
                    i2++;
                } else {
                    throw new RuntimeException("Trying to remove view not owned by FlatViewGroup");
                }
            }
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.mHotspot != null) {
            this.mHotspot.setBounds(0, 0, i, i2);
            invalidate();
        }
        updateClippingRect();
    }

    /* access modifiers changed from: package-private */
    public final void mountClippingDrawCommands(DrawCommand[] drawCommandArr, SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, boolean z) {
        ((DrawCommandManager) a.b(this.mDrawCommandManager)).mountDrawCommands(drawCommandArr, sparseIntArray, fArr, fArr2, z);
        invalidate();
    }

    private void debugDrawRect(Canvas canvas, int i, float f2, float f3, float f4, float f5) {
        debugDrawNamedRect(canvas, i, "", f2, f3, f4, f5);
    }

    private static void fillRect(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        if (f2 != f4 && f3 != f5) {
            if (f2 > f4) {
                f6 = f2;
                f7 = f4;
            } else {
                f7 = f2;
                f6 = f4;
            }
            if (f3 > f5) {
                f8 = f3;
                f9 = f5;
            } else {
                f9 = f3;
                f8 = f5;
            }
            canvas.drawRect(f7, f9, f6, f8, paint);
        }
    }

    private static void drawCorner(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5, float f6) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        float f7 = f2;
        float f8 = f3;
        fillRect(canvas2, paint2, f7, f8, f2 + f4, f3 + (((float) sign(f5)) * f6));
        fillRect(canvas2, paint2, f7, f8, f2 + (f6 * ((float) sign(f4))), f3 + f5);
    }

    /* access modifiers changed from: package-private */
    public final void debugDrawNamedRect(Canvas canvas, int i, String str, float f2, float f3, float f4, float f5) {
        Paint paint = sDebugRectPaint;
        paint.setColor((paint.getColor() & -16777216) | (16777215 & i));
        sDebugRectPaint.setAlpha(100);
        canvas.drawRect(f2, f3, f4 - 1.0f, f5 - 1.0f, sDebugRectPaint);
        drawRectCorners(canvas, f2, f3, f4, f5, sDebugCornerPaint, dipsToPixels(8), dipsToPixels(1));
    }

    private static void drawRectCorners(Canvas canvas, float f2, float f3, float f4, float f5, Paint paint, int i, int i2) {
        float f6 = (float) i;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        float f7 = f2;
        float f8 = f6;
        float f9 = (float) i2;
        drawCorner(canvas2, paint2, f7, f3, f8, f6, f9);
        float f10 = (float) (-i);
        drawCorner(canvas2, paint2, f7, f5, f8, f10, f9);
        float f11 = f4;
        float f12 = f10;
        drawCorner(canvas2, paint2, f11, f3, f12, f6, f9);
        drawCorner(canvas2, paint2, f11, f5, f12, f10, f9);
    }
}
