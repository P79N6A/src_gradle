package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.feed.f.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0002J(\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010)\u001a\u00020 2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J(\u0010*\u001a\u00020 2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002J\b\u0010-\u001a\u00020&H\u0014J\u0006\u0010.\u001a\u00020\u001cJ\n\u0010/\u001a\u0004\u0018\u00010\u001eH\u0016J\"\u00100\u001a\u00020 2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u00020 2\u0006\u00101\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00107\u001a\u00020 H\u0002J\u0012\u00108\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010(H\u0003J\u0012\u00109\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010:\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010<\u001a\u00020 H\u0016J\b\u0010=\u001a\u00020 H\u0016J\b\u0010>\u001a\u00020 H\u0016J\u0010\u0010?\u001a\u00020 2\u0006\u00104\u001a\u00020@H\u0007J\b\u0010A\u001a\u00020 H\u0016J\b\u0010B\u001a\u00020 H\u0016J\u0010\u0010C\u001a\u00020 2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010D\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010E\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020&H\u0002J\u0010\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020\u001eH\u0016J\b\u0010J\u001a\u00020 H\u0016J\u0010\u0010J\u001a\u00020 2\u0006\u00103\u001a\u00020&H\u0002R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/LifecycleOwnerWidget;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Lcom/ss/android/ugc/aweme/sticker/IInteractStickerWidget;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IClickHandle;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "()V", "TAG", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "awemeStickerStructs", "", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "interactStickers", "", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/InteractSticker;", "onTouchListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/impl/WidgetOnTouchListener;", "rootView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/InteractStickerParent;", "videoDataGetter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;", "videoStickerStructs", "viewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerViewModel;", "voteDetailSaveData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailSaveData;", "appendInteractStickers", "", "struct", "stickerView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerView;", "appendInteractStickersImpl", "index", "", "view", "Landroid/view/View;", "bindStickerParamsData", "bindStickersData", "newAwemeList", "newVideoList", "getLayoutId", "getViewModel", "getVoteDetailSaveData", "handleDoubleClick", "curPts", "", "type", "event", "Landroid/view/MotionEvent;", "handleSingleTap", "initData", "initView", "onBindView", "onChanged", "kvData", "onCreate", "onDestroy", "onDestroyView", "onDissmissInteractWindow", "Lcom/ss/android/ugc/aweme/feed/event/DismissInteractWindowEvent;", "onPause", "onResume", "setAweme", "setVideoDataGetter", "setViewTrans", "transX", "transY", "setVoteDetailSaveData", "data", "tryDismissPop", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class InteractStickerWidget extends LifecycleOwnerWidget implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a, g, com.ss.android.ugc.aweme.sticker.a {
    public static ChangeQuickRedirect k;
    public d l;
    public List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> m = new ArrayList();
    public Aweme n;
    private InteractStickerParent o;
    private f p;
    private com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a q;
    private List<? extends InteractStickerStruct> r;
    private List<? extends InteractStickerStruct> s;
    private InteractStickerViewModel t;
    private com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d u;
    private final String v = "InteractStickerWidget";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 15})
    public static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70076a;

        public final int compare(T t, T t2) {
            if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f70076a, false, 79780, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                return ComparisonsKt.compareValues(Integer.valueOf(((InteractStickerStruct) t).getIndex()), Integer.valueOf(((InteractStickerStruct) t2).getIndex()));
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f70076a, false, 79780, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerWidget$handleSingleTap$1$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "onPopShow", "", "show", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b f70078b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f70079c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f70080d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MotionEvent f70081e;

        public final void a(boolean z) {
            float f2;
            float f3;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70077a, false, 79781, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70077a, false, 79781, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            d dVar = this.f70079c.l;
            if (dVar != null) {
                com.ss.android.ugc.aweme.sticker.a.a aVar = dVar.l;
                if (aVar != null) {
                    int c2 = this.f70078b.f69893d.c();
                    View a2 = this.f70078b.f69893d.a(this.f70078b.f69893d.c());
                    MotionEvent motionEvent = this.f70081e;
                    if (motionEvent != null) {
                        f2 = motionEvent.getX();
                    } else {
                        f2 = 0.0f;
                    }
                    MotionEvent motionEvent2 = this.f70081e;
                    if (motionEvent2 != null) {
                        f3 = motionEvent2.getY();
                    } else {
                        f3 = 0.0f;
                    }
                    aVar.a(c2, a2, f2, f3, this.f70078b.f69893d.d(), z);
                }
            }
            d dVar2 = this.f70079c.l;
            if (dVar2 != null) {
                com.ss.android.ugc.aweme.sticker.a.a aVar2 = dVar2.l;
                if (aVar2 != null) {
                    aVar2.a(this.f70078b.f69893d.c(), true);
                }
            }
        }

        b(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar, InteractStickerWidget interactStickerWidget, long j, MotionEvent motionEvent) {
            this.f70078b = bVar;
            this.f70079c = interactStickerWidget;
            this.f70080d = j;
            this.f70081e = motionEvent;
        }
    }

    public final int b() {
        return C0906R.layout.asu;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d ag_() {
        return this.u;
    }

    public final void a(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 79759, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 79759, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        c.a().a((Object) this);
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 79762, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 79762, new Class[]{View.class}, Void.TYPE);
        } else {
            this.o = view != null ? (InteractStickerParent) view.findViewById(C0906R.id.chu) : null;
            if (Build.VERSION.SDK_INT >= 17) {
                InteractStickerParent interactStickerParent = this.o;
                if (interactStickerParent != null) {
                    interactStickerParent.setLayoutDirection(0);
                }
            }
            Activity c2 = c();
            Intrinsics.checkExpressionValueIsNotNull(c2, PushConstants.INTENT_ACTIVITY_NAME);
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a aVar = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(c2, this.m, this.l, this.p, this);
            this.q = aVar;
            InteractStickerParent interactStickerParent2 = this.o;
            if (interactStickerParent2 != null) {
                interactStickerParent2.setOnTouchListener(this.q);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 79763, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.l = (d) this.g.a("interact_sticker_data");
            this.r = (List) this.g.a("interact_sticker_aweme_data");
            this.s = (List) this.g.a("interact_sticker_video_data");
        } else {
            this.l = (d) e().a("interact_sticker_data");
            this.r = (List) e().a("interact_sticker_aweme_data");
            this.s = (List) e().a("interact_sticker_video_data");
        }
        a(this.l);
        a(this.r, this.s);
    }

    public final void a(long j, @Nullable MotionEvent motionEvent) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), motionEvent}, this, k, false, 79770, new Class[]{Long.TYPE, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), motionEvent}, this, k, false, 79770, new Class[]{Long.TYPE, MotionEvent.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar : this.m) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d dVar = bVar.f69893d;
            int c2 = bVar.f69893d.c();
            float x = motionEvent != null ? motionEvent.getX() : 0.0f;
            float y = motionEvent != null ? motionEvent.getY() : 0.0f;
            b bVar2 = new b(bVar, this, j, motionEvent);
            if (dVar.a(j, c2, x, y, bVar2)) {
                return;
            }
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d dVar) {
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, k, false, 79778, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, k, false, 79778, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "data");
        this.u = dVar2;
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 79772, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        c.a().c(this);
    }

    @NotNull
    public final InteractStickerViewModel e() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79760, new Class[0], InteractStickerViewModel.class)) {
            return (InteractStickerViewModel) PatchProxy.accessDispatch(new Object[0], this, k, false, 79760, new Class[0], InteractStickerViewModel.class);
        }
        if (this.t == null) {
            this.t = new InteractStickerViewModel();
            InteractStickerViewModel interactStickerViewModel = this.t;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.f70067b = this;
            }
        }
        InteractStickerViewModel interactStickerViewModel2 = this.t;
        if (interactStickerViewModel2 == null) {
            Intrinsics.throwNpe();
        }
        return interactStickerViewModel2;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 79767, new Class[0], Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar : this.m) {
            bVar.f69893d.c(bVar.f69893d.c());
        }
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 79758, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (this.g != null) {
            Observer observer = this;
            this.g.a("interact_sticker_data", observer);
            this.g.a("interact_sticker_video_data", observer);
            this.g.a("interact_sticker_aweme_data", observer);
            this.g.a("interact_sticker_clear_data", observer);
            return;
        }
        Observer observer2 = this;
        e().a("interact_sticker_data", observer2);
        e().a("interact_sticker_video_data", observer2);
        e().a("interact_sticker_aweme_data", observer2);
        e().a("interact_sticker_clear_data", observer2);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 79775, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar : this.m) {
            bVar.f69893d.b();
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 79774, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar : this.m) {
            bVar.f69893d.a();
        }
    }

    public final void a(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, k, false, 79761, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, k, false, 79761, new Class[]{f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "videoDataGetter");
        this.p = fVar2;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, k, false, 79764, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, k, false, 79764, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            str = aVar.f34376a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1213045287) {
                if (hashCode != -949174003) {
                    if (hashCode != -328001721) {
                        if (hashCode == -153749291 && str.equals("interact_sticker_data")) {
                            this.l = (d) aVar.a();
                            a(this.l);
                        }
                    } else if (str.equals("interact_sticker_clear_data")) {
                        InteractStickerParent interactStickerParent = this.o;
                        if (interactStickerParent != null) {
                            interactStickerParent.removeAllViews();
                        }
                        this.r = null;
                        this.s = null;
                        this.m = new ArrayList();
                    }
                } else if (str.equals("interact_sticker_aweme_data")) {
                    this.r = (List) aVar.a();
                    a(this.r, (List<? extends InteractStickerStruct>) null);
                }
            } else if (str.equals("interact_sticker_video_data")) {
                this.s = (List) aVar.a();
                a((List<? extends InteractStickerStruct>) null, this.s);
            }
        }
    }

    @Subscribe
    public final void onDissmissInteractWindow(@NotNull k kVar) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, k, false, 79773, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, this, k, false, 79773, new Class[]{k.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(kVar2, "event");
        int i = kVar2.f45312a;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, k, false, 79768, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, k, false, 79768, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar : this.m) {
            if (bVar.f69893d.c() != i) {
                bVar.f69893d.c(bVar.f69893d.c());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.sticker.d r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = k
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.d> r1 = com.ss.android.ugc.aweme.sticker.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79765(0x13795, float:1.11775E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = k
            r3 = 0
            r4 = 79765(0x13795, float:1.11775E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.d> r1 = com.ss.android.ugc.aweme.sticker.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            if (r10 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.sticker.a.b r0 = r10.k
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.sticker.a.b$a r0 = r0.a()
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r1 = 0
            if (r10 == 0) goto L_0x004b
            if (r0 == 0) goto L_0x0047
            int r2 = r0.f71621a
            float r2 = (float) r2
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            r10.a((float) r2)
        L_0x004b:
            if (r10 == 0) goto L_0x0055
            if (r0 == 0) goto L_0x0052
            int r1 = r0.f71622b
            float r1 = (float) r1
        L_0x0052:
            r10.b((float) r1)
        L_0x0055:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r1 = r9.o
            if (r1 == 0) goto L_0x0060
            if (r10 == 0) goto L_0x005d
            boolean r7 = r10.j
        L_0x005d:
            r1.setNeedConsumeEvent(r7)
        L_0x0060:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a r1 = r9.q
            if (r1 == 0) goto L_0x0066
            r1.r = r10
        L_0x0066:
            if (r10 == 0) goto L_0x0091
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> r1 = r9.m
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b) r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r3 = r2.f69893d
            r3.a(r10)
            android.view.View r2 = r2.f69891b
            if (r0 == 0) goto L_0x0086
            int r3 = r0.f71623c
            goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            int r4 = r0.f71624d
            goto L_0x008d
        L_0x008c:
            r4 = 0
        L_0x008d:
            r9.a((android.view.View) r2, (int) r3, (int) r4)
            goto L_0x006e
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a(com.ss.android.ugc.aweme.sticker.d):void");
    }

    private final void a(InteractStickerStruct interactStickerStruct, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d dVar) {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct, dVar}, this, k, false, 79776, new Class[]{InteractStickerStruct.class, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactStickerStruct, dVar}, this, k, false, 79776, new Class[]{InteractStickerStruct.class, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d.class}, Void.TYPE);
            return;
        }
        View a2 = dVar.a(dVar.c());
        if (CollectionUtils.isEmpty(this.m)) {
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            a(0, a2, interactStickerStruct, dVar);
            return;
        }
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar : this.m) {
            if (Intrinsics.areEqual((Object) bVar.f69892c, (Object) interactStickerStruct)) {
                bVar.f69893d.a(interactStickerStruct);
                return;
            } else if (bVar.f69892c.getType() == interactStickerStruct.getType()) {
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                a(i2, a2, interactStickerStruct, dVar);
                return;
            } else {
                if (i2 == this.m.size() - 1) {
                    i = i2 + 1;
                } else {
                    i = i2;
                }
                if (i2 == this.m.size() - 1 || interactStickerStruct.getIndex() <= bVar.f69892c.getIndex()) {
                    if (a2 == null) {
                        Intrinsics.throwNpe();
                    }
                    a(i, a2, interactStickerStruct, dVar);
                    return;
                }
                i2++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.List<? extends com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r18, java.util.List<? extends com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r19) {
        /*
            r17 = this;
            r7 = r17
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            r10 = 1
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = k
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r9] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79766(0x13796, float:1.11776E-40)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0043
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = k
            r3 = 0
            r4 = 79766(0x13796, float:1.11776E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r9] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0043:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r18 == 0) goto L_0x004f
            r1 = r18
            java.util.Collection r1 = (java.util.Collection) r1
            goto L_0x0055
        L_0x004f:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x0055:
            r0.addAll(r1)
            if (r19 == 0) goto L_0x005f
            r1 = r19
            java.util.Collection r1 = (java.util.Collection) r1
            goto L_0x0065
        L_0x005f:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x0065:
            r0.addAll(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$a r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$a
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x007b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0103
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r1 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1
            int r2 = r1.getType()
            switch(r2) {
                case 1: goto L_0x00dd;
                case 2: goto L_0x00b4;
                case 3: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x007b
        L_0x008f:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b$a r10 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.f69863a
            android.content.Context r11 = r7.f2709d
            java.lang.String r2 = "mContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            com.ss.android.ugc.aweme.sticker.d r12 = r7.l
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r2 = r7.o
            if (r2 != 0) goto L_0x00a1
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a1:
            r14 = r2
            android.view.View r14 = (android.view.View) r14
            r15 = r7
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r15 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g) r15
            r13 = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g r2 = r10.a((android.content.Context) r11, (com.ss.android.ugc.aweme.sticker.d) r12, (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r13, (android.view.View) r14, (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g) r15)
            if (r2 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d) r2
            r7.a((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1, (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d) r2)
            goto L_0x007b
        L_0x00b4:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b$a r10 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.f69863a
            android.content.Context r11 = r7.f2709d
            java.lang.String r2 = "mContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            com.ss.android.ugc.aweme.sticker.d r12 = r7.l
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r2 = r7.o
            if (r2 != 0) goto L_0x00c6
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00c6:
            r14 = r2
            android.view.View r14 = (android.view.View) r14
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f r2 = r7.p
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.n
            r13 = r1
            r15 = r2
            r16 = r3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b r2 = r10.a(r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d) r2
            r7.a((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1, (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d) r2)
            goto L_0x007b
        L_0x00dd:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b$a r10 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.f69863a
            android.content.Context r11 = r7.f2709d
            java.lang.String r2 = "mContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            com.ss.android.ugc.aweme.sticker.d r12 = r7.l
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r2 = r7.o
            if (r2 != 0) goto L_0x00ef
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ef:
            r14 = r2
            android.view.View r14 = (android.view.View) r14
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f r2 = r7.p
            r13 = r1
            r15 = r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e r2 = r10.a((android.content.Context) r11, (com.ss.android.ugc.aweme.sticker.d) r12, (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r13, (android.view.View) r14, (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f) r15)
            if (r2 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d) r2
            r7.a((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1, (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d) r2)
            goto L_0x007b
        L_0x0103:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a r0 = r7.q
            if (r0 == 0) goto L_0x010c
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> r1 = r7.m
            r0.a(r1)
        L_0x010c:
            com.ss.android.ugc.aweme.sticker.d r0 = r7.l
            if (r0 == 0) goto L_0x0119
            com.ss.android.ugc.aweme.sticker.a.b r0 = r0.k
            if (r0 == 0) goto L_0x0119
            com.ss.android.ugc.aweme.sticker.a.b$a r0 = r0.a()
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> r1 = r7.m
            java.util.Iterator r1 = r1.iterator()
        L_0x0120:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013e
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b) r2
            android.view.View r2 = r2.f69891b
            if (r0 == 0) goto L_0x0133
            int r3 = r0.f71623c
            goto L_0x0134
        L_0x0133:
            r3 = 0
        L_0x0134:
            if (r0 == 0) goto L_0x0139
            int r4 = r0.f71624d
            goto L_0x013a
        L_0x0139:
            r4 = 0
        L_0x013a:
            r7.a((android.view.View) r2, (int) r3, (int) r4)
            goto L_0x0120
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a(java.util.List, java.util.List):void");
    }

    public final void a(long j, int i, @Nullable MotionEvent motionEvent) {
        long j2 = j;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), motionEvent2}, this, k, false, 79771, new Class[]{Long.TYPE, Integer.TYPE, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), motionEvent2}, this, k, false, 79771, new Class[]{Long.TYPE, Integer.TYPE, MotionEvent.class}, Void.TYPE);
            return;
        }
        a(j2, motionEvent2);
    }

    private final void a(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, k, false, 79779, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, k, false, 79779, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = i;
                layoutParams2.topMargin = i2;
                view2.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    private final void a(int i, View view, InteractStickerStruct interactStickerStruct, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d dVar) {
        int i2 = i;
        View view2 = view;
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view2, interactStickerStruct2, dVar2}, this, k, false, 79777, new Class[]{Integer.TYPE, View.class, InteractStickerStruct.class, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view2, interactStickerStruct2, dVar2}, this, k, false, 79777, new Class[]{Integer.TYPE, View.class, InteractStickerStruct.class, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d.class}, Void.TYPE);
            return;
        }
        if (i2 >= 0 && i2 < this.m.size()) {
            try {
                this.m.remove(i2);
                InteractStickerParent interactStickerParent = this.o;
                if (interactStickerParent != null) {
                    interactStickerParent.removeViewAt(i2);
                }
            } catch (Exception unused) {
                return;
            }
        }
        this.m.add(i2, new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b(i2, view2, interactStickerStruct2, dVar2));
        InteractStickerParent interactStickerParent2 = this.o;
        if (interactStickerParent2 != null) {
            interactStickerParent2.addView(view2, i2);
        }
    }
}
