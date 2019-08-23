package com.hianalytics.android.v1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.hianalytics.android.a.a.a;
import com.hianalytics.android.a.a.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f24920a;

    /* renamed from: b  reason: collision with root package name */
    private int f24921b;

    /* renamed from: c  reason: collision with root package name */
    private long f24922c;

    public d(Context context, int i, long j) {
        this.f24920a = context;
        this.f24921b = i;
        this.f24922c = j;
    }

    private static void a(Context context, SharedPreferences sharedPreferences, long j) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String b2 = a.b(((TelephonyManager) context.getSystemService("phone")).getDeviceId());
        String valueOf = String.valueOf(String.valueOf(j) + b2);
        edit.remove("session_id");
        edit.remove("refer_id");
        edit.putString("session_id", valueOf);
        edit.putString("refer_id", "");
        edit.putLong("end_millis", j);
        edit.commit();
    }

    private void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("last_millis", this.f24922c);
        edit.commit();
    }

    private void b(SharedPreferences sharedPreferences) {
        String str;
        boolean z;
        long currentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        Context context = this.f24920a;
        StringBuffer stringBuffer = new StringBuffer("");
        SharedPreferences a2 = c.a(context, "sessioncontext");
        String string = a2.getString("session_id", "");
        if ("".equals(string)) {
            String b2 = a.b(((TelephonyManager) context.getSystemService("phone")).getDeviceId());
            string = String.valueOf(String.valueOf(System.currentTimeMillis()) + b2);
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("session_id", string);
            edit.putLong("end_millis", currentTimeMillis);
            edit.commit();
        }
        String string2 = a2.getString("refer_id", "");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            a.h();
            str = null;
        } else {
            stringBuffer.append(a.c(context)[0]);
            stringBuffer.append(",");
            stringBuffer.append(telephonyManager.getNetworkOperatorName().replace(',', '&'));
            stringBuffer.append(",");
            stringBuffer.append(string);
            stringBuffer.append(",");
            stringBuffer.append(string2);
            str = stringBuffer.toString();
        }
        if (str != null) {
            try {
                if (sharedPreferences.getString("activities", "").trim().length() > 0) {
                    String[] split = sharedPreferences.getString("activities", "").split(";");
                    JSONArray jSONArray = new JSONArray();
                    for (String put : split) {
                        jSONArray.put(put);
                    }
                    jSONObject.put("b", jSONArray);
                    z = false;
                } else {
                    z = true;
                }
                if (sharedPreferences.getString("events", "").trim().length() > 0) {
                    String[] split2 = sharedPreferences.getString("events", "").split(";");
                    JSONArray jSONArray2 = new JSONArray();
                    for (String put2 : split2) {
                        jSONArray2.put(put2);
                    }
                    jSONObject.put("e", jSONArray2);
                    z = false;
                }
                jSONObject.put("h", str);
                jSONObject.put("type", "termination");
                Handler f2 = a.f();
                if (f2 != null) {
                    f2.post(new c(this.f24920a, jSONObject, z));
                }
                a.h();
            } catch (JSONException unused) {
            }
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString("activities", "");
        edit2.remove("events");
        edit2.commit();
    }

    private boolean c(SharedPreferences sharedPreferences) {
        return this.f24922c - sharedPreferences.getLong("last_millis", -1) > a.a().longValue() * 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a A[Catch:{ Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0109 A[Catch:{ Exception -> 0x013a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f24920a     // Catch:{ Exception -> 0x013a }
            long r1 = r15.f24922c     // Catch:{ Exception -> 0x013a }
            java.lang.String r3 = "sessioncontext"
            android.content.SharedPreferences r3 = com.hianalytics.android.a.a.c.a(r0, r3)     // Catch:{ Exception -> 0x013a }
            java.lang.String r4 = "session_id"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.getString(r4, r5)     // Catch:{ Exception -> 0x013a }
            java.lang.String r5 = ""
            boolean r4 = r5.equals(r4)     // Catch:{ Exception -> 0x013a }
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 0
            if (r4 == 0) goto L_0x0022
        L_0x001e:
            a(r0, r3, r1)     // Catch:{ Exception -> 0x013a }
            goto L_0x0046
        L_0x0022:
            java.lang.String r4 = "end_millis"
            long r9 = r3.getLong(r4, r7)     // Catch:{ Exception -> 0x013a }
            r4 = 0
            long r9 = r1 - r9
            java.lang.Long r4 = com.hianalytics.android.a.a.a.c()     // Catch:{ Exception -> 0x013a }
            long r11 = r4.longValue()     // Catch:{ Exception -> 0x013a }
            long r11 = r11 * r5
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x003a
            goto L_0x001e
        L_0x003a:
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ Exception -> 0x013a }
            java.lang.String r3 = "end_millis"
            r0.putLong(r3, r1)     // Catch:{ Exception -> 0x013a }
            r0.commit()     // Catch:{ Exception -> 0x013a }
        L_0x0046:
            int r0 = r15.f24921b     // Catch:{ Exception -> 0x013a }
            if (r0 != 0) goto L_0x0109
            android.content.Context r0 = r15.f24920a     // Catch:{ Exception -> 0x013a }
            android.content.Context r1 = r15.f24920a     // Catch:{ Exception -> 0x013a }
            if (r1 == r0) goto L_0x0054
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x013a }
            return
        L_0x0054:
            r15.f24920a = r0     // Catch:{ Exception -> 0x013a }
            java.lang.String r1 = "state"
            android.content.SharedPreferences r1 = com.hianalytics.android.a.a.c.a(r0, r1)     // Catch:{ Exception -> 0x013a }
            if (r1 == 0) goto L_0x0108
            java.lang.String r2 = "last_millis"
            r3 = -1
            long r9 = r1.getLong(r2, r3)     // Catch:{ Exception -> 0x013a }
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x006f
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x013a }
            goto L_0x00ef
        L_0x006f:
            long r2 = r15.f24922c     // Catch:{ Exception -> 0x013a }
            r4 = 0
            long r2 = r2 - r9
            java.lang.String r4 = "duration"
            long r7 = r1.getLong(r4, r7)     // Catch:{ Exception -> 0x013a }
            android.content.SharedPreferences$Editor r4 = r1.edit()     // Catch:{ Exception -> 0x013a }
            java.lang.String r11 = "activities"
            java.lang.String r12 = ""
            java.lang.String r11 = r1.getString(r11, r12)     // Catch:{ Exception -> 0x013a }
            java.lang.Class r12 = r0.getClass()     // Catch:{ Exception -> 0x013a }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x013a }
            java.lang.String r13 = ""
            boolean r13 = r13.equals(r11)     // Catch:{ Exception -> 0x013a }
            if (r13 != 0) goto L_0x00a7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x013a }
            r13.<init>(r11)     // Catch:{ Exception -> 0x013a }
            java.lang.String r11 = ";"
            r13.append(r11)     // Catch:{ Exception -> 0x013a }
            java.lang.String r11 = r13.toString()     // Catch:{ Exception -> 0x013a }
        L_0x00a7:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x013a }
            r13.<init>(r11)     // Catch:{ Exception -> 0x013a }
            r13.append(r12)     // Catch:{ Exception -> 0x013a }
            java.lang.String r11 = ","
            r13.append(r11)     // Catch:{ Exception -> 0x013a }
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x013a }
            java.lang.String r12 = "yyyyMMddHHmmssSSS"
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ Exception -> 0x013a }
            r11.<init>(r12, r14)     // Catch:{ Exception -> 0x013a }
            java.util.Date r12 = new java.util.Date     // Catch:{ Exception -> 0x013a }
            r12.<init>(r9)     // Catch:{ Exception -> 0x013a }
            java.lang.String r9 = r11.format(r12)     // Catch:{ Exception -> 0x013a }
            r13.append(r9)     // Catch:{ Exception -> 0x013a }
            java.lang.String r9 = ","
            r13.append(r9)     // Catch:{ Exception -> 0x013a }
            long r5 = r2 / r5
            r13.append(r5)     // Catch:{ Exception -> 0x013a }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x013a }
            java.lang.String r6 = "activities"
            r4.remove(r6)     // Catch:{ Exception -> 0x013a }
            java.lang.String r6 = "activities"
            r4.putString(r6, r5)     // Catch:{ Exception -> 0x013a }
            java.lang.String r5 = "duration"
            r6 = 0
            long r7 = r7 + r2
            r4.putLong(r5, r7)     // Catch:{ Exception -> 0x013a }
            r4.commit()     // Catch:{ Exception -> 0x013a }
        L_0x00ef:
            boolean r2 = r15.c(r1)     // Catch:{ Exception -> 0x013a }
            if (r2 == 0) goto L_0x00fc
            r15.b(r1)     // Catch:{ Exception -> 0x013a }
            r15.a(r1)     // Catch:{ Exception -> 0x013a }
            return
        L_0x00fc:
            boolean r0 = com.hianalytics.android.a.a.a.d((android.content.Context) r0)     // Catch:{ Exception -> 0x013a }
            if (r0 == 0) goto L_0x0108
            r15.b(r1)     // Catch:{ Exception -> 0x013a }
            r15.a(r1)     // Catch:{ Exception -> 0x013a }
        L_0x0108:
            return
        L_0x0109:
            int r0 = r15.f24921b     // Catch:{ Exception -> 0x013a }
            r1 = 1
            if (r0 != r1) goto L_0x0127
            android.content.Context r0 = r15.f24920a     // Catch:{ Exception -> 0x013a }
            r15.f24920a = r0     // Catch:{ Exception -> 0x013a }
            java.lang.String r1 = "state"
            android.content.SharedPreferences r0 = com.hianalytics.android.a.a.c.a(r0, r1)     // Catch:{ Exception -> 0x013a }
            if (r0 == 0) goto L_0x0126
            boolean r1 = r15.c(r0)     // Catch:{ Exception -> 0x013a }
            if (r1 == 0) goto L_0x0126
            r15.b(r0)     // Catch:{ Exception -> 0x013a }
            r15.a(r0)     // Catch:{ Exception -> 0x013a }
        L_0x0126:
            return
        L_0x0127:
            int r0 = r15.f24921b     // Catch:{ Exception -> 0x013a }
            r1 = 2
            if (r0 != r1) goto L_0x014c
            android.content.Context r0 = r15.f24920a     // Catch:{ Exception -> 0x013a }
            java.lang.String r1 = "state"
            android.content.SharedPreferences r0 = com.hianalytics.android.a.a.c.a(r0, r1)     // Catch:{ Exception -> 0x013a }
            if (r0 == 0) goto L_0x0139
            r15.b(r0)     // Catch:{ Exception -> 0x013a }
        L_0x0139:
            return
        L_0x013a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SessionThread.run() throw exception:"
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            com.hianalytics.android.a.a.a.h()
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hianalytics.android.v1.d.run():void");
    }
}
