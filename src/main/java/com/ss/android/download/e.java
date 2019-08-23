package com.ss.android.download;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.b.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f28531a = {"_id", "_data AS local_filename", "mediaprovider_uri", "destination", PushConstants.TITLE, "description", "uri", "status", "hint", "mimetype AS media_type", "total_bytes AS total_size", "lastmod AS last_modified_timestamp", "current_bytes AS bytes_so_far", "allow_write", "etag", "'placeholder' AS local_uri", "'placeholder' AS reason"};
    private static e g;

    /* renamed from: b  reason: collision with root package name */
    private Context f28532b;

    /* renamed from: c  reason: collision with root package name */
    private ContentResolver f28533c;

    /* renamed from: d  reason: collision with root package name */
    private h f28534d;

    /* renamed from: e  reason: collision with root package name */
    private String f28535e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f28536f = c.a.f28513a;

    static class a extends CursorWrapper {

        /* renamed from: a  reason: collision with root package name */
        private Uri f28537a;

        public final int getInt(int i) {
            return (int) getLong(i);
        }

        public final String getString(int i) {
            String str;
            if (getColumnName(i).equals("local_uri")) {
                long j = getLong(getColumnIndex("destination"));
                if (j == 1 || j == 0) {
                    String string = getString(getColumnIndex("local_filename"));
                    if (string == null) {
                        str = null;
                    } else {
                        str = Uri.fromFile(new File(string)).toString();
                    }
                } else {
                    return ContentUris.withAppendedId(this.f28537a, getLong(getColumnIndex("_id"))).toString();
                }
            } else {
                str = super.getString(i);
            }
            return str;
        }

        public final long getLong(int i) {
            long j;
            if (getColumnName(i).equals("reason")) {
                int i2 = super.getInt(getColumnIndex("status"));
                int a2 = e.a(i2);
                if (a2 == 4) {
                    switch (i2) {
                        case 194:
                            j = 1;
                            break;
                        case 195:
                            j = 2;
                            break;
                        case 196:
                            j = 3;
                            break;
                        default:
                            return 4;
                    }
                } else if (a2 != 16) {
                    j = 0;
                } else if ((400 > i2 || i2 >= 488) && (500 > i2 || i2 >= 600)) {
                    switch (i2) {
                        case 198:
                            j = 1006;
                            break;
                        case 199:
                            j = 1007;
                            break;
                        case 488:
                            j = 1009;
                            break;
                        case 489:
                            j = 1008;
                            break;
                        case 492:
                            j = 1001;
                            break;
                        case 493:
                        case 494:
                            j = 1002;
                            break;
                        case 495:
                            j = 1004;
                            break;
                        case 497:
                            j = 1005;
                            break;
                        default:
                            return 1000;
                    }
                } else {
                    j = (long) i2;
                }
                return j;
            } else if (getColumnName(i).equals("status")) {
                return (long) e.a(super.getInt(getColumnIndex("status")));
            } else {
                return super.getLong(i);
            }
        }

        public a(Cursor cursor, Uri uri) {
            super(cursor);
            this.f28537a = uri;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public long f28538a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f28539b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f28540c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f28541d = -1;

        /* renamed from: e  reason: collision with root package name */
        public String f28542e;

        public b() {
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (!(obj instanceof b) || obj == null) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            if (this.f28538a == bVar.f28538a) {
                z = true;
            } else {
                z = false;
            }
            if (this.f28539b == bVar.f28539b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f28540c == bVar.f28540c) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((!TextUtils.isEmpty(this.f28542e) || !TextUtils.isEmpty(bVar.f28542e)) && (TextUtils.isEmpty(this.f28542e) || TextUtils.isEmpty(bVar.f28542e) || !this.f28542e.equals(bVar.f28542e))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z || !z2 || !z3 || !z4) {
                return false;
            }
            return true;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private long[] f28544a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f28545b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f28546c;

        /* renamed from: d  reason: collision with root package name */
        private String f28547d = "lastmod";

        /* renamed from: e  reason: collision with root package name */
        private int f28548e = 2;

        /* renamed from: f  reason: collision with root package name */
        private boolean f28549f;

        public final c a(long... jArr) {
            this.f28544a = jArr;
            return this;
        }

        private static String a(String str, int i) {
            return "status" + str + "'" + i + "'";
        }

        private static String a(String str, Iterable<String> iterable) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (String next : iterable) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(next);
                z = false;
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final Cursor a(h hVar, String[] strArr, Uri uri) {
            String[] strArr2;
            String str;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f28544a != null) {
                arrayList.add(e.b(this.f28544a));
                arrayList2.addAll(Arrays.asList(e.c(this.f28544a)));
            }
            if (this.f28545b != null) {
                arrayList.add(e.a(this.f28545b));
                arrayList2.addAll(Arrays.asList(e.b(this.f28545b)));
            }
            if (this.f28546c != null) {
                ArrayList arrayList3 = new ArrayList();
                if ((this.f28546c.intValue() & 1) != 0) {
                    arrayList3.add(a("=", 190));
                }
                if ((this.f28546c.intValue() & 2) != 0) {
                    arrayList3.add(a("=", 192));
                }
                if ((this.f28546c.intValue() & 4) != 0) {
                    arrayList3.add(a("=", 193));
                    arrayList3.add(a("=", 194));
                    arrayList3.add(a("=", 195));
                    arrayList3.add(a("=", 196));
                }
                if ((this.f28546c.intValue() & 8) != 0) {
                    arrayList3.add(a("=", 200));
                }
                if ((this.f28546c.intValue() & 16) != 0) {
                    arrayList3.add("(" + a(">=", 400) + " AND " + a("<", 600) + ")");
                }
                arrayList.add(a(" OR ", (Iterable<String>) arrayList3));
            }
            if (this.f28549f) {
                arrayList.add("is_visible_in_downloads_ui != '0'");
            }
            arrayList.add("deleted != '1'");
            String a2 = a(" AND ", (Iterable<String>) arrayList);
            try {
                strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            } catch (ArrayStoreException unused) {
                strArr2 = null;
            }
            if (this.f28548e == 1) {
                str = "ASC";
            } else {
                str = "DESC";
            }
            try {
                return hVar.a(uri, strArr, a2, strArr2, this.f28547d + " " + str);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public static int a(int i) {
        switch (i) {
            case 190:
                return 1;
            case 192:
                return 2;
            case 193:
            case 194:
            case 195:
            case 196:
                return 4;
            case 200:
            case 201:
                return 8;
            default:
                return 16;
        }
    }

    public final Cursor a(c cVar) {
        Cursor a2 = cVar.a(this.f28534d, f28531a, this.f28536f);
        if (a2 == null) {
            return null;
        }
        return new a(a2, this.f28536f);
    }

    static String[] b(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i];
        }
        return strArr2;
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (g == null) {
                g = new e(context, context.getPackageName());
            }
            eVar = g;
        }
        return eVar;
    }

    static String[] c(long[] jArr) {
        String[] strArr = new String[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            strArr[i] = Long.toString(jArr[i]);
        }
        return strArr;
    }

    static String b(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                sb.append("OR ");
            }
            sb.append("_id");
            sb.append(" = ? ");
        }
        sb.append(")");
        return sb.toString();
    }

    static String a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append("OR ");
            }
            sb.append("uri");
            sb.append(" = ? ");
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r0 == null) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(long... r6) {
        /*
            r5 = this;
            com.ss.android.download.e$c r0 = new com.ss.android.download.e$c
            r0.<init>()
            com.ss.android.download.e$c r0 = r0.a(r6)
            android.database.Cursor r0 = r5.a((com.ss.android.download.e.c) r0)
            r0.moveToFirst()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
        L_0x0010:
            boolean r1 = r0.isAfterLast()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r2 = 4
            if (r1 != r2) goto L_0x0027
            r0.moveToNext()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            goto L_0x0010
        L_0x0027:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r3 = "Cann only resume a paused download: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r3 = "_id"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            long r3 = r0.getLong(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r2.append(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            throw r1     // Catch:{ Exception -> 0x0052, all -> 0x004b }
        L_0x0045:
            if (r0 == 0) goto L_0x0055
        L_0x0047:
            r0.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0055
        L_0x004b:
            r6 = move-exception
            if (r0 == 0) goto L_0x0051
            r0.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            throw r6
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            goto L_0x0047
        L_0x0055:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "status"
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.lang.String r1 = "control"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.ss.android.download.h r1 = r5.f28534d
            android.net.Uri r2 = r5.f28536f
            java.lang.String r3 = b((long[]) r6)
            java.lang.String[] r6 = c(r6)
            r1.a((android.net.Uri) r2, (android.content.ContentValues) r0, (java.lang.String) r3, (java.lang.String[]) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.e.e(long[]):void");
    }

    private void d(long... jArr) {
        Cursor a2 = a(new c().a(jArr));
        try {
            a2.moveToFirst();
            while (!a2.isAfterLast()) {
                int i = a2.getInt(a2.getColumnIndex("status"));
                if (i != 2) {
                    if (i != 1) {
                        throw new IllegalArgumentException("Can only pause a running download: " + a2.getLong(a2.getColumnIndex("_id")));
                    }
                }
                a2.moveToNext();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("control", 1);
            contentValues.put("no_integrity", 1);
            this.f28534d.a(this.f28536f, contentValues, b(jArr), c(jArr));
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r8 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r8 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r8.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(long r8) {
        /*
            r7 = this;
            android.net.Uri r0 = com.ss.android.download.b.c.a.f28513a
            android.net.Uri r2 = android.content.ContentUris.withAppendedId(r0, r8)
            android.content.Context r8 = r7.f28532b
            com.ss.android.download.h r1 = com.ss.android.download.h.a((android.content.Context) r8)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.a((android.net.Uri) r2, (java.lang.String[]) r3, (java.lang.String) r4, (java.lang.String[]) r5, (java.lang.String) r6)
            r9 = -1
            boolean r0 = r8.moveToFirst()     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "status"
            int r0 = com.ss.android.download.f.a((android.database.Cursor) r8, (java.lang.String) r0)     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            r9 = r0
        L_0x0022:
            if (r8 == 0) goto L_0x0032
        L_0x0024:
            r8.close()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0032
        L_0x0028:
            r9 = move-exception
            if (r8 == 0) goto L_0x002e
            r8.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            throw r9
        L_0x002f:
            if (r8 == 0) goto L_0x0032
            goto L_0x0024
        L_0x0032:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.e.a(long):int");
    }

    public final int a(long... jArr) {
        if (jArr != null) {
            try {
                if (jArr.length != 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("deleted", 1);
                    if (jArr.length == 1) {
                        return this.f28534d.a(ContentUris.withAppendedId(this.f28536f, jArr[0]), contentValues, (String) null, (String[]) null);
                    }
                    return this.f28534d.a(this.f28536f, contentValues, b(jArr), c(jArr));
                }
            } catch (Exception unused) {
                return -1;
            }
        }
        throw new IllegalArgumentException("input param 'ids' can't be null");
    }

    private e(Context context, String str) {
        this.f28532b = context.getApplicationContext();
        this.f28533c = context.getApplicationContext().getContentResolver();
        this.f28534d = h.a(this.f28532b.getApplicationContext());
        this.f28535e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r5 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r5 == null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r5, long... r6) {
        /*
            r4 = this;
            com.ss.android.download.e$c r5 = new com.ss.android.download.e$c
            r5.<init>()
            com.ss.android.download.e$c r5 = r5.a(r6)
            android.database.Cursor r5 = r4.a((com.ss.android.download.e.c) r5)
            r5.moveToFirst()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
        L_0x0010:
            boolean r0 = r5.isAfterLast()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "status"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            int r0 = r5.getInt(r0)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r1 = 8
            if (r0 == r1) goto L_0x0047
            r1 = 16
            if (r0 != r1) goto L_0x0029
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r2 = "Cannot restart incomplete download: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r2 = "_id"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            long r2 = r5.getLong(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r1.append(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            throw r0     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
        L_0x0047:
            r5.moveToNext()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            goto L_0x0010
        L_0x004b:
            if (r5 == 0) goto L_0x005b
        L_0x004d:
            r5.close()     // Catch:{ Exception -> 0x005b }
            goto L_0x005b
        L_0x0051:
            r6 = move-exception
            if (r5 == 0) goto L_0x0057
            r5.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            throw r6
        L_0x0058:
            if (r5 == 0) goto L_0x005b
            goto L_0x004d
        L_0x005b:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r0 = "current_bytes"
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r2)
            java.lang.String r0 = "total_bytes"
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r0, r2)
            java.lang.String r0 = "_data"
            r5.putNull(r0)
            java.lang.String r0 = "status"
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r0, r2)
            java.lang.String r0 = "numfailed"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
            java.lang.String r0 = "visibility"
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
            com.ss.android.download.h r0 = r4.f28534d
            android.net.Uri r1 = r4.f28536f
            java.lang.String r2 = b((long[]) r6)
            java.lang.String[] r6 = c(r6)
            r0.a((android.net.Uri) r1, (android.content.ContentValues) r5, (java.lang.String) r2, (java.lang.String[]) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.e.a(int, long[]):void");
    }

    public static void a(Context context, int i, long j) {
        if (context != null && j >= 0) {
            try {
                Logger.debug();
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            switch (i) {
                                case 1:
                                case 2:
                                    if (j >= 0) {
                                        a(context).d(j);
                                        break;
                                    }
                                    break;
                            }
                        } else if (j >= 0) {
                            a(context).a(1, j);
                        }
                    } else if (j >= 0) {
                        n.a(context, j, 268435456, true);
                    }
                } else if (j >= 0) {
                    a(context).e(j);
                }
            } catch (Exception unused) {
            }
        }
    }
}
