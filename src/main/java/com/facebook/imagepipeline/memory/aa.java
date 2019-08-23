package com.facebook.imagepipeline.memory;

public final class aa implements ag {

    /* renamed from: a  reason: collision with root package name */
    private static aa f23951a;

    public final void onAlloc(int i) {
    }

    public final void onFree(int i) {
    }

    public final void onHardCapReached() {
    }

    public final void onSoftCapReached() {
    }

    public final void onValueRelease(int i) {
    }

    public final void onValueReuse(int i) {
    }

    public final void setBasePool(a aVar) {
    }

    private aa() {
    }

    public static synchronized aa getInstance() {
        aa aaVar;
        synchronized (aa.class) {
            if (f23951a == null) {
                f23951a = new aa();
            }
            aaVar = f23951a;
        }
        return aaVar;
    }
}
