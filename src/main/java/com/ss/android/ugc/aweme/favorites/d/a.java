package com.ss.android.ugc.aweme.favorites.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44279a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f44280b = "personal_homepage";

    /* renamed from: c  reason: collision with root package name */
    private static boolean f44281c;

    /* renamed from: com.ss.android.ugc.aweme.favorites.d.a$a  reason: collision with other inner class name */
    public interface C0553a {
        void a();
    }

    public static boolean a() {
        return f44281c;
    }

    public static void a(boolean z) {
        f44281c = z;
    }

    private static String a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f44279a, true, 39682, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f44279a, true, 39682, new Class[]{Integer.TYPE}, String.class);
        }
        switch (i) {
            case 1:
                return "show_personal_collection";
            case 2:
                return "click_personal_collection";
            default:
                throw new IllegalArgumentException("wrong action value");
        }
    }

    private static d b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, null, f44279a, true, 39681, new Class[]{String.class, String.class}, d.class)) {
            return d.a().a(PushConstants.CONTENT, str3).a("enter_from", str4);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f44279a, true, 39681, new Class[]{String.class, String.class}, d.class);
    }

    public static void c(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39679, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39679, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        r.a(a(i), (Map) b("music", "collection_music").a("music_id", str2).f34114b);
    }

    public static void d(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39680, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39680, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        r.a(a(i), (Map) b("prop", "prop_collection").a("prop_id", str2).f34114b);
    }

    public static void a(int i, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aweme}, null, f44279a, true, 39676, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aweme}, null, f44279a, true, 39676, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        r.a(a(i), (Map) b("video", "collection_video").a("author_id", aa.a(aweme)).a("group_id", aa.m(aweme)).a("music_id", aa.k(aweme)).a("poi_id", aa.e(aweme)).f34114b);
    }

    public static void b(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39678, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39678, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        r.a(a(i), (Map) b("tag", "collection_tag").a("tag_id", str2).f34114b);
    }

    public static void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39677, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f44279a, true, 39677, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        r.a(a(i), (Map) b("poi", "collection_poi").a("poi_id", str2).f34114b);
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f44279a, true, 39675, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f44279a, true, 39675, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("change_personal_collection_tab", (Map) d.a().a("enter_from", f44280b).a("enter_method", str3).a("tab_name", str4).f34114b);
    }
}
