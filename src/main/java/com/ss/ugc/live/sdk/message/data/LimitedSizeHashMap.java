package com.ss.ugc.live.sdk.message.data;

import java.util.LinkedHashMap;
import java.util.Map;

public class LimitedSizeHashMap<K, V> extends LinkedHashMap<K, V> {
    private int mMaxSize;

    public LimitedSizeHashMap(int i) {
        this.mMaxSize = i;
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }
}
