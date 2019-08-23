package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;

public class h extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80965b;

    public String f() {
        return UMEnvelopeBuild.imprintProperty(this.f80965b, "umid", null);
    }

    public h(Context context) {
        super("newumid");
        this.f80965b = context;
    }
}
