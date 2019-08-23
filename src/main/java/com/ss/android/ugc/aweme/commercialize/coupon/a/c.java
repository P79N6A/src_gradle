package com.ss.android.ugc.aweme.commercialize.coupon.a;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi;
import com.ss.android.ugc.aweme.commercialize.coupon.model.e;
import com.ss.android.ugc.aweme.common.f.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class c extends a<com.ss.android.ugc.aweme.commercialize.coupon.model.c, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38545a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38546b;

    /* renamed from: c  reason: collision with root package name */
    public int f38547c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.commercialize.coupon.model.c> f38548d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private boolean f38549e = false;

    /* renamed from: f  reason: collision with root package name */
    private int f38550f;

    public List<com.ss.android.ugc.aweme.commercialize.coupon.model.c> getItems() {
        return this.f38548d;
    }

    public boolean isHasMore() {
        return this.f38549e;
    }

    private void a(boolean z) {
        if (z) {
            this.f38546b = false;
        }
        this.mIsNewDataEmpty = true;
        this.f38549e = false;
        this.f38550f = 1;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public c(boolean z) {
        int i = 1;
        this.f38550f = 1;
        this.f38546b = false;
        this.f38547c = !z ? 4 : i;
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f38545a, false, 30456, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f38545a, false, 30456, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(this.f38550f);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f38545a, false, 30455, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f38545a, false, 30455, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(1);
    }

    private void a(final int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38545a, false, 30457, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38545a, false, 30457, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38551a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f38551a, false, 30460, new Class[0], Object.class)) {
                    return CouponApi.a(i, 10, c.this.f38547c);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f38551a, false, 30460, new Class[0], Object.class);
            }
        }, 0);
    }

    public /* synthetic */ void handleData(Object obj) {
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f38545a, false, 30458, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f38545a, false, 30458, new Class[]{e.class}, Void.TYPE);
        } else if (eVar == null) {
            a(true);
        } else {
            this.f38549e = eVar.f38590c;
            this.f38546b = eVar.f38589b;
            if (CollectionUtils.isEmpty(eVar.f38588a)) {
                a(false);
                return;
            }
            if (this.mListQueryType == 1) {
                this.f38548d.clear();
                this.f38550f = 1;
            }
            this.f38550f++;
            this.f38548d.addAll(eVar.f38588a);
        }
    }
}
