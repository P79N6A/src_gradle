package com.umeng.commonsdk.utils;

public class FileLockUtil {
    private final Object lockObject = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[SYNTHETIC, Splitter:B:10:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.channels.FileLock getFileLock(java.lang.String r3) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException | IOException -> 0x0011 }
            java.lang.String r2 = "rw"
            r1.<init>(r3, r2)     // Catch:{ FileNotFoundException | IOException -> 0x0011 }
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch:{ FileNotFoundException | IOException -> 0x0011 }
            java.nio.channels.FileLock r1 = r3.lock()     // Catch:{ FileNotFoundException | IOException -> 0x0012 }
            return r1
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x0017
            r3.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.FileLockUtil.getFileLock(java.lang.String):java.nio.channels.FileLock");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|(5:8|9|10|11|12)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0031=Splitter:B:16:0x0031, B:20:0x003a=Splitter:B:20:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFileOperateion(java.io.File r3, com.umeng.commonsdk.utils.FileLockCallback r4) {
        /*
            r2 = this;
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r2.lockObject
            monitor-enter(r0)
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ all -> 0x003c }
            java.nio.channels.FileLock r1 = getFileLock(r1)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0032, all -> 0x0026 }
            r4.onFileLock(r3)     // Catch:{ Exception -> 0x0032, all -> 0x0026 }
            r1.release()     // Catch:{ IOException -> 0x003a }
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch:{ IOException -> 0x003a }
        L_0x0022:
            r3.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x0026:
            r3 = move-exception
            r1.release()     // Catch:{ IOException -> 0x0031 }
            java.nio.channels.FileChannel r4 = r1.channel()     // Catch:{ IOException -> 0x0031 }
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r3     // Catch:{ all -> 0x003c }
        L_0x0032:
            r1.release()     // Catch:{ IOException -> 0x003a }
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch:{ IOException -> 0x003a }
            goto L_0x0022
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.FileLockUtil.doFileOperateion(java.io.File, com.umeng.commonsdk.utils.FileLockCallback):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|(5:8|9|10|11|12)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0032=Splitter:B:16:0x0032, B:20:0x003b=Splitter:B:20:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFileOperateion(java.lang.String r3, com.umeng.commonsdk.utils.FileLockCallback r4) {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.Object r1 = r2.lockObject
            monitor-enter(r1)
            java.nio.channels.FileLock r3 = getFileLock(r3)     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x003b
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0033, all -> 0x0027 }
            r4.onFileLock(r0)     // Catch:{ Exception -> 0x0033, all -> 0x0027 }
            r3.release()     // Catch:{ IOException -> 0x003b }
            java.nio.channels.FileChannel r3 = r3.channel()     // Catch:{ IOException -> 0x003b }
        L_0x0023:
            r3.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003b
        L_0x0027:
            r4 = move-exception
            r3.release()     // Catch:{ IOException -> 0x0032 }
            java.nio.channels.FileChannel r3 = r3.channel()     // Catch:{ IOException -> 0x0032 }
            r3.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r4     // Catch:{ all -> 0x003d }
        L_0x0033:
            r3.release()     // Catch:{ IOException -> 0x003b }
            java.nio.channels.FileChannel r3 = r3.channel()     // Catch:{ IOException -> 0x003b }
            goto L_0x0023
        L_0x003b:
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.FileLockUtil.doFileOperateion(java.lang.String, com.umeng.commonsdk.utils.FileLockCallback):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|(5:8|9|10|11|12)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0036 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0036=Splitter:B:20:0x0036, B:16:0x002d=Splitter:B:16:0x002d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFileOperateion(java.io.File r3, com.umeng.commonsdk.utils.FileLockCallback r4, int r5) {
        /*
            r2 = this;
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r2.lockObject
            monitor-enter(r0)
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ all -> 0x0038 }
            java.nio.channels.FileLock r1 = getFileLock(r1)     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0036
            r4.onFileLock((java.io.File) r3, (int) r5)     // Catch:{ Exception -> 0x002e, all -> 0x0022 }
            r1.release()     // Catch:{ Throwable -> 0x0036 }
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch:{ Throwable -> 0x0036 }
        L_0x001e:
            r3.close()     // Catch:{ Throwable -> 0x0036 }
            goto L_0x0036
        L_0x0022:
            r3 = move-exception
            r1.release()     // Catch:{ Throwable -> 0x002d }
            java.nio.channels.FileChannel r4 = r1.channel()     // Catch:{ Throwable -> 0x002d }
            r4.close()     // Catch:{ Throwable -> 0x002d }
        L_0x002d:
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x002e:
            r1.release()     // Catch:{ Throwable -> 0x0036 }
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch:{ Throwable -> 0x0036 }
            goto L_0x001e
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0038:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.FileLockUtil.doFileOperateion(java.io.File, com.umeng.commonsdk.utils.FileLockCallback, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|(5:8|9|10|11|12)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0031=Splitter:B:16:0x0031, B:20:0x003a=Splitter:B:20:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFileOperateion(java.io.File r3, com.umeng.commonsdk.utils.FileLockCallback r4, java.lang.Object r5) {
        /*
            r2 = this;
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r2.lockObject
            monitor-enter(r0)
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ all -> 0x003c }
            java.nio.channels.FileLock r1 = getFileLock(r1)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0032, all -> 0x0026 }
            r4.onFileLock((java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ Exception -> 0x0032, all -> 0x0026 }
            r1.release()     // Catch:{ IOException -> 0x003a }
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch:{ IOException -> 0x003a }
        L_0x0022:
            r3.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x0026:
            r3 = move-exception
            r1.release()     // Catch:{ IOException -> 0x0031 }
            java.nio.channels.FileChannel r4 = r1.channel()     // Catch:{ IOException -> 0x0031 }
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r3     // Catch:{ all -> 0x003c }
        L_0x0032:
            r1.release()     // Catch:{ IOException -> 0x003a }
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch:{ IOException -> 0x003a }
            goto L_0x0022
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.FileLockUtil.doFileOperateion(java.io.File, com.umeng.commonsdk.utils.FileLockCallback, java.lang.Object):void");
    }
}
