package com.facebook.react.flat;

import android.graphics.Rect;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.OnLayoutEvent;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;

public class FlatShadowNode extends LayoutShadowNode {
    static final FlatShadowNode[] EMPTY_ARRAY = new FlatShadowNode[0];
    private static final DrawView EMPTY_DRAW_VIEW = new DrawView(0);
    private static final Rect LOGICAL_OFFSET_EMPTY = new Rect();
    private AttachDetachListener[] mAttachDetachListeners = AttachDetachListener.EMPTY_ARRAY;
    private boolean mBackingViewIsCreated;
    private float mClipBottom;
    private float mClipLeft;
    float mClipRadius;
    private float mClipRight;
    boolean mClipToBounds;
    private float mClipTop;
    @Nullable
    private DrawBackgroundColor mDrawBackground;
    private DrawCommand[] mDrawCommands = DrawCommand.EMPTY_ARRAY;
    @Nullable
    private DrawView mDrawView;
    private boolean mForceMountChildrenToView;
    private boolean mIsUpdated = true;
    private int mLayoutHeight;
    private int mLayoutWidth;
    private int mLayoutX;
    private int mLayoutY;
    private Rect mLogicalOffset = LOGICAL_OFFSET_EMPTY;
    private FlatShadowNode[] mNativeChildren = EMPTY_ARRAY;
    private int mNativeParentTag;
    private NodeRegion mNodeRegion = NodeRegion.EMPTY;
    private NodeRegion[] mNodeRegions = NodeRegion.EMPTY_ARRAY;
    private boolean mOverflowsContainer;
    private int mViewBottom;
    private int mViewLeft;
    private int mViewRight;
    private int mViewTop;

    public boolean clipsSubviews() {
        return false;
    }

    public boolean isHorizontal() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void resetUpdated() {
        this.mIsUpdated = false;
    }

    /* access modifiers changed from: package-private */
    public final void signalBackingViewIsCreated() {
        this.mBackingViewIsCreated = true;
    }

    public final boolean clipToBounds() {
        return this.mClipToBounds;
    }

    /* access modifiers changed from: package-private */
    public final AttachDetachListener[] getAttachDetachListeners() {
        return this.mAttachDetachListeners;
    }

    /* access modifiers changed from: package-private */
    public final DrawCommand[] getDrawCommands() {
        return this.mDrawCommands;
    }

    /* access modifiers changed from: package-private */
    public final FlatShadowNode[] getNativeChildren() {
        return this.mNativeChildren;
    }

    /* access modifiers changed from: package-private */
    public final int getNativeParentTag() {
        return this.mNativeParentTag;
    }

    /* access modifiers changed from: package-private */
    public final NodeRegion getNodeRegion() {
        return this.mNodeRegion;
    }

    /* access modifiers changed from: package-private */
    public final NodeRegion[] getNodeRegions() {
        return this.mNodeRegions;
    }

    public final int getScreenX() {
        return this.mViewLeft;
    }

    public final int getScreenY() {
        return this.mViewTop;
    }

    /* access modifiers changed from: package-private */
    public final int getViewBottom() {
        return this.mViewBottom;
    }

    /* access modifiers changed from: package-private */
    public final int getViewLeft() {
        return this.mViewLeft;
    }

    /* access modifiers changed from: package-private */
    public final int getViewRight() {
        return this.mViewRight;
    }

    /* access modifiers changed from: package-private */
    public final int getViewTop() {
        return this.mViewTop;
    }

    /* access modifiers changed from: package-private */
    public final boolean isBackingViewCreated() {
        return this.mBackingViewIsCreated;
    }

    /* access modifiers changed from: package-private */
    public final boolean isUpdated() {
        return this.mIsUpdated;
    }

