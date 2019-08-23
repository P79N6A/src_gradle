package com.bytedance.lighten.core.a;

import com.bytedance.lighten.core.j;

public final class c {
    public static j a() {
        try {
            return (j) Class.forName("com.bytedance.lighten.loader.GlideImageLoaderDelegate").asSubclass(j.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
