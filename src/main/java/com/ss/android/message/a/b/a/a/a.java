package com.ss.android.message.a.b.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.h;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29871a;

    /* renamed from: b  reason: collision with root package name */
    public String f29872b;

    /* renamed from: c  reason: collision with root package name */
    public String f29873c;

    public final void a(byte[] bArr) {
        if (PatchProxy.isSupport(new Object[]{bArr}, this, f29871a, false, 18094, new Class[]{byte[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr}, this, f29871a, false, 18094, new Class[]{byte[].class}, Void.TYPE);
        } else if (bArr.length != 0 && this.j != null) {
            try {
                h.a aVar = (h.a) this.j.a(bArr, (Template<T>) this.k);
                if (aVar != null) {
                    Map<String, Object> map = aVar.f29987a;
                    if (map != null) {
                        if (map.containsKey("en")) {
                            this.f29872b = new String((byte[]) map.get("en"));
                        }
                        if (map.containsKey("ct")) {
                            this.f29873c = new String((byte[]) map.get("em"));
                        }
                    }
                }
            } catch (IOException e2) {
                h.a((Exception) e2);
            } catch (Exception e3) {
                h.a(e3);
            }
        }
    }
}
