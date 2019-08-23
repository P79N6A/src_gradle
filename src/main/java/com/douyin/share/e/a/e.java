package com.douyin.share.e.a;

public final class e {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[SYNTHETIC, Splitter:B:28:0x0062] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r4) {
        /*
            java.lang.String r0 = r4.thumbUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000c
            java.lang.String r4 = r4.thumbUrl
            goto L_0x0077
        L_0x000c:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.videoCover
            r1 = 0
            if (r0 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.videoCover
            java.util.List r0 = r0.getUrlList()
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            r2 = 0
            if (r0 == 0) goto L_0x0028
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0028
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0028:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r4.thumb4Share
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.thumb4Share
            java.util.List r0 = r0.getUrlList()
        L_0x0038:
            if (r0 == 0) goto L_0x0047
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0047
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0076
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r4.extraParams
            if (r1 == 0) goto L_0x0076
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r4.extraParams
            java.lang.String r1 = "cover_thumb"
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0076
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0076 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0076 }
            org.json.JSONObject r4 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = "url_list"
            org.json.JSONArray r4 = r4.getJSONArray(r1)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = r4.getString(r2)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0077
        L_0x0076:
            r4 = r0
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.douyin.share.e.a.e.a(com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct):java.lang.String");
    }
}
