package com.ss.android.ugc.aweme.common.keyboard;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40238a = null;

    /* renamed from: f  reason: collision with root package name */
    private static final String f40239f = "a";

    /* renamed from: b  reason: collision with root package name */
    int f40240b;

    /* renamed from: c  reason: collision with root package name */
    int f40241c;

    /* renamed from: d  reason: collision with root package name */
    public List<b> f40242d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f40243e;

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f40238a, false, 33445, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, f40238a, false, 33445, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f40242d != null) {
            for (b b2 : this.f40242d) {
                b2.b(z, i);
            }
        }
    }
}
