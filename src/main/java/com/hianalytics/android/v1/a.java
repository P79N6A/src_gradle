package com.hianalytics.android.v1;

import android.content.Context;
import android.content.SharedPreferences;
import com.hianalytics.android.a.a.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f24912a;

    /* renamed from: b  reason: collision with root package name */
    private String f24913b;

    /* renamed from: c  reason: collision with root package name */
    private String f24914c;

    /* renamed from: d  reason: collision with root package name */
    private long f24915d;

    public a(Context context, String str, String str2, long j) {
        this.f24912a = context;
        this.f24913b = str.replace(",", "^");
        this.f24914c = str2.replace(",", "^");
        this.f24915d = j;
    }

    public final void run() {
        try {
            SharedPreferences a2 = c.a(this.f24912a, "state");
            if (a2 == null) {
                com.hianalytics.android.a.a.a.h();
                return;
            }
            String string = a2.getString("events", "");
            if (!"".equals(string)) {
                string = String.valueOf(string) + ";";
            }
            String str = String.valueOf(string) + this.f24913b + "," + this.f24914c + "," + new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.US).format(new Date(this.f24915d));
            int length = str.split(";").length;
            if (length <= com.hianalytics.android.a.a.a.d()) {
                SharedPreferences.Editor edit = a2.edit();
                edit.remove("events");
                edit.putString("events", str);
                edit.commit();
                " current event record is：".concat(String.valueOf(length));
                com.hianalytics.android.a.a.a.h();
            }
            if (com.hianalytics.android.a.a.a.d(this.f24912a)) {
                if (com.hianalytics.android.a.a.a.e()) {
                    com.hianalytics.android.a.a.a.h();
                    HiAnalytics.onReport(this.f24912a);
                    return;
                }
                a2.edit().remove("events").commit();
            }
        } catch (Exception e2) {
            new StringBuilder("EventThread.run() throw exception:").append(e2.getMessage());
            com.hianalytics.android.a.a.a.h();
        }
    }
}
