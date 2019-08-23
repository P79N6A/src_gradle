package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.livesdk.feed.d.c;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

public interface IFeedRepository extends ItemRepository<FeedItem> {

    public @interface LoadMoreFrom {
    }

    public @interface RefreshFrom {
    }

    public interface a {
        c a();

        int b();

        int c();
    }

    com.bytedance.android.livesdk.feed.d.a<b<FeedItem>, com.bytedance.android.livesdk.feed.d.b> a(String str);

    PublishSubject<Object> a();

    void a(LifecycleOwner lifecycleOwner);

    void a(a aVar);

    void a(@RefreshFrom String str, @LoadMoreFrom String str2);

    Observable<String> b();

    Observable<List<ImageModel>> c();

    void d();

    g e();
}
