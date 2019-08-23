package com.umeng.commonsdk.proguard;

import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.umeng.commonsdk.proguard.ac;

public class al {

    /* renamed from: a  reason: collision with root package name */
    private static int f80823a = Integer.MAX_VALUE;

    public static void a(int i) {
        f80823a = i;
    }

    public static void a(ai aiVar, byte b2) throws p {
        a(aiVar, b2, f80823a);
    }

    public static ak a(byte[] bArr, ak akVar) {
        if (bArr[0] > 16) {
            return new ac.a();
        }
        if (bArr.length <= 1 || (bArr[1] & 128) == 0) {
            return akVar;
        }
        return new ac.a();
    }

    public static void a(ai aiVar, byte b2, int i) throws p {
        if (i > 0) {
            int i2 = 0;
            switch (b2) {
                case 2:
                    aiVar.t();
                    return;
                case 3:
                    aiVar.u();
                    return;
                case 4:
                    aiVar.y();
                    return;
                case 6:
                    aiVar.v();
                    return;
                case 8:
                    aiVar.w();
                    return;
                case 10:
                    aiVar.x();
                    return;
                case 11:
                    aiVar.A();
                    return;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    aiVar.j();
                    while (true) {
                        ad l = aiVar.l();
                        if (l.f80813b != 0) {
                            a(aiVar, l.f80813b, i - 1);
                            aiVar.m();
                        } else {
                            aiVar.k();
                            return;
                        }
                    }
                case 13:
                    af n = aiVar.n();
                    while (i2 < n.f80819c) {
                        int i3 = i - 1;
                        a(aiVar, n.f80817a, i3);
                        a(aiVar, n.f80818b, i3);
                        i2++;
                    }
                    aiVar.o();
                    return;
                case 14:
                    am r = aiVar.r();
                    while (i2 < r.f80825b) {
                        a(aiVar, r.f80824a, i - 1);
                        i2++;
                    }
                    aiVar.s();
                    return;
                case 15:
                    ae p = aiVar.p();
                    while (i2 < p.f80816b) {
                        a(aiVar, p.f80815a, i - 1);
                        i2++;
                    }
                    aiVar.q();
                    break;
            }
            return;
        }
        throw new p("Maximum skip depth exceeded");
    }
}
