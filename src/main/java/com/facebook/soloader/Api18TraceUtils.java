package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@DoNotOptimize
@TargetApi(18)
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
