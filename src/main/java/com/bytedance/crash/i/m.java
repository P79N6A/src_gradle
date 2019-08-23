package com.bytedance.crash.i;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final PrintWriter f19481a;

        a(PrintWriter printWriter) {
            this.f19481a = printWriter;
        }

        /* access modifiers changed from: package-private */
        public final void a(Object obj) {
            this.f19481a.println(obj);
        }
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement a2 : stackTraceElementArr) {
            a(a2, sb);
        }
        return sb.toString();
    }

    public static boolean b(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean c(Throwable th) {
        int i = 0;
        while (th != null) {
            if (th instanceof StackOverflowError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            th = th.getCause();
            i++;
        }
        return false;
    }

    @NonNull
    public static String a(@NonNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            if (c(th)) {
                a(th, printWriter);
            } else {
                com.google.a.a.a.a.a.a.a(th, printWriter);
            }
            return stringWriter.toString();
        } catch (Exception unused) {
            return "";
        } finally {
            printWriter.close();
        }
    }

    private static boolean b(String str) {
        Set<String> set = e.f19475a;
        if (set.contains(str)) {
            return true;
        }
        for (String next : set) {
            if (!TextUtils.isEmpty(str) && str.startsWith(next)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static JSONObject a(String str) {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                String name = ((Thread) next.getKey()).getName();
                if (!b(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put("thread_name", r6.getName() + "(" + r6.getId() + ")");
                    StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                    boolean z = true;
                    if (stackTraceElementArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement className : stackTraceElementArr) {
                            String className2 = className.getClassName();
                            jSONArray2.put(className2 + ClassUtils.PACKAGE_SEPARATOR + className.getMethodName() + "(" + stackTraceElementArr[r10].getLineNumber() + ")");
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        if (jSONArray2.length() <= 0) {
                            z = false;
                        }
                    }
                    if (z) {
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static StringBuilder a(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
        return sb;
    }

    private static void a(Throwable th, PrintWriter printWriter) {
        if (th != null) {
            a aVar = new a(printWriter);
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            synchronized (aVar.f19481a) {
                aVar.a(th);
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (i2 > 256) {
                        aVar.a("\t... skip " + (stackTrace.length - i2) + " lines");
                        break;
                    }
                    aVar.a("\tat " + stackTraceElement);
                    i2++;
                    i++;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    for (Throwable a2 : com.google.a.a.a.a.a.a.a(th)) {
                        a(a2, aVar, stackTrace, "Suppressed: ", "\t", newSetFromMap);
                    }
                }
                Throwable cause = th.getCause();
                if (cause != null) {
                    a(cause, aVar, stackTrace, "Caused by: ", "", newSetFromMap);
                }
            }
        }
    }

    private static void a(Throwable th, a aVar, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set) {
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, 256);
            int i = min - 1;
            int min2 = Math.min(stackTraceElementArr.length, 256) - 1;
            int i2 = i;
            while (i2 >= 0 && min2 >= 0 && stackTrace[i2].equals(stackTraceElementArr[min2])) {
                i2--;
                min2--;
            }
            int i3 = i - i2;
            aVar.a(str2 + str + th);
            for (int i4 = 0; i4 <= i2; i4++) {
                aVar.a(str2 + "\tat " + stackTrace[i4]);
            }
            if (min < stackTrace.length) {
                aVar.a("\t... skip " + (stackTrace.length - min) + " lines");
            }
            if (i3 != 0) {
                aVar.a(str2 + "\t... " + i3 + " more");
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable a2 : com.google.a.a.a.a.a.a.a(th)) {
                    a(a2, aVar, stackTrace, "Suppressed: ", str2 + "\t", set);
                }
            }
            th = th.getCause();
            if (th != null) {
                str = "Caused by: ";
                stackTraceElementArr = stackTrace;
            } else {
                return;
            }
        }
        aVar.a("\t[CIRCULAR REFERENCE:" + th + "]");
    }
}
