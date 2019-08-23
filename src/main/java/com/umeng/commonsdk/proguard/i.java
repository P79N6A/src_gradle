package com.umeng.commonsdk.proguard;

public class i extends p {
    private static final an j = new an("TApplicationException");
    private static final ad k = new ad("message", (byte) 11, 1);
    private static final ad l = new ad("type", (byte) 8, 2);
    protected int i;

    public i() {
    }

    public int a() {
        return this.i;
    }

    public i(int i2) {
        this.i = i2;
    }

    public i(String str) {
        super(str);
    }

    public void b(ai aiVar) throws p {
        aiVar.a(j);
        if (getMessage() != null) {
            aiVar.a(k);
            aiVar.a(getMessage());
            aiVar.c();
        }
        aiVar.a(l);
        aiVar.a(this.i);
        aiVar.c();
        aiVar.d();
        aiVar.b();
    }

    public static i a(ai aiVar) throws p {
        aiVar.j();
        String str = null;
        int i2 = 0;
        while (true) {
            ad l2 = aiVar.l();
            if (l2.f80813b != 0) {
                switch (l2.f80814c) {
                    case 1:
                        if (l2.f80813b != 11) {
                            al.a(aiVar, l2.f80813b);
                            break;
                        } else {
                            str = aiVar.z();
                            break;
                        }
                    case 2:
                        if (l2.f80813b != 8) {
                            al.a(aiVar, l2.f80813b);
                            break;
                        } else {
                            i2 = aiVar.w();
                            break;
                        }
                    default:
                        al.a(aiVar, l2.f80813b);
                        break;
                }
                aiVar.m();
            } else {
                aiVar.k();
                return new i(i2, str);
            }
        }
    }

    public i(int i2, String str) {
        super(str);
        this.i = i2;
    }
}
