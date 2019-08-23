package com.facebook.react.uimanager;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import javax.annotation.Nullable;

public interface ReactShadowNode<T extends ReactShadowNode> {
    void addChildAt(T t, int i);

    void addNativeChildAt(T t, int i);

    void calculateLayout();

    void dirty();

    boolean dispatchUpdates(float f2, float f3, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    void dispose();

    T getChildAt(int i);

    int getChildCount();

    String getHierarchyInfo();

    YogaDirection getLayoutDirection();

    float getLayoutHeight();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    int getNativeOffsetForChild(T t);

    @Nullable
    T getNativeParent();

    @Nullable
    ReactStylesDiffMap getNewProps();

    float getPadding(int i);

    @Nullable
    T getParent();

    int getReactTag();

    T getRootNode();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    YogaValue getStyleHeight();

    YogaValue getStylePadding(int i);

    YogaValue getStyleWidth();

    ThemedReactContext getThemedContext();

    int getTotalNativeChildren();

    String getViewClass();

    boolean hasNewLayout();

    boolean hasUnseenUpdates();

    boolean hasUpdates();

    int indexOf(T t);

    int indexOfNativeChild(T t);

    boolean isDescendantOf(T t);

    boolean isDirty();

    boolean isLayoutOnly();

    boolean isMeasureDefined();

    boolean isVirtual();

    boolean isVirtualAnchor();

    boolean isYogaLeafNode();

    void markLayoutSeen();

    void markUpdateSeen();

    void markUpdated();

    T mutableCopy();

    T mutableCopyWithNewChildren();

    T mutableCopyWithNewChildrenAndProps(@Nullable ReactStylesDiffMap reactStylesDiffMap);

    T mutableCopyWithNewProps(@Nullable ReactStylesDiffMap reactStylesDiffMap);

    void onAfterUpdateTransaction();

    void onBeforeLayout();

    void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i);

    T removeNativeChildAt(int i);

    void setAlignContent(YogaAlign yogaAlign);

    void setAlignItems(YogaAlign yogaAlign);

    void setAlignSelf(YogaAlign yogaAlign);

    void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction);

    void setBorder(int i, float f2);

    void setDefaultPadding(int i, float f2);

    void setDisplay(YogaDisplay yogaDisplay);

    void setFlex(float f2);

    void setFlexBasis(float f2);

    void setFlexBasisAuto();

    void setFlexBasisPercent(float f2);

    void setFlexDirection(YogaFlexDirection yogaFlexDirection);

    void setFlexGrow(float f2);

    void setFlexShrink(float f2);

    void setFlexWrap(YogaWrap yogaWrap);

    void setIsLayoutOnly(boolean z);

    void setJustifyContent(YogaJustify yogaJustify);

    void setLayoutDirection(YogaDirection yogaDirection);

    void setLocalData(Object obj);

    void setMargin(int i, float f2);

    void setMarginAuto(int i);

    void setMarginPercent(int i, float f2);

    void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction);

    void setOverflow(YogaOverflow yogaOverflow);

    void setPadding(int i, float f2);

    void setPaddingPercent(int i, float f2);

    void setPosition(int i, float f2);

    void setPositionPercent(int i, float f2);

    void setPositionType(YogaPositionType yogaPositionType);

    void setReactTag(int i);

    void setRootNode(T t);

    void setShouldNotifyOnLayout(boolean z);

    void setStyleAspectRatio(float f2);

    void setStyleHeight(float f2);

    void setStyleHeightAuto();

    void setStyleHeightPercent(float f2);

    void setStyleMaxHeight(float f2);

    void setStyleMaxHeightPercent(float f2);

    void setStyleMaxWidth(float f2);

    void setStyleMaxWidthPercent(float f2);

    void setStyleMinHeight(float f2);

    void setStyleMinHeightPercent(float f2);

    void setStyleMinWidth(float f2);

    void setStyleMinWidthPercent(float f2);

    void setStyleWidth(float f2);

    void setStyleWidthAuto();

    void setStyleWidthPercent(float f2);

    void setThemedContext(ThemedReactContext themedReactContext);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(ReactStylesDiffMap reactStylesDiffMap);
}
