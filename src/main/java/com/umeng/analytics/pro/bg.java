package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.af;

public class bg implements az {
    private static bg i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f80437a;

    /* renamed from: b  reason: collision with root package name */
    private int f80438b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f80439c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f80440d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float f80441e;

    /* renamed from: f  reason: collision with root package name */
    private float f80442f;
    private String g;
    private Context h;

    public boolean a() {
        return this.f80437a;
    }

    public int b() {
        return this.f80438b;
    }

    public int c() {
        return this.f80439c;
    }

    public int d() {
        return this.f80440d;
    }

    public String f() {
        return this.g;
    }

    public String e() {
        if (!this.f80437a) {
            return "error";
        }
        return String.valueOf(this.f80440d);
    }

    public String toString() {
        return " p13:" + this.f80441e + " p07:" + this.f80442f + " policy:" + this.f80438b + " interval:" + this.f80439c;
    }

    public void a(af.a aVar) {
        a(aVar.f(null), aVar.d(0));
    }

    public static synchronized bg a(Context context) {
        bg bgVar;
        synchronized (bg.class) {
            if (i == null) {
                af.a b2 = af.a(context).b();
                i = new bg(context, b2.f(null), b2.d(0));
            }
            bgVar = i;
        }
        return bgVar;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\|");
        if (split.length != 6) {
            return false;
        }
        if (split[0].startsWith("SIG7") && split[1].split(",").length == split[5].split(",").length) {
            return true;
        }
        if (split[0].startsWith("FIXED")) {
            int length = split[5].split(",").length;
            int parseInt = Integer.parseInt(split[1]);
            if (length < parseInt || parseInt <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void b(String str) {
        float f2;
        float[] fArr;
        if (str != null) {
            String[] split = str.split("\\|");
            float f3 = 0.0f;
            if (split[2].equals("SIG13")) {
                f2 = Float.valueOf(split[3]).floatValue();
            } else {
                f2 = 0.0f;
            }
            if (this.f80441e > f2) {
                this.f80437a = false;
                return;
            }
            int[] iArr = null;
            if (split[0].equals("SIG7")) {
                String[] split2 = split[1].split(",");
                fArr = new float[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    fArr[i2] = Float.valueOf(split2[i2]).floatValue();
                }
            } else {
                fArr = null;
            }
            if (split[4].equals("RPT")) {
                this.g = "RPT";
                String[] split3 = split[5].split(",");
                iArr = new int[split3.length];
                for (int i3 = 0; i3 < split3.length; i3++) {
                    iArr[i3] = Integer.valueOf(split3[i3]).intValue();
                }
            } else if (split[4].equals("DOM")) {
                this.f80437a = true;
                this.g = "DOM";
                try {
                    String[] split4 = split[5].split(",");
                    int[] iArr2 = new int[split4.length];
                    int i4 = 0;
                    while (i4 < split4.length) {
                        try {
                            iArr2[i4] = Integer.valueOf(split4[i4]).intValue();
                            i4++;
                        } catch (Exception unused) {
                        }
                    }
                    iArr = iArr2;
                } catch (Exception unused2) {
                }
            }
            int i5 = 0;
            while (true) {
                if (i5 >= fArr.length) {
                    i5 = -1;
                    break;
                }
                f3 += fArr[i5];
                if (this.f80442f < f3) {
                    break;
                }
                i5++;
            }
            if (i5 != -1) {
                this.f80437a = true;
                this.f80440d = i5 + 1;
                if (iArr != null) {
                    this.f80438b = iArr[i5];
                }
            } else {
                this.f80437a = false;
            }
        }
    }

    private void c(String str) {
        int i2;
        if (str != null) {
            String[] split = str.split("\\|");
            float f2 = 0.0f;
            if (split[2].equals("SIG13")) {
                f2 = Float.valueOf(split[3]).floatValue();
            }
            if (this.f80441e > f2) {
                this.f80437a = false;
                return;
            }
            if (split[0].equals("FIXED")) {
                i2 = Integer.valueOf(split[1]).intValue();
            } else {
                i2 = -1;
            }
            int[] iArr = null;
            if (split[4].equals("RPT")) {
                this.g = "RPT";
                String[] split2 = split[5].split(",");
                iArr = new int[split2.length];
                for (int i3 = 0; i3 < split2.length; i3++) {
                    iArr[i3] = Integer.valueOf(split2[i3]).intValue();
                }
            } else if (split[4].equals("DOM")) {
                this.g = "DOM";
                this.f80437a = true;
                try {
                    String[] split3 = split[5].split(",");
                    int[] iArr2 = new int[split3.length];
                    int i4 = 0;
                    while (i4 < split3.length) {
                        try {
                            iArr2[i4] = Integer.valueOf(split3[i4]).intValue();
                            i4++;
                        } catch (Exception unused) {
                        }
                    }
                    iArr = iArr2;
                } catch (Exception unused2) {
                }
            }
            if (i2 != -1) {
                this.f80437a = true;
                this.f80440d = i2;
                if (iArr != null) {
                    this.f80438b = iArr[i2 - 1];
                }
            } else {
                this.f80437a = false;
            }
        }
    }

    private float b(String str, int i2) {
        int i3 = i2 * 2;
        if (str == null) {
            return 0.0f;
        }
        return ((float) Integer.valueOf(str.substring(i3, i3 + 5), 16).intValue()) / 1048576.0f;
    }

    public void a(String str, int i2) {
        this.f80439c = i2;
        String a2 = aa.a(this.h);
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(str)) {
            this.f80437a = false;
            return;
        }
        try {
            this.f80441e = b(a2, 12);
            this.f80442f = b(a2, 6);
            if (str.startsWith("SIG7")) {
                b(str);
                return;
            }
            if (str.startsWith("FIXED")) {
                c(str);
            }
        } catch (Exception e2) {
            this.f80437a = false;
            by.e("v:" + str, (Throwable) e2);
        }
    }

    private bg(Context context, String str, int i2) {
        this.h = context;
        a(str, i2);
    }
}
