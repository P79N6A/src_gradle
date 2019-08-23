package com.bytedance.aweme.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
@DoNotOptimize
public class Api18TraceUtils {
    Api18TraceUtils() {
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static void beginTraceSection(String str) {
        Trace.beginSection(str);
    }
}
