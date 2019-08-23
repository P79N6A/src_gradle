package com.ss.android.websocket.b.a;

import com.ss.android.websocket.internal.proto.Frame;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f78195a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f78196b;

    /* renamed from: c  reason: collision with root package name */
    public final long f78197c;

    /* renamed from: d  reason: collision with root package name */
    public final long f78198d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f78199e;

    /* renamed from: f  reason: collision with root package name */
    public final int f78200f;
    public final String g;
    public final String h;
    private final Map<String, String> i;

    public final Map<String, String> a() {
        new Frame.ExtendedEntry("", "");
        return this.i;
    }

    public e(String str, int i2, long j, long j2, int i3, byte[] bArr, String str2, String str3, Map<String, String> map) {
        this.f78195a = str;
        this.f78196b = bArr;
        this.f78199e = i2;
        this.f78200f = i3;
        this.f78197c = j;
        this.g = str2;
        this.h = str3;
        this.i = map;
    }
}
