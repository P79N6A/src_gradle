package com.ss.android.download.b;

import java.io.PrintWriter;
import java.io.Writer;

public final class d extends PrintWriter {

    /* renamed from: a  reason: collision with root package name */
    public final String f28514a;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f28515b;

    /* renamed from: c  reason: collision with root package name */
    public char[] f28516c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28517d;

    /* renamed from: e  reason: collision with root package name */
    private int f28518e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28519f;

    private void a() {
        if (this.f28519f) {
            this.f28519f = false;
            if (this.f28515b.length() != 0) {
                if (this.f28516c == null) {
                    this.f28516c = this.f28515b.toString().toCharArray();
                }
                super.write(this.f28516c, 0, this.f28516c.length);
            }
        }
    }

    public d(Writer writer, String str) {
        this(writer, str, -1);
    }

    public final void a(String str, Object obj) {
        print(str + "=" + String.valueOf(obj) + " ");
    }

    private d(Writer writer, String str, int i) {
        super(writer);
        this.f28515b = new StringBuilder();
        this.f28519f = true;
        this.f28514a = str;
        this.f28517d = -1;
    }

    public final void write(char[] cArr, int i, int i2) {
        int length = this.f28515b.length();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int i5 = i + 1;
            char c2 = cArr[i];
            this.f28518e++;
            if (c2 == 10) {
                a();
                super.write(cArr, i4, i5 - i4);
                this.f28519f = true;
                this.f28518e = 0;
                i4 = i5;
            }
            if (this.f28517d > 0 && this.f28518e >= this.f28517d - length) {
                if (!this.f28519f) {
                    super.write(10);
                    this.f28519f = true;
                    this.f28518e = i5 - i4;
                } else {
                    a();
                    super.write(cArr, i4, i5 - i4);
                    super.write(10);
                    this.f28519f = true;
                    this.f28518e = 0;
                    i4 = i5;
                }
            }
            i = i5;
        }
        if (i4 != i) {
            a();
            super.write(cArr, i4, i - i4);
        }
    }
}
