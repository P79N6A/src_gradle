package com.umeng.analytics.pro;

import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.umeng.analytics.pro.cz;

public class di {

    /* renamed from: a  reason: collision with root package name */
    private static int f80626a = Integer.MAX_VALUE;

    public static void a(int i) {
        f80626a = i;
    }

    public static void a(df dfVar, byte b2) throws cm {
        a(dfVar, b2, f80626a);
    }

    public static dh a(byte[] bArr, dh dhVar) {
        if (bArr[0] > 16) {
            return new cz.a();
        }
        if (bArr.length <= 1 || (bArr[1] & 128) == 0) {
            return dhVar;
        }
        return new cz.a();
    }

    public static void a(df dfVar, byte b2, int i) throws cm {
        if (i > 0) {
            int i2 = 0;
            switch (b2) {
                case 2:
                    dfVar.t();
                    return;
                case 3:
                    dfVar.u();
                    return;
                case 4:
                    dfVar.y();
                    return;
                case 6:
                    dfVar.v();
                    return;
                case 8:
                    dfVar.w();
                    return;
                case 10:
                    dfVar.x();
                    return;
                case 11:
                    dfVar.A();
                    return;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    dfVar.j();
                    while (true) {
                        da l = dfVar.l();
                        if (l.f80616b != 0) {
                            a(dfVar, l.f80616b, i - 1);
                            dfVar.m();
                        } else {
                            dfVar.k();
                            return;
                        }
                    }
                case 13:
                    dc n = dfVar.n();
                    while (i2 < n.f80622c) {
                        int i3 = i - 1;
                        a(dfVar, n.f80620a, i3);
                        a(dfVar, n.f80621b, i3);
                        i2++;
                    }
                    dfVar.o();
                    return;
                case 14:
                    dj r = dfVar.r();
                    while (i2 < r.f80628b) {
                        a(dfVar, r.f80627a, i - 1);
                        i2++;
                    }
                    dfVar.s();
                    return;
                case 15:
                    db p = dfVar.p();
                    while (i2 < p.f80619b) {
                        a(dfVar, p.f80618a, i - 1);
                        i2++;
                    }
                    dfVar.q();
                    break;
            }
            return;
        }
        throw new cm("Maximum skip depth exceeded");
    }
}
