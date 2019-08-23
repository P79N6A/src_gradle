package com.bytedance.apm.battery.b;

import android.support.annotation.WorkerThread;
import com.bytedance.apm.c;
import org.json.JSONObject;

public final class b {
    int A;
    int B;
    long C;

    /* renamed from: a  reason: collision with root package name */
    public long f18917a;

    /* renamed from: b  reason: collision with root package name */
    public long f18918b;

    /* renamed from: c  reason: collision with root package name */
    public int f18919c;

    /* renamed from: d  reason: collision with root package name */
    public int f18920d;

    /* renamed from: e  reason: collision with root package name */
    public long f18921e;

    /* renamed from: f  reason: collision with root package name */
    public long f18922f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o = true;
    public String p;
    public String q;
    long r;
    long s;
    int t;
    int u;
    int v;
    int w;
    long x;
    int y;
    int z;

    public final boolean b() {
        if (this.f18917a > 60000) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f18918b > 60000) {
            return true;
        }
        return false;
    }

    public final void a() {
        this.f18917a = 0;
        this.f18918b = 0;
        this.f18919c = 0;
        this.f18920d = 0;
        this.f18921e = 0;
        this.f18922f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = true;
        this.p = "";
        this.q = "";
    }

    @WorkerThread
    public final boolean a(boolean z2) throws Exception {
        boolean z3;
        JSONObject jSONObject = new JSONObject();
        if (b()) {
            jSONObject.put("front_alarm", this.h);
            jSONObject.put("front_location_p_time", this.f18922f / 1000);
            jSONObject.put("front_power_p_time", this.g / 1000);
            if (this.f18921e >= 0) {
                jSONObject.put("front_cpu_active_time_p_time", this.f18921e / 1000);
                if (this.i >= 0) {
                    if (!z2) {
                        jSONObject.put("front_traffic_p_capacity", this.i / 1024);
                    }
                    double d2 = (double) this.h;
                    Double.isNaN(d2);
                    double d3 = (double) this.f18921e;
                    Double.isNaN(d3);
                    double d4 = (d2 * 0.002083333383779973d) + (d3 * 6.944444612599909E-5d);
                    double d5 = (double) this.f18922f;
                    Double.isNaN(d5);
                    double d6 = d4 + (d5 * 7.499999810534064E-6d);
                    double d7 = (double) this.g;
                    Double.isNaN(d7);
                    double d8 = d6 + (d7 * 6.944444521650439E-6d);
                    if (!z2) {
                        double d9 = (double) this.i;
                        Double.isNaN(d9);
                        d8 += d9 * 5.464481073431671E-4d;
                    }
                    if (d8 >= 0.0d) {
                        jSONObject.put("front_score", d8);
                        jSONObject.put("front_p_time", this.f18917a / 1000);
                        float f2 = 60000.0f / ((float) this.f18917a);
                        jSONObject.put("front_alarm_per_min", (double) (((float) this.h) * f2));
                        jSONObject.put("front_location_per_min_p_time", (double) (((float) (this.f18922f / 1000)) * f2));
                        jSONObject.put("front_power_per_min_p_time", (double) (((float) (this.g / 1000)) * f2));
                        jSONObject.put("front_cpu_active_time_per_min_p_time", (double) (((float) (this.f18921e / 1000)) * f2));
                        if (!z2) {
                            jSONObject.put("front_traffic_per_min_p_capacity", (double) (((float) (this.i / 1024)) * f2));
                        }
                        double d10 = (double) f2;
                        Double.isNaN(d10);
                        jSONObject.put("front_score_per_min", d8 * d10);
                        if (z2) {
                            this.t = (int) (((long) this.t) + this.h);
                            this.w = (int) (((long) this.w) + this.f18921e);
                            this.u = (int) (((long) this.u) + this.f18922f);
                            this.v = (int) (((long) this.v) + this.g);
                            if (this.o) {
                                this.x = this.i;
                            }
                            if (this.o) {
                                this.r = this.f18917a;
                            }
                        }
                    } else if (c.d()) {
                        new String[1][0] = " report data invalid, frontScore < 0 : " + d8;
                    }
                } else if (c.d()) {
                    new String[1][0] = " report data invalid, mFrontTrafficBytes < 0 : " + this.i;
                }
            } else if (c.d()) {
                new String[1][0] = " report data invalid, frontCpuMs < 0 : " + this.f18921e;
            }
            z3 = false;
            if (!z3 && c.d()) {
                new String[1][0] = "stats report failed, processName: " + this.p;
            }
            a();
            return z3;
        }
        if (c()) {
            jSONObject.put("back_alarm", this.m);
            jSONObject.put("back_location_p_time", this.k / 1000);
            jSONObject.put("back_power_p_time", this.l / 1000);
            if (this.j >= 0) {
                jSONObject.put("back_cpu_active_time_p_time", this.j / 1000);
                if (this.n >= 0) {
                    if (!z2) {
                        jSONObject.put("back_traffic_p_capacity", this.n / 1024);
                    }
                    double d11 = (double) this.m;
                    Double.isNaN(d11);
                    double d12 = (double) this.j;
                    Double.isNaN(d12);
                    double d13 = (d11 * 0.002083333383779973d) + (d12 * 6.944444612599909E-5d);
                    double d14 = (double) this.k;
                    Double.isNaN(d14);
                    double d15 = d13 + (d14 * 7.499999810534064E-6d);
                    double d16 = (double) this.l;
                    Double.isNaN(d16);
                    double d17 = d15 + (d16 * 6.944444521650439E-6d);
                    if (!z2) {
                        double d18 = (double) this.n;
                        Double.isNaN(d18);
                        d17 += d18 * 5.464481073431671E-4d;
                    }
                    jSONObject.put("back_score", d17);
                    jSONObject.put("back_p_time", this.f18918b / 1000);
                    float f3 = 60000.0f / ((float) this.f18918b);
                    jSONObject.put("back_alarm_per_min", (double) (((float) this.m) * f3));
                    jSONObject.put("back_location_per_min_p_time", (double) (((float) (this.k / 1000)) * f3));
                    jSONObject.put("back_power_per_min_p_time", (double) (((float) (this.l / 1000)) * f3));
                    jSONObject.put("back_cpu_active_time_per_min_p_time", (double) (((float) (this.j / 1000)) * f3));
                    if (!z2) {
                        jSONObject.put("back_traffic_per_min_p_capacity", (double) (((float) (this.n / 1024)) * f3));
                    }
                    double d19 = (double) f3;
                    Double.isNaN(d19);
                    jSONObject.put("back_score_per_min", d17 * d19);
                    if (z2) {
                        this.y = (int) (((long) this.y) + this.m);
                        this.B = (int) (((long) this.B) + this.j);
                        this.z = (int) (((long) this.z) + this.k);
                        this.A = (int) (((long) this.A) + this.l);
                        if (this.o) {
                            this.C = this.n;
                        }
                        if (this.f18918b > this.s) {
                            this.s = this.f18918b;
                        }
                    }
                } else if (c.d()) {
                    new String[1][0] = " report data invalid, mBackTrafficBytes < 0 : " + this.n;
                }
            } else if (c.d()) {
                new String[1][0] = " report data invalid, mBackCpuMs < 0 : " + this.j;
            }
            z3 = false;
            new String[1][0] = "stats report failed, processName: " + this.p;
            a();
            return z3;
        }
        if (jSONObject.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", this.o);
            jSONObject2.put("process_name", this.p);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("sid", this.q);
            com.bytedance.apm.b.b("battery", jSONObject, jSONObject2, jSONObject3);
            if (c.d()) {
                new String[1][0] = "stats report, processName: " + this.p;
            }
            z3 = true;
            new String[1][0] = "stats report failed, processName: " + this.p;
            a();
            return z3;
        }
        z3 = false;
        new String[1][0] = "stats report failed, processName: " + this.p;
        a();
        return z3;
    }
}
