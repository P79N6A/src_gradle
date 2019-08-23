package org.aspectj.a.a;

import java.util.Hashtable;
import java.util.StringTokenizer;
import org.aspectj.a.a.c;
import org.aspectj.lang.a;
import org.aspectj.lang.a.d;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    static Hashtable f84039e;

    /* renamed from: f  reason: collision with root package name */
    static /* synthetic */ Class f84040f;
    private static Object[] g = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    Class f84041a;

    /* renamed from: b  reason: collision with root package name */
    ClassLoader f84042b;

    /* renamed from: c  reason: collision with root package name */
    String f84043c;

    /* renamed from: d  reason: collision with root package name */
    int f84044d;

    static {
        Hashtable hashtable = new Hashtable();
        f84039e = hashtable;
        hashtable.put("void", Void.TYPE);
        f84039e.put("boolean", Boolean.TYPE);
        f84039e.put("byte", Byte.TYPE);
        f84039e.put("char", Character.TYPE);
        f84039e.put("short", Short.TYPE);
        f84039e.put("int", Integer.TYPE);
        f84039e.put("long", Long.TYPE);
        f84039e.put("float", Float.TYPE);
        f84039e.put("double", Double.TYPE);
    }

    private static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    private d a(int i) {
        return new g(this.f84041a, this.f84043c, i);
    }

    public b(String str, Class cls) {
        this.f84043c = str;
        this.f84041a = cls;
        this.f84042b = cls.getClassLoader();
    }

    static Class a(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f84039e.get(str);
        if (cls != null) {
            return cls;
        }
        if (classLoader != null) {
            return Class.forName(str, false, classLoader);
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (f84040f != null) {
                return f84040f;
            }
            Class a2 = a("java.lang.ClassNotFoundException");
            f84040f = a2;
            return a2;
        }
    }

    public final a.C0900a a(String str, org.aspectj.lang.d dVar, int i) {
        int i2 = this.f84044d;
        this.f84044d = i2 + 1;
        return new c.a(i2, str, dVar, a(i));
    }

    public static a a(a.C0900a aVar, Object obj, Object obj2, Object obj3) {
        return new c(aVar, obj, obj2, new Object[]{obj3});
    }

    public final org.aspectj.lang.a.c a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        int parseInt = Integer.parseInt(str, 16);
        String str9 = str3;
        Class a2 = a(str3, this.f84042b);
        String str10 = str4;
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i = 0; i < countTokens; i++) {
            clsArr[i] = a(stringTokenizer.nextToken(), this.f84042b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i2 = 0; i2 < countTokens2; i2++) {
            strArr[i2] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i3 = 0; i3 < countTokens3; i3++) {
            clsArr2[i3] = a(stringTokenizer3.nextToken(), this.f84042b);
        }
        String str11 = str2;
        e eVar = new e(parseInt, str11, a2, clsArr, strArr, clsArr2, a(str7, this.f84042b));
        return eVar;
    }
}
