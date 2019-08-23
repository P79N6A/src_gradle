package com.ss.android.ugc.aweme.story.metrics.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73141a;

    public static boolean a(b bVar) {
        if (!PatchProxy.isSupport(new Object[]{bVar}, null, f73141a, true, 84788, new Class[]{b.class}, Boolean.TYPE)) {
            return g.c(bVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, null, f73141a, true, 84788, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
    }

    public static LogPbBean b(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, null, f73141a, true, 84789, new Class[]{b.class}, LogPbBean.class)) {
            return (LogPbBean) PatchProxy.accessDispatch(new Object[]{bVar}, null, f73141a, true, 84789, new Class[]{b.class}, LogPbBean.class);
        } else if (bVar == null) {
            return null;
        } else {
            return bVar.getLogPb();
        }
    }

    public static int a(@Nullable UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, null, f73141a, true, 84787, new Class[]{UserStory.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{userStory}, null, f73141a, true, 84787, new Class[]{UserStory.class}, Integer.TYPE)).intValue();
        } else if (userStory != null) {
            return userStory.getFriendType();
        } else {
            return 0;
        }
    }

    public static JSONObject a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f73141a, true, 84786, new Class[]{Map.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{map2}, null, f73141a, true, 84786, new Class[]{Map.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        if (map2 != null) {
            for (String next : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", next)) {
                        jSONObject.put(next, new JSONObject(map2.get(next)));
                    } else {
                        jSONObject.put(next, map2.get(next));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
