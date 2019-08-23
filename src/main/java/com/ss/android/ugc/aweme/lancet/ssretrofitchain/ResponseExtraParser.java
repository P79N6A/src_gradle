package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.support.annotation.Keep;
import com.bytedance.retrofit2.SsResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.e;

public final class ResponseExtraParser {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52964a;

    @Keep
    static class OldErrorModel {
        Data data;

        @Keep
        static class Data {
            String description;
            int error_code;

            Data() {
            }
        }

        OldErrorModel() {
        }
    }

    public static e a(SsResponse ssResponse) {
        e eVar;
        if (PatchProxy.isSupport(new Object[]{ssResponse}, null, f52964a, true, 55031, new Class[]{SsResponse.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{ssResponse}, null, f52964a, true, 55031, new Class[]{SsResponse.class}, e.class);
        } else if (ssResponse == null) {
            return null;
        } else {
            Object body = ssResponse.body();
            if (body != null) {
                long j = -1;
                if (body instanceof BaseResponse) {
                    BaseResponse baseResponse = (BaseResponse) body;
                    if (PatchProxy.isSupport(new Object[]{baseResponse}, null, f52964a, true, 55027, new Class[]{BaseResponse.class}, e.class)) {
                        return (e) PatchProxy.accessDispatch(new Object[]{baseResponse}, null, f52964a, true, 55027, new Class[]{BaseResponse.class}, e.class);
                    } else if (baseResponse == null) {
                        return null;
                    } else {
                        e.a aVar = new e.a();
                        aVar.f52989a = baseResponse.status_code;
                        aVar.f52990b = baseResponse.status_msg;
                        if (baseResponse.extra != null) {
                            j = baseResponse.extra.now;
                        }
                        return new e(aVar, j);
                    }
                } else if (body instanceof String) {
                    return a(body.toString());
                } else {
                    if (body instanceof FeedItemList) {
                        FeedItemList feedItemList = (FeedItemList) body;
                        if (PatchProxy.isSupport(new Object[]{feedItemList}, null, f52964a, true, 55028, new Class[]{FeedItemList.class}, e.class)) {
                            return (e) PatchProxy.accessDispatch(new Object[]{feedItemList}, null, f52964a, true, 55028, new Class[]{FeedItemList.class}, e.class);
                        } else if (feedItemList == null) {
                            return null;
                        } else {
                            e.a aVar2 = new e.a();
                            int i = feedItemList.status_code;
                            if (i == 0) {
                                i = feedItemList.error_code;
                            }
                            aVar2.f52989a = i;
                            aVar2.f52990b = feedItemList.status_msg;
                            if (feedItemList.extra != null) {
                                j = feedItemList.extra.now;
                            }
                            return new e(aVar2, j);
                        }
                    }
                }
            }
            if (ssResponse.raw() == null || ssResponse.raw().getBody() == null) {
                return null;
            }
            try {
                System.currentTimeMillis();
                eVar = a(com.ss.android.ugc.aweme.sec.e.a(ssResponse.raw()));
            } catch (Throwable unused) {
                eVar = null;
            }
            return eVar;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017f A[SYNTHETIC, Splitter:B:81:0x017f] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0186 A[SYNTHETIC, Splitter:B:89:0x0186] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.lancet.ssretrofitchain.e a(java.lang.String r20) {
        /*
            r0 = r20
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f52964a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e> r8 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.class
            r3 = 0
            r5 = 1
            r6 = 55029(0xd6f5, float:7.7112E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f52964a
            r13 = 1
            r14 = 55029(0xd6f5, float:7.7112E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e> r16 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e r0 = (com.ss.android.ugc.aweme.lancet.ssretrofitchain.e) r0
            return r0
        L_0x0037:
            boolean r2 = android.text.TextUtils.isEmpty(r20)
            r3 = 0
            if (r2 == 0) goto L_0x003f
            return r3
        L_0x003f:
            com.google.gson.stream.JsonReader r2 = new com.google.gson.stream.JsonReader     // Catch:{ Throwable -> 0x0183, all -> 0x017b }
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ Throwable -> 0x0183, all -> 0x017b }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0183, all -> 0x017b }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x0183, all -> 0x017b }
            com.google.gson.stream.JsonToken r4 = r2.peek()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r4 != r5) goto L_0x0058
            r2.nextNull()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r2.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            return r3
        L_0x0058:
            r2.setLenient(r1)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a r4 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r4.<init>()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r5 = -1
            r2.beginObject()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r7 = 3
            r10 = r5
            r5 = 3
            r6 = 0
        L_0x0069:
            boolean r8 = r2.hasNext()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r12 = 2
            if (r8 == 0) goto L_0x0108
            if (r5 <= 0) goto L_0x0108
            java.lang.String r8 = r2.nextName()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            int r13 = r8.hashCode()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            switch(r13) {
                case -891699686: goto L_0x00a6;
                case 96965648: goto L_0x009c;
                case 248339892: goto L_0x0092;
                case 954925063: goto L_0x0088;
                case 1635686852: goto L_0x007e;
                default: goto L_0x007d;
            }     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
        L_0x007d:
            goto L_0x00b0
        L_0x007e:
            java.lang.String r12 = "error_code"
            boolean r8 = r8.equals(r12)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x00b0
            r8 = 0
            goto L_0x00b1
        L_0x0088:
            java.lang.String r12 = "message"
            boolean r8 = r8.equals(r12)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x00b0
            r8 = 4
            goto L_0x00b1
        L_0x0092:
            java.lang.String r13 = "status_msg"
            boolean r8 = r8.equals(r13)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x00b0
            r8 = 2
            goto L_0x00b1
        L_0x009c:
            java.lang.String r12 = "extra"
            boolean r8 = r8.equals(r12)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x00b0
            r8 = 3
            goto L_0x00b1
        L_0x00a6:
            java.lang.String r12 = "status_code"
            boolean r8 = r8.equals(r12)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = -1
        L_0x00b1:
            switch(r8) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00f5;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00b8;
                default: goto L_0x00b4;
            }     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
        L_0x00b4:
            r2.skipValue()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            goto L_0x0069
        L_0x00b8:
            java.lang.String r8 = r2.nextString()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.String r12 = "error"
            boolean r8 = r12.equals(r8)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x0069
            r6 = 1
            goto L_0x0069
        L_0x00c6:
            r2.beginObject()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
        L_0x00c9:
            boolean r8 = r2.hasNext()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x00e6
            java.lang.String r8 = "now"
            java.lang.String r12 = r2.nextName()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            boolean r8 = r8.equals(r12)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 == 0) goto L_0x00e2
            long r10 = r2.nextLong()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            int r5 = r5 + -1
            goto L_0x00c9
        L_0x00e2:
            r2.skipValue()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            goto L_0x00c9
        L_0x00e6:
            r2.endObject()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            goto L_0x0069
        L_0x00eb:
            java.lang.String r8 = r2.nextString()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r4.f52990b = r8     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            int r5 = r5 + -1
            goto L_0x0069
        L_0x00f5:
            int r8 = r4.f52989a     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r8 > 0) goto L_0x0103
            int r8 = r2.nextInt()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r4.f52989a = r8     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            int r5 = r5 + -1
            goto L_0x0069
        L_0x0103:
            r2.skipValue()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            goto L_0x0069
        L_0x0108:
            if (r6 == 0) goto L_0x0170
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r13[r9] = r0     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r13[r1] = r4     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f52964a     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r16 = 1
            r17 = 55030(0xd6f6, float:7.7113E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r9] = r6     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a> r6 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.a.class
            r5[r1] = r6     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r5 == 0) goto L_0x014c
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r13[r9] = r0     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r13[r1] = r4     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f52964a     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r16 = 1
            r17 = 55030(0xd6f6, float:7.7113E-41)
            java.lang.Class[] r0 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r9] = r5     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a> r5 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.a.class
            r0[r1] = r5     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            goto L_0x0170
        L_0x014c:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r1.<init>()     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel> r5 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.OldErrorModel.class
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.Class<T>) r5)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel r0 = (com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.OldErrorModel) r0     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r1 = r0.data     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r1 != 0) goto L_0x015e
            goto L_0x0162
        L_0x015e:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r1 = r0.data     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            int r9 = r1.error_code     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
        L_0x0162:
            r4.f52989a = r9     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r1 = r0.data     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            if (r1 != 0) goto L_0x016a
            r0 = r3
            goto L_0x016e
        L_0x016a:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r0 = r0.data     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            java.lang.String r0 = r0.description     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
        L_0x016e:
            r4.f52990b = r0     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
        L_0x0170:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e r0 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.e     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r0.<init>(r4, r10)     // Catch:{ Throwable -> 0x0184, all -> 0x0179 }
            r2.close()     // Catch:{ IOException -> 0x0178 }
        L_0x0178:
            return r0
        L_0x0179:
            r0 = move-exception
            goto L_0x017d
        L_0x017b:
            r0 = move-exception
            r2 = r3
        L_0x017d:
            if (r2 == 0) goto L_0x0182
            r2.close()     // Catch:{ IOException -> 0x0182 }
        L_0x0182:
            throw r0
        L_0x0183:
            r2 = r3
        L_0x0184:
            if (r2 == 0) goto L_0x0189
            r2.close()     // Catch:{ IOException -> 0x0189 }
        L_0x0189:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.a(java.lang.String):com.ss.android.ugc.aweme.lancet.ssretrofitchain.e");
    }
}
