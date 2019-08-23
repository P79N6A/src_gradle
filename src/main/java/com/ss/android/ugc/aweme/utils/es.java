package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.tools.bb;

public final class es {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75846a;

    public static bb a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, f75846a, true, 88635, new Class[]{UrlModel.class}, bb.class)) {
            return (bb) PatchProxy.accessDispatch(new Object[]{urlModel}, null, f75846a, true, 88635, new Class[]{UrlModel.class}, bb.class);
        }
        bb bbVar = new bb();
        bbVar.f74652b = urlModel.getUri();
        bbVar.f74653c = urlModel.getUrlList();
        return bbVar;
    }
}
