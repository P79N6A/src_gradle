package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import javax.annotation.Nullable;

public class ReactStylesDiffMap {
    final ReadableMap mBackingMap;

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.mBackingMap.toString() + " }";
    }

    public ReactStylesDiffMap(ReadableMap readableMap) {
        this.mBackingMap = readableMap;
    }

    @Nullable
    public ReadableArray getArray(String str) {
        return this.mBackingMap.getArray(str);
    }

    @Nullable
    public Dynamic getDynamic(String str) {
        return this.mBackingMap.getDynamic(str);
    }

    @Nullable
    public ReadableMap getMap(String str) {
        return this.mBackingMap.getMap(str);
    }

    @Nullable
    public String getString(String str) {
        return this.mBackingMap.getString(str);
    }

    public boolean hasKey(String str) {
        return this.mBackingMap.hasKey(str);
    }

    public boolean isNull(String str) {
        return this.mBackingMap.isNull(str);
    }

    public boolean getBoolean(String str, boolean z) {
        if (this.mBackingMap.isNull(str)) {
            return z;
        }
        return this.mBackingMap.getBoolean(str);
    }

    public double getDouble(String str, double d2) {
        if (this.mBackingMap.isNull(str)) {
            return d2;
        }
        return this.mBackingMap.getDouble(str);
    }

    public int getInt(String str, int i) {
        if (this.mBackingMap.isNull(str)) {
            return i;
        }
        return this.mBackingMap.getInt(str);
    }

    public float getFloat(String str, float f2) {
        if (this.mBackingMap.isNull(str)) {
            return f2;
        }
        return (float) this.mBackingMap.getDouble(str);
    }
}
