package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.common.utility.UIUtils;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.ui.HollowTextView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.net.NetStateReceiver;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.aweme.shortvideo.sticker.q;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordViewModel;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b*\u0001\u001e\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u000205J\u0010\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020;H\u0002J\u000e\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\u001aJ\b\u0010A\u001a\u000205H\u0002J\u0010\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u000eH\u0002J\u0018\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0002J\u000e\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020\u001aJ\u0016\u0010K\u001a\u0002052\f\u0010L\u001a\b\u0012\u0004\u0012\u00020F0MH\u0002J\u0006\u0010N\u001a\u000205J\u0018\u0010O\u001a\u0002052\u0006\u0010P\u001a\u00020\u001a2\b\b\u0002\u0010Q\u001a\u00020\u001aJ\u0010\u0010R\u001a\u0002052\u0006\u0010C\u001a\u00020\u000eH\u0002J\u001a\u0010S\u001a\u0002052\u0006\u0010T\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryScenePresenter;", "", "context", "Landroid/support/v7/app/AppCompatActivity;", "mediaRecordPresenterProvider", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/MediaRecordPresenterProvider;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "indicatorContainer", "Landroid/view/ViewGroup;", "(Landroid/support/v7/app/AppCompatActivity;Lcom/ss/android/ugc/aweme/story/shootvideo/record/MediaRecordPresenterProvider;Landroid/support/v7/widget/RecyclerView;Landroid/view/ViewGroup;)V", "applyStickerTask", "Ljava/lang/Runnable;", "currentSceneSticker", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "currentSelectedPosition", "", "effectPlatform", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "getEffectPlatform", "()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "effectPlatform$delegate", "Lkotlin/Lazy;", "faceStickerViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerViewModel;", "isSceneEnable", "", "isShowStickerName", "mRequestId", "netStateObserver", "com/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryScenePresenter$netStateObserver$1", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryScenePresenter$netStateObserver$1;", "prefetchStickerViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerFetchViewModel;", "refreshDataNeeded", "safeHandler", "Lcom/ss/android/ugc/aweme/base/SafeHandler;", "scenePagerAdapter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneRecyclerAdapter;", "shortVideoContextViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;", "snapHelper", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneLinearSnapHelper;", "stickerNameDismissTask", "storyRecordViewModel", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewModel;", "storySceneViewModel", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel;", "storyZoomInStickerHelper", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryZoomInStickerHelper;", "tvStickerName", "Lcom/ss/android/ugc/aweme/base/ui/HollowTextView;", "addRecyclerViewScrollListener", "", "listener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "cancelSticker", "createLabel", "name", "", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "enableNetStateWatcher", "enable", "initRecyclerView", "onApplySticker", "sticker", "prefetchFirstEffect", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "stickerWrapper", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerWrapper;", "prefetchSceneList", "isFromAppStart", "prefetchStickerImages", "effects", "", "reselectSticker", "setSceneEnable", "isEnable", "resetViewNeeded", "showStickerName", "useSticker", "position", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74052a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f74053b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;"))};

    /* renamed from: c  reason: collision with root package name */
    public boolean f74054c;

    /* renamed from: d  reason: collision with root package name */
    public FaceStickerBean f74055d;

    /* renamed from: e  reason: collision with root package name */
    public int f74056e;

    /* renamed from: f  reason: collision with root package name */
    public final StorySceneRecyclerAdapter f74057f = new StorySceneRecyclerAdapter(new j(this), this.s, new k(this));
    boolean g = true;
    public final ShortVideoContextViewModel h;
    public final StorySceneViewModel i;
    final StoryRecordViewModel j;
    final StickerFetchViewModel k;
    public final FaceStickerViewModel l;
    final SafeHandler m;
    public int n;
    final Runnable o;
    public HollowTextView p;
    public final AppCompatActivity q;
    public final com.ss.android.ugc.aweme.story.shootvideo.record.b r;
    public final RecyclerView s;
    final ViewGroup t;
    private final Lazy u = LazyKt.lazy(new C0769b(this));
    private boolean v = true;
    private final StorySceneLinearSnapHelper w;
    private final d x;
    private final Runnable y;
    private final e z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74061a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74062b;

        a(b bVar) {
            this.f74062b = bVar;
        }

        public final void run() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f74061a, false, 85945, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74061a, false, 85945, new Class[0], Void.TYPE);
                return;
            }
            FaceStickerBean faceStickerBean = this.f74062b.f74055d;
            if (faceStickerBean != null && this.f74062b.f74054c) {
                fh fhVar = this.f74062b.h.f65401b;
                Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
                fhVar.d().setStorySceneId(String.valueOf(faceStickerBean.getStickerId()));
                this.f74062b.l.a(faceStickerBean);
                b bVar = this.f74062b;
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, bVar, b.f74052a, false, 85940, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, bVar2, b.f74052a, false, 85940, new Class[]{FaceStickerBean.class}, Void.TYPE);
                } else if (bVar.g) {
                    bVar.m.removeCallbacks(bVar.o);
                    String name = faceStickerBean.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "sticker.name");
                    if (PatchProxy.isSupport(new Object[]{name}, bVar, b.f74052a, false, 85943, new Class[]{String.class}, Void.TYPE)) {
                        b bVar3 = bVar;
                        PatchProxy.accessDispatch(new Object[]{name}, bVar3, b.f74052a, false, 85943, new Class[]{String.class}, Void.TYPE);
                    } else {
                        bVar.t.removeAllViews();
                        HollowTextView.a aVar = new HollowTextView.a();
                        aVar.f34948b = u.a(13.0d);
                        aVar.f34949c = o.a(C0906R.color.ov);
                        aVar.f34950d = u.a(2.0d);
                        aVar.g = true;
                        aVar.f34952f = true;
                        aVar.h = true;
                        aVar.f34951e = true;
                        HollowTextView hollowTextView = new HollowTextView((Context) bVar.q, aVar);
                        hollowTextView.setText(name);
                        hollowTextView.setPadding(u.a(6.0d), u.a(2.0d), u.a(6.0d), u.a(6.0d));
                        bVar.t.addView(hollowTextView);
                        bVar.p = hollowTextView;
                    }
                    bVar.m.postDelayed(bVar.o, 3000);
                }
                b bVar4 = this.f74062b;
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, bVar4, b.f74052a, false, 85942, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    b bVar5 = bVar4;
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, bVar5, b.f74052a, false, 85942, new Class[]{FaceStickerBean.class}, Void.TYPE);
                } else {
                    if (ae.a("camera_front", faceStickerBean)) {
                        bVar4.i.a(1);
                    } else if (ae.a("camera_back", faceStickerBean)) {
                        bVar4.i.a(0);
                    }
                    long b2 = ae.b(faceStickerBean);
                    if (b2 > 0) {
                        bVar4.j.a(b2);
                    }
                }
                MediaRecordPresenter g = this.f74062b.r.g();
                String localPath = faceStickerBean.getLocalPath();
                int id = (int) faceStickerBean.getId();
                int i = this.f74062b.n;
                if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectNewEngine) || !ae.a(faceStickerBean)) {
                    z = false;
                } else {
                    z = true;
                }
                g.a(localPath, id, i, z);
                fh fhVar2 = this.f74062b.h.f65401b;
                Intrinsics.checkExpressionValueIsNotNull(fhVar2, "shortVideoContextViewModel.shortVideoContext");
                String name2 = faceStickerBean.getName();
                Intrinsics.checkExpressionValueIsNotNull(name2, "sticker.name");
                if (PatchProxy.isSupport(new Object[]{fhVar2, name2}, null, com.ss.android.ugc.aweme.story.shootvideo.record.g.f73933a, true, 85548, new Class[]{fh.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fhVar2, name2}, null, com.ss.android.ugc.aweme.story.shootvideo.record.g.f73933a, true, 85548, new Class[]{fh.class, String.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(fhVar2, "shortVideoContext");
                Intrinsics.checkParameterIsNotNull(name2, "statusName");
                com.ss.android.ugc.aweme.utils.a.f75468b.a("select_background", com.ss.android.ugc.aweme.story.shootvideo.record.g.a(fhVar2).a("enter_from", "video_shoot_page").a("to_status", name2).f34114b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.scene.b$b  reason: collision with other inner class name */
    static final class C0769b extends Lambda implements Function0<EffectPlatform> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0769b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @NotNull
        public final EffectPlatform invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85946, new Class[0], EffectPlatform.class)) {
                return (EffectPlatform) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85946, new Class[0], EffectPlatform.class);
            }
            y yVar = com.ss.android.ugc.aweme.port.in.a.h;
            Intrinsics.checkExpressionValueIsNotNull(yVar, "AVEnv.LOCATION_SERVICE");
            EffectPlatform effectPlatform = new EffectPlatform(this.this$0.q, yVar.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
            effectPlatform.a((LifecycleOwner) this.this$0.q);
            return effectPlatform;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 85947, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 85947, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.this$0.f74056e != i) {
                this.this$0.a(i, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "hasStop", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74063a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74064b;

        d(b bVar) {
            this.f74064b = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f74063a, false, 85948, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f74063a, false, 85948, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            this.f74064b.f74057f.f74035b = Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryScenePresenter$netStateObserver$1", "Lcom/ss/android/ugc/aweme/shortvideo/net/NetChangeObserver;", "isNetConnected", "", "onNetConnected", "", "type", "", "onNetDisConnect", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.ss.android.ugc.aweme.shortvideo.net.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74065a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74066b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f74067c = true;

        public final void a() {
            this.f74067c = false;
        }

        e(b bVar) {
            this.f74066b = bVar;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74065a, false, 85949, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74065a, false, 85949, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!this.f74067c) {
                this.f74067c = true;
                this.f74066b.a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "iStickerFetch", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/IStickerFetch;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<com.ss.android.ugc.aweme.shortvideo.sticker.k> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74069b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ah f74070c;

        f(b bVar, ah ahVar) {
            this.f74069b = bVar;
            this.f74070c = ahVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.sticker.k kVar = (com.ss.android.ugc.aweme.shortvideo.sticker.k) obj;
            if (PatchProxy.isSupport(new Object[]{kVar}, this, f74068a, false, 85950, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.k.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kVar}, this, f74068a, false, 85950, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.k.class}, Void.TYPE);
            } else if (kVar != null) {
                kVar.a(this.f74070c, new k.c(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f74071a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ f f74072b;

                    public final void a(@Nullable Effect effect) {
                    }

                    public final void a(@Nullable Effect effect, int i) {
                    }

                    public final void a(@Nullable Effect effect, @Nullable com.ss.android.ugc.effectmanager.common.e.c cVar) {
                    }

                    {
                        this.f74072b = r1;
                    }

                    public final void b(@Nullable Effect effect) {
                        if (PatchProxy.isSupport(new Object[]{effect}, this, f74071a, false, 85951, new Class[]{Effect.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect}, this, f74071a, false, 85951, new Class[]{Effect.class}, Void.TYPE);
                            return;
                        }
                        if (this.f74072b.f74069b.f74054c) {
                            this.f74072b.f74069b.f74057f.notifyItemChanged(0, this.f74072b.f74070c);
                            if (this.f74072b.f74069b.f74056e == 0) {
                                this.f74072b.f74069b.a(0, true);
                            }
                        }
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85952, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85952, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.i.a(this.this$0.a(), false, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85953, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85953, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.i.a(this.this$0.a(), false, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85954, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85954, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.i.a(this.this$0.a(), true, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "get"}, k = 3, mv = {1, 1, 15})
    static final class j<T> implements s<com.ss.android.ugc.aweme.effectplatform.g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74074b;

        j(b bVar) {
            this.f74074b = bVar;
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f74073a, false, 85955, new Class[0], EffectPlatform.class)) {
                return this.f74074b.a();
            }
            return (EffectPlatform) PatchProxy.accessDispatch(new Object[0], this, f74073a, false, 85955, new Class[0], EffectPlatform.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 85956, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 85956, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == this.this$0.f74056e) {
                this.this$0.a(i, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74076b;

        l(b bVar) {
            this.f74076b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f74075a, false, 85957, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74075a, false, 85957, new Class[0], Void.TYPE);
                return;
            }
            HollowTextView hollowTextView = this.f74076b.p;
            if (hollowTextView != null) {
                hollowTextView.animate().alpha(0.0f).setDuration(150).start();
            }
        }
    }

    public final EffectPlatform a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f74052a, false, 85929, new Class[0], EffectPlatform.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f74052a, false, 85929, new Class[0], EffectPlatform.class);
        } else {
            value = this.u.getValue();
        }
        return (EffectPlatform) value;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74052a, false, 85936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74052a, false, 85936, new Class[0], Void.TYPE);
        } else if (this.f74054c) {
            a(this.f74056e, false);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74052a, false, 85941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74052a, false, 85941, new Class[0], Void.TYPE);
            return;
        }
        FaceStickerBean faceStickerBean = this.f74055d;
        if (faceStickerBean != null) {
            this.l.b(faceStickerBean);
            this.m.removeCallbacks(this.y);
            this.r.g().a((String) null, 0, 0, false);
            this.f74055d = null;
        }
    }

    public final void a(List<? extends Effect> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f74052a, false, 85938, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f74052a, false, 85938, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (Effect effect : list) {
            UrlModel urlModel = effect.icon_url;
            if (urlModel != null) {
                List<String> list2 = urlModel.url_list;
                if (list2 != null) {
                    if (!(!list2.isEmpty())) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        String str = list2.get(0);
                        if (str != null) {
                            com.ss.android.ugc.aweme.base.c.b(str);
                        }
                    }
                }
            }
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74052a, false, 85933, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74052a, false, 85933, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            NetStateReceiver.a((Context) this.q);
            NetStateReceiver.a((com.ss.android.ugc.aweme.shortvideo.net.a) this.z);
        } else {
            NetStateReceiver.b((Context) this.q);
            NetStateReceiver.b((com.ss.android.ugc.aweme.shortvideo.net.a) this.z);
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74052a, false, 85932, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74052a, false, 85932, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            if (com.ss.android.ugc.aweme.story.shootvideo.record.a.a.b.f73856c.a(new g(this))) {
                this.v = false;
            }
        } else if (this.v) {
            com.ss.android.ugc.aweme.story.shootvideo.record.a.a.b.f73856c.a("zoomin", new h(this), new i(this));
        } else {
            this.v = true;
        }
    }

    /* access modifiers changed from: private */
    public final void a(int i2, boolean z2) {
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74052a, false, 85939, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f74052a, false, 85939, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!this.h.f()) {
            this.f74056e = i2;
        } else {
            this.g = z2;
            this.f74056e = i2;
            c();
            ah a2 = this.f74057f.a(i2);
            if (a2 != null) {
                if (a2.f69297d == 1) {
                    z3 = true;
                }
                if (!z3) {
                    a2 = null;
                }
                if (a2 != null) {
                    Effect effect = a2.f69295b;
                    if (effect != null) {
                        FaceStickerBean a3 = q.a(effect);
                        Intrinsics.checkExpressionValueIsNotNull(a3, "StickerConfig.covert(effect)");
                        this.f74055d = a3;
                        this.m.postDelayed(this.y, 100);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z2, boolean z3) {
        int i2;
        boolean z4 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f74052a, false, 85931, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f74052a, false, 85931, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.t;
        int i3 = 8;
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        RecyclerView recyclerView = this.s;
        if (z4) {
            i3 = 0;
        }
        recyclerView.setVisibility(i3);
        if (!z4) {
            if (this.f74054c) {
                c();
                this.m.removeCallbacks(this.o);
            }
            this.v = true;
            fh fhVar = this.h.f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
            fhVar.d().setStorySceneId("");
        } else if (z3) {
            this.f74057f.f74036c = true;
            this.s.setAdapter(this.f74057f);
            RecyclerView recyclerView2 = this.s;
            recyclerView2.setAlpha(0.0f);
            recyclerView2.setTranslationX((float) u.a(120.0d));
            recyclerView2.animate().alpha(1.0f).translationX(0.0f).setInterpolator(new DecelerateInterpolator()).setDuration(300).start();
            if (!this.f74057f.f74037d.isEmpty()) {
                a(0, true);
            }
        } else {
            a(this.f74056e, true);
        }
        this.f74054c = z4;
        if (z4) {
            d dVar = this.x;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f74078a, false, 85974, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f74078a, false, 85974, new Class[0], Void.TYPE);
            } else {
                dVar.f74080c.a().observe(dVar.h, dVar.f74083f);
                dVar.f74080c.b().observe(dVar.h, dVar.g);
            }
        } else {
            d dVar2 = this.x;
            if (PatchProxy.isSupport(new Object[0], dVar2, d.f74078a, false, 85975, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar2, d.f74078a, false, 85975, new Class[0], Void.TYPE);
                return;
            }
            dVar2.f74080c.b().removeObserver(dVar2.g);
            dVar2.f74080c.a().removeObserver(dVar2.f74083f);
        }
    }

    public b(@NotNull AppCompatActivity appCompatActivity, @NotNull com.ss.android.ugc.aweme.story.shootvideo.record.b bVar, @NotNull RecyclerView recyclerView, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "mediaRecordPresenterProvider");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewGroup, "indicatorContainer");
        this.q = appCompatActivity;
        this.r = bVar;
        this.s = recyclerView;
        this.t = viewGroup;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.q).get(ShortVideoContextViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(co…extViewModel::class.java]");
        this.h = (ShortVideoContextViewModel) viewModel;
        ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) this.q).get(StorySceneViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(co…eneViewModel::class.java]");
        this.i = (StorySceneViewModel) viewModel2;
        ViewModel viewModel3 = ViewModelProviders.of((FragmentActivity) this.q).get(StoryRecordViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel3, "ViewModelProviders.of(co…ordViewModel::class.java]");
        this.j = (StoryRecordViewModel) viewModel3;
        ViewModel viewModel4 = ViewModelProviders.of((FragmentActivity) this.q).get(StickerFetchViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel4, "ViewModelProviders.of(co…tchViewModel::class.java]");
        this.k = (StickerFetchViewModel) viewModel4;
        ViewModel viewModel5 = ViewModelProviders.of((FragmentActivity) this.q).get(FaceStickerViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel5, "ViewModelProviders.of(co…kerViewModel::class.java)");
        this.l = (FaceStickerViewModel) viewModel5;
        this.w = new StorySceneLinearSnapHelper();
        this.m = new SafeHandler(this.q);
        this.x = new d(this.q);
        this.o = new l(this);
        this.y = new a(this);
        this.z = new e(this);
        if (PatchProxy.isSupport(new Object[0], this, f74052a, false, 85930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74052a, false, 85930, new Class[0], Void.TYPE);
        } else {
            this.s.setLayoutManager(new StorySceneLayoutManager(this.q, 0, false));
            this.s.setAdapter(this.f74057f);
            int screenWidth = (int) (((((float) UIUtils.getScreenWidth(this.q)) - UIUtils.dip2Px(this.q, 80.0f)) + 1.0f) / 2.0f);
            RecyclerView recyclerView2 = this.s;
            recyclerView2.setPadding(screenWidth, recyclerView2.getPaddingTop(), screenWidth, this.s.getPaddingBottom());
            this.w.attachToRecyclerView(this.s);
            this.w.f74030d = new c(this);
            this.h.i().observe(this.q, new d(this));
        }
        this.i.f74042b.observe(this.q, new Observer<com.ss.android.ugc.aweme.w.b.a<List<? extends Effect>>>(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74058a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f74059b;

            {
                this.f74059b = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                a.C0799a aVar;
                com.ss.android.ugc.aweme.w.b.a aVar2 = (com.ss.android.ugc.aweme.w.b.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar2}, this, f74058a, false, 85944, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar2}, this, f74058a, false, 85944, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE);
                    return;
                }
                List list = null;
                if (aVar2 != null) {
                    aVar = aVar2.f76550c;
                } else {
                    aVar = null;
                }
                if (aVar != null && c.f74077a[aVar.ordinal()] == 1) {
                    List list2 = (List) aVar2.f76549b;
                    if (list2 != null) {
                        if (!list2.isEmpty()) {
                            list = list2;
                        }
                        if (list != null) {
                            Iterable<Effect> iterable = list;
                            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                            for (Effect a2 : iterable) {
                                arrayList.add(ah.a(a2, "", (com.ss.android.ugc.aweme.effectplatform.g) this.f74059b.a()));
                            }
                            List mutableList = CollectionsKt.toMutableList((Collection<? extends T>) (List) arrayList);
                            b bVar = this.f74059b;
                            Effect effect = (Effect) list.get(0);
                            Object obj2 = mutableList.get(0);
                            Intrinsics.checkExpressionValueIsNotNull(obj2, "stickerWrapperList[0]");
                            ah ahVar = (ah) obj2;
                            if (PatchProxy.isSupport(new Object[]{effect, ahVar}, bVar, b.f74052a, false, 85937, new Class[]{Effect.class, ah.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect, ahVar}, bVar, b.f74052a, false, 85937, new Class[]{Effect.class, ah.class}, Void.TYPE);
                            } else if (!ah.a(effect, (com.ss.android.ugc.aweme.effectplatform.g) bVar.a())) {
                                ahVar.f69297d = 4;
                                bVar.k.a(bVar.a()).observe(bVar.q, new f(bVar, ahVar));
                            }
                            this.f74059b.a(list);
                            this.f74059b.f74057f.a(mutableList);
                        }
                    }
                }
            }
        });
        this.r.g().a((IStickerRequestCallback) new IStickerRequestCallback(this) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f74060a;

            {
                this.f74060a = r1;
            }

            public final void onStickerRequested(long j, boolean z) {
                this.f74060a.n = (int) j;
            }
        });
    }
}
