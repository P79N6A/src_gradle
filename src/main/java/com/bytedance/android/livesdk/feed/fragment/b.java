package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.Observer;
import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.common.utility.Lists;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14136a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedFragment f14137b;

    b(BaseFeedFragment baseFeedFragment) {
        this.f14137b = baseFeedFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14136a, false, 8616, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14136a, false, 8616, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BaseFeedFragment baseFeedFragment = this.f14137b;
        for (ImageModel imageModel : (List) obj) {
            Context context = baseFeedFragment.getContext();
            if (PatchProxy.isSupport(new Object[]{context, imageModel}, null, k.f8293a, true, 1127, new Class[]{Context.class, ImageModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, imageModel}, null, k.f8293a, true, 1127, new Class[]{Context.class, ImageModel.class}, Void.TYPE);
            } else if (!(context == null || imageModel == null || Lists.isEmpty(imageModel.getUrls()))) {
                Fresco.getImagePipeline().prefetchToBitmapCache(ImageRequest.fromUri(imageModel.getUrls().get(0)), context);
            }
        }
    }
}
