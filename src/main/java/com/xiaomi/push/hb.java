package com.xiaomi.push;

import com.google.a.a.a.a.a.a;
import java.io.PrintStream;
import java.io.PrintWriter;

public class hb extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private hk f82148a;

    /* renamed from: a  reason: collision with other field name */
    private hl f479a;

    /* renamed from: a  reason: collision with other field name */
    private Throwable f480a;

    public hb() {
    }

    public hb(hk hkVar) {
        this.f82148a = hkVar;
    }

    public hb(String str) {
        super(str);
    }

    public hb(String str, Throwable th) {
        super(str);
        this.f480a = th;
    }

    public hb(Throwable th) {
        this.f480a = th;
    }

    public Throwable a() {
        return this.f480a;
    }

    public String getMessage() {
        String message = super.getMessage();
        return (message != null || this.f479a == null) ? (message != null || this.f82148a == null) ? message : this.f82148a.toString() : this.f479a.toString();
    }

    public void printStackTrace() {
        a.a((Throwable) this, System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f480a != null) {
            printStream.println("Nested Exception: ");
            a.a(this.f480a, printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f480a != null) {
            printWriter.println("Nested Exception: ");
            a.a(this.f480a, printWriter);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        if (this.f479a != null) {
            sb.append(this.f479a);
        }
        if (this.f82148a != null) {
            sb.append(this.f82148a);
        }
        if (this.f480a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f480a);
        }
        return sb.toString();
    }
}
