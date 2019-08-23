package com.douyin.share.a.c;

import android.content.Context;

public class k extends l {

    /* renamed from: b  reason: collision with root package name */
    private final String f23152b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23153c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f23154d = {"@%s 发了一个抖音短视频，你尽管点开，不好看算我输！戳这里>>", "看了这么多抖音，还是@%s的最好玩了", "嘘！悄悄点开@%s这个抖音短视频就好。", "好看的皮囊千篇一律，@%s的抖音百看不腻！", "@[%s]的这个抖音短视频富含100吨的有趣，请迅速拆包食用！", "@%s的这个抖音短视频富含100吨的有趣，请迅速拆包食用！", "这可能是@%s最想让你看到的一条抖音了！", "一刷到@%s的抖音就想到你了, 一起来看看?"};

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.douyin.share.a.b.b.c r12) {
        /*
            r11 = this;
            boolean r0 = r11.a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.bytedance.wttsharesdk.entity.d r0 = new com.bytedance.wttsharesdk.entity.d
            r0.<init>()
            java.lang.String r2 = "sdk_app_key"
            java.lang.String r3 = r11.f23152b
            com.bytedance.wttsharesdk.entity.d r2 = r0.a(r2, r3)
            java.lang.String r3 = "sdk_version"
            java.lang.String r4 = "1.0.0"
            com.bytedance.wttsharesdk.entity.d r2 = r2.a(r3, r4)
            java.lang.String r3 = "sdk_source"
            java.lang.String r4 = r11.f23153c
            r2.a(r3, r4)
            com.bytedance.wttsharesdk.c r2 = new com.bytedance.wttsharesdk.c
            android.app.Activity r3 = r12.f23136b
            r2.<init>(r3, r0)
            com.bytedance.wttsharesdk.d r0 = new com.bytedance.wttsharesdk.d
            r0.<init>()
            com.bytedance.wttsharesdk.entity.RepostEntity r3 = new com.bytedance.wttsharesdk.entity.RepostEntity
            r3.<init>()
            r0.mRepostEntity = r3
            com.bytedance.wttsharesdk.entity.RepostEntity r3 = r0.mRepostEntity
            java.lang.String r4 = r12.b()
            r3.url = r4
            com.bytedance.wttsharesdk.entity.RepostEntity r3 = r0.mRepostEntity
            r4 = 0
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r5 = r12.f23135a
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.videoCover
            java.util.List r5 = r5.getUrlList()
            if (r5 == 0) goto L_0x0058
            boolean r6 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0058
            java.lang.Object r4 = r5.get(r1)
            java.lang.String r4 = (java.lang.String) r4
        L_0x0058:
            r3.cover_url = r4
            java.lang.String r3 = r12.a()
            java.lang.String r4 = r12.d()
            r5 = 1
            if (r4 == 0) goto L_0x0083
            if (r3 != 0) goto L_0x0068
            goto L_0x0083
        L_0x0068:
            java.lang.String[] r6 = r11.f23154d
            int r7 = r6.length
            r8 = 0
        L_0x006c:
            if (r8 >= r7) goto L_0x0083
            r9 = r6[r8]
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r1] = r3
            java.lang.String r9 = java.lang.String.format(r9, r10)
            boolean r9 = android.text.TextUtils.equals(r9, r4)
            if (r9 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0084
        L_0x0080:
            int r8 = r8 + 1
            goto L_0x006c
        L_0x0083:
            r3 = 0
        L_0x0084:
            if (r3 == 0) goto L_0x008f
            com.bytedance.wttsharesdk.entity.RepostEntity r3 = r0.mRepostEntity
            java.lang.String r12 = r12.d()
            r3.title = r12
            goto L_0x00a8
        L_0x008f:
            com.bytedance.wttsharesdk.entity.RepostEntity r3 = r0.mRepostEntity
            java.lang.String r4 = "@%s:%s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r12.a()
            r6[r1] = r7
            java.lang.String r12 = r12.d()
            r6[r5] = r12
            java.lang.String r12 = java.lang.String.format(r4, r6)
            r3.title = r12
        L_0x00a8:
            com.bytedance.wttsharesdk.entity.RepostEntity r12 = r0.mRepostEntity
            r12.is_video = r5
            android.app.Activity r12 = r2.f22932a
            if (r12 == 0) goto L_0x014b
            android.app.Activity r12 = r2.f22932a
            boolean r12 = com.bytedance.wttsharesdk.a.a(r12)
            if (r12 == 0) goto L_0x014b
            android.app.Activity r12 = r2.f22932a
            boolean r12 = com.bytedance.wttsharesdk.a.c(r12)
            if (r12 == 0) goto L_0x014b
            com.bytedance.wttsharesdk.entity.d r12 = r2.f22933b
            if (r12 == 0) goto L_0x014b
            com.bytedance.wttsharesdk.entity.d r12 = r2.f22933b
            org.json.JSONObject r3 = r12.f22937a
            java.lang.String r4 = "sdk_version"
            boolean r3 = r3.has(r4)
            if (r3 == 0) goto L_0x00e5
            org.json.JSONObject r3 = r12.f22937a
            java.lang.String r4 = "sdk_source"
            boolean r3 = r3.has(r4)
            if (r3 == 0) goto L_0x00e5
            org.json.JSONObject r12 = r12.f22937a
            java.lang.String r3 = "sdk_app_key"
            boolean r12 = r12.has(r3)
            if (r12 == 0) goto L_0x00e5
            r1 = 1
        L_0x00e5:
            if (r1 != 0) goto L_0x00e8
            goto L_0x014b
        L_0x00e8:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            android.os.Bundle r0 = r0.toBundle(r12)
            r12.putAll(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.app.Activity r1 = r2.f22932a
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".wttsharesdk.WttShareActivity"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.content.ComponentName r1 = new android.content.ComponentName
            android.app.Activity r3 = r2.f22932a
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setComponent(r1)
            java.lang.String r1 = "toutiao_share_startactivity"
            android.app.Activity r3 = r2.f22932a
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0.putExtra(r1, r3)
            java.lang.String r1 = "toutiao_share_packagename"
            android.app.Activity r3 = r2.f22932a
            java.lang.String r3 = r3.getPackageName()
            r0.putExtra(r1, r3)
            java.lang.String r1 = "toutiao_share_sdk_params"
            com.bytedance.wttsharesdk.entity.d r3 = r2.f22933b
            java.lang.String r3 = r3.toString()
            r0.putExtra(r1, r3)
            r0.putExtras(r12)
            android.app.Activity r12 = r2.f22932a
            r12.startActivity(r0)
        L_0x014b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.douyin.share.a.c.k.a(com.douyin.share.a.b.b.c):boolean");
    }

    public k(Context context, String str, String str2) {
        super(context);
        this.f23152b = str;
        this.f23153c = str2;
    }
}
