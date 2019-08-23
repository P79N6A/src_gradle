package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.common.utility.tools.SafelyLibraryLoader;
import com.bytedance.frameworks.plugin.core.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.lang.reflect.Field;
import java.util.List;

public final class v implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75966a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f75967b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f75968c;

    /* renamed from: d  reason: collision with root package name */
    private Context f75969d;

    public final boolean a(List<String> list) {
        List<String> list2 = list;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f75966a, false, 88011, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2}, this, f75966a, false, 88011, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        } else if (f75968c) {
            return true;
        } else {
            if (list2 != null && list.size() > 0) {
                boolean booleanValue = ((Boolean) SharePrefCache.inst().getUseNewFFmpeg().c()).booleanValue();
                boolean z2 = false;
                boolean z3 = true;
                for (int i = 0; i < list.size(); i++) {
                    if (booleanValue) {
                        String str = list2.get(i);
                        if ("ffmpeg".equals(str)) {
                            str = "ttffmpeg";
                        }
                        z2 = j.a("com.ss.android.ugc.aweme.ffmpeg_so", str);
                        z3 &= z2;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z3 &= SafelyLibraryLoader.loadLibrary(this.f75969d, list2.get(i));
                    }
                }
                if (z2 && j.a("com.ss.android.ugc.aweme.ffmpeg_so", "livestream")) {
                    try {
                        Field declaredField = SafelyLibraryLoader.class.getDeclaredField("sLoadedLibs");
                        declaredField.setAccessible(true);
                        List list3 = (List) declaredField.get(null);
                        if (list3 != null && !list3.contains("livestream")) {
                            list3.add("livestream");
                            declaredField.set(null, list3);
                        }
                    } catch (Exception unused) {
                    }
                    z3 = true;
                }
                f75967b = z2;
                f75968c = true;
                z = z3;
            }
            return z;
        }
    }
}
