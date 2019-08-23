package com.umeng.analytics.pro;

public class cf extends cm {
    private static final dk j = new dk("TApplicationException");
    private static final da k = new da("message", (byte) 11, 1);
    private static final da l = new da("type", (byte) 8, 2);
    protected int i;

    public cf() {
    }

    public int a() {
        return this.i;
    }

    public cf(int i2) {
        this.i = i2;
    }

    public cf(String str) {
        super(str);
    }

    public void b(df dfVar) throws cm {
        dfVar.a(j);
        if (getMessage() != null) {
            dfVar.a(k);
            dfVar.a(getMessage());
            dfVar.c();
        }
        dfVar.a(l);
        dfVar.a(this.i);
        dfVar.c();
        dfVar.d();
        dfVar.b();
    }

    public static cf a(df dfVar) throws cm {
        dfVar.j();
        String str = null;
        int i2 = 0;
        while (true) {
            da l2 = dfVar.l();
            if (l2.f80616b != 0) {
                switch (l2.f80617c) {
                    case 1:
                        if (l2.f80616b != 11) {
                            di.a(dfVar, l2.f80616b);
                            break;
                        } else {
                            str = dfVar.z();
                            break;
                        }
                    case 2:
                        if (l2.f80616b != 8) {
                            di.a(dfVar, l2.f80616b);
                            break;
                        } else {
                            i2 = dfVar.w();
                            break;
                        }
                    default:
                        di.a(dfVar, l2.f80616b);
                        break;
                }
                dfVar.m();
            } else {
                dfVar.k();
                return new cf(i2, str);
            }
        }
    }

    public cf(int i2, String str) {
        super(str);
        this.i = i2;
    }
}
