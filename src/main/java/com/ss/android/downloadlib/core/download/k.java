package com.ss.android.downloadlib.core.download;

import android.net.Uri;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import com.tencent.bugly.CrashModule;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static Random f29030a = new Random(SystemClock.uptimeMillis());

    /* renamed from: b  reason: collision with root package name */
    public static l f29031b;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f29032c = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* renamed from: d  reason: collision with root package name */
    private static final Object f29033d = new Object();

    public static int a(int i) {
        if ((400 <= i && i < 487) || (500 <= i && i < 600)) {
            return i;
        }
        if (i == 497) {
            return 1005;
        }
        if (i == 499) {
            return 1011;
        }
        switch (i) {
            case 198:
                return 1006;
            case 199:
                return 1007;
            default:
                switch (i) {
                    case 488:
                        return 1009;
                    case 489:
                        return 1008;
                    case 490:
                        return 1012;
                    default:
                        switch (i) {
                            case 492:
                                return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
                            case 493:
                            case 494:
                                return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
                            case 495:
                                return CrashModule.MODULE_ID;
                            default:
                                return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        }
                }
        }
    }

    public static l a() {
        return f29031b;
    }

    static String a(String str) {
        try {
            Matcher matcher = f29032c.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(".apk")) {
            return true;
        }
        String path = Uri.parse(str).getPath();
        if (path == null || !path.endsWith(".apk")) {
            return false;
        }
        return true;
    }

    static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 0 || charAt > 31) && charAt != '\"' && charAt != '*' && charAt != '/' && charAt != ':' && charAt != '<' && charAt != '>' && charAt != '?' && charAt != '\\' && charAt != '|' && charAt != 127) {
                stringBuffer.append(charAt);
                z = false;
            } else if (!z) {
                stringBuffer.append('_');
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    static boolean a(String str, File file) {
        if (str == null || file == null) {
            return false;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            String[] strArr = {file.getCanonicalPath(), Environment.getDownloadCacheDirectory().getCanonicalPath(), Environment.getExternalStorageDirectory().getCanonicalPath()};
            for (int i = 0; i < 3; i++) {
                if (canonicalPath.startsWith(strArr[i])) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    private static String a(String str, boolean z) {
        String str2;
        if (str != null) {
            str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            if (str2 != null) {
                str2 = ClassUtils.PACKAGE_SEPARATOR + str2;
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        if (str == null || !str.toLowerCase().startsWith("text/")) {
            if (z) {
                return ".bin";
            }
            return str2;
        } else if (str.equalsIgnoreCase("text/html")) {
            return ".html";
        } else {
            if (z) {
                return ".txt";
            }
            return str2;
        }
    }

    private static String a(String str, String str2, boolean z) throws o {
        String str3 = str + str2;
        if (!new File(str3).exists() && !z) {
            return str3;
        }
        String str4 = str + "-";
        int i = 1;
        for (int i2 = 1; i2 < 1000000000; i2 *= 10) {
            for (int i3 = 0; i3 < 9; i3++) {
                String str5 = str4 + i + str2;
                if (!new File(str5).exists()) {
                    return str5;
                }
                i += f29030a.nextInt(i2) + 1;
            }
        }
        throw new o(492, "failed to generate an unused filename on internal download storage");
    }

    static String a(String str, String str2, int i, File file) throws o {
        boolean z;
        String str3;
        String a2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf < str.lastIndexOf(47)) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            if (z) {
                str3 = "";
            } else {
                str3 = str.substring(lastIndexOf);
                str = str.substring(0, lastIndexOf);
            }
        } else if (z) {
            str3 = a(str2, true);
        } else {
            String str4 = null;
            if (str2 != null) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1));
                if (mimeTypeFromExtension == null || !mimeTypeFromExtension.equalsIgnoreCase(str2)) {
                    str4 = a(str2, false);
                }
            }
            if (str4 == null) {
                str3 = str.substring(lastIndexOf);
            } else {
                str3 = str4;
            }
            str = str.substring(0, lastIndexOf);
        }
        boolean equalsIgnoreCase = "recovery".equalsIgnoreCase(str + str3);
        if (file != null) {
            str = file.getPath() + File.separator + str;
        }
        synchronized (f29033d) {
            a2 = a(str, str3, equalsIgnoreCase);
            try {
                File file2 = new File(a2);
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file2.createNewFile();
            } catch (IOException e2) {
                throw new o(492, "Failed to create target file " + a2, e2);
            }
        }
        return a2;
    }
}
