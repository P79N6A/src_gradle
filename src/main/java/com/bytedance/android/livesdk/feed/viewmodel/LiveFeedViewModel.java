package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.d.d;
import com.bytedance.android.livesdk.feed.d.f;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.d.h;
import com.bytedance.android.livesdk.feed.d.i;
import com.bytedance.android.livesdk.feed.j.b;
import com.bytedance.android.livesdk.feed.l.c;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LiveFeedViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14469a;

    /* renamed from: b  reason: collision with root package name */
    public final IFeedRepository f14470b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<Integer> f14471c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public f f14472d;

    /* renamed from: e  reason: collision with root package name */
    private final List<g> f14473e;

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f14469a, false, 9030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14469a, false, 9030, new Class[0], Void.TYPE);
            return;
        }
        this.f14470b.e().b(this.f14472d);
        this.f14472d = null;
        super.onCleared();
    }

    public LiveFeedViewModel(IFeedRepository iFeedRepository, List<g> list) {
        this.f14470b = iFeedRepository;
        this.f14473e = list;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, List list, Extra extra, boolean z) {
        int i;
        int i2;
        int i3;
        List list2 = list;
        Extra extra2 = extra;
        if (PatchProxy.isSupport(new Object[]{str, list2, extra2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f14469a, false, 9031, new Class[]{String.class, List.class, Extra.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list2, extra2, Byte.valueOf(z)}, this, f14469a, false, 9031, new Class[]{String.class, List.class, Extra.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!Lists.isEmpty(list) && extra2 != null && z) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                FeedItem feedItem = (FeedItem) it2.next();
                if (feedItem.type == 0 || feedItem.type == 22 || feedItem.type == 23 || feedItem.type == 25) {
                    it2.remove();
                }
            }
            int size = list.size();
            if (((Integer) b.f14211b.a()).intValue() != 0 || extra2.bannerContainer == null || !Lists.notEmpty(extra2.bannerContainer.f7704a)) {
                i = 0;
            } else {
                FeedItem feedItem2 = new FeedItem();
                feedItem2.type = 22;
                feedItem2.banners = extra2.bannerContainer.f7704a;
                if (list.size() <= 0 || ((FeedItem) list2.get(0)).type != 1003) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                i = i3 + 1;
                list2.add(i3, feedItem2);
            }
            if ((c.c() || c.d()) && extra2.rankRoundBanner != null) {
                FeedItem feedItem3 = new FeedItem();
                feedItem3.type = 23;
                h hVar = new h();
                hVar.f14086b = extra2.rankRoundBanner;
                feedItem3.item = hVar;
                i2 = i + 1;
                list2.add(i, feedItem3);
            } else {
                i2 = i;
            }
            if (c.c() && this.f14473e != null && !Lists.isEmpty(this.f14473e) && this.f14473e.size() > 1) {
                FeedItem feedItem4 = new FeedItem();
                feedItem4.type = 25;
                i iVar = new i();
                iVar.f14088b = this.f14473e;
                feedItem4.item = iVar;
                list2.add(i2, feedItem4);
                this.f14471c.postValue(Integer.valueOf(i2));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                FeedItem feedItem5 = (FeedItem) it3.next();
                if (feedItem5.type == 2) {
                    arrayList.add(feedItem5);
                    it3.remove();
                }
            }
            if (!c.c() && !Lists.isEmpty(arrayList)) {
                d dVar = new d(arrayList);
                dVar.type = 1003;
                dVar.resId = "";
                dVar.item = null;
                list2.add(0, dVar);
            }
            if (((Integer) b.f14211b.a()).intValue() == 1 && extra2.bannerContainer != null && extra2.bannerContainer.f7704a != null && extra2.bannerContainer.f7704a.size() > 0) {
                FeedItem feedItem6 = new FeedItem();
                feedItem6.type = 22;
                feedItem6.banners = extra2.bannerContainer.f7704a;
                if (size % 2 == 0) {
                    list2.add(feedItem6);
                    return;
                }
                list2.add(list.size() - 1, feedItem6);
            }
        }
    }
}
