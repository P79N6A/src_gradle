package com.ss.android.socialbase.downloader.e;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.socialbase.downloader.b.a;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.constants.h;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.c;
import com.tencent.bugly.CrashModule;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30931a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static String f30932b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f30933c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d  reason: collision with root package name */
    private static Pattern f30934d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Pattern f30935e = null;

    public static boolean a(int i) {
        return i == 206 || i == 1;
    }

    public static boolean a(long j) {
        return j == -1;
    }

    public static boolean b(int i) {
        return i == 200 || i == 201 || i == 0;
    }

    public static void a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            d(downloadInfo.getSavePath(), downloadInfo.getName());
            d(downloadInfo.getTempPath(), downloadInfo.getTempName());
        }
    }

    public static boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    public static boolean a(DownloadInfo downloadInfo, boolean z, String str) {
        if (z || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return false;
        }
        try {
            if (new File(downloadInfo.getSavePath(), downloadInfo.getName()).exists() && a(downloadInfo.getSavePath(), downloadInfo.getName(), str) == h.VALID) {
                return true;
            }
        } catch (OutOfMemoryError unused) {
        }
        return false;
    }

    public static boolean a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (new File(str, str2).exists() && a(str, str2, (String) null) == h.VALID) {
                return true;
            }
        } catch (OutOfMemoryError unused) {
        }
        return false;
    }

    private static boolean a(File file, File file2, boolean z) throws BaseException {
        if (!(file == null || file2 == null)) {
            try {
                if (file.exists() && !file.isDirectory()) {
                    if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                        File parentFile = file2.getParentFile();
                        if (parentFile != null && !parentFile.mkdirs()) {
                            if (!parentFile.isDirectory()) {
                                throw new BaseException(1053, "Destination '" + parentFile + "' directory cannot be created");
                            }
                        }
                        if (file2.exists() && !file2.canWrite()) {
                            if (!file2.delete()) {
                                throw new IOException("Destination '" + file2 + "' exists but is read-only and delete failed");
                            }
                        }
                        b(file, file2, true);
                        return true;
                    }
                }
            } catch (BaseException e2) {
                throw e2;
            } catch (Throwable th) {
                a(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    public static boolean b(File file, File file2) throws BaseException {
        boolean renameTo = file.renameTo(file2);
        if (!renameTo) {
            renameTo = a(file, file2);
            try {
                file.delete();
            } catch (Throwable unused) {
            }
        }
        return renameTo;
    }

    public static List<HttpHeader> a(List<HttpHeader> list, String str, long j, long j2) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader next : list) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        StringBuilder sb = new StringBuilder("range CurrentOffset:");
        sb.append(j);
        sb.append(" EndOffset:");
        sb.append(j2);
        if (j2 == 0) {
            str2 = String.format("bytes=%s-", new Object[]{String.valueOf(j)});
        } else {
            str2 = String.format("bytes=%s-%s", new Object[]{String.valueOf(j), String.valueOf(j2)});
        }
        arrayList.add(new HttpHeader("Range", str2));
        return arrayList;
    }

    public static boolean a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (1 == activeNetworkInfo.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        String b2 = b(b.q());
        if ((b2 == null || !b2.contains(":")) && b2 != null && b2.equals(b.q().getPackageName())) {
            return true;
        }
        return false;
    }

    public static boolean a(Throwable th) {
        if (th == null) {
            return false;
        }
        String c2 = c(th);
        if (TextUtils.isEmpty(c2) || !c2.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    public static boolean b(Throwable th) {
        if (th == null) {
            return false;
        }
        String c2 = c(th);
        if (TextUtils.isEmpty(c2) || !c2.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    public static boolean a(BaseException baseException) {
        return baseException.getErrorCode() == 1051;
    }

    public static boolean b(BaseException baseException) {
        if (baseException instanceof com.ss.android.socialbase.downloader.exception.b) {
            com.ss.android.socialbase.downloader.exception.b bVar = (com.ss.android.socialbase.downloader.exception.b) baseException;
            if (bVar.getHttpStatusCode() == 412 || bVar.getHttpStatusCode() == 416) {
                return true;
            }
        }
        return false;
    }

    public static void a(Throwable th, String str) throws BaseException {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            baseException.setErrorMsg(str + "-" + baseException.getErrorMessage());
            throw baseException;
        } else if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, b(th, str));
        } else if (d(th)) {
            throw new BaseException(1048, b(th, str));
        } else if (a(th)) {
            throw new com.ss.android.socialbase.downloader.exception.b(CrashModule.MODULE_ID, 412, b(th, str));
        } else if (b(th)) {
            throw new com.ss.android.socialbase.downloader.exception.b(CrashModule.MODULE_ID, 416, b(th, str));
        } else if (e(th)) {
            throw new BaseException(1047, b(th, str));
        } else if (f(th)) {
            throw new BaseException(1049, b(th, str));
        } else if (g(th)) {
            throw new BaseException(1041, b(th, str));
        } else if (!(th instanceof IOException)) {
            throw new BaseException((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, b(th, str));
        } else if (h(th)) {
            throw new BaseException(1006, b(th, str));
        } else {
            throw new BaseException(1023, b(th, str));
        }
    }

    public static boolean d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        String b2 = b(b.q());
        if (b2 != null) {
            if (b2.equals(b.q().getPackageName() + ":downloader")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[SYNTHETIC, Splitter:B:20:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[SYNTHETIC, Splitter:B:28:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String e() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r4.append(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r2.<init>()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            goto L_0x002e
        L_0x0039:
            boolean r3 = com.ss.android.socialbase.downloader.b.a.a()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            if (r3 == 0) goto L_0x004d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            java.lang.String r4 = "get processName = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
        L_0x004d:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r2
        L_0x0055:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x005b
        L_0x005a:
            r1 = move-exception
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            r0.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r1
        L_0x0061:
            r1 = r0
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.e.d.e():java.lang.String");
    }

    public static boolean b() {
        if (c() || !b.b() || !l.a(true).f()) {
            return false;
        }
        return true;
    }

    public static String c(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable unused) {
            return "throwable getMsg error";
        }
    }

    public static long a(c cVar) {
        if (cVar == null) {
            return -1;
        }
        String a2 = cVar.a("Content-Length");
        if (TextUtils.isEmpty(a2)) {
            return -1;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static long b(List<com.ss.android.socialbase.downloader.model.b> list) {
        long j = 0;
        for (com.ss.android.socialbase.downloader.model.b j2 : list) {
            j += j2.j();
        }
        return j;
    }

    public static g c(int i) {
        g gVar = g.MAIN;
        if (i == g.SUB.ordinal()) {
            return g.SUB;
        }
        if (i == g.NOTIFICATION.ordinal()) {
            return g.NOTIFICATION;
        }
        return gVar;
    }

    private static boolean f(Throwable th) {
        if (th == null) {
            return false;
        }
        String c2 = c(th);
        if (TextUtils.isEmpty(c2) || !c2.contains("network not available")) {
            return false;
        }
        return true;
    }

    private static boolean g(Throwable th) {
        if (th == null) {
            return false;
        }
        String c2 = c(th);
        if (TextUtils.isEmpty(c2) || !c2.contains("Exception in connect")) {
            return false;
        }
        return true;
    }

    private static boolean h(Throwable th) {
        if (th == null) {
            return false;
        }
        String c2 = c(th);
        if (TextUtils.isEmpty(c2) || !c2.contains("ENOSPC")) {
            return false;
        }
        return true;
    }

    public static long a(String str) throws BaseException {
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getAvailableBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e2) {
            throw new BaseException(1050, (Throwable) e2);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    public static String b(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return a(digest, 0, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private static String d(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (f30934d == null) {
                f30934d = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            Matcher matcher = f30934d.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            if (f30935e == null) {
                f30935e = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
            }
            Matcher matcher2 = f30935e.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(1);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static boolean e(Throwable th) {
        if (th == null) {
            return false;
        }
        String c2 = c(th);
        if (th instanceof com.ss.android.socialbase.downloader.exception.b) {
            com.ss.android.socialbase.downloader.exception.b bVar = (com.ss.android.socialbase.downloader.exception.b) th;
            if ((bVar != null && bVar.getHttpStatusCode() == 403) || (!TextUtils.isEmpty(c2) && c2.contains("403"))) {
                return true;
            }
        }
        if (TextUtils.isEmpty(c2) || !c2.contains("Forbidden")) {
            return false;
        }
        return true;
    }

    public static String b(Context context) {
        String str = f30932b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        if (a.a()) {
                            new StringBuilder("processName = ").append(next.processName);
                        }
                        String str2 = next.processName;
                        f30932b = str2;
                        return str2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        String e2 = e();
        f30932b = e2;
        return e2;
    }

    private static boolean d(Throwable th) {
        if (th == null) {
            return false;
        }
        String c2 = c(th);
        if ((th instanceof SocketTimeoutException) || (!TextUtils.isEmpty(c2) && (c2.contains("time out") || c2.contains("Time-out")))) {
            return true;
        }
        return false;
    }

    public static List<com.ss.android.socialbase.downloader.model.b> a(List<com.ss.android.socialbase.downloader.model.b> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (com.ss.android.socialbase.downloader.model.b next : list) {
            if (next != null) {
                if (next.b()) {
                    sparseArray.put(next.f31057e, next);
                    List<com.ss.android.socialbase.downloader.model.b> list2 = (List) sparseArray2.get(next.f31057e);
                    if (list2 != null) {
                        for (com.ss.android.socialbase.downloader.model.b a2 : list2) {
                            a2.a(next);
                        }
                        next.g = list2;
                    }
                } else {
                    com.ss.android.socialbase.downloader.model.b bVar = (com.ss.android.socialbase.downloader.model.b) sparseArray.get(next.a());
                    if (bVar != null) {
                        List list3 = bVar.g;
                        if (list3 == null) {
                            list3 = new ArrayList();
                            bVar.g = list3;
                        }
                        next.a(bVar);
                        list3.add(next);
                    } else {
                        List list4 = (List) sparseArray2.get(next.a());
                        if (list4 == null) {
                            list4 = new ArrayList();
                            sparseArray2.put(next.a(), list4);
                        }
                        list4.add(next);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        if (arrayList.isEmpty()) {
            return list;
        }
        return arrayList;
    }

    public static boolean a(File file, File file2) throws BaseException {
        return a(file, file2, true);
    }

    private static void d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str, str2);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static com.ss.android.socialbase.downloader.model.c a(String str, String str2) throws BaseException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new BaseException(1021, (Throwable) new IOException("path must be not empty"));
        }
        File file = new File(str, str2);
        if (!file.exists() || !file.isDirectory()) {
            if (!file.exists()) {
                try {
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        if (file2.exists()) {
                            file2.delete();
                            throw new BaseException(1031, "download savePath is not directory");
                        } else if (!file2.mkdirs()) {
                            throw new BaseException(1030, "download savePath directory can not created");
                        }
                    }
                    file.createNewFile();
                } catch (IOException e2) {
                    throw new BaseException(1036, (Throwable) e2);
                }
            }
            return new com.ss.android.socialbase.downloader.model.c(file);
        }
        throw new BaseException(1035, (Throwable) new IOException(String.format("path is :%s, path is directory:%B:", new Object[]{str, Boolean.valueOf(file.isDirectory())})));
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return String.format("%s%s%s", new Object[]{str, File.separator, str2});
    }

    public static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    public static String a(c cVar, String str) {
        String d2 = d(cVar.a("Content-Disposition"));
        if (TextUtils.isEmpty(d2)) {
            return b(str);
        }
        return d2;
    }

    public static String b(Throwable th, String str) {
        if (str == null) {
            return c(th);
        }
        return str + "-" + c(th);
    }

    public static h a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return h.VALID;
        }
        File file = new File(str, str2);
        if (!file.exists()) {
            return h.INVALID_FILE_NO_EXIST;
        }
        String a2 = a.a(file);
        if (TextUtils.isEmpty(a2)) {
            return h.INVALID_FILE_MD5_EMPTY;
        }
        if (!a2.equals(str3)) {
            return h.INVALID_MD5_NOT_EQUALS;
        }
        return h.VALID;
    }

    private static String a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b2 = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f30933c[b2 >> 4];
                i4 = i6 + 1;
                cArr[i6] = f30933c[b2 & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d3, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ed, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f4, code lost:
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2 A[ExcHandler: all (r0v11 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x0034] */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.io.File r19, java.io.File r20, boolean r21) throws java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            boolean r2 = r20.exists()
            if (r2 == 0) goto L_0x002a
            boolean r2 = r20.isDirectory()
            if (r2 != 0) goto L_0x0011
            goto L_0x002a
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Destination '"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "' exists but is a directory"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x002a:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            r3 = 0
            java.nio.channels.FileChannel r10 = r2.getChannel()     // Catch:{ Throwable -> 0x010b }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            java.nio.channels.FileChannel r12 = r11.getChannel()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
            long r13 = r10.size()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b6 }
            r15 = 0
            r17 = r15
        L_0x0045:
            int r4 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0064
            long r4 = r13 - r17
            r6 = 31457280(0x1e00000, double:1.55419614E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0054
            r8 = r6
            goto L_0x0055
        L_0x0054:
            r8 = r4
        L_0x0055:
            r4 = r12
            r5 = r10
            r6 = r17
            long r4 = r4.transferFrom(r5, r6, r8)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b6 }
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            long r17 = r17 + r4
            goto L_0x0045
        L_0x0064:
            if (r12 == 0) goto L_0x0069
            r12.close()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x0069:
            r11.close()     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            if (r10 == 0) goto L_0x0071
            r10.close()     // Catch:{ Throwable -> 0x010b }
        L_0x0071:
            r2.close()
            long r2 = r19.length()
            long r4 = r20.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x008a
            if (r21 == 0) goto L_0x0089
            long r2 = r19.lastModified()
            r1.setLastModified(r2)
        L_0x0089:
            return
        L_0x008a:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to copy full contents from '"
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = "' to '"
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "' Expected length: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " Actual: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r6.<init>(r0)
            throw r6
        L_0x00b6:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00c0:
            if (r12 == 0) goto L_0x00d1
            if (r4 == 0) goto L_0x00ce
            r12.close()     // Catch:{ Throwable -> 0x00c8, all -> 0x00d2 }
            goto L_0x00d1
        L_0x00c8:
            r0 = move-exception
            r5 = r0
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r4, (java.lang.Throwable) r5)     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
            goto L_0x00d1
        L_0x00ce:
            r12.close()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x00d1:
            throw r1     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00dc
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00dc:
            if (r4 == 0) goto L_0x00e8
            r11.close()     // Catch:{ Throwable -> 0x00e2, all -> 0x00ec }
            goto L_0x00eb
        L_0x00e2:
            r0 = move-exception
            r5 = r0
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r4, (java.lang.Throwable) r5)     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            goto L_0x00eb
        L_0x00e8:
            r11.close()     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
        L_0x00eb:
            throw r1     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00f6
        L_0x00f0:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00f6:
            if (r10 == 0) goto L_0x0107
            if (r4 == 0) goto L_0x0104
            r10.close()     // Catch:{ Throwable -> 0x00fe }
            goto L_0x0107
        L_0x00fe:
            r0 = move-exception
            r5 = r0
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r4, (java.lang.Throwable) r5)     // Catch:{ Throwable -> 0x010b }
            goto L_0x0107
        L_0x0104:
            r10.close()     // Catch:{ Throwable -> 0x010b }
        L_0x0107:
            throw r1     // Catch:{ Throwable -> 0x010b }
        L_0x0108:
            r0 = move-exception
            r1 = r0
            goto L_0x010e
        L_0x010b:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x0108 }
        L_0x010e:
            if (r3 == 0) goto L_0x011a
            r2.close()     // Catch:{ Throwable -> 0x0114 }
            goto L_0x011d
        L_0x0114:
            r0 = move-exception
            r2 = r0
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.lang.Throwable) r2)
            goto L_0x011d
        L_0x011a:
            r2.close()
        L_0x011d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.e.d.b(java.io.File, java.io.File, boolean):void");
    }
}
