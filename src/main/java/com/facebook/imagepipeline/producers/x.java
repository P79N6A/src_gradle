package com.facebook.imagepipeline.producers;

import android.content.res.AssetManager;
import com.facebook.common.memory.f;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class x extends ab {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f24212a;

    /* access modifiers changed from: protected */
    public final String a() {
        return "LocalAssetFetchProducer";
    }

    private static String c(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().getPath().substring(1);
    }

    /* access modifiers changed from: protected */
    public final b a(ImageRequest imageRequest) throws IOException {
        return b(this.f24212a.open(c(imageRequest), 2), b(imageRequest));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e A[SYNTHETIC, Splitter:B:15:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0025 A[SYNTHETIC, Splitter:B:23:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(com.facebook.imagepipeline.request.ImageRequest r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r3.f24212a     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            java.lang.String r4 = c(r4)     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            android.content.res.AssetFileDescriptor r4 = r1.openFd(r4)     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            long r0 = r4.getLength()     // Catch:{ IOException -> 0x0023, all -> 0x0016 }
            int r0 = (int) r0
            if (r4 == 0) goto L_0x0015
            r4.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r0
        L_0x0016:
            r0 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L_0x001c
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            throw r4
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r4 == 0) goto L_0x0028
            r4.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.x.b(com.facebook.imagepipeline.request.ImageRequest):int");
    }

    public x(Executor executor, f fVar, AssetManager assetManager) {
        super(executor, fVar);
        this.f24212a = assetManager;
    }
}
