package com.bytedance.android.livesdk.live.data;

import com.bytedance.android.live.a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15842a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f15843b = ("https://" + TTLiveSDKContext.getLiveHostDomain() + "/webcast/feed/?style=2");

    /* renamed from: c  reason: collision with root package name */
    public FeedApi f15844c = ((FeedApi) j.q().d().a(FeedApi.class));

    /* access modifiers changed from: package-private */
    public void a(List<FeedItem> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15842a, false, 10318, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15842a, false, 10318, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            for (FeedItem next : list) {
                if (next != null && next.item == null) {
                    try {
                        next.item = (com.bytedance.android.live.base.model.d) a.a().fromJson((JsonElement) next.data, Room.class);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
