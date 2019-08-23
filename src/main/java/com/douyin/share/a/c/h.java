package com.douyin.share.a.c;

import com.douyin.share.a.b.c.b;
import com.douyin.share.profile.share.a.a;
import com.douyin.share.profile.share.a.c;
import java.io.Serializable;

public final class h implements Serializable {
    public static h QQ = new h("qq", a.class);
    public static h QZONE = new h("qzone", c.class);
    public static h ROCKET = new h("rocket", c.class);
    public static h ROCKET_SPACE = new h("rocket_space", c.class);
    public static h TENCENT = new h("tencent_weibo", j.class);
    public static h TOUTIAO = new h("toutiao", k.class);
    public static h WEIBO = new h("sina_weibo", o.class);
    public static h WEIXIN = new h("weixin", r.class);
    public static h WEIXIN_MOMENTS = new h("weixin_moments", p.class);
    public final String mDefaultName;
    public final Class<? extends b> mShareletClass;

    public final int hashCode() {
        if (this.mDefaultName == null) {
            return 0;
        }
        return this.mDefaultName.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar == null || hVar.mDefaultName == null || this.mDefaultName == null) {
            return false;
        }
        return this.mDefaultName.equals(hVar.mDefaultName);
    }

    public h(String str, Class<? extends b> cls) {
        this.mDefaultName = str;
        this.mShareletClass = cls;
    }
}
