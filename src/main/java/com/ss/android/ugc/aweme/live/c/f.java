package com.ss.android.ugc.aweme.live.c;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53356a;

    private static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f53356a, true, 55976, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f53356a, true, 55976, new Class[]{String.class}, String.class);
        } else if (str2 == null || str.isEmpty()) {
            return "";
        } else {
            File file = new File(str2);
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2.isDirectory()) {
                        for (File file3 : file2.listFiles()) {
                            if (file3.getName().endsWith(".png")) {
                                return file3.getAbsolutePath();
                            }
                        }
                        continue;
                    }
                }
            }
            return str2;
        }
    }

    public static List<h> a(List<Pair<String, String>> list) {
        List<Pair<String, String>> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f53356a, true, 55975, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, null, f53356a, true, 55975, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list2.get(i).second;
            h hVar = new h();
            hVar.f47602f = i;
            hVar.f47599c = (String) list2.get(i).first;
            hVar.i = a(str);
            hVar.j = str;
            hVar.h = str + "/thumbnail.jpg";
            arrayList.add(hVar);
        }
        return arrayList;
    }
}
