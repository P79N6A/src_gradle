package com.ss.android.vesdk;

import android.support.annotation.NonNull;
import com.ss.android.vesdk.VEImageDetectUtils;
import java.util.List;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private VEImageDetectUtils f78135a;

    public final void a() {
        if (this.f78135a != null) {
            this.f78135a.stopDetectImagesContentIfNeed();
        }
    }

    public final synchronized void a(@NonNull String str, @NonNull List<String> list, @NonNull List<String> list2, @NonNull VEImageDetectUtils.IDetectImageResultListener iDetectImageResultListener) {
        this.f78135a = new VEImageDetectUtils();
        this.f78135a.init();
        this.f78135a.setDetectImageContentListener(iDetectImageResultListener);
        this.f78135a.detectImagesContent(str, list, list2);
        this.f78135a.destroy();
    }
}
