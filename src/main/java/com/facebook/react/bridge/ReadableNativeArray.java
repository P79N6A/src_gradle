package com.facebook.react.bridge;

import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.Nullable;

@DoNotStrip
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter;
    private static boolean mUseNativeAccessor;
    @Nullable
    private Object[] mLocalArray;
    @Nullable
    private ReadableType[] mLocalTypeArray;

    private native ReadableNativeArray getArrayNative(int i);

    private native boolean getBooleanNative(int i);

    private native double getDoubleNative(int i);

    private native int getIntNative(int i);

    private native ReadableNativeMap getMapNative(int i);

    private native String getStringNative(int i);

    private native ReadableType getTypeNative(int i);

    private native Object[] importArray();

    private native Object[] importTypeArray();

    private native boolean isNullNative(int i);

    private native int sizeNative();

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    public int size() {
        if (!mUseNativeAccessor) {
            return getLocalArray().length;
        }
        jniPassCounter++;
        return sizeNative();
    }

    private Object[] getLocalArray() {
        if (this.mLocalArray != null) {
            return this.mLocalArray;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                this.mLocalArray = (Object[]) a.b(importArray());
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        if (this.mLocalTypeArray != null) {
            return this.mLocalTypeArray;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] objArr = (Object[]) a.b(importTypeArray());
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    public ArrayList<Object> toArrayList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case Number:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case String:
                    arrayList.add(getString(i));
                    break;
                case Map:
                    arrayList.add(getMap(i).toHashMap());
                    break;
                case Array:
                    arrayList.add(getArray(i).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i + ClassUtils.PACKAGE_SEPARATOR);
            }
        }
        return arrayList;
    }

    protected ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    public static void setUseNativeAccessor(boolean z) {
        mUseNativeAccessor = z;
    }

    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    public ReadableNativeArray getArray(int i) {
        if (!mUseNativeAccessor) {
            return (ReadableNativeArray) getLocalArray()[i];
        }
        jniPassCounter++;
        return getArrayNative(i);
    }

    public boolean getBoolean(int i) {
        if (!mUseNativeAccessor) {
            return ((Boolean) getLocalArray()[i]).booleanValue();
        }
        jniPassCounter++;
        return getBooleanNative(i);
    }

    public double getDouble(int i) {
        if (!mUseNativeAccessor) {
            return ((Double) getLocalArray()[i]).doubleValue();
        }
        jniPassCounter++;
        return getDoubleNative(i);
    }

    public int getInt(int i) {
        if (!mUseNativeAccessor) {
            return ((Double) getLocalArray()[i]).intValue();
        }
        jniPassCounter++;
        return getIntNative(i);
    }

    public ReadableNativeMap getMap(int i) {
        if (!mUseNativeAccessor) {
            return (ReadableNativeMap) getLocalArray()[i];
        }
        jniPassCounter++;
        return getMapNative(i);
    }

    public String getString(int i) {
        if (!mUseNativeAccessor) {
            return (String) getLocalArray()[i];
        }
        jniPassCounter++;
        return getStringNative(i);
    }

    public ReadableType getType(int i) {
        if (!mUseNativeAccessor) {
            return getLocalTypeArray()[i];
        }
        jniPassCounter++;
        return getTypeNative(i);
    }

    public boolean isNull(int i) {
        if (mUseNativeAccessor) {
            jniPassCounter++;
            return isNullNative(i);
        } else if (getLocalArray()[i] == null) {
            return true;
        } else {
            return false;
        }
    }
}
