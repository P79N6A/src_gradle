package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.VEEffectAdapter;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.bm;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.shortvideo.util.ao;
import com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.f;
import dmt.av.video.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u001c\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u001a\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0016J\u001e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110(H\u0016J\u001a\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020+2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/FilterEffectTabFragment;", "Lcom/ss/android/ugc/aweme/effect/EditEffectTabFragment;", "()V", "enableAnimate", "", "isActivityCreated", "mEffectAdapter", "Lcom/ss/android/ugc/aweme/effect/VEEffectAdapter;", "mTouchStateHolder", "Lcom/ss/android/ugc/aweme/effect/interact/EffectLongTouchStateHolder;", "mViewModel", "Ldmt/av/video/VEVideoPublishEditViewModel;", "applyFilter", "", "action", "", "model", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "(Ljava/lang/Integer;Lcom/ss/android/ugc/aweme/effect/EffectModel;)V", "enableGifAnim", "enable", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onChangeDownloadState", "position", "state", "onDownloadFailed", "failedEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onDownloadStart", "rawEffect", "onDownloadSuccess", "effect", "onEffectDiffResult", "result", "Landroid/support/v7/util/DiffUtil$DiffResult;", "newEffectSource", "", "onViewCreated", "view", "Landroid/view/View;", "setUserVisibleHint", "isVisibleToUser", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FilterEffectTabFragment extends EditEffectTabFragment {
    public static ChangeQuickRedirect j;
    public static final a n = new a((byte) 0);
    public VEVideoPublishEditViewModel k;
    public boolean l;
    public com.ss.android.ugc.aweme.effect.b.a m;
    private VEEffectAdapter o;
    private boolean p;
    private HashMap q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/FilterEffectTabFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/effect/FilterEffectTabFragment;", "effects", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "category", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43530a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Ldmt/av/video/VEFilterEffectOp;", "onChanged", "com/ss/android/ugc/aweme/effect/FilterEffectTabFragment$onViewCreated$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<p> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FilterEffectTabFragment f43532b;

        b(FilterEffectTabFragment filterEffectTabFragment) {
            this.f43532b = filterEffectTabFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            if (PatchProxy.isSupport(new Object[]{pVar}, this, f43531a, false, 38612, new Class[]{p.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pVar}, this, f43531a, false, 38612, new Class[]{p.class}, Void.TYPE);
            } else if (pVar == null || pVar.f83054e != 3) {
                if (pVar != null && pVar.f83054e == 4) {
                    for (int length = pVar.f83051b.length - 1; length >= 0; length--) {
                        if (this.f43532b.g.isEmpty()) {
                            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f43532b.a((int) C0906R.id.d8c);
                            Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout, "tvDelete");
                            aVDmtHorizontalImageTextLayout.setVisibility(8);
                            return;
                        }
                        int i = pVar.f83051b[length];
                        int size = this.f43532b.g.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            EffectPointModel effectPointModel = this.f43532b.g.get(size);
                            Intrinsics.checkExpressionValueIsNotNull(effectPointModel, "mEffectPointModelStack[j]");
                            if (effectPointModel.getIndex() == i) {
                                this.f43532b.g.remove(size);
                                break;
                            }
                            size--;
                        }
                    }
                }
            } else {
                this.f43532b.g.clear();
                AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f43532b.a((int) C0906R.id.d8c);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout2, "tvDelete");
                aVDmtHorizontalImageTextLayout2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "action", "", "position", "model", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "kotlin.jvm.PlatformType", "onEffectAction"}, k = 3, mv = {1, 1, 15})
    static final class c implements VEEffectAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FilterEffectTabFragment f43534b;

        c(FilterEffectTabFragment filterEffectTabFragment) {
            this.f43534b = filterEffectTabFragment;
        }

        public final void a(int i, int i2, EffectModel effectModel) {
            String str;
            int i3 = i;
            int i4 = i2;
            EffectModel effectModel2 = effectModel;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), effectModel2}, this, f43533a, false, 38613, new Class[]{Integer.TYPE, Integer.TYPE, EffectModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), effectModel2}, this, f43533a, false, 38613, new Class[]{Integer.TYPE, Integer.TYPE, EffectModel.class}, Void.TYPE);
                return;
            }
            VEVideoPublishEditViewModel a2 = FilterEffectTabFragment.a(this.f43534b);
            ArrayList<EffectPointModel> arrayList = a2.f82809c;
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "it.effectPointModelStack");
            Effect effect = this.f43534b.a().get(i4);
            if (5 == i3) {
                com.ss.android.ugc.aweme.effect.a.a aVar = this.f43534b.f43510f;
                if (aVar != null) {
                    EffectPlatform a3 = aVar.a();
                    if (a3 != null && a3.a(effect)) {
                        MutableLiveData<VEEffectSelectOp> g = a2.g();
                        Intrinsics.checkExpressionValueIsNotNull(g, "it.effectSelectOpLiveData");
                        g.setValue(VEEffectSelectOp.selectTrans(effectModel));
                        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f43534b.a((int) C0906R.id.d8c);
                        Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout, "tvDelete");
                        aVDmtHorizontalImageTextLayout.setVisibility(0);
                        if (!arrayList.isEmpty()) {
                            this.f43534b.g.add(arrayList.get(arrayList.size() - 1));
                        } else {
                            com.ss.android.ugc.aweme.util.c.a("add effect fail");
                        }
                    }
                }
                com.ss.android.ugc.aweme.effect.a.a aVar2 = this.f43534b.f43510f;
                if (aVar2 != null) {
                    aVar2.a(effect);
                    return;
                }
                return;
            } else if (i3 == 0) {
                if (bm.a(effect.unzipPath)) {
                    if (TextUtils.isEmpty(effectModel2.resDir)) {
                        StringBuilder sb = new StringBuilder("applyFilter_resdir_null:");
                        if (effectModel2.key != null) {
                            str = effectModel2.key;
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        ExceptionMonitor.ensureNotReachHere(sb.toString());
                    }
                    this.f43534b.a(Integer.valueOf(i), effectModel2);
                }
            } else if (1 == i3) {
                if (!bm.a(effect.unzipPath)) {
                    com.ss.android.ugc.aweme.effect.a.a aVar3 = this.f43534b.f43510f;
                    if (aVar3 != null) {
                        aVar3.a(effect);
                    }
                } else {
                    MutableLiveData<VEEffectSelectOp> g2 = a2.g();
                    Intrinsics.checkExpressionValueIsNotNull(g2, "it.effectSelectOpLiveData");
                    g2.setValue(VEEffectSelectOp.selectFilter(i3, effectModel2));
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f43534b.a((int) C0906R.id.d8c);
                    Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout2, "tvDelete");
                    aVDmtHorizontalImageTextLayout2.setVisibility(0);
                }
            }
            com.ss.android.ugc.aweme.effect.b.a aVar4 = this.f43534b.m;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTouchStateHolder");
            }
            Intrinsics.checkExpressionValueIsNotNull(effectModel2, "model");
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), effectModel2}, aVar4, com.ss.android.ugc.aweme.effect.b.a.f43703a, false, 38854, new Class[]{Integer.TYPE, Integer.TYPE, EffectModel.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.effect.b.a aVar5 = aVar4;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), effectModel2}, aVar5, com.ss.android.ugc.aweme.effect.b.a.f43703a, false, 38854, new Class[]{Integer.TYPE, Integer.TYPE, EffectModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(effectModel2, "model");
            aVar4.f43704b = i3;
            aVar4.f43705c = i4;
            aVar4.f43706d = effectModel2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FilterEffectTabFragment f43536b;

        d(FilterEffectTabFragment filterEffectTabFragment) {
            this.f43536b = filterEffectTabFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f43535a, false, 38616, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f43535a, false, 38616, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!this.f43536b.g.isEmpty()) {
                EffectPointModel effectPointModel = this.f43536b.g.get(this.f43536b.g.size() - 1);
                Intrinsics.checkExpressionValueIsNotNull(effectPointModel, "mEffectPointModelStack[m…PointModelStack.size - 1]");
                f<p> l = FilterEffectTabFragment.a(this.f43536b).l();
                Intrinsics.checkExpressionValueIsNotNull(l, "mViewModel.filterEffectOpLiveData");
                l.setValue(p.b(effectPointModel.getIndex()));
                this.f43536b.g.remove(this.f43536b.g.size() - 1);
                if (this.f43536b.g.isEmpty()) {
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f43536b.a((int) C0906R.id.d8c);
                    Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout, "tvDelete");
                    aVDmtHorizontalImageTextLayout.setVisibility(8);
                }
            }
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 38608, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 38608, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.q == null) {
            this.q = new HashMap();
        }
        View view = (View) this.q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 38609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 38609, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 38603, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, j, false, 38603, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int findFirstVisibleItemPosition = b().findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = b().findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            while (true) {
                AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.ccj);
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = aVDmtPanelRecyleView != null ? aVDmtPanelRecyleView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition) : null;
                if (findViewHolderForAdapterPosition instanceof VEEffectAdapter.ViewHolder) {
                    ((VEEffectAdapter.ViewHolder) findViewHolderForAdapterPosition).a(z);
                } else {
                    boolean z2 = z;
                }
                if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                    break;
                }
                findFirstVisibleItemPosition++;
            }
        }
    }

    public final void a(Integer num, EffectModel effectModel) {
        if (PatchProxy.isSupport(new Object[]{num, effectModel}, this, j, false, 38604, new Class[]{Integer.class, EffectModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num, effectModel}, this, j, false, 38604, new Class[]{Integer.class, EffectModel.class}, Void.TYPE);
        } else if (num != null) {
            num.intValue();
            if (effectModel != null) {
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.k;
                if (vEVideoPublishEditViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                MutableLiveData<VEEffectSelectOp> g = vEVideoPublishEditViewModel.g();
                Intrinsics.checkExpressionValueIsNotNull(g, "mViewModel.effectSelectOpLiveData");
                g.setValue(VEEffectSelectOp.selectFilter(num.intValue(), effectModel));
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.k;
                if (vEVideoPublishEditViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<EffectPointModel> arrayList = vEVideoPublishEditViewModel2.f82809c;
                Intrinsics.checkExpressionValueIsNotNull(arrayList, "mViewModel.effectPointModelStack");
                if (!arrayList.isEmpty()) {
                    this.g.add(arrayList.get(arrayList.size() - 1));
                } else {
                    com.ss.android.ugc.aweme.util.c.a("add effect failed");
                }
            }
        }
    }

    public static final /* synthetic */ VEVideoPublishEditViewModel a(FilterEffectTabFragment filterEffectTabFragment) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = filterEffectTabFragment.k;
        if (vEVideoPublishEditViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, j, false, 38601, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, j, false, 38601, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.p = true;
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 38602, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, j, false, 38602, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.p) {
            if (z) {
                a(true);
                return;
            }
            a(false);
        }
    }

    public final void a(@NotNull Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, j, false, 38605, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, j, false, 38605, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect2, "rawEffect");
        int indexOf = a().indexOf(effect2);
        if (indexOf >= 0) {
            VEEffectAdapter vEEffectAdapter = this.o;
            if (vEEffectAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
            }
            vEEffectAdapter.a(indexOf, 2);
        }
    }

    public final void a(@NotNull DiffUtil.DiffResult diffResult, @NotNull List<? extends EffectModel> list) {
        if (PatchProxy.isSupport(new Object[]{diffResult, list}, this, j, false, 38600, new Class[]{DiffUtil.DiffResult.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{diffResult, list}, this, j, false, 38600, new Class[]{DiffUtil.DiffResult.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(diffResult, "result");
        Intrinsics.checkParameterIsNotNull(list, "newEffectSource");
        VEEffectAdapter vEEffectAdapter = this.o;
        if (vEEffectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        diffResult.dispatchUpdatesTo((RecyclerView.Adapter) vEEffectAdapter);
        a(list);
        VEEffectAdapter vEEffectAdapter2 = this.o;
        if (vEEffectAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        vEEffectAdapter2.a(this.f43509e);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, j, false, 38598, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, j, false, 38598, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of(activity).get(VEVideoPublishEditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.k = (VEVideoPublishEditViewModel) viewModel;
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.k;
            if (vEVideoPublishEditViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            vEVideoPublishEditViewModel.l().observe(this, new b(this));
        }
        this.m = new com.ss.android.ugc.aweme.effect.b.a();
        this.o = new VEEffectAdapter((AVDmtPanelRecyleView) a((int) C0906R.id.ccj), this.f43510f);
        VEEffectAdapter vEEffectAdapter = this.o;
        if (vEEffectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        vEEffectAdapter.a(this.f43509e);
        VEEffectAdapter vEEffectAdapter2 = this.o;
        if (vEEffectAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        vEEffectAdapter2.f43561b = new c(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.ccj);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "recyerview");
        VEEffectAdapter vEEffectAdapter3 = this.o;
        if (vEEffectAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        aVDmtPanelRecyleView.setAdapter(vEEffectAdapter3);
        ((AVDmtPanelRecyleView) a((int) C0906R.id.ccj)).addOnScrollListener(new FilterEffectTabFragment$onViewCreated$3(this));
        if (PatchProxy.isSupport(new Object[0], this, EditEffectTabFragment.f43505a, false, 38510, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, EditEffectTabFragment.f43505a, false, 38510, new Class[0], String.class);
        } else {
            str = this.f43506b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCategory");
            }
        }
        if (e.a(str)) {
            AVDmtTextView aVDmtTextView = (AVDmtTextView) a((int) C0906R.id.d8f);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvHint");
            aVDmtTextView.setText(getString(C0906R.string.aa8));
        }
        ao.a((AVDmtHorizontalImageTextLayout) a((int) C0906R.id.d8c), 0.5f);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) a((int) C0906R.id.d8c);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout, "tvDelete");
        if (this.g.isEmpty()) {
            i = 8;
        }
        aVDmtHorizontalImageTextLayout.setVisibility(i);
        ((AVDmtHorizontalImageTextLayout) a((int) C0906R.id.d8c)).setOnClickListener(new d(this));
        d();
    }

    public final void a(@Nullable Effect effect, @Nullable com.ss.android.ugc.effectmanager.common.e.c cVar) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2, cVar}, this, j, false, 38607, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, cVar}, this, j, false, 38607, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
        } else if (effect2 != null) {
            int indexOf = a().indexOf(effect2);
            if (indexOf >= 0) {
                VEEffectAdapter vEEffectAdapter = this.o;
                if (vEEffectAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
                }
                vEEffectAdapter.a(indexOf, 4);
            }
        }
    }

    public final void a(@NotNull Effect effect, @Nullable Effect effect2) {
        Integer num;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{effect, effect2}, this, j, false, 38606, new Class[]{Effect.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, effect2}, this, j, false, 38606, new Class[]{Effect.class, Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect, "rawEffect");
        int indexOf = a().indexOf(effect);
        if (indexOf >= 0) {
            VEEffectAdapter vEEffectAdapter = this.o;
            if (vEEffectAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
            }
            vEEffectAdapter.a(indexOf, 3);
            com.ss.android.ugc.aweme.effect.b.a aVar = this.m;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTouchStateHolder");
            }
            if (indexOf == aVar.f43705c && aVar.f43704b == 0) {
                z = true;
            }
            if (z) {
                com.ss.android.ugc.aweme.effect.b.a aVar2 = this.m;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTouchStateHolder");
                }
                EffectModel effectModel = null;
                if (aVar2 != null) {
                    num = Integer.valueOf(aVar2.f43704b);
                } else {
                    num = null;
                }
                com.ss.android.ugc.aweme.effect.b.a aVar3 = this.m;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTouchStateHolder");
                }
                if (aVar3 != null) {
                    effectModel = aVar3.f43706d;
                }
                a(num, effectModel);
            }
        }
    }
}
