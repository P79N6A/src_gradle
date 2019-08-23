package com.ss.android.ugc.aweme.effectplatform;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43803a;

    @NonNull
    public static UrlModel a(@Nullable com.ss.android.ugc.effectmanager.common.model.UrlModel urlModel) {
        com.ss.android.ugc.effectmanager.common.model.UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, null, f43803a, true, 38904, new Class[]{com.ss.android.ugc.effectmanager.common.model.UrlModel.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{urlModel2}, null, f43803a, true, 38904, new Class[]{com.ss.android.ugc.effectmanager.common.model.UrlModel.class}, UrlModel.class);
        }
        UrlModel urlModel3 = new UrlModel();
        if (urlModel2 != null) {
            urlModel3.setUri(urlModel2.uri);
            urlModel3.setUrlList(new ArrayList(urlModel2.url_list));
        }
        return urlModel3;
    }
}
