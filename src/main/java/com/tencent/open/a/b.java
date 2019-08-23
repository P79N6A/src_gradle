package com.tencent.open.a;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class b {
    private static SimpleDateFormat j = new SimpleDateFormat("yy.MM.dd.HH");

    /* renamed from: a  reason: collision with root package name */
    public String f79647a = "Tracer.File";

    /* renamed from: b  reason: collision with root package name */
    public int f79648b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f79649c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f79650d = 4096;

    /* renamed from: e  reason: collision with root package name */
    public long f79651e = 10000;

    /* renamed from: f  reason: collision with root package name */
    public File f79652f;
    public int g = 10;
    public String h = ".log";
    public long i = Long.MAX_VALUE;

    /* access modifiers changed from: package-private */
    public File a(long j2) {
        File file = this.f79652f;
        file.mkdirs();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        String format = new SimpleDateFormat("yy.MM.dd.HH").format(instance.getTime());
        try {
            return new File(file, "com.tencent.mobileqq_connectSdk." + format + ".log");
        } catch (Throwable unused) {
            return file;
        }
    }

    public b(File file, int i2, int i3, int i4, String str, long j2, int i5, String str2, long j3) {
        this.f79652f = file;
        this.f79649c = i2;
        this.f79648b = i3;
        this.f79650d = i4;
        this.f79647a = str;
        this.f79651e = j2;
        this.g = 10;
        this.h = str2;
        this.i = j3;
    }
}
