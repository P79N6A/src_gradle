package com.ss.android.ugc.aweme.feed;

import a.g;
import a.i;
import android.content.Context;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.api.UserPreferApi;
import com.ss.android.ugc.aweme.feed.model.UserPreferVideo;
import com.ss.android.ugc.aweme.feed.model.UserPreferVideoModel;
import com.ss.android.ugc.aweme.feed.ui.bd;
import com.ss.android.ugc.aweme.setting.model.UserPreferSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45067a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f45068b;

    /* renamed from: c  reason: collision with root package name */
    public static UserPreferSettings f45069c;

    /* renamed from: d  reason: collision with root package name */
    public static int f45070d;

    /* renamed from: e  reason: collision with root package name */
    public static int f45071e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f45072f;
    public static boolean g;
    public static String h;
    public static List<String> i = new ArrayList();
    public static i<UserPreferVideoModel> j;
    private static boolean k;

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f45067a, true, 40269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f45067a, true, 40269, new Class[0], Void.TYPE);
        } else {
            r.a("enter_preference", (Map) d.a().a("video_cnt", f45070d - 1).f34114b);
        }
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f45067a, true, 40260, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45067a, true, 40260, new Class[0], Boolean.TYPE)).booleanValue();
        }
        d();
        if (a.a() && !com.ss.android.ugc.aweme.account.d.a().isLogin() && !f45068b) {
            z = true;
        }
        return z;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f45067a, true, 40261, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45067a, true, 40261, new Class[0], Boolean.TYPE)).booleanValue();
        }
        f45070d++;
        if (!a() || f45069c == null || f45070d > f45069c.n) {
            return false;
        }
        return true;
    }

    private static void d() {
        if (PatchProxy.isSupport(new Object[0], null, f45067a, true, 40267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f45067a, true, 40267, new Class[0], Void.TYPE);
            return;
        }
        if (!k) {
            f45068b = b.b().b((Context) k.a(), "user_prefer_has_show", false);
            f45069c = (UserPreferSettings) b.b().a((Context) k.a(), "user_prefer_settings", UserPreferSettings.class);
            k = true;
        }
    }

    public static void a(UserPreferSettings userPreferSettings) {
        if (PatchProxy.isSupport(new Object[]{userPreferSettings}, null, f45067a, true, 40259, new Class[]{UserPreferSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userPreferSettings}, null, f45067a, true, 40259, new Class[]{UserPreferSettings.class}, Void.TYPE);
            return;
        }
        d();
        f45069c = userPreferSettings;
    }

    public static bd a(Context context, String str) {
        i<UserPreferVideoModel> iVar;
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f45067a, true, 40271, new Class[]{Context.class, String.class}, bd.class)) {
            return (bd) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f45067a, true, 40271, new Class[]{Context.class, String.class}, bd.class);
        } else if (i.contains(str2)) {
            return null;
        } else {
            h = str2;
            final bd bdVar = new bd(context2);
            if (PatchProxy.isSupport(new Object[]{0}, null, f45067a, true, 40266, new Class[]{Integer.TYPE}, i.class)) {
                iVar = (i) PatchProxy.accessDispatch(new Object[]{0}, null, f45067a, true, 40266, new Class[]{Integer.TYPE}, i.class);
            } else if (j == null || j.d()) {
                iVar = UserPreferApi.a(0);
            } else {
                iVar = j;
            }
            iVar.a((g<TResult, TContinuationResult>) new g<UserPreferVideoModel, Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45073a;

                public final Object then(i<UserPreferVideoModel> iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f45073a, false, 40272, new Class[]{i.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f45073a, false, 40272, new Class[]{i.class}, Object.class);
                    }
                    if (iVar.b() && !iVar.d()) {
                        bd bdVar = bdVar;
                        List<UserPreferVideo> list = ((UserPreferVideoModel) iVar.e()).videoList;
                        if (PatchProxy.isSupport(new Object[]{list}, bdVar, bd.f46566a, false, 43099, new Class[]{List.class}, Void.TYPE)) {
                            bd bdVar2 = bdVar;
                            PatchProxy.accessDispatch(new Object[]{list}, bdVar2, bd.f46566a, false, 43099, new Class[]{List.class}, Void.TYPE);
                        } else if (!CollectionUtils.isEmpty(list) && list.size() >= 9) {
                            bdVar.f46571f = list;
                            bdVar.j = false;
                            bdVar.h = -1;
                            bdVar.a();
                        }
                    }
                    return null;
                }
            }, i.f1052b);
            return bdVar;
        }
    }
}
