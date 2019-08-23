package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.g.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14277a;

    /* renamed from: b  reason: collision with root package name */
    private final CommonLiveViewHolder f14278b;

    /* renamed from: c  reason: collision with root package name */
    private final FeedItem f14279c;

    /* renamed from: d  reason: collision with root package name */
    private final Room f14280d;

    k(CommonLiveViewHolder commonLiveViewHolder, FeedItem feedItem, Room room) {
        this.f14278b = commonLiveViewHolder;
        this.f14279c = feedItem;
        this.f14280d = room;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14277a, false, 8735, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14277a, false, 8735, new Class[]{View.class}, Void.TYPE);
            return;
        }
        CommonLiveViewHolder commonLiveViewHolder = this.f14278b;
        FeedItem feedItem = this.f14279c;
        Room room = this.f14280d;
        commonLiveViewHolder.a(feedItem);
        a b2 = a.b();
        if (PatchProxy.isSupport(new Object[]{view, room}, b2, a.f14167b, false, 8768, new Class[]{View.class, Room.class}, Void.TYPE)) {
            a aVar = b2;
            PatchProxy.accessDispatch(new Object[]{view, room}, aVar, a.f14167b, false, 8768, new Class[]{View.class, Room.class}, Void.TYPE);
        } else if (room != null && view != null) {
            JSONObject jSONObject = new JSONObject();
            User owner = room.getOwner();
            if (owner != null) {
                String title = room.title();
                String nickName = owner.getNickName();
                String city = owner.getCity();
                try {
                    jSONObject.put(PushConstants.TITLE, title);
                    jSONObject.put("nickName", nickName);
                    jSONObject.put("city", city);
                    jSONObject.put("action", "View#onClick()");
                    jSONObject.put("className", view.getClass().getName());
                } catch (JSONException unused) {
                }
                b2.a("ttlive_page", jSONObject);
            }
        }
    }
}
