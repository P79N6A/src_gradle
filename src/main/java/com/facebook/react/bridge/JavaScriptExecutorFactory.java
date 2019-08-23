package com.facebook.react.bridge;

import com.facebook.react.bridge.RNJavaScriptRuntime;

public interface JavaScriptExecutorFactory {
    JavaScriptExecutor create() throws Exception;

    JavaScriptExecutor create(RNJavaScriptRuntime.SplitCommonType splitCommonType) throws Exception;
}
