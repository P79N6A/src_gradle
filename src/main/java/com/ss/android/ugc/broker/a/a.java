package com.ss.android.ugc.broker.a;

import com.ss.android.ugc.aweme.im.sdk.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.broker.g;
import java.util.List;

public final class a extends g {
    a() {
        this.f77187a.add("com.ss.android.ugc.aweme.im.sdk.providedservices.IMService");
        a(IIMService.class, "com.ss.android.ugc.aweme.im.sdk.providedservices.IMService");
    }

    public final <T> T a(String str, Object... objArr) {
        if ((objArr == null || objArr.length == 0) && str.equals("com.ss.android.ugc.aweme.im.sdk.providedservices.IMService")) {
            return new IMService();
        }
        return null;
    }

    public final <T> List<T> a(Class<T> cls, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            if (this.f77188b.get(cls) != null) {
                return a((List) this.f77188b.get(cls), new Object[0]);
            }
            return null;
        } else if (this.f77188b.get(cls) != null) {
            return a((List) this.f77188b.get(cls), objArr);
        } else {
            return null;
        }
    }
}
