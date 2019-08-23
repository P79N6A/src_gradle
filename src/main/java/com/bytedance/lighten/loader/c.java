package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.bytedance.lighten.core.b.d;
import com.bytedance.lighten.core.e;
import com.bytedance.lighten.core.g;
import com.bytedance.lighten.core.j;
import com.facebook.cache.disk.b;
import com.facebook.common.a.a;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public class c implements j {

    /* renamed from: a  reason: collision with root package name */
    private ImagePipelineConfig f21811a;

    public final e a(@NonNull String str) {
        return new e(str);
    }

    public final e a(@NonNull List<String> list) {
        return new e(list);
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return ImagePipelineFactory.getInstance().getMainFileCache().hasKey(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(uri), null));
    }

    public final void a(@NonNull com.bytedance.lighten.core.b.c cVar) {
        ImagePipelineConfig imagePipelineConfig;
        g.a(cVar.a());
        if (Fresco.hasBeenInitialized()) {
            imagePipelineConfig = null;
        } else {
            AnimatedFactoryProvider.setDefaultPreDecodeCount(1);
            Application a2 = cVar.a();
            ActivityManager activityManager = (ActivityManager) a2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            b.a a3 = b.a(a2).a(cVar.c()).a("fresco_cache");
            if (cVar.d() > 0) {
                a3.f23458d = cVar.d();
            }
            a3.a((a) com.facebook.common.a.b.a());
            imagePipelineConfig = ImagePipelineConfig.newBuilder(a2).setNetworkFetcher(new com.bytedance.lighten.loader.a.c(cVar.b())).setBitmapMemoryCacheParamsSupplier(new d(activityManager)).setMemoryTrimmableRegistry(e.a()).setMainDiskCacheConfig(a3.a()).setBitmapsConfig(Bitmap.Config.RGB_565).setDownsampleEnabled(true).build();
        }
        this.f21811a = imagePipelineConfig;
        Fresco.initialize(cVar.a(), this.f21811a);
        f.a().f21816a = this.f21811a;
    }

    public final void a(d dVar, com.bytedance.lighten.core.d dVar2) {
        dVar.a(dVar2);
    }
}
