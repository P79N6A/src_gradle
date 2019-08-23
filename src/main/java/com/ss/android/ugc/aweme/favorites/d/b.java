package com.ss.android.ugc.aweme.favorites.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44282a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f44282a, true, 39684, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f44282a, true, 39684, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!((Boolean) SharePrefCache.inst().getIsFirstFavouriteSuccess().c()).booleanValue() || !((Boolean) SharePrefCache.inst().getShouldShowFavouriteTip().c()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean a(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, null, f44282a, true, 39685, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, null, f44282a, true, 39685, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!aweme.isCollected() || i != 2004) {
            return false;
        } else {
            return true;
        }
    }
}
