package com.ss.android.downloadlib.c;

import java.io.PrintWriter;
import java.io.Writer;

public final class d extends PrintWriter {

    /* renamed from: a  reason: collision with root package name */
    public final String f28882a;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f28883b;

    /* renamed from: c  reason: collision with root package name */
    public char[] f28884c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28885d;

    /* renamed from: e  reason: collision with root package name */
    private int f28886e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28887f;

    private void a() {
        if (this.f28887f) {
            this.f28887f = false;
            if (this.f28883b.length() != 0) {
                if (this.f28884c == null) {
                    this.f28884c = this.f28883b.toString().toCharArray();
                }
                super.write(this.f28884c, 0, this.f28884c.length);
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
        this.f28883b = new StringBuilder();
        this.f28887f = true;
        this.f28882a = str;
        this.f28885d = -1;
    }

    public final void write(char[] cArr, int i, int i2) {
        int length = this.f28883b.length();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int i5 = i + 1;
            char c2 = cArr[i];
            this.f28886e++;
            if (c2 == 10) {
                a();
                super.write(cArr, i4, i5 - i4);
                this.f28887f = true;
                this.f28886e = 0;
                i4 = i5;
            }
            if (this.f28885d > 0 && this.f28886e >= this.f28885d - length) {
                if (!this.f28887f) {
                    super.write(10);
                    this.f28887f = true;
                    this.f28886e = i5 - i4;
                } else {
                    a();
                    super.write(cArr, i4, i5 - i4);
                    super.write(10);
                    this.f28887f = true;
                    this.f28886e = 0;
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
