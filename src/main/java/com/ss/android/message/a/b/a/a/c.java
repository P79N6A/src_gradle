package com.ss.android.message.a.b.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.h;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29880a;

    /* renamed from: b  reason: collision with root package name */
    public long f29881b;

    /* renamed from: c  reason: collision with root package name */
    public int f29882c;

    /* renamed from: d  reason: collision with root package name */
    public long f29883d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f29884e;

    /* renamed from: f  reason: collision with root package name */
    public long f29885f;

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f29880a, false, 18097, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f29880a, false, 18097, new Class[0], byte[].class);
        }
        byte[] bArr = null;
        h.a aVar = new h.a();
        try {
            aVar.f29987a.put("rt", Long.valueOf(this.f29885f));
            bArr = this.j.a(aVar, (Template<T>) this.k);
        } catch (IOException e2) {
            h.a((Exception) e2);
        } catch (Exception e3) {
            h.a(e3);
        }
        return bArr;
    }

    public final void a(byte[] bArr) {
        if (PatchProxy.isSupport(new Object[]{bArr}, this, f29880a, false, 18098, new Class[]{byte[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr}, this, f29880a, false, 18098, new Class[]{byte[].class}, Void.TYPE);
            return;
        }
        try {
            Map<String, Object> map = ((h.a) this.j.a(bArr, (Template<T>) this.k)).f29987a;
            if (map.containsKey("a")) {
                this.f29882c = ((Integer) map.get("a")).intValue();
            }
            if (map.containsKey("m")) {
                this.f29883d = ((Long) map.get("m")).longValue();
            }
            if (map.containsKey("ct")) {
                this.f29881b = ((Long) map.get("ct")).longValue();
            }
            if (map.containsKey("c")) {
                this.f29884e = (byte[]) map.get("c");
            }
        } catch (IOException e2) {
            h.a((Exception) e2);
        } catch (Exception e3) {
            h.a(e3);
        }
    }
}
