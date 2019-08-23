package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.a;

public class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80954b;

    public String f() {
        String a2 = a.a(this.f80954b);
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    public c(Context context) {
        super("idfa");
        this.f80954b = context;
    }
}
