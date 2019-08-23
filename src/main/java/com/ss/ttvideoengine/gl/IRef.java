package com.ss.ttvideoengine.gl;

public interface IRef {
    int addRef();

    int decRef();

    int refCnt();
}
