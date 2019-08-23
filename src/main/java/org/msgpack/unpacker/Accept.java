package org.msgpack.unpacker;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.msgpack.a.b;
import org.msgpack.c;

public abstract class Accept implements b {
    private final String expected;

    /* access modifiers changed from: package-private */
    public void acceptEmptyRaw() throws IOException {
        throw new c(String.format("Expected %s, but got raw value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptNil() throws IOException {
        throw new c(String.format("Expected %s, but got nil value", new Object[]{this.expected}));
    }

    Accept(String str) {
        this.expected = str;
    }

    /* access modifiers changed from: package-private */
    public void acceptArray(int i) throws IOException {
        throw new c(String.format("Expected %s, but got array value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptBoolean(boolean z) throws IOException {
        throw new c(String.format("Expected %s, but got boolean", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptDouble(double d2) throws IOException {
        throw new c(String.format("Expected %s, but got float value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptFloat(float f2) throws IOException {
        throw new c(String.format("Expected %s, but got float value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptInteger(byte b2) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptMap(int i) throws IOException {
        throw new c(String.format("Expected %s, but got map value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptRaw(byte[] bArr) throws IOException {
        throw new c(String.format("Expected %s, but got raw value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptUnsignedInteger(byte b2) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptInteger(int i) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptUnsignedInteger(int i) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptInteger(long j) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptUnsignedInteger(long j) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptInteger(short s) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: package-private */
    public void acceptUnsignedInteger(short s) throws IOException {
        throw new c(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    public void refer(ByteBuffer byteBuffer, boolean z) throws IOException {
        throw new c(String.format("Expected %s, but got raw value", new Object[]{this.expected}));
    }
}
