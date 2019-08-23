package com.ss.ttm.player;

import android.content.Context;
import android.os.Environment;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class TTPlayerConfiger {
    private static String APP_PATH = null;
    private static String CRASH_FILE_NAME = "ttplayer_crash.log";
    private static String CRASH_FILE_PATH = null;
    private static boolean IS_PRINT_INFO = false;
    private static final SparseArray<Value> KEYS = new SparseArray<>();
    private static String LIBRARY_DIR = null;
    private static String PLAYER_LIBRARY_NAME = "libttmplayer.so";
    private static String TTPLAYER_FILE_CACHE_DIR = null;
    private static final String VERSION_NAME = "999.999.999.9";
    public static ChangeQuickRedirect changeQuickRedirect;

    static final class IntValue extends Value {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        public final void setValue(int i) {
            this.mValue = i;
        }

        public IntValue(int i, int i2) {
            super(i);
            this.mValue = i2;
        }
    }

    static class LongValue extends Value {
        public static ChangeQuickRedirect changeQuickRedirect;
        private long mValue;

        public long getValue() {
            return this.mValue;
        }

        public void setValue(long j) {
            this.mValue = j;
        }

        public LongValue(int i, long j) {
            super(i);
            this.mValue = j;
        }
    }

    static class StringValue extends Value {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String mValue;

        public String getValue() {
            return this.mValue;
        }

        public void setValue(String str) {
            this.mValue = str;
        }

        public StringValue(int i, String str) {
            super(i);
            this.mValue = str;
        }
    }

    static class Value {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mKey = -1;

        public int getKey() {
            return this.mKey;
        }

        public Value(int i) {
            this.mKey = i;
        }
    }

    public static final int getVersion() {
        return 1;
    }

    public static boolean isPrintInfo() {
        return IS_PRINT_INFO;
    }

    public static String getPlayerLibraryPath() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90962, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90962, new Class[0], String.class);
        }
        return getPlayerLibraryPath(null);
    }

    static {
        setValue(13, 1);
        setValue(14, VERSION_NAME);
        setValue(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        setValue(0, false);
        setValue(1, true);
        setValue(2, true);
        setValue(3, false);
        setValue(4, false);
        setValue(5, false);
        setValue(6, false);
        setValue(7, false);
        setValue(8, false);
        setValue(10, 0);
        setValue(11, false);
        setValue(18, 2);
        checkPlayerModel();
    }

    public static void checkDebugTTPlayerLib() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90959, new Class[0], Void.TYPE);
            return;
        }
        String str = APP_PATH + File.separatorChar + PLAYER_LIBRARY_NAME;
        isPrintInfo();
        File file = new File(Environment.getExternalStorageDirectory() + "/ttplayer/" + PLAYER_LIBRARY_NAME);
        if (file.exists()) {
            moveFile(str, file.getPath(), true);
        }
    }

    public static final String getExternalStorageDirectoryCrashFilePath() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90956, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90956, new Class[0], String.class);
        }
        return Environment.getExternalStorageDirectory() + File.separatorChar + CRASH_FILE_NAME;
    }

    public static final boolean isOnTTPlayer() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90952, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90952, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getValue(6, 0) == 1) {
            return true;
        }
        if (getValue(1, 0) == 0) {
            return false;
        }
        if (getValue(11, 0) == 1) {
            return true;
        }
        if (getValue(7, 0) == 1 || getValue(8, 0) == 1 || getValue(10, 0) >= 3) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.FileReader} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.FileReader, java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x00f9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d8 A[PHI: r4 
      PHI: (r4v5 java.io.FileReader) = (r4v1 java.io.FileReader), (r4v1 java.io.FileReader), (r4v9 java.io.FileReader), (r4v9 java.io.FileReader) binds: [B:84:0x00f9, B:85:?, B:55:0x00d5, B:56:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:57:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void checkPlayerModel() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = 0
            r4 = 1
            r5 = 90958(0x1634e, float:1.2746E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 90958(0x1634e, float:1.2746E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            int r1 = getValue((int) r0, (int) r0)
            if (r1 != 0) goto L_0x0102
            r1 = 1
            setValue((int) r0, (int) r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            r4.<init>()     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            char r5 = java.io.File.separatorChar     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            java.lang.String r5 = "ttplayer.debug"
            r4.append(r5)     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            if (r4 != 0) goto L_0x006b
            r2.close()     // Catch:{ Exception -> 0x0066, all -> 0x0061 }
            r2.close()     // Catch:{ Exception -> 0x0060 }
            return
        L_0x0060:
            return
        L_0x0061:
            r0 = move-exception
            r2.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            throw r0
        L_0x0066:
            r2.close()     // Catch:{ Exception -> 0x006a }
            return
        L_0x006a:
            return
        L_0x006b:
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x00f8, all -> 0x00e8 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00f9, all -> 0x00e5 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00f9, all -> 0x00e5 }
            r2 = 0
        L_0x0076:
            java.lang.String r5 = r3.readLine()     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            if (r5 == 0) goto L_0x00d1
            java.lang.String r6 = "\r\n"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replace(r6, r7)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            java.lang.String r6 = ":on"
            boolean r6 = r5.contains(r6)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            if (r6 == 0) goto L_0x008e
            r6 = 1
            goto L_0x0095
        L_0x008e:
            java.lang.String r6 = ":off"
            boolean r6 = r5.contains(r6)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            r6 = 0
        L_0x0095:
            java.lang.String r7 = "debug_player:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            if (r7 == 0) goto L_0x009f
            r2 = r6
            goto L_0x0076
        L_0x009f:
            java.lang.String r7 = "ipc_player:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            if (r7 == 0) goto L_0x00ac
            r5 = 2
            setValue((int) r5, (boolean) r6)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            goto L_0x0076
        L_0x00ac:
            java.lang.String r7 = "print_info:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            if (r7 == 0) goto L_0x00b7
            IS_PRINT_INFO = r6     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            goto L_0x0076
        L_0x00b7:
            java.lang.String r7 = "check_lib:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            if (r7 == 0) goto L_0x00c4
            r5 = 3
            setValue((int) r5, (boolean) r6)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            goto L_0x0076
        L_0x00c4:
            java.lang.String r7 = "throw_crash:"
            boolean r5 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            if (r5 == 0) goto L_0x0076
            r5 = 4
            setValue((int) r5, (boolean) r6)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            goto L_0x0076
        L_0x00d1:
            r0 = 6
            setValue((int) r0, (boolean) r2)     // Catch:{ Throwable -> 0x00e3, all -> 0x00e1 }
            r3.close()     // Catch:{ Exception -> 0x00d8, all -> 0x00dc }
        L_0x00d8:
            r4.close()     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x00dc:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x00e0 }
        L_0x00e0:
            throw r0
        L_0x00e1:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e3:
            r2 = r3
            goto L_0x00f9
        L_0x00e5:
            r0 = move-exception
            r3 = r2
            goto L_0x00eb
        L_0x00e8:
            r0 = move-exception
            r3 = r2
            r4 = r3
        L_0x00eb:
            r3.close()     // Catch:{ Exception -> 0x00ee, all -> 0x00f2 }
        L_0x00ee:
            r4.close()     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00f7
        L_0x00f2:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x00f6 }
        L_0x00f6:
            throw r0
        L_0x00f7:
            throw r0
        L_0x00f8:
            r4 = r2
        L_0x00f9:
            r2.close()     // Catch:{ Exception -> 0x00d8, all -> 0x00fd }
            goto L_0x00d8
        L_0x00fd:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x0101 }
        L_0x0101:
            throw r0
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerConfiger.checkPlayerModel():void");
    }

    public static final void setCrashFileName(String str) {
        CRASH_FILE_NAME = str;
    }

    public static final void setCrashFilePath(String str) {
        CRASH_FILE_PATH = str;
    }

    public static final void setLibraryName(String str) {
        PLAYER_LIBRARY_NAME = str;
    }

    public static final void setLibrarysDir(String str) {
        LIBRARY_DIR = str;
    }

    @Deprecated
    public static final String getAppCrashFilePath(Context context) {
        if (CRASH_FILE_PATH != null || new File(getAppCrashFileStorePath(context)).exists()) {
            isPrintInfo();
            return CRASH_FILE_PATH;
        }
        return APP_PATH + File.separatorChar + "plugins" + File.separatorChar + "com.ss.ttm" + File.separatorChar + "data" + File.separatorChar + "files" + File.separatorChar + CRASH_FILE_NAME;
    }

    public static final String getAppCrashFilePath2(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90954, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90954, new Class[]{Context.class}, String.class);
        }
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (CRASH_FILE_PATH == null) {
            if (APP_PATH == null) {
                APP_PATH = getAppFilesPath(context);
            }
            isPrintInfo();
            if (APP_PATH == null) {
                return null;
            }
            return APP_PATH + File.separatorChar + CRASH_FILE_NAME;
        }
        isPrintInfo();
        return CRASH_FILE_PATH;
    }

    @Deprecated
    public static final String getAppCrashFileStorePath(Context context) {
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (CRASH_FILE_PATH == null) {
            if (APP_PATH == null) {
                APP_PATH = getAppFilesPath(context);
            }
            isPrintInfo();
            if (APP_PATH == null) {
                return null;
            }
            return APP_PATH + File.separatorChar + CRASH_FILE_NAME;
        }
        isPrintInfo();
        return CRASH_FILE_PATH;
    }

    public static final String getAppFileCachePath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90957, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90957, new Class[]{Context.class}, String.class);
        }
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (TTPLAYER_FILE_CACHE_DIR != null) {
            return TTPLAYER_FILE_CACHE_DIR;
        }
        if (APP_PATH != null) {
            return APP_PATH;
        }
        if (context == null) {
            return null;
        }
        try {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
            return APP_PATH;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String getAppFilesPath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90953, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90953, new Class[]{Context.class}, String.class);
        } else if (APP_PATH != null) {
            return APP_PATH;
        } else {
            if (context == null) {
                return null;
            }
            try {
                APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
                return APP_PATH;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static String getPlayerLibrarysDir(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90960, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90960, new Class[]{Context.class}, String.class);
        } else if (LIBRARY_DIR == null) {
            String str = getAppFilesPath(context) + File.separatorChar;
            LIBRARY_DIR = str;
            return str;
        } else if (LIBRARY_DIR.endsWith(String.valueOf(File.separatorChar))) {
            return LIBRARY_DIR;
        } else {
            return LIBRARY_DIR + File.separatorChar;
        }
    }

    public static final String getPlugerCrashFilePath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90955, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90955, new Class[]{Context.class}, String.class);
        }
        return APP_PATH + File.separatorChar + "plugins" + File.separatorChar + "com.ss.ttm" + File.separatorChar + "data" + File.separatorChar + "files" + File.separatorChar + CRASH_FILE_NAME;
    }

    public static String getPlayerLibraryPath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90961, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90961, new Class[]{Context.class}, String.class);
        }
        if (APP_PATH == null || context != null) {
            APP_PATH = getAppFilesPath(context);
        }
        if (APP_PATH == null && LIBRARY_DIR == null) {
            return null;
        }
        if (LIBRARY_DIR == null) {
            return APP_PATH + File.separatorChar + PLAYER_LIBRARY_NAME;
        } else if (LIBRARY_DIR.endsWith(String.valueOf(File.separatorChar))) {
            return LIBRARY_DIR + PLAYER_LIBRARY_NAME;
        } else {
            return LIBRARY_DIR + File.separatorChar + PLAYER_LIBRARY_NAME;
        }
    }

    public static final int getValue(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90946, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90946, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Value value = KEYS.get(i);
        if (value == null || !(value instanceof IntValue)) {
            return i2;
        }
        return ((IntValue) value).getValue();
    }

    public static final void setValue(int i, long j) {
        int i2 = i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, changeQuickRedirect, true, 90950, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, changeQuickRedirect, true, 90950, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        Value value = KEYS.get(i2);
        if (value != null) {
            if (value instanceof LongValue) {
                ((LongValue) value).setValue(j2);
                return;
            }
            KEYS.remove(i2);
        }
        KEYS.append(i2, new LongValue(i2, j2));
    }

    public static final long getValue(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, changeQuickRedirect, true, 90947, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, changeQuickRedirect, true, 90947, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        }
        Value value = KEYS.get(i);
        if (value == null || !(value instanceof LongValue)) {
            return j2;
        }
        return ((LongValue) value).getValue();
    }

    public static final void setValue(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90949, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90949, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Value value = KEYS.get(i3);
        if (value != null) {
            if (!(value instanceof IntValue)) {
                KEYS.remove(i3);
            } else if (i3 != 2 || !getValue(6, false)) {
                ((IntValue) value).setValue(i4);
                return;
            } else {
                return;
            }
        }
        KEYS.append(i3, new IntValue(i3, i4));
    }

    public static final String getValue(int i, String str) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, null, changeQuickRedirect, true, 90944, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, null, changeQuickRedirect, true, 90944, new Class[]{Integer.TYPE, String.class}, String.class);
        } else if (i2 == 17) {
            return CRASH_FILE_NAME;
        } else {
            Value value = KEYS.get(i2);
            if (value == null || !(value instanceof StringValue)) {
                return str;
            }
            return ((StringValue) value).getValue();
        }
    }

    public static final void setValue(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 90951, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 90951, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Value value = KEYS.get(i2);
        if (value != null) {
            if (value instanceof StringValue) {
                ((StringValue) value).setValue(str2);
                return;
            }
            KEYS.remove(i2);
        }
        KEYS.append(i2, new StringValue(i2, str2));
    }

    public static final boolean getValue(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 90945, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, null, changeQuickRedirect, true, 90945, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Value value = KEYS.get(i);
        if (value == null || !(value instanceof IntValue)) {
            return z;
        }
        if (((IntValue) value).getValue() == 1) {
            return true;
        }
        return false;
    }

    public static final void setValue(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 90948, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, null, changeQuickRedirect, true, 90948, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        setValue(i, z ? 1 : 0);
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 90964, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return copyFile(str3, str4, z, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, null, changeQuickRedirect, true, 90964, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef A[SYNTHETIC, Splitter:B:47:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4 A[Catch:{ IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb A[SYNTHETIC, Splitter:B:57:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0100 A[Catch:{ IOException -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0107 A[SYNTHETIC, Splitter:B:67:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010c A[Catch:{ IOException -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r23)
            r12 = 2
            r3[r12] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r24)
            r13 = 3
            r3[r13] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r13] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 90963(0x16353, float:1.27466E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0077
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r10] = r0
            r14[r11] = r1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r23)
            r14[r12] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 1
            r18 = 90963(0x16353, float:1.27466E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0077:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x0083
            return r10
        L_0x0083:
            boolean r1 = r2.isFile()
            if (r1 != 0) goto L_0x008a
            return r10
        L_0x008a:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x00a0
            if (r23 == 0) goto L_0x00b5
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            r3.delete()
            goto L_0x00b5
        L_0x00a0:
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x00b5
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.mkdirs()
            if (r0 != 0) goto L_0x00b5
            return r10
        L_0x00b5:
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0104, IOException -> 0x00f8, all -> 0x00ea }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0104, IOException -> 0x00f8, all -> 0x00ea }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00f9, all -> 0x00e7 }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00f9, all -> 0x00e7 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
        L_0x00c4:
            int r1 = r4.read(r0)     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            r3 = -1
            if (r1 == r3) goto L_0x00cf
            r5.write(r0, r10, r1)     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            goto L_0x00c4
        L_0x00cf:
            r5.close()     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            if (r24 == 0) goto L_0x00da
            r2.delete()     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
        L_0x00da:
            r5.close()     // Catch:{ IOException -> 0x00e0 }
            r4.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00e0:
            return r11
        L_0x00e1:
            r0 = move-exception
            goto L_0x00ed
        L_0x00e3:
            r3 = r5
            goto L_0x00f9
        L_0x00e5:
            r3 = r5
            goto L_0x0105
        L_0x00e7:
            r0 = move-exception
            r5 = r3
            goto L_0x00ed
        L_0x00ea:
            r0 = move-exception
            r4 = r3
            r5 = r4
        L_0x00ed:
            if (r5 == 0) goto L_0x00f2
            r5.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00f2:
            if (r4 == 0) goto L_0x00f7
            r4.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00f7:
            throw r0
        L_0x00f8:
            r4 = r3
        L_0x00f9:
            if (r3 == 0) goto L_0x00fe
            r3.close()     // Catch:{ IOException -> 0x0103 }
        L_0x00fe:
            if (r4 == 0) goto L_0x0103
            r4.close()     // Catch:{ IOException -> 0x0103 }
        L_0x0103:
            return r10
        L_0x0104:
            r4 = r3
        L_0x0105:
            if (r3 == 0) goto L_0x010a
            r3.close()     // Catch:{ IOException -> 0x010f }
        L_0x010a:
            if (r4 == 0) goto L_0x010f
            r4.close()     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerConfiger.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
