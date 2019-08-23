package com.ss.android.ugc.aweme.sticker.prop.a;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a<Aweme, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71653a;

    /* renamed from: b  reason: collision with root package name */
    public StickerPropApi f71654b = ((StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(StickerPropApi.class));

    /* renamed from: c  reason: collision with root package name */
    private int f71655c;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((a) this.mData).f71648a;
    }

    public final boolean isHasMore() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f71653a, false, 82068, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71653a, false, 82068, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null) {
            if (((a) this.mData).f71650c == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f71653a, false, 82065, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f71653a, false, 82065, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((a) this.mData).f71649b;
        }
        a(str, j, 20, objArr[2].intValue());
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f71653a, false, 82064, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f71653a, false, 82064, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 0, 20, objArr[2].intValue());
    }

    public final void setItems(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f71653a, false, 82069, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f71653a, false, 82069, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            this.mData = new a();
        }
        ((a) this.mData).f71650c = 1;
        ((a) this.mData).f71648a = list;
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f71653a, false, 82067, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f71653a, false, 82067, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar == null || CollectionUtils.isEmpty(aVar.f71648a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int size = aVar.f71648a.size();
            for (int i = 0; i < size; i++) {
                Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(aVar.f71648a.get(i));
                a2.setIsTop(aVar.f71648a.get(i).getIsTop());
                com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                a3.a(a2.getAid() + (this.f71655c + 10000), aVar.f71651d, i);
                aVar.f71648a.set(i, a2);
                if (aVar.f71652e != null) {
                    ai.a().a(aVar.f71651d, aVar.f71652e);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = aVar;
            } else if (i2 == 4) {
                ((a) this.mData).f71648a.addAll(aVar.f71648a);
                ((a) this.mData).f71649b = aVar.f71649b;
                ((a) this.mData).f71650c = aVar.f71650c & ((a) this.mData).f71650c;
            }
        } else {
            if (this.mData != null) {
                ((a) this.mData).f71650c = 0;
            }
        }
    }

    private void a(String str, long j, int i, int i2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), 20, Integer.valueOf(i2)}, this, f71653a, false, 82066, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j2), 20, Integer.valueOf(i2)}, this, f71653a, false, 82066, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71655c = i2;
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str2 = str;
        final long j3 = j;
        AnonymousClass1 r0 = new Callable(20) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71656a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f71656a, false, 82070, new Class[0], Object.class)) {
                    return b.this.f71654b.queryStickerAwemeList(str2, j3, 20).execute().body();
                }
                return PatchProxy.accessDispatch(new Object[0], this, f71656a, false, 82070, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
