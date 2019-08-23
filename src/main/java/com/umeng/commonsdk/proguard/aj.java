package com.umeng.commonsdk.proguard;

public class aj extends p {
    protected int g;

    public aj() {
    }

    public int a() {
        return this.g;
    }

    public aj(int i) {
        this.g = i;
    }

    public aj(String str) {
        super(str);
    }

    public aj(Throwable th) {
        super(th);
    }

    public aj(int i, String str) {
        super(str);
        this.g = i;
    }

    public aj(int i, Throwable th) {
        super(th);
        this.g = i;
    }

    public aj(String str, Throwable th) {
        super(str, th);
    }

    public aj(int i, String str, Throwable th) {
        super(str, th);
        this.g = i;
    }
}
