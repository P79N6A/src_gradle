package com.ss.mediakit.medialoader;

public class AVMDLDataLoaderConfigure {
    public static int ALLOW_PRELOAD_WHEN_PLAY = 0;
    public static int DEFAULT_MAX_CACHE_SIZE = 314572800;
    public static int DEFAULT_MAX_FACTORY_CACHE_SIZE = 209715200;
    public static int DEFAULT_MAX_FACTORY_MEMORY_SIZE = 5242880;
    public static int DEFAULT_PRELOAD_PARALLEL_NUM = 1;
    public static int NOT_ALLOW_PLAY_TASK_KEY_PRELOAD = 1;
    public static int NOT_ALLOW_PRELOAD_WHEN_PLAY = 2;
    public static int WAIT_LIST_IS_QUEUE = 1;
    public static int WAIT_LIST_IS_STACK;
    public String mCacheDir;
    public String mLoaderFactoryDir;
    public int mLoaderFactoryMaxCacheSize = DEFAULT_MAX_FACTORY_CACHE_SIZE;
    public int mLoaderFactoryMaxMemorySize = DEFAULT_MAX_FACTORY_MEMORY_SIZE;
    public int mLoaderType;
    public int mMaxCacheSize;
    public int mOpenTimeOut;
    public int mPreloadParallelNum = DEFAULT_PRELOAD_PARALLEL_NUM;
    public int mPreloadStrategy = NOT_ALLOW_PLAY_TASK_KEY_PRELOAD;
    public int mPreloadWaitListType = WAIT_LIST_IS_STACK;
    public int mRWTimeOut;
    public int mTryCount;

    public static AVMDLDataLoaderConfigure getDefaultonfigure() {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = new AVMDLDataLoaderConfigure(DEFAULT_MAX_CACHE_SIZE, 5, 5, 0, null);
        return aVMDLDataLoaderConfigure;
    }

    public AVMDLDataLoaderConfigure(int i, int i2, int i3, int i4, String str) {
        this.mMaxCacheSize = i;
        this.mOpenTimeOut = i2;
        this.mRWTimeOut = i3;
        this.mTryCount = i4;
        this.mCacheDir = str;
    }
}
