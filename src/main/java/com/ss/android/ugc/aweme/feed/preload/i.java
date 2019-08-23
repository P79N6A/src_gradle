package com.ss.android.ugc.aweme.feed.preload;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public final class i extends a<FeedItemList> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f45785c;

    public final /* synthetic */ void a(Object obj) throws Exception {
        FeedItemList feedItemList = (FeedItemList) obj;
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, f45785c, false, 42009, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, f45785c, false, 42009, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        if (feedItemList != null && !CollectionUtils.isEmpty(feedItemList.items)) {
            Aweme aweme = feedItemList.items.get(0);
            if (Fresco.hasBeenInitialized()) {
                ImageRequest[] a2 = c.a(aweme.getVideo().getOriginCover(), (ResizeOptions) null, Priority.HIGH, (Postprocessor) null);
                if (a2 != null && a2.length != 0) {
                    Fresco.getImagePipeline().fetchDecodedImage(a2[0], k.a());
                }
            }
        }
    }
}
