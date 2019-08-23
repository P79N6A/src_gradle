package com.ss.android.ugc.aweme.ag;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33249a;

    @Insert
    @TargetClass
    static boolean a(h hVar, Activity activity, String str) {
        if (PatchProxy.isSupport(new Object[]{hVar, activity, str}, null, f33249a, true, 70966, new Class[]{h.class, Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar, activity, str}, null, f33249a, true, 70966, new Class[]{h.class, Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.lancet.i.a(str);
        return hVar.b(activity, str);
    }

    @Insert
    @TargetClass
    static boolean a(h hVar, Activity activity, String str, View view) {
        if (PatchProxy.isSupport(new Object[]{hVar, activity, str, view}, null, f33249a, true, 70968, new Class[]{h.class, Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar, activity, str, view}, null, f33249a, true, 70968, new Class[]{h.class, Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.lancet.i.a(str);
        return hVar.b(activity, str, view);
    }

    @Insert
    @TargetClass
    static boolean a(h hVar, String str) {
        if (PatchProxy.isSupport(new Object[]{hVar, str}, null, f33249a, true, 70964, new Class[]{h.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar, str}, null, f33249a, true, 70964, new Class[]{h.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.lancet.i.a(str);
        return hVar.b(str);
    }

    @Insert
    @TargetClass
    static boolean a(h hVar, String str, HashMap hashMap) {
        if (PatchProxy.isSupport(new Object[]{hVar, str, hashMap}, null, f33249a, true, 70965, new Class[]{h.class, String.class, HashMap.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar, str, hashMap}, null, f33249a, true, 70965, new Class[]{h.class, String.class, HashMap.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.lancet.i.a(str);
        return hVar.b(str, hashMap);
    }
}
