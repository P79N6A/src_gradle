package com.ss.android.http.a.b;

import com.ss.android.http.a.c.a;
import com.ss.android.http.a.d;
import com.ss.android.http.a.d.b;
import java.util.ArrayList;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final c f29136a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f29137b = {';', ','};

    private static d a(String str, String str2) {
        return new e(str, str2);
    }

    private d c(b bVar, h hVar) {
        return a(bVar, hVar, f29137b);
    }

    private static boolean a(char c2, char[] cArr) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c2 == c3) {
                    return true;
                }
            }
        }
        return false;
    }

    private d[] b(b bVar, h hVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (hVar != null) {
            int i = hVar.f29143c;
            int i2 = hVar.f29142b;
            while (i < i2 && a.a(bVar.b(i))) {
                i++;
            }
            hVar.a(i);
            if (hVar.a()) {
                return new d[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!hVar.a()) {
                arrayList.add(c(bVar, hVar));
                if (bVar.b(hVar.f29143c - 1) == ',') {
                    break;
                }
            }
            return (d[]) arrayList.toArray(new d[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    public final com.ss.android.http.a.b[] a(b bVar, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (!hVar.a()) {
            if (bVar == null) {
                throw new IllegalArgumentException("Char array buffer may not be null");
            } else if (hVar != null) {
                d c2 = c(bVar, hVar);
                d[] dVarArr = null;
                if (!hVar.a() && bVar.b(hVar.f29143c - 1) != ',') {
                    dVarArr = b(bVar, hVar);
                }
                b bVar2 = new b(c2.a(), c2.b(), dVarArr);
                if (bVar2.a().length() != 0 || bVar2.b() != null) {
                    arrayList.add(bVar2);
                }
            } else {
                throw new IllegalArgumentException("Parser cursor may not be null");
            }
        }
        return (com.ss.android.http.a.b[]) arrayList.toArray(new com.ss.android.http.a.b[arrayList.size()]);
    }

    private d a(b bVar, h hVar, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (hVar != null) {
            int i = hVar.f29143c;
            int i2 = hVar.f29143c;
            int i3 = hVar.f29142b;
            while (true) {
                z = true;
                if (i >= i3) {
                    break;
                }
                char b2 = bVar.b(i);
                if (b2 == '=') {
                    break;
                } else if (a(b2, cArr)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            z2 = false;
            if (i == i3) {
                str = bVar.b(i2, i3);
                z2 = true;
            } else {
                str = bVar.b(i2, i);
                i++;
            }
            if (z2) {
                hVar.a(i);
                return a(str, (String) null);
            }
            int i4 = i;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i4 >= i3) {
                    z = z2;
                    break;
                }
                char b3 = bVar.b(i4);
                if (b3 == '\"' && !z3) {
                    z4 = !z4;
                }
                if (!z4 && !z3 && a(b3, cArr)) {
                    break;
                }
                if (z3 || !z4 || b3 != '\\') {
                    z3 = false;
                } else {
                    z3 = true;
                }
                i4++;
            }
            while (i < i4 && a.a(bVar.b(i))) {
                i++;
            }
            int i5 = i4;
            while (i5 > i && a.a(bVar.b(i5 - 1))) {
                i5--;
            }
            if (i5 - i >= 2 && bVar.b(i) == '\"' && bVar.b(i5 - 1) == '\"') {
                i++;
                i5--;
            }
            String a2 = bVar.a(i, i5);
            if (z) {
                i4++;
            }
            hVar.a(i4);
            return a(str, a2);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
