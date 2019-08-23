package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.s;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.internal.d;
import com.umeng.commonsdk.statistics.proto.e;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class ImprintHandler implements FileLockCallback {

    /* renamed from: b  reason: collision with root package name */
    private static Object f80943b = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f80944d = "pbl0".getBytes();

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f80945f = new HashMap();
    private static Object g = new Object();
    private static ImprintHandler j = null;
    private static Context k;
    private static FileLockUtil l;
    private static Map<String, UMImprintPreProcessCallback> o = new HashMap();
    private static Object p = new Object();

    /* renamed from: e  reason: collision with root package name */
    private d f80946e;
    private a h = new a();
    private com.umeng.commonsdk.statistics.proto.d i = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f80947a = new HashMap();

        a() {
        }

        public void a(com.umeng.commonsdk.statistics.proto.d dVar) {
            if (dVar != null) {
                b(dVar);
            }
        }

        a(com.umeng.commonsdk.statistics.proto.d dVar) {
            a(dVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void b(com.umeng.commonsdk.statistics.proto.d r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                if (r5 == 0) goto L_0x0047
                boolean r0 = r5.e()     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                if (r0 != 0) goto L_0x000a
                goto L_0x0047
            L_0x000a:
                java.util.Map r5 = r5.c()     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                java.util.Set r0 = r5.keySet()     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
            L_0x0016:
                boolean r1 = r0.hasNext()     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                if (r1 == 0) goto L_0x0040
                java.lang.Object r1 = r0.next()     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                if (r2 != 0) goto L_0x0016
                java.lang.Object r2 = r5.get(r1)     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                if (r2 == 0) goto L_0x0016
                java.lang.String r2 = r2.b()     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                if (r3 != 0) goto L_0x0016
                java.util.Map<java.lang.String, java.lang.String> r3 = r4.f80947a     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                r3.put(r1, r2)     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
                goto L_0x0016
            L_0x0040:
                monitor-exit(r4)
                return
            L_0x0042:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L_0x0045:
                monitor-exit(r4)
                return
            L_0x0047:
                monitor-exit(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a.b(com.umeng.commonsdk.statistics.proto.d):void");
        }

        public synchronized void a(String str) {
            if (this.f80947a != null && this.f80947a.size() > 0 && !TextUtils.isEmpty(str) && this.f80947a.containsKey(str)) {
                this.f80947a.remove(str);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            return r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized java.lang.String a(java.lang.String r2, java.lang.String r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0024 }
                if (r0 != 0) goto L_0x0022
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f80947a     // Catch:{ all -> 0x0024 }
                int r0 = r0.size()     // Catch:{ all -> 0x0024 }
                if (r0 > 0) goto L_0x0010
                goto L_0x0022
            L_0x0010:
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f80947a     // Catch:{ all -> 0x0024 }
                java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0024 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0024 }
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0024 }
                if (r0 != 0) goto L_0x0020
                monitor-exit(r1)
                return r2
            L_0x0020:
                monitor-exit(r1)
                return r3
            L_0x0022:
                monitor-exit(r1)
                return r3
            L_0x0024:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a.a(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public boolean onFileLock(String str) {
        return false;
    }

    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public a c() {
        return this.h;
    }

    public synchronized com.umeng.commonsdk.statistics.proto.d b() {
        return this.i;
    }

    public byte[] a() {
        try {
            synchronized (this) {
                if (this.i == null) {
                    return null;
                }
                byte[] a2 = new s().a(this.i);
                return a2;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(k, th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(k, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r4 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r4.i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.umeng.commonsdk.utils.FileLockUtil r0 = l
            if (r0 == 0) goto L_0x0032
            java.io.File r0 = new java.io.File
            android.content.Context r1 = k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x002a
            r0.createNewFile()     // Catch:{ IOException -> 0x0020 }
            goto L_0x002a
        L_0x0020:
            r0.createNewFile()     // Catch:{ IOException -> 0x0024 }
            goto L_0x002a
        L_0x0024:
            r1 = move-exception
            android.content.Context r2 = k
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r1)
        L_0x002a:
            com.umeng.commonsdk.utils.FileLockUtil r1 = l
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r2 = j
            r3 = 1
            r1.doFileOperateion((java.io.File) r0, (com.umeng.commonsdk.utils.FileLockCallback) r2, (int) r3)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.d():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|(3:8|9|(4:10|11|12|13))|(2:24|25)|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[SYNTHETIC, Splitter:B:24:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            java.lang.Object r1 = f80943b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            return
        L_0x0018:
            r0 = 0
            android.content.Context r2 = k     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            java.lang.String r3 = ".imprint"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            byte[] r3 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r2)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose((java.io.InputStream) r2)     // Catch:{ all -> 0x0050 }
            r0 = r3
            goto L_0x0038
        L_0x002a:
            r0 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x0030
        L_0x002f:
            r2 = move-exception
        L_0x0030:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose((java.io.InputStream) r0)     // Catch:{ all -> 0x0050 }
            throw r2     // Catch:{ all -> 0x0050 }
        L_0x0034:
            r2 = r0
        L_0x0035:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose((java.io.InputStream) r2)     // Catch:{ all -> 0x0050 }
        L_0x0038:
            if (r0 == 0) goto L_0x004e
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch:{ Exception -> 0x004e }
            r2.<init>()     // Catch:{ Exception -> 0x004e }
            com.umeng.commonsdk.proguard.m r3 = new com.umeng.commonsdk.proguard.m     // Catch:{ Exception -> 0x004e }
            r3.<init>()     // Catch:{ Exception -> 0x004e }
            r3.a((com.umeng.commonsdk.proguard.j) r2, (byte[]) r0)     // Catch:{ Exception -> 0x004e }
            r5.i = r2     // Catch:{ Exception -> 0x004e }
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.h     // Catch:{ Exception -> 0x004e }
            r0.a((com.umeng.commonsdk.statistics.proto.d) r2)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.e():void");
    }

    public void a(d dVar) {
        this.f80946e = dVar;
    }

    private ImprintHandler(Context context) {
        k = context.getApplicationContext();
    }

    private void a(File file) {
        if (this.i != null) {
            try {
                synchronized (f80943b) {
                    byte[] a2 = new s().a(this.i);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(a2);
                        fileOutputStream.flush();
                    } finally {
                        HelperUtils.safeClose((OutputStream) fileOutputStream);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        ImprintHandler imprintHandler;
        synchronized (ImprintHandler.class) {
            if (j == null) {
                j = new ImprintHandler(context);
                l = new FileLockUtil();
                l.doFileOperateion(new File(k.getFilesDir(), ".imprint"), (FileLockCallback) j, 0);
            }
            imprintHandler = j;
        }
        return imprintHandler;
    }

    private boolean c(com.umeng.commonsdk.statistics.proto.d dVar) {
        if (!dVar.i().equals(a(dVar))) {
            return false;
        }
        for (e eVar : dVar.c().values()) {
            byte[] reverseHexString = DataHelper.reverseHexString(eVar.h());
            byte[] a2 = a(eVar);
            int i2 = 0;
            while (true) {
                if (i2 < 4) {
                    if (reverseHexString[i2] != a2[i2]) {
                        return false;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    public String a(com.umeng.commonsdk.statistics.proto.d dVar) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(dVar.c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((e) entry.getValue()).d()) {
                sb.append(((e) entry.getValue()).b());
            }
            sb.append(((e) entry.getValue()).e());
            sb.append(((e) entry.getValue()).h());
        }
        sb.append(dVar.f81034b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    private com.umeng.commonsdk.statistics.proto.d d(com.umeng.commonsdk.statistics.proto.d dVar) {
        boolean z;
        Map c2 = dVar.c();
        ArrayList<String> arrayList = new ArrayList<>(c2.size() / 2);
        Iterator it2 = c2.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!((e) entry.getValue()).d()) {
                    arrayList.add(entry.getKey());
                } else {
                    String str = (String) entry.getKey();
                    String str2 = ((e) entry.getValue()).f81044a;
                    synchronized (p) {
                        if (!TextUtils.isEmpty(str) && o.containsKey(str)) {
                            UMImprintPreProcessCallback uMImprintPreProcessCallback = o.get(str);
                            if (uMImprintPreProcessCallback != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2)) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        arrayList.add(str);
                    }
                    synchronized (g) {
                        if (!TextUtils.isEmpty(str) && f80945f.containsKey(str)) {
                            ArrayList arrayList2 = f80945f.get(str);
                            if (arrayList2 != null) {
                                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                    ((UMImprintChangeCallback) arrayList2.get(i2)).onImprintValueChanged(str, str2);
                                }
                            }
                        }
                    }
                }
            } else {
                for (String str3 : arrayList) {
                    synchronized (g) {
                        if (!TextUtils.isEmpty(str3) && f80945f.containsKey(str3)) {
                            ArrayList arrayList3 = f80945f.get(str3);
                            if (arrayList3 != null) {
                                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                    ((UMImprintChangeCallback) arrayList3.get(i3)).onImprintValueChanged(str3, null);
                                }
                            }
                        }
                    }
                    c2.remove(str3);
                }
                return dVar;
            }
        }
        while (true) {
        }
    }

    public void b(com.umeng.commonsdk.statistics.proto.d dVar) {
        String str;
        com.umeng.commonsdk.statistics.proto.d dVar2;
        boolean z;
        if (dVar == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.d("Imprint is null");
            }
        } else if (!c(dVar)) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e("Imprint is not valid");
            }
        } else {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.d("Imprint is ok");
            }
            HashMap hashMap = new HashMap();
            synchronized (this) {
                com.umeng.commonsdk.statistics.proto.d dVar3 = this.i;
                String str2 = null;
                if (dVar3 == null) {
                    str = null;
                } else {
                    str = dVar3.i();
                }
                if (dVar3 == null) {
                    dVar2 = d(dVar);
                } else {
                    dVar2 = a(dVar3, dVar, hashMap);
                }
                this.i = dVar2;
                if (dVar2 != null) {
                    str2 = dVar2.i();
                }
                z = !a(str, str2);
            }
            if (this.i != null && z) {
                this.h.a(this.i);
                if (this.f80946e != null) {
                    this.f80946e.onImprintChanged(this.h);
                }
            }
            if (hashMap.size() > 0) {
                synchronized (g) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (!TextUtils.isEmpty(str3) && f80945f.containsKey(str3)) {
                            ULog.i("--->>> target imprint key is: " + str3 + "; value is: " + str4);
                            ArrayList arrayList = f80945f.get(str3);
                            if (arrayList != null) {
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    ((UMImprintChangeCallback) arrayList.get(i2)).onImprintValueChanged(str3, str4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (p) {
                try {
                    if (o.containsKey(str)) {
                        UMRTLog.i("MobclickRT", "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                        f80945f.remove(str);
                    } else {
                        UMRTLog.i("MobclickRT", "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(k, th);
                }
            }
        }
    }

    public byte[] a(e eVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(eVar.e());
        byte[] array = allocate.array();
        byte[] bArr = f80944d;
        byte[] bArr2 = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i2] = (byte) (array[i2] ^ bArr[i2]);
        }
        return bArr2;
    }

    private boolean a(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            a(str, uMImprintChangeCallback);
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            b(str, uMImprintChangeCallback);
        }
    }

    public boolean onFileLock(File file, int i2) {
        if (i2 == 0) {
            j.e();
        } else if (i2 == 1) {
            j.a(file);
        }
        return true;
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintPreProcessCallback != null) {
            synchronized (p) {
                try {
                    if (!o.containsKey(str)) {
                        o.put(str, uMImprintPreProcessCallback);
                        UMRTLog.i("MobclickRT", "--->>> registPreProcessCallback: key : " + str + " regist success.");
                    } else {
                        UMRTLog.i("MobclickRT", "--->>> key : " + str + " PreProcesser has registed!");
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(k, th);
                }
            }
        }
    }

    private static void b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            synchronized (g) {
                try {
                    if (f80945f.containsKey(str)) {
                        ArrayList arrayList = f80945f.get(str);
                        if (uMImprintChangeCallback != null && arrayList.size() > 0) {
                            int size = arrayList.size();
                            ULog.i("--->>> removeCallback: before remove: callbacks size is: " + size);
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                } else if (uMImprintChangeCallback == arrayList.get(i2)) {
                                    ULog.i("--->>> removeCallback: remove index " + i2);
                                    arrayList.remove(i2);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            ULog.i("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                            if (arrayList.size() == 0) {
                                ULog.i("--->>> removeCallback: remove key from map: key = " + str);
                                f80945f.remove(str);
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(k, th);
                }
            }
        }
    }

    private static void a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (g) {
            try {
                int i2 = 0;
                if (f80945f.containsKey(str)) {
                    ArrayList arrayList = f80945f.get(str);
                    int size = arrayList.size();
                    ULog.i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i2 < size) {
                        if (uMImprintChangeCallback == arrayList.get(i2)) {
                            ULog.i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i2++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList2.size();
                    ULog.i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i2 < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i2)) {
                            ULog.i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i2++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f80945f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(k, th);
            }
        }
    }

    private com.umeng.commonsdk.statistics.proto.d a(com.umeng.commonsdk.statistics.proto.d dVar, com.umeng.commonsdk.statistics.proto.d dVar2, Map<String, String> map) {
        if (dVar2 == null) {
            return dVar;
        }
        Map c2 = dVar.c();
        for (Map.Entry entry : dVar2.c().entrySet()) {
            int i2 = 0;
            if (((e) entry.getValue()).d()) {
                String str = (String) entry.getKey();
                String str2 = ((e) entry.getValue()).f81044a;
                synchronized (p) {
                    if (!TextUtils.isEmpty(str) && o.containsKey(str)) {
                        UMImprintPreProcessCallback uMImprintPreProcessCallback = o.get(str);
                        if (uMImprintPreProcessCallback != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2)) {
                            i2 = 1;
                        }
                    }
                }
                if (i2 == 0) {
                    c2.put(entry.getKey(), entry.getValue());
                    synchronized (g) {
                        if (!TextUtils.isEmpty(str) && f80945f.containsKey(str) && f80945f.get(str) != null) {
                            map.put(str, str2);
                        }
                    }
                } else {
                    UMRTLog.i("MobclickRT", "--->>> merge: [" + str + "] should be ignored.");
                }
            } else {
                String str3 = (String) entry.getKey();
                synchronized (g) {
                    if (!TextUtils.isEmpty(str3) && f80945f.containsKey(str3)) {
                        ArrayList arrayList = f80945f.get(str3);
                        if (arrayList != null) {
                            while (i2 < arrayList.size()) {
                                ((UMImprintChangeCallback) arrayList.get(i2)).onImprintValueChanged(str3, null);
                                i2++;
                            }
                        }
                    }
                }
                c2.remove(str3);
                this.h.a(str3);
            }
        }
        dVar.a(dVar2.f());
        dVar.a(a(dVar));
        return dVar;
    }
}
