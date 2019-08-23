package com.bytedance.android.livesdk.app.dataholder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9056a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f9057b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f9058c;

    /* renamed from: d  reason: collision with root package name */
    public int f9059d;

    public f() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public f clone() {
        f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f9056a, false, 3171, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f9056a, false, 3171, new Class[0], f.class);
        }
        try {
            fVar = (f) super.clone();
            try {
                fVar.f9057b = (long[]) this.f9057b.clone();
                fVar.f9058c = (long[]) this.f9058c.clone();
            } catch (CloneNotSupportedException unused) {
            }
        } catch (CloneNotSupportedException unused2) {
            fVar = null;
        }
        return fVar;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f9056a, false, 3180, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f9056a, false, 3180, new Class[0], String.class);
        } else if (this.f9059d <= 0) {
            return "{}";
        } else {
            StringBuilder sb = new StringBuilder(this.f9059d * 28);
            sb.append('{');
            for (int i = 0; i < this.f9059d; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.f9057b[i]);
                sb.append('=');
                sb.append(this.f9058c[i]);
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private f(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{10}, null, b.f9043a, true, 3136, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{10}, null, b.f9043a, true, 3136, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            i2 = b.a(80) / 8;
        }
        this.f9057b = new long[i2];
        this.f9058c = new long[i2];
        this.f9059d = 0;
    }
}
