package com.alipay.b.b.a.a;

public final class a extends Exception {
    private static final long serialVersionUID = -6320569206365033676L;
    private int mCode;
    private String mMsg;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.Integer r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Http Transport error"
            r0.append(r1)
            if (r3 == 0) goto L_0x0019
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "]"
            r0.append(r1)
        L_0x0019:
            java.lang.String r1 = " : "
            r0.append(r1)
            if (r4 == 0) goto L_0x0023
            r0.append(r4)
        L_0x0023:
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            int r3 = r3.intValue()
            r2.mCode = r3
            r2.mMsg = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.b.b.a.a.a.<init>(java.lang.Integer, java.lang.String):void");
    }

    public a(String str) {
        super(str);
        this.mMsg = str;
    }

    public final int getCode() {
        return this.mCode;
    }

    public final String getMsg() {
        return this.mMsg;
    }
}
