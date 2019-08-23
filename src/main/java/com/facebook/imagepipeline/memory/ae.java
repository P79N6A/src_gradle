package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.a;
import com.facebook.common.memory.f;
import com.facebook.common.memory.i;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public final class ae {

    /* renamed from: a  reason: collision with root package name */
    private final ad f23953a;

    /* renamed from: b  reason: collision with root package name */
    private d f23954b;

    /* renamed from: c  reason: collision with root package name */
    private j f23955c;

    /* renamed from: d  reason: collision with root package name */
    private p f23956d;

    /* renamed from: e  reason: collision with root package name */
    private z f23957e;

    /* renamed from: f  reason: collision with root package name */
    private f f23958f;
    private i g;
    private a h;

    public final int getFlexByteArrayPoolMaxNumThreads() {
        return this.f23953a.mFlexByteArrayPoolParams.maxNumThreads;
    }

    public final f getPooledByteBufferFactory() {
        return getPooledByteBufferFactory(0);
    }

    public final j getBufferMemoryChunkPool() {
        if (this.f23955c == null) {
            this.f23955c = new j(this.f23953a.mMemoryTrimmableRegistry, this.f23953a.mMemoryChunkPoolParams, this.f23953a.mMemoryChunkPoolStatsTracker);
        }
        return this.f23955c;
    }

    public final p getFlexByteArrayPool() {
        if (this.f23956d == null) {
            this.f23956d = new p(this.f23953a.mMemoryTrimmableRegistry, this.f23953a.mFlexByteArrayPoolParams);
        }
        return this.f23956d;
    }

    public final z getNativeMemoryChunkPool() {
        if (this.f23957e == null) {
            this.f23957e = new z(this.f23953a.mMemoryTrimmableRegistry, this.f23953a.mMemoryChunkPoolParams, this.f23953a.mMemoryChunkPoolStatsTracker);
        }
        return this.f23957e;
    }

    public final i getPooledByteStreams() {
        if (this.g == null) {
            this.g = new i(getSmallByteArrayPool());
        }
        return this.g;
    }

    public final a getSmallByteArrayPool() {
        if (this.h == null) {
            this.h = new q(this.f23953a.mMemoryTrimmableRegistry, this.f23953a.mSmallByteArrayPoolParams, this.f23953a.mSmallByteArrayPoolStatsTracker);
        }
        return this.h;
    }

    public final d getBitmapPool() {
        if (this.f23954b == null) {
            String str = this.f23953a.mBitmapPoolType;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1868884870) {
                if (hashCode != -1106578487) {
                    if (hashCode != -404562712) {
                        if (hashCode == 95945896 && str.equals("dummy")) {
                            c2 = 0;
                        }
                    } else if (str.equals("experimental")) {
                        c2 = 1;
                    }
                } else if (str.equals("legacy")) {
                    c2 = 3;
                }
            } else if (str.equals("legacy_default_params")) {
                c2 = 2;
            }
            switch (c2) {
                case 0:
                    this.f23954b = new o();
                    break;
                case 1:
                    this.f23954b = new r(this.f23953a.mBitmapPoolMaxPoolSize, this.f23953a.mBitmapPoolMaxBitmapSize, aa.getInstance());
                    break;
                case 2:
                    this.f23954b = new h(this.f23953a.mMemoryTrimmableRegistry, k.get(), this.f23953a.mBitmapPoolStatsTracker);
                    break;
                default:
                    this.f23954b = new h(this.f23953a.mMemoryTrimmableRegistry, this.f23953a.mBitmapPoolParams, this.f23953a.mBitmapPoolStatsTracker);
                    break;
            }
        }
        return this.f23954b;
    }

    public ae(ad adVar) {
        this.f23953a = (ad) Preconditions.checkNotNull(adVar);
    }

    public final f getPooledByteBufferFactory(int i) {
        u uVar;
        if (this.f23958f == null) {
            switch (i) {
                case 0:
                    uVar = getNativeMemoryChunkPool();
                    break;
                case 1:
                    uVar = getBufferMemoryChunkPool();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            this.f23958f = new x(uVar, getPooledByteStreams());
        }
        return this.f23958f;
    }
}
