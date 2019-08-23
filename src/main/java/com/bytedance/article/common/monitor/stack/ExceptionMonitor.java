package com.bytedance.article.common.monitor.stack;

import android.text.TextUtils;
import com.bytedance.apm.e.b;
import com.bytedance.services.apm.api.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;

public class ExceptionMonitor {
    private static boolean sDebug;

    private static void ensureNotReachHereDefault() {
        report(3, Thread.currentThread().getStackTrace(), null, true, null);
    }

    public static void ensureNotReachHere() {
        if (a.a() != null) {
            if (a.f22528a != null) {
                a.f22528a.ensureNotReachHere();
            }
            return;
        }
        ensureNotReachHereDefault();
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    public static void setUploadUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            b.f18972a = str;
        }
    }

    public static boolean ensureFalse(boolean z) {
        if (a.a() == null) {
            return ensureFalseDefault(z);
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureFalse(z);
        return z;
    }

    private static boolean ensureFalseDefault(boolean z) {
        if (z) {
            report(3, Thread.currentThread().getStackTrace(), null, true, null);
        }
        return z;
    }

    private static boolean ensureNotEmptyDefault(Collection collection) {
        boolean z;
        if (collection == null || collection.size() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            report(3, Thread.currentThread().getStackTrace(), null, true, null);
        }
        return z;
    }

    public static boolean ensureNotNull(Object obj) {
        boolean z;
        if (a.a() == null) {
            return ensureNotNullDefault(obj);
        }
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureNotNull(obj);
        return z;
    }

    private static boolean ensureNotNullDefault(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            report(3, Thread.currentThread().getStackTrace(), null, true, null);
        }
        return z;
    }

    private static void ensureNotReachHereDefault(String str) {
        report(3, Thread.currentThread().getStackTrace(), str, true, null);
    }

    public static boolean ensureTrue(boolean z) {
        if (a.a() == null) {
            return ensureTrueDefault(z);
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureTrue(z);
        return z;
    }

    private static boolean ensureTrueDefault(boolean z) {
        if (!z) {
            report(3, Thread.currentThread().getStackTrace(), null, true, null);
        }
        return z;
    }

    public static boolean ensureNotEmpty(Collection collection) {
        boolean z;
        if (a.a() == null) {
            return ensureNotEmptyDefault(collection);
        }
        if (collection == null || collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureNotEmpty(collection);
        return z;
    }

    public static void ensureNotReachHere(String str) {
        if (a.a() != null) {
            if (a.f22528a != null) {
                a.f22528a.ensureNotReachHere(str);
            }
            return;
        }
        ensureNotReachHereDefault(str);
    }

    private static void ensureNotReachHereDefault(Throwable th) {
        if (needReport(th)) {
            reportException(3, Thread.currentThread().getStackTrace(), th, null, true, true, null);
        }
    }

    private static String getThrowableStack(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        com.google.a.a.a.a.a.a.a(th, printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            com.google.a.a.a.a.a.a.a(cause, printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                com.google.a.a.a.a.a.a.a(cause2, printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        if (stringWriter2.length() > 1024) {
            return stringWriter2.substring(0, 1024);
        }
        return stringWriter2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        if ((r5 instanceof javax.net.ssl.SSLHandshakeException) != false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0064 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean needReport(java.lang.Throwable r5) {
        /*
            com.bytedance.apm.e.b.a()
            com.bytedance.apm.internal.ApmDelegate r0 = com.bytedance.apm.internal.ApmDelegate.getInstance()
            boolean r0 = r0.isConfigReady()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001d
            com.bytedance.apm.internal.ApmDelegate r0 = com.bytedance.apm.internal.ApmDelegate.getInstance()
            java.lang.String r3 = "exception_filter_network"
            boolean r0 = r0.getLogTypeSwitch(r3)
            if (r0 != 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0065
            if (r5 == 0) goto L_0x0060
            boolean r0 = r5 instanceof org.apache.http.conn.ConnectTimeoutException
            if (r0 == 0) goto L_0x0028
        L_0x0026:
            r5 = 1
            goto L_0x0061
        L_0x0028:
            boolean r3 = r5 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L_0x002d
            goto L_0x0026
        L_0x002d:
            boolean r3 = r5 instanceof java.net.BindException
            if (r3 == 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            boolean r3 = r5 instanceof java.net.ConnectException
            if (r3 == 0) goto L_0x0037
            goto L_0x0026
        L_0x0037:
            boolean r3 = r5 instanceof java.net.NoRouteToHostException
            if (r3 == 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            boolean r4 = r5 instanceof java.net.PortUnreachableException
            if (r4 == 0) goto L_0x0041
            goto L_0x0026
        L_0x0041:
            boolean r4 = r5 instanceof java.net.SocketException
            if (r4 == 0) goto L_0x0046
            goto L_0x0026
        L_0x0046:
            boolean r4 = r5 instanceof java.net.UnknownHostException
            if (r4 == 0) goto L_0x004b
            goto L_0x0026
        L_0x004b:
            if (r3 == 0) goto L_0x004e
            goto L_0x0026
        L_0x004e:
            boolean r3 = r5 instanceof java.net.ProtocolException
            if (r3 == 0) goto L_0x0053
            goto L_0x0026
        L_0x0053:
            boolean r3 = r5 instanceof javax.net.ssl.SSLException
            if (r3 == 0) goto L_0x0058
            goto L_0x0026
        L_0x0058:
            if (r0 == 0) goto L_0x005b
            goto L_0x0026
        L_0x005b:
            boolean r5 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x0060
            goto L_0x0026
        L_0x0060:
            r5 = 0
        L_0x0061:
            if (r5 != 0) goto L_0x0064
            return r2
        L_0x0064:
            return r1
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.article.common.monitor.stack.ExceptionMonitor.needReport(java.lang.Throwable):boolean");
    }

    public static void ensureNotReachHere(Throwable th) {
        if (a.a() != null) {
            if (a.f22528a != null) {
                a.f22528a.ensureNotReachHere(th);
            }
            return;
        }
        ensureNotReachHereDefault(th);
    }

    private static void ensureNotReachHereDefault(String str, Map<String, String> map) {
        report(str, map);
    }

    private static void report(String str, Map<String, String> map) {
        report(3, Thread.currentThread().getStackTrace(), str, false, map);
    }

    private static void appendData(Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String next : map.keySet()) {
                    jSONObject2.put(next, map.get(next));
                }
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean ensureFalse(boolean z, String str) {
        if (a.a() == null) {
            return ensureFalseDefault(z, str);
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureFalse(z, str);
        return z;
    }

    private static boolean ensureFalseDefault(boolean z, String str) {
        if (z) {
            report(3, Thread.currentThread().getStackTrace(), str, true, null);
        }
        return z;
    }

    public static boolean ensureNotNull(Object obj, String str) {
        boolean z;
        if (a.a() == null) {
            return ensureNotNullDefault(obj, str);
        }
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureNotNull(obj, str);
        return z;
    }

    private static boolean ensureNotNullDefault(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            report(3, Thread.currentThread().getStackTrace(), str, true, null);
        }
        return z;
    }

    public static boolean ensureTrue(boolean z, String str) {
        if (a.a() == null) {
            return ensureTrueDefault(z, str);
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureTrue(z, str);
        return z;
    }

    private static boolean ensureTrueDefault(boolean z, String str) {
        if (!z) {
            report(3, Thread.currentThread().getStackTrace(), str, true, null);
        }
        return z;
    }

    public static void ensureNotReachHere(String str, Map<String, String> map) {
        if (a.a() != null) {
            if (a.f22528a != null) {
                a.f22528a.ensureNotReachHere(str, map);
            }
            return;
        }
        ensureNotReachHereDefault(str, map);
    }

    private static void ensureNotReachHereDefault(Throwable th, String str) {
        if (needReport(th)) {
            reportException(3, Thread.currentThread().getStackTrace(), th, str, true, true, null);
        }
    }

    public static void ensureNotReachHere(Throwable th, String str) {
        if (a.a() != null) {
            if (a.f22528a != null) {
                a.f22528a.ensureNotReachHere(th, str);
            }
            return;
        }
        ensureNotReachHereDefault(th, str);
    }

    private static boolean ensureFalseDefault(boolean z, String str, Map<String, String> map) {
        if (z) {
            report(str, map);
        }
        return z;
    }

    private static boolean ensureTrueDefault(boolean z, String str, Map<String, String> map) {
        if (!z) {
            report(str, map);
        }
        return z;
    }

    public static boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        if (a.a() == null) {
            return ensureFalseDefault(z, str, map);
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureFalse(z, str, map);
        return z;
    }

    public static boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        if (a.a() == null) {
            return ensureTrueDefault(z, str, map);
        }
        if (a.f22528a == null) {
            return z;
        }
        a.f22528a.ensureTrue(z, str, map);
        return z;
    }

    private static void ensureNotReachHereDefault(Throwable th, String str, Map<String, String> map) {
        if (needReport(th)) {
            reportException(3, Thread.currentThread().getStackTrace(), th, str, true, false, map);
        }
    }

    public static void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (a.a() != null) {
            if (a.f22528a != null) {
                a.f22528a.ensureNotReachHere(th, str, map);
            }
            return;
        }
        ensureNotReachHereDefault(th, str, map);
    }

    public static void reportLogEException(int i, Throwable th, String str, boolean z) {
        if (a.a() != null) {
            if (a.f22528a != null) {
                a.f22528a.reportLogException(i, th, str);
            }
            return;
        }
        reportLogEExceptionDefault(i, th, str, z);
    }

    private static void reportLogEExceptionDefault(int i, Throwable th, String str, boolean z) {
        if (needReport(th)) {
            reportException(i + 2, Thread.currentThread().getStackTrace(), th, str, z, false, null);
        }
    }

    private static void report(int i, StackTraceElement[] stackTraceElementArr, String str, boolean z, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (stackTraceElement != null) {
                        String className = stackTraceElement.getClassName();
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
                            throw new IllegalArgumentException("stackTraceElements must not be null or empty");
                        }
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        while (i2 < stackTraceElementArr.length && i2 <= 40) {
                            if ((i2 != 0 || !"getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName())) && (i2 != 1 || !"getStackTrace".equals(stackTraceElementArr[1].getMethodName()))) {
                                sb.append("\tat " + stackTraceElementArr[i2].getClassName());
                                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                                sb.append(stackTraceElementArr[i2].getMethodName());
                                sb.append("(");
                                sb.append(stackTraceElementArr[i2].getFileName());
                                sb.append(":");
                                sb.append(stackTraceElementArr[i2].getLineNumber());
                                sb.append(")\n");
                            }
                            i2++;
                        }
                        String sb2 = sb.toString();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", "exception");
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("class_ref", className);
                        jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, methodName);
                        jSONObject.put("line_num", lineNumber);
                        jSONObject.put("stack", sb2);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("is_core", 1);
                        if (!TextUtils.isEmpty(str)) {
                            if (str.length() > 1024) {
                                jSONObject.put("message", str.substring(0, 1024));
                            } else {
                                jSONObject.put("message", str);
                            }
                        }
                        appendData(map, jSONObject);
                        b.a().a("core_exception_monitor", jSONObject.toString(), str, z);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static void reportException(int i, StackTraceElement[] stackTraceElementArr, Throwable th, String str, boolean z, boolean z2, Map<String, String> map) {
        if (th != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                String throwableStack = getThrowableStack(th);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "exception");
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("class_ref", className);
                jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, methodName);
                jSONObject.put("line_num", lineNumber);
                jSONObject.put("stack", throwableStack);
                jSONObject.put("exception_type", 0);
                if (z2) {
                    jSONObject.put("is_core", 1);
                } else {
                    jSONObject.put("is_core", 0);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() > 1024) {
                        jSONObject.put("message", str.substring(0, 1024));
                    } else {
                        jSONObject.put("message", str);
                    }
                }
                appendData(map, jSONObject);
                b.a().a("core_exception_monitor", jSONObject.toString(), str, z);
            } catch (Throwable unused) {
            }
        }
    }
}
