package com.umeng.analytics.pro;

import com.umeng.analytics.pro.cz;
import java.nio.ByteBuffer;

public class cj {

    /* renamed from: a  reason: collision with root package name */
    private final df f80579a;

    /* renamed from: b  reason: collision with root package name */
    private final ds f80580b;

    public cj() {
        this(new cz.a());
    }

    public cj(dh dhVar) {
        this.f80580b = new ds();
        this.f80579a = dhVar.a(this.f80580b);
    }

    public void a(cg cgVar, String str) throws cm {
        a(cgVar, str.getBytes());
    }

    public void a(cg cgVar, byte[] bArr) throws cm {
        try {
            this.f80580b.a(bArr);
            cgVar.a(this.f80579a);
        } finally {
            this.f80580b.e();
            this.f80579a.B();
        }
    }

    public Boolean a(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (Boolean) a((byte) 2, bArr, cnVar, cnVarArr);
    }

    public Byte b(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (Byte) a((byte) 3, bArr, cnVar, cnVarArr);
    }

    public Double c(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (Double) a((byte) 4, bArr, cnVar, cnVarArr);
    }

    public Short d(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (Short) a((byte) 6, bArr, cnVar, cnVarArr);
    }

    public Integer e(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (Integer) a((byte) 8, bArr, cnVar, cnVarArr);
    }

    public Long f(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (Long) a((byte) 10, bArr, cnVar, cnVarArr);
    }

    public String g(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (String) a((byte) 11, bArr, cnVar, cnVarArr);
    }

    public ByteBuffer h(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        return (ByteBuffer) a((byte) 100, bArr, cnVar, cnVarArr);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        throw new com.umeng.analytics.pro.cm("JVM DOES NOT SUPPORT ENCODING: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r1.f80579a.B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.umeng.analytics.pro.cg r2, java.lang.String r3, java.lang.String r4) throws com.umeng.analytics.pro.cm {
        /*
            r1 = this;
            byte[] r3 = r3.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            r1.a((com.umeng.analytics.pro.cg) r2, (byte[]) r3)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            com.umeng.analytics.pro.df r2 = r1.f80579a
            r2.B()
            return
        L_0x000d:
            r2 = move-exception
            goto L_0x0023
        L_0x000f:
            com.umeng.analytics.pro.cm r2 = new com.umeng.analytics.pro.cm     // Catch:{ all -> 0x000d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            java.lang.String r0 = "JVM DOES NOT SUPPORT ENCODING: "
            r3.<init>(r0)     // Catch:{ all -> 0x000d }
            r3.append(r4)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000d }
            r2.<init>((java.lang.String) r3)     // Catch:{ all -> 0x000d }
            throw r2     // Catch:{ all -> 0x000d }
        L_0x0023:
            com.umeng.analytics.pro.df r3 = r1.f80579a
            r3.B()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.cj.a(com.umeng.analytics.pro.cg, java.lang.String, java.lang.String):void");
    }

    private da j(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        this.f80580b.a(bArr);
        cn[] cnVarArr2 = new cn[(cnVarArr.length + 1)];
        int i = 0;
        cnVarArr2[0] = cnVar;
        int i2 = 0;
        while (i2 < cnVarArr.length) {
            int i3 = i2 + 1;
            cnVarArr2[i3] = cnVarArr[i2];
            i2 = i3;
        }
        this.f80579a.j();
        da daVar = null;
        while (i < cnVarArr2.length) {
            daVar = this.f80579a.l();
            if (daVar.f80616b == 0 || daVar.f80617c > cnVarArr2[i].a()) {
                return null;
            }
            if (daVar.f80617c != cnVarArr2[i].a()) {
                di.a(this.f80579a, daVar.f80616b);
                this.f80579a.m();
            } else {
                i++;
                if (i < cnVarArr2.length) {
                    this.f80579a.j();
                }
            }
        }
        return daVar;
    }

    public Short i(byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        try {
            if (j(bArr, cnVar, cnVarArr) != null) {
                this.f80579a.j();
                Short valueOf = Short.valueOf(this.f80579a.l().f80617c);
                this.f80580b.e();
                this.f80579a.B();
                return valueOf;
            }
            this.f80580b.e();
            this.f80579a.B();
            return null;
        } catch (Exception e2) {
            throw new cm((Throwable) e2);
        } catch (Throwable th) {
            this.f80580b.e();
            this.f80579a.B();
            throw th;
        }
    }

    public void a(cg cgVar, byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        try {
            if (j(bArr, cnVar, cnVarArr) != null) {
                cgVar.a(this.f80579a);
            }
            this.f80580b.e();
            this.f80579a.B();
        } catch (Exception e2) {
            throw new cm((Throwable) e2);
        } catch (Throwable th) {
            this.f80580b.e();
            this.f80579a.B();
            throw th;
        }
    }

    private Object a(byte b2, byte[] bArr, cn cnVar, cn... cnVarArr) throws cm {
        try {
            da j = j(bArr, cnVar, cnVarArr);
            if (j != null) {
                if (b2 != 6) {
                    if (b2 != 8) {
                        if (b2 != 100) {
                            switch (b2) {
                                case 2:
                                    if (j.f80616b == 2) {
                                        Boolean valueOf = Boolean.valueOf(this.f80579a.t());
                                        this.f80580b.e();
                                        this.f80579a.B();
                                        return valueOf;
                                    }
                                    break;
                                case 3:
                                    if (j.f80616b == 3) {
                                        Byte valueOf2 = Byte.valueOf(this.f80579a.u());
                                        this.f80580b.e();
                                        this.f80579a.B();
                                        return valueOf2;
                                    }
                                    break;
                                case 4:
                                    if (j.f80616b == 4) {
                                        Double valueOf3 = Double.valueOf(this.f80579a.y());
                                        this.f80580b.e();
                                        this.f80579a.B();
                                        return valueOf3;
                                    }
                                    break;
                                default:
                                    switch (b2) {
                                        case 10:
                                            if (j.f80616b == 10) {
                                                Long valueOf4 = Long.valueOf(this.f80579a.x());
                                                this.f80580b.e();
                                                this.f80579a.B();
                                                return valueOf4;
                                            }
                                            break;
                                        case 11:
                                            if (j.f80616b == 11) {
                                                String z = this.f80579a.z();
                                                this.f80580b.e();
                                                this.f80579a.B();
                                                return z;
                                            }
                                            break;
                                    }
                            }
                        } else if (j.f80616b == 11) {
                            ByteBuffer A = this.f80579a.A();
                            this.f80580b.e();
                            this.f80579a.B();
                            return A;
                        }
                    } else if (j.f80616b == 8) {
                        Integer valueOf5 = Integer.valueOf(this.f80579a.w());
                        this.f80580b.e();
                        this.f80579a.B();
                        return valueOf5;
                    }
                } else if (j.f80616b == 6) {
                    Short valueOf6 = Short.valueOf(this.f80579a.v());
                    this.f80580b.e();
                    this.f80579a.B();
                    return valueOf6;
                }
            }
            this.f80580b.e();
            this.f80579a.B();
            return null;
        } catch (Exception e2) {
            throw new cm((Throwable) e2);
        } catch (Throwable th) {
            this.f80580b.e();
            this.f80579a.B();
            throw th;
        }
    }
}
