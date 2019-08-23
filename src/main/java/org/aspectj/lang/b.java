package org.aspectj.lang;

public final class b extends RuntimeException {
    Throwable cause;

    public b() {
    }

    public final Throwable getCause() {
        return this.cause;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x0003
            goto L_0x0019
        L_0x0003:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Exception while initializing "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L_0x0019:
            r2.<init>(r3)
            r2.cause = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.lang.b.<init>(java.lang.String, java.lang.Throwable):void");
    }
}
