package com.bytedance.ttnet.c;

import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22559a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22560b = true;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Integer> f22561c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f22562d;

    /* renamed from: e  reason: collision with root package name */
    public int f22563e = 10;

    /* renamed from: f  reason: collision with root package name */
    public int f22564f = 3;
    public int g = 3;
    public int h = 10;
    public int i = 3;
    public int j = 3;
    public int k = 900;
    public int l = 120;
    public String m;

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f22559a);
        sb.append(" probeEnable: ");
        sb.append(this.f22560b);
        sb.append(" hostFilter: ");
        int i3 = 0;
        if (this.f22561c != null) {
            i2 = this.f22561c.size();
        } else {
            i2 = 0;
        }
        sb.append(i2);
        sb.append(" hostMap: ");
        if (this.f22562d != null) {
            i3 = this.f22562d.size();
        }
        sb.append(i3);
        sb.append(" reqTo: ");
        sb.append(this.f22563e);
        sb.append("#");
        sb.append(this.f22564f);
        sb.append("#");
        sb.append(this.g);
        sb.append(" reqErr: ");
        sb.append(this.h);
        sb.append("#");
        sb.append(this.i);
        sb.append("#");
        sb.append(this.j);
        sb.append(" updateInterval: ");
        sb.append(this.k);
        sb.append(" updateRandom: ");
        sb.append(this.l);
        sb.append(" httpBlack: ");
        sb.append(this.m);
        return sb.toString();
    }
}
