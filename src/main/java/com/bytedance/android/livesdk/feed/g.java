package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.d.f;
import java.util.List;

public interface g extends i {
    ItemRepository a(c cVar);

    void a();

    void a(c cVar, ItemRepository itemRepository);

    void a(c cVar, String str);

    void a(f fVar);

    void a(String str, List<FeedItem> list, Extra extra, boolean z);

    void b(f fVar);

    boolean b(c cVar, ItemRepository itemRepository);
}
