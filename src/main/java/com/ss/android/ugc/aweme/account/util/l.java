package com.ss.android.ugc.aweme.account.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.f;
import com.ss.android.ugc.aweme.w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/util/OneLoginUtil;", "", "()V", "getOneLoginV2Type", "", "oneLoginV2UsePhoneRes", "showOneLoginV2", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33098a;

    /* renamed from: b  reason: collision with root package name */
    public static final l f33099b = new l();

    private l() {
    }

    public final int a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f33098a, false, 21339, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33098a, false, 21339, new Class[0], Integer.TYPE)).intValue();
        }
        f i2 = w.i();
        if (i2 != null) {
            i = i2.getOneLoginV2Type();
        }
        return i;
    }
}
