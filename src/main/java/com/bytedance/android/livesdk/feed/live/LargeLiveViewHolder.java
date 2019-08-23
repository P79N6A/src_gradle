package com.bytedance.android.livesdk.feed.live;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.dislike.a;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;

public class LargeLiveViewHolder extends CommonLiveViewHolder {
    public static ChangeQuickRedirect y = null;
    public static int z = -1;

    public final int g() {
        return 1;
    }

    public final void a(FeedItem feedItem) {
        if (PatchProxy.isSupport(new Object[]{feedItem}, this, y, false, 8756, new Class[]{FeedItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem}, this, y, false, 8756, new Class[]{FeedItem.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("live_source", "live_big_picture");
        String str = this.f14224f.f14075c;
        if (str.contains("live") && FeedLiveFragment.C != null) {
            this.i = FeedLiveFragment.C;
            str = FeedLiveFragment.C.h;
        }
        bundle2.putString("subtab", str);
        bundle.putString("source", str);
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
        bundle.putString("log_pb", feedItem.logPb);
        bundle.putString("request_id", feedItem.resId);
        bundle.putLong("live.intent.extra.USER_FROM", (long) this.i.i);
        bundle.putString("enter_from", "live");
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        a(feedItem, true, "big_picture", bundle);
    }

    public final void a(@NonNull FeedItem feedItem, @NonNull Room room, int i) {
        if (PatchProxy.isSupport(new Object[]{feedItem, room, Integer.valueOf(i)}, this, y, false, 8755, new Class[]{FeedItem.class, Room.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem, room, Integer.valueOf(i)}, this, y, false, 8755, new Class[]{FeedItem.class, Room.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(feedItem, room, i);
        if (!TextUtils.isEmpty(room.getDistanceCity())) {
            this.r.setText(room.getDistanceCity());
        } else if (!TextUtils.isEmpty(room.getDistance())) {
            this.r.setText(room.getDistance());
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_function");
            hashMap.put("event_page", "city");
            hashMap.put("event_type", "show");
            b.a().a("boost_info_show", hashMap);
        }
        if (z <= 0) {
            z = UIUtils.getScreenWidth(this.m.getContext());
        }
        HSImageView hSImageView = this.m;
        int i2 = z;
        hSImageView.setLayoutParams(new RelativeLayout.LayoutParams(i2, i2));
    }

    public LargeLiveViewHolder(View view, a aVar, g gVar, c cVar, k kVar, f fVar, PublishSubject<FeedItem> publishSubject, PublishSubject<Boolean> publishSubject2, PublishSubject<Object> publishSubject3, PublishSubject<Object> publishSubject4, com.bytedance.android.livesdkapi.depend.d.g gVar2) {
        super(view, aVar, gVar, cVar, kVar, fVar, publishSubject, publishSubject2, publishSubject3, publishSubject4, gVar2);
    }
}
