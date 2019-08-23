package com.ss.avframework.livestreamv2.filter;

public interface IFilterManager extends ITTVideoEffectProcessor {
    void enable(boolean z);

    String getVersion();

    boolean isEnable();

    boolean isValid();

    String name();
}
