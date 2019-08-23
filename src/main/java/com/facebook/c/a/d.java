package com.facebook.c.a;

import com.facebook.c.b.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final a<c> f23308a = new a<c>() {
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            if (r1.equals("start_frame") != false) goto L_0x0037;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object b(android.util.JsonReader r7) throws java.io.IOException {
            /*
                r6 = this;
                r7.beginObject()
                com.facebook.c.b.c$a r0 = new com.facebook.c.b.c$a
                r0.<init>()
            L_0x0008:
                boolean r1 = r7.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x004c
                java.lang.String r1 = r7.nextName()
                r3 = -1
                int r4 = r1.hashCode()
                r5 = -1535541424(0xffffffffa4797f50, float:-5.4101106E-17)
                if (r4 == r5) goto L_0x002d
                r2 = 3076010(0x2eefaa, float:4.310408E-39)
                if (r4 == r2) goto L_0x0023
                goto L_0x0036
            L_0x0023:
                java.lang.String r2 = "data"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x002d:
                java.lang.String r4 = "start_frame"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r2 = -1
            L_0x0037:
                switch(r2) {
                    case 0: goto L_0x0045;
                    case 1: goto L_0x003e;
                    default: goto L_0x003a;
                }
            L_0x003a:
                r7.skipValue()
                goto L_0x0008
            L_0x003e:
                float[] r1 = com.facebook.c.a.b.a((android.util.JsonReader) r7)
                r0.f23340b = r1
                goto L_0x0008
            L_0x0045:
                int r1 = r7.nextInt()
                r0.f23339a = r1
                goto L_0x0008
            L_0x004c:
                r7.endObject()
                com.facebook.c.b.c r7 = new com.facebook.c.b.c
                int r1 = r0.f23339a
                float[] r0 = r0.f23340b
                r7.<init>(r1, r0, r2)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.a.d.AnonymousClass1.b(android.util.JsonReader):java.lang.Object");
        }
    };
}
