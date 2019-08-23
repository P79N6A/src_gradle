package com.bytedance.android.livesdk.j;

import android.text.TextUtils;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

@Deprecated
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15716a;

    /* renamed from: b  reason: collision with root package name */
    private static final Double f15717b = Double.valueOf(-0.0d);

    public static void a(String str, al.b bVar, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, bVar, null, str6}, null, f15716a, true, 10893, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, bVar, null, str6}, null, f15716a, true, 10893, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (str5.equals("android.permission.ACCESS_FINE_LOCATION")) {
            str4 = "system_position";
        } else if (str5.equals("android.permission.READ_PHONE_STATE")) {
            str4 = "call";
        } else if (str5.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            str4 = "save";
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            j jVar = new j();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(null)) {
                jVar.d(null);
            }
            if (!TextUtils.isEmpty(str3)) {
                jVar.g(str6);
            }
            hashMap.put("popup_type", str4);
            a.a().a("system_popup", hashMap, jVar.b("video").f(bVar.getType()));
        }
    }
}
