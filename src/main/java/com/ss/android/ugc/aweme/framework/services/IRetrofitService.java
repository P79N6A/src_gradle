package com.ss.android.ugc.aweme.framework.services;

import java.util.concurrent.ExecutionException;

public interface IRetrofitService {
    @Deprecated
    Object createCompatibleRetrofit(String str);

    IRetrofit createNewRetrofit(String str);

    RuntimeException propagateCompatibleException(ExecutionException executionException) throws Exception;
}
