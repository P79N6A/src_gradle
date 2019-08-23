package com.ss.android.ugc.aweme.login;

import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.http.a.b.e;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53739a;

    public static String a(List<e> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f53739a, true, 56330, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list}, null, f53739a, true, 56330, new Class[]{List.class}, String.class);
        } else if (list == null) {
            return "";
        } else {
            ArrayList arrayList = new ArrayList();
            for (e next : list) {
                if (next != null) {
                    if (TextUtils.equals("mobile", next.a()) || TextUtils.equals("type", next.a()) || TextUtils.equals("oldmobile", next.a()) || TextUtils.equals("code", next.a())) {
                        arrayList.add(new e(next.a(), StringUtils.decryptWithXor(next.b(), new Boolean[0])));
                    } else {
                        arrayList.add(new e(next.a(), next.b()));
                    }
                }
            }
            return arrayList.toString();
        }
    }
}
