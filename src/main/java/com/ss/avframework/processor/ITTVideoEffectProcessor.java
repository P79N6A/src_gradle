package com.ss.avframework.processor;

public interface ITTVideoEffectProcessor {
    void configEffect(String str, String str2, boolean z);

    int setBeautify(String str, float f2, float f3);

    void setEffect(String str);

    void setEffect(String str, float f2);

    void setFaceAttribute(boolean z);

    int setFilter(String str, float f2);

    int setFilter(String str, String str2, float f2);

    int setReshape(String str, float f2, float f3);
}
