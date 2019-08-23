package com.bytedance.common.wschannel;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.utils.Utils;
import com.ss.android.ugc.aweme.q.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsChannelMultiProcessSharedProvider extends ContentProvider {
    public static Uri sBaseUri;
    private static MultiProcessShared sInstance;
    public static boolean sIsRegisterInMainProcess;
    private static UriMatcher sMatcher;
    public static String sShareAuthority;
    private Map<String, Object> mContentValues = new ConcurrentHashMap();
    private SharedPreferences mSharedPreferences;

    public static class Editor {
        Context mContext;
        private ContentValues mValues;

        public synchronized void commit() {
            apply();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void apply() {
            /*
                r4 = this;
                monitor-enter(r4)
                android.content.Context r0 = r4.mContext     // Catch:{ Throwable -> 0x001b, all -> 0x0018 }
                android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Throwable -> 0x001b, all -> 0x0018 }
                android.content.Context r1 = r4.mContext     // Catch:{ Throwable -> 0x001b, all -> 0x0018 }
                java.lang.String r2 = "key"
                java.lang.String r3 = "type"
                android.net.Uri r1 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getContentUri(r1, r2, r3)     // Catch:{ Throwable -> 0x001b, all -> 0x0018 }
                android.content.ContentValues r2 = r4.mValues     // Catch:{ Throwable -> 0x001b, all -> 0x0018 }
                r0.insert(r1, r2)     // Catch:{ Throwable -> 0x001b, all -> 0x0018 }
                monitor-exit(r4)
                return
            L_0x0018:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x001b:
                monitor-exit(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.Editor.apply():void");
        }

        public void clear() {
            try {
                this.mContext.getContentResolver().delete(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, "key", "type"), null, null);
            } catch (Throwable unused) {
            }
        }

        public void remove(String str) {
            this.mValues.putNull(str);
        }

        private Editor(Context context) {
            this.mValues = new ContentValues();
            this.mContext = context.getApplicationContext();
        }

        public Editor putString(String str, String str2) {
            this.mValues.put(str, str2);
            return this;
        }

        public Editor putBoolean(String str, boolean z) {
            this.mValues.put(str, Boolean.valueOf(z));
            return this;
        }

        public Editor putFloat(String str, float f2) {
            this.mValues.put(str, Float.valueOf(f2));
            return this;
        }

        public Editor putInt(String str, int i) {
            this.mValues.put(str, Integer.valueOf(i));
            return this;
        }

        public Editor putLong(String str, long j) {
            this.mValues.put(str, Long.valueOf(j));
            return this;
        }
    }

    public static class MultiProcessShared {
        private Context mContext;
        private boolean mIsMainProcess;
        private SharedPreferences mSharedPreferences;

        public Editor edit() {
            return new Editor(this.mContext);
        }

        private MultiProcessShared(Context context) {
            boolean z;
            if (!Utils.isMainProcess(context) || !WsChannelMultiProcessSharedProvider.sIsRegisterInMainProcess) {
                z = false;
            } else {
                z = true;
            }
            this.mIsMainProcess = z;
            this.mContext = context.getApplicationContext();
            this.mSharedPreferences = c.a(this.mContext.getApplicationContext(), "wschannel_multi_process_config", 4);
            Logger.debug();
        }

        public boolean getBoolean(String str, boolean z) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getBoolean(str, z);
                }
                return WsChannelMultiProcessSharedProvider.getBooleanValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "boolean"), null, null, null, null), z);
            } catch (Throwable unused) {
                return z;
            }
        }

        public float getFloat(String str, float f2) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getFloat(str, f2);
                }
                return WsChannelMultiProcessSharedProvider.getFloatValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "float"), null, null, null, null), f2);
            } catch (Throwable unused) {
                return f2;
            }
        }

        public int getInt(String str, int i) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getInt(str, i);
                }
                return WsChannelMultiProcessSharedProvider.getIntValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "integer"), null, null, null, null), i);
            } catch (Throwable unused) {
                return i;
            }
        }

        public long getLong(String str, long j) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getLong(str, j);
                }
                return WsChannelMultiProcessSharedProvider.getLongValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "long"), null, null, null, null), j);
            } catch (Throwable unused) {
                return j;
            }
        }

        public String getString(String str, String str2) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getString(str, str2);
                }
                return WsChannelMultiProcessSharedProvider.getStringValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }
    }

    private synchronized SharedPreferences getMultiProcessSharedPreferences() {
        int i;
        if (this.mSharedPreferences == null) {
            int i2 = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (i2 >= 11) {
                i = 4;
            } else {
                i = 0;
            }
            this.mSharedPreferences = c.a(applicationContext, "wschannel_multi_process_config", i);
            return this.mSharedPreferences;
        }
        return this.mSharedPreferences;
    }

    private void loadValues() {
        SharedPreferences multiProcessSharedPreferences = getMultiProcessSharedPreferences();
        if (multiProcessSharedPreferences != null) {
            for (Map.Entry next : multiProcessSharedPreferences.getAll().entrySet()) {
                Object value = next.getValue();
                this.mContentValues.put((String) next.getKey(), value);
            }
        }
    }

    public boolean onCreate() {
        if (Utils.isMainProcess(getContext())) {
            sIsRegisterInMainProcess = true;
        }
        if (sMatcher == null) {
            try {
                Logger.debug();
                init(getContext());
                loadValues();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static Editor edit(Context context) {
        return new Editor(context);
    }

    private void notifyContentChanged(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    public static synchronized MultiProcessShared getMultiprocessShared(Context context) {
        MultiProcessShared multiProcessShared;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (sInstance == null) {
                sInstance = new MultiProcessShared(context);
            }
            multiProcessShared = sInstance;
        }
        return multiProcessShared;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + sShareAuthority + ".item";
    }

    private static void init(Context context) throws IllegalStateException {
        String providerAuthority = getProviderAuthority(context, WsChannelMultiProcessSharedProvider.class.getName());
        sShareAuthority = providerAuthority;
        if (!TextUtils.isEmpty(providerAuthority)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            sMatcher = uriMatcher;
            uriMatcher.addURI(sShareAuthority, "*/*", 65536);
            sBaseUri = Uri.parse("content://" + sShareAuthority);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float getFloatValue(android.database.Cursor r1, float r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            float r0 = r1.getFloat(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r2 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x001f
        L_0x0011:
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getFloatValue(android.database.Cursor, float):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getIntValue(android.database.Cursor r1, int r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r2 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x001f
        L_0x0011:
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getIntValue(android.database.Cursor, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r2 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r2 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getLongValue(android.database.Cursor r2, long r3) {
        /*
            if (r2 != 0) goto L_0x0003
            return r3
        L_0x0003:
            boolean r0 = r2.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r3 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x001f
        L_0x0011:
            r2.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r3 = move-exception
            if (r2 == 0) goto L_0x001b
            r2.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r3
        L_0x001c:
            if (r2 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getLongValue(android.database.Cursor, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStringValue(android.database.Cursor r1, java.lang.String r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r2 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x001f
        L_0x0011:
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getStringValue(android.database.Cursor, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        if (r2 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getBooleanValue(android.database.Cursor r2, boolean r3) {
        /*
            if (r2 != 0) goto L_0x0003
            return r3
        L_0x0003:
            boolean r0 = r2.moveToFirst()     // Catch:{ Throwable -> 0x0020, all -> 0x0019 }
            if (r0 == 0) goto L_0x0013
            r0 = 0
            int r1 = r2.getInt(r0)     // Catch:{ Throwable -> 0x0020, all -> 0x0019 }
            if (r1 <= 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0023
        L_0x0015:
            r2.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0023
        L_0x0019:
            r3 = move-exception
            if (r2 == 0) goto L_0x001f
            r2.close()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            throw r3
        L_0x0020:
            if (r2 == 0) goto L_0x0023
            goto L_0x0015
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getBooleanValue(android.database.Cursor, boolean):boolean");
    }

    public static String getProviderAuthority(Context context, String str) {
        if (context == null || StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                if (str.equals(providerInfo.name)) {
                    return providerInfo.authority;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        if (sMatcher.match(uri) == 65536) {
            try {
                SharedPreferences.Editor editor = null;
                for (Map.Entry next : contentValues.valueSet()) {
                    Object value = next.getValue();
                    String str2 = (String) next.getKey();
                    Logger.debug();
                    boolean z = true;
                    if (value == null) {
                        this.mContentValues.remove(str2);
                    } else {
                        Object obj = this.mContentValues.get(str2);
                        if (obj != null) {
                            if (obj.equals(value)) {
                                z = false;
                            }
                        }
                        this.mContentValues.put(str2, value);
                    }
                    if (z) {
                        if (Logger.debug()) {
                            if (("MultiProcessShareProvider reallly insert key = " + str2 + " value = " + value) != null) {
                                str = value.toString();
                            } else {
                                str = "null";
                            }
                            Logger.v("PushService", str);
                        }
                        if (editor == null) {
                            editor = getMultiProcessSharedPreferences().edit();
                        }
                        if (value == null) {
                            editor.remove(str2);
                        } else if (value instanceof String) {
                            editor.putString(str2, (String) value);
                            notifyContentChanged(getContentUri(getContext(), str2, "string"));
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(str2, ((Boolean) value).booleanValue());
                            notifyContentChanged(getContentUri(getContext(), str2, "boolean"));
                        } else if (value instanceof Long) {
                            editor.putLong(str2, ((Long) value).longValue());
                            notifyContentChanged(getContentUri(getContext(), str2, "long"));
                        } else if (value instanceof Integer) {
                            editor.putInt(str2, ((Integer) value).intValue());
                            notifyContentChanged(getContentUri(getContext(), str2, "integer"));
                        } else if (value instanceof Float) {
                            editor.putFloat(str2, ((Float) value).floatValue());
                            notifyContentChanged(getContentUri(getContext(), str2, "float"));
                        } else {
                            throw new IllegalArgumentException("Unsupported type " + uri);
                        }
                    }
                }
                if (editor == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT > 8) {
                    editor.apply();
                } else {
                    editor.commit();
                }
                return null;
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri);
        }
    }

    public static final synchronized Uri getContentUri(Context context, String str, String str2) {
        Uri build;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (sBaseUri == null) {
                try {
                    Logger.debug();
                    init(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            build = sBaseUri.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (sMatcher.match(uri) == 65536) {
            try {
                getMultiProcessSharedPreferences().edit().clear().commit();
                this.mContentValues.clear();
                notifyContentChanged(getContentUri(getContext(), "key", "type"));
            } catch (Exception unused) {
            }
            return 0;
        }
        throw new IllegalArgumentException("Unsupported uri " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        if (sMatcher.match(uri) == 65536) {
            try {
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = getMultiProcessSharedPreferences().getAll();
                    matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Map.Entry next : all.entrySet()) {
                            String str3 = (String) next.getKey();
                            Object value = next.getValue();
                            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                            String str4 = "string";
                            if (value instanceof String) {
                                str4 = "string";
                            } else if (value instanceof Boolean) {
                                str4 = "boolean";
                                value = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
                            } else if (value instanceof Integer) {
                                str4 = "integer";
                            } else if (value instanceof Long) {
                                str4 = "long";
                            } else if (value instanceof Float) {
                                str4 = "float";
                            }
                            newRow.add(str3);
                            newRow.add(value);
                            newRow.add(str4);
                        }
                    } catch (Exception unused) {
                    }
                    return matrixCursor;
                }
                String str5 = uri.getPathSegments().get(0);
                if (!this.mContentValues.containsKey(str5)) {
                    return null;
                }
                matrixCursor = new MatrixCursor(new String[]{str5});
                Object obj = this.mContentValues.get(str5);
                MatrixCursor.RowBuilder newRow2 = matrixCursor.newRow();
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                Logger.debug();
                newRow2.add(obj);
                return matrixCursor;
            } catch (Exception unused2) {
                matrixCursor = null;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri);
        }
    }
}
