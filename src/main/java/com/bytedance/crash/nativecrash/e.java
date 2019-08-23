package com.bytedance.crash.nativecrash;

import com.bytedance.crash.i.d;
import java.io.File;
import java.io.IOException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public File f19506a;

    /* renamed from: b  reason: collision with root package name */
    public File f19507b;

    /* renamed from: c  reason: collision with root package name */
    public File f19508c;

    /* renamed from: d  reason: collision with root package name */
    private int f19509d;

    public final String a() {
        try {
            if (this.f19508c != null && this.f19508c.exists()) {
                return d.a(this.f19508c.getAbsolutePath(), "\n");
            }
            if (this.f19506a != null && this.f19506a.exists()) {
                return d.a(this.f19506a.getAbsolutePath(), "\n");
            }
            if (this.f19507b != null) {
                if (this.f19507b.exists()) {
                    if (this.f19507b.length() == 0) {
                        return "signal (convert rst failed)\nconvert result=[" + this.f19509d + "]\nrst file content is empty\n\n";
                    }
                    return "signal (convert rst failed)\nconvert result=[" + this.f19509d + "]\nrst file content:\n" + d.a(this.f19507b.getAbsolutePath(), "\n");
                }
            }
            return "signal (convert rst failed)\nconvert result=[" + this.f19509d + "]\nrst file not exists\n";
        } catch (IOException unused) {
            return "";
        }
    }

    e(int i) {
        this.f19509d = i;
    }
}
