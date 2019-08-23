package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.b.k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class InfoStickerRepository {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69728a;

    /* renamed from: b  reason: collision with root package name */
    public EffectPlatform f69729b;

    /* renamed from: c  reason: collision with root package name */
    IRetrofit f69730c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());

    /* renamed from: d  reason: collision with root package name */
    Queue<Effect> f69731d = new LinkedBlockingQueue();

    /* renamed from: e  reason: collision with root package name */
    private Effect f69732e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f69733f;

    interface RetrofitService {
        @GET(a = "/aweme/v1/info/sticker/")
        q<aa> getTemperature(@Query(a = "longitude") double d2, @Query(a = "latitude") double d3);
    }

    public final void a() {
        this.f69733f = false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69728a, false, 79328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69728a, false, 79328, new Class[0], Void.TYPE);
            return;
        }
        b(false);
    }

    public InfoStickerRepository(Context context) {
        this.f69729b = new EffectPlatform(context, a.h.c(), a.D.getOKHttpClient());
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69728a, false, 79329, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69728a, false, 79329, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        while (this.f69733f) {
            this.f69732e = this.f69731d.poll();
            if (this.f69732e != null) {
                if (!ah.a(this.f69732e, (g) this.f69729b, z)) {
                    this.f69729b.a(this.f69732e, (i) new i() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69749a;

                        public final void b(Effect effect) {
                        }

                        public final void a(Effect effect) {
                            if (PatchProxy.isSupport(new Object[]{effect}, this, f69749a, false, 79338, new Class[]{Effect.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect}, this, f69749a, false, 79338, new Class[]{Effect.class}, Void.TYPE);
                                return;
                            }
                            InfoStickerRepository.this.b();
                        }

                        public final void a(Effect effect, c cVar) {
                            if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f69749a, false, 79339, new Class[]{Effect.class, c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f69749a, false, 79339, new Class[]{Effect.class, c.class}, Void.TYPE);
                                return;
                            }
                            InfoStickerRepository.this.b();
                        }
                    });
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final LiveData<com.ss.android.ugc.aweme.w.b.a<EffectChannelResponse>> a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69728a, false, 79313, new Class[]{String.class}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str}, this, f69728a, false, 79313, new Class[]{String.class}, LiveData.class);
        }
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.LOADING, null));
        this.f69729b.a(str, false, (com.ss.android.ugc.effectmanager.effect.b.g) new com.ss.android.ugc.effectmanager.effect.b.g() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69751a;

            public final void a(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (PatchProxy.isSupport(new Object[]{effectChannelResponse2}, this, f69751a, false, 79340, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effectChannelResponse2}, this, f69751a, false, 79340, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                    return;
                }
                mutableLiveData.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, effectChannelResponse2));
            }

            public final void a(c cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f69751a, false, 79341, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f69751a, false, 79341, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                InfoStickerRepository infoStickerRepository = InfoStickerRepository.this;
                MutableLiveData mutableLiveData = mutableLiveData;
                String str = str;
                if (PatchProxy.isSupport(new Object[]{mutableLiveData, str}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79321, new Class[]{MutableLiveData.class, String.class}, Void.TYPE)) {
                    Object[] objArr = {mutableLiveData, str};
                    InfoStickerRepository infoStickerRepository2 = infoStickerRepository;
                    PatchProxy.accessDispatch(objArr, infoStickerRepository2, InfoStickerRepository.f69728a, false, 79321, new Class[]{MutableLiveData.class, String.class}, Void.TYPE);
                } else {
                    infoStickerRepository.f69729b.a(str, (com.ss.android.ugc.effectmanager.effect.b.g) new com.ss.android.ugc.effectmanager.effect.b.g(mutableLiveData) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69743a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ MutableLiveData f69744b;

                        public final void a(c cVar) {
                            c cVar2 = cVar;
                            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f69743a, false, 79335, new Class[]{c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{cVar2}, this, f69743a, false, 79335, new Class[]{c.class}, Void.TYPE);
                                return;
                            }
                            this.f69744b.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.ERROR, cVar2.f77317c));
                        }

                        public final void a(EffectChannelResponse effectChannelResponse) {
                            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                            if (PatchProxy.isSupport(new Object[]{effectChannelResponse2}, this, f69743a, false, 79334, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effectChannelResponse2}, this, f69743a, false, 79334, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                                return;
                            }
                            this.f69744b.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, effectChannelResponse2));
                        }

                        {
                            this.f69744b = r2;
                        }
                    });
                }
                com.ss.android.ugc.aweme.framework.a.a.a("InfoStickerRepository", "uniformFetchList fail : " + cVar.toString());
            }
        });
        return mutableLiveData;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69728a, false, 79327, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69728a, false, 79327, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.f69733f) {
            this.f69733f = true;
            b(z);
        }
    }

    public final void a(@NonNull List<Effect> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69728a, false, 79324, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f69728a, false, 79324, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f69731d.addAll(list);
        b(z);
    }

    public final LiveData<com.ss.android.ugc.aweme.w.b.a<PanelInfoModel>> a(String str, String str2, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69728a, false, 79316, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69728a, false, 79316, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class);
        }
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.LOADING, null));
        this.f69729b.a(str, true, str2, i, i2, new k() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69758a;

            public final void a(c cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f69758a, false, 79347, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f69758a, false, 79347, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                mutableLiveData.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.ERROR, null));
            }

            public final void a(PanelInfoModel panelInfoModel) {
                PanelInfoModel panelInfoModel2 = panelInfoModel;
                if (PatchProxy.isSupport(new Object[]{panelInfoModel2}, this, f69758a, false, 79346, new Class[]{PanelInfoModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{panelInfoModel2}, this, f69758a, false, 79346, new Class[]{PanelInfoModel.class}, Void.TYPE);
                    return;
                }
                mutableLiveData.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, panelInfoModel2));
            }
        });
        return mutableLiveData;
    }
}
