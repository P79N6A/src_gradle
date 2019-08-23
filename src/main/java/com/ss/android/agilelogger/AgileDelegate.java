package com.ss.android.agilelogger;

import android.text.TextUtils;
import java.io.File;

public class AgileDelegate {
    private static boolean g;

    /* renamed from: a  reason: collision with root package name */
    public String f27853a;

    /* renamed from: b  reason: collision with root package name */
    public long f27854b;

    /* renamed from: c  reason: collision with root package name */
    private String f27855c;

    /* renamed from: d  reason: collision with root package name */
    private int f27856d;

    /* renamed from: e  reason: collision with root package name */
    private String f27857e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27858f;

    private native void changeLogPath(long j, String str);

    private static native long init(String str, int i, String str2, boolean z, boolean z2);

    public native void asyncFlush(long j);

    public native void release(long j);

    public native void write(long j, String str);

    public final void a(String str) {
        String str2;
        if (this.f27854b != 0) {
            try {
                if (g) {
                    str2 = this.f27857e;
                } else {
                    str2 = g.a();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = this.f27857e;
                    }
                }
                File file = new File(str2);
                if (str2.endsWith(".hoting") && file.exists()) {
                    file.renameTo(new File(str2.replace(".hoting", ".hot")));
                }
                g.a(str);
                changeLogPath(this.f27854b, str);
                g = true;
                this.f27857e = str;
            } catch (Throwable unused) {
            }
        }
    }

    public AgileDelegate(String str, int i, String str2, boolean z, boolean z2) {
        this.f27855c = str;
        this.f27856d = i;
        this.f27857e = str2;
        this.f27853a = new File(str2).getParent();
        this.f27858f = z;
        try {
            this.f27854b = init(str, i, str2, z, z2);
        } catch (Throwable unused) {
        }
    }
}
