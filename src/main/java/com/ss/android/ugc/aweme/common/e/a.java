package com.ss.android.ugc.aweme.common.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40209a;

    /* renamed from: b  reason: collision with root package name */
    private static UrlModel f40210b;

    public static UrlModel a() {
        if (PatchProxy.isSupport(new Object[0], null, f40209a, true, 33453, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], null, f40209a, true, 33453, new Class[0], UrlModel.class);
        }
        if (f40210b == null) {
            UrlModel urlModel = new UrlModel();
            f40210b = urlModel;
            urlModel.setHeight(720);
            f40210b.setWidth(720);
            f40210b.setUri("c8510002be9a3a61aad2");
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("https://p1.pstatp.com/obj/c8510002be9a3a61aad2");
            arrayList.add("https://pb3.pstatp.com/obj/c8510002be9a3a61aad2");
            f40210b.setUrlList(arrayList);
        }
        return f40210b;
    }
}
