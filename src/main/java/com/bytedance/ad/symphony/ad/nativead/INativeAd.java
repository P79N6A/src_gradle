package com.bytedance.ad.symphony.ad.nativead;

import com.bytedance.ad.symphony.ad.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface INativeAd extends a {

    @Retention(RetentionPolicy.CLASS)
    public @interface VideoPlayMode {
    }

    String c();

    String d();

    String e();

    String f();

    String g();

    float h();

    boolean i();
}
