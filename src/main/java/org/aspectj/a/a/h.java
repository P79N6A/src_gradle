package org.aspectj.a.a;

public final class h {
    static h j;
    static h k;
    static h l;

    /* renamed from: a  reason: collision with root package name */
    boolean f84062a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f84063b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f84064c;

    /* renamed from: d  reason: collision with root package name */
    boolean f84065d;

    /* renamed from: e  reason: collision with root package name */
    boolean f84066e;

    /* renamed from: f  reason: collision with root package name */
    boolean f84067f = true;
    boolean g = true;
    boolean h = true;
    int i;

    h() {
    }

    static {
        h hVar = new h();
        j = hVar;
        hVar.f84062a = true;
        j.f84063b = false;
        j.f84064c = false;
        j.f84065d = false;
        j.f84066e = true;
        j.f84067f = false;
        j.g = false;
        j.i = 0;
        h hVar2 = new h();
        k = hVar2;
        hVar2.f84062a = true;
        k.f84063b = true;
        k.f84064c = false;
        k.f84065d = false;
        k.f84066e = false;
        j.i = 1;
        h hVar3 = new h();
        l = hVar3;
        hVar3.f84062a = false;
        l.f84063b = true;
        l.f84064c = false;
        l.f84065d = true;
        l.f84066e = false;
        l.h = false;
        l.i = 2;
    }

    public final String a(Class cls) {
        return a(cls, cls.getName(), this.f84062a);
    }

    private static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public final void a(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(a(clsArr[i2]));
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(Class cls, String str, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType, componentType.getName(), z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z) {
            return a(str).replace('$', '.');
        } else {
            return str.replace('$', '.');
        }
    }
}
