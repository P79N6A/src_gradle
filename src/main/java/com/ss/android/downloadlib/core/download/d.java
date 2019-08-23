package com.ss.android.downloadlib.core.download;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.a.a;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.c.f;
import com.ss.android.downloadlib.core.download.a;
import com.ss.android.downloadlib.core.download.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f28950d = {"_id", "_data AS local_filename", "mediaprovider_uri", "destination", PushConstants.TITLE, "description", "uri", "status", "hint", "mimetype AS media_type", "total_bytes AS total_size", "lastmod AS last_modified_timestamp", "current_bytes AS bytes_so_far", "allow_write", "time_cost", "etag", "'placeholder' AS local_uri", "'placeholder' AS reason"};
    private static d h;

    /* renamed from: a  reason: collision with root package name */
    public g f28951a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f28952b = j.a.f29029a;

    /* renamed from: c  reason: collision with root package name */
    public a f28953c;

    /* renamed from: e  reason: collision with root package name */
    private Context f28954e;

    /* renamed from: f  reason: collision with root package name */
    private ContentResolver f28955f;
    private String g;

    static class a extends CursorWrapper {

        /* renamed from: a  reason: collision with root package name */
        private Uri f28967a;

        /* renamed from: b  reason: collision with root package name */
        private Context f28968b;

        public final int getInt(int i) {
            return (int) getLong(i);
        }

        public final long getLong(int i) {
            long j;
            if (getColumnName(i).equals("reason")) {
                int i2 = super.getInt(getColumnIndex("status"));
                int a2 = d.a(i2);
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
                } else if ((400 <= i2 && i2 < 487) || (500 <= i2 && i2 < 600)) {
                    j = (long) i2;
                } else if (i2 == 497) {
                    j = 1005;
                } else if (i2 != 499) {
                    switch (i2) {
                        case 198:
                            j = 1006;
                            break;
                        case 199:
                            j = 1007;
                            break;
                        default:
                            switch (i2) {
                                case 488:
                                    j = 1009;
                                    break;
                                case 489:
                                    j = 1008;
                                    break;
                                case 490:
                                    j = 1012;
                                    break;
                                default:
                                    switch (i2) {
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
                                        default:
                                            return 1000;
                                    }
                            }
                    }
                } else {
                    j = 1011;
                }
                return j;
            } else if (getColumnName(i).equals("status")) {
                return (long) d.a(super.getInt(getColumnIndex("status")));
            } else {
                return super.getLong(i);
            }
        }

        public final String getString(int i) {
            String str = null;
            if (getColumnName(i).equals("local_uri")) {
                long j = getLong(getColumnIndex("destination"));
                if (j == 1 || j == 0) {
                    String string = getString(getColumnIndex("local_filename"));
                    if (string != null) {
                        if (k.j() != null) {
                            str = k.j().a();
                        }
                        if (Build.VERSION.SDK_INT < 24 || TextUtils.isEmpty(str)) {
                            str = Uri.fromFile(new File(string)).toString();
                        } else {
                            str = FileProvider.getUriForFile(this.f28968b, str, new File(string)).toString();
                        }
                    }
                } else {
                    return ContentUris.withAppendedId(this.f28967a, getLong(getColumnIndex("_id"))).toString();
                }
            } else {
                str = super.getString(i);
            }
            return str;
        }

        public a(Cursor cursor, Uri uri, Context context) {
            super(cursor);
            this.f28967a = uri;
            this.f28968b = context.getApplicationContext();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Integer f28969a;

        /* renamed from: b  reason: collision with root package name */
        private long[] f28970b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f28971c;

        /* renamed from: d  reason: collision with root package name */
        private String f28972d = "lastmod";

        /* renamed from: e  reason: collision with root package name */
        private int f28973e = 2;

        /* renamed from: f  reason: collision with root package name */
        private boolean f28974f;

        public final b a(long... jArr) {
            this.f28970b = jArr;
            return this;
        }

        public final b a(String... strArr) {
            this.f28971c = strArr;
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
        public final Cursor a(g gVar, String[] strArr, Uri uri, a aVar, Object obj) {
            String[] strArr2;
            String str;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f28970b != null) {
                arrayList.add(d.b(this.f28970b));
                arrayList2.addAll(Arrays.asList(d.c(this.f28970b)));
            }
            if (this.f28971c != null) {
                arrayList.add(d.a(this.f28971c));
                arrayList2.addAll(Arrays.asList(d.b(this.f28971c)));
            }
            if (this.f28969a != null) {
                ArrayList arrayList3 = new ArrayList();
                if ((this.f28969a.intValue() & 1) != 0) {
                    arrayList3.add(a("=", 190));
                }
                if ((this.f28969a.intValue() & 2) != 0) {
                    arrayList3.add(a("=", 192));
                }
                if ((this.f28969a.intValue() & 4) != 0) {
                    arrayList3.add(a("=", 193));
                    arrayList3.add(a("=", 194));
                    arrayList3.add(a("=", 195));
                    arrayList3.add(a("=", 196));
                }
                if ((this.f28969a.intValue() & 8) != 0) {
                    arrayList3.add(a("=", 200));
                }
                if ((this.f28969a.intValue() & 16) != 0) {
                    arrayList3.add("(" + a(">=", 400) + " AND " + a("<", 600) + ")");
                }
                arrayList.add(a(" OR ", (Iterable<String>) arrayList3));
            }
            if (this.f28974f) {
                arrayList.add("is_visible_in_downloads_ui != '0'");
            }
            arrayList.add("deleted != '1'");
            String a2 = a(" AND ", (Iterable<String>) arrayList);
            try {
                strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            } catch (ArrayStoreException unused) {
                strArr2 = null;
            }
            if (this.f28973e == 1) {
                str = "ASC";
            } else {
                str = "DESC";
            }
            String str2 = this.f28972d + " " + str;
            if (obj == null) {
                try {
                    return gVar.a(uri, strArr, a2, strArr2, str2);
                } catch (Exception unused2) {
                    return null;
                }
            } else {
                if (aVar != null) {
                    aVar.a(0, obj, uri, strArr, a2, strArr2, str2);
                }
                return null;
            }
        }
    }

    public static class c {
        static final /* synthetic */ boolean m = (!d.class.desiredAssertionStatus());

        /* renamed from: a  reason: collision with root package name */
        public Uri f28975a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f28976b;

        /* renamed from: c  reason: collision with root package name */
        public List<Pair<String, String>> f28977c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f28978d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f28979e;

        /* renamed from: f  reason: collision with root package name */
        public String f28980f;
        public int g = -1;
        public boolean h = true;
        public boolean i = true;
        boolean j = false;
        public int k = 0;
        public boolean l = true;

        public final c a(int i2) {
            this.k = i2;
            return this;
        }

        public c(Uri uri) {
            if (uri != null) {
                String scheme = uri.getScheme();
                if (scheme == null || (!scheme.equals("http") && !scheme.equals("https"))) {
                    throw new IllegalArgumentException("Can only download HTTP/HTTPS URIs: " + uri);
                }
                this.f28975a = uri;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: package-private */
        public void a(ContentValues contentValues) {
            int i2 = 0;
            for (Pair next : this.f28977c) {
                contentValues.put("http_header_" + i2, ((String) next.first) + ": " + ((String) next.second));
                i2++;
            }
        }

        public void a(File file, String str) {
            if (str != null) {
                this.f28976b = Uri.withAppendedPath(Uri.fromFile(file), str);
                return;
            }
            throw new NullPointerException("subPath cannot be null");
        }

        static void a(ContentValues contentValues, String str, Object obj) {
            if (obj != null) {
                contentValues.put(str, obj.toString());
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

    public final boolean a(e eVar) {
        if (eVar == null || eVar.f28492b != 8 || com.ss.android.downloadlib.c.k.c(eVar.f28495e)) {
            return false;
        }
        a(eVar.f28491a);
        return true;
    }

    public final void a(long j) {
        Uri withAppendedId = ContentUris.withAppendedId(j.a.f29029a, j);
        Cursor a2 = this.f28951a.a(withAppendedId, (String[]) null, (String) null, (String[]) null, (String) null);
        try {
            if (a2.moveToFirst()) {
                int i = a2.getInt(a2.getColumnIndexOrThrow("status"));
                int i2 = a2.getInt(a2.getColumnIndexOrThrow("visibility"));
                String string = a2.getString(a2.getColumnIndexOrThrow("_data"));
                if (a.C0337a.a(i) && ((i2 == 0 || i2 == 1) && com.ss.android.downloadlib.c.k.c(string))) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("visibility", 1);
                    contentValues.put("status", 201);
                    this.f28953c.a(0, null, withAppendedId, contentValues, null, null);
                } else if (a(i) == 4) {
                    f(j);
                } else {
                    a(i2, j);
                }
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused4) {
                }
            }
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    public final void a(final int i, final long... jArr) {
        a(new b().a(jArr), (Object) new a.C0346a() {
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00a7 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(android.database.Cursor r9) {
                /*
                    r8 = this;
                    r9.moveToFirst()     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                L_0x0003:
                    boolean r0 = r9.isAfterLast()     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    if (r0 != 0) goto L_0x003e
                    java.lang.String r0 = "status"
                    int r0 = r9.getColumnIndex(r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    int r0 = r9.getInt(r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r1 = 8
                    if (r0 == r1) goto L_0x003a
                    r1 = 16
                    if (r0 != r1) goto L_0x001c
                    goto L_0x003a
                L_0x001c:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r2 = "Cannot restart incomplete download: "
                    r1.<init>(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r2 = "_id"
                    int r2 = r9.getColumnIndex(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    long r2 = r9.getLong(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r1.append(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    throw r0     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                L_0x003a:
                    r9.moveToNext()     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    goto L_0x0003
                L_0x003e:
                    android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r5.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r0 = "current_bytes"
                    r1 = 0
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r5.put(r0, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r0 = "total_bytes"
                    r2 = -1
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r5.put(r0, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r0 = "_data"
                    r5.putNull(r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r0 = "status"
                    r2 = 190(0xbe, float:2.66E-43)
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r5.put(r0, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r0 = "numfailed"
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r5.put(r0, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r0 = "visibility"
                    int r2 = r3     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r5.put(r0, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r0 = "control"
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r5.put(r0, r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.this     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    com.ss.android.downloadlib.core.download.a r1 = r0.f28953c     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r2 = -1
                    r3 = 0
                    com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.this     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    android.net.Uri r4 = r0.f28952b     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    long[] r0 = r4     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String r6 = com.ss.android.downloadlib.core.download.d.b((long[]) r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    long[] r0 = r4     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    java.lang.String[] r7 = com.ss.android.downloadlib.core.download.d.c(r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a2 }
                    r9.close()     // Catch:{ Exception -> 0x00a1 }
                    return
                L_0x00a1:
                    return
                L_0x00a2:
                    r0 = move-exception
                    r9.close()     // Catch:{ Exception -> 0x00a6 }
                L_0x00a6:
                    throw r0
                L_0x00a7:
                    r9.close()     // Catch:{ Exception -> 0x00ab }
                    return
                L_0x00ab:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.d.AnonymousClass4.a(android.database.Cursor):void");
            }
        });
    }

    public final void a(long... jArr) {
        d(jArr);
    }

    public final Cursor a(b bVar) {
        return a(bVar, (Object) null);
    }

    static String[] b(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i];
        }
        return strArr2;
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (h == null) {
                h = new d(context, context.getPackageName());
            }
            dVar = h;
        }
        return dVar;
    }

    static String[] c(long[] jArr) {
        String[] strArr = new String[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            strArr[i] = Long.toString(jArr[i]);
        }
        return strArr;
    }

    private void e(final long... jArr) {
        a(new b().a(jArr), (Object) new a.C0346a() {
            /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0076 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(android.database.Cursor r9) {
                /*
                    r8 = this;
                    r9.moveToFirst()     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                L_0x0003:
                    boolean r0 = r9.isAfterLast()     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r1 = 1
                    if (r0 != 0) goto L_0x003c
                    java.lang.String r0 = "status"
                    int r0 = r9.getColumnIndex(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    int r0 = r9.getInt(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r2 = 2
                    if (r0 == r2) goto L_0x0038
                    if (r0 != r1) goto L_0x001a
                    goto L_0x0038
                L_0x001a:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.String r2 = "Can only pause a running download: "
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.String r2 = "_id"
                    int r2 = r9.getColumnIndex(r2)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    long r2 = r9.getLong(r2)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r1.append(r2)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    throw r0     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                L_0x0038:
                    r9.moveToNext()     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    goto L_0x0003
                L_0x003c:
                    android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r5.<init>()     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.String r0 = "control"
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r5.put(r0, r2)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.String r0 = "no_integrity"
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r5.put(r0, r1)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.this     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    com.ss.android.downloadlib.core.download.a r1 = r0.f28953c     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r2 = 0
                    r3 = 0
                    com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.this     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    android.net.Uri r4 = r0.f28952b     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    long[] r0 = r3     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.String r6 = com.ss.android.downloadlib.core.download.d.b((long[]) r0)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    long[] r0 = r3     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    java.lang.String[] r7 = com.ss.android.downloadlib.core.download.d.c(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
                    r9.close()     // Catch:{ Exception -> 0x0070 }
                    return
                L_0x0070:
                    return
                L_0x0071:
                    r0 = move-exception
                    r9.close()     // Catch:{ Exception -> 0x0075 }
                L_0x0075:
                    throw r0
                L_0x0076:
                    r9.close()     // Catch:{ Exception -> 0x007a }
                    return
                L_0x007a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.d.AnonymousClass2.a(android.database.Cursor):void");
            }
        });
    }

    private void f(final long... jArr) {
        a(new b().a(jArr), (Object) new a.C0346a() {
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(android.database.Cursor r9) {
                /*
                    r8 = this;
                    r9.moveToFirst()     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                L_0x0003:
                    boolean r0 = r9.isAfterLast()     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    if (r0 != 0) goto L_0x0038
                    java.lang.String r0 = "status"
                    int r0 = r9.getColumnIndex(r0)     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    int r0 = r9.getInt(r0)     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    r1 = 4
                    if (r0 != r1) goto L_0x001a
                    r9.moveToNext()     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    goto L_0x0003
                L_0x001a:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    java.lang.String r2 = "Can only resume a paused download: "
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    java.lang.String r2 = "_id"
                    int r2 = r9.getColumnIndex(r2)     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    long r2 = r9.getLong(r2)     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    r1.append(r2)     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                    throw r0     // Catch:{ Exception -> 0x0038, all -> 0x003c }
                L_0x0038:
                    r9.close()     // Catch:{ Exception -> 0x0041 }
                    goto L_0x0041
                L_0x003c:
                    r0 = move-exception
                    r9.close()     // Catch:{ Exception -> 0x0040 }
                L_0x0040:
                    throw r0
                L_0x0041:
                    android.content.ContentValues r5 = new android.content.ContentValues
                    r5.<init>()
                    java.lang.String r9 = "status"
                    r0 = 190(0xbe, float:2.66E-43)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r5.put(r9, r0)
                    java.lang.String r9 = "control"
                    r0 = 0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r5.put(r9, r0)
                    com.ss.android.downloadlib.core.download.d r9 = com.ss.android.downloadlib.core.download.d.this
                    com.ss.android.downloadlib.core.download.a r1 = r9.f28953c
                    r2 = -1
                    r3 = 0
                    com.ss.android.downloadlib.core.download.d r9 = com.ss.android.downloadlib.core.download.d.this
                    android.net.Uri r4 = r9.f28952b
                    long[] r9 = r3
                    java.lang.String r6 = com.ss.android.downloadlib.core.download.d.b((long[]) r9)
                    long[] r9 = r3
                    java.lang.String[] r7 = com.ss.android.downloadlib.core.download.d.c(r9)
                    r1.a(r2, r3, r4, r5, r6, r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.d.AnonymousClass3.a(android.database.Cursor):void");
            }
        });
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

    private void d(long... jArr) {
        if (jArr != null) {
            try {
                if (jArr.length != 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("deleted", 1);
                    if (jArr.length == 1) {
                        this.f28953c.a(0, null, ContentUris.withAppendedId(this.f28952b, jArr[0]), contentValues, null, null);
                        return;
                    } else {
                        this.f28953c.a(0, null, this.f28952b, contentValues, b(jArr), c(jArr));
                        return;
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalArgumentException("input param 'ids' can't be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[SYNTHETIC, Splitter:B:34:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b A[SYNTHETIC, Splitter:B:40:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long b(com.ss.android.downloadlib.core.download.d.c r12) {
        /*
            r11 = this;
            r0 = 0
            com.ss.android.downloadlib.core.download.d$b r1 = new com.ss.android.downloadlib.core.download.d$b     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            r1.<init>()     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            android.net.Uri r3 = r12.f28975a     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            r1.a((java.lang.String[]) r2)     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            android.database.Cursor r1 = r11.a((com.ss.android.downloadlib.core.download.d.b) r1)     // Catch:{ Exception -> 0x0079, all -> 0x0071 }
            if (r1 == 0) goto L_0x006b
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            if (r0 <= 0) goto L_0x006b
            r1.moveToFirst()     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            long r2 = r1.getLong(r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r0 = "etag"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r8 = r1.getString(r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            if (r0 != 0) goto L_0x005e
            android.content.Context r0 = r11.f28954e     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            boolean r0 = com.ss.android.downloadlib.c.k.a((android.content.Context) r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            if (r0 != 0) goto L_0x004f
            r11.a((long) r2)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            return r2
        L_0x004f:
            com.ss.android.downloadlib.core.download.d$1 r0 = new com.ss.android.downloadlib.core.download.d$1     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r5 = r0
            r6 = r11
            r7 = r12
            r9 = r2
            r5.<init>(r7, r8, r9)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.Void[] r12 = new java.lang.Void[r4]     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            com.ss.android.downloadlib.c.a.a.a(r0, r12)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            goto L_0x0061
        L_0x005e:
            r11.a((long) r2)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            return r2
        L_0x0067:
            r12 = move-exception
            goto L_0x0073
        L_0x0069:
            r0 = r1
            goto L_0x0079
        L_0x006b:
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ Exception -> 0x007e }
            goto L_0x007e
        L_0x0071:
            r12 = move-exception
            r1 = r0
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            throw r12
        L_0x0079:
            if (r0 == 0) goto L_0x007e
            r0.close()     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.d.b(com.ss.android.downloadlib.core.download.d$c):long");
    }

    public final long a(c cVar) {
        try {
            long b2 = b(cVar);
            if (b2 == -1) {
                String str = this.g;
                ContentValues contentValues = new ContentValues();
                if (!c.m) {
                    if (cVar.f28975a == null) {
                        throw new AssertionError();
                    }
                }
                contentValues.put("uri", cVar.f28975a.toString());
                contentValues.put("notificationpackage", str);
                contentValues.put("InExternalPublicDir", Integer.valueOf(cVar.l ? 1 : 0));
                int i = 0;
                if (cVar.f28976b != null) {
                    contentValues.put("destination", 1);
                    contentValues.put("hint", cVar.f28976b.toString());
                } else {
                    contentValues.put("destination", 0);
                }
                if (!cVar.j) {
                    i = 2;
                }
                contentValues.put("scanned", Integer.valueOf(i));
                if (!cVar.f28977c.isEmpty()) {
                    cVar.a(contentValues);
                }
                c.a(contentValues, PushConstants.TITLE, cVar.f28978d);
                c.a(contentValues, "description", cVar.f28979e);
                c.a(contentValues, "mimetype", cVar.f28980f);
                contentValues.put("visibility", Integer.valueOf(cVar.k));
                contentValues.put("allowed_network_types", Integer.valueOf(cVar.g));
                contentValues.put("allow_roaming", Boolean.valueOf(cVar.h));
                contentValues.put("is_visible_in_downloads_ui", Boolean.valueOf(cVar.i));
                b2 = Long.parseLong(this.f28951a.a(j.a.f29029a, contentValues).getLastPathSegment());
            }
            return b2;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r5 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r5 != null) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078 A[SYNTHETIC, Splitter:B:22:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.download.api.c.e a(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.ss.android.downloadlib.core.download.d$b r0 = new com.ss.android.downloadlib.core.download.d$b     // Catch:{ Exception -> 0x007c, all -> 0x0074 }
            r0.<init>()     // Catch:{ Exception -> 0x007c, all -> 0x0074 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x007c, all -> 0x0074 }
            r3 = 0
            r2[r3] = r5     // Catch:{ Exception -> 0x007c, all -> 0x0074 }
            r0.a((java.lang.String[]) r2)     // Catch:{ Exception -> 0x007c, all -> 0x0074 }
            android.database.Cursor r5 = r4.a((com.ss.android.downloadlib.core.download.d.b) r0)     // Catch:{ Exception -> 0x007c, all -> 0x0074 }
            if (r5 == 0) goto L_0x006e
            int r0 = r5.getCount()     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            if (r0 <= 0) goto L_0x006e
            r5.moveToFirst()     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            com.ss.android.download.api.c.e r0 = new com.ss.android.download.api.c.e     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            r0.<init>()     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            java.lang.String r2 = "_id"
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            long r2 = r5.getLong(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            r0.f28491a = r2     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            java.lang.String r2 = "status"
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            int r2 = r5.getInt(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            r0.f28492b = r2     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            java.lang.String r2 = "total_size"
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            long r2 = r5.getLong(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            r0.f28493c = r2     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            java.lang.String r2 = "bytes_so_far"
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            long r2 = r5.getLong(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            r0.f28494d = r2     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            java.lang.String r2 = "local_filename"
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            r0.f28495e = r2     // Catch:{ Exception -> 0x007d, all -> 0x006c }
            if (r5 == 0) goto L_0x006b
            r5.close()     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            return r0
        L_0x006c:
            r0 = move-exception
            goto L_0x0076
        L_0x006e:
            if (r5 == 0) goto L_0x0080
        L_0x0070:
            r5.close()     // Catch:{ Exception -> 0x0080 }
            goto L_0x0080
        L_0x0074:
            r0 = move-exception
            r5 = r1
        L_0x0076:
            if (r5 == 0) goto L_0x007b
            r5.close()     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            throw r0
        L_0x007c:
            r5 = r1
        L_0x007d:
            if (r5 == 0) goto L_0x0080
            goto L_0x0070
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.d.a(java.lang.String):com.ss.android.download.api.c.e");
    }

    private d(Context context, String str) {
        this.f28954e = context.getApplicationContext();
        this.f28955f = context.getApplicationContext().getContentResolver();
        this.f28951a = g.a(this.f28954e.getApplicationContext());
        this.g = str;
        this.f28953c = new a(this.f28951a, this.f28952b, this.f28954e);
    }

    public final Cursor a(b bVar, Object obj) {
        Cursor a2 = bVar.a(this.f28951a, f28950d, this.f28952b, this.f28953c, obj);
        if (a2 == null) {
            return null;
        }
        return new a(a2, this.f28952b, this.f28954e);
    }

    public static void a(Context context, int i, long j, String str) {
        if (context != null && j >= 0) {
            try {
                if (f.a()) {
                    StringBuilder sb = new StringBuilder("mId = ");
                    sb.append(j);
                    sb.append(" mStatus = ");
                    sb.append(i);
                }
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            switch (i) {
                                case 1:
                                case 2:
                                    if (j >= 0) {
                                        a(context).e(j);
                                        break;
                                    }
                                    break;
                            }
                        } else if (j >= 0) {
                            a(context).a(1, j);
                        }
                    } else if (j >= 0) {
                        m.a(context, j, new int[]{268435456, 536870912}, str);
                    }
                } else if (j >= 0) {
                    a(context).f(j);
                }
            } catch (Exception unused) {
            }
        }
    }
}
