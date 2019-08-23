package com.loc;

public final class ba extends bd {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f25512a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private boolean f25513b = true;

    public ba() {
    }

    public ba(bd bdVar) {
        super(bdVar);
    }

    /* access modifiers changed from: protected */
    public final byte[] a(byte[] bArr) {
        byte[] a2 = di.a(this.f25512a.toString());
        this.f25518d = a2;
        this.f25513b = true;
        this.f25512a.delete(0, this.f25512a.length());
        return a2;
    }

    public final void b(byte[] bArr) {
        String a2 = di.a(bArr);
        if (this.f25513b) {
            this.f25513b = false;
        } else {
            this.f25512a.append(",");
        }
        StringBuilder sb = this.f25512a;
        sb.append("{\"log\":\"");
        sb.append(a2);
        sb.append("\"}");
    }
}
