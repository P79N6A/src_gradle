package com.bytedance.android.livesdk.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17229a;

    public static String[] a(List<com.bytedance.android.livesdk.sticker.b.a> list) {
        List<com.bytedance.android.livesdk.sticker.b.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f17229a, true, 13340, new Class[]{List.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{list2}, null, f17229a, true, 13340, new Class[]{List.class}, String[].class);
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list2.get(i).r;
        }
        return strArr;
    }
}
