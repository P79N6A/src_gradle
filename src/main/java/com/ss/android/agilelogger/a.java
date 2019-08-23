package com.ss.android.agilelogger;

import android.content.Context;
import android.support.annotation.NonNull;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f27859a;

    /* renamed from: b  reason: collision with root package name */
    public int f27860b;

    /* renamed from: c  reason: collision with root package name */
    public String f27861c;

    /* renamed from: d  reason: collision with root package name */
    public String f27862d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27863e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27864f;
    public int g;
    public int h;

    /* renamed from: com.ss.android.agilelogger.a$a  reason: collision with other inner class name */
    public static class C0323a {

        /* renamed from: a  reason: collision with root package name */
        public int f27865a = com.ss.android.agilelogger.a.a.f27873c;

        /* renamed from: b  reason: collision with root package name */
        public int f27866b = com.ss.android.agilelogger.a.a.f27871a;

        /* renamed from: c  reason: collision with root package name */
        public int f27867c = 20480;

        /* renamed from: d  reason: collision with root package name */
        public int f27868d = 3;

        /* renamed from: e  reason: collision with root package name */
        public String f27869e;

        /* renamed from: f  reason: collision with root package name */
        public String f27870f;
        public boolean g = true;
        public boolean h = true;

        public C0323a(@NonNull Context context) {
            if (context != null) {
                ALog.setContext(context.getApplicationContext());
                return;
            }
            throw new RuntimeException("context must not be null");
        }
    }

    private a() {
        this.g = 3;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
