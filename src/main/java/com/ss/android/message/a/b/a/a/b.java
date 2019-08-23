package com.ss.android.message.a.b.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.message.b.h;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29874a;

    /* renamed from: b  reason: collision with root package name */
    public byte f29875b;

    /* renamed from: c  reason: collision with root package name */
    public byte f29876c;

    /* renamed from: d  reason: collision with root package name */
    public long f29877d;

    /* renamed from: e  reason: collision with root package name */
    public long f29878e;

    /* renamed from: f  reason: collision with root package name */
    public double f29879f;
    public double g;
    public String h;
    public int i = -1;

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f29874a, false, 18095, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f29874a, false, 18095, new Class[0], byte[].class);
        }
        byte[] bArr = null;
        h.a aVar = new h.a();
        try {
            aVar.f29987a.put(NotifyType.VIBRATE, Byte.valueOf(this.f29875b));
            aVar.f29987a.put("n", Byte.valueOf(this.f29876c));
            aVar.f29987a.put("d", Long.valueOf(this.f29877d));
            aVar.f29987a.put("i", Long.valueOf(this.f29878e));
            aVar.f29987a.put("lo", Double.valueOf(this.f29879f));
            aVar.f29987a.put("la", Double.valueOf(this.g));
            aVar.f29987a.put("c", this.h);
            bArr = this.j.a(aVar, (Template<T>) this.k);
        } catch (IOException e2) {
            h.a((Exception) e2);
        } catch (Exception e3) {
            h.a(e3);
        }
        return bArr;
    }

    public final void a(byte[] bArr) {
        if (PatchProxy.isSupport(new Object[]{bArr}, this, f29874a, false, 18096, new Class[]{byte[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr}, this, f29874a, false, 18096, new Class[]{byte[].class}, Void.TYPE);
            return;
        }
        try {
            Map<String, Object> map = ((h.a) this.j.a(bArr, (Template<T>) this.k)).f29987a;
            if (map.containsKey("h")) {
                this.i = ((Integer) map.get("h")).intValue();
            }
        } catch (IOException e2) {
            h.a((Exception) e2);
        } catch (Exception e3) {
            h.a(e3);
        }
    }
}
