package com.ss.android.ugc.aweme.shortvideo.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.b.a;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.themechange.base.AVDmtAutoRTLImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtView;
import com.ss.android.vesdk.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0015J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u0016\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0018H\u0003J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u0012\u0010&\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0017J\b\u0010(\u001a\u00020\u0018H\u0016J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\nH\u0002J\u001a\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u0018H\u0003J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0003J\u0016\u00104\u001a\u00020\u00182\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0003J\u0016\u00106\u001a\u00020\u00182\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0003J\b\u00108\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\nH\u0002J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002J\b\u0010A\u001a\u00020\u0018H\u0002J\b\u0010B\u001a\u00020CH\u0016J\u0018\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u0016H\u0016J\b\u0010G\u001a\u00020HH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\nX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment;", "()V", "curItemView", "Landroid/view/View;", "dotAnimator", "Landroid/animation/ValueAnimator;", "editStateChangeAnimatorSet", "Landroid/animation/AnimatorSet;", "isMultiBtnSpeedCheck", "", "isSingleBtnSpeedCheck", "isSwitching2MultiEdit", "isSwitching2MultiEdit$annotations", "scale", "", "transX", "transY", "videoSegAdapter", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoSegmentAdapter;", "visibleRage", "Landroid/support/v4/util/Pair;", "", "addClickListener", "", "addObservers", "doChangeVideoSegAnim", "fromIndex", "toIndex", "doRealQuit", "quitInvoker", "Lkotlin/Function0;", "focusOnSwapMode", "isSwapMode", "getLayoutRes", "initVideoSegmentRecyclerView", "ivNext", "ivPlay", "onClick", "v", "onDestroy", "onSwapItemFinish", "targetIndex", "isSelectedChanged", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "refreshViewWhenSwitchToMultiEdit", "refreshViewWhenSwitchToSingleEdit", "video", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "showDeleteConfirmDialog", "confirm2Delete", "showGiveUpDialog", "confirm2Quit", "singleEditorAnimIn", "singleEditorAnimOut", "isDelete", "speedBarStub", "Landroid/view/ViewStub;", "surfaceView", "Landroid/view/SurfaceView;", "switch2MultiEditMode", "applyChange", "switch2SingleEditMode", "tvTimeSelected", "Landroid/widget/TextView;", "updateNextBtnStyle", "backgroundDrawable", "textColor", "videoEditView", "Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VEVideoEditView;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VEMultiCutVideoFragment extends VECutVideoFragment {
    public static ChangeQuickRedirect r;
    ValueAnimator A;
    public AnimatorSet B;
    private boolean C;
    private HashMap D;
    public VideoSegmentAdapter s;
    public float t = 1.0f;
    public float u;
    public float v;
    public View w;
    public Pair<Integer, Integer> x;
    public boolean y;
    boolean z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "pair", "Landroid/support/v4/util/Pair;", "", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<Pair<Integer, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66289b;

        a(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66289b = vEMultiCutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Pair pair = (Pair) obj;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f66288a, false, 75716, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f66288a, false, 75716, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            if (pair != null) {
                VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f66289b;
                F f2 = pair.first;
                if (f2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(f2, "pair.first!!");
                int intValue = ((Number) f2).intValue();
                S s = pair.second;
                if (s == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(s, "pair.second!!");
                int intValue2 = ((Number) s).intValue();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75711, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    VEMultiCutVideoFragment vEMultiCutVideoFragment2 = vEMultiCutVideoFragment;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, vEMultiCutVideoFragment2, VEMultiCutVideoFragment.r, false, 75711, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (vEMultiCutVideoFragment.g != 2) {
                    VideoSegmentAdapter videoSegmentAdapter = vEMultiCutVideoFragment.s;
                    if (videoSegmentAdapter == null) {
                        Intrinsics.throwNpe();
                    }
                    int a2 = videoSegmentAdapter.a((RecyclerView) (AVDmtPanelRecyleView) vEMultiCutVideoFragment.a((int) C0906R.id.dro), intValue);
                    VideoSegmentAdapter videoSegmentAdapter2 = vEMultiCutVideoFragment.s;
                    if (videoSegmentAdapter2 == null) {
                        Intrinsics.throwNpe();
                    }
                    int a3 = videoSegmentAdapter2.a((RecyclerView) (AVDmtPanelRecyleView) vEMultiCutVideoFragment.a((int) C0906R.id.dro), intValue2);
                    VideoSegmentAdapter videoSegmentAdapter3 = vEMultiCutVideoFragment.s;
                    if (videoSegmentAdapter3 == null) {
                        Intrinsics.throwNpe();
                    }
                    videoSegmentAdapter3.f66328c = intValue2;
                    if (a2 == -1 || a3 == -1) {
                        AVDmtView aVDmtView = (AVDmtView) vEMultiCutVideoFragment.a((int) C0906R.id.f8);
                        Intrinsics.checkExpressionValueIsNotNull(aVDmtView, "animTabDot");
                        aVDmtView.setTranslationX(0.0f);
                        AVDmtView aVDmtView2 = (AVDmtView) vEMultiCutVideoFragment.a((int) C0906R.id.f8);
                        Intrinsics.checkExpressionValueIsNotNull(aVDmtView2, "animTabDot");
                        aVDmtView2.setVisibility(4);
                        return;
                    }
                    AVDmtView aVDmtView3 = (AVDmtView) vEMultiCutVideoFragment.a((int) C0906R.id.f8);
                    Intrinsics.checkExpressionValueIsNotNull(aVDmtView3, "animTabDot");
                    aVDmtView3.setVisibility(0);
                    AVDmtView aVDmtView4 = (AVDmtView) vEMultiCutVideoFragment.a((int) C0906R.id.f8);
                    Intrinsics.checkExpressionValueIsNotNull(aVDmtView4, "animTabDot");
                    float f3 = (float) a2;
                    aVDmtView4.setX(f3);
                    if (a2 != a3) {
                        ValueAnimator valueAnimator = vEMultiCutVideoFragment.A;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f3, (float) a3});
                        ofFloat.setDuration(500);
                        ofFloat.addUpdateListener(new h(vEMultiCutVideoFragment));
                        vEMultiCutVideoFragment.A = ofFloat;
                        ValueAnimator valueAnimator2 = vEMultiCutVideoFragment.A;
                        if (valueAnimator2 != null) {
                            valueAnimator2.start();
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$addObservers$2", "Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel$VideoChangeListener;", "onDeleted", "", "video", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "onUpdate", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements VideoEditViewModel.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66291b;

        b(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66291b = vEMultiCutVideoFragment;
        }

        public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar) {
            com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f66290a, false, 75717, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f66290a, false, 75717, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE);
                return;
            }
            VideoSegmentAdapter videoSegmentAdapter = this.f66291b.s;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.a(hVar2);
            }
        }

        public final void b(@Nullable com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar) {
            com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f66290a, false, 75718, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f66290a, false, 75718, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE);
                return;
            }
            VideoSegmentAdapter videoSegmentAdapter = this.f66291b.s;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.b(hVar2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/support/v4/util/Pair;", "", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Pair<Integer, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66293b;

        c(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66293b = vEMultiCutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            int i;
            int i2;
            Pair pair = (Pair) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f66292a, false, 75719, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f66292a, false, 75719, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f66293b;
            if (PatchProxy.isSupport(new Object[0], vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75704, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75704, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar = vEMultiCutVideoFragment.h().c().get(vEMultiCutVideoFragment.f66196d);
            Intrinsics.checkExpressionValueIsNotNull(hVar, "curEditVideo");
            if (PatchProxy.isSupport(new Object[]{hVar}, vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75707, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE)) {
                VEMultiCutVideoFragment vEMultiCutVideoFragment2 = vEMultiCutVideoFragment;
                PatchProxy.accessDispatch(new Object[]{hVar}, vEMultiCutVideoFragment2, VEMultiCutVideoFragment.r, false, 75707, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE);
            } else {
                AVDmtAutoRTLImageView aVDmtAutoRTLImageView = (AVDmtAutoRTLImageView) vEMultiCutVideoFragment.a((int) C0906R.id.ay9);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtAutoRTLImageView, "ivBack");
                aVDmtAutoRTLImageView.setVisibility(4);
                TextView textView = (TextView) vEMultiCutVideoFragment.a((int) C0906R.id.d8h);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvNext");
                textView.setVisibility(4);
                AVDmtView aVDmtView = (AVDmtView) vEMultiCutVideoFragment.a((int) C0906R.id.f8);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtView, "animTabDot");
                aVDmtView.setVisibility(4);
                AVDmtImageView aVDmtImageView = (AVDmtImageView) vEMultiCutVideoFragment.a((int) C0906R.id.ayd);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView, "ivRotate");
                aVDmtImageView.setVisibility(0);
                AVDmtImageView aVDmtImageView2 = (AVDmtImageView) vEMultiCutVideoFragment.a((int) C0906R.id.aya);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView2, "ivDelete");
                aVDmtImageView2.setVisibility(0);
                AVDmtTextView aVDmtTextView = (AVDmtTextView) vEMultiCutVideoFragment.a((int) C0906R.id.d8q);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvVideoSegmentDes");
                aVDmtTextView.setVisibility(4);
                AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) vEMultiCutVideoFragment.a((int) C0906R.id.ayf);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton, "ivSpeed");
                if (!vEMultiCutVideoFragment.f66197e || !vEMultiCutVideoFragment.j().a(hVar)) {
                    i = 8;
                } else {
                    i = 0;
                }
                aVDmtCheckableImageButton.setVisibility(i);
                AVDmtCheckableImageButton aVDmtCheckableImageButton2 = (AVDmtCheckableImageButton) vEMultiCutVideoFragment.a((int) C0906R.id.ayf);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton2, "ivSpeed");
                aVDmtCheckableImageButton2.setChecked(vEMultiCutVideoFragment.z);
                vEMultiCutVideoFragment.k().f69120b = false;
                com.ss.android.ugc.aweme.shortvideo.record.n k = vEMultiCutVideoFragment.k();
                if (vEMultiCutVideoFragment.z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                k.a(i2);
                if (vEMultiCutVideoFragment.z) {
                    vEMultiCutVideoFragment.k().a(ak.a(hVar.f66499f));
                }
                ImageRequest build = ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + hVar.f66495b)).setResizeOptions(new ResizeOptions(u.a(50.0d), u.a(50.0d))).build();
                PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
                RemoteImageView remoteImageView = (RemoteImageView) vEMultiCutVideoFragment.a((int) C0906R.id.ayb);
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "ivEditVideo");
                AbstractDraweeController build2 = ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) newDraweeControllerBuilder.setOldController(remoteImageView.getController())).setImageRequest(build)).build();
                RemoteImageView remoteImageView2 = (RemoteImageView) vEMultiCutVideoFragment.a((int) C0906R.id.ayb);
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView2, "ivEditVideo");
                remoteImageView2.setController(build2);
            }
            VECutVideoPresenter j = vEMultiCutVideoFragment.j();
            int i3 = vEMultiCutVideoFragment.f66196d;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, j, VECutVideoPresenter.f3915a, false, 75633, new Class[]{Integer.TYPE}, Void.TYPE)) {
                VECutVideoPresenter vECutVideoPresenter = j;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, vECutVideoPresenter, VECutVideoPresenter.f3915a, false, 75633, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                VideoEditViewModel videoEditViewModel = j.l;
                if (videoEditViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                }
                com.ss.android.ugc.aweme.shortvideo.cut.model.h c2 = videoEditViewModel.c(i3);
                if (c2 != null) {
                    ah ahVar = j.g;
                    if (ahVar != null) {
                        ahVar.a(i3, c2);
                    }
                }
            }
            if (hVar.f66499f == 0.0f) {
                f2 = 1.0f;
            } else {
                f2 = hVar.f66499f;
            }
            vEMultiCutVideoFragment.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, (long) (((float) hVar.f66497d) / f2), p.d.EDITOR_SEEK_FLAG_LastSeek));
            if (PatchProxy.isSupport(new Object[0], vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75708, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75708, new Class[0], Void.TYPE);
                return;
            }
            vEMultiCutVideoFragment.t = 1.0f;
            vEMultiCutVideoFragment.u = 0.0f;
            vEMultiCutVideoFragment.v = 0.0f;
            VideoSegmentAdapter videoSegmentAdapter = vEMultiCutVideoFragment.s;
            if (videoSegmentAdapter == null) {
                Intrinsics.throwNpe();
            }
            Rect b2 = videoSegmentAdapter.b((AVDmtPanelRecyleView) vEMultiCutVideoFragment.a((int) C0906R.id.dro), vEMultiCutVideoFragment.f66195c);
            if (ViewCompat.getLayoutDirection((AVDmtPanelRecyleView) vEMultiCutVideoFragment.a((int) C0906R.id.dro)) != 1) {
                z = false;
            }
            FrameLayout frameLayout = (FrameLayout) vEMultiCutVideoFragment.a((int) C0906R.id.crn);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "singleEditLayout");
            frameLayout.setVisibility(0);
            AVDmtImageView aVDmtImageView3 = (AVDmtImageView) vEMultiCutVideoFragment.a((int) C0906R.id.aye);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView3, "ivSave");
            aVDmtImageView3.setVisibility(8);
            AVDmtImageView aVDmtImageView4 = (AVDmtImageView) vEMultiCutVideoFragment.a((int) C0906R.id.ay_);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView4, "ivCancel");
            aVDmtImageView4.setVisibility(8);
            FrameLayout frameLayout2 = (FrameLayout) vEMultiCutVideoFragment.a((int) C0906R.id.af0);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "flEditVideo");
            frameLayout2.setVisibility(4);
            FrameLayout frameLayout3 = (FrameLayout) vEMultiCutVideoFragment.a((int) C0906R.id.af0);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "flEditVideo");
            View rootView = frameLayout3.getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView, "flEditVideo.rootView");
            rootView.getViewTreeObserver().addOnPreDrawListener(new m(vEMultiCutVideoFragment, b2, z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66295b;

        d(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66295b = vEMultiCutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66294a, false, 75720, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66294a, false, 75720, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            this.f66295b.a(false, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66296a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66297b;

        e(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66297b = vEMultiCutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66296a, false, 75721, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66296a, false, 75721, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            this.f66297b.a(true, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<com.ss.android.ugc.aweme.shortvideo.cut.model.h> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66298a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66299b;

        f(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66299b = vEMultiCutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar = (com.ss.android.ugc.aweme.shortvideo.cut.model.h) obj;
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f66298a, false, 75722, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f66298a, false, 75722, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.h.class}, Void.TYPE);
                return;
            }
            this.f66299b.a(false, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "swapState", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/SwapStateWrapper;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<com.ss.android.ugc.aweme.shortvideo.cut.model.f> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66301b;

        g(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66301b = vEMultiCutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            Iterator it2;
            com.ss.android.ugc.aweme.shortvideo.cut.model.f fVar = (com.ss.android.ugc.aweme.shortvideo.cut.model.f) obj;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, f66300a, false, 75723, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, f66300a, false, 75723, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.f.class}, Void.TYPE);
                return;
            }
            if (fVar != null) {
                num = Integer.valueOf(fVar.f66491c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                this.f66301b.d(true);
                this.f66301b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false));
                return;
            }
            if ((num == null || num.intValue() != 1) && num != null && num.intValue() == 2) {
                this.f66301b.d(false);
                VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f66301b;
                int i = fVar.f66493e;
                boolean z = fVar.f66490b;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75703, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, vEMultiCutVideoFragment, VEMultiCutVideoFragment.r, false, 75703, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                } else if (z) {
                    vEMultiCutVideoFragment.a().b();
                    VECutVideoPresenter j = vEMultiCutVideoFragment.j();
                    if (PatchProxy.isSupport(new Object[0], j, VECutVideoPresenter.f3915a, false, 75632, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], j, VECutVideoPresenter.f3915a, false, 75632, new Class[0], Void.TYPE);
                    } else {
                        ah ahVar = j.g;
                        if (ahVar != null) {
                            VideoEditViewModel videoEditViewModel = j.l;
                            if (videoEditViewModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                            }
                            List<com.ss.android.ugc.aweme.shortvideo.cut.model.h> c2 = videoEditViewModel.c();
                            Intrinsics.checkExpressionValueIsNotNull(c2, "videoEditViewModel.originVideoList");
                            ahVar.a(c2);
                        }
                    }
                    List<com.ss.android.ugc.aweme.shortvideo.cut.model.h> c3 = vEMultiCutVideoFragment.h().c();
                    Intrinsics.checkExpressionValueIsNotNull(c3, "videoEditViewModel.originVideoList");
                    Collection arrayList = new ArrayList();
                    for (com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar : c3) {
                        if (!hVar.j) {
                            arrayList.add(it2.next());
                        }
                    }
                    List list = (List) arrayList;
                    long j2 = 0;
                    for (int i2 = 0; i2 < i; i2++) {
                        com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar2 = (com.ss.android.ugc.aweme.shortvideo.cut.model.h) list.get(i2);
                        j2 += (long) (((float) (hVar2.f66498e - hVar2.f66497d)) / (vEMultiCutVideoFragment.h().d() * hVar2.f66499f));
                    }
                    if (j2 >= vEMultiCutVideoFragment.a().getMaxCutDuration()) {
                        j2 = 0;
                    }
                    if (j2 != 0) {
                        j2 += 30;
                    }
                    VECutVideoPresenter j3 = vEMultiCutVideoFragment.j();
                    Pair<Long, Long> playBoundary = vEMultiCutVideoFragment.a().getPlayBoundary();
                    Intrinsics.checkExpressionValueIsNotNull(playBoundary, "videoEditView().playBoundary");
                    j3.a(playBoundary);
                    vEMultiCutVideoFragment.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, j2, p.d.EDITOR_SEEK_FLAG_LastSeek));
                    if (!vEMultiCutVideoFragment.j().b()) {
                        vEMultiCutVideoFragment.g().a(j2, vEMultiCutVideoFragment.h().b(), vEMultiCutVideoFragment.h().d());
                    }
                } else {
                    vEMultiCutVideoFragment.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$doChangeVideoSegAnim$1$1"}, k = 3, mv = {1, 1, 15})
    static final class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66303b;

        h(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66303b = vEMultiCutVideoFragment;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f66302a, false, 75724, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f66302a, false, 75724, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                AVDmtView aVDmtView = (AVDmtView) this.f66303b.a((int) C0906R.id.f8);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtView, "animTabDot");
                aVDmtView.setX(floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "pos", "", "path", "", "click", "com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$initVideoSegmentRecyclerView$1$1"}, k = 3, mv = {1, 1, 15})
    static final class i implements VideoSegmentAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66305b;

        i(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f66305b = vEMultiCutVideoFragment;
        }

        public final void a(View view, int i, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), str2}, this, f66304a, false, 75725, new Class[]{View.class, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), str2}, this, f66304a, false, 75725, new Class[]{View.class, Integer.TYPE, String.class}, Void.TYPE);
            } else if (this.f66305b.g != 2) {
                this.f66305b.f66195c = i;
                this.f66305b.f66196d = this.f66305b.h().a(str2);
                this.f66305b.g().a(this.f66305b.f66195c, this.f66305b.f66196d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VEMultiCutVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            super(0);
            this.this$0 = vEMultiCutVideoFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75727, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75727, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.g().a(this.this$0.h().c().get(this.this$0.f66196d));
            ak.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$showDeleteConfirmDialog$1$dialog$1"}, k = 3, mv = {1, 1, 15})
    static final class k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f66309b;

        k(Function0 function0) {
            this.f66309b = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f66308a, false, 75728, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f66308a, false, 75728, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f66309b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$showGiveUpDialog$1$dialog$1"}, k = 3, mv = {1, 1, 15})
    static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f66311b;

        l(Function0 function0) {
            this.f66311b = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f66310a, false, 75729, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f66310a, false, 75729, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f66311b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$singleEditorAnimIn$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "screenWidth", "", "getScreenWidth", "()I", "onPreDraw", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class m implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66312a;

        /* renamed from: b  reason: collision with root package name */
        public final int f66313b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66314c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Rect f66315d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f66316e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$singleEditorAnimIn$1$onPreDraw$2$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66317a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m f66318b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ArrayList f66319c;

            public final void onAnimationEnd(@NotNull Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f66317a, false, 75731, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f66317a, false, 75731, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(animator, "animation");
                super.onAnimationEnd(animator);
                this.f66318b.f66314c.k().f69120b = true;
                AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) this.f66318b.f66314c.a((int) C0906R.id.dro);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "videoRecyclerView");
                aVDmtPanelRecyleView.setVisibility(8);
                AVDmtImageView aVDmtImageView = (AVDmtImageView) this.f66318b.f66314c.a((int) C0906R.id.aye);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView, "ivSave");
                aVDmtImageView.setVisibility(0);
                AVDmtImageView aVDmtImageView2 = (AVDmtImageView) this.f66318b.f66314c.a((int) C0906R.id.ay_);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView2, "ivCancel");
                aVDmtImageView2.setVisibility(0);
                FrameLayout frameLayout = (FrameLayout) this.f66318b.f66314c.a((int) C0906R.id.af0);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "flEditVideo");
                frameLayout.setVisibility(0);
                VideoSegmentAdapter videoSegmentAdapter = this.f66318b.f66314c.s;
                if (videoSegmentAdapter == null) {
                    Intrinsics.throwNpe();
                }
                videoSegmentAdapter.f66330e = false;
                this.f66318b.f66314c.A();
            }

            a(m mVar, ArrayList arrayList) {
                this.f66318b = mVar;
                this.f66319c = arrayList;
            }
        }

        public final boolean onPreDraw() {
            View view;
            float f2;
            float f3;
            if (PatchProxy.isSupport(new Object[0], this, f66312a, false, 75730, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66312a, false, 75730, new Class[0], Boolean.TYPE)).booleanValue();
            }
            FrameLayout frameLayout = (FrameLayout) this.f66314c.a((int) C0906R.id.af0);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "flEditVideo");
            View rootView = frameLayout.getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView, "flEditVideo.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f66314c;
            VEMultiCutVideoFragment vEMultiCutVideoFragment2 = this.f66314c;
            int i = C0906R.id.dro;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ((AVDmtPanelRecyleView) vEMultiCutVideoFragment2.a((int) C0906R.id.dro)).findViewHolderForAdapterPosition(this.f66314c.f66195c);
            if (findViewHolderForAdapterPosition != null) {
                view = findViewHolderForAdapterPosition.itemView;
            } else {
                view = null;
            }
            vEMultiCutVideoFragment.w = view;
            this.f66314c.x = com.ss.android.ugc.aweme.imported.f.a((AVDmtPanelRecyleView) this.f66314c.a((int) C0906R.id.dro));
            if (this.f66315d == null || this.f66314c.w == null) {
                return false;
            }
            View view2 = this.f66314c.w;
            if (view2 != null) {
                ArrayList arrayList = new ArrayList();
                Pair<Integer, Integer> pair = this.f66314c.x;
                if (pair != null) {
                    F f4 = pair.first;
                    if (f4 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(f4, "range.first!!");
                    int intValue = ((Number) f4).intValue();
                    int i2 = this.f66314c.f66195c;
                    while (intValue < i2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) this.f66314c.a(i);
                        if (aVDmtPanelRecyleView == null) {
                            Intrinsics.throwNpe();
                        }
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = aVDmtPanelRecyleView.findViewHolderForAdapterPosition(intValue);
                        if (findViewHolderForAdapterPosition2 != null) {
                            Intrinsics.checkExpressionValueIsNotNull(findViewHolderForAdapterPosition2, "videoRecyclerView!!.find…              ?: continue");
                            if (this.f66316e) {
                                View view3 = findViewHolderForAdapterPosition2.itemView;
                                Intrinsics.checkExpressionValueIsNotNull(view3, "viewHolder.itemView");
                                f3 = view3.getTranslationX() + ((float) (this.f66313b - this.f66315d.right));
                            } else {
                                View view4 = findViewHolderForAdapterPosition2.itemView;
                                Intrinsics.checkExpressionValueIsNotNull(view4, "viewHolder.itemView");
                                f3 = view4.getTranslationX() - ((float) this.f66315d.left);
                            }
                            View view5 = findViewHolderForAdapterPosition2.itemView;
                            View view6 = findViewHolderForAdapterPosition2.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view6, "viewHolder.itemView");
                            animatorSet.play(ObjectAnimator.ofFloat(view5, "translationX", new float[]{view6.getTranslationX(), f3}));
                            animatorSet.setDuration(300);
                            arrayList.add(animatorSet);
                        }
                        intValue++;
                        i = C0906R.id.dro;
                    }
                    int i3 = this.f66314c.f66195c + 1;
                    S s = pair.second;
                    if (s == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(s, "range.second!!");
                    int intValue2 = ((Number) s).intValue();
                    if (i3 <= intValue2) {
                        while (true) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition3 = ((AVDmtPanelRecyleView) this.f66314c.a((int) C0906R.id.dro)).findViewHolderForAdapterPosition(i3);
                            if (findViewHolderForAdapterPosition3 != null) {
                                Intrinsics.checkExpressionValueIsNotNull(findViewHolderForAdapterPosition3, "videoRecyclerView.findVi…              ?: continue");
                                if (this.f66316e) {
                                    View view7 = findViewHolderForAdapterPosition3.itemView;
                                    Intrinsics.checkExpressionValueIsNotNull(view7, "viewHolder.itemView");
                                    f2 = view7.getTranslationX() - ((float) this.f66315d.left);
                                } else {
                                    View view8 = findViewHolderForAdapterPosition3.itemView;
                                    Intrinsics.checkExpressionValueIsNotNull(view8, "viewHolder.itemView");
                                    f2 = view8.getTranslationX() + ((float) (this.f66313b - this.f66315d.right));
                                }
                                View view9 = findViewHolderForAdapterPosition3.itemView;
                                View view10 = findViewHolderForAdapterPosition3.itemView;
                                Intrinsics.checkExpressionValueIsNotNull(view10, "viewHolder.itemView");
                                animatorSet2.play(ObjectAnimator.ofFloat(view9, "translationX", new float[]{view10.getTranslationX(), f2}));
                                animatorSet2.setDuration(300);
                                arrayList.add(animatorSet2);
                            }
                            if (i3 == intValue2) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) this.f66314c.a((int) C0906R.id.af0);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "flEditVideo");
                int width = frameLayout2.getWidth();
                int width2 = this.f66315d.width();
                int[] iArr = new int[2];
                FrameLayout frameLayout3 = (FrameLayout) this.f66314c.a((int) C0906R.id.af0);
                if (frameLayout3 == null) {
                    Intrinsics.throwNpe();
                }
                frameLayout3.getLocationInWindow(iArr);
                this.f66314c.t = (((float) width) * 1.0f) / ((float) width2);
                int i4 = iArr[0];
                FrameLayout frameLayout4 = (FrameLayout) this.f66314c.a((int) C0906R.id.af0);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "flEditVideo");
                int i5 = iArr[1];
                FrameLayout frameLayout5 = (FrameLayout) this.f66314c.a((int) C0906R.id.af0);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout5, "flEditVideo");
                this.f66314c.u = ((float) (i4 + (frameLayout4.getWidth() / 2))) - ((float) this.f66315d.centerX());
                this.f66314c.v = ((float) (i5 + (frameLayout5.getHeight() / 2))) - ((float) this.f66315d.centerY());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view2, "translationX", new float[]{0.0f, this.f66314c.u})).with(ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, this.f66314c.v})).with(ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, this.f66314c.t})).with(ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, this.f66314c.t}));
                arrayList.add(animatorSet3);
                VEMultiCutVideoFragment vEMultiCutVideoFragment3 = this.f66314c;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new a(this, arrayList));
                vEMultiCutVideoFragment3.B = animatorSet4;
                AnimatorSet animatorSet5 = this.f66314c.B;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }

        m(VEMultiCutVideoFragment vEMultiCutVideoFragment, Rect rect, boolean z) {
            this.f66314c = vEMultiCutVideoFragment;
            this.f66315d = rect;
            this.f66316e = z;
            this.f66313b = fc.b(vEMultiCutVideoFragment.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$singleEditorAnimOut$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class n implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMultiCutVideoFragment f66321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f66322c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$singleEditorAnimOut$1$onPreDraw$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66323a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ n f66324b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ArrayList f66325c;

            public final void onAnimationEnd(@NotNull Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f66323a, false, 75733, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f66323a, false, 75733, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(animator, "animation");
                super.onAnimationEnd(animator);
                this.f66324b.f66321b.k().f69120b = true;
                FrameLayout frameLayout = (FrameLayout) this.f66324b.f66321b.a((int) C0906R.id.af0);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "flEditVideo");
                frameLayout.setVisibility(8);
                if (this.f66324b.f66322c) {
                    this.f66324b.f66321b.h().b(this.f66324b.f66321b.h().c().get(this.f66324b.f66321b.f66196d).f66495b);
                }
                VideoSegmentAdapter videoSegmentAdapter = this.f66324b.f66321b.s;
                if (videoSegmentAdapter == null) {
                    Intrinsics.throwNpe();
                }
                videoSegmentAdapter.f66330e = true;
                AVDmtView aVDmtView = (AVDmtView) this.f66324b.f66321b.a((int) C0906R.id.f8);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtView, "animTabDot");
                aVDmtView.setTranslationX(0.0f);
                AVDmtView aVDmtView2 = (AVDmtView) this.f66324b.f66321b.a((int) C0906R.id.f8);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtView2, "animTabDot");
                aVDmtView2.setVisibility(0);
                this.f66324b.f66321b.A();
                this.f66324b.f66321b.y = false;
            }

            a(n nVar, ArrayList arrayList) {
                this.f66324b = nVar;
                this.f66325c = arrayList;
            }
        }

        public final boolean onPreDraw() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f66320a, false, 75732, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66320a, false, 75732, new Class[0], Boolean.TYPE)).booleanValue();
            }
            VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f66321b;
            int i2 = C0906R.id.dro;
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) vEMultiCutVideoFragment.a((int) C0906R.id.dro);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "videoRecyclerView");
            View rootView = aVDmtPanelRecyleView.getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f66321b.w == null || this.f66321b.x == null) {
                return false;
            }
            View view = this.f66321b.w;
            if (view != null) {
                ArrayList arrayList = new ArrayList();
                Pair<Integer, Integer> pair = this.f66321b.x;
                if (pair == null) {
                    Intrinsics.throwNpe();
                }
                F f2 = pair.first;
                if (f2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(f2, "visibleRage!!.first!!");
                int intValue = ((Number) f2).intValue();
                int i3 = this.f66321b.f66195c;
                while (true) {
                    i = 2;
                    if (intValue >= i3) {
                        break;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) this.f66321b.a(i2);
                    if (aVDmtPanelRecyleView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = aVDmtPanelRecyleView2.findViewHolderForAdapterPosition(intValue);
                    if (findViewHolderForAdapterPosition != null) {
                        Intrinsics.checkExpressionValueIsNotNull(findViewHolderForAdapterPosition, "videoRecyclerView!!.find…              ?: continue");
                        View view2 = findViewHolderForAdapterPosition.itemView;
                        View view3 = findViewHolderForAdapterPosition.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view3, "viewHolder.itemView");
                        animatorSet.play(ObjectAnimator.ofFloat(view2, "translationX", new float[]{view3.getTranslationX(), 0.0f}));
                        animatorSet.setDuration(300);
                        arrayList.add(animatorSet);
                    }
                    intValue++;
                    i2 = C0906R.id.dro;
                }
                int i4 = this.f66321b.f66195c + 1;
                Pair<Integer, Integer> pair2 = this.f66321b.x;
                if (pair2 == null) {
                    Intrinsics.throwNpe();
                }
                S s = pair2.second;
                if (s == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(s, "visibleRage!!.second!!");
                int intValue2 = ((Number) s).intValue();
                if (i4 <= intValue2) {
                    while (true) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = (AVDmtPanelRecyleView) this.f66321b.a((int) C0906R.id.dro);
                        if (aVDmtPanelRecyleView3 == null) {
                            Intrinsics.throwNpe();
                        }
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = aVDmtPanelRecyleView3.findViewHolderForAdapterPosition(i4);
                        if (findViewHolderForAdapterPosition2 != null) {
                            Intrinsics.checkExpressionValueIsNotNull(findViewHolderForAdapterPosition2, "videoRecyclerView!!.find…              ?: continue");
                            View view4 = findViewHolderForAdapterPosition2.itemView;
                            float[] fArr = new float[i];
                            View view5 = findViewHolderForAdapterPosition2.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view5, "viewHolder.itemView");
                            fArr[0] = view5.getTranslationX();
                            fArr[1] = 0.0f;
                            animatorSet2.play(ObjectAnimator.ofFloat(view4, "translationX", fArr));
                            animatorSet2.setDuration(300);
                            arrayList.add(animatorSet2);
                        }
                        if (i4 == intValue2) {
                            break;
                        }
                        i4++;
                        i = 2;
                    }
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view, "translationX", new float[]{view.getTranslationX(), 0.0f})).with(ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f})).with(ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), 1.0f})).with(ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), 1.0f}));
                arrayList.add(animatorSet3);
                VEMultiCutVideoFragment vEMultiCutVideoFragment2 = this.f66321b;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new a(this, arrayList));
                vEMultiCutVideoFragment2.B = animatorSet4;
                AnimatorSet animatorSet5 = this.f66321b.B;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }

        n(VEMultiCutVideoFragment vEMultiCutVideoFragment, boolean z) {
            this.f66321b = vEMultiCutVideoFragment;
            this.f66322c = z;
        }
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75715, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null) {
            this.D.clear();
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, r, false, 75714, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, r, false, 75714, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.D == null) {
            this.D = new HashMap();
        }
        View view = (View) this.D.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.D.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final int f() {
        return C0906R.layout.nb;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        B();
    }

    @NotNull
    public final SurfaceView C() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75689, new Class[0], SurfaceView.class)) {
            return (SurfaceView) PatchProxy.accessDispatch(new Object[0], this, r, false, 75689, new Class[0], SurfaceView.class);
        }
        SurfaceView surfaceView = (SurfaceView) a((int) C0906R.id.drp);
        Intrinsics.checkExpressionValueIsNotNull(surfaceView, "videoSurface");
        return surfaceView;
    }

    @NotNull
    public final VEVideoEditView a() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75690, new Class[0], VEVideoEditView.class)) {
            return (VEVideoEditView) PatchProxy.accessDispatch(new Object[0], this, r, false, 75690, new Class[0], VEVideoEditView.class);
        }
        VEVideoEditView vEVideoEditView = (VEVideoEditView) a((int) C0906R.id.drl);
        Intrinsics.checkExpressionValueIsNotNull(vEVideoEditView, "videoEditView");
        return vEVideoEditView;
    }

    @NotNull
    public final View b() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75691, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, r, false, 75691, new Class[0], View.class);
        }
        ImageView imageView = (ImageView) a((int) C0906R.id.ayc);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivPlay");
        return imageView;
    }

    @NotNull
    public final View c() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75692, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, r, false, 75692, new Class[0], View.class);
        }
        TextView textView = (TextView) a((int) C0906R.id.d8h);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvNext");
        return textView;
    }

    @NotNull
    public final TextView d() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75694, new Class[0], TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, r, false, 75694, new Class[0], TextView.class);
        }
        AVDmtTextView aVDmtTextView = (AVDmtTextView) a((int) C0906R.id.d8n);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvTime");
        return aVDmtTextView;
    }

    @NotNull
    public final ViewStub e() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75693, new Class[0], ViewStub.class)) {
            return (ViewStub) PatchProxy.accessDispatch(new Object[0], this, r, false, 75693, new Class[0], ViewStub.class);
        }
        ViewStub viewStub = (ViewStub) getView().findViewById(C0906R.id.cwd);
        Intrinsics.checkExpressionValueIsNotNull(viewStub, "stubSpeedLayout");
        return viewStub;
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75699, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75700, new Class[0], Void.TYPE);
            return;
        }
        super.x();
        View.OnClickListener onClickListener = this;
        ((AVDmtImageView) a((int) C0906R.id.ayd)).setOnClickListener(onClickListener);
        ((AVDmtImageView) a((int) C0906R.id.aya)).setOnClickListener(onClickListener);
        ((AVDmtImageView) a((int) C0906R.id.aye)).setOnClickListener(onClickListener);
        ((AVDmtImageView) a((int) C0906R.id.ay_)).setOnClickListener(onClickListener);
        ((AVDmtCheckableImageButton) a((int) C0906R.id.ayf)).setOnClickListener(onClickListener);
    }

    @SuppressLint({"Fragment_LifecycleOwner"})
    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75697, new Class[0], Void.TYPE);
            return;
        }
        super.w();
        LifecycleOwner lifecycleOwner = this;
        g().f66180b.observe(lifecycleOwner, new a(this));
        h().s = new b(this);
        h().n.observe(lifecycleOwner, new c(this));
        h().o.observe(lifecycleOwner, new d(this));
        h().p.observe(lifecycleOwner, new e(this));
        h().q.observe(lifecycleOwner, new f(this));
        g().l.observe(lifecycleOwner, new g(this));
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, r, false, 75710, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, r, false, 75710, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a().setEnabled(!z2);
        TextView textView = (TextView) a((int) C0906R.id.d8h);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvNext");
        textView.setEnabled(!z2);
        AVDmtAutoRTLImageView aVDmtAutoRTLImageView = (AVDmtAutoRTLImageView) a((int) C0906R.id.ay9);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtAutoRTLImageView, "ivBack");
        aVDmtAutoRTLImageView.setEnabled(!z2);
        C().setEnabled(!z2);
    }

    public final void a(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, r, false, 75696, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, r, false, 75696, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "quitInvoker");
        VideoSegmentAdapter videoSegmentAdapter = this.s;
        if (videoSegmentAdapter == null || videoSegmentAdapter.getItemCount() != 1) {
            if (PatchProxy.isSupport(new Object[]{function02}, this, r, false, 75712, new Class[]{Function0.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{function02}, this, r, false, 75712, new Class[]{Function0.class}, Void.TYPE);
                return;
            }
            Context context = getContext();
            if (context != null) {
                new a.C0185a(context).b((int) C0906R.string.bux).b((int) C0906R.string.bd7, (DialogInterface.OnClickListener) null).a((int) C0906R.string.aja, (DialogInterface.OnClickListener) new l(function02)).a().a().show();
                return;
            }
            return;
        }
        function0.invoke();
    }

    @SuppressLint({"RestrictedApi"})
    public final void onClick(@Nullable View view) {
        Integer num;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, r, false, 75701, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, r, false, 75701, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.aye) {
            if (!this.y) {
                this.y = true;
                ak.d();
                g().d();
            } else {
                return;
            }
        } else if (num != null && num.intValue() == C0906R.id.ay_) {
            if (!this.y) {
                this.y = true;
                ak.c();
                g().c();
            } else {
                return;
            }
        } else if (num != null && num.intValue() == C0906R.id.aya) {
            Function0 jVar = new j(this);
            if (PatchProxy.isSupport(new Object[]{jVar}, this, r, false, 75713, new Class[]{Function0.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, r, false, 75713, new Class[]{Function0.class}, Void.TYPE);
            } else {
                Context context = getContext();
                if (context != null) {
                    new a.C0185a(context).b((int) C0906R.string.a4v).b((int) C0906R.string.bd1, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a4f, (DialogInterface.OnClickListener) new k(jVar)).a().a().show();
                }
            }
        } else if (num != null && num.intValue() == C0906R.id.ayf) {
            ((AVDmtCheckableImageButton) a((int) C0906R.id.ayf)).toggle();
            if (this.g == 2) {
                AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) a((int) C0906R.id.ayf);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton, "ivSpeed");
                this.z = aVDmtCheckableImageButton.isChecked();
            } else {
                AVDmtCheckableImageButton aVDmtCheckableImageButton2 = (AVDmtCheckableImageButton) a((int) C0906R.id.ayf);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton2, "ivSpeed");
                this.C = aVDmtCheckableImageButton2.isChecked();
            }
            AVDmtCheckableImageButton aVDmtCheckableImageButton3 = (AVDmtCheckableImageButton) a((int) C0906R.id.ayf);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton3, "ivSpeed");
            if (aVDmtCheckableImageButton3.isChecked()) {
                com.ss.android.ugc.aweme.shortvideo.record.n k2 = k();
                VEVideoEditView vEVideoEditView = (VEVideoEditView) a((int) C0906R.id.drl);
                Intrinsics.checkExpressionValueIsNotNull(vEVideoEditView, "videoEditView");
                k2.a(ak.a(vEVideoEditView.getCurrentSpeed()));
                k().a(0);
            } else {
                k().a(8);
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            super.onClick(view);
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{2130838236, Integer.valueOf(i3)}, this, r, false, 75695, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{2130838236, Integer.valueOf(i3)}, this, r, false, 75695, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((TextView) a((int) C0906R.id.d8h)).setBackgroundResource(2130838236);
        ((TextView) a((int) C0906R.id.d8h)).setTextColor(i3);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, r, false, 75698, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, r, false, 75698, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        j().f3919e = com.ss.android.ugc.aweme.themechange.base.b.f74589e.a(true, false, false, true, false);
        ((AVDmtTextView) a((int) C0906R.id.d8q)).setShadowLayer(2.0f, 0.0f, 0.0f, getResources().getColor(C0906R.color.a2f));
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75702, new Class[0], Void.TYPE);
        } else {
            VideoSegmentAdapter videoSegmentAdapter = new VideoSegmentAdapter(h(), g(), h().b());
            videoSegmentAdapter.f66329d = new i(this);
            this.s = videoSegmentAdapter;
            VideoSegmentAdapter videoSegmentAdapter2 = this.s;
            if (videoSegmentAdapter2 == null) {
                Intrinsics.throwNpe();
            }
            new ItemTouchHelper(new VECutMultiVideoSegmentTouchCallback(videoSegmentAdapter2)).attachToRecyclerView((AVDmtPanelRecyleView) a((int) C0906R.id.dro));
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.dro);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "videoRecyclerView");
            aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) a((int) C0906R.id.dro);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView2, "videoRecyclerView");
            aVDmtPanelRecyleView2.setAdapter(this.s);
            AVDmtPanelRecyleView aVDmtPanelRecyleView3 = (AVDmtPanelRecyleView) a((int) C0906R.id.dro);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView3, "videoRecyclerView");
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setRemoveDuration(300);
            defaultItemAnimator.setChangeDuration(300);
            defaultItemAnimator.setMoveDuration(300);
            defaultItemAnimator.setAddDuration(300);
            aVDmtPanelRecyleView3.setItemAnimator(defaultItemAnimator);
            ((AVDmtPanelRecyleView) a((int) C0906R.id.dro)).addOnScrollListener(new VEMultiCutVideoFragment$initVideoSegmentRecyclerView$3(this));
            VideoSegmentAdapter videoSegmentAdapter3 = this.s;
            if (videoSegmentAdapter3 != null) {
                videoSegmentAdapter3.notifyDataSetChanged();
            }
        }
        if (fc.a()) {
            View findViewById = view.findViewById(C0906R.id.d3x);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title_menu)");
            a((RelativeLayout) findViewById);
            ViewGroup.LayoutParams layoutParams = l().getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = fc.c(getActivity());
                l().setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
    }

    public final void a(boolean z2, boolean z3) {
        int i2;
        boolean z4 = z3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, r, false, 75705, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, r, false, 75705, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z4) {
            VideoSegmentAdapter videoSegmentAdapter = this.s;
            if (videoSegmentAdapter != null && videoSegmentAdapter.getItemCount() == 1) {
                y();
                return;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75706, new Class[0], Void.TYPE);
        } else {
            AVDmtAutoRTLImageView aVDmtAutoRTLImageView = (AVDmtAutoRTLImageView) a((int) C0906R.id.ay9);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtAutoRTLImageView, "ivBack");
            aVDmtAutoRTLImageView.setVisibility(0);
            TextView textView = (TextView) a((int) C0906R.id.d8h);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvNext");
            textView.setVisibility(0);
            AVDmtImageView aVDmtImageView = (AVDmtImageView) a((int) C0906R.id.ayd);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView, "ivRotate");
            aVDmtImageView.setVisibility(8);
            AVDmtImageView aVDmtImageView2 = (AVDmtImageView) a((int) C0906R.id.aya);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView2, "ivDelete");
            aVDmtImageView2.setVisibility(8);
            AVDmtTextView aVDmtTextView = (AVDmtTextView) a((int) C0906R.id.d8q);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvVideoSegmentDes");
            aVDmtTextView.setVisibility(0);
            AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) a((int) C0906R.id.ayf);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton, "ivSpeed");
            aVDmtCheckableImageButton.setVisibility(4);
            AVDmtCheckableImageButton aVDmtCheckableImageButton2 = (AVDmtCheckableImageButton) a((int) C0906R.id.ayf);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton2, "ivSpeed");
            aVDmtCheckableImageButton2.setChecked(this.C);
            k().f69120b = false;
            com.ss.android.ugc.aweme.shortvideo.record.n k2 = k();
            if (this.C) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            k2.a(i2);
            if (this.C) {
                k().a(ak.a(h().d()));
            }
        }
        VECutVideoPresenter j2 = j();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, j2, VECutVideoPresenter.f3915a, false, 75634, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            VECutVideoPresenter vECutVideoPresenter = j2;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, vECutVideoPresenter, VECutVideoPresenter.f3915a, false, 75634, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            ah ahVar = j2.g;
            if (ahVar != null) {
                VideoEditViewModel videoEditViewModel = j2.l;
                if (videoEditViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                }
                ahVar.a(z2, videoEditViewModel.c());
            }
        }
        Pair<Long, Long> playBoundary = a().getPlayBoundary();
        VECutVideoPresenter j3 = j();
        Intrinsics.checkExpressionValueIsNotNull(playBoundary, "boundary");
        j3.a(playBoundary);
        if (z4) {
            g().a();
        }
        VEVideoCutterViewModel i3 = i();
        Long l2 = (Long) playBoundary.first;
        if (l2 == null) {
            l2 = 0L;
        }
        i3.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, l2.longValue(), p.d.EDITOR_SEEK_FLAG_LastSeek));
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z3)}, this, r, false, 75709, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z3)}, this, r, false, 75709, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            AVDmtImageView aVDmtImageView3 = (AVDmtImageView) a((int) C0906R.id.aye);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView3, "ivSave");
            aVDmtImageView3.setVisibility(8);
            AVDmtImageView aVDmtImageView4 = (AVDmtImageView) a((int) C0906R.id.ay_);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView4, "ivCancel");
            aVDmtImageView4.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) a((int) C0906R.id.crn);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "singleEditLayout");
            frameLayout.setVisibility(8);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.dro);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "videoRecyclerView");
            aVDmtPanelRecyleView.setVisibility(0);
            FrameLayout frameLayout2 = (FrameLayout) a((int) C0906R.id.af0);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "flEditVideo");
            frameLayout2.setVisibility(4);
            if (!(this.w == null || this.x == null)) {
                AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) a((int) C0906R.id.dro);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView2, "videoRecyclerView");
                View rootView = aVDmtPanelRecyleView2.getRootView();
                Intrinsics.checkExpressionValueIsNotNull(rootView, "videoRecyclerView.rootView");
                rootView.getViewTreeObserver().addOnPreDrawListener(new n(this, z4));
            }
        }
        this.l.removeCallbacks(this.m);
        this.l.post(this.m);
    }
}
