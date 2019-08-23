package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.schema.a.d;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17201a;

    public final boolean canHandle(Uri uri) {
        if (!PatchProxy.isSupport(new Object[]{uri}, this, f17201a, false, 13178, new Class[]{Uri.class}, Boolean.TYPE)) {
            return TextUtils.equals("webcast_profile", uri.getHost());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, this, f17201a, false, 13178, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean handle(Context context, Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context, uri2}, this, f17201a, false, 13179, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, uri2}, this, f17201a, false, 13179, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        }
        String queryParameter = uri2.getQueryParameter("user_id");
        long j = 0;
        try {
            if (!TextUtils.isEmpty(queryParameter)) {
                j = Long.parseLong(queryParameter);
            }
        } catch (Throwable unused) {
        }
        return a(j, uri2.getQueryParameter("type"), null);
    }

    public final boolean a(long j, String str, Map<String, String> map) {
        long j2 = j;
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2, map2}, this, f17201a, false, 13180, new Class[]{Long.TYPE, String.class, Map.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), str2, map2}, this, f17201a, false, 13180, new Class[]{Long.TYPE, String.class, Map.class}, Boolean.TYPE)).booleanValue();
        }
        Room a2 = TTLiveSDKContext.getLiveService().d().a();
        if (j2 == 0) {
            j2 = TTLiveSDKContext.getHostService().k().b();
        }
        if (a2 != null && TextUtils.equals(str2, "half")) {
            a.a().a((Object) new UserProfileEvent(j2));
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            Bundle bundle = new Bundle();
            if (a2 != null) {
                bundle.putString("second_enter_room", String.valueOf(a2.getId()));
            }
            TTLiveSDKContext.getHostService().i().a(h.d(), j2, bundle);
        } else {
            TTLiveSDKContext.getHostService().i().a(j2, map2);
        }
        return true;
    }
}
