package com.ss.android.ugc.aweme.fe.method.commerce;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/commerce/GetGoodsInfoMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "getTopFeedPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimplePromotion;", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GetGoodsInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44543a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44544b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/commerce/GetGoodsInfoMethod$Companion;", "", "()V", "GET_GOODS_INTO", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public GetGoodsInfoMethod() {
        this(null, 1);
    }

    public GetGoodsInfoMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    private /* synthetic */ GetGoodsInfoMethod(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        if (r0 == null) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable org.json.JSONObject r20, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f44543a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r4 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 39857(0x9bb1, float:5.5852E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f44543a
            r15 = 0
            r16 = 39857(0x9bb1, float:5.5852E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r4 = f44543a
            r5 = 0
            r6 = 39858(0x9bb2, float:5.5853E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.x> r8 = com.ss.android.ugc.aweme.commerce.service.models.x.class
            r3 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x006e
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r4 = f44543a
            r5 = 0
            r6 = 39858(0x9bb2, float:5.5853E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.x> r8 = com.ss.android.ugc.aweme.commerce.service.models.x.class
            r3 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.commerce.service.models.x r0 = (com.ss.android.ugc.aweme.commerce.service.models.x) r0
            goto L_0x007a
        L_0x006e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.commercialize.utils.s.a()
            if (r0 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.commerce.service.models.x r0 = r0.getPromotion()
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "code"
            r2.put(r0, r10)
            goto L_0x00cb
        L_0x0087:
            java.lang.String r3 = "code"
            r2.put(r3, r11)
            com.ss.android.ugc.aweme.commerce.service.models.PromotionVisitor r3 = r0.getVisitor()
            java.lang.String r4 = "goodsInfo"
            java.lang.String r6 = r0.getElasticTitle()
            java.lang.String r7 = r0.getTitle()
            java.util.List r8 = r0.getElasticImages()
            java.util.List r10 = r0.getLabels()
            if (r3 == 0) goto L_0x00aa
            java.util.List r0 = r3.getAvatars()
            if (r0 != 0) goto L_0x00ae
        L_0x00aa:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00ae:
            if (r3 == 0) goto L_0x00b5
            long r11 = r3.getCount()
            goto L_0x00b7
        L_0x00b5:
            r11 = 0
        L_0x00b7:
            com.ss.android.ugc.aweme.commerce.service.models.PromotionVisitor r3 = new com.ss.android.ugc.aweme.commerce.service.models.PromotionVisitor
            r3.<init>(r0, r11)
            com.ss.android.ugc.aweme.commerce.service.models.d r0 = new com.ss.android.ugc.aweme.commerce.service.models.d
            r9 = 0
            r5 = r0
            r11 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            r2.put(r4, r0)
        L_0x00cb:
            r1.a((org.json.JSONObject) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.commerce.GetGoodsInfoMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
