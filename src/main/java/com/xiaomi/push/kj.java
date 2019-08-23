package com.xiaomi.push;

import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public class kj {

    /* renamed from: a  reason: collision with root package name */
    private static int f82428a = Integer.MAX_VALUE;

    public static void a(kg kgVar, byte b2) {
        a(kgVar, b2, f82428a);
    }

    public static void a(kg kgVar, byte b2, int i) {
        if (i > 0) {
            int i2 = 0;
            switch (b2) {
                case 2:
                    kgVar.a();
                    return;
                case 3:
                    kgVar.a();
                    return;
                case 4:
                    kgVar.a();
                    return;
                case 6:
                    kgVar.a();
                    return;
                case 8:
                    kgVar.a();
                    return;
                case 10:
                    kgVar.a();
                    return;
                case 11:
                    kgVar.a();
                    return;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    kgVar.a();
                    while (true) {
                        kd a2 = kgVar.a();
                        if (a2.f82422a == 0) {
                            kgVar.f();
                            return;
                        } else {
                            a(kgVar, a2.f82422a, i - 1);
                            kgVar.g();
                        }
                    }
                case 13:
                    kf a3 = kgVar.a();
                    while (i2 < a3.f873a) {
                        int i3 = i - 1;
                        a(kgVar, a3.f82424a, i3);
                        a(kgVar, a3.f82425b, i3);
                        i2++;
                    }
                    kgVar.h();
                    return;
                case 14:
                    kk a4 = kgVar.a();
                    while (i2 < a4.f874a) {
                        a(kgVar, a4.f82429a, i - 1);
                        i2++;
                    }
                    kgVar.j();
                    return;
                case 15:
                    ke a5 = kgVar.a();
                    while (i2 < a5.f872a) {
                        a(kgVar, a5.f82423a, i - 1);
                        i2++;
                    }
                    kgVar.i();
                    return;
                default:
                    return;
            }
        } else {
            throw new ka("Maximum skip depth exceeded");
        }
    }
}
