package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.VEStickerEffectAdapter;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.f;
import dmt.av.video.o;
import dmt.av.video.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016J\u001e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u001a\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/StickerEffectTabFragment;", "Lcom/ss/android/ugc/aweme/effect/EditEffectTabFragment;", "()V", "mEffectAdapter", "Lcom/ss/android/ugc/aweme/effect/VEStickerEffectAdapter;", "mViewModel", "Ldmt/av/video/VEVideoPublishEditViewModel;", "onChangeDownloadState", "", "position", "", "state", "onDownloadFailed", "failedEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onDownloadStart", "rawEffect", "onDownloadSuccess", "effect", "onEffectDiffResult", "result", "Landroid/support/v7/util/DiffUtil$DiffResult;", "newEffectSource", "", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StickerEffectTabFragment extends EditEffectTabFragment {
    public static ChangeQuickRedirect j;
    public static final a m = new a((byte) 0);
    public VEVideoPublishEditViewModel k;
    public VEStickerEffectAdapter l;
    private HashMap n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/StickerEffectTabFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/effect/StickerEffectTabFragment;", "effects", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "category", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43541a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Ldmt/av/video/VEFilterEffectOp;", "onChanged", "com/ss/android/ugc/aweme/effect/StickerEffectTabFragment$onViewCreated$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<p> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StickerEffectTabFragment f43543b;

        b(StickerEffectTabFragment stickerEffectTabFragment) {
            this.f43543b = stickerEffectTabFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            if (PatchProxy.isSupport(new Object[]{pVar}, this, f43542a, false, 38634, new Class[]{p.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pVar}, this, f43542a, false, 38634, new Class[]{p.class}, Void.TYPE);
            } else if (pVar == null || pVar.f83054e != 3) {
                if (pVar != null && pVar.f83054e == 4) {
                    for (int length = pVar.f83051b.length - 1; length >= 0 && !this.f43543b.g.isEmpty(); length--) {
                        EffectPointModel effectPointModel = this.f43543b.g.get(0);
                        Intrinsics.checkExpressionValueIsNotNull(effectPointModel, "mEffectPointModelStack[0]");
                        if (effectPointModel.getIndex() == pVar.f83051b[length]) {
                            VEStickerEffectAdapter vEStickerEffectAdapter = this.f43543b.l;
                            if (vEStickerEffectAdapter == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
                            }
                            vEStickerEffectAdapter.a(null);
                            EffectPointModel remove = this.f43543b.g.remove(0);
                            Intrinsics.checkExpressionValueIsNotNull(remove, "mEffectPointModelStack.removeAt(0)");
                            f<p> l = StickerEffectTabFragment.a(this.f43543b).l();
                            Intrinsics.checkExpressionValueIsNotNull(l, "mViewModel.filterEffectOpLiveData");
                            l.setValue(p.a(remove.getIndex()));
                            return;
                        }
                    }
                }
            } else {
                this.f43543b.g.clear();
                AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f43543b.a((int) C0906R.id.d8c);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout, "tvDelete");
                aVDmtHorizontalImageTextLayout.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Float;)V", "com/ss/android/ugc/aweme/effect/StickerEffectTabFragment$onViewCreated$1$2"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StickerEffectTabFragment f43545b;

        c(StickerEffectTabFragment stickerEffectTabFragment) {
            this.f43545b = stickerEffectTabFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (PatchProxy.isSupport(new Object[]{f2}, this, f43544a, false, 38635, new Class[]{Float.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{f2}, this, f43544a, false, 38635, new Class[]{Float.class}, Void.TYPE);
            } else if (f2 == null || Float.compare(f2.floatValue(), 0.0f) <= 0) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f43545b.a((int) C0906R.id.d8f);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvHint");
                aVDmtTextView.setText(this.f43545b.getString(C0906R.string.ih));
            } else {
                Locale locale = Locale.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                String format = String.format(locale, "%.1f", Arrays.copyOf(new Object[]{f2}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
                AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f43545b.a((int) C0906R.id.d8f);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView2, "tvHint");
                aVDmtTextView2.setText(this.f43545b.getString(C0906R.string.a_r, format));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "model", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "kotlin.jvm.PlatformType", "type", "", "position", "onItemClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements VEStickerEffectAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StickerEffectTabFragment f43547b;

        d(StickerEffectTabFragment stickerEffectTabFragment) {
            this.f43547b = stickerEffectTabFragment;
        }

        public final void a(EffectModel effectModel, int i, int i2) {
            EffectPointModel effectPointModel;
            o oVar;
            EffectModel effectModel2 = effectModel;
            if (PatchProxy.isSupport(new Object[]{effectModel2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43546a, false, 38636, new Class[]{EffectModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effectModel2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43546a, false, 38636, new Class[]{EffectModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            VEVideoPublishEditViewModel a2 = StickerEffectTabFragment.a(this.f43547b);
            Effect effect = this.f43547b.a().get(i2);
            if (i == 2) {
                com.ss.android.ugc.aweme.effect.a.a aVar = this.f43547b.f43510f;
                if (aVar != null) {
                    EffectPlatform a3 = aVar.a();
                    if (a3 != null && a3.a(effect)) {
                        if (!this.f43547b.g.isEmpty()) {
                            EffectPointModel remove = this.f43547b.g.remove(0);
                            Intrinsics.checkExpressionValueIsNotNull(remove, "mEffectPointModelStack.removeAt(0)");
                            f<p> l = a2.l();
                            Intrinsics.checkExpressionValueIsNotNull(l, "veVideoPublishVideoModel.filterEffectOpLiveData");
                            l.setValue(p.a(remove.getIndex()));
                        }
                        AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f43547b.a((int) C0906R.id.d8f);
                        Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvHint");
                        aVDmtTextView.setText(this.f43547b.getString(C0906R.string.ih));
                        return;
                    }
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.effect.a.a aVar2 = this.f43547b.f43510f;
            if (aVar2 != null) {
                EffectPlatform a4 = aVar2.a();
                if (a4 != null && a4.a(effect)) {
                    MutableLiveData<VEEffectSelectOp> g = a2.g();
                    Intrinsics.checkExpressionValueIsNotNull(g, "veVideoPublishVideoModel.effectSelectOpLiveData");
                    if (this.f43547b.g.isEmpty()) {
                        effectPointModel = null;
                    } else {
                        effectPointModel = this.f43547b.g.remove(0);
                    }
                    g.setValue(VEEffectSelectOp.selectSticker(effectModel2, effectPointModel));
                    MutableLiveData<o> j = a2.j();
                    Intrinsics.checkExpressionValueIsNotNull(j, "veVideoPublishVideoModel.effectHintLiveData");
                    o.a aVar3 = o.f83045e;
                    CharSequence charSequence = effectModel2.hint;
                    if (PatchProxy.isSupport(new Object[]{charSequence, 2000L}, aVar3, o.a.f83049a, false, 91999, new Class[]{CharSequence.class, Long.TYPE}, o.class)) {
                        o.a aVar4 = aVar3;
                        oVar = (o) PatchProxy.accessDispatch(new Object[]{charSequence, 2000L}, aVar4, o.a.f83049a, false, 91999, new Class[]{CharSequence.class, Long.TYPE}, o.class);
                    } else {
                        oVar = new o(0, (byte) 0);
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        if (PatchProxy.isSupport(new Object[]{charSequence}, oVar, o.f83044a, false, 91996, new Class[]{CharSequence.class}, Void.TYPE)) {
                            o oVar2 = oVar;
                            PatchProxy.accessDispatch(new Object[]{charSequence}, oVar2, o.f83044a, false, 91996, new Class[]{CharSequence.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
                            oVar.f83046b = charSequence;
                        }
                        oVar.f83047c = 2000;
                    }
                    j.setValue(oVar);
                    AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f43547b.a((int) C0906R.id.d8f);
                    Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView2, "tvHint");
                    aVDmtTextView2.setText(this.f43547b.getString(C0906R.string.ih));
                    ArrayList<EffectPointModel> arrayList = a2.f82809c;
                    Intrinsics.checkExpressionValueIsNotNull(arrayList, "veVideoPublishVideoModel.effectPointModelStack");
                    if (!arrayList.isEmpty()) {
                        this.f43547b.g.add(arrayList.get(arrayList.size() - 1));
                        return;
                    } else {
                        com.ss.android.ugc.aweme.util.c.a("add effect fail");
                        return;
                    }
                }
            }
            com.ss.android.ugc.aweme.effect.a.a aVar5 = this.f43547b.f43510f;
            if (aVar5 != null) {
                aVar5.a(effect);
            }
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 38630, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 38630, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 38631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 38631, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public static final /* synthetic */ VEVideoPublishEditViewModel a(StickerEffectTabFragment stickerEffectTabFragment) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = stickerEffectTabFragment.k;
        if (vEVideoPublishEditViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    public final void a(@NotNull Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, j, false, 38627, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, j, false, 38627, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect2, "rawEffect");
        int indexOf = a().indexOf(effect2);
        if (indexOf >= 0) {
            VEStickerEffectAdapter vEStickerEffectAdapter = this.l;
            if (vEStickerEffectAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
            }
            vEStickerEffectAdapter.a(indexOf, 2);
        }
    }

    public final void a(@NotNull DiffUtil.DiffResult diffResult, @NotNull List<? extends EffectModel> list) {
        if (PatchProxy.isSupport(new Object[]{diffResult, list}, this, j, false, 38626, new Class[]{DiffUtil.DiffResult.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{diffResult, list}, this, j, false, 38626, new Class[]{DiffUtil.DiffResult.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(diffResult, "result");
        Intrinsics.checkParameterIsNotNull(list, "newEffectSource");
        VEStickerEffectAdapter vEStickerEffectAdapter = this.l;
        if (vEStickerEffectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        diffResult.dispatchUpdatesTo((RecyclerView.Adapter) vEStickerEffectAdapter);
        a(list);
        VEStickerEffectAdapter vEStickerEffectAdapter2 = this.l;
        if (vEStickerEffectAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        vEStickerEffectAdapter2.a(this.f43509e);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, j, false, 38624, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, j, false, 38624, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        AVDmtTextView aVDmtTextView = (AVDmtTextView) a((int) C0906R.id.d8f);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvHint");
        aVDmtTextView.setText(getString(C0906R.string.ih));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of(activity).get(VEVideoPublishEditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            this.k = (VEVideoPublishEditViewModel) viewModel;
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.k;
            if (vEVideoPublishEditViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            LifecycleOwner lifecycleOwner = this;
            vEVideoPublishEditViewModel.l().observe(lifecycleOwner, new b(this));
            this.l = new VEStickerEffectAdapter((AVDmtPanelRecyleView) a((int) C0906R.id.ccj), this.f43510f);
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.k;
            if (vEVideoPublishEditViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            vEVideoPublishEditViewModel2.h().observe(lifecycleOwner, new c(this));
        }
        VEStickerEffectAdapter vEStickerEffectAdapter = this.l;
        if (vEStickerEffectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        vEStickerEffectAdapter.a(this.f43509e);
        if (!this.g.isEmpty()) {
            VEStickerEffectAdapter vEStickerEffectAdapter2 = this.l;
            if (vEStickerEffectAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
            }
            vEStickerEffectAdapter2.a(this.g.get(0));
        }
        VEStickerEffectAdapter vEStickerEffectAdapter3 = this.l;
        if (vEStickerEffectAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        vEStickerEffectAdapter3.f43626b = new d(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.ccj);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "recyerview");
        VEStickerEffectAdapter vEStickerEffectAdapter4 = this.l;
        if (vEStickerEffectAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
        }
        aVDmtPanelRecyleView.setAdapter(vEStickerEffectAdapter4);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) a((int) C0906R.id.d8c);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout, "tvDelete");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        d();
    }

    public final void a(@Nullable Effect effect, @Nullable com.ss.android.ugc.effectmanager.common.e.c cVar) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2, cVar}, this, j, false, 38629, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, cVar}, this, j, false, 38629, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
        } else if (effect2 != null) {
            int indexOf = a().indexOf(effect2);
            if (indexOf >= 0) {
                VEStickerEffectAdapter vEStickerEffectAdapter = this.l;
                if (vEStickerEffectAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
                }
                vEStickerEffectAdapter.a(indexOf, 4);
            }
        }
    }

    public final void a(@NotNull Effect effect, @Nullable Effect effect2) {
        Effect effect3 = effect;
        if (PatchProxy.isSupport(new Object[]{effect3, effect2}, this, j, false, 38628, new Class[]{Effect.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect3, effect2}, this, j, false, 38628, new Class[]{Effect.class, Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect3, "rawEffect");
        int indexOf = a().indexOf(effect3);
        if (indexOf >= 0) {
            VEStickerEffectAdapter vEStickerEffectAdapter = this.l;
            if (vEStickerEffectAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEffectAdapter");
            }
            vEStickerEffectAdapter.a(indexOf, 3);
        }
    }
}
