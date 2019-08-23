package com.ss.android.ugc.aweme.language;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import java.util.HashMap;

public final /* synthetic */ class c implements NetUtil.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52999a;

    /* renamed from: b  reason: collision with root package name */
    static final NetUtil.b f53000b = new c();

    private c() {
    }

    public final HashMap a() {
        if (!PatchProxy.isSupport(new Object[0], this, f52999a, false, 55053, new Class[0], HashMap.class)) {
            return I18nManagerServiceImpl.lambda$installCommonParams$0$I18nManagerServiceImpl();
        }
        return (HashMap) PatchProxy.accessDispatch(new Object[0], this, f52999a, false, 55053, new Class[0], HashMap.class);
    }
}
