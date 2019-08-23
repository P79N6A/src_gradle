package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class w {

    /* renamed from: c  reason: collision with root package name */
    private static Context f80693c;

    /* renamed from: d  reason: collision with root package name */
    private static String f80694d;
    private List<String> h;

    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION
    }

    static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final w f80701a = new w();

        private b() {
        }
    }

    private w() {
        this.h = new ArrayList();
        if (f80693c != null) {
            b();
            this.h.clear();
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        c(jSONObject2);
        b(jSONObject2);
        a(jSONObject2);
        try {
            if (jSONObject2.length() > 0) {
                jSONObject.put("body", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private void b() {
        try {
            if (TextUtils.isEmpty(f80694d)) {
                SharedPreferences a2 = ba.a(f80693c);
                String string = a2.getString("ek__id", null);
                if (TextUtils.isEmpty(string)) {
                    string = bv.A(f80693c);
                    if (!TextUtils.isEmpty(string)) {
                        a2.edit().putString("ek__id", string).commit();
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    String substring = string.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (!Character.isDigit(charAt)) {
                            sb.append(charAt);
                        } else if (Integer.parseInt(Character.toString(charAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                        }
                    }
                    f80694d = sb.toString();
                }
                if (!TextUtils.isEmpty(f80694d)) {
                    f80694d += new StringBuilder(f80694d).reverse().toString();
                    String string2 = a2.getString("ek_key", null);
                    if (TextUtils.isEmpty(string2)) {
                        a2.edit().putString("ek_key", a("umeng+")).commit();
                    } else if (!"umeng+".equals(b(string2))) {
                        a(true, false);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final w a(Context context) {
        f80693c = context;
        return b.f80701a;
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(f80694d)) {
                return str;
            }
            return Base64.encodeToString(bt.a(str.getBytes(), f80694d.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String b(String str) {
        try {
            if (TextUtils.isEmpty(f80694d)) {
                return str;
            }
            return new String(bt.b(Base64.decode(str.getBytes(), 0), f80694d.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r11) {
        /*
            r10 = this;
            r0 = 0
            android.content.Context r1 = f80693c     // Catch:{ Throwable -> 0x0156, all -> 0x0141 }
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a(r1)     // Catch:{ Throwable -> 0x0156, all -> 0x0141 }
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch:{ Throwable -> 0x0156, all -> 0x0141 }
            r1.beginTransaction()     // Catch:{ Throwable -> 0x013f, all -> 0x013c }
            java.lang.String r2 = "select *  from __et"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ Throwable -> 0x013f, all -> 0x013c }
            if (r2 == 0) goto L_0x0125
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r0.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r3.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x0020:
            boolean r4 = r2.moveToNext()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r4 == 0) goto L_0x00a0
            java.lang.String r4 = "__t"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            int r4 = r2.getInt(r4)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r5 = "__i"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r6 = "__s"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r7 = ""
            boolean r7 = r7.equals(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r7 == 0) goto L_0x0050
            java.lang.String r5 = com.umeng.analytics.pro.bd.a()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x0050:
            switch(r4) {
                case 2049: goto L_0x007a;
                case 2050: goto L_0x0054;
                default: goto L_0x0053;
            }     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x0053:
            goto L_0x0020
        L_0x0054:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r4 != 0) goto L_0x0020
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r6 = r10.b((java.lang.String) r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r4.<init>(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            boolean r6 = r3.has(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r6 == 0) goto L_0x006e
            org.json.JSONArray r6 = r3.optJSONArray(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            goto L_0x0073
        L_0x006e:
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r6.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x0073:
            r6.put(r4)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            goto L_0x0020
        L_0x007a:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r4 != 0) goto L_0x0020
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r6 = r10.b((java.lang.String) r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r4.<init>(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            boolean r6 = r0.has(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r6 == 0) goto L_0x0094
            org.json.JSONArray r6 = r0.optJSONArray(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            goto L_0x0099
        L_0x0094:
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r6.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x0099:
            r6.put(r4)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r0.put(r5, r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            goto L_0x0020
        L_0x00a0:
            int r4 = r0.length()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r4 <= 0) goto L_0x00e1
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r4.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.util.Iterator r5 = r0.keys()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x00af:
            boolean r6 = r5.hasNext()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r6 == 0) goto L_0x00d6
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r6.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.Object r7 = r5.next()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r8 = r0.optString(r7)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r6.put(r7, r9)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            int r7 = r6.length()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r7 <= 0) goto L_0x00af
            r4.put(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            goto L_0x00af
        L_0x00d6:
            int r0 = r4.length()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r0 <= 0) goto L_0x00e1
            java.lang.String r0 = "ekv"
            r11.put(r0, r4)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x00e1:
            int r0 = r3.length()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r0 <= 0) goto L_0x0125
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r0.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.util.Iterator r4 = r3.keys()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
        L_0x00f0:
            boolean r5 = r4.hasNext()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r5 == 0) goto L_0x0117
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r5.<init>()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.Object r6 = r4.next()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            java.lang.String r7 = r3.optString(r6)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r8.<init>(r7)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            r5.put(r6, r8)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            int r6 = r5.length()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r6 <= 0) goto L_0x00f0
            r0.put(r5)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            goto L_0x00f0
        L_0x0117:
            int r3 = r0.length()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r3 <= 0) goto L_0x0125
            java.lang.String r3 = "gkv"
            r11.put(r3, r0)     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            goto L_0x0125
        L_0x0123:
            r11 = move-exception
            goto L_0x0144
        L_0x0125:
            r1.setTransactionSuccessful()     // Catch:{ Throwable -> 0x013a, all -> 0x0123 }
            if (r2 == 0) goto L_0x012d
            r2.close()
        L_0x012d:
            r1.endTransaction()
            android.content.Context r11 = f80693c
            com.umeng.analytics.pro.u r11 = com.umeng.analytics.pro.u.a(r11)
            r11.b()
            return
        L_0x013a:
            r0 = r2
            goto L_0x0157
        L_0x013c:
            r11 = move-exception
            r2 = r0
            goto L_0x0144
        L_0x013f:
            goto L_0x0157
        L_0x0141:
            r11 = move-exception
            r1 = r0
            r2 = r1
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            r2.close()
        L_0x0149:
            r1.endTransaction()
            android.content.Context r0 = f80693c
            com.umeng.analytics.pro.u r0 = com.umeng.analytics.pro.u.a(r0)
            r0.b()
            throw r11
        L_0x0156:
            r1 = r0
        L_0x0157:
            if (r0 == 0) goto L_0x012d
            r0.close()
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.w.a(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(org.json.JSONObject r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = f80693c     // Catch:{ Throwable -> 0x007d, all -> 0x0068 }
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a(r1)     // Catch:{ Throwable -> 0x007d, all -> 0x0068 }
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch:{ Throwable -> 0x007d, all -> 0x0068 }
            r1.beginTransaction()     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            java.lang.String r2 = "select *  from __er"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            if (r2 == 0) goto L_0x004c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            r0.<init>()     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
        L_0x001b:
            boolean r3 = r2.moveToNext()     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = "__a"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            if (r4 != 0) goto L_0x001b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            java.lang.String r3 = r5.b((java.lang.String) r3)     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            r0.put(r4)     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            goto L_0x001b
        L_0x003e:
            int r3 = r0.length()     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            if (r3 <= 0) goto L_0x004c
            java.lang.String r3 = "error"
            r6.put(r3, r0)     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            goto L_0x004c
        L_0x004a:
            r6 = move-exception
            goto L_0x006b
        L_0x004c:
            r1.setTransactionSuccessful()     // Catch:{ Throwable -> 0x0061, all -> 0x004a }
            if (r2 == 0) goto L_0x0054
            r2.close()
        L_0x0054:
            r1.endTransaction()
            android.content.Context r6 = f80693c
            com.umeng.analytics.pro.u r6 = com.umeng.analytics.pro.u.a(r6)
            r6.b()
            return
        L_0x0061:
            r0 = r2
            goto L_0x007e
        L_0x0063:
            r6 = move-exception
            r2 = r0
            goto L_0x006b
        L_0x0066:
            goto L_0x007e
        L_0x0068:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.close()
        L_0x0070:
            r1.endTransaction()
            android.content.Context r0 = f80693c
            com.umeng.analytics.pro.u r0 = com.umeng.analytics.pro.u.a(r0)
            r0.b()
            throw r6
        L_0x007d:
            r1 = r0
        L_0x007e:
            if (r0 == 0) goto L_0x0054
            r0.close()
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.w.b(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(org.json.JSONObject r15) {
        /*
            r14 = this;
            r0 = 0
            android.content.Context r1 = f80693c     // Catch:{ Throwable -> 0x014a, all -> 0x0135 }
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a(r1)     // Catch:{ Throwable -> 0x014a, all -> 0x0135 }
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch:{ Throwable -> 0x014a, all -> 0x0135 }
            r1.beginTransaction()     // Catch:{ Throwable -> 0x0133, all -> 0x0130 }
            java.lang.String r2 = "select *  from __sd"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ Throwable -> 0x0133, all -> 0x0130 }
            if (r2 == 0) goto L_0x0119
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r0.<init>()     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.util.List<java.lang.String> r3 = r14.h     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r3.clear()     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
        L_0x0020:
            boolean r3 = r2.moveToNext()     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r3 == 0) goto L_0x010b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r3.<init>()     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r4 = "__f"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r5 = "__e"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r6 != 0) goto L_0x0020
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r6 != 0) goto L_0x0020
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r10 = 0
            long r6 = r6 - r8
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0020
            java.lang.String r6 = "__a"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r7 = "__b"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r8 = "__c"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r9 = "__d"
            int r9 = r2.getColumnIndex(r9)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r9 = r2.getString(r9)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r10 = "__ii"
            int r10 = r2.getColumnIndex(r10)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r10 = r2.getString(r10)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.util.List<java.lang.String> r11 = r14.h     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r11.add(r10)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r11 = "id"
            r3.put(r11, r10)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r10 = "start_time"
            r3.put(r10, r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r10 = "end_time"
            r3.put(r10, r4)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r10 = "duration"
            long r11 = java.lang.Long.parseLong(r4)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r13 = 0
            long r11 = r11 - r4
            r3.put(r10, r11)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r4 != 0) goto L_0x00c4
            java.lang.String r4 = "pages"
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r6 = r14.b((java.lang.String) r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
        L_0x00c4:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r4 != 0) goto L_0x00d8
            java.lang.String r4 = "autopages"
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r6 = r14.b((java.lang.String) r7)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
        L_0x00d8:
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r4 != 0) goto L_0x00ec
            java.lang.String r4 = "traffic"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r6 = r14.b((java.lang.String) r8)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
        L_0x00ec:
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r4 != 0) goto L_0x0100
            java.lang.String r4 = "locations"
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            java.lang.String r6 = r14.b((java.lang.String) r9)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
        L_0x0100:
            int r4 = r3.length()     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r4 <= 0) goto L_0x0020
            r0.put(r3)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            goto L_0x0020
        L_0x010b:
            int r3 = r0.length()     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r3 <= 0) goto L_0x0119
            java.lang.String r3 = "sessions"
            r15.put(r3, r0)     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            goto L_0x0119
        L_0x0117:
            r15 = move-exception
            goto L_0x0138
        L_0x0119:
            r1.setTransactionSuccessful()     // Catch:{ Throwable -> 0x012e, all -> 0x0117 }
            if (r2 == 0) goto L_0x0121
            r2.close()
        L_0x0121:
            r1.endTransaction()
            android.content.Context r15 = f80693c
            com.umeng.analytics.pro.u r15 = com.umeng.analytics.pro.u.a(r15)
            r15.b()
            return
        L_0x012e:
            r0 = r2
            goto L_0x014b
        L_0x0130:
            r15 = move-exception
            r2 = r0
            goto L_0x0138
        L_0x0133:
            goto L_0x014b
        L_0x0135:
            r15 = move-exception
            r1 = r0
            r2 = r1
        L_0x0138:
            if (r2 == 0) goto L_0x013d
            r2.close()
        L_0x013d:
            r1.endTransaction()
            android.content.Context r0 = f80693c
            com.umeng.analytics.pro.u r0 = com.umeng.analytics.pro.u.a(r0)
            r0.b()
            throw r15
        L_0x014a:
            r1 = r0
        L_0x014b:
            if (r0 == 0) goto L_0x0121
            r0.close()
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.w.c(org.json.JSONObject):void");
    }

    public void a(JSONArray jSONArray) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = u.a(f80693c).a();
            try {
                sQLiteDatabase.beginTransaction();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        ContentValues contentValues = new ContentValues();
                        String optString = jSONObject.optString("__i");
                        if (TextUtils.isEmpty(optString)) {
                            optString = bd.g(f80693c);
                            if (TextUtils.isEmpty(optString)) {
                                optString = "";
                            }
                        }
                        contentValues.put("__i", optString);
                        contentValues.put("__e", jSONObject.optString("id"));
                        contentValues.put("__t", Integer.valueOf(jSONObject.optInt("__t")));
                        jSONObject.remove("__i");
                        jSONObject.remove("__t");
                        contentValues.put("__s", a(jSONObject.toString()));
                        sQLiteDatabase.insert("__et", null, contentValues);
                    } catch (Exception unused) {
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase.endTransaction();
                u.a(f80693c).b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            sQLiteDatabase.endTransaction();
            u.a(f80693c).b();
            throw th;
        }
        u.a(f80693c).b();
    }

    public void a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = u.a(f80693c).a();
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("delete from __er");
                sQLiteDatabase.execSQL("delete from __et");
                if (!z2) {
                    if (this.h.size() > 0) {
                        for (int i = 0; i < this.h.size(); i++) {
                            sQLiteDatabase.execSQL("delete from __sd where __ii=\"" + this.h.get(i) + "\"");
                        }
                    }
                    this.h.clear();
                } else if (z) {
                    sQLiteDatabase.execSQL("delete from __sd");
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase.endTransaction();
                u.a(f80693c).b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            sQLiteDatabase.endTransaction();
            u.a(f80693c).b();
            throw th;
        }
        u.a(f80693c).b();
    }

    public boolean a(String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = u.a(f80693c).a();
            try {
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("__i", str);
                String a2 = a(str2);
                if (!TextUtils.isEmpty(a2)) {
                    contentValues.put("__a", a2);
                    contentValues.put("__t", Integer.valueOf(i));
                    sQLiteDatabase.insert("__er", null, contentValues);
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase.endTransaction();
                u.a(f80693c).b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            sQLiteDatabase.endTransaction();
            u.a(f80693c).b();
            throw th;
        }
        u.a(f80693c).b();
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017b, code lost:
        if (r1 != 0) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0199, code lost:
        if (r1 == 0) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019b, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019e, code lost:
        r2.endTransaction();
        com.umeng.analytics.pro.u.a(f80693c).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01aa, code lost:
        return false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.w.a r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            android.content.Context r2 = f80693c     // Catch:{ Throwable -> 0x0198, all -> 0x0183 }
            com.umeng.analytics.pro.u r2 = com.umeng.analytics.pro.u.a(r2)     // Catch:{ Throwable -> 0x0198, all -> 0x0183 }
            android.database.sqlite.SQLiteDatabase r2 = r2.a()     // Catch:{ Throwable -> 0x0198, all -> 0x0183 }
            r2.beginTransaction()     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            com.umeng.analytics.pro.w$a r3 = com.umeng.analytics.pro.w.a.BEGIN     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            if (r9 != r3) goto L_0x003c
            java.lang.String r9 = "__e"
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            long r8 = r8.longValue()     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            r3.<init>()     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r4 = "__ii"
            r3.put(r4, r7)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r7 = "__e"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            r3.put(r7, r8)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r7 = "__sd"
            r2.insert(r7, r1, r3)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            goto L_0x0178
        L_0x003c:
            com.umeng.analytics.pro.w$a r3 = com.umeng.analytics.pro.w.a.END     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            if (r9 != r3) goto L_0x0071
            java.lang.String r9 = "__f"
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            long r8 = r8.longValue()     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r4 = "update __sd set __f=\""
            r3.<init>(r4)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            r3.append(r8)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r8 = "\" where __ii"
            r3.append(r8)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r8 = "=\""
            r3.append(r8)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            r3.append(r7)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r7 = "\""
            r3.append(r7)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r7 = r3.toString()     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            r2.execSQL(r7)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            goto L_0x0178
        L_0x0071:
            com.umeng.analytics.pro.w$a r3 = com.umeng.analytics.pro.w.a.PAGE     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            if (r9 != r3) goto L_0x007c
            java.lang.String r9 = "__a"
            r6.a(r7, r8, r2, r9)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            goto L_0x0178
        L_0x007c:
            com.umeng.analytics.pro.w$a r3 = com.umeng.analytics.pro.w.a.AUTOPAGE     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            if (r9 != r3) goto L_0x0087
            java.lang.String r9 = "__b"
            r6.a(r7, r8, r2, r9)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            goto L_0x0178
        L_0x0087:
            com.umeng.analytics.pro.w$a r3 = com.umeng.analytics.pro.w.a.NEWSESSION     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            if (r9 != r3) goto L_0x0178
            java.lang.String r9 = "__d"
            org.json.JSONObject r9 = r8.getJSONObject(r9)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0093
        L_0x0092:
            r9 = r1
        L_0x0093:
            if (r9 == 0) goto L_0x00c3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r4 = "select __d from __sd where __ii=\""
            r3.<init>(r4)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            r3.append(r7)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r4 = "\""
            r3.append(r4)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            android.database.Cursor r3 = r2.rawQuery(r3, r1)     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            if (r3 == 0) goto L_0x00c4
        L_0x00ae:
            boolean r4 = r3.moveToNext()     // Catch:{ Throwable -> 0x0175, all -> 0x010b }
            if (r4 == 0) goto L_0x00c4
            java.lang.String r1 = "__d"
            int r1 = r3.getColumnIndex(r1)     // Catch:{ Throwable -> 0x0175, all -> 0x010b }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ Throwable -> 0x0175, all -> 0x010b }
            java.lang.String r1 = r6.b((java.lang.String) r1)     // Catch:{ Throwable -> 0x0175, all -> 0x010b }
            goto L_0x00ae
        L_0x00c3:
            r3 = r1
        L_0x00c4:
            if (r9 == 0) goto L_0x010e
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x010e }
            r4.<init>()     // Catch:{ Exception -> 0x010e }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x010e }
            if (r5 != 0) goto L_0x00d6
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x010e }
            r4.<init>(r1)     // Catch:{ Exception -> 0x010e }
        L_0x00d6:
            r4.put(r9)     // Catch:{ Exception -> 0x010e }
            java.lang.String r9 = r4.toString()     // Catch:{ Exception -> 0x010e }
            java.lang.String r9 = r6.a((java.lang.String) r9)     // Catch:{ Exception -> 0x010e }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x010e }
            if (r1 != 0) goto L_0x010e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
            java.lang.String r4 = "update  __sd set __d=\""
            r1.<init>(r4)     // Catch:{ Exception -> 0x010e }
            r1.append(r9)     // Catch:{ Exception -> 0x010e }
            java.lang.String r9 = "\" where __ii"
            r1.append(r9)     // Catch:{ Exception -> 0x010e }
            java.lang.String r9 = "=\""
            r1.append(r9)     // Catch:{ Exception -> 0x010e }
            r1.append(r7)     // Catch:{ Exception -> 0x010e }
            java.lang.String r9 = "\""
            r1.append(r9)     // Catch:{ Exception -> 0x010e }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x010e }
            r2.execSQL(r9)     // Catch:{ Exception -> 0x010e }
            goto L_0x010e
        L_0x010b:
            r7 = move-exception
            goto L_0x0186
        L_0x010e:
            java.lang.String r9 = "__c"
            org.json.JSONObject r9 = r8.getJSONObject(r9)     // Catch:{ Exception -> 0x0147 }
            if (r9 == 0) goto L_0x0147
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r9 = r6.a((java.lang.String) r9)     // Catch:{ Exception -> 0x0147 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0147 }
            if (r1 != 0) goto L_0x0147
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            java.lang.String r4 = "update  __sd set __c=\""
            r1.<init>(r4)     // Catch:{ Exception -> 0x0147 }
            r1.append(r9)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r9 = "\" where __ii"
            r1.append(r9)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r9 = "=\""
            r1.append(r9)     // Catch:{ Exception -> 0x0147 }
            r1.append(r7)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r9 = "\""
            r1.append(r9)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0147 }
            r2.execSQL(r9)     // Catch:{ Exception -> 0x0147 }
        L_0x0147:
            java.lang.String r9 = "__f"
            long r8 = r8.getLong(r9)     // Catch:{ Exception -> 0x0177 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0177 }
            java.lang.String r4 = "update  __sd set __f=\""
            r1.<init>(r4)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0177 }
            r1.append(r8)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r8 = "\" where __ii"
            r1.append(r8)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r8 = "=\""
            r1.append(r8)     // Catch:{ Exception -> 0x0177 }
            r1.append(r7)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r7 = "\""
            r1.append(r7)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x0177 }
            r2.execSQL(r7)     // Catch:{ Exception -> 0x0177 }
            goto L_0x0177
        L_0x0175:
            r1 = r3
            goto L_0x0199
        L_0x0177:
            r1 = r3
        L_0x0178:
            r2.setTransactionSuccessful()     // Catch:{ Throwable -> 0x017e, all -> 0x0180 }
            if (r1 == 0) goto L_0x019e
            goto L_0x019b
        L_0x017e:
            goto L_0x0199
        L_0x0180:
            r7 = move-exception
            r3 = r1
            goto L_0x0186
        L_0x0183:
            r7 = move-exception
            r2 = r1
            r3 = r2
        L_0x0186:
            if (r3 == 0) goto L_0x018b
            r3.close()
        L_0x018b:
            r2.endTransaction()
            android.content.Context r8 = f80693c
            com.umeng.analytics.pro.u r8 = com.umeng.analytics.pro.u.a(r8)
            r8.b()
            throw r7
        L_0x0198:
            r2 = r1
        L_0x0199:
            if (r1 == 0) goto L_0x019e
        L_0x019b:
            r1.close()
        L_0x019e:
            r2.endTransaction()
            android.content.Context r7 = f80693c
            com.umeng.analytics.pro.u r7 = com.umeng.analytics.pro.u.a(r7)
            r7.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.w.a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.w$a):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r5, org.json.JSONObject r6, android.database.sqlite.SQLiteDatabase r7, java.lang.String r8) throws org.json.JSONException {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            java.lang.String r2 = "select "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            r1.append(r8)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            java.lang.String r2 = " from __sd"
            r1.append(r2)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            java.lang.String r2 = " where __ii"
            r1.append(r2)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            java.lang.String r2 = "=\""
            r1.append(r2)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            r1.append(r5)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            android.database.Cursor r1 = r7.rawQuery(r1, r0)     // Catch:{ Throwable -> 0x009d, all -> 0x0095 }
            if (r1 == 0) goto L_0x0041
        L_0x002c:
            boolean r2 = r1.moveToNext()     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            if (r2 == 0) goto L_0x0041
            int r0 = r1.getColumnIndex(r8)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r0 = r4.b((java.lang.String) r0)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            goto L_0x002c
        L_0x003f:
            r5 = move-exception
            goto L_0x0097
        L_0x0041:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            r2.<init>()     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            if (r3 != 0) goto L_0x0051
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
        L_0x0051:
            r2.put(r6)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r6 = r2.toString()     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r6 = r4.a((java.lang.String) r6)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            if (r0 != 0) goto L_0x008d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r2 = "update __sd set "
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            r0.append(r8)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r8 = "=\""
            r0.append(r8)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            r0.append(r6)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r6 = "\" where __ii"
            r0.append(r6)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r6 = "=\""
            r0.append(r6)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            r0.append(r5)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r5 = "\""
            r0.append(r5)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
            r7.execSQL(r5)     // Catch:{ Throwable -> 0x0093, all -> 0x003f }
        L_0x008d:
            if (r1 == 0) goto L_0x00a3
            r1.close()
            return
        L_0x0093:
            r0 = r1
            goto L_0x009d
        L_0x0095:
            r5 = move-exception
            r1 = r0
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r1.close()
        L_0x009c:
            throw r5
        L_0x009d:
            if (r0 == 0) goto L_0x00a3
            r0.close()
            return
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.w.a(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase, java.lang.String):void");
    }
}
