package com.ss.android.ugc.aweme.miniapp.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.AppLogNewUtils;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;

public final class b implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55618a;

    @NonNull
    public final String getType() {
        return "actionLog";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2}, this, f55618a, false, 59348, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2}, this, f55618a, false, 59348, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        } else if (crossProcessDataEntity2 == null) {
            return null;
        } else {
            AppLogNewUtils.onEventV3(crossProcessDataEntity2.getString("logEventName"), crossProcessDataEntity2.getJSONObject("logEventData"));
            return null;
        }
    }
}
