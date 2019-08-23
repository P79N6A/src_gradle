package com.douyin.share.a.c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.StringUtils;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final Activity f23137a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f23138b;

    public final boolean a() {
        String a2 = b.a((Context) this.f23137a);
        if (StringUtils.isEmpty(a2) || b.a(a2, "4.1") < 0) {
            return false;
        }
        return true;
    }

    public a(Activity activity, String str, String str2) {
        if (activity == null) {
            throw new IllegalArgumentException("activity is null");
        } else if (!StringUtils.isEmpty(str)) {
            this.f23137a = activity;
            this.f23138b = str;
            b.f23139a = str2;
        } else {
            throw new IllegalArgumentException("sdcard cache dir is empty");
        }
    }
}
