package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.v4.app.FragmentActivity;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.f;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

public class InfoStickerEmojiFragment extends InfoStickerFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69685a;

    /* renamed from: b  reason: collision with root package name */
    protected int f69686b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f69687c;
    private CategoryEffectModel l;
    private PanelInfoModel m;
    private String n;
    private int o;
    private String p;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69685a, false, 79261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69685a, false, 79261, new Class[0], Void.TYPE);
            return;
        }
        h();
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f69685a, false, 79262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69685a, false, 79262, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InfoStickerModule.a(activity).a("emoji-android", "", 75, 0).observe(activity, new d(this));
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69685a, false, 79265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69685a, false, 79265, new Class[0], Void.TYPE);
        } else if (this.m == null || this.m.category_effects == null) {
            this.g.e();
        } else {
            this.g.b();
            this.f69687c = true;
            this.l = this.m.category_effects;
            this.n = this.l.category_key;
            this.f69686b = this.l.cursor;
            this.o = this.l.sorting_position;
            this.p = this.l.version;
            ((InfoStickerEmojiAdapterV2) this.f69692e).a(this.l);
            this.f69692e.notifyItemRangeChanged(0, this.f69686b);
            this.f69692e.setLoadMoreListener(new f(this));
        }
    }

    public final void a() {
        InfoStickerAdapterV2 infoStickerAdapterV2;
        if (PatchProxy.isSupport(new Object[0], this, f69685a, false, 79260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69685a, false, 79260, new Class[0], Void.TYPE);
            return;
        }
        this.i = new WrapGridLayoutManager(getContext(), 5, 1, false);
        this.f69693f.setItemViewCacheSize(5);
        this.f69693f.setLayoutManager(this.i);
        if (this.f69693f.getAdapter() == null) {
            String str = this.h;
            if (PatchProxy.isSupport(new Object[]{str}, this, f69685a, false, 79266, new Class[]{String.class}, InfoStickerAdapterV2.class)) {
                infoStickerAdapterV2 = (InfoStickerAdapterV2) PatchProxy.accessDispatch(new Object[]{str}, this, f69685a, false, 79266, new Class[]{String.class}, InfoStickerAdapterV2.class);
            } else {
                infoStickerAdapterV2 = new InfoStickerEmojiAdapterV2(getActivity(), str);
            }
            this.f69692e = infoStickerAdapterV2;
            this.f69693f.setAdapter(this.f69692e);
        } else {
            this.f69692e = (InfoStickerAdapterV2) this.f69693f.getAdapter();
        }
        h();
        this.f69692e.setShowFooter(true);
        this.f69692e.f69673c = this.k;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69685a, false, 79264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69685a, false, 79264, new Class[0], Void.TYPE);
        } else if (!this.f69687c) {
            super.c();
        } else if (this.j == a.C0799a.LOADING) {
            this.f69692e.showLoadMoreLoading();
        } else if (this.j == a.C0799a.ERROR) {
            this.f69692e.showLoadMoreError();
        } else {
            if (this.j == a.C0799a.SUCCESS) {
                if (this.l == null || Lists.isEmpty(this.l.effects)) {
                    this.f69692e.showLoadMoreEmpty();
                    return;
                }
                this.f69692e.resetLoadMoreState();
                int i = this.f69686b;
                this.f69686b = this.l.cursor;
                this.o = this.l.sorting_position;
                this.p = this.l.version;
                ((InfoStickerEmojiAdapterV2) this.f69692e).a(this.l);
                this.f69692e.notifyItemRangeChanged(i, (this.f69686b - i) + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        LiveData liveData;
        if (PatchProxy.isSupport(new Object[0], this, f69685a, false, 79263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69685a, false, 79263, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InfoStickerViewModel a2 = InfoStickerModule.a(activity);
            String str = this.n;
            int i = this.f69686b;
            int i2 = this.o;
            String str2 = this.p;
            if (PatchProxy.isSupport(new Object[]{"emoji-android", str, 75, Integer.valueOf(i), Integer.valueOf(i2), str2}, a2, InfoStickerViewModel.f69782a, false, 79384, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class)) {
                InfoStickerViewModel infoStickerViewModel = a2;
                liveData = (LiveData) PatchProxy.accessDispatch(new Object[]{"emoji-android", str, 75, Integer.valueOf(i), Integer.valueOf(i2), str2}, infoStickerViewModel, InfoStickerViewModel.f69782a, false, 79384, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class);
            } else {
                InfoStickerRepository infoStickerRepository = a2.f69783b;
                if (PatchProxy.isSupport(new Object[]{"emoji-android", str, 75, Integer.valueOf(i), Integer.valueOf(i2), str2}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79314, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class)) {
                    Object[] objArr = {"emoji-android", str, 75, Integer.valueOf(i), Integer.valueOf(i2), str2};
                    Object[] objArr2 = objArr;
                    InfoStickerRepository infoStickerRepository2 = infoStickerRepository;
                    liveData = (LiveData) PatchProxy.accessDispatch(objArr2, infoStickerRepository2, InfoStickerRepository.f69728a, false, 79314, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class);
                } else {
                    MutableLiveData mutableLiveData = new MutableLiveData();
                    mutableLiveData.setValue(a.a(a.C0799a.LOADING, null));
                    infoStickerRepository.f69729b.a("emoji-android", str, true, 75, i, i2, str2, new f(mutableLiveData) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69755a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ MutableLiveData f69756b;

                        public final void a(c cVar) {
                            if (PatchProxy.isSupport(new Object[]{cVar}, this, f69755a, false, 79343, new Class[]{c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{cVar}, this, f69755a, false, 79343, new Class[]{c.class}, Void.TYPE);
                                return;
                            }
                            this.f69756b.setValue(a.a(a.C0799a.ERROR, null));
                            com.ss.android.ugc.aweme.framework.a.a.a("InfoStickerRepository", "uniformFetchList fail : " + cVar.toString());
                        }

                        public final void a(CategoryPageModel categoryPageModel) {
                            CategoryPageModel categoryPageModel2 = categoryPageModel;
                            if (PatchProxy.isSupport(new Object[]{categoryPageModel2}, this, f69755a, false, 79342, new Class[]{CategoryPageModel.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{categoryPageModel2}, this, f69755a, false, 79342, new Class[]{CategoryPageModel.class}, Void.TYPE);
                                return;
                            }
                            this.f69756b.setValue(a.a(a.C0799a.SUCCESS, categoryPageModel2.category_effects));
                        }

                        {
                            this.f69756b = r2;
                        }
                    });
                    liveData = mutableLiveData;
                }
            }
            liveData.observe(activity, new e(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(a aVar) {
        if (aVar != null) {
            this.j = aVar.f76550c;
            this.l = (CategoryEffectModel) aVar.f76549b;
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(a aVar) {
        if (aVar != null) {
            this.j = aVar.f76550c;
            this.m = (PanelInfoModel) aVar.f76549b;
            c();
        }
    }
}
