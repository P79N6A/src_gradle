package c.a.a.a;

import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1626a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1627b;

    public static float b() {
        try {
            return ((Float) a("android.os.FtBuild", "getRomVersion", new Object[0])).floatValue();
        } catch (ClassNotFoundException | Exception unused) {
            return 2.5f;
        }
    }

    public static boolean a() {
        String str = "no";
        try {
            str = (String) a("android.os.SystemProperties", "get", "ro.vivo.product.overseas", "no");
        } catch (ClassNotFoundException | Exception unused) {
        }
        return "yes".equals(str);
    }

    private static Object a(String str, String str2, Object... objArr) throws Exception {
        Class<?> cls = Class.forName(str);
        Class[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Method method = cls.getMethod(str2, clsArr);
        method.setAccessible(true);
        return method.invoke(null, objArr);
    }
}
