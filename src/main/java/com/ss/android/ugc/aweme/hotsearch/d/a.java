package com.ss.android.ugc.aweme.hotsearch.d;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49720a;

    /* renamed from: b  reason: collision with root package name */
    private static Gson f49721b = new Gson();

    /* renamed from: c  reason: collision with root package name */
    private static List<HotSearchItem> f49722c;

    private static List<HotSearchItem> b() {
        return f49722c;
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f49720a, true, 49802, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f49720a, true, 49802, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!((Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().c()).booleanValue() || !AbTestManager.a().az()) {
            return false;
        }
        return true;
    }

    public static void a(List<HotSearchItem> list) {
        f49722c = list;
    }

    public static int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f49720a, true, 49806, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f49720a, true, 49806, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        List<HotSearchItem> b2 = b();
        if (b2 != null && !TextUtils.isEmpty(str)) {
            for (HotSearchItem next : b2) {
                if (!TextUtils.equals(str2, next.getRealSearchWord())) {
                    if (TextUtils.equals(str2, next.getWord())) {
                    }
                }
                return next.getPosition();
            }
        }
        return -1;
    }
}
