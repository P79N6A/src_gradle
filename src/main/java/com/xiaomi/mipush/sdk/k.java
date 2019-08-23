package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;

public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81798a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ f f130a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f131a;

    k(String str, Context context, f fVar) {
        this.f131a = str;
        this.f81798a = context;
        this.f130a = fVar;
    }

    public final void run() {
        if (!TextUtils.isEmpty(this.f131a)) {
            String str = "";
            String[] split = this.f131a.split("~");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2) && str2.startsWith("token:")) {
                    str = str2.substring(str2.indexOf(":") + 1);
                    break;
                }
                i++;
            }
            if (!TextUtils.isEmpty(str)) {
                b.a("ASSEMBLE_PUSH : receive correct token");
                j.d(this.f81798a, this.f130a, str);
                j.a(this.f81798a);
                return;
            }
            b.a("ASSEMBLE_PUSH : receive incorrect token");
        }
    }
}
