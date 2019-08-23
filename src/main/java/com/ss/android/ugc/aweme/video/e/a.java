package com.ss.android.ugc.aweme.video.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76054a;

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f76054a, true, 89318, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76054a, true, 89318, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return ((Boolean) SharePrefCache.inst().getVideoPreload().c()).booleanValue();
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f76054a, true, 89317, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76054a, true, 89317, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!((Boolean) SharePrefCache.inst().getVideoPreload().c()).booleanValue() || (!com.ss.android.ugc.aweme.framework.d.a.a(k.a()) && ((Integer) SharePrefCache.inst().getWeakNetPreLoadSwitch().c()).intValue() != 1)) {
            return false;
        }
        return true;
    }
}
