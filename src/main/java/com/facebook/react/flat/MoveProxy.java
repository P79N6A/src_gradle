package com.facebook.react.flat;

import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import javax.annotation.Nullable;

public final class MoveProxy {
    private ReactShadowNode[] mChildren = new ReactShadowNodeImpl[4];
    private int[] mMapping = new int[8];
    @Nullable
    private ReadableArray mMoveTo;
    private int mSize;

    private static int k(int i) {
        return i * 2;
    }

    private static int moveToToIndex(int i) {
        return i;
    }

    private static int v(int i) {
        return (i * 2) + 1;
    }

    public final int size() {
        return this.mSize;
    }

    MoveProxy() {
    }

    public final int getMoveFrom(int i) {
        return moveFromToValue(i);
    }

    public final int getMoveTo(int i) {
        return moveToToValue(i);
    }

    private int moveFromToIndex(int i) {
        return this.mMapping[k(i)];
    }

    private int moveFromToValue(int i) {
        return this.mMapping[v(i)];
    }

    private int moveToToValue(int i) {
        return ((ReadableArray) a.a(this.mMoveTo)).getInt(i);
    }

    private void setSize(int i) {
        for (int i2 = i; i2 < this.mSize; i2++) {
            this.mChildren[i2] = null;
        }
        this.mSize = i;
    }

    public final ReactShadowNode getChildMoveTo(int i) {
        return this.mChildren[moveToToIndex(i)];
    }

    public final void setChildMoveFrom(int i, ReactShadowNode reactShadowNode) {
        this.mChildren[moveFromToIndex(i)] = reactShadowNode;
    }

    public final void setup(ReadableArray readableArray, ReadableArray readableArray2) {
        this.mMoveTo = readableArray2;
        if (readableArray == null) {
            setSize(0);
            return;
        }
        int size = readableArray.size();
        int i = size + size;
        if (this.mMapping.length < i) {
            this.mMapping = new int[i];
            this.mChildren = new FlatShadowNode[size];
        }
        setSize(size);
        setKeyValue(0, 0, readableArray.getInt(0));
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = readableArray.getInt(i2);
            int i4 = i2 - 1;
            while (i4 >= 0 && moveFromToValue(i4) >= i3) {
                setKeyValue(i4 + 1, moveFromToIndex(i4), moveFromToValue(i4));
                i4--;
            }
            setKeyValue(i4 + 1, i2, i3);
        }
    }

    private void setKeyValue(int i, int i2, int i3) {
        this.mMapping[k(i)] = i2;
        this.mMapping[v(i)] = i3;
    }
}
