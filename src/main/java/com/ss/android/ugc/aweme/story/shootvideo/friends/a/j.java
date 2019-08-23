package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.tools.AVApi;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73548a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f73549b = (((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI() + "/aweme/v2/user/recommend/");

    /* renamed from: c  reason: collision with root package name */
    private static final String f73550c = (((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI() + "/aweme/v1/friends/");

    public static a a(int i, int i2) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f73548a, true, 85332, new Class[]{Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f73548a, true, 85332, new Class[]{Integer.TYPE, Integer.TYPE}, a.class);
        }
        i iVar = new i(f73550c);
        iVar.a("count", i);
        iVar.a("cursor", i2);
        return (a) ((AVApi) ServiceManager.get().getService(AVApi.class)).executeGetJSONObject(iVar.toString(), a.class, null);
    }

    public static l a(int i, int i2, String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{10, Integer.valueOf(i2), str2}, null, f73548a, true, 85331, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{10, Integer.valueOf(i2), str2}, null, f73548a, true, 85331, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, l.class);
        }
        i iVar = new i(f73549b);
        iVar.a("count", 10);
        iVar.a("target_user_id", str2);
        iVar.a("cursor", i2);
        iVar.a("recommend_type", 8);
        iVar.a("yellow_point_count", 0);
        iVar.a("address_book_access", a.f61121d.h());
        iVar.a("gps_access", a.f61121d.i());
        return (l) ((AVApi) ServiceManager.get().getService(AVApi.class)).executeGetJSONObject(iVar.toString(), l.class, null);
    }
}
