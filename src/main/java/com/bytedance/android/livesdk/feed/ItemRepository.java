package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.LifecycleObserver;
import com.bytedance.android.live.base.model.feed.FeedItem;
import java.util.List;

public interface ItemRepository<T extends FeedItem> extends LifecycleObserver {
    void b(String str);

    T c(String str);

    List<T> f();

    void g();
}
