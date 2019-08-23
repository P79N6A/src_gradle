package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.IPlayable;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.d.a;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.List;

public class BaseFeedDataViewModel extends PagingViewModel<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14455a;
    private a<b<FeedItem>, com.bytedance.android.livesdk.feed.d.b> A;
    private com.bytedance.android.livesdk.feed.d.b B;
    private com.bytedance.android.livesdk.feed.e.a C;
    private long D;
    public IFeedRepository l;
    public MutableLiveData<Integer> m = new MutableLiveData<>();
    public MutableLiveData<IPlayable> n = new MutableLiveData<>();
    public MutableLiveData<Integer> o = new MutableLiveData<>();
    public MutableLiveData<Integer> p = new MutableLiveData<>();
    public MutableLiveData<List<ImageModel>> q = new MutableLiveData<>();
    public MutableLiveData<BaseFeedRepository.a> r = new MutableLiveData<>();
    public MutableLiveData<BaseFeedRepository.a> s = new MutableLiveData<>();
    protected b<FeedItem> t;
    protected String u;
    public int v;
    public int w;
    protected String x;
    public c y;
    public MutableLiveData<i.a> z = new MutableLiveData<>();

    public boolean f() {
        return false;
    }

    public String c() {
        return this.u;
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f14455a, false, 8993, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14455a, false, 8993, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean a2 = super.a();
        if (a2) {
            this.m.setValue(0);
        }
        return a2;
    }

    public final c d() {
        if (PatchProxy.isSupport(new Object[0], this, f14455a, false, 8990, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f14455a, false, 8990, new Class[0], c.class);
        }
        if (this.y == null) {
            this.y = e();
        }
        return this.y;
    }

    public c e() {
        if (!PatchProxy.isSupport(new Object[0], this, f14455a, false, 8992, new Class[0], c.class)) {
            return c.a(this.x, c(), this.D);
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f14455a, false, 8992, new Class[0], c.class);
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14455a, false, 8987, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14455a, false, 8987, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.A = this.l.a(c());
            this.t = (b) this.A.f14067a;
            this.B = (com.bytedance.android.livesdk.feed.d.b) this.A.f14068b;
            this.B.f14069a.observeForever(new a(this));
            this.B.f14070b.observeForever(new b(this));
            a(this.t);
            if (PatchProxy.isSupport(new Object[0], this, f14455a, false, 8989, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14455a, false, 8989, new Class[0], Void.TYPE);
            } else {
                this.s.observeForever(new c(this));
            }
            a(this.l.b().observeOn(AndroidSchedulers.mainThread()).subscribe(new d(this), e.f14487a));
            a(this.l.c().observeOn(AndroidSchedulers.mainThread()).subscribe(new f(this), g.f14490a));
            if (this.l instanceof BaseFeedRepository) {
                a(((BaseFeedRepository) this.l).f1859e.observeOn(AndroidSchedulers.mainThread()).subscribe(new h(this), i.f14493a));
                a(((BaseFeedRepository) this.l).f1860f.observeOn(AndroidSchedulers.mainThread()).subscribe(new j(this), k.f14496a));
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f14455a, false, 8996, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f14455a, false, 8996, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "enter_auto") && !TextUtils.equals(str, "detail_loadmore") && this.C.b()) {
            Integer num = (Integer) this.o.getValue();
            if (num == null) {
                this.o.setValue(1);
            } else {
                this.o.setValue(Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    public final boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f14455a, false, 8994, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f14455a, false, 8994, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        this.l.a(str2, null);
        b(str);
        return a();
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f14455a, false, 8991, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f14455a, false, 8991, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            this.u = str;
        }
        if (!StringUtils.isEmpty(str2)) {
            this.x = str2;
        }
    }

    public BaseFeedDataViewModel(IFeedRepository iFeedRepository, h hVar, com.bytedance.android.livesdk.feed.e.a aVar) {
        this.l = iFeedRepository;
        if (hVar != null) {
            this.u = hVar.a();
            this.v = 10;
            this.w = hVar.d();
            this.x = hVar.b();
            this.C = aVar;
            this.D = hVar.c();
            if (PatchProxy.isSupport(new Object[0], this, f14455a, false, 8986, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14455a, false, 8986, new Class[0], Void.TYPE);
                return;
            }
            this.l.a((IFeedRepository.a) new IFeedRepository.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14456a;

                public final int b() {
                    return BaseFeedDataViewModel.this.v;
                }

                public final int c() {
                    return BaseFeedDataViewModel.this.w;
                }

                public final c a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f14456a, false, 9004, new Class[0], c.class)) {
                        return BaseFeedDataViewModel.this.d();
                    }
                    return (c) PatchProxy.accessDispatch(new Object[0], this, f14456a, false, 9004, new Class[0], c.class);
                }
            });
        }
    }
}
