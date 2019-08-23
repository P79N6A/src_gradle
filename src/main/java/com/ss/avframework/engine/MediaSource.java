package com.ss.avframework.engine;

import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public abstract class MediaSource extends NativeObject implements StaticsReport.StaticReportInterface {
    @CalledByNative
    public abstract int status();
}
