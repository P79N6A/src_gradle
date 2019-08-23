package cn.com.chinatelecom.a.a.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import cn.com.chinatelecom.a.a.c.a;
import cn.com.chinatelecom.a.a.c.g;
import cn.com.chinatelecom.a.a.c.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static String f1709a;

    private static String a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[((int) randomAccessFile.length())];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return i.b(bArr);
    }

    public static synchronized String a(final Context context) {
        String str;
        synchronized (e.class) {
            if (TextUtils.isEmpty(f1709a)) {
                String b2 = b(context);
                f1709a = b2;
                if (TextUtils.isEmpty(b2)) {
                    String c2 = c(context);
                    f1709a = c2;
                    if (!TextUtils.isEmpty(c2)) {
                        f1709a = f1709a.replace("-", "");
                    }
                    final String str2 = f1709a;
                    if (!TextUtils.isEmpty(str2)) {
                        if (context != null) {
                            new Thread(new Runnable() {
                                public final void run() {
                                    String str;
                                    c.a(context, "common_deviceId", g.a(str2, d.c()));
                                    if (Build.VERSION.SDK_INT < 23 || a.a(context)) {
                                        a.a(context, str2, "Userinfoi2kenm281OQP8k03JLi1x2qw", "common_deviceId");
                                    }
                                    try {
                                        String c2 = i.c(d.e(context) + "INSTALLATION");
                                        String str2 = str2;
                                        if (TextUtils.isEmpty(str2)) {
                                            str = null;
                                        } else {
                                            byte[] encoded = a.a(c2, c2.getBytes("utf-8"), 32).getEncoded();
                                            byte[] b2 = i.b(str2);
                                            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
                                            Cipher instance = Cipher.getInstance("AES");
                                            instance.init(1, secretKeySpec);
                                            str = a.a(instance.doFinal(b2));
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            e.a(new File(context.getFilesDir(), "INSTALLATION_NEW"), str);
                                            if (!a.a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                                                ArrayList a2 = a.a();
                                                a2.add(a.b().getParent());
                                                Iterator it2 = a2.iterator();
                                                while (it2.hasNext()) {
                                                    File file = new File((String) it2.next());
                                                    if (file.isDirectory() && file.canWrite()) {
                                                        e.a(new File(file.getAbsolutePath(), "INSTALLATION_NEW"), str);
                                                    }
                                                }
                                                c.a(context, "InstalltionID_Version", g.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, d.c()));
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }).start();
                        }
                    }
                } else {
                    f1709a = f1709a.replace("-", "");
                }
            }
            str = f1709a;
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|3|4|(2:6|7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String c(android.content.Context r5) {
        /*
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r2)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = android.os.Build.SERIAL     // Catch:{ Exception -> 0x0051 }
            java.lang.String r3 = ""
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Exception -> 0x002d }
            java.lang.String r4 = "wifi"
            java.lang.Object r5 = r5.getSystemService(r4)     // Catch:{ Exception -> 0x002d }
            android.net.wifi.WifiManager r5 = (android.net.wifi.WifiManager) r5     // Catch:{ Exception -> 0x002d }
            if (r5 == 0) goto L_0x002d
            android.net.wifi.WifiInfo r5 = r5.getConnectionInfo()     // Catch:{ Exception -> 0x002d }
            java.lang.String r5 = r5.getMacAddress()     // Catch:{ Exception -> 0x002d }
            r3 = r5
        L_0x002d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0051 }
            r5.<init>()     // Catch:{ Exception -> 0x0051 }
            r5.append(r0)     // Catch:{ Exception -> 0x0051 }
            r5.append(r1)     // Catch:{ Exception -> 0x0051 }
            r5.append(r2)     // Catch:{ Exception -> 0x0051 }
            r5.append(r3)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "utf8"
            byte[] r5 = r5.getBytes(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.UUID r5 = java.util.UUID.nameUUIDFromBytes(r5)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0051 }
            return r5
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.e.e.c(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:42|43|44|45|46|(2:53|48)(1:58)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ce */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0080 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.content.Context r6) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "common_deviceId"
            java.lang.String r2 = ""
            java.lang.String r1 = cn.com.chinatelecom.a.a.e.c.b((android.content.Context) r6, (java.lang.String) r1, (java.lang.String) r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0018
            java.lang.String r0 = cn.com.chinatelecom.a.a.e.d.c()
            java.lang.String r0 = cn.com.chinatelecom.a.a.c.g.b((java.lang.String) r1, (java.lang.String) r0)
        L_0x0018:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x001f
            return r0
        L_0x001f:
            java.lang.String r0 = "common_deviceId"
            java.lang.String r1 = "Userinfoi2kenm281OQP8k03JLi1x2qw"
            java.lang.String r0 = cn.com.chinatelecom.a.a.e.a.a(r6, r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.String r0 = ""
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r3 = "INSTALLATION_NEW"
            r1.<init>(r2, r3)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x0046
            java.lang.String r1 = a((java.io.File) r1)     // Catch:{ Exception -> 0x0046 }
            r0 = r1
        L_0x0046:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = cn.com.chinatelecom.a.a.e.d.e(r6)
            r1.append(r2)
            java.lang.String r2 = "INSTALLATION"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = cn.com.chinatelecom.a.a.c.i.c(r1)
            java.lang.String r0 = cn.com.chinatelecom.a.a.c.a.a(r1, r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = ""
        L_0x0066:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x006d
            return r0
        L_0x006d:
            java.util.ArrayList r2 = cn.com.chinatelecom.a.a.e.a.a()
            java.io.File r3 = cn.com.chinatelecom.a.a.e.a.b()
            java.lang.String r3 = r3.getParent()
            r2.add(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0080:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = r4.isDirectory()
            if (r3 == 0) goto L_0x0080
            boolean r3 = r4.canWrite()
            if (r3 == 0) goto L_0x0080
            java.lang.String r3 = r4.getAbsolutePath()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "INSTALLATION_NEW"
            r4.<init>(r3, r5)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L_0x0080
            java.lang.String r3 = a((java.io.File) r4)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r3 = cn.com.chinatelecom.a.a.c.a.a(r1, r3)     // Catch:{ Exception -> 0x00b8 }
        L_0x00b6:
            r0 = r3
            goto L_0x00bb
        L_0x00b8:
            java.lang.String r3 = ""
            goto L_0x00b6
        L_0x00bb:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d5 }
            if (r3 != 0) goto L_0x0080
            java.lang.String r3 = "common_deviceId"
            java.lang.String r4 = cn.com.chinatelecom.a.a.e.d.c()     // Catch:{ Exception -> 0x00ce }
            java.lang.String r4 = cn.com.chinatelecom.a.a.c.g.a((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x00ce }
            cn.com.chinatelecom.a.a.e.c.a((android.content.Context) r6, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d5 }
            if (r3 != 0) goto L_0x0080
            return r0
        L_0x00d5:
            goto L_0x0080
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.e.e.b(android.content.Context):java.lang.String");
    }

    static /* synthetic */ void a(File file, String str) throws IOException {
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
        } else {
            file.deleteOnExit();
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(i.b(str));
        fileOutputStream.close();
    }
}
