package com.ss.android.ugc.aweme.poi.model;

import a.g;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.feed.model.poi.PoiFilterListResponse;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.api.PoiFilterApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class au extends a<SimplePoiInfoStruct, PoiFilterListResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59893a;

    /* renamed from: b  reason: collision with root package name */
    private String f59894b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f59895c = "";

    /* renamed from: d  reason: collision with root package name */
    private long f59896d;

    /* renamed from: e  reason: collision with root package name */
    private String f59897e = "";

    public final List<SimplePoiInfoStruct> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((PoiFilterListResponse) this.mData).poiInfoStructList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((PoiFilterListResponse) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 9) {
            return false;
        }
        return true;
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f59893a, false, 65169, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f59893a, false, 65169, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Object obj = message.obj;
        if (obj != null && (obj instanceof PoiFilterListResponse)) {
            if (TextUtils.isEmpty(this.f59897e) || this.f59897e.equalsIgnoreCase(((PoiFilterListResponse) obj).requestKey)) {
                this.mIsLoading = false;
                PoiFilterListResponse poiFilterListResponse = (PoiFilterListResponse) obj;
                handleData(poiFilterListResponse);
                if (poiFilterListResponse.exception == null && this.mNotifyListeners != null) {
                    for (p b2 : this.mNotifyListeners) {
                        b2.b();
                    }
                }
            }
        }
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59893a, false, 65167, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f59893a, false, 65167, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (this.mData != null) {
            this.f59896d = ((PoiFilterListResponse) this.mData).cursor;
        }
        a(objArr[1].intValue(), objArr[2], objArr[3], objArr[4], objArr[5], objArr[6].intValue(), objArr[7], objArr[8].intValue());
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59893a, false, 65166, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f59893a, false, 65166, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f59896d = 0;
        a(objArr[1].intValue(), objArr[2], objArr[3], objArr[4], objArr[5], objArr[6].intValue(), objArr[7], objArr[8].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(PoiFilterListResponse poiFilterListResponse) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{poiFilterListResponse}, this, f59893a, false, 65170, new Class[]{PoiFilterListResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiFilterListResponse}, this, f59893a, false, 65170, new Class[]{PoiFilterListResponse.class}, Void.TYPE);
        } else if (poiFilterListResponse.exception != null) {
            if (this.mNotifyListeners != null) {
                for (p a2 : this.mNotifyListeners) {
                    a2.a(poiFilterListResponse.exception);
                }
            }
        } else {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = poiFilterListResponse;
                if (poiFilterListResponse == null || poiFilterListResponse.poiInfoStructList == null) {
                    ((PoiFilterListResponse) this.mData).hasMore = false;
                }
            } else if (i == 4 && this.mData != null) {
                if (poiFilterListResponse != null && !CollectionUtils.isEmpty(poiFilterListResponse.poiInfoStructList)) {
                    z = false;
                }
                this.mIsNewDataEmpty = z;
                if (this.mIsNewDataEmpty) {
                    ((PoiFilterListResponse) this.mData).hasMore = false;
                    return;
                }
                b(poiFilterListResponse);
                ((PoiFilterListResponse) this.mData).cursor = poiFilterListResponse.cursor;
            }
        }
    }

    private void b(PoiFilterListResponse poiFilterListResponse) {
        if (PatchProxy.isSupport(new Object[]{poiFilterListResponse}, this, f59893a, false, 65171, new Class[]{PoiFilterListResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiFilterListResponse}, this, f59893a, false, 65171, new Class[]{PoiFilterListResponse.class}, Void.TYPE);
            return;
        }
        List<SimplePoiInfoStruct> list = ((PoiFilterListResponse) this.mData).poiInfoStructList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (SimplePoiInfoStruct simplePoiInfoStruct : list) {
            hashSet.add(simplePoiInfoStruct.poiId);
        }
        for (SimplePoiInfoStruct next : poiFilterListResponse.poiInfoStructList) {
            if (hashSet.add(next.poiId)) {
                arrayList.add(next);
            }
        }
        list.addAll(arrayList);
        if (arrayList.isEmpty()) {
            ((PoiFilterListResponse) this.mData).hasMore = false;
            return;
        }
        ((PoiFilterListResponse) this.mData).hasMore = poiFilterListResponse.hasMore & ((PoiFilterListResponse) this.mData).hasMore;
    }

    private void a(int i, String str, String str2, String str3, String str4, int i2, String str5, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2, str3, str4, Integer.valueOf(i2), str5, Integer.valueOf(i3)}, this, f59893a, false, 65168, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2, str3, str4, Integer.valueOf(i2), str5, Integer.valueOf(i3)}, this, f59893a, false, 65168, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.a f2 = af.a(d.a()).f();
        if (f2 != null) {
            this.f59895c = String.valueOf(f2.longitude);
            this.f59894b = String.valueOf(f2.latitude);
        }
        this.f59897e = String.valueOf(System.currentTimeMillis());
        if (TextUtils.isEmpty(str5)) {
            PoiFilterApi.a(i, this.f59896d, this.f59895c, this.f59894b, str, str2, str3, str4, i2).a((g<TResult, TContinuationResult>) new av<TResult,TContinuationResult>(this.mHandler, this.f59897e));
            return;
        }
        PoiFilterApi.a(i, this.f59896d, this.f59895c, this.f59894b, str, str2, str3, str4, i2, str5, i3).a((g<TResult, TContinuationResult>) new av<TResult,TContinuationResult>(this.mHandler, this.f59897e));
    }
}
