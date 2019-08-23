package com.facebook.d.a;

import java.io.FileInputStream;
import java.io.IOException;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    FileInputStream f23579a;

    /* renamed from: b  reason: collision with root package name */
    int f23580b;

    /* renamed from: c  reason: collision with root package name */
    int f23581c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f23582d = new byte[512];

    public final void a() throws IOException {
        if (this.f23580b >= this.f23581c) {
            this.f23581c = this.f23579a.read(this.f23582d);
            this.f23580b = 0;
        }
        while (this.f23581c != -1 && this.f23582d[this.f23580b] != 10) {
            this.f23580b++;
            if (this.f23580b >= this.f23581c) {
                this.f23581c = this.f23579a.read(this.f23582d);
                this.f23580b = 0;
            }
        }
        this.f23580b++;
    }

    public final int a(byte[] bArr) throws IOException {
        if (this.f23580b >= this.f23581c) {
            this.f23581c = this.f23579a.read(this.f23582d);
            this.f23580b = 0;
        }
        int i = 0;
        while (this.f23581c != -1 && i < bArr.length && this.f23582d[this.f23580b] != 10) {
            bArr[i] = this.f23582d[this.f23580b];
            this.f23580b++;
            if (this.f23580b >= this.f23581c) {
                this.f23581c = this.f23579a.read(this.f23582d);
                this.f23580b = 0;
            }
            i++;
        }
        this.f23580b++;
        if (this.f23581c == -1) {
            return -1;
        }
        return i;
    }
}
