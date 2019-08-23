package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.a.e;
import com.ss.android.ugc.aweme.poi.api.PoiCommentFeedApi;
import java.util.List;

public class q extends a<o, e> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59940a;

    /* renamed from: b  reason: collision with root package name */
    static final PoiCommentFeedApi f59941b = ((PoiCommentFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiCommentFeedApi.class));

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public final String a() {
        if (this.mData == null) {
            return "";
        }
        return ((e) this.mData).f59396d;
    }

    public List<o> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((e) this.mData).f59395c;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((e) this.mData).f59394b) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public q clone() {
        if (PatchProxy.isSupport(new Object[0], this, f59940a, false, 65033, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], this, f59940a, false, 65033, new Class[0], q.class);
        }
        try {
            q qVar = (q) super.clone();
            qVar.mData = ((e) this.mData).clone();
            return qVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f59940a, false, 65029, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f59940a, false, 65029, new Class[]{String.class}, Void.TYPE);
            return;
        }
        PoiCommentFeedApi poiCommentFeedApi = f59941b;
        long j = 1;
        if (!CollectionUtils.isEmpty(getItems())) {
            j = 1 + ((e) this.mData).f59397e;
        }
        poiCommentFeedApi.getCommentList(str, 20, j).a((g<TResult, TContinuationResult>) new p<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59940a, false, 65031, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f59940a, false, 65031, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (checkParams(objArr, 2)) {
            a(objArr[1]);
        }
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59940a, false, 65030, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f59940a, false, 65030, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (checkParams(objArr, 2)) {
            a(objArr[1]);
        }
    }

    public /* synthetic */ void handleData(Object obj) {
        boolean z;
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f59940a, false, 65032, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f59940a, false, 65032, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (eVar == null || CollectionUtils.isEmpty(eVar.f59395c)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((e) this.mData).f59395c.clear();
            }
            int i = this.mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        this.mData = eVar;
                        return;
                    case 2:
                        eVar.f59395c.addAll(getItems());
                        ((e) this.mData).f59395c = eVar.f59395c;
                        return;
                    default:
                        return;
                }
            } else {
                ((e) this.mData).f59395c.addAll(eVar.f59395c);
                ((e) this.mData).f59394b &= eVar.f59394b;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = null;
            }
            if (!(this.mData == null || this.mListQueryType == 2)) {
                ((e) this.mData).f59394b = false;
            }
        }
    }
}
