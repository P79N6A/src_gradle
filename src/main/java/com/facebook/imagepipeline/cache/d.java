package com.facebook.imagepipeline.cache;

import android.os.Build;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.cache.g;

public final class d implements g.a {
    public final double getTrimRatio(MemoryTrimType memoryTrimType) {
        switch (memoryTrimType) {
            case OnCloseToDalvikHeapLimit:
                if (Build.VERSION.SDK_INT >= 21) {
                    return MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
                }
                return 0.0d;
            case OnAppBackgrounded:
            case OnSystemMemoryCriticallyLowWhileAppInForeground:
            case OnSystemLowMemoryWhileAppInForeground:
            case OnSystemLowMemoryWhileAppInBackground:
                return 1.0d;
            default:
                FLog.wtf("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", memoryTrimType);
                return 0.0d;
        }
    }
}
