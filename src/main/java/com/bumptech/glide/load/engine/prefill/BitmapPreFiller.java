package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.util.Util;
import java.util.HashMap;

public final class BitmapPreFiller {
    private final BitmapPool bitmapPool;
    private BitmapPreFillRunner current;
    private final DecodeFormat defaultFormat;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final MemoryCache memoryCache;

    private static int getSizeInBytes(PreFillType preFillType) {
        return Util.getBitmapByteSize(preFillType.getWidth(), preFillType.getHeight(), preFillType.getConfig());
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final PreFillQueue generateAllocationOrder(PreFillType... preFillTypeArr) {
        long maxSize = (this.memoryCache.getMaxSize() - this.memoryCache.getCurrentSize()) + this.bitmapPool.getMaxSize();
        int i = 0;
        for (PreFillType weight : preFillTypeArr) {
            i += weight.getWeight();
        }
        float f2 = ((float) maxSize) / ((float) i);
        HashMap hashMap = new HashMap();
        for (PreFillType preFillType : preFillTypeArr) {
            hashMap.put(preFillType, Integer.valueOf(Math.round(((float) preFillType.getWeight()) * f2) / getSizeInBytes(preFillType)));
        }
        return new PreFillQueue(hashMap);
    }

    public final void preFill(PreFillType.Builder... builderArr) {
        Bitmap.Config config;
        if (this.current != null) {
            this.current.cancel();
        }
        PreFillType[] preFillTypeArr = new PreFillType[builderArr.length];
        for (int i = 0; i < builderArr.length; i++) {
            PreFillType.Builder builder = builderArr[i];
            if (builder.getConfig() == null) {
                if (this.defaultFormat == DecodeFormat.PREFER_ARGB_8888) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                builder.setConfig(config);
            }
            preFillTypeArr[i] = builder.build();
        }
        this.current = new BitmapPreFillRunner(this.bitmapPool, this.memoryCache, generateAllocationOrder(preFillTypeArr));
        this.handler.post(this.current);
    }

    public BitmapPreFiller(MemoryCache memoryCache2, BitmapPool bitmapPool2, DecodeFormat decodeFormat) {
        this.memoryCache = memoryCache2;
        this.bitmapPool = bitmapPool2;
        this.defaultFormat = decodeFormat;
    }
}
