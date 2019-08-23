package com.facebook.common.memory;

public enum MemoryTrimType {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);
    
    private double mSuggestedTrimRatio;

    public final double getSuggestedTrimRatio() {
        return this.mSuggestedTrimRatio;
    }

    private MemoryTrimType(double d2) {
        this.mSuggestedTrimRatio = d2;
    }
}