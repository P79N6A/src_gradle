package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.user.util.b;

public final class m extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48882a;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f48882a, false, 46711, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f48882a, false, 46711, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        b.a().a(this.mHandler, 0);
        return super.sendRequest(objArr);
    }
}
