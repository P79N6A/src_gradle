package com.ss.android.ugc.aweme.poi.ui.accelerate;

import a.g;
import a.i;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.e.c;
import com.ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.ss.android.ugc.aweme.poi.b;
import com.ss.android.ugc.aweme.poi.e.o;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class j extends com.ss.android.ugc.aweme.common.a<l> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60531a;

    /* renamed from: b  reason: collision with root package name */
    static final PoiFeedApi f60532b = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiFeedApi.class));

    /* renamed from: c  reason: collision with root package name */
    private int f60533c;

    static class a implements g<Object, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60534a;

        /* renamed from: b  reason: collision with root package name */
        Handler f60535b;

        /* renamed from: c  reason: collision with root package name */
        int f60536c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f60537d;

        private void a(PoiDetail poiDetail) {
            PoiDetail poiDetail2 = poiDetail;
            if (PatchProxy.isSupport(new Object[]{poiDetail2}, this, f60534a, false, 66232, new Class[]{PoiDetail.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{poiDetail2}, this, f60534a, false, 66232, new Class[]{PoiDetail.class}, Void.TYPE);
            } else if (poiDetail.getPoiActivityInfo() != null && poiDetail.getPoiActivityInfo().getAdCard() != null) {
                com.ss.android.ugc.aweme.poi.model.a adCard = poiDetail.getPoiActivityInfo().getAdCard();
                if (!CollectionUtils.isEmpty(adCard.getRawDatas())) {
                    ArrayList arrayList = new ArrayList();
                    for (String next : adCard.getRawDatas()) {
                        AwemeRawAd awemeRawAd = com.ss.android.ugc.aweme.poi.model.a.getAwemeRawAd(next);
                        if (awemeRawAd != null) {
                            if (awemeRawAd.isNewStyleAd()) {
                                arrayList.add(awemeRawAd);
                            } else {
                                adCard.setRawData(next);
                            }
                        }
                    }
                    poiDetail.parseAdRawData();
                    if (!CollectionUtils.isEmpty(arrayList)) {
                        poiDetail2.setAwemeRawAds(arrayList);
                    }
                }
            }
        }

        public final /* synthetic */ Object then(i iVar) throws Exception {
            com.ss.android.ugc.aweme.poi.a.i iVar2;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f60534a, false, 66231, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f60534a, false, 66231, new Class[]{i.class}, Void.class);
            } else if (this.f60535b == null) {
                return null;
            } else {
                Message obtainMessage = this.f60535b.obtainMessage(this.f60536c);
                if (!iVar.c() && !iVar.d()) {
                    obtainMessage.obj = null;
                    Object e2 = iVar.e();
                    if (e2 != null && (e2 instanceof PoiDetail)) {
                        PoiDetail poiDetail = (PoiDetail) e2;
                        if (poiDetail == null || StringUtils.isEmpty(poiDetail.getPoiId())) {
                            obtainMessage.obj = null;
                            o.a();
                            this.f60535b.sendMessage(obtainMessage);
                            return null;
                        }
                        if (poiDetail != null) {
                            c cVar = new c();
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            poiDetail.setFeedType(this.f60537d);
                            arrayList.add(0, poiDetail);
                            if (poiDetail.hasValidProduct()) {
                                arrayList.add(new com.ss.android.ugc.aweme.poi.a.g(poiDetail.productInfo, poiDetail.getPoiId()));
                            }
                            if (!CollectionUtils.isEmpty(poiDetail.getRecommendPhoto())) {
                                iVar2 = new com.ss.android.ugc.aweme.poi.a.i(poiDetail.getPoiType());
                                iVar2.f59404d = poiDetail.getRecommendTitle();
                                iVar2.f59402b = poiDetail.getRecommendPhoto();
                                iVar2.f59406f = poiDetail.getPoiId();
                            } else {
                                iVar2 = null;
                            }
                            if (poiDetail.isUseNewDetailStyle()) {
                                if (iVar2 != null) {
                                    iVar2.f59405e = false;
                                    arrayList.add(iVar2);
                                }
                            } else if (iVar2 != null) {
                                arrayList.add(iVar2);
                            }
                            o.a aVar = new o.a();
                            aVar.f59826b = poiDetail.getDuration();
                            aVar.f59827c = poiDetail.getRequestId();
                            aVar.f59825a = "poi_detail";
                            arrayList2.add(aVar);
                            a(poiDetail);
                            o.a((List<o.a>) arrayList2);
                            cVar.f57102b = arrayList;
                            obtainMessage.obj = new l(cVar.f57102b);
                        } else {
                            obtainMessage.obj = null;
                            o.a();
                        }
                        this.f60535b.sendMessage(obtainMessage);
                        return null;
                    }
                }
                obtainMessage.obj = null;
                o.a();
                this.f60535b.sendMessage(obtainMessage);
                return null;
            }
        }

        a(Handler handler, int i, int i2) {
            this.f60535b = handler;
            this.f60537d = i2;
        }
    }

    public j(int i) {
        this.f60533c = i;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f60531a, false, 66230, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f60531a, false, 66230, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        b bVar = objArr[0];
        String str = bVar.f59732a;
        String str2 = bVar.f59735d;
        String str3 = bVar.f59736e;
        int i3 = bVar.f59737f;
        String str4 = bVar.f59734c;
        Aweme a2 = com.ss.android.ugc.aweme.commercialize.feed.j.a().a(str4);
        PoiFeedApi poiFeedApi = f60532b;
        switch (this.f60533c) {
            case 65440:
                i = 1;
                break;
            case 65441:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        if (a2 == null || !a2.isAd()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        poiFeedApi.getPoiDetail(str, str2, str3, "all", i, i3, i2, str4).a((g<TResult, TContinuationResult>) new a<TResult,TContinuationResult>(this.mHandler, 0, this.f60533c), (Executor) i.f1051a);
        return true;
    }
}
