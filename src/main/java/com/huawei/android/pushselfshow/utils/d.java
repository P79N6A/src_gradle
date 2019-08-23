package com.huawei.android.pushselfshow.utils;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.e;
import java.lang.reflect.Field;

public class d {
    public static int a(Context context, String str) {
        return a(context, "string", str);
    }

    public static int a(Context context, String str, String str2) {
        StringBuilder sb;
        String str3;
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier == 0) {
                Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
                identifier = Integer.parseInt(field.get(field.getName()).toString());
                if (identifier == 0) {
                    e.b("ResourceLoader", "Error-resourceType=" + str + "--resourceName=" + str2 + "--resourceId =" + identifier);
                }
            }
            return identifier;
        } catch (ClassNotFoundException e2) {
            e = e2;
            str3 = "ResourceLoader";
            sb = new StringBuilder("!!!! ResourceLoader: ClassNotFoundException-resourceType=");
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            e.c(str3, sb.toString(), e);
            return 0;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str3 = "ResourceLoader";
            sb = new StringBuilder("!!!! ResourceLoader: NoSuchFieldException-resourceType=");
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            e.c(str3, sb.toString(), e);
            return 0;
        } catch (NumberFormatException e4) {
            e = e4;
            str3 = "ResourceLoader";
            sb = new StringBuilder("!!!! ResourceLoader: NumberFormatException-resourceType=");
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            e.c(str3, sb.toString(), e);
            return 0;
        } catch (IllegalAccessException e5) {
            e = e5;
            str3 = "ResourceLoader";
            sb = new StringBuilder("!!!! ResourceLoader: IllegalAccessException-resourceType=");
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            e.c(str3, sb.toString(), e);
            return 0;
        } catch (IllegalArgumentException e6) {
            e = e6;
            str3 = "ResourceLoader";
            sb = new StringBuilder("!!!! ResourceLoader: IllegalArgumentException-resourceType=");
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            e.c(str3, sb.toString(), e);
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return a(context, "plurals", str);
    }

    public static int c(Context context, String str) {
        return a(context, "layout", str);
    }

    public static int d(Context context, String str) {
        return a(context, "menu", str);
    }

    public static int e(Context context, String str) {
        return a(context, "id", str);
    }

    public static int f(Context context, String str) {
        return a(context, "color", str);
    }

    public static int g(Context context, String str) {
        return a(context, "drawable", str);
    }
}
