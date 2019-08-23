package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends d<Object, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9587a;

    private void a(User user, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{user, jSONObject2}, this, f9587a, false, 3667, new Class[]{User.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, jSONObject2}, this, f9587a, false, 3667, new Class[]{User.class, JSONObject.class}, Void.TYPE);
            return;
        }
        jSONObject2.put("short_id", user.getShortId());
        jSONObject2.put("user_id", user.getId());
        if (user.getAvatarThumb() != null) {
            jSONObject2.put("avatar", user.getAvatarThumb().getUrls().get(0));
        }
        jSONObject2.put("nickname", user.getNickName());
        jSONObject2.put("user_level", user.getLevel());
        if (user.getAnchorInfo() != null) {
            jSONObject2.put("anchor_level", user.getAnchorInfo().f7738b);
            jSONObject2.put("anchor_type", user.getAnchorInfo().f7739c);
        }
    }

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        if (PatchProxy.isSupport(new Object[]{obj, fVar}, this, f9587a, false, 3666, new Class[]{Object.class, f.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{obj, fVar}, this, f9587a, false, 3666, new Class[]{Object.class, f.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        User from = User.from(TTLiveSDKContext.getHostService().k().a());
        JSONObject jSONObject2 = new JSONObject();
        a(from, jSONObject2);
        jSONObject.put("user_info", jSONObject2);
        Room a2 = TTLiveSDKContext.getLiveService().d().a();
        if (a2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("room_id", a2.getId());
            jSONObject.put("room_info", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            a(a2.getOwner(), jSONObject4);
            jSONObject.put("anchor_info", jSONObject4);
        }
        jSONObject.put("code", 1);
        return jSONObject;
    }
}
