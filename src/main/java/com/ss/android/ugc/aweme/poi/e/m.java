package com.ss.android.ugc.aweme.poi.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59812a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f59812a, true, 66857, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f59812a, true, 66857, new Class[]{String.class}, String.class);
        }
        return GlobalContext.getContext().getFilesDir().getPath() + "/mapthumb/" + str2 + ".jpg";
    }

    public static UrlModel b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f59812a, true, 66858, new Class[]{String.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{str}, null, f59812a, true, 66858, new Class[]{String.class}, UrlModel.class);
        }
        String a2 = a(str);
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add("file://" + a2);
        urlModel.setUrlList(arrayList);
        urlModel.setUri("file://" + a2);
        return urlModel;
    }

    public static boolean c(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f59812a, true, 66859, new Class[]{String.class}, Boolean.TYPE)) {
            return new File(a(str)).exists();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f59812a, true, 66859, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }
}
