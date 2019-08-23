package com.ss.android.statistic.a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.statistic.a;
import com.ss.android.statistic.b;
import com.ss.android.statistic.c;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.bv;
import java.util.Map;

public final class d extends b {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private Context f31107b;

    @NonNull
    public final String a() {
        return b.f31108a;
    }

    public final void a(@NonNull a aVar) {
        boolean z;
        if (aVar.f2558c == a.C0392a.DEBUG) {
            z = true;
        } else {
            z = false;
        }
        MobclickAgent.setDebugMode(z);
        bv.setCustomVersion(aVar.f2561f);
        bv.setCustomVersionCode(aVar.g);
        bv.setUmengChannel(aVar.f2559d);
    }

    public final void a(@NonNull c cVar) {
        if (this.f31107b != null) {
            Map<String, Object> map = cVar.f31118c;
            String str = null;
            if (map != null) {
                Object obj = map.get(b.p);
                if (obj instanceof String) {
                    str = (String) obj;
                }
            }
            if (TextUtils.isEmpty(str)) {
                MobclickAgent.onEvent(this.f31107b, cVar.f31116a);
                return;
            }
            MobclickAgent.onEvent(this.f31107b, cVar.f31116a, str);
        }
    }

    public final void a(@NonNull Context context, @NonNull a aVar) {
        boolean z;
        this.f31107b = context;
        if (aVar.f2558c == a.C0392a.DEBUG) {
            z = true;
        } else {
            z = false;
        }
        MobclickAgent.setDebugMode(z);
    }
}
