package com.ss.android.ugc.aweme.miniapp.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.f;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;

public final class d implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55620a;

    @NonNull
    public final String getType() {
        return "getLoginCookie";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        if (!PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55620a, false, 59350, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return CrossProcessDataEntity.Builder.create().put("loginCookie", f.a()).build();
        }
        return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55620a, false, 59350, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
    }
}
