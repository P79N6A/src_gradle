package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import com.facebook.common.memory.b;
import javax.annotation.concurrent.Immutable;

@Immutable
public final class ad {
    public final int mBitmapPoolMaxBitmapSize;
    public final int mBitmapPoolMaxPoolSize;
    public final af mBitmapPoolParams;
    public final ag mBitmapPoolStatsTracker;
    public final String mBitmapPoolType;
    public final af mFlexByteArrayPoolParams;
    public final af mMemoryChunkPoolParams;
    public final ag mMemoryChunkPoolStatsTracker;
    public final b mMemoryTrimmableRegistry;
    public final af mSmallByteArrayPoolParams;
    public final ag mSmallByteArrayPoolStatsTracker;

    public static class a {
        public int mBitmapPoolMaxBitmapSize;
        public int mBitmapPoolMaxPoolSize;
        public af mBitmapPoolParams;
        public ag mBitmapPoolStatsTracker;
        public String mBitmapPoolType;
        public af mFlexByteArrayPoolParams;
        public af mMemoryChunkPoolParams;
        public ag mMemoryChunkPoolStatsTracker;
        public b mMemoryTrimmableRegistry;
        public af mSmallByteArrayPoolParams;
        public ag mSmallByteArrayPoolStatsTracker;

        private a() {
        }

        public final ad build$___twin___() {
            return new ad(this, (byte) 0);
        }

        public final ad build() {
            setMemoryTrimmableRegistry(com.ss.android.ugc.aweme.app.ad.a());
            return build$___twin___();
        }

        public final a setMemoryTrimmableRegistry(b bVar) {
            this.mMemoryTrimmableRegistry = bVar;
            return this;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static a newBuilder() {
        return new a((byte) 0);
    }

    private ad(a aVar) {
        af afVar;
        ag agVar;
        af afVar2;
        b bVar;
        af afVar3;
        ag agVar2;
        af afVar4;
        ag agVar3;
        String str;
        int i;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("PoolConfig()");
        }
        if (aVar.mBitmapPoolParams == null) {
            afVar = k.get();
        } else {
            afVar = aVar.mBitmapPoolParams;
        }
        this.mBitmapPoolParams = afVar;
        if (aVar.mBitmapPoolStatsTracker == null) {
            agVar = aa.getInstance();
        } else {
            agVar = aVar.mBitmapPoolStatsTracker;
        }
        this.mBitmapPoolStatsTracker = agVar;
        if (aVar.mFlexByteArrayPoolParams == null) {
            afVar2 = m.get();
        } else {
            afVar2 = aVar.mFlexByteArrayPoolParams;
        }
        this.mFlexByteArrayPoolParams = afVar2;
        if (aVar.mMemoryTrimmableRegistry == null) {
            bVar = NoOpMemoryTrimmableRegistry.getInstance();
        } else {
            bVar = aVar.mMemoryTrimmableRegistry;
        }
        this.mMemoryTrimmableRegistry = bVar;
        if (aVar.mMemoryChunkPoolParams == null) {
            afVar3 = n.get();
        } else {
            afVar3 = aVar.mMemoryChunkPoolParams;
        }
        this.mMemoryChunkPoolParams = afVar3;
        if (aVar.mMemoryChunkPoolStatsTracker == null) {
            agVar2 = aa.getInstance();
        } else {
            agVar2 = aVar.mMemoryChunkPoolStatsTracker;
        }
        this.mMemoryChunkPoolStatsTracker = agVar2;
        if (aVar.mSmallByteArrayPoolParams == null) {
            afVar4 = l.get();
        } else {
            afVar4 = aVar.mSmallByteArrayPoolParams;
        }
        this.mSmallByteArrayPoolParams = afVar4;
        if (aVar.mSmallByteArrayPoolStatsTracker == null) {
            agVar3 = aa.getInstance();
        } else {
            agVar3 = aVar.mSmallByteArrayPoolStatsTracker;
        }
        this.mSmallByteArrayPoolStatsTracker = agVar3;
        if (aVar.mBitmapPoolType == null) {
            str = "legacy";
        } else {
            str = aVar.mBitmapPoolType;
        }
        this.mBitmapPoolType = str;
        this.mBitmapPoolMaxPoolSize = aVar.mBitmapPoolMaxPoolSize;
        if (aVar.mBitmapPoolMaxBitmapSize > 0) {
            i = aVar.mBitmapPoolMaxBitmapSize;
        } else {
            i = 4194304;
        }
        this.mBitmapPoolMaxBitmapSize = i;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    /* synthetic */ ad(a aVar, byte b2) {
        this(aVar);
    }
}
