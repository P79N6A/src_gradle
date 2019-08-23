package com.ss.android.ugc.aweme.miniapp.c.a;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;

public final class e implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55613a;

    @NonNull
    public final String getType() {
        return "tmaLifecycle";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        final CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2}, this, f55613a, false, 59373, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2}, this, f55613a, false, 59373, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        } else if (crossProcessDataEntity2 == null) {
            AppBrandLogger.e("TmaLifecyleHandler", "callData == null");
            return null;
        } else {
            AppbrandContext.mainHandler.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55614a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f55614a, false, 59374, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f55614a, false, 59374, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                        String string = crossProcessDataEntity2.getString("activityLifecycle");
                        String string2 = crossProcessDataEntity2.getString("activityName");
                        int i = crossProcessDataEntity2.getInt("hashcode");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && applicationContext != null) {
                            AppBrandLogger.d("TmaLifecyleHandler", "lifecycle " + string + " " + string2);
                            if (TextUtils.equals("onResume", string)) {
                                AppLog.onResume(applicationContext, string2, i);
                            } else if (TextUtils.equals("onPause", string)) {
                                AppLog.onPause(applicationContext, string2, i);
                            } else if (TextUtils.equals("onCreate", string)) {
                                AppLog.onActivityCreate(string2);
                            }
                        }
                    } catch (Exception e2) {
                        AppBrandLogger.e("TmaLifecyleHandler", e2);
                    }
                }
            });
            return null;
        }
    }
}
