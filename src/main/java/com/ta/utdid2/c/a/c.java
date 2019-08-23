package com.ta.utdid2.c.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.ta.utdid2.b.a.i;
import com.ta.utdid2.c.a.b;
import java.io.File;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences.Editor f78860a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f48a;

    /* renamed from: a  reason: collision with other field name */
    private b.a f49a;

    /* renamed from: a  reason: collision with other field name */
    private b f50a;

    /* renamed from: a  reason: collision with other field name */
    private d f51a;

    /* renamed from: e  reason: collision with root package name */
    private String f78861e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f78862f = "";
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Context mContext;

    private boolean b() {
        if (this.f50a == null) {
            return false;
        }
        boolean a2 = this.f50a.a();
        if (!a2) {
            commit();
        }
        return a2;
    }

    private void c() {
        if (this.f78860a == null && this.f48a != null) {
            this.f78860a = this.f48a.edit();
        }
        if (this.i && this.f49a == null && this.f50a != null) {
            this.f49a = this.f50a.a();
        }
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean commit() {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r5.f78860a
            r3 = 0
            if (r2 == 0) goto L_0x0022
            boolean r2 = r5.j
            if (r2 != 0) goto L_0x0018
            android.content.SharedPreferences r2 = r5.f48a
            if (r2 == 0) goto L_0x0018
            android.content.SharedPreferences$Editor r2 = r5.f78860a
            java.lang.String r4 = "t"
            r2.putLong(r4, r0)
        L_0x0018:
            android.content.SharedPreferences$Editor r0 = r5.f78860a
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x0022
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            android.content.SharedPreferences r1 = r5.f48a
            if (r1 == 0) goto L_0x0035
            android.content.Context r1 = r5.mContext
            if (r1 == 0) goto L_0x0035
            android.content.Context r1 = r5.mContext
            java.lang.String r2 = r5.f78861e
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r3)
            r5.f48a = r1
        L_0x0035:
            r1 = 0
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x003b }
            r1 = r2
        L_0x003b:
            boolean r2 = com.ta.utdid2.b.a.i.a((java.lang.String) r1)
            if (r2 != 0) goto L_0x00a8
            java.lang.String r2 = "mounted"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0086
            com.ta.utdid2.c.a.b r2 = r5.f50a
            if (r2 != 0) goto L_0x0079
            java.lang.String r2 = r5.f78862f
            com.ta.utdid2.c.a.d r2 = r5.a((java.lang.String) r2)
            if (r2 == 0) goto L_0x0086
            java.lang.String r4 = r5.f78861e
            com.ta.utdid2.c.a.b r2 = r2.a((java.lang.String) r4, (int) r3)
            r5.f50a = r2
            boolean r2 = r5.j
            if (r2 != 0) goto L_0x0069
            android.content.SharedPreferences r2 = r5.f48a
            com.ta.utdid2.c.a.b r4 = r5.f50a
            r5.a((android.content.SharedPreferences) r2, (com.ta.utdid2.c.a.b) r4)
            goto L_0x0070
        L_0x0069:
            com.ta.utdid2.c.a.b r2 = r5.f50a
            android.content.SharedPreferences r4 = r5.f48a
            r5.a((com.ta.utdid2.c.a.b) r2, (android.content.SharedPreferences) r4)
        L_0x0070:
            com.ta.utdid2.c.a.b r2 = r5.f50a
            com.ta.utdid2.c.a.b$a r2 = r2.a()
            r5.f49a = r2
            goto L_0x0086
        L_0x0079:
            com.ta.utdid2.c.a.b$a r2 = r5.f49a
            if (r2 == 0) goto L_0x0086
            com.ta.utdid2.c.a.b$a r2 = r5.f49a
            boolean r2 = r2.commit()
            if (r2 != 0) goto L_0x0086
            r0 = 0
        L_0x0086:
            java.lang.String r2 = "mounted"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x009a
            java.lang.String r2 = "mounted_ro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00a8
            com.ta.utdid2.c.a.b r1 = r5.f50a
            if (r1 == 0) goto L_0x00a8
        L_0x009a:
            com.ta.utdid2.c.a.d r1 = r5.f51a     // Catch:{ Exception -> 0x00a8 }
            if (r1 == 0) goto L_0x00a8
            com.ta.utdid2.c.a.d r1 = r5.f51a     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = r5.f78861e     // Catch:{ Exception -> 0x00a8 }
            com.ta.utdid2.c.a.b r1 = r1.a((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x00a8 }
            r5.f50a = r1     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.c.a.c.commit():boolean");
    }

    private d a(String str) {
        File a2 = a(str);
        if (a2 == null) {
            return null;
        }
        this.f51a = new d(a2.getAbsolutePath());
        return this.f51a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private File m19a(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        File file = new File(String.format("%s%s%s", new Object[]{externalStorageDirectory.getAbsolutePath(), File.separator, str}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public String getString(String str) {
        b();
        if (this.f48a != null) {
            String string = this.f48a.getString(str, "");
            if (!i.a(string)) {
                return string;
            }
        }
        if (this.f50a != null) {
            return this.f50a.getString(str, "");
        }
        return "";
    }

    public void remove(String str) {
        if (!i.a(str) && !str.equals("t")) {
            c();
            if (this.f78860a != null) {
                this.f78860a.remove(str);
            }
            if (this.f49a != null) {
                this.f49a.a(str);
            }
        }
    }

    public void putString(String str, String str2) {
        if (!i.a(str) && !str.equals("t")) {
            c();
            if (this.f78860a != null) {
                this.f78860a.putString(str, str2);
            }
            if (this.f49a != null) {
                this.f49a.a(str, str2);
            }
        }
    }

    private void a(SharedPreferences sharedPreferences, b bVar) {
        if (sharedPreferences != null && bVar != null) {
            b.a a2 = bVar.a();
            if (a2 != null) {
                a2.b();
                for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    if (value instanceof String) {
                        a2.a(str, (String) value);
                    } else if (value instanceof Integer) {
                        a2.a(str, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        a2.a(str, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        a2.a(str, ((Float) value).floatValue());
                    } else if (value instanceof Boolean) {
                        a2.a(str, ((Boolean) value).booleanValue());
                    }
                }
                a2.commit();
            }
        }
    }

    private void a(b bVar, SharedPreferences sharedPreferences) {
        if (bVar != null && sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.clear();
                for (Map.Entry next : bVar.getAll().entrySet()) {
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    if (value instanceof String) {
                        edit.putString(str, (String) value);
                    } else if (value instanceof Integer) {
                        edit.putInt(str, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        edit.putLong(str, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        edit.putFloat(str, ((Float) value).floatValue());
                    } else if (value instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) value).booleanValue());
                    }
                }
                edit.commit();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f A[SYNTHETIC, Splitter:B:27:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0179 A[Catch:{ Exception -> 0x0188 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r0 = ""
            r8.f78861e = r0
            java.lang.String r0 = ""
            r8.f78862f = r0
            r8.g = r12
            r8.j = r13
            r8.f78861e = r11
            r8.f78862f = r10
            r8.mContext = r9
            r12 = 0
            r0 = 0
            if (r9 == 0) goto L_0x0029
            android.content.SharedPreferences r2 = com.ss.android.ugc.aweme.q.c.a(r9, r11, r12)
            r8.f48a = r2
            android.content.SharedPreferences r2 = r8.f48a
            java.lang.String r3 = "t"
            long r2 = r2.getLong(r3, r0)
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            r4 = 0
            java.lang.String r5 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0030 }
            r4 = r5
        L_0x0030:
            boolean r5 = com.ta.utdid2.b.a.i.a((java.lang.String) r4)
            if (r5 != 0) goto L_0x0051
            java.lang.String r5 = "mounted"
            boolean r5 = r4.equals(r5)
            r6 = 1
            if (r5 == 0) goto L_0x0044
            r8.i = r6
            r8.h = r6
            goto L_0x0055
        L_0x0044:
            java.lang.String r5 = "mounted_ro"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0051
            r8.h = r6
            r8.i = r12
            goto L_0x0055
        L_0x0051:
            r8.i = r12
            r8.h = r12
        L_0x0055:
            boolean r4 = r8.h
            if (r4 != 0) goto L_0x005d
            boolean r4 = r8.i
            if (r4 == 0) goto L_0x0142
        L_0x005d:
            if (r9 == 0) goto L_0x0142
            boolean r4 = com.ta.utdid2.b.a.i.a((java.lang.String) r10)
            if (r4 != 0) goto L_0x0142
            com.ta.utdid2.c.a.d r10 = r8.a((java.lang.String) r10)
            r8.f51a = r10
            com.ta.utdid2.c.a.d r10 = r8.f51a
            if (r10 == 0) goto L_0x0142
            com.ta.utdid2.c.a.d r10 = r8.f51a     // Catch:{ Exception -> 0x0142 }
            com.ta.utdid2.c.a.b r10 = r10.a((java.lang.String) r11, (int) r12)     // Catch:{ Exception -> 0x0142 }
            r8.f50a = r10     // Catch:{ Exception -> 0x0142 }
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x0142 }
            java.lang.String r4 = "t"
            long r4 = r10.getLong(r4, r0)     // Catch:{ Exception -> 0x0142 }
            if (r13 != 0) goto L_0x00be
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0096
            android.content.SharedPreferences r9 = r8.f48a     // Catch:{ Exception -> 0x0140 }
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x0140 }
            r8.a((android.content.SharedPreferences) r9, (com.ta.utdid2.c.a.b) r10)     // Catch:{ Exception -> 0x0140 }
            com.ta.utdid2.c.a.d r9 = r8.f51a     // Catch:{ Exception -> 0x0140 }
            com.ta.utdid2.c.a.b r9 = r9.a((java.lang.String) r11, (int) r12)     // Catch:{ Exception -> 0x0140 }
            r8.f50a = r9     // Catch:{ Exception -> 0x0140 }
            goto L_0x0143
        L_0x0096:
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a9
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x0140 }
            android.content.SharedPreferences r13 = r8.f48a     // Catch:{ Exception -> 0x0140 }
            r8.a((com.ta.utdid2.c.a.b) r10, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x0140 }
            android.content.SharedPreferences r9 = com.ss.android.ugc.aweme.q.c.a(r9, r11, r12)     // Catch:{ Exception -> 0x0140 }
            r8.f48a = r9     // Catch:{ Exception -> 0x0140 }
            goto L_0x0143
        L_0x00a9:
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0143
            android.content.SharedPreferences r9 = r8.f48a     // Catch:{ Exception -> 0x0140 }
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x0140 }
            r8.a((android.content.SharedPreferences) r9, (com.ta.utdid2.c.a.b) r10)     // Catch:{ Exception -> 0x0140 }
            com.ta.utdid2.c.a.d r9 = r8.f51a     // Catch:{ Exception -> 0x0140 }
            com.ta.utdid2.c.a.b r9 = r9.a((java.lang.String) r11, (int) r12)     // Catch:{ Exception -> 0x0140 }
            r8.f50a = r9     // Catch:{ Exception -> 0x0140 }
            goto L_0x0143
        L_0x00be:
            android.content.SharedPreferences r10 = r8.f48a     // Catch:{ Exception -> 0x0140 }
            java.lang.String r13 = "t2"
            long r6 = r10.getLong(r13, r0)     // Catch:{ Exception -> 0x0140 }
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x013e }
            java.lang.String r13 = "t2"
            long r2 = r10.getLong(r13, r0)     // Catch:{ Exception -> 0x013e }
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x00e6
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00e6
            android.content.SharedPreferences r9 = r8.f48a     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x013d }
            r8.a((android.content.SharedPreferences) r9, (com.ta.utdid2.c.a.b) r10)     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.d r9 = r8.f51a     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.b r9 = r9.a((java.lang.String) r11, (int) r12)     // Catch:{ Exception -> 0x013d }
            r8.f50a = r9     // Catch:{ Exception -> 0x013d }
            goto L_0x013d
        L_0x00e6:
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x00fc
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00fc
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x013d }
            android.content.SharedPreferences r13 = r8.f48a     // Catch:{ Exception -> 0x013d }
            r8.a((com.ta.utdid2.c.a.b) r10, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x013d }
            android.content.SharedPreferences r9 = com.ss.android.ugc.aweme.q.c.a(r9, r11, r12)     // Catch:{ Exception -> 0x013d }
            r8.f48a = r9     // Catch:{ Exception -> 0x013d }
            goto L_0x013d
        L_0x00fc:
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0112
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0112
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x013d }
            android.content.SharedPreferences r13 = r8.f48a     // Catch:{ Exception -> 0x013d }
            r8.a((com.ta.utdid2.c.a.b) r10, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x013d }
            android.content.SharedPreferences r9 = com.ss.android.ugc.aweme.q.c.a(r9, r11, r12)     // Catch:{ Exception -> 0x013d }
            r8.f48a = r9     // Catch:{ Exception -> 0x013d }
            goto L_0x013d
        L_0x0112:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x012a
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x012a
            android.content.SharedPreferences r9 = r8.f48a     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x013d }
            r8.a((android.content.SharedPreferences) r9, (com.ta.utdid2.c.a.b) r10)     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.d r9 = r8.f51a     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.b r9 = r9.a((java.lang.String) r11, (int) r12)     // Catch:{ Exception -> 0x013d }
            r8.f50a = r9     // Catch:{ Exception -> 0x013d }
            goto L_0x013d
        L_0x012a:
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x013d
            android.content.SharedPreferences r9 = r8.f48a     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.b r10 = r8.f50a     // Catch:{ Exception -> 0x013d }
            r8.a((android.content.SharedPreferences) r9, (com.ta.utdid2.c.a.b) r10)     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.d r9 = r8.f51a     // Catch:{ Exception -> 0x013d }
            com.ta.utdid2.c.a.b r9 = r9.a((java.lang.String) r11, (int) r12)     // Catch:{ Exception -> 0x013d }
            r8.f50a = r9     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            r4 = r2
        L_0x013e:
            r2 = r6
            goto L_0x0143
        L_0x0140:
            goto L_0x0143
        L_0x0142:
            r4 = r0
        L_0x0143:
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x014f
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0188
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0188
        L_0x014f:
            long r9 = java.lang.System.currentTimeMillis()
            boolean r11 = r8.j
            if (r11 == 0) goto L_0x0163
            boolean r11 = r8.j
            if (r11 == 0) goto L_0x0188
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x0188
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x0188
        L_0x0163:
            android.content.SharedPreferences r11 = r8.f48a
            if (r11 == 0) goto L_0x0175
            android.content.SharedPreferences r11 = r8.f48a
            android.content.SharedPreferences$Editor r11 = r11.edit()
            java.lang.String r12 = "t2"
            r11.putLong(r12, r9)
            r11.commit()
        L_0x0175:
            com.ta.utdid2.c.a.b r11 = r8.f50a     // Catch:{ Exception -> 0x0188 }
            if (r11 == 0) goto L_0x0188
            com.ta.utdid2.c.a.b r11 = r8.f50a     // Catch:{ Exception -> 0x0188 }
            com.ta.utdid2.c.a.b$a r11 = r11.a()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r12 = "t2"
            r11.a((java.lang.String) r12, (long) r9)     // Catch:{ Exception -> 0x0188 }
            r11.commit()     // Catch:{ Exception -> 0x0188 }
            return
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.c.a.c.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
