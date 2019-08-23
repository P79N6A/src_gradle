package com.amap.api.services.a;

public class du extends dx {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f6850a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6851b = true;

    public du() {
    }

    public du(dx dxVar) {
        super(dxVar);
    }

    /* access modifiers changed from: protected */
    public byte[] a(byte[] bArr) {
        byte[] a2 = bo.a(this.f6850a.toString());
        c(a2);
        this.f6851b = true;
        this.f6850a.delete(0, this.f6850a.length());
        return a2;
    }

    public void b(byte[] bArr) {
        String a2 = bo.a(bArr);
        if (this.f6851b) {
            this.f6851b = false;
        } else {
            this.f6850a.append(",");
        }
        StringBuilder sb = this.f6850a;
        sb.append("{\"log\":\"");
        sb.append(a2);
        sb.append("\"}");
    }
}
