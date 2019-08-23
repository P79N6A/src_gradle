package com.meizu.cloud.pushsdk.b.g;

import java.io.IOException;
import java.io.InterruptedIOException;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f27026a = new m() {
        public final void a() throws IOException {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private boolean f27027b;

    /* renamed from: c  reason: collision with root package name */
    private long f27028c;

    public void a() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f27027b && this.f27028c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
