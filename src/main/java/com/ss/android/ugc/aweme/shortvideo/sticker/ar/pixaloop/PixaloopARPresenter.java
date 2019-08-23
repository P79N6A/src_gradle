package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.MediaRecordPresenterViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0012\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0017\u0010&\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010(J \u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.J\b\u0010/\u001a\u00020\u001dH\u0007J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\tH\u0016J\b\u00102\u001a\u00020\u001dH\u0007J\u0010\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\tH\u0016J\u0010\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\tH\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\rH\u0002J\b\u00107\u001a\u00020\u001dH\u0002J\b\u00108\u001a\u00020\u001dH\u0002J\u0012\u00109\u001a\u00020\u001d2\b\u00101\u001a\u0004\u0018\u00010\tH\u0002J\u000e\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010>\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010?\u001a\u00020\u001dH\u0002J\u0016\u0010@\u001a\u00020\u001d2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0BH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopARPresenter;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/adapter/StickerViewAdapter;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Landroid/support/v7/app/AppCompatActivity;", "stub", "Landroid/support/v7/widget/ViewStubCompat;", "(Landroid/support/v7/app/AppCompatActivity;Landroid/support/v7/widget/ViewStubCompat;)V", "currentSticker", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "lastShowLoadingMsgTimestamp", "", "loadFinish", "", "loadingStartTime", "", "pixaloopData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopData;", "pixaloopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/listener/OnPixaloopListener;", "pixaloopManager", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopManager;", "pixaloopMattingView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/ui/PixaloopMattingView;", "scanImgList", "Ljava/util/ArrayList;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "animateImageToPreview", "", "path", "cancel", "clearData", "goSelectPhoto", "initDetectMessage", "isCurrentSticker", "faceStickerBean", "isSizeValid", "monitorLoadingTime", "time", "(Ljava/lang/Long;)V", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onGameStickerChosen", "faceSticker", "onPause", "onStickerCancel", "onStickerChosen", "reportPhotoEvent", "isAlbum", "scanDefaultAllImg", "scanFinish", "selectSticker", "setMediaRecordPresenter", "presenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "setPixaloopListener", "setShortVideoContext", "showScanImgListView", "startScanImage", "pathList", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PixaloopARPresenter extends com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.a implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3988a;

    /* renamed from: b  reason: collision with root package name */
    public FaceStickerBean f3989b = FaceStickerBean.NONE;

    /* renamed from: c  reason: collision with root package name */
    public final c f3990c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<String> f3991d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public String f3992e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3993f = new b();
    public long g = System.currentTimeMillis();
    final AppCompatActivity h;
    private com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b j = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b();
    private boolean k;
    private fh l;
    private com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopMessage;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PixaloopARPresenter f69343b;

        a(PixaloopARPresenter pixaloopARPresenter) {
            this.f69343b = pixaloopARPresenter;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l;
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c cVar = (com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c) obj;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f69342a, false, 78894, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f69342a, false, 78894, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.class}, Void.TYPE);
                return;
            }
            if (cVar != null) {
                if (cVar.f69368a == c.a.a()) {
                    this.f69343b.g = System.currentTimeMillis();
                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar2 = this.f69343b.f3990c;
                    if (cVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    b bVar = this.f69343b.f3993f;
                    if (bVar == null) {
                        Intrinsics.throwNpe();
                    }
                    Handler handler = bVar.f69388c;
                    if (PatchProxy.isSupport(new Object[]{handler}, cVar2, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69427a, false, 78995, new Class[]{Handler.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar3 = cVar2;
                        PatchProxy.accessDispatch(new Object[]{handler}, cVar3, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69427a, false, 78995, new Class[]{Handler.class}, Void.TYPE);
                    } else if (handler != null && cVar2.i()) {
                        if (cVar2.f69430c == null) {
                            Activity activity = cVar2.f69432e;
                            if (activity == null) {
                                Intrinsics.throwNpe();
                            }
                            cVar2.f69430c = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.a(activity);
                        }
                        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.a aVar = cVar2.f69430c;
                        if (aVar == null) {
                            Intrinsics.throwNpe();
                        }
                        if (!aVar.isShowing()) {
                            handler.postDelayed(new c.b(cVar2), (long) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
                        }
                    }
                    this.f69343b.f3992e = cVar.f69371d;
                }
                if (cVar.f69368a == c.a.b() && (TextUtils.isEmpty(this.f69343b.f3992e) || Intrinsics.areEqual((Object) this.f69343b.f3992e, (Object) cVar.f69371d))) {
                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar4 = this.f69343b.f3990c;
                    if (cVar4 == null) {
                        Intrinsics.throwNpe();
                    }
                    cVar4.h();
                    PixaloopARPresenter pixaloopARPresenter = this.f69343b;
                    Long valueOf = Long.valueOf((System.currentTimeMillis() - this.f69343b.g) / 1000);
                    if (PatchProxy.isSupport(new Object[]{valueOf}, pixaloopARPresenter, PixaloopARPresenter.f3988a, false, 78888, new Class[]{Long.class}, Void.TYPE)) {
                        PixaloopARPresenter pixaloopARPresenter2 = pixaloopARPresenter;
                        PatchProxy.accessDispatch(new Object[]{valueOf}, pixaloopARPresenter2, PixaloopARPresenter.f3988a, false, 78888, new Class[]{Long.class}, Void.TYPE);
                        return;
                    }
                    bi a2 = bi.a().a("duration", valueOf);
                    FaceStickerBean faceStickerBean = pixaloopARPresenter.f3989b;
                    if (faceStickerBean != null) {
                        l = Long.valueOf(faceStickerBean.getStickerId());
                    } else {
                        l = null;
                    }
                    n.a("pixaloop_loading_time", 0, a2.a("stickid", l).b());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class b implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PixaloopARPresenter f69345b;

        b(PixaloopARPresenter pixaloopARPresenter) {
            this.f69345b = pixaloopARPresenter;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f69344a, false, 78895, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f69344a, false, 78895, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f69345b.a();
        }
    }

    public final void c(@NotNull FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3988a, false, 78872, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3988a, false, 78872, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean2, "faceSticker");
    }

    public final void a(boolean z) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3988a, false, 78887, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3988a, false, 78887, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (this.l == null) {
            str = "";
        } else {
            fh fhVar = this.l;
            if (fhVar == null) {
                Intrinsics.throwNpe();
            }
            str = fhVar.r;
        }
        d a3 = a2.a("shoot_way", str);
        if (this.l == null) {
            str2 = "";
        } else {
            fh fhVar2 = this.l;
            if (fhVar2 == null) {
                Intrinsics.throwNpe();
            }
            str2 = fhVar2.q;
        }
        d a4 = a3.a("creation_id", str2);
        if (this.l == null) {
            obj = "";
        } else {
            fh fhVar3 = this.l;
            if (fhVar3 == null) {
                Intrinsics.throwNpe();
            }
            obj = Integer.valueOf(fhVar3.v);
        }
        d a5 = a4.a("draft_id", obj);
        if (this.f3989b == null) {
            obj2 = "";
        } else {
            FaceStickerBean faceStickerBean = this.f3989b;
            if (faceStickerBean == null) {
                Intrinsics.throwNpe();
            }
            obj2 = Long.valueOf(faceStickerBean.getStickerId());
        }
        d a6 = a5.a("prop_id", obj2);
        if (this.f3989b == null) {
            str3 = "";
        } else {
            FaceStickerBean faceStickerBean2 = this.f3989b;
            if (faceStickerBean2 == null) {
                Intrinsics.throwNpe();
            }
            str3 = faceStickerBean2.getPropSource();
        }
        r.a("prop_customized_click", (Map) a6.a("tab_name", str3).a("enter_from", "video_shoot_page").a("click_content", z ? "album" : "photo").f34114b);
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78880, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
        if (cVar != null) {
            cVar.c();
        }
        d();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78886, new Class[0], Void.TYPE);
            return;
        }
        this.k = true;
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
        if (cVar != null) {
            cVar.e();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78884, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
        if (cVar != null) {
            cVar.h();
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar2 = this.f3990c;
        if (cVar2 != null) {
            cVar2.d();
        }
    }

    private final void d() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78882, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3993f != null) {
            b bVar = this.f3993f;
            FaceStickerBean faceStickerBean = this.f3989b;
            if (faceStickerBean == null) {
                Intrinsics.throwNpe();
            }
            bVar.a(faceStickerBean.getStickerId());
            this.f3993f.c();
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar2 = this.j;
            if (bVar2 != null) {
                str = bVar2.b();
            } else {
                str = null;
            }
            if (str != null) {
                b bVar3 = this.f3993f;
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar4 = this.j;
                if (bVar4 != null) {
                    str2 = bVar4.b();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                bVar3.a(str2, "");
            }
        }
        this.k = false;
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        cVar.e();
        this.f3990c.g();
        this.j = null;
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78885, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78885, new Class[0], Void.TYPE);
        } else if (!j.a((Collection<T>) this.f3991d)) {
            ArrayList arrayList = new ArrayList(this.f3991d.size());
            Iterator<String> it2 = this.f3991d.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "path");
                arrayList.add(new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b(next, "", true));
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            cVar.a(arrayList);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78875, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        cVar.b();
        if (j.a((Collection<T>) this.f3991d)) {
            b bVar = this.f3993f;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            bVar.b();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3991d);
        a((List<String>) arrayList);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78883, new Class[0], Void.TYPE);
            return;
        }
        d();
        this.f3991d.clear();
        b bVar = this.f3993f;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        if (PatchProxy.isSupport(new Object[0], bVar, b.f69386a, false, 78906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, b.f69386a, false, 78906, new Class[0], Void.TYPE);
        } else {
            if (Build.VERSION.SDK_INT >= 18) {
                HandlerThread handlerThread = bVar.f69387b;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
            }
            Handler handler = bVar.f69388c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
        a.a(false);
        a.b(true);
    }

    public final void a(@NotNull fh fhVar) {
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{fhVar2}, this, f3988a, false, 78866, new Class[]{fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fhVar2}, this, f3988a, false, 78866, new Class[]{fh.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fhVar2, "shortVideoContext");
        this.l = fhVar2;
    }

    public final void b(@NotNull FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3988a, false, 78871, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3988a, false, 78871, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean2, "faceSticker");
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
        if (cVar != null) {
            cVar.d();
        }
        c();
    }

    public final void a(@NotNull MediaRecordPresenter mediaRecordPresenter) {
        MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
        if (PatchProxy.isSupport(new Object[]{mediaRecordPresenter2}, this, f3988a, false, 78869, new Class[]{MediaRecordPresenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaRecordPresenter2}, this, f3988a, false, 78869, new Class[]{MediaRecordPresenter.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mediaRecordPresenter2, "presenter");
        b bVar = this.f3993f;
        if (bVar != null) {
            if (PatchProxy.isSupport(new Object[]{mediaRecordPresenter2}, bVar, b.f69386a, false, 78901, new Class[]{MediaRecordPresenter.class}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{mediaRecordPresenter2}, bVar2, b.f69386a, false, 78901, new Class[]{MediaRecordPresenter.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(mediaRecordPresenter2, "presenter");
                bVar.m = mediaRecordPresenter2;
            }
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a aVar) {
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3988a, false, 78867, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3988a, false, 78867, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "pixaloopListener");
        this.m = aVar2;
    }

    public final void a(@NotNull FaceStickerBean faceStickerBean) {
        boolean z;
        boolean z2;
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3988a, false, 78870, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3988a, false, 78870, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean2, "faceSticker");
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3988a, false, 78874, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3988a, false, 78874, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        a.a(false);
        if (faceStickerBean2 != null) {
            if (!a.f69354f.a(faceStickerBean2)) {
                c();
                return;
            }
            k kVar = com.ss.android.ugc.aweme.port.in.a.H;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "AVEnv.sAPI");
            if (kVar.E().c(this.h) != 0) {
                com.bytedance.ies.dmt.ui.d.a.a((Context) this.h, (int) C0906R.string.bm4).a();
                return;
            }
            if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3988a, false, 78881, new Class[]{FaceStickerBean.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3988a, false, 78881, new Class[]{FaceStickerBean.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (!(faceStickerBean2 == null || this.f3989b == null)) {
                    FaceStickerBean faceStickerBean3 = this.f3989b;
                    if (faceStickerBean3 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (faceStickerBean3.getStickerId() == faceStickerBean.getStickerId()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (!z) {
                d();
            }
            if (this.j == null) {
                this.j = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b();
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar = this.j;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.f69360a, false, 78942, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.f69360a, false, 78942, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (!j.a((Collection<T>) bVar.h.f69357a)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar2 = this.j;
                if (bVar2 == null) {
                    Intrinsics.throwNpe();
                }
                String sdkExtra = faceStickerBean.getSdkExtra();
                Intrinsics.checkExpressionValueIsNotNull(sdkExtra, "faceSticker.sdkExtra");
                bVar2.a(sdkExtra);
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar3 = this.j;
                if (bVar3 == null) {
                    Intrinsics.throwNpe();
                }
                Boolean bool = bVar3.f69365f;
                if (bool == null) {
                    Intrinsics.throwNpe();
                }
                a.f69353e = bool.booleanValue();
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar4 = this.j;
                if (bVar4 == null) {
                    Intrinsics.throwNpe();
                }
                Boolean bool2 = bVar4.g;
                if (bool2 == null) {
                    Intrinsics.throwNpe();
                }
                a.b(bool2.booleanValue());
            }
            a.a(true);
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar5 = this.j;
            if (bVar5 == null) {
                Intrinsics.throwNpe();
            }
            bVar5.f69364e = String.valueOf(faceStickerBean.getStickerId());
            this.f3989b = faceStickerBean2;
            if (this.l != null) {
                fh fhVar = this.l;
                if (fhVar == null) {
                    Intrinsics.throwNpe();
                }
                if (Intrinsics.areEqual((Object) "direct_shoot", (Object) fhVar.r)) {
                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
                    if (cVar == null) {
                        Intrinsics.throwNpe();
                    }
                    FaceStickerBean faceStickerBean4 = this.f3989b;
                    if (faceStickerBean4 == null) {
                        Intrinsics.throwNpe();
                    }
                    DialogInterface.OnDismissListener bVar6 = new b(this);
                    b bVar7 = this.f3993f;
                    if (bVar7 == null) {
                        Intrinsics.throwNpe();
                    }
                    Handler handler = bVar7.f69388c;
                    if (handler == null) {
                        Intrinsics.throwNpe();
                    }
                    if (cVar.a(faceStickerBean4, bVar6, handler)) {
                        this.f3990c.c();
                    } else {
                        a();
                    }
                } else {
                    a();
                }
            }
        }
    }

    public final void a(String str) {
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{str}, this, f3988a, false, 78878, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3988a, false, 78878, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.video.b.b(str) && this.j != null) {
            if (this.m != null) {
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a aVar = this.m;
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                aVar.a(str4);
            }
            b bVar = this.f3993f;
            if (bVar != null) {
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar2 = this.j;
                if (bVar2 != null) {
                    str2 = bVar2.b();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                bVar.a(str2, str3);
                ((MediaRecordPresenterViewModel) ViewModelProviders.of((FragmentActivity) this.h).get(MediaRecordPresenterViewModel.class)).b(str);
            }
        }
    }

    public final void a(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3988a, false, 78876, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3988a, false, 78876, new Class[]{List.class}, Void.TYPE);
        } else if (!this.k && !j.a((Collection<T>) list) && this.j != null) {
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar = this.j;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            if (j.a((Collection<T>) bVar.a())) {
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f3990c;
                if (cVar != null && cVar.a() == 0) {
                    e();
                }
                b();
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar2 = this.f3990c;
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            cVar2.f();
            b bVar2 = this.f3993f;
            if (bVar2 != null) {
                bVar2.a(list, this.j);
            }
        }
    }

    public PixaloopARPresenter(@NotNull AppCompatActivity appCompatActivity, @NotNull ViewStubCompat viewStubCompat) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(viewStubCompat, "stub");
        this.h = appCompatActivity;
        this.h.getLifecycle().addObserver(this);
        this.f3990c = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c(viewStubCompat, this.h, new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.b(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69338a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PixaloopARPresenter f69339b;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f69338a, false, 78890, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69338a, false, 78890, new Class[0], Void.TYPE);
                    return;
                }
                this.f69339b.a(true);
                PixaloopARPresenter pixaloopARPresenter = this.f69339b;
                if (PatchProxy.isSupport(new Object[0], pixaloopARPresenter, PixaloopARPresenter.f3988a, false, 78879, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], pixaloopARPresenter, PixaloopARPresenter.f3988a, false, 78879, new Class[0], Void.TYPE);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("key_choose_scene", 3);
                bundle.putInt("key_photo_select_min_count", 1);
                bundle.putInt("key_photo_select_max_count", 1);
                bundle.putInt("upload_photo_min_height", 480);
                bundle.putInt("upload_photo_min_width", 360);
                bundle.putInt("key_support_flag", 1);
                MvChoosePhotoActivity.a(pixaloopARPresenter.h, bundle, a.a(), a.a());
            }

            {
                this.f69339b = r1;
            }

            public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar) {
                String str;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f69338a, false, 78889, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f69338a, false, 78889, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE);
                    return;
                }
                if (bVar != null) {
                    str = bVar.f69361b;
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f69339b.a(bVar.f69361b);
                    this.f69339b.a(false);
                }
            }
        });
        b bVar = this.f3993f;
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c r11 = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69340a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PixaloopARPresenter f69341b;

            {
                this.f69341b = r1;
            }

            public final void b(@NotNull List<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b> list) {
                List<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b> list2 = list;
                if (PatchProxy.isSupport(new Object[]{list2}, this, f69340a, false, 78893, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list2}, this, f69340a, false, 78893, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(list2, "dataList");
                this.f69341b.b();
            }

            public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar) {
                String str;
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar2 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar2}, this, f69340a, false, 78892, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar2}, this, f69340a, false, 78892, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE);
                    return;
                }
                if (!(this.f69341b.f3990c == null || bVar2 == null || !bVar2.f69363d)) {
                    if (this.f69341b.f3989b == null) {
                        str = "";
                    } else {
                        FaceStickerBean faceStickerBean = this.f69341b.f3989b;
                        if (faceStickerBean == null) {
                            Intrinsics.throwNpe();
                        }
                        str = String.valueOf(faceStickerBean.getStickerId());
                    }
                    if (!TextUtils.isEmpty(bVar2.f69364e) && Intrinsics.areEqual((Object) bVar2.f69364e, (Object) str)) {
                        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = this.f69341b.f3990c;
                        if (PatchProxy.isSupport(new Object[]{bVar2}, cVar, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69427a, false, 78989, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar2 = cVar;
                            PatchProxy.accessDispatch(new Object[]{bVar2}, cVar2, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69427a, false, 78989, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE);
                        } else if (bVar2 != null) {
                            PixaloopMattingAdapter pixaloopMattingAdapter = cVar.f69429b;
                            if (pixaloopMattingAdapter == null) {
                                Intrinsics.throwNpe();
                            }
                            if (PatchProxy.isSupport(new Object[]{bVar2}, pixaloopMattingAdapter, PixaloopMattingAdapter.f69373a, false, 78927, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE)) {
                                Object[] objArr = {bVar2};
                                PixaloopMattingAdapter pixaloopMattingAdapter2 = pixaloopMattingAdapter;
                                PatchProxy.accessDispatch(objArr, pixaloopMattingAdapter2, PixaloopMattingAdapter.f69373a, false, 78927, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE);
                                return;
                            }
                            Intrinsics.checkParameterIsNotNull(bVar2, "pixaloopData");
                            pixaloopMattingAdapter.f69376c.add(bVar2);
                            pixaloopMattingAdapter.notifyItemInserted(pixaloopMattingAdapter.getItemCount() - 1);
                        }
                    }
                }
            }

            public final void a(@NotNull List<String> list) {
                List<String> list2;
                List list3;
                boolean z;
                List<String> list4 = list;
                if (PatchProxy.isSupport(new Object[]{list4}, this, f69340a, false, 78891, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list4}, this, f69340a, false, 78891, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(list4, "imgList");
                Collection collection = list4;
                if (!collection.isEmpty()) {
                    if (!collection.isEmpty()) {
                        list2 = list4;
                    } else {
                        list2 = null;
                    }
                    if (list2 != null) {
                        Collection arrayList = new ArrayList();
                        for (Object next : list2) {
                            String str = (String) next;
                            PixaloopARPresenter pixaloopARPresenter = this.f69341b;
                            if (PatchProxy.isSupport(new Object[]{str}, pixaloopARPresenter, PixaloopARPresenter.f3988a, false, 78868, new Class[]{String.class}, Boolean.TYPE)) {
                                PixaloopARPresenter pixaloopARPresenter2 = pixaloopARPresenter;
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, pixaloopARPresenter2, PixaloopARPresenter.f3988a, false, 78868, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                int[] imageWidthHeight = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().getImageWidthHeight(str);
                                int i = imageWidthHeight[0];
                                int i2 = imageWidthHeight[1];
                                if (i < 360 || i2 < 480) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            }
                            if (z) {
                                arrayList.add(next);
                            }
                        }
                        list3 = (List) arrayList;
                    } else {
                        list3 = new ArrayList();
                    }
                    this.f69341b.f3991d.addAll(list3);
                    this.f69341b.a(list3);
                    return;
                }
                this.f69341b.b();
            }
        };
        if (PatchProxy.isSupport(new Object[]{r11}, bVar, b.f69386a, false, 78900, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c.class}, Void.TYPE)) {
            b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{r11}, bVar2, b.f69386a, false, 78900, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(r11, "listener");
            bVar.h = r11;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3988a, false, 78877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3988a, false, 78877, new Class[0], Void.TYPE);
            return;
        }
        if (a.f69352d) {
            ((PixaloopMessageModule) ViewModelProviders.of((FragmentActivity) this.h).get(PixaloopMessageModule.class)).a().observe(this.h, new a(this));
        }
    }
}
