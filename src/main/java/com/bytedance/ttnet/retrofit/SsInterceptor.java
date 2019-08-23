package com.bytedance.ttnet.retrofit;

import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.frameworks.baselib.network.http.util.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class SsInterceptor extends BaseSsInterceptor {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[Catch:{ Throwable -> 0x0073 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.Request intercept(com.bytedance.retrofit2.client.Request r7) {
        /*
            r6 = this;
            com.bytedance.retrofit2.client.Request r7 = super.intercept((com.bytedance.retrofit2.client.Request) r7)
            if (r7 != 0) goto L_0x0007
            return r7
        L_0x0007:
            com.bytedance.retrofit2.client.Request$Builder r0 = r7.newBuilder()
            java.lang.String r1 = r7.getUrl()
            java.lang.String r1 = r6.tryFilterDupQuery(r1)
            r0.url(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r3 = r7.getHeaders()
            if (r3 == 0) goto L_0x0028
            java.util.List r7 = r7.getHeaders()
            r2.addAll(r7)
        L_0x0028:
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ Throwable -> 0x005f }
            r7.<init>()     // Catch:{ Throwable -> 0x005f }
            java.lang.String r3 = com.bytedance.frameworks.core.encrypt.a.a((java.lang.String) r1, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r7)     // Catch:{ Throwable -> 0x005f }
            if (r3 == 0) goto L_0x0036
            r0.url(r3)     // Catch:{ Throwable -> 0x005f }
        L_0x0036:
            boolean r3 = r7.isEmpty()     // Catch:{ Throwable -> 0x005f }
            if (r3 != 0) goto L_0x005f
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Throwable -> 0x005f }
        L_0x0040:
            boolean r3 = r7.hasNext()     // Catch:{ Throwable -> 0x005f }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r7.next()     // Catch:{ Throwable -> 0x005f }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ Throwable -> 0x005f }
            if (r3 == 0) goto L_0x0040
            com.bytedance.retrofit2.client.Header r4 = new com.bytedance.retrofit2.client.Header     // Catch:{ Throwable -> 0x005f }
            java.lang.Object r5 = r3.first     // Catch:{ Throwable -> 0x005f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x005f }
            java.lang.Object r3 = r3.second     // Catch:{ Throwable -> 0x005f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x005f }
            r4.<init>(r5, r3)     // Catch:{ Throwable -> 0x005f }
            r2.add(r4)     // Catch:{ Throwable -> 0x005f }
            goto L_0x0040
        L_0x005f:
            java.lang.String r7 = com.bytedance.ttnet.utils.e.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x0073 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0073 }
            if (r1 != 0) goto L_0x0073
            com.bytedance.retrofit2.client.Header r1 = new com.bytedance.retrofit2.client.Header     // Catch:{ Throwable -> 0x0073 }
            java.lang.String r3 = "X-SS-REQ-TICKET"
            r1.<init>(r3, r7)     // Catch:{ Throwable -> 0x0073 }
            r2.add(r1)     // Catch:{ Throwable -> 0x0073 }
        L_0x0073:
            r0.headers(r2)
            com.bytedance.retrofit2.client.Request r7 = r0.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.retrofit.SsInterceptor.intercept(com.bytedance.retrofit2.client.Request):com.bytedance.retrofit2.client.Request");
    }

    private String tryFilterDupQuery(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> parseUrlWithValueList = UrlUtils.parseUrlWithValueList(str, linkedHashMap);
            if (parseUrlWithValueList == null) {
                return str;
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        List list = (List) entry.getValue();
                        if (list != null && !list.isEmpty()) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                if (linkedHashSet.contains(str2)) {
                                    it2.remove();
                                } else {
                                    linkedHashSet.add(str2);
                                }
                            }
                        }
                    }
                }
            }
            j jVar = new j(((String) parseUrlWithValueList.first) + ((String) parseUrlWithValueList.second));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!(entry2 == null || entry2.getKey() == null)) {
                        List<String> list2 = (List) entry2.getValue();
                        if (list2 != null && !list2.isEmpty()) {
                            for (String a2 : list2) {
                                jVar.a((String) entry2.getKey(), a2);
                            }
                        }
                    }
                }
            }
            return jVar.a();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|(2:7|(2:9|(3:13|(2:16|14)|91)))|17|(2:20|(6:22|(5:25|26|(1:94)(2:28|(2:30|95)(2:31|93))|32|23)|92|34|(1:36)|37))(1:38)|39|40|(1:42)|43|(1:45)|46|47|(1:49)(4:50|(3:52|(3:56|(5:59|100|(6:61|(1:63)(1:64)|65|(13:67|68|69|(1:71)|72|73|(1:75)|76|(1:78)|79|(1:81)|82|(1:84))|85|101)|102|57)|99)|86)|96|87)) */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c1, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0176 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df A[Catch:{ Throwable -> 0x01c1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0 A[Catch:{ Throwable -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017e A[Catch:{ Throwable -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018b A[Catch:{ Throwable -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a1 A[Catch:{ Throwable -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01af A[Catch:{ Throwable -> 0x01c1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void intercept(com.bytedance.retrofit2.client.Request r23, com.bytedance.retrofit2.SsResponse r24) throws java.lang.Exception {
        /*
            r22 = this;
            r0 = r23
            super.intercept(r23, r24)
            if (r0 == 0) goto L_0x01c2
            if (r24 != 0) goto L_0x000b
            goto L_0x01c2
        L_0x000b:
            com.bytedance.retrofit2.client.Response r1 = r24.raw()
            com.bytedance.frameworks.baselib.network.http.e$f r2 = com.bytedance.frameworks.baselib.network.http.e.g()     // Catch:{ Throwable -> 0x004c }
            if (r2 == 0) goto L_0x004c
            com.bytedance.frameworks.baselib.network.http.e$f r2 = com.bytedance.frameworks.baselib.network.http.e.g()     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = r2.a()     // Catch:{ Throwable -> 0x004c }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x004c }
            if (r3 != 0) goto L_0x004c
            java.util.List r2 = r1.headers(r2)     // Catch:{ Throwable -> 0x004c }
            if (r2 == 0) goto L_0x004c
            int r3 = r2.size()     // Catch:{ Throwable -> 0x004c }
            if (r3 <= 0) goto L_0x004c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x004c }
            r3.<init>()     // Catch:{ Throwable -> 0x004c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x004c }
        L_0x0038:
            boolean r4 = r2.hasNext()     // Catch:{ Throwable -> 0x004c }
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r2.next()     // Catch:{ Throwable -> 0x004c }
            com.bytedance.retrofit2.client.Header r4 = (com.bytedance.retrofit2.client.Header) r4     // Catch:{ Throwable -> 0x004c }
            java.lang.String r4 = r4.getValue()     // Catch:{ Throwable -> 0x004c }
            r3.add(r4)     // Catch:{ Throwable -> 0x004c }
            goto L_0x0038
        L_0x004c:
            java.lang.Object r2 = r1.getExtraInfo()
            boolean r3 = r2 instanceof com.bytedance.ttnet.b.b
            r5 = 0
            if (r3 == 0) goto L_0x00af
            com.bytedance.ttnet.b.b r2 = (com.bytedance.ttnet.b.b) r2
            com.bytedance.frameworks.baselib.network.http.b r3 = r2.f19731b
            if (r3 == 0) goto L_0x00b0
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.util.List r6 = r1.getHeaders()
            r7 = 0
        L_0x0065:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x0090
            java.lang.Object r8 = r6.get(r7)     // Catch:{ Exception -> 0x008d }
            com.bytedance.retrofit2.client.Header r8 = (com.bytedance.retrofit2.client.Header) r8     // Catch:{ Exception -> 0x008d }
            if (r8 == 0) goto L_0x008d
            java.lang.String r9 = r8.getName()     // Catch:{ Exception -> 0x008d }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x008d }
            if (r9 == 0) goto L_0x007e
            goto L_0x008d
        L_0x007e:
            java.lang.String r9 = r8.getName()     // Catch:{ Exception -> 0x008d }
            java.lang.String r9 = r9.toUpperCase()     // Catch:{ Exception -> 0x008d }
            java.lang.String r8 = r8.getValue()     // Catch:{ Exception -> 0x008d }
            r3.put(r9, r8)     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            int r7 = r7 + 1
            goto L_0x0065
        L_0x0090:
            com.bytedance.frameworks.baselib.network.http.b r6 = r2.f19731b
            boolean r6 = r6 instanceof com.bytedance.ttnet.b.d
            if (r6 == 0) goto L_0x009c
            com.bytedance.frameworks.baselib.network.http.b r6 = r2.f19731b
            com.bytedance.ttnet.b.d r6 = (com.bytedance.ttnet.b.d) r6
            r6.r = r3
        L_0x009c:
            com.bytedance.frameworks.baselib.network.http.b r3 = r2.f19731b
            com.bytedance.ttnet.b.d r3 = (com.bytedance.ttnet.b.d) r3
            int r6 = r1.getStatus()
            r3.f19737b = r6
            com.bytedance.frameworks.baselib.network.http.b r3 = r2.f19731b
            com.bytedance.ttnet.b.d r3 = (com.bytedance.ttnet.b.d) r3
            java.lang.String r6 = r2.f19730a
            r3.f19736a = r6
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            r23.getUrl()     // Catch:{ Throwable -> 0x00c9 }
            java.lang.String r3 = "X-SS-REQ-TICKET"
            com.bytedance.retrofit2.client.Header r3 = r0.getFirstHeader(r3)     // Catch:{ Throwable -> 0x00c9 }
            if (r3 == 0) goto L_0x00be
            r3.getValue()     // Catch:{ Throwable -> 0x00c9 }
        L_0x00be:
            java.lang.String r3 = "X-SS-REQ-TICKET"
            com.bytedance.retrofit2.client.Header r3 = r1.getFirstHeader(r3)     // Catch:{ Throwable -> 0x00c9 }
            if (r3 == 0) goto L_0x00c9
            r3.getValue()     // Catch:{ Throwable -> 0x00c9 }
        L_0x00c9:
            java.lang.String r0 = r23.getUrl()     // Catch:{ Throwable -> 0x01c1 }
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r6 = r3.getHost()     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r7 = com.bytedance.ttnet.a.b()     // Catch:{ Throwable -> 0x01c1 }
            boolean r6 = r6.endsWith(r7)     // Catch:{ Throwable -> 0x01c1 }
            if (r6 != 0) goto L_0x00e0
            return
        L_0x00e0:
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r8 = "Set-Cookie"
            r7[r5] = r8     // Catch:{ Throwable -> 0x01c1 }
            r8 = 2
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r10 = "sessionid"
            r9[r5] = r10     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r10 = "tt_sessionid"
            r9[r6] = r10     // Catch:{ Throwable -> 0x01c1 }
            r10 = 0
        L_0x00f3:
            if (r10 > 0) goto L_0x01c0
            r11 = r7[r10]     // Catch:{ Throwable -> 0x01c1 }
            java.util.List r11 = r1.headers(r11)     // Catch:{ Throwable -> 0x01c1 }
            if (r11 == 0) goto L_0x01bb
            int r12 = r11.size()     // Catch:{ Throwable -> 0x01c1 }
            if (r12 <= 0) goto L_0x01bb
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Throwable -> 0x01c1 }
        L_0x0107:
            boolean r12 = r11.hasNext()     // Catch:{ Throwable -> 0x01c1 }
            if (r12 == 0) goto L_0x01bb
            java.lang.Object r12 = r11.next()     // Catch:{ Throwable -> 0x01c1 }
            com.bytedance.retrofit2.client.Header r12 = (com.bytedance.retrofit2.client.Header) r12     // Catch:{ Throwable -> 0x01c1 }
            r13 = 0
        L_0x0114:
            if (r13 >= r8) goto L_0x0107
            r14 = r9[r13]     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r15 = r12.getValue()     // Catch:{ Throwable -> 0x01c1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r8 = ".*((("
            r4.<init>(r8)     // Catch:{ Throwable -> 0x01c1 }
            r4.append(r14)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r8 = "=[^;]*)|("
            r4.append(r8)     // Catch:{ Throwable -> 0x01c1 }
            r4.append(r14)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r8 = "=\"[\";]*))|("
            r4.append(r8)     // Catch:{ Throwable -> 0x01c1 }
            r4.append(r14)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r8 = "=.*$)).*"
            r4.append(r8)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x01c1 }
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Throwable -> 0x01c1 }
            java.util.regex.Matcher r4 = r4.matcher(r15)     // Catch:{ Throwable -> 0x01c1 }
            boolean r8 = r4.matches()     // Catch:{ Throwable -> 0x01c1 }
            if (r8 == 0) goto L_0x0152
            java.lang.String r4 = r4.group(r6)     // Catch:{ Throwable -> 0x01c1 }
            goto L_0x0153
        L_0x0152:
            r4 = 0
        L_0x0153:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x01c1 }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x01c1 }
            if (r4 != 0) goto L_0x01b6
            int r19 = r1.getStatus()     // Catch:{ Throwable -> 0x01c1 }
            boolean r4 = r2.y     // Catch:{ Throwable -> 0x01c1 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01c1 }
            r8.<init>()     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r14 = r3.getEncodedQuery()     // Catch:{ Throwable -> 0x0176 }
            boolean r15 = com.bytedance.common.utility.StringUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x0176 }
            if (r15 != 0) goto L_0x0176
            java.lang.String r15 = "url_query"
            r8.put(r15, r14)     // Catch:{ Throwable -> 0x0176 }
        L_0x0176:
            java.lang.String r14 = r2.f19730a     // Catch:{ Throwable -> 0x01c1 }
            boolean r14 = com.bytedance.common.utility.StringUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x01c1 }
            if (r14 != 0) goto L_0x0185
            java.lang.String r14 = "remote_ip"
            java.lang.String r15 = r2.f19730a     // Catch:{ Throwable -> 0x01c1 }
            r8.put(r14, r15)     // Catch:{ Throwable -> 0x01c1 }
        L_0x0185:
            java.util.List r14 = r1.getHeaders()     // Catch:{ Throwable -> 0x01c1 }
            if (r14 == 0) goto L_0x0198
            java.lang.String r14 = "header_list"
            java.util.List r15 = r1.getHeaders()     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r15 = r15.toString()     // Catch:{ Throwable -> 0x01c1 }
            r8.put(r14, r15)     // Catch:{ Throwable -> 0x01c1 }
        L_0x0198:
            java.lang.String r14 = "?"
            int r14 = r0.indexOf(r14)     // Catch:{ Throwable -> 0x01c1 }
            r15 = -1
            if (r14 != r15) goto L_0x01a5
            int r14 = r0.length()     // Catch:{ Throwable -> 0x01c1 }
        L_0x01a5:
            java.lang.String r18 = r0.substring(r5, r14)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r17 = "set_cookie"
            com.bytedance.ttnet.utils.e$a r16 = com.bytedance.ttnet.utils.e.f22672a     // Catch:{ Throwable -> 0x01c1 }
            if (r16 == 0) goto L_0x01b6
            r20 = r4
            r21 = r8
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01c1 }
        L_0x01b6:
            int r13 = r13 + 1
            r8 = 2
            goto L_0x0114
        L_0x01bb:
            int r10 = r10 + 1
            r8 = 2
            goto L_0x00f3
        L_0x01c0:
            return
        L_0x01c1:
            return
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.retrofit.SsInterceptor.intercept(com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.SsResponse):void");
    }
}
