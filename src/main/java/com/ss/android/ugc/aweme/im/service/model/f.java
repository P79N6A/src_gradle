package com.ss.android.ugc.aweme.im.service.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Deprecated
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52890a;
    @SerializedName("normal")

    /* renamed from: b  reason: collision with root package name */
    public UrlModel f52891b;
    @SerializedName("high")

    /* renamed from: c  reason: collision with root package name */
    public UrlModel f52892c;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(@android.support.annotation.NonNull com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel r2) {
        /*
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L_0x0006
            return
        L_0x0006:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r0 = r2.getNormal()     // Catch:{ a -> 0x0010 }
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = a(r0)     // Catch:{ a -> 0x0010 }
            r1.f52891b = r0     // Catch:{ a -> 0x0010 }
        L_0x0010:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r2 = r2.getHigh()     // Catch:{ a -> 0x001b }
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = a(r2)     // Catch:{ a -> 0x001b }
            r1.f52892c = r2     // Catch:{ a -> 0x001b }
            return
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.model.f.<init>(com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:7|8|9|10|11|12|13|14|16|17|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.base.model.UrlModel a(com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f52890a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel> r3 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r8 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r3 = 0
            r5 = 1
            r6 = 54435(0xd4a3, float:7.628E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f52890a
            r13 = 1
            r14 = 54435(0xd4a3, float:7.628E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel> r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r16 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            return r0
        L_0x0035:
            if (r17 != 0) goto L_0x0039
            r0 = 0
            return r0
        L_0x0039:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r1.<init>()
            java.lang.Integer r2 = r17.getHeight()     // Catch:{ a -> 0x0049 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0049 }
            r1.setHeight(r2)     // Catch:{ a -> 0x0049 }
        L_0x0049:
            java.lang.String r2 = r17.getUri()     // Catch:{ a -> 0x0050 }
            r1.setUri(r2)     // Catch:{ a -> 0x0050 }
        L_0x0050:
            java.lang.String r2 = r17.getUrlKey()     // Catch:{ a -> 0x0057 }
            r1.setUrlKey(r2)     // Catch:{ a -> 0x0057 }
        L_0x0057:
            java.util.List r2 = r17.getUrlList()
            r1.setUrlList(r2)
            java.lang.Integer r0 = r17.getWidth()     // Catch:{ a -> 0x0069 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0069 }
            r1.setWidth(r0)     // Catch:{ a -> 0x0069 }
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.model.f.a(com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel):com.ss.android.ugc.aweme.base.model.UrlModel");
    }
}