    /* access modifiers changed from: package-private */
    public final boolean mountsToView() {
        if (this.mDrawView != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean doesDraw() {
        if (this.mDrawView == null && this.mDrawBackground == null) {
            return false;
        }
        return true;
    }

    public void markUpdated() {
        super.markUpdated();
        this.mIsUpdated = true;
        invalidate();
    }

    FlatShadowNode() {
    }

    /* access modifiers changed from: package-private */
    public final void forceMountChildrenToView() {
        if (!this.mForceMountChildrenToView) {
            this.mForceMountChildrenToView = true;
            int childCount = getChildCount();
            for (int i = 0; i != childCount; i++) {
                ReactShadowNodeImpl childAt = getChildAt(i);
                if (childAt instanceof FlatShadowNode) {
                    ((FlatShadowNode) childAt).forceMountToView();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void forceMountToView() {
        if (!isVirtual() && this.mDrawView == null) {
            this.mDrawView = EMPTY_DRAW_VIEW;
            invalidate();
            this.mNodeRegion = NodeRegion.EMPTY;
        }
    }

    public final int getScreenHeight() {
        if (mountsToView()) {
            return this.mViewBottom - this.mViewTop;
        }
        return Math.round(this.mNodeRegion.getBottom() - this.mNodeRegion.getTop());
    }

    public final int getScreenWidth() {
        if (mountsToView()) {
            return this.mViewRight - this.mViewLeft;
        }
        return Math.round(this.mNodeRegion.getRight() - this.mNodeRegion.getLeft());
    }

    /* access modifiers changed from: protected */
    public final void invalidate() {
        FlatShadowNode flatShadowNode = this;
        while (true) {
            if (flatShadowNode.mountsToView()) {
                if (!flatShadowNode.mIsUpdated) {
                    flatShadowNode.mIsUpdated = true;
                } else {
                    return;
                }
            }
            ReactShadowNodeImpl parent = flatShadowNode.getParent();
            if (parent != null) {
                flatShadowNode = (FlatShadowNode) parent;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void updateOverflowsContainer() {
        boolean z;
        int right = (int) (this.mNodeRegion.getRight() - this.mNodeRegion.getLeft());
        int bottom = (int) (this.mNodeRegion.getBottom() - this.mNodeRegion.getTop());
        float f2 = (float) right;
        float f3 = (float) bottom;
        Rect rect = null;
        if (this.mClipToBounds || bottom <= 0 || right <= 0) {
            z = false;
        } else {
            float f4 = f2;
            float f5 = f3;
            float f6 = 0.0f;
            z = false;
            float f7 = 0.0f;
            for (NodeRegion nodeRegion : this.mNodeRegions) {
                if (nodeRegion.getLeft() < f6) {
                    f6 = nodeRegion.getLeft();
                    z = true;
                }
                if (nodeRegion.getRight() > f4) {
                    f4 = nodeRegion.getRight();
                    z = true;
                }
                if (nodeRegion.getTop() < f7) {
                    f7 = nodeRegion.getTop();
                    z = true;
                }
                if (nodeRegion.getBottom() > f5) {
                    f5 = nodeRegion.getBottom();
                    z = true;
                }
            }
            if (z) {
                rect = new Rect((int) f6, (int) f7, (int) (f4 - f2), (int) (f5 - f3));
            }
        }
        if (!z && this.mNodeRegion != NodeRegion.EMPTY) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ReactShadowNodeImpl childAt = getChildAt(i);
                if (childAt instanceof FlatShadowNode) {
                    FlatShadowNode flatShadowNode = (FlatShadowNode) childAt;
                    if (flatShadowNode.mOverflowsContainer) {
                        Rect rect2 = flatShadowNode.mLogicalOffset;
                        if (rect == null) {
                            rect = new Rect();
                        }
                        rect.union(rect2);
                        z = true;
                    }
                }
            }
        }
        if (this.mOverflowsContainer != z) {
            this.mOverflowsContainer = z;
            if (rect == null) {
                rect = LOGICAL_OFFSET_EMPTY;
            }
            this.mLogicalOffset = rect;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setAttachDetachListeners(AttachDetachListener[] attachDetachListenerArr) {
        this.mAttachDetachListeners = attachDetachListenerArr;
    }

    /* access modifiers changed from: package-private */
    public final void setDrawCommands(DrawCommand[] drawCommandArr) {
        this.mDrawCommands = drawCommandArr;
    }

    /* access modifiers changed from: package-private */
    public final void setNativeChildren(FlatShadowNode[] flatShadowNodeArr) {
        this.mNativeChildren = flatShadowNodeArr;
    }

    /* access modifiers changed from: package-private */
    public final void setNativeParentTag(int i) {
        this.mNativeParentTag = i;
    }

    /* access modifiers changed from: protected */
    public final void setNodeRegion(NodeRegion nodeRegion) {
        this.mNodeRegion = nodeRegion;
        updateOverflowsContainer();
    }

    /* access modifiers changed from: package-private */
    public final void setNodeRegions(NodeRegion[] nodeRegionArr) {
        this.mNodeRegions = nodeRegionArr;
        updateOverflowsContainer();
    }

    @ReactProp(name = "backgroundColor")
    public void setBackgroundColor(int i) {
        DrawBackgroundColor drawBackgroundColor;
        if (i == 0) {
            drawBackgroundColor = null;
        } else {
            drawBackgroundColor = new DrawBackgroundColor(i);
        }
        this.mDrawBackground = drawBackgroundColor;
        invalidate();
    }

    public void setOverflow(String str) {
        super.setOverflow(str);
        this.mClipToBounds = "hidden".equals(str);
        if (this.mClipToBounds) {
            this.mOverflowsContainer = false;
            if (this.mClipRadius > 0.5f) {
                forceMountToView();
            }
        } else {
            updateOverflowsContainer();
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void handleUpdateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        if (mountsToView()) {
            return;
        }
        if (reactStylesDiffMap.hasKey("opacity") || reactStylesDiffMap.hasKey("renderToHardwareTextureAndroid") || reactStylesDiffMap.hasKey("testID") || reactStylesDiffMap.hasKey("accessibilityLabel") || reactStylesDiffMap.hasKey("accessibilityComponentType") || reactStylesDiffMap.hasKey("accessibilityLiveRegion") || reactStylesDiffMap.hasKey("transform") || reactStylesDiffMap.hasKey("importantForAccessibility") || reactStylesDiffMap.hasKey("removeClippedSubviews")) {
            forceMountToView();
        }
    }

    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        if (this.mForceMountChildrenToView && (reactShadowNodeImpl instanceof FlatShadowNode)) {
            ((FlatShadowNode) reactShadowNodeImpl).forceMountToView();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setClipBounds(float f2, float f3, float f4, float f5) {
        this.mClipLeft = f2;
        this.mClipTop = f3;
        this.mClipRight = f4;
        this.mClipBottom = f5;
    }

    /* access modifiers changed from: package-private */
    public final void setViewBounds(int i, int i2, int i3, int i4) {
        this.mViewLeft = i;
        this.mViewTop = i2;
        this.mViewRight = i3;
        this.mViewBottom = i4;
    }

    /* access modifiers changed from: package-private */
    public final boolean clipBoundsChanged(float f2, float f3, float f4, float f5) {
        if (this.mClipLeft == f2 && this.mClipTop == f3 && this.mClipRight == f4 && this.mClipBottom == f5) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final OnLayoutEvent obtainLayoutEvent(int i, int i2, int i3, int i4) {
        if (this.mLayoutX == i && this.mLayoutY == i2 && this.mLayoutWidth == i3 && this.mLayoutHeight == i4) {
            return null;
        }
        this.mLayoutX = i;
        this.mLayoutY = i2;
        this.mLayoutWidth = i3;
        this.mLayoutHeight = i4;
        return OnLayoutEvent.obtain(getReactTag(), i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public void updateNodeRegion(float f2, float f3, float f4, float f5, boolean z) {
        if (!this.mNodeRegion.matches(f2, f3, f4, f5, z)) {
            NodeRegion nodeRegion = new NodeRegion(f2, f3, f4, f5, getReactTag(), z);
            setNodeRegion(nodeRegion);
        }
    }

    /* access modifiers changed from: package-private */
    public final DrawView collectDrawView(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        if (this.mDrawView == EMPTY_DRAW_VIEW) {
            this.mDrawView = new DrawView(getReactTag());
        }
        if (this.mClipToBounds) {
            f10 = this.mClipRadius;
        } else {
            f10 = 0.0f;
        }
        this.mDrawView = this.mDrawView.collectDrawView(f2, f3, f4, f5, f2 + ((float) this.mLogicalOffset.left), f3 + ((float) this.mLogicalOffset.top), f4 + ((float) this.mLogicalOffset.right), f5 + ((float) this.mLogicalOffset.bottom), f6, f7, f8, f9, f10);
        return this.mDrawView;
    }

    /* access modifiers changed from: protected */
    public void collectState(StateBuilder stateBuilder, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (this.mDrawBackground != null) {
            this.mDrawBackground = (DrawBackgroundColor) this.mDrawBackground.updateBoundsAndFreeze(f2, f3, f4, f5, f6, f7, f8, f9);
            StateBuilder stateBuilder2 = stateBuilder;
            stateBuilder.addDrawCommand(this.mDrawBackground);
        }
    }
}
