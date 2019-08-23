package com.bytedance.common.wschannel.app;

public interface ISharedPref {
    boolean getBoolean(String str, boolean z);

    float getFloat(String str, float f2);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z);

    void putFloat(String str, float f2);

    void putInt(String str, int i);

    void putLong(String str, long j);

    void putString(String str, String str2);
}
