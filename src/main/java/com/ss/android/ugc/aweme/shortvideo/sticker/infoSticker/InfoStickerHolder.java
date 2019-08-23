package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.e;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class InfoStickerHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69696a;

    /* renamed from: b  reason: collision with root package name */
    public Context f69697b;

    /* renamed from: c  reason: collision with root package name */
    public StickerImageView f69698c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69699d;

    /* renamed from: e  reason: collision with root package name */
    public ah f69700e;

    /* renamed from: f  reason: collision with root package name */
    public InfoStickerAdapterV2 f69701f;
    public int g;
    public String h;
    public FragmentActivity i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerHolder$6  reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f69722a = new int[a.C0799a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.ss.android.ugc.aweme.w.b.a$a[] r0 = com.ss.android.ugc.aweme.w.b.a.C0799a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69722a = r0
                int[] r0 = f69722a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.w.b.a$a r1 = com.ss.android.ugc.aweme.w.b.a.C0799a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f69722a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.w.b.a$a r1 = com.ss.android.ugc.aweme.w.b.a.C0799a.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f69722a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.w.b.a$a r1 = com.ss.android.ugc.aweme.w.b.a.C0799a.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f69722a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.w.b.a$a r1 = com.ss.android.ugc.aweme.w.b.a.C0799a.PROGRESS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerHolder.AnonymousClass6.<clinit>():void");
        }
    }

    public InfoStickerHolder(View view, InfoStickerAdapterV2 infoStickerAdapterV2) {
        super(view);
        this.f69697b = view.getContext();
        this.f69698c = (StickerImageView) view.findViewById(C0906R.id.cvk);
        this.f69701f = infoStickerAdapterV2;
    }

    public final void a(FragmentActivity fragmentActivity, @NonNull ah ahVar) {
        LiveData liveData;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, ahVar2}, this, f69696a, false, 79293, new Class[]{FragmentActivity.class, ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, ahVar2}, this, f69696a, false, 79293, new Class[]{FragmentActivity.class, ah.class}, Void.TYPE);
            return;
        }
        InfoStickerViewModel a2 = InfoStickerModule.a(fragmentActivity);
        if (PatchProxy.isSupport(new Object[]{ahVar2}, a2, InfoStickerViewModel.f69782a, false, 79382, new Class[]{ah.class}, LiveData.class)) {
            Object[] objArr = {ahVar2};
            InfoStickerViewModel infoStickerViewModel = a2;
            liveData = (LiveData) PatchProxy.accessDispatch(objArr, infoStickerViewModel, InfoStickerViewModel.f69782a, false, 79382, new Class[]{ah.class}, LiveData.class);
        } else {
            InfoStickerRepository infoStickerRepository = a2.f69783b;
            Effect effect = ahVar2.f69295b;
            if (PatchProxy.isSupport(new Object[]{effect}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79312, new Class[]{Effect.class}, LiveData.class)) {
                InfoStickerRepository infoStickerRepository2 = infoStickerRepository;
                liveData = (LiveData) PatchProxy.accessDispatch(new Object[]{effect}, infoStickerRepository2, InfoStickerRepository.f69728a, false, 79312, new Class[]{Effect.class}, LiveData.class);
            } else {
                MutableLiveData mutableLiveData = new MutableLiveData();
                if (ah.a(effect, (g) infoStickerRepository.f69729b)) {
                    mutableLiveData.setValue(a.a(a.C0799a.SUCCESS, effect));
                } else {
                    infoStickerRepository.f69729b.a(effect, (i) new e(mutableLiveData) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69734a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ MutableLiveData f69735b;

                        public final void a(Effect effect) {
                            Effect effect2 = effect;
                            if (PatchProxy.isSupport(new Object[]{effect2}, this, f69734a, false, 79331, new Class[]{Effect.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect2}, this, f69734a, false, 79331, new Class[]{Effect.class}, Void.TYPE);
                                return;
                            }
                            this.f69735b.setValue(a.a(a.C0799a.SUCCESS, effect2));
                        }

                        public final void b(Effect effect) {
                            Effect effect2 = effect;
                            if (PatchProxy.isSupport(new Object[]{effect2}, this, f69734a, false, 79333, new Class[]{Effect.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect2}, this, f69734a, false, 79333, new Class[]{Effect.class}, Void.TYPE);
                                return;
                            }
                            this.f69735b.setValue(a.a(a.C0799a.LOADING, effect2));
                        }

                        {
                            this.f69735b = r2;
                        }

                        public final void a(Effect effect, c cVar) {
                            c cVar2 = cVar;
                            if (PatchProxy.isSupport(new Object[]{effect, cVar2}, this, f69734a, false, 79332, new Class[]{Effect.class, c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect, cVar2}, this, f69734a, false, 79332, new Class[]{Effect.class, c.class}, Void.TYPE);
                                return;
                            }
                            this.f69735b.setValue(a.a(a.C0799a.ERROR, cVar2.f77317c));
                        }

                        public final void a(Effect effect, int i, long j) {
                            Effect effect2 = effect;
                            long j2 = j;
                            if (PatchProxy.isSupport(new Object[]{effect2, Integer.valueOf(i), new Long(j2)}, this, f69734a, false, 79330, new Class[]{Effect.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect2, Integer.valueOf(i), new Long(j2)}, this, f69734a, false, 79330, new Class[]{Effect.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
                                return;
                            }
                            this.f69735b.setValue(a.a(a.C0799a.PROGRESS, effect2, i));
                        }
                    });
                }
                liveData = mutableLiveData;
            }
        }
        liveData.observe(fragmentActivity2, new Observer<a<Effect>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69720a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f69720a, false, 79300, new Class[]{a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f69720a, false, 79300, new Class[]{a.class}, Void.TYPE);
                    return;
                }
                InfoStickerHolder infoStickerHolder = null;
                if (aVar.f76549b != null) {
                    infoStickerHolder = InfoStickerHolder.this.f69701f.i.get(((Effect) aVar.f76549b).effect_id);
                }
                if (infoStickerHolder != null) {
                    switch (AnonymousClass6.f69722a[aVar.f76550c.ordinal()]) {
                        case 1:
                            infoStickerHolder.f69700e.f69297d = 1;
                            infoStickerHolder.a(InfoStickerHolder.this.i, infoStickerHolder.f69700e, InfoStickerHolder.this.h);
                            InfoStickerModule.a((FragmentActivity) InfoStickerHolder.this.f69697b).c().setValue(aVar.f76549b);
                            return;
                        case 2:
                            infoStickerHolder.f69700e.f69297d = 3;
                            infoStickerHolder.a(InfoStickerHolder.this.i, infoStickerHolder.f69700e, InfoStickerHolder.this.h);
                            com.bytedance.ies.dmt.ui.d.a.b(InfoStickerHolder.this.f69697b, (int) C0906R.string.abg).a();
                            return;
                        case 3:
                            infoStickerHolder.f69700e.f69297d = 2;
                            infoStickerHolder.a(InfoStickerHolder.this.i, infoStickerHolder.f69700e, InfoStickerHolder.this.h);
                            return;
                        case 4:
                            if (((Effect) aVar.f76549b).effect_id.equals(infoStickerHolder.f69700e.f69295b.effect_id)) {
                                infoStickerHolder.f69700e.f69297d = 5;
                                infoStickerHolder.f69698c.a(5, aVar.f76551d);
                                break;
                            }
                            break;
                    }
                }
            }
        });
    }

    public final void a(FragmentActivity fragmentActivity, @Nullable ah ahVar, String str) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        ah ahVar2 = ahVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, ahVar2, str2}, this, f69696a, false, 79289, new Class[]{FragmentActivity.class, ah.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, ahVar2, str2}, this, f69696a, false, 79289, new Class[]{FragmentActivity.class, ah.class, String.class}, Void.TYPE);
        } else if (ahVar2 != null) {
            this.h = str2;
            this.f69700e = ahVar2;
            this.i = fragmentActivity2;
            this.f69698c.a(ahVar2.f69297d, ahVar2.f69298e);
            if (ahVar2.f69295b.icon_url != null && !Lists.isEmpty(ahVar2.f69295b.icon_url.url_list)) {
                this.f69698c.a(ahVar2.f69295b.icon_url.url_list.get(0));
            }
            final cb cbVar = InfoStickerModule.a(fragmentActivity).f69785d;
            View view = this.itemView;
            final ah ahVar3 = ahVar;
            final FragmentActivity fragmentActivity3 = fragmentActivity;
            final String str3 = str;
            AnonymousClass1 r0 = new ax() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69702a;

                public final void a(View view) {
                    boolean z;
                    String str;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69702a, false, 79294, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69702a, false, 79294, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    Effect effect = ahVar3.f69295b;
                    if (PatchProxy.isSupport(new Object[]{effect}, null, n.f70095a, true, 79362, new Class[]{Effect.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, n.f70095a, true, 79362, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
                    } else if (effect.getTags().contains("weather")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        InfoStickerHolder infoStickerHolder = InfoStickerHolder.this;
                        FragmentActivity fragmentActivity = fragmentActivity3;
                        ah ahVar = ahVar3;
                        if (PatchProxy.isSupport(new Object[]{fragmentActivity, ahVar}, infoStickerHolder, InfoStickerHolder.f69696a, false, 79290, new Class[]{FragmentActivity.class, ah.class}, Void.TYPE)) {
                            InfoStickerHolder infoStickerHolder2 = infoStickerHolder;
                            PatchProxy.accessDispatch(new Object[]{fragmentActivity, ahVar}, infoStickerHolder2, InfoStickerHolder.f69696a, false, 79290, new Class[]{FragmentActivity.class, ah.class}, Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.port.in.a.h.a(infoStickerHolder.f69697b, (y.b) new y.b(fragmentActivity, ahVar) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f69708a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ FragmentActivity f69709b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ ah f69710c;

                                public final void b() {
                                    if (PatchProxy.isSupport(new Object[0], this, f69708a, false, 79296, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f69708a, false, 79296, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    com.bytedance.ies.dmt.ui.d.a.b(InfoStickerHolder.this.f69697b, (int) C0906R.string.j4).a();
                                }

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f69708a, false, 79295, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f69708a, false, 79295, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    InfoStickerHolder infoStickerHolder = InfoStickerHolder.this;
                                    FragmentActivity fragmentActivity = this.f69709b;
                                    ah ahVar = this.f69710c;
                                    if (PatchProxy.isSupport(new Object[]{fragmentActivity, ahVar}, infoStickerHolder, InfoStickerHolder.f69696a, false, 79291, new Class[]{FragmentActivity.class, ah.class}, Void.TYPE)) {
                                        Object[] objArr = {fragmentActivity, ahVar};
                                        InfoStickerHolder infoStickerHolder2 = infoStickerHolder;
                                        PatchProxy.accessDispatch(objArr, infoStickerHolder2, InfoStickerHolder.f69696a, false, 79291, new Class[]{FragmentActivity.class, ah.class}, Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.port.in.a.h.a(infoStickerHolder.f69697b, (y.a) new y.a(fragmentActivity, ahVar) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f69712a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ FragmentActivity f69713b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ ah f69714c;

                                        public final void a() {
                                            if (PatchProxy.isSupport(new Object[0], this, f69712a, false, 79298, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f69712a, false, 79298, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            com.bytedance.ies.dmt.ui.d.a.b(InfoStickerHolder.this.f69697b, (int) C0906R.string.j4).a();
                                        }

                                        public final void a(double d2, double d3) {
                                            LiveData liveData;
                                            if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f69712a, false, 79297, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f69712a, false, 79297, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            InfoStickerHolder infoStickerHolder = InfoStickerHolder.this;
                                            FragmentActivity fragmentActivity = this.f69713b;
                                            ah ahVar = this.f69714c;
                                            if (PatchProxy.isSupport(new Object[]{fragmentActivity, ahVar, Double.valueOf(d3), Double.valueOf(d2)}, infoStickerHolder, InfoStickerHolder.f69696a, false, 79292, new Class[]{FragmentActivity.class, ah.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
                                                Object[] objArr = {fragmentActivity, ahVar, Double.valueOf(d3), Double.valueOf(d2)};
                                                ChangeQuickRedirect changeQuickRedirect = InfoStickerHolder.f69696a;
                                                Object[] objArr2 = objArr;
                                                InfoStickerHolder infoStickerHolder2 = infoStickerHolder;
                                                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                                                PatchProxy.accessDispatch(objArr2, infoStickerHolder2, changeQuickRedirect2, false, 79292, new Class[]{FragmentActivity.class, ah.class, Double.TYPE, Double.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            ahVar.f69297d = 2;
                                            infoStickerHolder.f69698c.b();
                                            InfoStickerViewModel a2 = InfoStickerModule.a(fragmentActivity);
                                            if (PatchProxy.isSupport(new Object[]{Double.valueOf(d3), Double.valueOf(d2)}, a2, InfoStickerViewModel.f69782a, false, 79396, new Class[]{Double.TYPE, Double.TYPE}, LiveData.class)) {
                                                InfoStickerViewModel infoStickerViewModel = a2;
                                                liveData = (LiveData) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d3), Double.valueOf(d2)}, infoStickerViewModel, InfoStickerViewModel.f69782a, false, 79396, new Class[]{Double.TYPE, Double.TYPE}, LiveData.class);
                                            } else {
                                                InfoStickerRepository infoStickerRepository = a2.f69783b;
                                                if (PatchProxy.isSupport(new Object[]{Double.valueOf(d3), Double.valueOf(d2)}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79322, new Class[]{Double.TYPE, Double.TYPE}, LiveData.class)) {
                                                    Object[] objArr3 = {Double.valueOf(d3), Double.valueOf(d2)};
                                                    ChangeQuickRedirect changeQuickRedirect3 = InfoStickerRepository.f69728a;
                                                    Object[] objArr4 = objArr3;
                                                    InfoStickerRepository infoStickerRepository2 = infoStickerRepository;
                                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect3;
                                                    liveData = (LiveData) PatchProxy.accessDispatch(objArr4, infoStickerRepository2, changeQuickRedirect4, false, 79322, new Class[]{Double.TYPE, Double.TYPE}, LiveData.class);
                                                } else {
                                                    MutableLiveData mutableLiveData = new MutableLiveData();
                                                    l.a(((InfoStickerRepository.RetrofitService) infoStickerRepository.f69730c.create(InfoStickerRepository.RetrofitService.class)).getTemperature(d3, d2), new k<aa>(mutableLiveData) {

                                                        /* renamed from: a  reason: collision with root package name */
                                                        public static ChangeQuickRedirect f69746a;

                                                        /* renamed from: b  reason: collision with root package name */
                                                        final /* synthetic */ MutableLiveData f69747b;

                                                        public final void onFailure(Throwable th) {
                                                            Throwable th2 = th;
                                                            if (PatchProxy.isSupport(new Object[]{th2}, this, f69746a, false, 79337, new Class[]{Throwable.class}, Void.TYPE)) {
                                                                PatchProxy.accessDispatch(new Object[]{th2}, this, f69746a, false, 79337, new Class[]{Throwable.class}, Void.TYPE);
                                                                return;
                                                            }
                                                            this.f69747b.setValue(a.a(a.C0799a.ERROR, th2));
                                                        }

                                                        public final /* synthetic */ void onSuccess(Object obj) {
                                                            aa aaVar = (aa) obj;
                                                            if (PatchProxy.isSupport(new Object[]{aaVar}, this, f69746a, false, 79336, new Class[]{aa.class}, Void.TYPE)) {
                                                                PatchProxy.accessDispatch(new Object[]{aaVar}, this, f69746a, false, 79336, new Class[]{aa.class}, Void.TYPE);
                                                                return;
                                                            }
                                                            this.f69747b.setValue(a.a(a.C0799a.SUCCESS, aaVar));
                                                        }

                                                        {
                                                            this.f69747b = r2;
                                                        }
                                                    }, com.ss.android.ugc.aweme.base.k.f34752b);
                                                    liveData = mutableLiveData;
                                                }
                                            }
                                            liveData.observe(fragmentActivity, new Observer<a<aa>>(fragmentActivity, ahVar) {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f69716a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ FragmentActivity f69717b;

                                                /* renamed from: c  reason: collision with root package name */
                                                final /* synthetic */ ah f69718c;

                                                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                                                    a aVar = (a) obj;
                                                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f69716a, false, 79299, new Class[]{a.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f69716a, false, 79299, new Class[]{a.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    switch (AnonymousClass6.f69722a[aVar.f76550c.ordinal()]) {
                                                        case 1:
                                                            InfoStickerModule.a(this.f69717b).f69784c = ((aa) aVar.f76549b).f69818a;
                                                            InfoStickerHolder.this.a(this.f69717b, this.f69718c);
                                                            return;
                                                        case 2:
                                                            this.f69718c.f69297d = 3;
                                                            InfoStickerHolder.this.f69698c.c();
                                                            com.bytedance.ies.dmt.ui.d.a.b(InfoStickerHolder.this.f69697b, (int) C0906R.string.j5).a();
                                                            break;
                                                    }
                                                }

                                                {
                                                    this.f69717b = r2;
                                                    this.f69718c = r3;
                                                }
                                            });
                                        }

                                        {
                                            this.f69713b = r2;
                                            this.f69714c = r3;
                                        }
                                    });
                                }

                                {
                                    this.f69709b = r2;
                                    this.f69710c = r3;
                                }
                            });
                        }
                    } else {
                        InfoStickerHolder.this.a(fragmentActivity3, ahVar3);
                    }
                    com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                    d a2 = d.a().a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR).a("tab_name", str3).a("prop_id", ahVar3.f69295b.effect_id).a("enter_method", "click_main_panel").a("creation_id", cbVar.creationId).a("shoot_way", cbVar.mShootWay).a("draft_id", cbVar.draftId);
                    if (InfoStickerHolder.this.f69699d) {
                        str = "edit_post_page";
                    } else {
                        str = "video_edit_page";
                    }
                    aVar.a("prop_click", a2.a("enter_from", str).f34114b);
                }
            };
            view.setOnClickListener(r0);
        }
    }
}
