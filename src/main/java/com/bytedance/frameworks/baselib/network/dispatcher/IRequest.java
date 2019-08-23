package com.bytedance.frameworks.baselib.network.dispatcher;

public interface IRequest {

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    Priority getPriority();

    int getSequence();
}
