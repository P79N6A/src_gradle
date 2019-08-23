package com.ss.android.ugc.aweme.user;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.ae;
import com.ss.android.ugc.aweme.main.h.e;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75297a;

    public static Set<String> a(Set<String> set) {
        Set<String> set2 = set;
        if (PatchProxy.isSupport(new Object[]{set2}, null, f75297a, true, 87493, new Class[]{Set.class}, Set.class)) {
            return (Set) PatchProxy.accessDispatch(new Object[]{set2}, null, f75297a, true, 87493, new Class[]{Set.class}, Set.class);
        }
        if (set2.contains("avatar_uri")) {
            set2.remove("avatar_uri");
            set2.add("avatar_larger");
            set2.add("avatar_thumb");
            set2.add("avatar_medium");
        }
        if (set2.contains("video_icon_virtual_URI")) {
            set2.remove("video_icon_virtual_URI");
            set2.add("video_icon");
        }
        if (set2.contains("poi_id")) {
            set2.remove("poi_id");
            set2.add("school_poi_id");
        }
        return set2;
    }

    public static User a(String str, boolean z) throws Exception {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, f75297a, true, 87492, new Class[]{String.class, Boolean.TYPE}, User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[]{str3, Byte.valueOf(z)}, null, f75297a, true, 87492, new Class[]{String.class, Boolean.TYPE}, User.class);
        }
        i iVar = new i(str3);
        if (z) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        iVar.a("is_after_login", str2);
        return ((e) ae.a(e.class)).a(iVar.toString());
    }

    public static void a(User user, User user2, Set<String> set) {
        User user3 = user;
        User user4 = user2;
        Set<String> set2 = set;
        if (PatchProxy.isSupport(new Object[]{user3, user4, set2}, null, f75297a, true, 87494, new Class[]{User.class, User.class, Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user3, user4, set2}, null, f75297a, true, 87494, new Class[]{User.class, User.class, Set.class}, Void.TYPE);
        } else if (set2 != null && !TextUtils.isEmpty(user.getUid())) {
            for (Field field : User.class.getDeclaredFields()) {
                SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                if (serializedName != null && !set2.contains(serializedName.value())) {
                    try {
                        field.setAccessible(true);
                        field.set(user4, field.get(user3));
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
    }
}
