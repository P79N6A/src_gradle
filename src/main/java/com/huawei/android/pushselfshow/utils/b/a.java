package com.huawei.android.pushselfshow.utils.b;

import com.huawei.android.pushagent.utils.a.e;
import java.io.File;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f25372a;

    /* renamed from: b  reason: collision with root package name */
    private String f25373b;

    public a(String str, String str2) {
        this.f25372a = str;
        this.f25373b = str2;
    }

    public static File a(String str, String str2) {
        File file;
        String[] split = str2.split("/");
        File file2 = new File(str);
        int i = 0;
        while (i < split.length - 1) {
            try {
                i++;
                file2 = new File(file2, new String(split[i].getBytes("8859_1"), "GB2312"));
            } catch (Exception unused) {
                file = file2;
                return file;
            }
        }
        e.a("PushSelfShowLog", "file1 = " + file2);
        if (!file2.exists() && !file2.mkdirs()) {
            e.a("PushSelfShowLog", "ret.mkdirs faild");
        }
        String str3 = new String(split[split.length - 1].getBytes("8859_1"), "GB2312");
        e.a("PushSelfShowLog", "substr = " + str3);
        file = new File(file2, str3);
        try {
            e.a("PushSelfShowLog", "file2 = " + file);
            return file;
        } catch (Exception unused2) {
            return file;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r7v7, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r7v10, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v10, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r7v13, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v15, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v31 */
    /* JADX WARNING: type inference failed for: r6v32, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: type inference failed for: r7v34 */
    /* JADX WARNING: type inference failed for: r7v35 */
    /* JADX WARNING: type inference failed for: r7v37 */
    /* JADX WARNING: type inference failed for: r7v38 */
    /* JADX WARNING: type inference failed for: r7v39 */
    /* JADX WARNING: type inference failed for: r7v41 */
    /* JADX WARNING: type inference failed for: r7v42 */
    /* JADX WARNING: type inference failed for: r7v43 */
    /* JADX WARNING: type inference failed for: r7v45 */
    /* JADX WARNING: type inference failed for: r7v46 */
    /* JADX WARNING: type inference failed for: r7v47 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0202, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "zFileIn.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0220, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "is.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "os.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x025d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x025e, code lost:
        r6 = "PushSelfShowLog";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r5 = "tempFOS.close error:" + r5.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0296, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "zFileIn.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b4, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "is.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02d2, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "os.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02f1, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02f2, code lost:
        r6 = "PushSelfShowLog";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r5 = "tempFOS.close error:" + r5.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x032a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "zFileIn.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0348, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "is.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0366, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "os.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0385, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0386, code lost:
        r6 = "PushSelfShowLog";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r5 = "tempFOS.close error:" + r5.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03a3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "zFileIn.close error:" + r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03c1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "is.close error:" + r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03fd, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "tempFOS.close error:" + r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0426, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0428, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x042a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x042d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0457, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0458, code lost:
        r1 = "PushSelfShowLog";
        r2 = new java.lang.StringBuilder("zfile.close error:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0485, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0486, code lost:
        r1 = "PushSelfShowLog";
        r2 = new java.lang.StringBuilder("zfile.close error:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04b3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04b4, code lost:
        r1 = "PushSelfShowLog";
        r2 = new java.lang.StringBuilder("zfile.close error:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04e1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04e2, code lost:
        r1 = "PushSelfShowLog";
        r2 = new java.lang.StringBuilder("zfile.close error:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0132, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "zFileIn.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "is.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "os.close error:" + r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0187, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0188, code lost:
        r6 = "PushSelfShowLog";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r5 = "tempFOS.close error:" + r5.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01fe A[SYNTHETIC, Splitter:B:110:0x01fe] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x021c A[SYNTHETIC, Splitter:B:117:0x021c] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x023a A[SYNTHETIC, Splitter:B:124:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0258 A[SYNTHETIC, Splitter:B:131:0x0258] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0292 A[SYNTHETIC, Splitter:B:144:0x0292] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02b0 A[SYNTHETIC, Splitter:B:151:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02ce A[SYNTHETIC, Splitter:B:158:0x02ce] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ec A[SYNTHETIC, Splitter:B:165:0x02ec] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0326 A[SYNTHETIC, Splitter:B:178:0x0326] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0344 A[SYNTHETIC, Splitter:B:185:0x0344] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0362 A[SYNTHETIC, Splitter:B:192:0x0362] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0380 A[SYNTHETIC, Splitter:B:199:0x0380] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x039f A[SYNTHETIC, Splitter:B:207:0x039f] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03bd A[SYNTHETIC, Splitter:B:214:0x03bd] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03db A[SYNTHETIC, Splitter:B:221:0x03db] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03f9 A[SYNTHETIC, Splitter:B:228:0x03f9] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0426 A[ExcHandler: NoSuchElementException (e java.util.NoSuchElementException), Splitter:B:65:0x0182] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0428 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:6:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x042d A[ExcHandler: ZipException (e java.util.zip.ZipException), Splitter:B:6:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0453 A[SYNTHETIC, Splitter:B:252:0x0453] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0481 A[SYNTHETIC, Splitter:B:263:0x0481] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04af A[SYNTHETIC, Splitter:B:274:0x04af] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04dd A[SYNTHETIC, Splitter:B:285:0x04dd] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04f1 A[SYNTHETIC, Splitter:B:292:0x04f1] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0034 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0034 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0034 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r14 = this;
            r0 = 0
            java.lang.String r1 = r14.f25373b     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            java.lang.String r2 = "/"
            boolean r1 = r1.endsWith(r2)     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            if (r1 != 0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            r1.<init>()     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            java.lang.String r2 = r14.f25373b     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            r1.append(r2)     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            java.lang.String r1 = r1.toString()     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            r14.f25373b = r1     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
        L_0x0020:
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            java.io.File r2 = new java.io.File     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            java.lang.String r3 = r14.f25372a     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            r2.<init>(r3)     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            r1.<init>(r2)     // Catch:{ ZipException -> 0x04c0, IOException -> 0x0492, IllegalStateException -> 0x0464, NoSuchElementException -> 0x0436, all -> 0x0430 }
            java.util.Enumeration r2 = r1.entries()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0034:
            boolean r5 = r2.hasMoreElements()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            if (r5 == 0) goto L_0x0416
            java.lang.Object r5 = r2.nextElement()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            boolean r6 = r5.isDirectory()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            if (r6 == 0) goto L_0x009d
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = "ze.getName() = "
            r7.<init>(r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = r5.getName()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r7.append(r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r7 = r7.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r6, r7)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r6.<init>()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r7 = r14.f25373b     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r6.append(r7)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r7 = r5.getName()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r6.append(r7)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r6 = r6.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r7 = new java.lang.String     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = "8859_1"
            byte[] r6 = r6.getBytes(r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = "GB2312"
            r7.<init>(r6, r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = "str = "
            r8.<init>(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r8.append(r7)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = r8.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r6, r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.io.File r6 = new java.io.File     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r6.<init>(r7)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            boolean r6 = r6.mkdir()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            if (r6 != 0) goto L_0x0034
        L_0x009d:
            java.lang.String r6 = r14.f25373b     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r7 = r5.getName()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.io.File r6 = a(r6, r7)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            boolean r7 = r6.isDirectory()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            if (r7 == 0) goto L_0x00ca
            r1.close()     // Catch:{ IOException -> 0x00b1 }
            return
        L_0x00b1:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
        L_0x00bb:
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.a(r1, r0)
            return
        L_0x00ca:
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = "ze.getName() = "
            r8.<init>(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = r5.getName()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r8.append(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = ",output file :"
            r8.append(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = r6.getAbsolutePath()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r8.append(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = r8.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r7, r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r7 = r5.getName()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            if (r7 == 0) goto L_0x010d
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r2 = "ze.getName() is empty= "
            com.huawei.android.pushagent.utils.a.e.a(r0, r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r1.close()     // Catch:{ IOException -> 0x0102 }
            return
        L_0x0102:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
            goto L_0x00bb
        L_0x010d:
            java.io.InputStream r5 = r1.getInputStream(r5)     // Catch:{ IOException -> 0x0308, IllegalStateException -> 0x0274, IndexOutOfBoundsException -> 0x01e0, all -> 0x01d8 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01d4, IllegalStateException -> 0x01d0, IndexOutOfBoundsException -> 0x01cd, all -> 0x01ca }
            r7.<init>(r6)     // Catch:{ IOException -> 0x01d4, IllegalStateException -> 0x01d0, IndexOutOfBoundsException -> 0x01cd, all -> 0x01ca }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x01c5, IllegalStateException -> 0x01c0, IndexOutOfBoundsException -> 0x01bc, all -> 0x01b8 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x01c5, IllegalStateException -> 0x01c0, IndexOutOfBoundsException -> 0x01bc, all -> 0x01b8 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x01b4, IllegalStateException -> 0x01b0, IndexOutOfBoundsException -> 0x01ad, all -> 0x01aa }
            r8.<init>(r5)     // Catch:{ IOException -> 0x01b4, IllegalStateException -> 0x01b0, IndexOutOfBoundsException -> 0x01ad, all -> 0x01aa }
        L_0x0120:
            r9 = 0
            int r10 = r8.read(r4, r9, r3)     // Catch:{ IOException -> 0x01a7, IllegalStateException -> 0x01a4, IndexOutOfBoundsException -> 0x01a1 }
            r11 = -1
            if (r10 == r11) goto L_0x012c
            r6.write(r4, r9, r10)     // Catch:{ IOException -> 0x01a7, IllegalStateException -> 0x01a4, IndexOutOfBoundsException -> 0x01a1 }
            goto L_0x0120
        L_0x012c:
            if (r5 == 0) goto L_0x014a
            r5.close()     // Catch:{ IOException -> 0x0132, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x014a
        L_0x0132:
            r5 = move-exception
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r11 = "zFileIn.close error:"
            r10.<init>(r11)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r10.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r10.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r9, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x014a:
            r8.close()     // Catch:{ IOException -> 0x014e, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0166
        L_0x014e:
            r5 = move-exception
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r10 = "is.close error:"
            r9.<init>(r10)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r9.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r9.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r8, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0166:
            r6.close()     // Catch:{ IOException -> 0x016a, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0182
        L_0x016a:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = "os.close error:"
            r8.<init>(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r8.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r8.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r6, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0182:
            r7.close()     // Catch:{ IOException -> 0x0187, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0034
        L_0x0187:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = "tempFOS.close error:"
            r7.<init>(r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r7.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r7.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x019c:
            com.huawei.android.pushagent.utils.a.e.a(r6, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0034
        L_0x01a1:
            r9 = move-exception
            goto L_0x01e5
        L_0x01a4:
            r9 = move-exception
            goto L_0x0279
        L_0x01a7:
            r9 = move-exception
            goto L_0x030d
        L_0x01aa:
            r2 = move-exception
            r8 = r0
            goto L_0x01dd
        L_0x01ad:
            r9 = move-exception
            r8 = r0
            goto L_0x01e5
        L_0x01b0:
            r9 = move-exception
            r8 = r0
            goto L_0x0279
        L_0x01b4:
            r9 = move-exception
            r8 = r0
            goto L_0x030d
        L_0x01b8:
            r2 = move-exception
            r6 = r0
            r8 = r6
            goto L_0x01dd
        L_0x01bc:
            r9 = move-exception
            r6 = r0
            r8 = r6
            goto L_0x01e5
        L_0x01c0:
            r9 = move-exception
            r6 = r0
            r8 = r6
            goto L_0x0279
        L_0x01c5:
            r9 = move-exception
            r6 = r0
            r8 = r6
            goto L_0x030d
        L_0x01ca:
            r2 = move-exception
            r6 = r0
            goto L_0x01db
        L_0x01cd:
            r9 = move-exception
            r6 = r0
            goto L_0x01e3
        L_0x01d0:
            r9 = move-exception
            r6 = r0
            goto L_0x0277
        L_0x01d4:
            r9 = move-exception
            r6 = r0
            goto L_0x030b
        L_0x01d8:
            r2 = move-exception
            r5 = r0
            r6 = r5
        L_0x01db:
            r7 = r6
            r8 = r7
        L_0x01dd:
            r0 = r2
            goto L_0x039d
        L_0x01e0:
            r9 = move-exception
            r5 = r0
            r6 = r5
        L_0x01e3:
            r7 = r6
            r8 = r7
        L_0x01e5:
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x039c }
            java.lang.String r12 = "os.write error:"
            r11.<init>(r12)     // Catch:{ all -> 0x039c }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x039c }
            r11.append(r9)     // Catch:{ all -> 0x039c }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x039c }
            com.huawei.android.pushagent.utils.a.e.a(r10, r9)     // Catch:{ all -> 0x039c }
            if (r5 == 0) goto L_0x021a
            r5.close()     // Catch:{ IOException -> 0x0202, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x021a
        L_0x0202:
            r5 = move-exception
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r11 = "zFileIn.close error:"
            r10.<init>(r11)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r10.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r10.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r9, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x021a:
            if (r8 == 0) goto L_0x0238
            r8.close()     // Catch:{ IOException -> 0x0220, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0238
        L_0x0220:
            r5 = move-exception
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r10 = "is.close error:"
            r9.<init>(r10)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r9.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r9.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r8, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0238:
            if (r6 == 0) goto L_0x0256
            r6.close()     // Catch:{ IOException -> 0x023e, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0256
        L_0x023e:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = "os.close error:"
            r8.<init>(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r8.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r8.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r6, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0256:
            if (r7 == 0) goto L_0x0034
            r7.close()     // Catch:{ IOException -> 0x025d, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0034
        L_0x025d:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = "tempFOS.close error:"
            r7.<init>(r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r7.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r7.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x019c
        L_0x0274:
            r9 = move-exception
            r5 = r0
            r6 = r5
        L_0x0277:
            r7 = r6
            r8 = r7
        L_0x0279:
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x039c }
            java.lang.String r12 = "os.write error:"
            r11.<init>(r12)     // Catch:{ all -> 0x039c }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x039c }
            r11.append(r9)     // Catch:{ all -> 0x039c }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x039c }
            com.huawei.android.pushagent.utils.a.e.a(r10, r9)     // Catch:{ all -> 0x039c }
            if (r5 == 0) goto L_0x02ae
            r5.close()     // Catch:{ IOException -> 0x0296, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x02ae
        L_0x0296:
            r5 = move-exception
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r11 = "zFileIn.close error:"
            r10.<init>(r11)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r10.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r10.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r9, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x02ae:
            if (r8 == 0) goto L_0x02cc
            r8.close()     // Catch:{ IOException -> 0x02b4, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x02cc
        L_0x02b4:
            r5 = move-exception
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r10 = "is.close error:"
            r9.<init>(r10)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r9.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r9.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r8, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x02cc:
            if (r6 == 0) goto L_0x02ea
            r6.close()     // Catch:{ IOException -> 0x02d2, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x02ea
        L_0x02d2:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = "os.close error:"
            r8.<init>(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r8.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r8.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r6, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x02ea:
            if (r7 == 0) goto L_0x0034
            r7.close()     // Catch:{ IOException -> 0x02f1, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0034
        L_0x02f1:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = "tempFOS.close error:"
            r7.<init>(r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r7.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r7.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x019c
        L_0x0308:
            r9 = move-exception
            r5 = r0
            r6 = r5
        L_0x030b:
            r7 = r6
            r8 = r7
        L_0x030d:
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x039c }
            java.lang.String r12 = "os.write error:"
            r11.<init>(r12)     // Catch:{ all -> 0x039c }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x039c }
            r11.append(r9)     // Catch:{ all -> 0x039c }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x039c }
            com.huawei.android.pushagent.utils.a.e.a(r10, r9)     // Catch:{ all -> 0x039c }
            if (r5 == 0) goto L_0x0342
            r5.close()     // Catch:{ IOException -> 0x032a, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0342
        L_0x032a:
            r5 = move-exception
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r11 = "zFileIn.close error:"
            r10.<init>(r11)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r10.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r10.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r9, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0342:
            if (r8 == 0) goto L_0x0360
            r8.close()     // Catch:{ IOException -> 0x0348, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0360
        L_0x0348:
            r5 = move-exception
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r10 = "is.close error:"
            r9.<init>(r10)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r9.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r9.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r8, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0360:
            if (r6 == 0) goto L_0x037e
            r6.close()     // Catch:{ IOException -> 0x0366, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x037e
        L_0x0366:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r9 = "os.close error:"
            r8.<init>(r9)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r8.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r8.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r6, r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x037e:
            if (r7 == 0) goto L_0x0034
            r7.close()     // Catch:{ IOException -> 0x0385, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0034
        L_0x0385:
            r5 = move-exception
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r8 = "tempFOS.close error:"
            r7.<init>(r8)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r7.append(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = r7.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x019c
        L_0x039c:
            r0 = move-exception
        L_0x039d:
            if (r5 == 0) goto L_0x03bb
            r5.close()     // Catch:{ IOException -> 0x03a3, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x03bb
        L_0x03a3:
            r2 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = "zFileIn.close error:"
            r4.<init>(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r4.append(r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r4.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r3, r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x03bb:
            if (r8 == 0) goto L_0x03d9
            r8.close()     // Catch:{ IOException -> 0x03c1, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x03d9
        L_0x03c1:
            r2 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = "is.close error:"
            r4.<init>(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r4.append(r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r4.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r3, r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x03d9:
            if (r6 == 0) goto L_0x03f7
            r6.close()     // Catch:{ IOException -> 0x03df, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x03f7
        L_0x03df:
            r2 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = "os.close error:"
            r4.<init>(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r4.append(r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r4.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r3, r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x03f7:
            if (r7 == 0) goto L_0x0415
            r7.close()     // Catch:{ IOException -> 0x03fd, ZipException -> 0x042d, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            goto L_0x0415
        L_0x03fd:
            r2 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r5 = "tempFOS.close error:"
            r4.<init>(r5)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            r4.append(r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            java.lang.String r2 = r4.toString()     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
            com.huawei.android.pushagent.utils.a.e.a(r3, r2)     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0415:
            throw r0     // Catch:{ ZipException -> 0x042d, IOException -> 0x042a, IllegalStateException -> 0x0428, NoSuchElementException -> 0x0426 }
        L_0x0416:
            r1.close()     // Catch:{ IOException -> 0x041a }
            return
        L_0x041a:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
            goto L_0x00bb
        L_0x0426:
            r0 = move-exception
            goto L_0x043a
        L_0x0428:
            r0 = move-exception
            goto L_0x0468
        L_0x042a:
            r0 = move-exception
            goto L_0x0496
        L_0x042d:
            r0 = move-exception
            goto L_0x04c4
        L_0x0430:
            r1 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x04ef
        L_0x0436:
            r1 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x043a:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ee }
            java.lang.String r4 = "upZipFile error:"
            r3.<init>(r4)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04ee }
            r3.append(r0)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x04ee }
            com.huawei.android.pushagent.utils.a.e.a(r2, r0)     // Catch:{ all -> 0x04ee }
            if (r1 == 0) goto L_0x0463
            r1.close()     // Catch:{ IOException -> 0x0457 }
            goto L_0x0463
        L_0x0457:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
            goto L_0x00bb
        L_0x0463:
            return
        L_0x0464:
            r1 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x0468:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ee }
            java.lang.String r4 = "upZipFile error:"
            r3.<init>(r4)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04ee }
            r3.append(r0)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x04ee }
            com.huawei.android.pushagent.utils.a.e.a(r2, r0)     // Catch:{ all -> 0x04ee }
            if (r1 == 0) goto L_0x0491
            r1.close()     // Catch:{ IOException -> 0x0485 }
            goto L_0x0491
        L_0x0485:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
            goto L_0x00bb
        L_0x0491:
            return
        L_0x0492:
            r1 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x0496:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ee }
            java.lang.String r4 = "upZipFile error:"
            r3.<init>(r4)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04ee }
            r3.append(r0)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x04ee }
            com.huawei.android.pushagent.utils.a.e.a(r2, r0)     // Catch:{ all -> 0x04ee }
            if (r1 == 0) goto L_0x04bf
            r1.close()     // Catch:{ IOException -> 0x04b3 }
            goto L_0x04bf
        L_0x04b3:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
            goto L_0x00bb
        L_0x04bf:
            return
        L_0x04c0:
            r1 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x04c4:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ee }
            java.lang.String r4 = "upZipFile error:"
            r3.<init>(r4)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04ee }
            r3.append(r0)     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x04ee }
            com.huawei.android.pushagent.utils.a.e.a(r2, r0)     // Catch:{ all -> 0x04ee }
            if (r1 == 0) goto L_0x04ed
            r1.close()     // Catch:{ IOException -> 0x04e1 }
            goto L_0x04ed
        L_0x04e1:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
            goto L_0x00bb
        L_0x04ed:
            return
        L_0x04ee:
            r0 = move-exception
        L_0x04ef:
            if (r1 == 0) goto L_0x050d
            r1.close()     // Catch:{ IOException -> 0x04f5 }
            goto L_0x050d
        L_0x04f5:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "zfile.close error:"
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "PushSelfShowLog"
            com.huawei.android.pushagent.utils.a.e.a(r2, r1)
        L_0x050d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.b.a.a():void");
    }
}
