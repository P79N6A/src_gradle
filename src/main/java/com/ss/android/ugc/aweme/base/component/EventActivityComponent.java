package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.ss.android.ugc.aweme.commercialize.model.f;
import com.ss.android.ugc.aweme.commercialize.utils.an;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.share.g;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.feed.ui.az;
import com.ss.android.ugc.aweme.feed.ui.bc;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.c.b;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.ui.coupon.GotCouponDialog;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.co;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.share.t;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.f.e;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.util.al;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.u;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class EventActivityComponent implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2742a;

    /* renamed from: b  reason: collision with root package name */
    public IShareService.ShareWindow f2743b;

    /* renamed from: c  reason: collision with root package name */
    public bc f2744c;

    /* renamed from: d  reason: collision with root package name */
    public az f2745d;

    /* renamed from: e  reason: collision with root package name */
    AbsActivity f2746e;

    /* renamed from: f  reason: collision with root package name */
    public e f2747f;
    private WeakReference<c> g;
    private g h;

    public EventActivityComponent(AbsActivity absActivity) {
        this.f2746e = absActivity;
    }

    @Subscribe
    public void onPublishStatus(final e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f2742a, false, 24582, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f2742a, false, 24582, new Class[]{e.class}, Void.TYPE);
            return;
        }
        final AbsActivity absActivity = this.f2746e;
        if (absActivity != null && absActivity.isViewValid()) {
            if (eVar.f67642c == 12) {
                if (absActivity == p.a().e()) {
                    a.b((Context) this.f2746e, (int) C0906R.string.afg).a();
                }
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception(eVar.toString()));
            } else if (eVar.f67642c == 9) {
                if (absActivity == p.a().e()) {
                    String str = eVar.f67645f;
                    if (TextUtils.isEmpty(str)) {
                        str = absActivity.getResources().getString(C0906R.string.bt4);
                    }
                    a.b((Context) this.f2746e, str).a();
                }
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception(eVar.toString()));
            } else if (eVar.f67642c == 10) {
                a(this.f2746e, eVar.i, new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34689a;

                    public final void run() {
                        boolean z;
                        boolean z2;
                        if (PatchProxy.isSupport(new Object[0], this, f34689a, false, 24594, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34689a, false, 24594, new Class[0], Void.TYPE);
                            return;
                        }
                        Aweme aweme = (Aweme) eVar.f67644e;
                        if (aweme.getStatus().getPrivateStatus() == 1 || u.f75965b.d(aweme)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((!z || com.ss.android.g.a.a()) && (!z || !com.ss.android.g.a.a() || !((Boolean) SharePrefCache.inst().getIsPrivateAvailable().c()).booleanValue())) {
                            EventActivityComponent eventActivityComponent = EventActivityComponent.this;
                            if (PatchProxy.isSupport(new Object[0], eventActivityComponent, EventActivityComponent.f2742a, false, 24590, new Class[0], Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], eventActivityComponent, EventActivityComponent.f2742a, false, 24590, new Class[0], Boolean.TYPE)).booleanValue();
                            } else {
                                User curUser = d.a().getCurUser();
                                if (!com.ss.android.g.a.a() || curUser == null || !curUser.isSecret()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                if (eVar.j) {
                                    EventActivityComponent.this.f2747f = eVar;
                                } else if (eVar.i instanceof CreateAwemeResponse) {
                                    EventActivityComponent.this.a(eVar, absActivity);
                                }
                                cg.b();
                            }
                        }
                        EventActivityComponent eventActivityComponent2 = EventActivityComponent.this;
                        e eVar = eVar;
                        AbsActivity absActivity = absActivity;
                        if (PatchProxy.isSupport(new Object[]{eVar, absActivity}, eventActivityComponent2, EventActivityComponent.f2742a, false, 24587, new Class[]{e.class, AbsActivity.class}, Void.TYPE)) {
                            EventActivityComponent eventActivityComponent3 = eventActivityComponent2;
                            PatchProxy.accessDispatch(new Object[]{eVar, absActivity}, eventActivityComponent3, EventActivityComponent.f2742a, false, 24587, new Class[]{e.class, AbsActivity.class}, Void.TYPE);
                        } else {
                            if (eventActivityComponent2.f2745d == null) {
                                eventActivityComponent2.f2745d = new az();
                                if (eVar.f67641b > 0) {
                                    eventActivityComponent2.f2745d.f46536b = eVar.f67641b;
                                }
                            }
                            com.ss.android.b.a.a.a.a(new Runnable(eVar, absActivity) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f34696a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ e f34697b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ AbsActivity f34698c;

                                public final void run() {
                                    boolean z;
                                    boolean z2 = false;
                                    if (PatchProxy.isSupport(new Object[0], this, f34696a, false, 24596, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f34696a, false, 24596, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    az azVar = EventActivityComponent.this.f2745d;
                                    Aweme aweme = (Aweme) this.f34697b.f67644e;
                                    if (PatchProxy.isSupport(new Object[]{aweme}, azVar, az.f46535a, false, 42979, new Class[]{Aweme.class}, Boolean.TYPE)) {
                                        az azVar2 = azVar;
                                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, azVar2, az.f46535a, false, 42979, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                                    } else if (aweme != null) {
                                        if (aweme.getImageInfos() == null || aweme.getImageInfos().size() <= 0) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (aweme.getAuthor() != null && (aweme.getVideo() != null || z)) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        EventActivityComponent.this.f2745d.f46540f = this.f34698c;
                                        EventActivityComponent.this.f2745d.b();
                                        EventActivityComponent.this.f2745d.a((Aweme) this.f34697b.f67644e);
                                    }
                                }

                                {
                                    this.f34697b = r2;
                                    this.f34698c = r3;
                                }
                            }, 150);
                        }
                        cg.b();
                    }
                });
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(eVar.f67642c);
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.festival.christmas.a.a aVar) {
        Aweme aweme;
        com.ss.android.ugc.aweme.festival.christmas.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2742a, false, 24589, new Class[]{com.ss.android.ugc.aweme.festival.christmas.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2742a, false, 24589, new Class[]{com.ss.android.ugc.aweme.festival.christmas.a.a.class}, Void.TYPE);
        } else if (this.f2747f != null) {
            if (aVar2 != null && aVar2.f47230b != null && aVar2.f47230b.isValidDonation()) {
                Object obj = this.f2747f.f67644e;
                if (obj instanceof Aweme) {
                    aweme = (Aweme) obj;
                } else {
                    aweme = null;
                }
                if (!u.f75965b.d(aweme)) {
                    AbsActivity absActivity = this.f2746e;
                    if (PatchProxy.isSupport(new Object[]{absActivity, aVar2, aweme}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43901, new Class[]{AbsActivity.class, com.ss.android.ugc.aweme.festival.christmas.a.a.class, Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{absActivity, aVar2, aweme}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43901, new Class[]{AbsActivity.class, com.ss.android.ugc.aweme.festival.christmas.a.a.class, Aweme.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.festival.christmas.c.e eVar = aVar2.f47230b;
                        if (!(eVar == null || eVar.getGlobalDonationInfo() == null)) {
                            try {
                                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createChristmasEcardDialog(absActivity, eVar.getPostCopyWriting(), aweme, new com.ss.android.ugc.aweme.festival.christmas.c.c(new DecimalFormat(",###").format(eVar.getGlobalDonationInfo().getJoinCount()), ClassUtils.INNER_CLASS_SEPARATOR + eVar.getGlobalDonationInfo().getDonationAllAmount(), true), "native").show();
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            } else if (this.f2746e != null && this.f2746e.isViewValid()) {
                a(this.f2747f, this.f2746e);
            }
            this.f2747f = null;
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f2742a, false, 24591, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f2742a, false, 24591, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        switch (event) {
            case ON_CREATE:
                if (PatchProxy.isSupport(new Object[0], this, f2742a, false, 24578, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2742a, false, 24578, new Class[0], Void.TYPE);
                    break;
                } else {
                    if (this.f2746e instanceof c) {
                        this.g = new WeakReference<>((c) this.f2746e);
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f2742a, false, 24579, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f2742a, false, 24579, new Class[0], Void.TYPE);
                        break;
                    } else {
                        if (!com.ss.android.g.a.a()) {
                            if (this.h == null) {
                                this.h = new g(this.f2746e);
                            }
                            g gVar = this.h;
                            if (PatchProxy.isSupport(new Object[0], gVar, g.f34719a, false, 24602, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], gVar, g.f34719a, false, 24602, new Class[0], Void.TYPE);
                                break;
                            } else if (gVar.f34722c == null) {
                                gVar.f34722c = new h(gVar);
                                ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).getPublishState().observe(gVar.f34721b, gVar.f34722c);
                            }
                        }
                        return;
                    }
                }
            case ON_START:
                if (PatchProxy.isSupport(new Object[0], this, f2742a, false, 24580, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2742a, false, 24580, new Class[0], Void.TYPE);
                    break;
                } else {
                    bg.c(this);
                    return;
                }
            case ON_STOP:
                if (PatchProxy.isSupport(new Object[0], this, f2742a, false, 24581, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2742a, false, 24581, new Class[0], Void.TYPE);
                    break;
                } else {
                    bg.d(this);
                    return;
                }
            case ON_DESTROY:
                if (!PatchProxy.isSupport(new Object[0], this, f2742a, false, 24588, new Class[0], Void.TYPE)) {
                    if (this.f2743b != null) {
                        this.f2743b.onDismiss();
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f2742a, false, 24588, new Class[0], Void.TYPE);
                    return;
                }
                break;
        }
    }

    public final void a(e eVar, AbsActivity absActivity) {
        boolean z;
        boolean z2;
        co coVar;
        final e eVar2 = eVar;
        AbsActivity absActivity2 = absActivity;
        if (PatchProxy.isSupport(new Object[]{eVar2, absActivity2}, this, f2742a, false, 24583, new Class[]{e.class, AbsActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, absActivity2}, this, f2742a, false, 24583, new Class[]{e.class, AbsActivity.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{eVar2, absActivity2}, this, f2742a, false, 24584, new Class[]{e.class, AbsActivity.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar2, absActivity2}, this, f2742a, false, 24584, new Class[]{e.class, AbsActivity.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.share.a.f64578a, true, 72896, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.share.a.f64578a, true, 72896, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = com.ss.android.ugc.aweme.share.a.f64580c.a();
            }
            if (z2) {
                AVUploadSaveModel aVUploadSaveModel = ((CreateAwemeResponse) eVar2.i).mSaveModel;
                if (aVUploadSaveModel != null) {
                    int saveType = aVUploadSaveModel.getSaveType();
                    Iterator it2 = co.supportChannels(absActivity).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            coVar = null;
                            break;
                        }
                        coVar = (co) it2.next();
                        if (coVar.getSaveType() == saveType) {
                            break;
                        }
                    }
                    if (coVar != null) {
                        UrlModel cover = ((CreateAwemeResponse) eVar2.i).aweme.getVideo().getCover();
                        com.ss.android.ugc.aweme.base.c.b(cover.getUrlList().get(0));
                        new g(absActivity2, coVar.getLabel(), cover).setOnDismissListener(new c(eVar2, coVar, aVUploadSaveModel, absActivity2));
                        r.a("share_notice_after_post", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_post_page").a("platform", coVar.getKey()).f34114b);
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (!z) {
            if (PatchProxy.isSupport(new Object[]{eVar2, absActivity2}, this, f2742a, false, 24586, new Class[]{e.class, AbsActivity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2, absActivity2}, this, f2742a, false, 24586, new Class[]{e.class, AbsActivity.class}, Void.TYPE);
            } else {
                if (this.f2743b == null) {
                    this.f2743b = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createUploadSuccessPopupWindow(absActivity2);
                    this.f2744c = new bc(this.f2746e, null, this.f2743b);
                    this.f2743b.setActionHandler(this.f2744c);
                    this.f2743b.setShareCallback(this.f2744c);
                    if (eVar2.f67641b > 0) {
                        this.f2743b.setShowDuration(eVar2.f67641b);
                    }
                }
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34693a;

                    public final void run() {
                        boolean z;
                        boolean z2;
                        if (PatchProxy.isSupport(new Object[0], this, f34693a, false, 24595, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34693a, false, 24595, new Class[0], Void.TYPE);
                            return;
                        }
                        bc bcVar = EventActivityComponent.this.f2744c;
                        Aweme aweme = (Aweme) eVar2.f67644e;
                        if (PatchProxy.isSupport(new Object[]{aweme}, bcVar, bc.f46561a, false, 43094, new Class[]{Aweme.class}, Boolean.TYPE)) {
                            bc bcVar2 = bcVar;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, bcVar2, bc.f46561a, false, 43094, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                        } else if (aweme == null || aweme.getAuthor() == null || aweme.getVideo() == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            EventActivityComponent.this.f2743b.show();
                            bc bcVar3 = EventActivityComponent.this.f2744c;
                            Aweme aweme2 = (Aweme) eVar2.f67644e;
                            if (PatchProxy.isSupport(new Object[]{aweme2}, bcVar3, bc.f46561a, false, 43095, new Class[]{Aweme.class}, Void.TYPE)) {
                                bc bcVar4 = bcVar3;
                                PatchProxy.accessDispatch(new Object[]{aweme2}, bcVar4, bc.f46561a, false, 43095, new Class[]{Aweme.class}, Void.TYPE);
                                return;
                            }
                            if (PatchProxy.isSupport(new Object[]{aweme2}, bcVar3, bc.f46561a, false, 43096, new Class[]{Aweme.class}, Void.TYPE)) {
                                bc bcVar5 = bcVar3;
                                PatchProxy.accessDispatch(new Object[]{aweme2}, bcVar5, bc.f46561a, false, 43096, new Class[]{Aweme.class}, Void.TYPE);
                                return;
                            }
                            bcVar3.f46562b = com.ss.android.ugc.aweme.feed.a.a().a(aweme2);
                            IShareService.ShareStruct a2 = i.a((Context) bcVar3.f46563c, bcVar3.f46562b);
                            a2.isFromUploadSuccess = true;
                            bcVar3.f46564d.updateShareStruct(a2);
                            if (bcVar3.f46564d instanceof s) {
                                s sVar = (s) bcVar3.f46564d;
                                UrlModel cover = bcVar3.f46562b.getVideo().getCover();
                                if (PatchProxy.isSupport(new Object[]{cover}, sVar, s.f65230a, false, 72976, new Class[]{UrlModel.class}, Void.TYPE)) {
                                    s sVar2 = sVar;
                                    PatchProxy.accessDispatch(new Object[]{cover}, sVar2, s.f65230a, false, 72976, new Class[]{UrlModel.class}, Void.TYPE);
                                } else {
                                    com.ss.android.ugc.aweme.base.c.a(sVar.f65232c, cover, (int) UIUtils.dip2Px(sVar.f65233d, (float) sVar.o), (int) UIUtils.dip2Px(sVar.f65233d, (float) sVar.p));
                                }
                                s sVar3 = (s) bcVar3.f46564d;
                                com.ss.android.ugc.aweme.commercialize.model.g commerceStickerInfo = bcVar3.f46562b.getCommerceStickerInfo();
                                if (PatchProxy.isSupport(new Object[]{commerceStickerInfo}, sVar3, s.f65230a, false, 72977, new Class[]{com.ss.android.ugc.aweme.commercialize.model.g.class}, Boolean.TYPE)) {
                                    s sVar4 = sVar3;
                                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{commerceStickerInfo}, sVar4, s.f65230a, false, 72977, new Class[]{com.ss.android.ugc.aweme.commercialize.model.g.class}, Boolean.TYPE)).booleanValue();
                                } else if (commerceStickerInfo == null || !commerceStickerInfo.enable()) {
                                    sVar3.k.setVisibility(8);
                                    sVar3.n.setVisibility(8);
                                    z2 = false;
                                } else {
                                    sVar3.k.setVisibility(0);
                                    sVar3.n.setVisibility(0);
                                    com.ss.android.ugc.aweme.base.c.a(sVar3.l, commerceStickerInfo.getIconUrl(), (int) UIUtils.dip2Px(sVar3.f65233d, (float) sVar3.r), (int) UIUtils.dip2Px(sVar3.f65233d, (float) sVar3.q));
                                    sVar3.m.setText(commerceStickerInfo.getLetters());
                                    sVar3.k.setOnClickListener(new t(commerceStickerInfo));
                                    r.a("show_link", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", commerceStickerInfo.getCommerceStickerId()).a("enter_from", "release").a("link_type", "web_link").f34114b);
                                    z2 = true;
                                }
                                if (!z2) {
                                    s sVar5 = (s) bcVar3.f46564d;
                                    Aweme aweme3 = bcVar3.f46562b;
                                    if (PatchProxy.isSupport(new Object[]{aweme3}, sVar5, s.f65230a, false, 72978, new Class[]{Aweme.class}, Void.TYPE)) {
                                        s sVar6 = sVar5;
                                        PatchProxy.accessDispatch(new Object[]{aweme3}, sVar6, s.f65230a, false, 72978, new Class[]{Aweme.class}, Void.TYPE);
                                        return;
                                    }
                                    f a3 = CommerceSettingsApi.a();
                                    if (!(a3 == null || a3.f39380a == null || AbTestManager.a().bu() == 0)) {
                                        ViewGroup viewGroup = (ViewGroup) sVar5.f65231b.findViewById(C0906R.id.c4o);
                                        viewGroup.setVisibility(0);
                                        ImageView imageView = (ImageView) sVar5.f65231b.findViewById(C0906R.id.c4r);
                                        Drawable a4 = an.a(sVar5.f65231b.getResources(), 2130840356);
                                        if (a4 == null) {
                                            imageView.setImageResource(C0906R.color.h5);
                                        } else {
                                            imageView.setImageDrawable(a4);
                                        }
                                        viewGroup.findViewById(C0906R.id.c4q).bringToFront();
                                        DmtTextView dmtTextView = (DmtTextView) viewGroup.findViewById(C0906R.id.c4t);
                                        if (TextUtils.isEmpty(a3.f39380a.f39386b)) {
                                            dmtTextView.setVisibility(8);
                                        } else {
                                            dmtTextView.setVisibility(0);
                                            dmtTextView.setText(a3.f39380a.f39386b);
                                        }
                                        com.ss.android.ugc.aweme.commercialize.utils.e.a((RemoteImageView) viewGroup.findViewById(C0906R.id.c4s), a3.f39380a.f39385a, (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>(aweme3) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f65240a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ Aweme f65241b;

                                            {
                                                this.f65241b = r2;
                                            }

                                            public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                                                ImageInfo imageInfo = (ImageInfo) obj;
                                                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f65240a, false, 72988, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f65240a, false, 72988, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                                                    return;
                                                }
                                                HashMap hashMap = new HashMap();
                                                AwemeStatus status = this.f65241b.getStatus();
                                                if (status != null) {
                                                    switch (status.getPrivateStatus()) {
                                                        case 0:
                                                            hashMap.put("privacy_status", "public");
                                                            break;
                                                        case 1:
                                                            hashMap.put("privacy_status", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
                                                            break;
                                                        case 2:
                                                            hashMap.put("privacy_status", "friend");
                                                            break;
                                                    }
                                                }
                                                hashMap.put("enter_from", "release");
                                                r.a("show_ad_sticker", (Map) hashMap);
                                            }
                                        });
                                        viewGroup.setOnClickListener(new com.ss.android.ugc.aweme.share.u(sVar5, aweme3, a3));
                                    }
                                }
                            }
                        }
                    }
                }, 150);
            }
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) eVar2.i;
            if (PatchProxy.isSupport(new Object[]{createAwemeResponse, absActivity2}, null, al.f71108a, true, 81050, new Class[]{at.class, Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{createAwemeResponse, absActivity2}, null, al.f71108a, true, 81050, new Class[]{at.class, Activity.class}, Void.TYPE);
                return;
            }
            new al();
        }
    }

    public static void a(Activity activity, at atVar, Runnable runnable) {
        String str;
        PoiStruct poiStruct;
        Activity activity2 = activity;
        at atVar2 = atVar;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{activity2, atVar2, runnable2}, null, f2742a, true, 24585, new Class[]{Activity.class, at.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, atVar2, runnable2}, null, f2742a, true, 24585, new Class[]{Activity.class, at.class, Runnable.class}, Void.TYPE);
            return;
        }
        if (atVar2 != null && (atVar2 instanceof CreateAwemeResponse)) {
            com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar = ((CreateAwemeResponse) atVar2).couponInfo;
            if (cVar != null) {
                try {
                    str = ((CreateAwemeResponse) atVar2).aweme.getPoiStruct().getPoiId();
                    try {
                        poiStruct = ((CreateAwemeResponse) atVar2).aweme.getPoiStruct();
                    } catch (NullPointerException unused) {
                        poiStruct = null;
                        b.e(new a.C0670a().b(str).a("homepage_follow").e("homepage_follow").g(String.valueOf(cVar.getCouponId())).f("click_publish").h(com.ss.android.ugc.aweme.commercialize.coupon.a.a(activity2, cVar.getStatus(), true)).j(com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar)).a(poiStruct).a());
                        y.a(true);
                        GotCouponDialog gotCouponDialog = new GotCouponDialog(activity2);
                        gotCouponDialog.a(new com.ss.android.ugc.aweme.poi.ui.coupon.a(str, cVar, poiStruct));
                        gotCouponDialog.setOnDismissListener(new d(runnable2));
                        r.a("show_coupon_toast", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_follow").a("enter_method", "click_publish").a("coupon_id", cVar.getCouponId()).a("poi_id", str).f34114b);
                        return;
                    }
                } catch (NullPointerException unused2) {
                    str = null;
                    poiStruct = null;
                    b.e(new a.C0670a().b(str).a("homepage_follow").e("homepage_follow").g(String.valueOf(cVar.getCouponId())).f("click_publish").h(com.ss.android.ugc.aweme.commercialize.coupon.a.a(activity2, cVar.getStatus(), true)).j(com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar)).a(poiStruct).a());
                    y.a(true);
                    GotCouponDialog gotCouponDialog2 = new GotCouponDialog(activity2);
                    gotCouponDialog2.a(new com.ss.android.ugc.aweme.poi.ui.coupon.a(str, cVar, poiStruct));
                    gotCouponDialog2.setOnDismissListener(new d(runnable2));
                    r.a("show_coupon_toast", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_follow").a("enter_method", "click_publish").a("coupon_id", cVar.getCouponId()).a("poi_id", str).f34114b);
                    return;
                }
                b.e(new a.C0670a().b(str).a("homepage_follow").e("homepage_follow").g(String.valueOf(cVar.getCouponId())).f("click_publish").h(com.ss.android.ugc.aweme.commercialize.coupon.a.a(activity2, cVar.getStatus(), true)).j(com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar)).a(poiStruct).a());
                y.a(true);
                GotCouponDialog gotCouponDialog22 = new GotCouponDialog(activity2);
                gotCouponDialog22.a(new com.ss.android.ugc.aweme.poi.ui.coupon.a(str, cVar, poiStruct));
                gotCouponDialog22.setOnDismissListener(new d(runnable2));
                r.a("show_coupon_toast", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_follow").a("enter_method", "click_publish").a("coupon_id", cVar.getCouponId()).a("poi_id", str).f34114b);
                return;
            }
        }
        runnable.run();
    }
}
