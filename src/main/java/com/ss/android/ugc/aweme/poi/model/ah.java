package com.ss.android.ugc.aweme.poi.model;

import a.g;
import android.os.Handler;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.a.l;
import java.util.ArrayList;
import java.util.List;

public final class ah implements g<List<Object>, Void> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59873a;

    /* renamed from: b  reason: collision with root package name */
    Handler f59874b;

    /* renamed from: c  reason: collision with root package name */
    int f59875c = 65281;

    /* renamed from: d  reason: collision with root package name */
    int f59876d;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: com.ss.android.ugc.aweme.poi.model.an} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.ss.android.ugc.aweme.poi.model.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.ss.android.ugc.aweme.poi.model.PoiDetail} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object then(a.i r16) throws java.lang.Exception {
        /*
            r15 = this;
            r7 = r15
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f59873a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<a.i> r1 = a.i.class
            r5[r10] = r1
            java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
            r3 = 0
            r4 = 65128(0xfe68, float:9.1264E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f59873a
            r3 = 0
            r4 = 65128(0xfe68, float:9.1264E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<a.i> r1 = a.i.class
            r5[r10] = r1
            java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Void r0 = (java.lang.Void) r0
            return r0
        L_0x0036:
            android.os.Handler r0 = r7.f59874b
            r1 = 0
            if (r0 != 0) goto L_0x003c
            return r1
        L_0x003c:
            android.os.Handler r0 = r7.f59874b
            int r2 = r7.f59875c
            android.os.Message r0 = r0.obtainMessage(r2)
            boolean r2 = r16.c()
            if (r2 != 0) goto L_0x022e
            boolean r2 = r16.d()
            if (r2 == 0) goto L_0x005b
            java.lang.Exception r2 = r16.f()
            r0.obj = r2
            com.ss.android.ugc.aweme.poi.e.o.a()
            goto L_0x0233
        L_0x005b:
            r0.obj = r1
            java.lang.Object r2 = r16.e()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x022e
            int r3 = r2.size()
            r4 = 4
            if (r3 != r4) goto L_0x022e
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
        L_0x0074:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x009e
            java.lang.Object r8 = r2.next()
            boolean r11 = r8 instanceof com.ss.android.ugc.aweme.poi.model.PoiDetail
            if (r11 == 0) goto L_0x0086
            r3 = r8
            com.ss.android.ugc.aweme.poi.model.PoiDetail r3 = (com.ss.android.ugc.aweme.poi.model.PoiDetail) r3
            goto L_0x0074
        L_0x0086:
            boolean r11 = r8 instanceof com.ss.android.ugc.aweme.poi.model.i
            if (r11 == 0) goto L_0x008e
            r6 = r8
            com.ss.android.ugc.aweme.poi.model.i r6 = (com.ss.android.ugc.aweme.poi.model.i) r6
            goto L_0x0074
        L_0x008e:
            boolean r11 = r8 instanceof com.ss.android.ugc.aweme.poi.model.an
            if (r11 == 0) goto L_0x0096
            r4 = r8
            com.ss.android.ugc.aweme.poi.model.an r4 = (com.ss.android.ugc.aweme.poi.model.an) r4
            goto L_0x0074
        L_0x0096:
            boolean r11 = r8 instanceof com.ss.android.ugc.aweme.poi.model.s
            if (r11 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.poi.model.s r8 = (com.ss.android.ugc.aweme.poi.model.s) r8
            r5 = r8
            goto L_0x0074
        L_0x009e:
            if (r3 == 0) goto L_0x0223
            java.lang.String r2 = r3.getPoiId()
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00ac
            goto L_0x0223
        L_0x00ac:
            if (r3 == 0) goto L_0x021d
            com.ss.android.ugc.aweme.newfollow.e.c r2 = new com.ss.android.ugc.aweme.newfollow.e.c
            r2.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            boolean r12 = r3.isDestination()
            r3.isCertificated()
            r3.setPoiActivityResponse(r4)
            int r4 = r7.f59876d
            r3.setFeedType(r4)
            r8.add(r10, r3)
            boolean r4 = r3.hasValidProduct()
            if (r4 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.poi.a.g r4 = new com.ss.android.ugc.aweme.poi.a.g
            com.ss.android.ugc.aweme.poi.model.am r13 = r3.productInfo
            java.lang.String r14 = r3.getPoiId()
            r4.<init>(r13, r14)
            r8.add(r4)
        L_0x00e3:
            if (r12 != 0) goto L_0x010b
            java.util.List r4 = r3.getRecommendPhoto()
            boolean r4 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x010b
            com.ss.android.ugc.aweme.poi.a.i r4 = new com.ss.android.ugc.aweme.poi.a.i
            int r13 = r3.getPoiType()
            r4.<init>(r13)
            java.lang.String r13 = r3.getRecommendTitle()
            r4.f59404d = r13
            java.util.List r13 = r3.getRecommendPhoto()
            r4.f59402b = r13
            java.lang.String r13 = r3.getPoiId()
            r4.f59406f = r13
            goto L_0x010c
        L_0x010b:
            r4 = r1
        L_0x010c:
            if (r12 != 0) goto L_0x015c
            boolean r12 = r3.isUseNewDetailStyle()
            if (r12 == 0) goto L_0x015c
            if (r4 == 0) goto L_0x011b
            r4.f59405e = r10
            r8.add(r4)
        L_0x011b:
            if (r5 == 0) goto L_0x0135
            int r4 = r5.a()
            if (r4 <= 0) goto L_0x0135
            com.ss.android.ugc.aweme.poi.a.b r4 = new com.ss.android.ugc.aweme.poi.a.b
            java.util.List<com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct> r12 = r5.f59943b
            r4.<init>(r12)
            java.lang.String r12 = r3.getPoiId()
            com.ss.android.ugc.aweme.poi.a.b r4 = r4.setPoiId(r12)
            r3.setActs(r4)
        L_0x0135:
            java.util.List r4 = r3.get3rdCommentList()
            boolean r12 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
            if (r12 != 0) goto L_0x0161
            r4.size()
            com.ss.android.ugc.aweme.poi.a.d r12 = new com.ss.android.ugc.aweme.poi.a.d
            r12.<init>(r10, r9)
            r8.add(r12)
            java.lang.Object r4 = r4.get(r10)
            com.ss.android.ugc.aweme.poi.model.o r4 = (com.ss.android.ugc.aweme.poi.model.o) r4
            java.lang.String r12 = "1"
            r4.setCommentId(r12)
            r4.setHasDivider(r9)
            r8.add(r4)
            goto L_0x0161
        L_0x015c:
            if (r4 == 0) goto L_0x0161
            r8.add(r4)
        L_0x0161:
            com.ss.android.ugc.aweme.poi.e.o$a r4 = new com.ss.android.ugc.aweme.poi.e.o$a
            r4.<init>()
            long r12 = r3.getDuration()
            r4.f59826b = r12
            java.lang.String r12 = r3.getRequestId()
            r4.f59827c = r12
            java.lang.String r12 = "poi_detail"
            r4.f59825a = r12
            r11.add(r4)
            if (r5 == 0) goto L_0x0193
            int r4 = r5.a()
            if (r4 <= 0) goto L_0x0193
            com.ss.android.ugc.aweme.poi.a.b r4 = new com.ss.android.ugc.aweme.poi.a.b
            java.util.List<com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct> r5 = r5.f59943b
            r4.<init>(r5)
            java.lang.String r5 = r3.getPoiId()
            com.ss.android.ugc.aweme.poi.a.b r4 = r4.setPoiId(r5)
            r3.setActs(r4)
        L_0x0193:
            if (r6 == 0) goto L_0x0206
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r6.f59920b
            r2.f57105e = r5
            int r5 = r6.f59921c
            long r12 = (long) r5
            r2.f57103c = r12
            int r5 = r6.f59921c
            long r12 = (long) r5
            r2.f57104d = r12
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r6.f59919a
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01ee
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r6.f59919a
            java.util.Iterator r5 = r5.iterator()
            r12 = 0
        L_0x01b7:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x01ea
            java.lang.Object r13 = r5.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = (com.ss.android.ugc.aweme.feed.model.Aweme) r13
            boolean r14 = com.ss.android.ugc.aweme.newfollow.a.b.j(r13)
            if (r14 == 0) goto L_0x01b7
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r14 = new com.ss.android.ugc.aweme.follow.presenter.FollowFeed
            r14.<init>(r13)
            java.lang.String r13 = r6.getRequestId()
            r14.setRequestId(r13)
            r4.add(r14)
            if (r10 != 0) goto L_0x01e7
            r13 = 2
            if (r12 != r13) goto L_0x01e7
            com.ss.android.ugc.aweme.poi.a.l r13 = r15.a(r3, r9)
            if (r13 == 0) goto L_0x01e7
            r4.add(r13)
            r10 = 1
        L_0x01e7:
            int r12 = r12 + 1
            goto L_0x01b7
        L_0x01ea:
            r8.addAll(r4)
            goto L_0x01ef
        L_0x01ee:
            r9 = 0
        L_0x01ef:
            com.ss.android.ugc.aweme.poi.e.o$a r4 = new com.ss.android.ugc.aweme.poi.e.o$a
            r4.<init>()
            long r12 = r6.f59923e
            r4.f59826b = r12
            java.lang.String r5 = r6.getRequestId()
            r4.f59827c = r5
            java.lang.String r5 = "poi_aweme"
            r4.f59825a = r5
            r11.add(r4)
            goto L_0x0207
        L_0x0206:
            r9 = 0
        L_0x0207:
            if (r10 != 0) goto L_0x0212
            com.ss.android.ugc.aweme.poi.a.l r4 = r15.a(r3, r9)
            if (r4 == 0) goto L_0x0212
            r8.add(r4)
        L_0x0212:
            r3.parseAdRawData()
            com.ss.android.ugc.aweme.poi.e.o.a((java.util.List<com.ss.android.ugc.aweme.poi.e.o.a>) r11)
            r2.f57102b = r8
            r0.obj = r2
            goto L_0x0233
        L_0x021d:
            r0.obj = r1
            com.ss.android.ugc.aweme.poi.e.o.a()
            goto L_0x0233
        L_0x0223:
            r0.obj = r1
            com.ss.android.ugc.aweme.poi.e.o.a()
            android.os.Handler r2 = r7.f59874b
            r2.sendMessage(r0)
            return r1
        L_0x022e:
            r0.obj = r1
            com.ss.android.ugc.aweme.poi.e.o.a()
        L_0x0233:
            android.os.Handler r2 = r7.f59874b
            r2.sendMessage(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.ah.then(a.i):java.lang.Object");
    }

    private l a(PoiDetail poiDetail, boolean z) {
        if (PatchProxy.isSupport(new Object[]{poiDetail, Byte.valueOf(z ? (byte) 1 : 0)}, this, f59873a, false, 65130, new Class[]{PoiDetail.class, Boolean.TYPE}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{poiDetail, Byte.valueOf(z)}, this, f59873a, false, 65130, new Class[]{PoiDetail.class, Boolean.TYPE}, l.class);
        } else if (poiDetail.getPoiActivityInfo() == null || poiDetail.getPoiActivityInfo().getAdCard() == null) {
            return null;
        } else {
            a adCard = poiDetail.getPoiActivityInfo().getAdCard();
            if (CollectionUtils.isEmpty(adCard.getRawDatas())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String next : adCard.getRawDatas()) {
                AwemeRawAd awemeRawAd = a.getAwemeRawAd(next);
                if (awemeRawAd != null) {
                    if (awemeRawAd.isNewStyleAd()) {
                        arrayList.add(awemeRawAd);
                    } else {
                        adCard.setRawData(next);
                    }
                }
            }
            if (CollectionUtils.isEmpty(arrayList)) {
                return null;
            }
            l lVar = new l(arrayList, adCard.getTitle(), z);
            lVar.f59411b = arrayList;
            return lVar;
        }
    }

    public ah(Handler handler, int i, int i2) {
        this.f59874b = handler;
        this.f59876d = i2;
    }
}
