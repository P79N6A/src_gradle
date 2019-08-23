package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.banner.BannerViewHolder;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.n;
import io.reactivex.subjects.PublishSubject;

public class LiveBannerViewHolder extends BannerViewHolder {
    public LiveBannerViewHolder(View view, BannerSwipeRefreshLayout.a aVar, c cVar, PublishSubject<Object> publishSubject, PublishSubject<Object> publishSubject2, PublishSubject<Boolean> publishSubject3, n nVar) {
        super(view, aVar, cVar, publishSubject, publishSubject2, publishSubject3, nVar);
    }
}
