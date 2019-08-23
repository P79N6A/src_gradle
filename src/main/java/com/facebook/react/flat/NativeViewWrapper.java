package com.facebook.react.flat;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
import javax.annotation.Nullable;

public final class NativeViewWrapper extends FlatShadowNode implements AndroidView {
    private boolean mForceMountGrandChildrenToView;
    private final boolean mNeedsCustomLayoutForChildren;
    private boolean mPaddingChanged;
    @Nullable
    private final ReactShadowNode mReactShadowNode;

    public final void resetPaddingChanged() {
        this.mPaddingChanged = false;
    }

    public final void setBackgroundColor(int i) {
    }

    public final boolean isPaddingChanged() {
        return this.mPaddingChanged;
    }

    public final boolean needsCustomLayoutForChildren() {
        return this.mNeedsCustomLayoutForChildren;
    }

    /* access modifiers changed from: package-private */
    public final void handleUpdateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        if (this.mReactShadowNode != null) {
            this.mReactShadowNode.updateProperties(reactStylesDiffMap);
        }
    }

    public final void setReactTag(int i) {
        super.setReactTag(i);
        if (this.mReactShadowNode != null) {
            this.mReactShadowNode.setReactTag(i);
        }
    }

    public final void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        if (this.mReactShadowNode != null) {
            this.mReactShadowNode.setThemedContext(themedReactContext);
        }
    }

    public final void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        if (this.mReactShadowNode != null && this.mReactShadowNode.hasUnseenUpdates()) {
            this.mReactShadowNode.onCollectExtraUpdates(uIViewOperationQueue);
            markUpdateSeen();
        }
    }

    NativeViewWrapper(ViewManager viewManager) {
        ReactShadowNode createShadowNodeInstance = viewManager.createShadowNodeInstance();
        if (createShadowNodeInstance instanceof YogaMeasureFunction) {
            this.mReactShadowNode = createShadowNodeInstance;
            setMeasureFunction((YogaMeasureFunction) createShadowNodeInstance);
        } else {
            this.mReactShadowNode = null;
        }
        if (viewManager instanceof ViewGroupManager) {
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            this.mNeedsCustomLayoutForChildren = viewGroupManager.needsCustomLayoutForChildren();
            this.mForceMountGrandChildrenToView = viewGroupManager.shouldPromoteGrandchildren();
        } else {
            this.mNeedsCustomLayoutForChildren = false;
        }
        forceMountToView();
        forceMountChildrenToView();
    }

    public final void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        if (this.mForceMountGrandChildrenToView && (reactShadowNodeImpl instanceof FlatShadowNode)) {
            ((FlatShadowNode) reactShadowNodeImpl).forceMountChildrenToView();
        }
    }

    public final void setPadding(int i, float f2) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.unit != YogaUnit.POINT || stylePadding.value != f2) {
            super.setPadding(i, f2);
            this.mPaddingChanged = true;
            markUpdated();
        }
    }

    public final void setPaddingPercent(int i, float f2) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.unit != YogaUnit.PERCENT || stylePadding.value != f2) {
            super.setPadding(i, f2);
            this.mPaddingChanged = true;
            markUpdated();
        }
    }
}
