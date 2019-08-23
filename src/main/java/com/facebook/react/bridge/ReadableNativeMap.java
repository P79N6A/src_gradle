package com.facebook.react.bridge;

import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import javax.annotation.Nullable;

@DoNotStrip
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static int mJniCallCounter;
    private static boolean mUseNativeAccessor;
    @Nullable
    private String[] mKeys;
    @Nullable
    private HashMap<String, Object> mLocalMap;
    @Nullable
    private HashMap<String, ReadableType> mLocalTypeMap;

    @DoNotStrip
    static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        @DoNotStrip
        private final HybridData mHybridData;
        @DoNotStrip
        private final ReadableNativeMap mMap;

        private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

        public native boolean hasNextKey();

        public native String nextKey();

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mMap = readableNativeMap;
            this.mHybridData = initHybrid(readableNativeMap);
        }
    }

    private native ReadableNativeArray getArrayNative(String str);

    private native boolean getBooleanNative(String str);

    private native double getDoubleNative(String str);

    private native int getIntNative(String str);

    private native ReadableNativeMap getMapNative(String str);

    private native String getStringNative(String str);

    private native ReadableType getTypeNative(String str);

    private native boolean hasKeyNative(String str);

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    private native boolean isNullNative(String str);

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    private HashMap<String, Object> getLocalMap() {
        if (this.mLocalMap != null) {
            return this.mLocalMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) a.b(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] objArr = (Object[]) a.b(importValues());
                mJniCallCounter++;
                this.mLocalMap = new HashMap<>();
                for (int i = 0; i < this.mKeys.length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    private HashMap<String, ReadableType> getLocalTypeMap() {
        if (this.mLocalTypeMap != null) {
            return this.mLocalTypeMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) a.b(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] objArr = (Object[]) a.b(importTypes());
                mJniCallCounter++;
                this.mLocalTypeMap = new HashMap<>();
                for (int i = 0; i < this.mKeys.length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    public HashMap<String, Object> toHashMap() {
        if (mUseNativeAccessor) {
            ReadableMapKeySetIterator keySetIterator = keySetIterator();
            HashMap<String, Object> hashMap = new HashMap<>();
            while (keySetIterator.hasNextKey()) {
                mJniCallCounter++;
                String nextKey = keySetIterator.nextKey();
                mJniCallCounter++;
                switch (getType(nextKey)) {
                    case Null:
                        hashMap.put(nextKey, null);
                        break;
                    case Boolean:
                        hashMap.put(nextKey, Boolean.valueOf(getBoolean(nextKey)));
                        break;
                    case Number:
                        hashMap.put(nextKey, Double.valueOf(getDouble(nextKey)));
                        break;
                    case String:
                        hashMap.put(nextKey, getString(nextKey));
                        break;
                    case Map:
                        hashMap.put(nextKey, ((ReadableNativeMap) a.b(getMap(nextKey))).toHashMap());
                        break;
                    case Array:
                        hashMap.put(nextKey, ((ReadableArray) a.b(getArray(nextKey))).toArrayList());
                        break;
                    default:
                        throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ClassUtils.PACKAGE_SEPARATOR);
                }
            }
            return hashMap;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(getLocalMap());
        for (String next : hashMap2.keySet()) {
            switch (getType(next)) {
                case Null:
                case Boolean:
                case Number:
                case String:
                    break;
                case Map:
                    hashMap2.put(next, ((ReadableNativeMap) a.b(getMap(next))).toHashMap());
                    break;
                case Array:
                    hashMap2.put(next, ((ReadableArray) a.b(getArray(next))).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + next + ClassUtils.PACKAGE_SEPARATOR);
            }
        }
        return hashMap2;
    }

    protected ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    public static void setUseNativeAccessor(boolean z) {
        mUseNativeAccessor = z;
    }

    public Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    @Nullable
    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    private Object getValue(String str) {
        if (hasKey(str) && !isNull(str)) {
            return a.b(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    @Nullable
    public ReadableArray getArray(String str) {
        if (!mUseNativeAccessor) {
            return (ReadableArray) getNullableValue(str);
        }
        mJniCallCounter++;
        return getArrayNative(str);
    }

    public boolean getBoolean(String str) {
        if (!mUseNativeAccessor) {
            return ((Boolean) getValue(str)).booleanValue();
        }
        mJniCallCounter++;
        return getBooleanNative(str);
    }

    public double getDouble(String str) {
        if (!mUseNativeAccessor) {
            return ((Double) getValue(str)).doubleValue();
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    public double getDoubleFromDeg(String str) {
        if (!mUseNativeAccessor) {
            return transformDataType(str);
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    public int getInt(String str) {
        if (!mUseNativeAccessor) {
            return ((Double) getValue(str)).intValue();
        }
        mJniCallCounter++;
        return getIntNative(str);
    }

    @Nullable
    public ReadableNativeMap getMap(String str) {
        if (!mUseNativeAccessor) {
            return (ReadableNativeMap) getNullableValue(str);
        }
        mJniCallCounter++;
        return getMapNative(str);
    }

    @Nullable
    public String getString(String str) {
        if (!mUseNativeAccessor) {
            return (String) getNullableValue(str);
        }
        mJniCallCounter++;
        return getStringNative(str);
    }

    public boolean hasKey(String str) {
        if (!mUseNativeAccessor) {
            return getLocalMap().containsKey(str);
        }
        mJniCallCounter++;
        return hasKeyNative(str);
    }

    private double transformDataType(String str) {
        Object value = getValue(str);
        if (value == null || !value.toString().endsWith("deg")) {
            return ((Double) value).doubleValue();
        }
        return (Double.valueOf(value.toString().replace("deg", "")).doubleValue() * 3.141592653589793d) / 180.0d;
    }

    public ReadableType getType(String str) {
        if (mUseNativeAccessor) {
            mJniCallCounter++;
            return getTypeNative(str);
        } else if (getLocalTypeMap().containsKey(str)) {
            return (ReadableType) a.b(getLocalTypeMap().get(str));
        } else {
            throw new NoSuchKeyException(str);
        }
    }

    public boolean isNull(String str) {
        if (mUseNativeAccessor) {
            mJniCallCounter++;
            return isNullNative(str);
        } else if (!getLocalMap().containsKey(str)) {
            throw new NoSuchKeyException(str);
        } else if (getLocalMap().get(str) == null) {
            return true;
        } else {
            return false;
        }
    }
}
