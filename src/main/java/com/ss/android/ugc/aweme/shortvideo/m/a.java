package com.ss.android.ugc.aweme.shortvideo.m;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.s.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68365a;

    public static boolean a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, f68365a, true, 78515, new Class[]{f.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fVar2}, null, f68365a, true, 78515, new Class[]{f.class}, Boolean.TYPE)).booleanValue();
        } else if ((fVar2.f69150c != 2 || !com.ss.android.g.a.a()) && !com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ShutterSoundEnable)) {
            return false;
        } else {
            return true;
        }
    }
}
