package com.ss.ugc.live.b.a.a;

import android.content.Context;
import com.ss.ugc.live.b.a.c;
import java.io.File;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private Context f78626a;

    /* renamed from: b  reason: collision with root package name */
    private String f78627b = this.f78626a.getDir("gift_resource", 0).getAbsolutePath();

    public a(Context context) {
        this.f78626a = context;
    }

    public final String a(c cVar) {
        return this.f78627b + File.separator + cVar.f78634a + File.separator + cVar.f78637d + File.separator;
    }
}
