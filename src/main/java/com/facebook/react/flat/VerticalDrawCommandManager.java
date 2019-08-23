package com.facebook.react.flat;

import android.util.SparseIntArray;
import java.util.Arrays;

public final class VerticalDrawCommandManager extends ClippingDrawCommandManager {
    /* access modifiers changed from: package-private */
    public final int commandStartIndex() {
        int binarySearch = Arrays.binarySearch(this.mCommandMaxBottom, (float) this.mClippingRect.top);
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        return binarySearch;
    }

    /* access modifiers changed from: package-private */
    public final int commandStopIndex(int i) {
        float[] fArr = this.mCommandMinTop;
        int binarySearch = Arrays.binarySearch(fArr, i, fArr.length, (float) this.mClippingRect.bottom);
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        return binarySearch;
    }

    VerticalDrawCommandManager(FlatViewGroup flatViewGroup, DrawCommand[] drawCommandArr) {
        super(flatViewGroup, drawCommandArr);
    }

    /* access modifiers changed from: package-private */
    public final int regionStopIndex(float f2, float f3) {
        int binarySearch = Arrays.binarySearch(this.mRegionMinTop, f3 + 1.0E-4f);
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        return binarySearch;
    }

    /* access modifiers changed from: package-private */
    public final boolean regionAboveTouch(int i, float f2, float f3) {
        if (this.mRegionMaxBottom[i] < f3) {
            return true;
        }
        return false;
    }

    public static void fillMaxMinArrays(NodeRegion[] nodeRegionArr, float[] fArr, float[] fArr2) {
        float f2 = 0.0f;
        for (int i = 0; i < nodeRegionArr.length; i++) {
            f2 = Math.max(f2, nodeRegionArr[i].getTouchableBottom());
            fArr[i] = f2;
        }
        for (int length = nodeRegionArr.length - 1; length >= 0; length--) {
            f2 = Math.min(f2, nodeRegionArr[length].getTouchableTop());
            fArr2[length] = f2;
        }
    }

    public static void fillMaxMinArrays(DrawCommand[] drawCommandArr, float[] fArr, float[] fArr2, SparseIntArray sparseIntArray) {
        float min;
        float f2 = 0.0f;
        for (int i = 0; i < drawCommandArr.length; i++) {
            if (drawCommandArr[i] instanceof DrawView) {
                DrawView drawView = drawCommandArr[i];
                sparseIntArray.append(drawView.reactTag, i);
                f2 = Math.max(f2, drawView.mLogicalBottom);
            } else {
                f2 = Math.max(f2, drawCommandArr[i].getBottom());
            }
            fArr[i] = f2;
        }
        for (int length = drawCommandArr.length - 1; length >= 0; length--) {
            if (drawCommandArr[length] instanceof DrawView) {
                min = Math.min(f2, drawCommandArr[length].mLogicalTop);
            } else {
                min = Math.min(f2, drawCommandArr[length].getTop());
            }
            f2 = min;
            fArr2[length] = f2;
        }
    }
}
