package com.ss.android.ugc.aweme.user.util;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.model.DouyinContactModel;
import com.ss.android.ugc.aweme.utils.ap;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75408a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f75409b = new c();

    private c() {
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f75408a, false, 87754, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f75408a, false, 87754, new Class[0], Object.class);
        }
        List<DouyinContactModel> a2 = ap.a(k.a());
        if (CollectionUtils.isEmpty(a2)) {
            return null;
        }
        return UploadContactsApi.a(a2, 1);
    }
}
