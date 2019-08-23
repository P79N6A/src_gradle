package com.ss.android.ugc.aweme.setting.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/setting/model/IVerifyActionCache;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
final class VerifyActionManager$Companion$CACHE$2 extends Lambda implements Function0<IVerifyActionCache> {
    public static final VerifyActionManager$Companion$CACHE$2 INSTANCE = new VerifyActionManager$Companion$CACHE$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    VerifyActionManager$Companion$CACHE$2() {
        super(0);
    }

    public final IVerifyActionCache invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72255, new Class[0], IVerifyActionCache.class)) {
            return (IVerifyActionCache) c.a(k.a(), IVerifyActionCache.class);
        }
        return (IVerifyActionCache) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72255, new Class[0], IVerifyActionCache.class);
    }
}
