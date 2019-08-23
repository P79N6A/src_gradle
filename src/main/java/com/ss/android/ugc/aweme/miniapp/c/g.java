package com.ss.android.ugc.aweme.miniapp.c;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.l.k;
import com.ss.android.ugc.aweme.miniapp.l.m;
import com.ss.android.ugc.aweme.miniapp.q;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;

public final class g implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55623a;

    @NonNull
    public final String getType() {
        return "miniAppLifecycle";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2}, this, f55623a, false, 59353, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2}, this, f55623a, false, 59353, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        } else if (crossProcessDataEntity2 == null) {
            AppBrandLogger.e("MiniAppLifecycleHandler", "callData == null)");
            return null;
        } else {
            String string = crossProcessDataEntity2.getString("miniAppLifecycle");
            if (TextUtils.isEmpty(string)) {
                AppBrandLogger.e("MiniAppLifecycleHandler", "TextUtils.isEmpty(miniAppLifecycle)");
                return null;
            }
            char c2 = 65535;
            try {
                int hashCode = string.hashCode();
                if (hashCode != 3417674) {
                    if (hashCode == 94756344) {
                        if (string.equals("close")) {
                            c2 = 1;
                        }
                    }
                } else if (string.equals("open")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        k.e(k.a("", crossProcessDataEntity2.getString("miniAppId"), crossProcessDataEntity2.getBoolean("isGame")));
                        break;
                    case 1:
                        if (TextUtils.equals(crossProcessDataEntity2.getString("miniAppStopReason"), "click_close_btn")) {
                            if (!PatchProxy.isSupport(new Object[0], null, k.f55844a, true, 59572, new Class[0], Void.TYPE)) {
                                if (q.a().i.f()) {
                                    Activity e2 = q.a().i.e();
                                    if (!PatchProxy.isSupport(new Object[]{e2}, null, k.f55844a, true, 59573, new Class[]{Activity.class}, Void.TYPE)) {
                                        if (e2 != null) {
                                            new Handler(Looper.getMainLooper()).post(new m(e2));
                                            q.a().i.g();
                                            break;
                                        }
                                    } else {
                                        PatchProxy.accessDispatch(new Object[]{e2}, null, k.f55844a, true, 59573, new Class[]{Activity.class}, Void.TYPE);
                                        break;
                                    }
                                }
                            } else {
                                PatchProxy.accessDispatch(new Object[0], null, k.f55844a, true, 59572, new Class[0], Void.TYPE);
                                break;
                            }
                        }
                        break;
                }
            } catch (Exception e3) {
                AppBrandLogger.e("MiniAppLifecycleHandler", "action", e3);
            }
            return null;
        }
    }
}
