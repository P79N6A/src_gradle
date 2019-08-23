package com.ali.auth.third.core.config;

import com.taobao.android.dexposed.ClassUtils;

public class Version {

    /* renamed from: a  reason: collision with root package name */
    private int f4907a;

    /* renamed from: b  reason: collision with root package name */
    private int f4908b;

    /* renamed from: c  reason: collision with root package name */
    private int f4909c;

    public Version(int i, int i2, int i3) {
        this.f4907a = i;
        this.f4908b = i2;
        this.f4909c = i3;
    }

    public String toString() {
        return this.f4907a + ClassUtils.PACKAGE_SEPARATOR + this.f4908b + ClassUtils.PACKAGE_SEPARATOR + this.f4909c;
    }
}
