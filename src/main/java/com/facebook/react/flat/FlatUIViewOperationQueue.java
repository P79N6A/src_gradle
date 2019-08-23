package com.facebook.react.flat;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NoSuchNativeViewException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.UIViewOperationQueue;
import java.util.ArrayList;
import javax.annotation.Nullable;

public final class FlatUIViewOperationQueue extends UIViewOperationQueue {
    public static final int[] MEASURE_BUFFER = new int[4];
    public final FlatNativeViewHierarchyManager mNativeViewHierarchyManager;
    private final ProcessLayoutRequests mProcessLayoutRequests = new ProcessLayoutRequests();

    public final class DetachAllChildrenFromViews implements UIViewOperationQueue.UIOperation {
        @Nullable
        private int[] mViewsToDetachAllChildrenFrom;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.detachAllChildrenFromViews(this.mViewsToDetachAllChildrenFrom);
        }

        public final void setViewsToDetachAllChildrenFrom(int[] iArr) {
            this.mViewsToDetachAllChildrenFrom = iArr;
        }

        public DetachAllChildrenFromViews() {
        }
    }

    final class DropViews implements UIViewOperationQueue.UIOperation {
        private final SparseIntArray mViewsToDrop;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.dropViews(this.mViewsToDrop);
        }

        private DropViews(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sparseIntArray.put(arrayList.get(i).intValue(), arrayList2.get(i).intValue());
            }
            this.mViewsToDrop = sparseIntArray;
        }
    }

    final class FindTargetForTouchOperation implements UIViewOperationQueue.UIOperation {
        private final int[] NATIVE_VIEW_BUFFER;
        private final Callback mCallback;
        private final int mReactTag;
        private final float mTargetX;
        private final float mTargetY;

        public final void execute() {
            boolean z;
            float f2;
            float f3;
            try {
                FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, FlatUIViewOperationQueue.MEASURE_BUFFER);
                float f4 = (float) FlatUIViewOperationQueue.MEASURE_BUFFER[0];
                float f5 = (float) FlatUIViewOperationQueue.MEASURE_BUFFER[1];
                int findTargetTagForTouch = TouchTargetHelper.findTargetTagForTouch(this.mTargetX, this.mTargetY, (ViewGroup) FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.getView(this.mReactTag), this.NATIVE_VIEW_BUFFER);
                try {
                    FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.NATIVE_VIEW_BUFFER[0], FlatUIViewOperationQueue.MEASURE_BUFFER);
                    NodeRegion nodeRegion = NodeRegion.EMPTY;
                    if (this.NATIVE_VIEW_BUFFER[0] == findTargetTagForTouch) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        View view = FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.getView(this.NATIVE_VIEW_BUFFER[0]);
                        if (view instanceof FlatViewGroup) {
                            nodeRegion = ((FlatViewGroup) view).getNodeRegionForTag(this.mReactTag);
                        }
                    }
                    if (nodeRegion != NodeRegion.EMPTY) {
                        findTargetTagForTouch = nodeRegion.mTag;
                    }
                    float dIPFromPixel = PixelUtil.toDIPFromPixel((nodeRegion.getLeft() + ((float) FlatUIViewOperationQueue.MEASURE_BUFFER[0])) - f4);
                    float dIPFromPixel2 = PixelUtil.toDIPFromPixel((nodeRegion.getTop() + ((float) FlatUIViewOperationQueue.MEASURE_BUFFER[1])) - f5);
                    if (z) {
                        f2 = (float) FlatUIViewOperationQueue.MEASURE_BUFFER[2];
                    } else {
                        f2 = nodeRegion.getRight() - nodeRegion.getLeft();
                    }
                    float dIPFromPixel3 = PixelUtil.toDIPFromPixel(f2);
                    if (z) {
                        f3 = (float) FlatUIViewOperationQueue.MEASURE_BUFFER[3];
                    } else {
                        f3 = nodeRegion.getBottom() - nodeRegion.getTop();
                    }
                    float dIPFromPixel4 = PixelUtil.toDIPFromPixel(f3);
                    this.mCallback.invoke(Integer.valueOf(findTargetTagForTouch), Float.valueOf(dIPFromPixel), Float.valueOf(dIPFromPixel2), Float.valueOf(dIPFromPixel3), Float.valueOf(dIPFromPixel4));
                } catch (IllegalViewOperationException unused) {
                    this.mCallback.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private FindTargetForTouchOperation(int i, float f2, float f3, Callback callback) {
            this.NATIVE_VIEW_BUFFER = new int[1];
            this.mReactTag = i;
            this.mTargetX = f2;
            this.mTargetY = f3;
            this.mCallback = callback;
        }
    }

    final class MeasureVirtualView implements UIViewOperationQueue.UIOperation {
        private final Callback mCallback;
        private final int mReactTag;
        private final boolean mRelativeToWindow;
        private final float mScaledHeight;
        private final float mScaledWidth;
        private final float mScaledX;
        private final float mScaledY;

        public final void execute() {
            try {
                if (this.mRelativeToWindow) {
                    FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.measureInWindow(this.mReactTag, FlatUIViewOperationQueue.MEASURE_BUFFER);
                } else {
                    FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, FlatUIViewOperationQueue.MEASURE_BUFFER);
                }
                float f2 = (float) FlatUIViewOperationQueue.MEASURE_BUFFER[2];
                float f3 = (float) FlatUIViewOperationQueue.MEASURE_BUFFER[3];
                float dIPFromPixel = PixelUtil.toDIPFromPixel((this.mScaledX * f2) + ((float) FlatUIViewOperationQueue.MEASURE_BUFFER[0]));
                float dIPFromPixel2 = PixelUtil.toDIPFromPixel((this.mScaledY * f3) + ((float) FlatUIViewOperationQueue.MEASURE_BUFFER[1]));
                float dIPFromPixel3 = PixelUtil.toDIPFromPixel(this.mScaledWidth * f2);
                float dIPFromPixel4 = PixelUtil.toDIPFromPixel(this.mScaledHeight * f3);
                if (this.mRelativeToWindow) {
                    this.mCallback.invoke(Float.valueOf(dIPFromPixel), Float.valueOf(dIPFromPixel2), Float.valueOf(dIPFromPixel3), Float.valueOf(dIPFromPixel4));
                    return;
                }
                this.mCallback.invoke(0, 0, Float.valueOf(dIPFromPixel3), Float.valueOf(dIPFromPixel4), Float.valueOf(dIPFromPixel), Float.valueOf(dIPFromPixel2));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private MeasureVirtualView(int i, float f2, float f3, float f4, float f5, boolean z, Callback callback) {
            this.mReactTag = i;
            this.mScaledX = f2;
            this.mScaledY = f3;
            this.mScaledWidth = f4;
            this.mScaledHeight = f5;
            this.mCallback = callback;
            this.mRelativeToWindow = z;
        }
    }

    final class ProcessLayoutRequests implements UIViewOperationQueue.UIOperation {
        public final void execute() {
            FlatViewGroup.processLayoutRequests();
        }

        private ProcessLayoutRequests() {
        }
    }

    final class SetPadding implements UIViewOperationQueue.UIOperation {
        private final int mPaddingBottom;
        private final int mPaddingLeft;
        private final int mPaddingRight;
        private final int mPaddingTop;
        private final int mReactTag;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.setPadding(this.mReactTag, this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
        }

        private SetPadding(int i, int i2, int i3, int i4, int i5) {
            this.mReactTag = i;
            this.mPaddingLeft = i2;
            this.mPaddingTop = i3;
            this.mPaddingRight = i4;
            this.mPaddingBottom = i5;
        }
    }

    final class UpdateClippingMountState implements UIViewOperationQueue.UIOperation {
        @Nullable
        private final AttachDetachListener[] mAttachDetachListeners;
        private final float[] mCommandMaxBot;
        private final float[] mCommandMinTop;
        @Nullable
        private final DrawCommand[] mDrawCommands;
        private final SparseIntArray mDrawViewIndexMap;
        @Nullable
        private final NodeRegion[] mNodeRegions;
        private final int mReactTag;
        private final float[] mRegionMaxBot;
        private final float[] mRegionMinTop;
        private final boolean mWillMountViews;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.updateClippingMountState(this.mReactTag, this.mDrawCommands, this.mDrawViewIndexMap, this.mCommandMaxBot, this.mCommandMinTop, this.mAttachDetachListeners, this.mNodeRegions, this.mRegionMaxBot, this.mRegionMinTop, this.mWillMountViews);
        }

        private UpdateClippingMountState(int i, DrawCommand[] drawCommandArr, @Nullable SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, AttachDetachListener[] attachDetachListenerArr, @Nullable NodeRegion[] nodeRegionArr, @Nullable float[] fArr3, float[] fArr4, boolean z) {
            this.mReactTag = i;
            this.mDrawCommands = drawCommandArr;
            this.mDrawViewIndexMap = sparseIntArray;
            this.mCommandMaxBot = fArr;
            this.mCommandMinTop = fArr2;
            this.mAttachDetachListeners = attachDetachListenerArr;
            this.mNodeRegions = nodeRegionArr;
            this.mRegionMaxBot = fArr3;
            this.mRegionMinTop = fArr4;
            this.mWillMountViews = z;
        }
    }

    final class UpdateMountState implements UIViewOperationQueue.UIOperation {
        @Nullable
        private final AttachDetachListener[] mAttachDetachListeners;
        @Nullable
        private final DrawCommand[] mDrawCommands;
        @Nullable
        private final NodeRegion[] mNodeRegions;
        private final int mReactTag;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.updateMountState(this.mReactTag, this.mDrawCommands, this.mAttachDetachListeners, this.mNodeRegions);
        }

        private UpdateMountState(int i, DrawCommand[] drawCommandArr, @Nullable AttachDetachListener[] attachDetachListenerArr, @Nullable NodeRegion[] nodeRegionArr) {
            this.mReactTag = i;
            this.mDrawCommands = drawCommandArr;
            this.mAttachDetachListeners = attachDetachListenerArr;
            this.mNodeRegions = nodeRegionArr;
        }
    }

    public final class UpdateViewBounds implements UIViewOperationQueue.UIOperation {
        private final int mBottom;
        private final int mLeft;
        private final int mReactTag;
        private final int mRight;
        private final int mTop;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewBounds(this.mReactTag, this.mLeft, this.mTop, this.mRight, this.mBottom);
        }

        private UpdateViewBounds(int i, int i2, int i3, int i4, int i5) {
            this.mReactTag = i;
            this.mLeft = i2;
            this.mTop = i3;
            this.mRight = i4;
            this.mBottom = i5;
        }
    }

    final class UpdateViewGroup implements UIViewOperationQueue.UIOperation {
        private final int mReactTag;
        private final int[] mViewsToAdd;
        private final int[] mViewsToDetach;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewGroup(this.mReactTag, this.mViewsToAdd, this.mViewsToDetach);
        }

        private UpdateViewGroup(int i, int[] iArr, int[] iArr2) {
            this.mReactTag = i;
            this.mViewsToAdd = iArr;
            this.mViewsToDetach = iArr2;
        }
    }

    public final class ViewManagerCommand implements UIViewOperationQueue.UIOperation {
        @Nullable
        private final ReadableArray mArgs;
        private final int mCommand;
        private final int mReactTag;

        public final void execute() {
            FlatUIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mReactTag, this.mCommand, this.mArgs);
        }

        public ViewManagerCommand(int i, int i2, ReadableArray readableArray) {
            this.mReactTag = i;
            this.mCommand = i2;
            this.mArgs = readableArray;
        }
    }

    public final void enqueueProcessLayoutRequests() {
        enqueueUIOperation(this.mProcessLayoutRequests);
    }

    public final DetachAllChildrenFromViews enqueueDetachAllChildrenFromViews() {
        DetachAllChildrenFromViews detachAllChildrenFromViews = new DetachAllChildrenFromViews();
        enqueueUIOperation(detachAllChildrenFromViews);
        return detachAllChildrenFromViews;
    }

    /* access modifiers changed from: package-private */
    public final void enqueueFlatUIOperation(UIViewOperationQueue.UIOperation uIOperation) {
        enqueueUIOperation(uIOperation);
    }

    public final void enqueueDropViews(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        enqueueUIOperation(new DropViews(arrayList, arrayList2));
    }

    public final ViewManagerCommand createViewManagerCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        return new ViewManagerCommand(i, i2, readableArray);
    }

    public FlatUIViewOperationQueue(ReactApplicationContext reactApplicationContext, FlatNativeViewHierarchyManager flatNativeViewHierarchyManager, int i) {
        super(reactApplicationContext, flatNativeViewHierarchyManager, i);
        this.mNativeViewHierarchyManager = flatNativeViewHierarchyManager;
    }

    public final void enqueueUpdateViewGroup(int i, int[] iArr, int[] iArr2) {
        UpdateViewGroup updateViewGroup = new UpdateViewGroup(i, iArr, iArr2);
        enqueueUIOperation(updateViewGroup);
    }

    public final void enqueueFindTargetForTouch(int i, float f2, float f3, Callback callback) {
        FindTargetForTouchOperation findTargetForTouchOperation = new FindTargetForTouchOperation(i, f2, f3, callback);
        enqueueUIOperation(findTargetForTouchOperation);
    }

    public final void enqueueUpdateMountState(int i, @Nullable DrawCommand[] drawCommandArr, @Nullable AttachDetachListener[] attachDetachListenerArr, @Nullable NodeRegion[] nodeRegionArr) {
        UpdateMountState updateMountState = new UpdateMountState(i, drawCommandArr, attachDetachListenerArr, nodeRegionArr);
        enqueueUIOperation(updateMountState);
    }

    public final UpdateViewBounds createUpdateViewBounds(int i, int i2, int i3, int i4, int i5) {
        UpdateViewBounds updateViewBounds = new UpdateViewBounds(i, i2, i3, i4, i5);
        return updateViewBounds;
    }

    public final void enqueueSetPadding(int i, int i2, int i3, int i4, int i5) {
        SetPadding setPadding = new SetPadding(i, i2, i3, i4, i5);
        enqueueUIOperation(setPadding);
    }

    public final void enqueueMeasureVirtualView(int i, float f2, float f3, float f4, float f5, boolean z, Callback callback) {
        MeasureVirtualView measureVirtualView = new MeasureVirtualView(i, f2, f3, f4, f5, z, callback);
        enqueueUIOperation(measureVirtualView);
    }

    public final void enqueueUpdateClippingMountState(int i, @Nullable DrawCommand[] drawCommandArr, SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, @Nullable AttachDetachListener[] attachDetachListenerArr, @Nullable NodeRegion[] nodeRegionArr, float[] fArr3, float[] fArr4, boolean z) {
        UpdateClippingMountState updateClippingMountState = new UpdateClippingMountState(i, drawCommandArr, sparseIntArray, fArr, fArr2, attachDetachListenerArr, nodeRegionArr, fArr3, fArr4, z);
        enqueueUIOperation(updateClippingMountState);
    }
}
