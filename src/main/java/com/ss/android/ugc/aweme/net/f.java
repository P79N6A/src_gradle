package com.ss.android.ugc.aweme.net;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.http.a.a;
import com.ss.android.common.http.b;
import com.ss.android.common.util.c;
import com.ss.android.common.util.d;
import com.ss.android.common.util.h;
import com.ss.android.http.a.b.e;
import java.util.List;
import org.apache.http.client.RedirectHandler;

public abstract class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56940a;

    /* renamed from: b  reason: collision with root package name */
    protected b f56941b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f56942c;

    public abstract b a();

    public final boolean a(int i, String str, String str2, String str3, String str4, c<String> cVar, String str5, h hVar, List<e> list, String[] strArr, int[] iArr) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2, str3, str4, cVar, str5, hVar, list, strArr, iArr}, this, f56940a, false, 60676, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, c.class, String.class, h.class, List.class, String[].class, int[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2, str3, str4, cVar, str5, hVar, list, strArr, iArr}, this, f56940a, false, 60676, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, c.class, String.class, h.class, List.class, String[].class, int[].class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, str, str2, str3, str4, cVar, str5, hVar, list, strArr, iArr);
    }

    public final boolean a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, c<String> cVar, String str2, h hVar, List<e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, hVar, list, strArr, iArr, redirectHandler}, this, f56940a, false, 60677, new Class[]{Integer.TYPE, String.class, StringBuffer.class, StringBuffer.class, StringBuffer.class, c.class, String.class, h.class, List.class, String[].class, int[].class, RedirectHandler.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, hVar, list, strArr, iArr, redirectHandler}, this, f56940a, false, 60677, new Class[]{Integer.TYPE, String.class, StringBuffer.class, StringBuffer.class, StringBuffer.class, c.class, String.class, h.class, List.class, String[].class, int[].class, RedirectHandler.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, hVar, list, strArr, iArr, redirectHandler);
    }

    public final String a(int i, String str, a aVar, d<Long> dVar, long j, com.ss.android.common.http.d[] dVarArr) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, aVar, dVar, new Long(j2), dVarArr}, this, f56940a, false, 60678, new Class[]{Integer.TYPE, String.class, a.class, d.class, Long.TYPE, com.ss.android.common.http.d[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, aVar, dVar, new Long(j2), dVarArr}, this, f56940a, false, 60678, new Class[]{Integer.TYPE, String.class, a.class, d.class, Long.TYPE, com.ss.android.common.http.d[].class}, String.class);
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, str, aVar, dVar, j, dVarArr);
    }

    public final String a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, bArr, str2, str3}, this, f56940a, false, 60682, new Class[]{Integer.TYPE, Integer.TYPE, String.class, byte[].class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, bArr, str2, str3}, this, f56940a, false, 60682, new Class[]{Integer.TYPE, Integer.TYPE, String.class, byte[].class, String.class, String.class}, String.class);
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, i2, str, bArr, str2, str3);
    }

    public final String a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, bArr, str2, str3, list}, this, f56940a, false, 60684, new Class[]{Integer.TYPE, Integer.TYPE, String.class, byte[].class, String.class, String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, bArr, str2, str3, list}, this, f56940a, false, 60684, new Class[]{Integer.TYPE, Integer.TYPE, String.class, byte[].class, String.class, String.class, List.class}, String.class);
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, i2, str, bArr, str2, str3, list);
    }

    public f(Context context) {
        this.f56942c = context;
    }

    public final byte[] a(int i, String str) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f56940a, false, 60675, new Class[]{Integer.TYPE, String.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f56940a, false, 60675, new Class[]{Integer.TYPE, String.class}, byte[].class);
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, str);
    }

    public final String a(int i, int i2, String str, List<com.ss.android.http.a.a> list) throws Exception {
        String str2 = str;
        List<com.ss.android.http.a.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, list2}, this, f56940a, false, 60687, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, list2}, this, f56940a, false, 60687, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class}, String.class);
        } else if (this.f56941b == null) {
            return null;
        } else {
            return this.f56941b.a(i, i2, str2, list2);
        }
    }

    public final String a(int i, int i2, String str, List<e> list, a aVar, com.ss.android.common.http.d[] dVarArr) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, aVar, dVarArr}, this, f56940a, false, 60681, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, a.class, com.ss.android.common.http.d[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, aVar, dVarArr}, this, f56940a, false, 60681, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, a.class, com.ss.android.common.http.d[].class}, String.class);
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, i2, str, list, aVar, dVarArr);
    }

    public final String b(int i, int i2, String str, List<e> list, boolean z, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, Byte.valueOf(z ? (byte) 1 : 0), dVarArr, list2}, this, f56940a, false, 60685, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, Boolean.TYPE, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, Byte.valueOf(z), dVarArr, list2}, this, f56940a, false, 60685, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, Boolean.TYPE, com.ss.android.common.http.d[].class, List.class}, String.class);
        } else if (this.f56941b == null) {
            return null;
        } else {
            return this.f56941b.b(i, i2, str, list, z, dVarArr, list2);
        }
    }

    public final String b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, bArr, str2, str3, list}, this, f56940a, false, 60686, new Class[]{Integer.TYPE, Integer.TYPE, String.class, byte[].class, String.class, String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, bArr, str2, str3, list}, this, f56940a, false, 60686, new Class[]{Integer.TYPE, Integer.TYPE, String.class, byte[].class, String.class, String.class, List.class}, String.class);
        } else if (this.f56941b == null) {
            return null;
        } else {
            return this.f56941b.b(i, i2, str, bArr, str2, str3, list);
        }
    }

    public final String a(int i, int i2, String str, List<e> list, boolean z, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, Byte.valueOf(z ? (byte) 1 : 0), dVarArr, list2}, this, f56940a, false, 60683, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, Boolean.TYPE, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, Byte.valueOf(z), dVarArr, list2}, this, f56940a, false, 60683, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, Boolean.TYPE, com.ss.android.common.http.d[].class, List.class}, String.class);
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, i2, str, list, z, dVarArr, list2);
    }

    public final String a(int i, int i2, String str, List<com.ss.android.http.a.a> list, boolean z, boolean z2, com.ss.android.http.a.b.f fVar, boolean z3) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), fVar, Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f56940a, false, 60679, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, Boolean.TYPE, Boolean.TYPE, com.ss.android.http.a.b.f.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, list, Byte.valueOf(z), Byte.valueOf(z2), fVar, Byte.valueOf(z3)}, this, f56940a, false, 60679, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, Boolean.TYPE, Boolean.TYPE, com.ss.android.http.a.b.f.class, Boolean.TYPE}, String.class);
        }
        if (this.f56941b == null) {
            this.f56941b = a();
        }
        return this.f56941b.a(i, i2, str, list, z, z2, fVar, z3);
    }
}
