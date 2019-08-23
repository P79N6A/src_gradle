package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52469a;

    public static UrlModel a(String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52469a, true, 53668, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52469a, true, 53668, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, UrlModel.class);
        } else if (str2 == null) {
            return null;
        } else {
            UrlModel urlModel = new UrlModel();
            urlModel.setHeight(i2);
            urlModel.setWidth(i);
            urlModel.setUri(str2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            urlModel.setUrlList(arrayList);
            return urlModel;
        }
    }
}
