package com.bytedance.android.livesdk.feed.live;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.b;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.dislike.a;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public class SmallLiveViewHolder extends CommonLiveViewHolder {
    public static ChangeQuickRedirect y = null;
    public static int z = -1;

    public final int g() {
        return 2;
    }

    public final void a(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, this, y, false, 8765, new Class[]{ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel}, this, y, false, 8765, new Class[]{ImageModel.class}, Void.TYPE);
        } else if (imageModel == null) {
            a(0, 0);
        } else {
            a(imageModel.width, imageModel.height);
        }
    }

    public final void a(FeedItem feedItem) {
        if (PatchProxy.isSupport(new Object[]{feedItem}, this, y, false, 8763, new Class[]{FeedItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem}, this, y, false, 8763, new Class[]{FeedItem.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        String str = this.f14224f.f14075c;
        if (str.contains("live") && FeedLiveFragment.C != null) {
            this.i = FeedLiveFragment.C;
            str = FeedLiveFragment.C.h;
        }
        bundle.putString("source", str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("live_source", "live_small_picture");
        bundle2.putString("subtab", str);
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
        bundle.putString("log_pb", feedItem.logPb);
        bundle.putString("request_id", feedItem.resId);
        bundle.putString("enter_from", "live");
        bundle.putLong("live.intent.extra.USER_FROM", (long) this.i.i);
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        a(feedItem, true, "small_picture", bundle);
    }

    public final void a(@NonNull ImageModel imageModel, Room room) {
        if (PatchProxy.isSupport(new Object[]{imageModel, room}, this, y, false, 8762, new Class[]{ImageModel.class, Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel, room}, this, y, false, 8762, new Class[]{ImageModel.class, Room.class}, Void.TYPE);
            return;
        }
        a(imageModel.getWidth(), imageModel.getHeight());
        super.a(imageModel, room);
        if (b.f13989d) {
            a((View) this.r, 8);
            a(this.q, 8);
        }
    }

    private void a(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, y, false, 8764, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, y, false, 8764, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (z <= 0) {
            z = (UIUtils.getScreenWidth(this.itemView.getContext()) - 3) / 2;
        }
        if (i <= 0 || i2 <= 0) {
            i3 = z;
        } else {
            i3 = (z * i2) / i;
        }
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        if (layoutParams.width != z || layoutParams.height != i3) {
            layoutParams.width = z;
            layoutParams.height = i3;
            this.m.setLayoutParams(layoutParams);
        }
    }

    public final void a(@NonNull FeedItem feedItem, @NonNull Room room, int i) {
        if (PatchProxy.isSupport(new Object[]{feedItem, room, Integer.valueOf(i)}, this, y, false, 8761, new Class[]{FeedItem.class, Room.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem, room, Integer.valueOf(i)}, this, y, false, 8761, new Class[]{FeedItem.class, Room.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(feedItem, room, i);
        a(this.q, 8);
    }

    public SmallLiveViewHolder(View view, a aVar, g gVar, c cVar, k kVar, f fVar, PublishSubject<FeedItem> publishSubject, PublishSubject<Boolean> publishSubject2, PublishSubject<Object> publishSubject3, PublishSubject<Object> publishSubject4, com.bytedance.android.livesdkapi.depend.d.g gVar2) {
        super(view, aVar, gVar, cVar, kVar, fVar, publishSubject, publishSubject2, publishSubject3, publishSubject4, gVar2);
    }
}
