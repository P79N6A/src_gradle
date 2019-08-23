package com.ss.android.d.b.a.a;

import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;

public abstract class b {

    /* renamed from: c  reason: collision with root package name */
    public b f28362c;

    interface a<L> {
        L a();

        L a(L l, L l2, b bVar);

        void a(L l);

        boolean a(L l, L l2);

        boolean b(L l);
    }

    /* access modifiers changed from: protected */
    public abstract String a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(String str, String str2);

    /* access modifiers changed from: protected */
    public abstract void a(String str, String[] strArr);

    /* access modifiers changed from: protected */
    public abstract String[] b(String str);

    public void c(String str) {
        b bVar = this.f28362c;
        if (bVar != null) {
            bVar.c(str);
        }
    }

    public final String b(String str, String str2) {
        return (String) a(str, str2, new a<String>() {
            public final /* bridge */ /* synthetic */ Object a() {
                return b.this.a("openudid");
            }

            public final /* synthetic */ boolean b(Object obj) {
                return com.ss.android.d.c.b.a((String) obj);
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                b.this.a("openudid", (String) obj);
            }

            public final /* synthetic */ boolean a(Object obj, Object obj2) {
                return StringUtils.equal((String) obj, (String) obj2);
            }

            public final /* synthetic */ Object a(Object obj, Object obj2, b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.b(str, str2);
            }
        });
    }

    public final String c(String str, String str2) {
        return (String) a(str, str2, new a<String>() {
            public final /* bridge */ /* synthetic */ Object a() {
                return b.this.a("clientudid");
            }

            public final /* synthetic */ boolean b(Object obj) {
                return com.ss.android.d.c.b.a((String) obj);
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                b.this.a("clientudid", (String) obj);
            }

            public final /* synthetic */ boolean a(Object obj, Object obj2) {
                return StringUtils.equal((String) obj, (String) obj2);
            }

            public final /* synthetic */ Object a(Object obj, Object obj2, b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.c(str, str2);
            }
        });
    }

    public final String d(String str, String str2) {
        return (String) a(str, str2, new a<String>() {
            public final /* bridge */ /* synthetic */ Object a() {
                return b.this.a("serial_number");
            }

            public final /* synthetic */ boolean b(Object obj) {
                if (!TextUtils.isEmpty((String) obj)) {
                    return true;
                }
                return false;
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                b.this.a("serial_number", (String) obj);
            }

            public final /* synthetic */ boolean a(Object obj, Object obj2) {
                return StringUtils.equal((String) obj, (String) obj2);
            }

            public final /* synthetic */ Object a(Object obj, Object obj2, b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.d(str, str2);
            }
        });
    }

    public final String e(String str, String str2) {
        return (String) a(str, str2, new a<String>() {
            public final /* bridge */ /* synthetic */ Object a() {
                return b.this.a("udid");
            }

            public final /* synthetic */ boolean b(Object obj) {
                return com.ss.android.d.c.b.a((String) obj);
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                b.this.a("udid", (String) obj);
            }

            public final /* synthetic */ boolean a(Object obj, Object obj2) {
                return StringUtils.equal((String) obj, (String) obj2);
            }

            public final /* synthetic */ Object a(Object obj, Object obj2, b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.e(str, str2);
            }
        });
    }

    public final String f(String str, String str2) {
        return (String) a(str, str2, new a<String>() {
            public final /* bridge */ /* synthetic */ Object a() {
                return b.this.a("device_id");
            }

            public final /* synthetic */ boolean b(Object obj) {
                if (!TextUtils.isEmpty((String) obj)) {
                    return true;
                }
                return false;
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                b.this.a("device_id", (String) obj);
            }

            public final /* synthetic */ boolean a(Object obj, Object obj2) {
                return StringUtils.equal((String) obj, (String) obj2);
            }

            public final /* synthetic */ Object a(Object obj, Object obj2, b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.f(str, str2);
            }
        });
    }

    public final String[] a(String[] strArr, String[] strArr2) {
        return (String[]) a(strArr, strArr2, new a<String[]>() {
            public final /* synthetic */ Object a() {
                return b.this.b("sim_serial_number");
            }

            public final /* bridge */ /* synthetic */ boolean b(Object obj) {
                String[] strArr = (String[]) obj;
                if (strArr == null || strArr.length <= 0) {
                    return false;
                }
                return true;
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                b.this.a("sim_serial_number", (String[]) obj);
            }

            public final /* synthetic */ boolean a(Object obj, Object obj2) {
                String[] strArr = (String[]) obj;
                String[] strArr2 = (String[]) obj2;
                if (strArr != strArr2) {
                    if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
                        return false;
                    }
                    for (String str : strArr) {
                        boolean z = false;
                        for (String equal : strArr2) {
                            if (StringUtils.equal(equal, str) || z) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, b bVar) {
                String[] strArr = (String[]) obj;
                String[] strArr2 = (String[]) obj2;
                if (bVar == null) {
                    return strArr;
                }
                return bVar.a(strArr, strArr2);
            }
        });
    }

    private <T> T a(T t, T t2, a<T> aVar) {
        b bVar = this.f28362c;
        T a2 = aVar.a();
        boolean b2 = aVar.b(t);
        boolean b3 = aVar.b(a2);
        if (!b2 && b3) {
            t = a2;
        }
        if (bVar != null) {
            T a3 = aVar.a(t, t2, bVar);
            if (!aVar.a(a3, a2)) {
                aVar.a(a3);
            }
            return a3;
        }
        boolean z = false;
        if (!b2 && !b3) {
            z = true;
            t = t2;
        }
        if ((z && aVar.b(t)) || (b2 && !aVar.a(t, a2))) {
            aVar.a(t);
        }
        return t;
    }
}
