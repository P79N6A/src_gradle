package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74256a;

    /* renamed from: c  reason: collision with root package name */
    private static j f74257c;

    /* renamed from: b  reason: collision with root package name */
    int f74258b;

    /* renamed from: d  reason: collision with root package name */
    private List<i> f74259d = new ArrayList();

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74256a, false, 86210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74256a, false, 86210, new Class[0], Void.TYPE);
            return;
        }
        this.f74258b++;
        if (this.f74258b == this.f74259d.size()) {
            this.f74258b = 0;
        }
    }

    public final i c() {
        if (PatchProxy.isSupport(new Object[0], this, f74256a, false, 86211, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f74256a, false, 86211, new Class[0], i.class);
        }
        if (this.f74258b == this.f74259d.size()) {
            this.f74258b = 0;
        }
        return this.f74259d.get(this.f74258b);
    }

    public static j a() {
        if (PatchProxy.isSupport(new Object[0], null, f74256a, true, 86209, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f74256a, true, 86209, new Class[0], j.class);
        }
        if (f74257c == null) {
            synchronized (j.class) {
                if (f74257c == null) {
                    f74257c = new j();
                }
            }
        }
        return f74257c;
    }

    private j() {
        this.f74259d.add(new i(new int[]{-16716612, -16745761}, -1, -1056964609));
        this.f74259d.add(new i(new int[]{-20071, -55717}, -1, -1056964609));
        this.f74259d.add(new i(new int[]{-14625300, -5938690, -119723}, -1, -1056964609));
        this.f74259d.add(new i(new int[]{-468142, -42147}, -1, -1056964609));
        this.f74259d.add(new i(new int[]{-16352892, -15726275}, -1, -1056964609));
        this.f74259d.add(new i(new int[]{-1773591, -7100977}, -16777216, 1442840576));
        this.f74259d.add(new i(new int[]{-12369085, -16777216}, -1, -1056964609));
    }
}
