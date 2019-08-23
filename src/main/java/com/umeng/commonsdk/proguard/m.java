package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.ac;
import java.nio.ByteBuffer;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final ai f80854a;

    /* renamed from: b  reason: collision with root package name */
    private final av f80855b;

    public m() {
        this(new ac.a());
    }

    public m(ak akVar) {
        this.f80855b = new av();
        this.f80854a = akVar.a(this.f80855b);
    }

    public void a(j jVar, String str) throws p {
        a(jVar, str.getBytes());
    }

    public void a(j jVar, byte[] bArr) throws p {
        try {
            this.f80855b.a(bArr);
            jVar.read(this.f80854a);
        } finally {
            this.f80855b.e();
            this.f80854a.B();
        }
    }

    public Boolean a(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (Boolean) a((byte) 2, bArr, qVar, qVarArr);
    }

    public Byte b(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (Byte) a((byte) 3, bArr, qVar, qVarArr);
    }

    public Double c(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (Double) a((byte) 4, bArr, qVar, qVarArr);
    }

    public Short d(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (Short) a((byte) 6, bArr, qVar, qVarArr);
    }

    public Integer e(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (Integer) a((byte) 8, bArr, qVar, qVarArr);
    }

    public Long f(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (Long) a((byte) 10, bArr, qVar, qVarArr);
    }

    public String g(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (String) a((byte) 11, bArr, qVar, qVarArr);
    }

    public ByteBuffer h(byte[] bArr, q qVar, q... qVarArr) throws p {
        return (ByteBuffer) a((byte) 100, bArr, qVar, qVarArr);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        throw new com.umeng.commonsdk.proguard.p("JVM DOES NOT SUPPORT ENCODING: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r1.f80854a.B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.umeng.commonsdk.proguard.j r2, java.lang.String r3, java.lang.String r4) throws com.umeng.commonsdk.proguard.p {
        /*
            r1 = this;
            byte[] r3 = r3.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            r1.a((com.umeng.commonsdk.proguard.j) r2, (byte[]) r3)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            com.umeng.commonsdk.proguard.ai r2 = r1.f80854a
            r2.B()
            return
        L_0x000d:
            r2 = move-exception
            goto L_0x0023
        L_0x000f:
            com.umeng.commonsdk.proguard.p r2 = new com.umeng.commonsdk.proguard.p     // Catch:{ all -> 0x000d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            java.lang.String r0 = "JVM DOES NOT SUPPORT ENCODING: "
            r3.<init>(r0)     // Catch:{ all -> 0x000d }
            r3.append(r4)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000d }
            r2.<init>((java.lang.String) r3)     // Catch:{ all -> 0x000d }
            throw r2     // Catch:{ all -> 0x000d }
        L_0x0023:
            com.umeng.commonsdk.proguard.ai r3 = r1.f80854a
            r3.B()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.m.a(com.umeng.commonsdk.proguard.j, java.lang.String, java.lang.String):void");
    }

    private ad j(byte[] bArr, q qVar, q... qVarArr) throws p {
        this.f80855b.a(bArr);
        q[] qVarArr2 = new q[(qVarArr.length + 1)];
        int i = 0;
        qVarArr2[0] = qVar;
        int i2 = 0;
        while (i2 < qVarArr.length) {
            int i3 = i2 + 1;
            qVarArr2[i3] = qVarArr[i2];
            i2 = i3;
        }
        this.f80854a.j();
        ad adVar = null;
        while (i < qVarArr2.length) {
            adVar = this.f80854a.l();
            if (adVar.f80813b == 0 || adVar.f80814c > qVarArr2[i].a()) {
                return null;
            }
            if (adVar.f80814c != qVarArr2[i].a()) {
                al.a(this.f80854a, adVar.f80813b);
                this.f80854a.m();
            } else {
                i++;
                if (i < qVarArr2.length) {
                    this.f80854a.j();
                }
            }
        }
        return adVar;
    }

    public Short i(byte[] bArr, q qVar, q... qVarArr) throws p {
        try {
            if (j(bArr, qVar, qVarArr) != null) {
                this.f80854a.j();
                Short valueOf = Short.valueOf(this.f80854a.l().f80814c);
                this.f80855b.e();
                this.f80854a.B();
                return valueOf;
            }
            this.f80855b.e();
            this.f80854a.B();
            return null;
        } catch (Exception e2) {
            throw new p((Throwable) e2);
        } catch (Throwable th) {
            this.f80855b.e();
            this.f80854a.B();
            throw th;
        }
    }

    public void a(j jVar, byte[] bArr, q qVar, q... qVarArr) throws p {
        try {
            if (j(bArr, qVar, qVarArr) != null) {
                jVar.read(this.f80854a);
            }
            this.f80855b.e();
            this.f80854a.B();
        } catch (Exception e2) {
            throw new p((Throwable) e2);
        } catch (Throwable th) {
            this.f80855b.e();
            this.f80854a.B();
            throw th;
        }
    }

    private Object a(byte b2, byte[] bArr, q qVar, q... qVarArr) throws p {
        try {
            ad j = j(bArr, qVar, qVarArr);
            if (j != null) {
                if (b2 != 6) {
                    if (b2 != 8) {
                        if (b2 != 100) {
                            switch (b2) {
                                case 2:
                                    if (j.f80813b == 2) {
                                        Boolean valueOf = Boolean.valueOf(this.f80854a.t());
                                        this.f80855b.e();
                                        this.f80854a.B();
                                        return valueOf;
                                    }
                                    break;
                                case 3:
                                    if (j.f80813b == 3) {
                                        Byte valueOf2 = Byte.valueOf(this.f80854a.u());
                                        this.f80855b.e();
                                        this.f80854a.B();
                                        return valueOf2;
                                    }
                                    break;
                                case 4:
                                    if (j.f80813b == 4) {
                                        Double valueOf3 = Double.valueOf(this.f80854a.y());
                                        this.f80855b.e();
                                        this.f80854a.B();
                                        return valueOf3;
                                    }
                                    break;
                                default:
                                    switch (b2) {
                                        case 10:
                                            if (j.f80813b == 10) {
                                                Long valueOf4 = Long.valueOf(this.f80854a.x());
                                                this.f80855b.e();
                                                this.f80854a.B();
                                                return valueOf4;
                                            }
                                            break;
                                        case 11:
                                            if (j.f80813b == 11) {
                                                String z = this.f80854a.z();
                                                this.f80855b.e();
                                                this.f80854a.B();
                                                return z;
                                            }
                                            break;
                                    }
                            }
                        } else if (j.f80813b == 11) {
                            ByteBuffer A = this.f80854a.A();
                            this.f80855b.e();
                            this.f80854a.B();
                            return A;
                        }
                    } else if (j.f80813b == 8) {
                        Integer valueOf5 = Integer.valueOf(this.f80854a.w());
                        this.f80855b.e();
                        this.f80854a.B();
                        return valueOf5;
                    }
                } else if (j.f80813b == 6) {
                    Short valueOf6 = Short.valueOf(this.f80854a.v());
                    this.f80855b.e();
                    this.f80854a.B();
                    return valueOf6;
                }
            }
            this.f80855b.e();
            this.f80854a.B();
            return null;
        } catch (Exception e2) {
            throw new p((Throwable) e2);
        } catch (Throwable th) {
            this.f80855b.e();
            this.f80854a.B();
            throw th;
        }
    }
}
