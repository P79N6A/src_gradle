package com.ss.android.ugc.aweme.commercialize.utils;

import android.support.transition.ChangeBounds;
import android.support.transition.Transition;
import android.support.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J \u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007J\u001c\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J'\u0010\u001a\u001a\u00020\u0010*\u0004\u0018\u00010\b2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f*\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/AdTagAnim;", "", "()V", "tagId", "", "children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "hasVisibleChild", "", "getHasVisibleChild", "(Landroid/view/ViewGroup;)Z", "prepare", "", "tagLayout", "Lcom/ss/android/ugc/aweme/base/ui/TagLayout;", "setupShowTag", "view", "model", "Lcom/ss/android/ugc/aweme/feed/model/AwemeTextLabelModel;", "startAnim", "transitionContainer", "child", "beginDelayedTransition", "transition", "", "Landroid/support/transition/Transition;", "(Landroid/view/ViewGroup;[Landroid/support/transition/Transition;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39803a;

    /* renamed from: b  reason: collision with root package name */
    public static final o f39804b = new o();

    /* renamed from: c  reason: collision with root package name */
    private static final int f39805c = C0906R.id.d2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Integer, View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ViewGroup $this_children;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewGroup viewGroup) {
            super(1);
            this.$this_children = viewGroup;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final View invoke(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 32406, new Class[]{Integer.TYPE}, View.class)) {
                return this.$this_children.getChildAt(i);
            }
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 32406, new Class[]{Integer.TYPE}, View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/utils/AdTagAnim$startAnim$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39806a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f39807b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f39808c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TagLayout f39809d;

        b(View view, ViewGroup viewGroup, TagLayout tagLayout) {
            this.f39807b = view;
            this.f39808c = viewGroup;
            this.f39809d = tagLayout;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39806a, false, 32407, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39806a, false, 32407, new Class[0], Void.TYPE);
                return;
            }
            o.f39804b.a(this.f39808c, this.f39809d, this.f39807b);
        }
    }

    private o() {
    }

    public final void a(@Nullable ViewGroup viewGroup, @NotNull TagLayout tagLayout, @NotNull View view) {
        ViewGroup viewGroup2 = viewGroup;
        TagLayout tagLayout2 = tagLayout;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, tagLayout2, view2}, this, f39803a, false, 32402, new Class[]{ViewGroup.class, TagLayout.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, tagLayout2, view2}, this, f39803a, false, 32402, new Class[]{ViewGroup.class, TagLayout.class, View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(tagLayout2, "tagLayout");
        Intrinsics.checkParameterIsNotNull(view2, "child");
        if (view.getVisibility() != 0) {
            Object tag = view2.getTag(f39805c);
            if (!(tag instanceof Long)) {
                tag = null;
            }
            Long l = (Long) tag;
            long longValue = l != null ? l.longValue() : 0;
            view2.setVisibility(0);
            if (longValue <= 0 || tagLayout.getVisibility() != 0) {
                view2.setAlpha(1.0f);
                a(viewGroup2, new ChangeBounds());
                tagLayout2.setVisibility(0);
                return;
            }
            view2.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(200).start();
        }
    }

    private final Sequence<View> a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f39803a, false, 32403, new Class[]{ViewGroup.class}, Sequence.class)) {
            return SequencesKt.map(CollectionsKt.asSequence(RangesKt.until(0, viewGroup.getChildCount())), new a(viewGroup2));
        }
        return (Sequence) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f39803a, false, 32403, new Class[]{ViewGroup.class}, Sequence.class);
    }

    @JvmStatic
    public static final void a(@Nullable TagLayout tagLayout) {
        int i;
        boolean z;
        long j;
        TagLayout tagLayout2 = tagLayout;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{tagLayout2}, null, f39803a, true, 32400, new Class[]{TagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tagLayout2}, null, f39803a, true, 32400, new Class[]{TagLayout.class}, Void.TYPE);
        } else if (tagLayout2 != null) {
            ViewGroup viewGroup = tagLayout2;
            Iterator it2 = SequencesKt.filterNotNull(f39804b.a(viewGroup)).iterator();
            while (true) {
                i = 8;
                if (!it2.hasNext()) {
                    break;
                }
                View view = (View) it2.next();
                Object tag = view.getTag(f39805c);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l = (Long) tag;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            o oVar = f39804b;
            if (!PatchProxy.isSupport(new Object[]{viewGroup}, oVar, f39803a, false, 32404, new Class[]{ViewGroup.class}, Boolean.TYPE)) {
                Iterator it3 = oVar.a(viewGroup).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((View) it3.next()).getVisibility() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
            } else {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{viewGroup}, oVar, f39803a, false, 32404, new Class[]{ViewGroup.class}, Boolean.TYPE)).booleanValue();
            }
            if (z2) {
                i = 0;
            }
            tagLayout2.setVisibility(i);
        }
    }

    @JvmStatic
    public static final void a(@Nullable View view, @Nullable AwemeTextLabelModel awemeTextLabelModel) {
        long j;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, awemeTextLabelModel}, null, f39803a, true, 32399, new Class[]{View.class, AwemeTextLabelModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, awemeTextLabelModel}, null, f39803a, true, 32399, new Class[]{View.class, AwemeTextLabelModel.class}, Void.TYPE);
        } else if (view2 != null) {
            if (awemeTextLabelModel != null) {
                j = kotlin.a.a.a(awemeTextLabelModel.getShowSeconds() * 1000.0f);
            } else {
                j = 0;
            }
            view2.setTag(f39805c, Long.valueOf(j));
        }
    }

    @JvmStatic
    public static final void a(@Nullable ViewGroup viewGroup, @Nullable TagLayout tagLayout) {
        long j;
        ViewGroup viewGroup2 = viewGroup;
        TagLayout tagLayout2 = tagLayout;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, tagLayout2}, null, f39803a, true, 32401, new Class[]{ViewGroup.class, TagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, tagLayout2}, null, f39803a, true, 32401, new Class[]{ViewGroup.class, TagLayout.class}, Void.TYPE);
        } else if (tagLayout2 != null) {
            for (View view : SequencesKt.filterNotNull(f39804b.a((ViewGroup) tagLayout2))) {
                Object tag = view.getTag(f39805c);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l = (Long) tag;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    view.postDelayed(new b(view, viewGroup2, tagLayout2), j);
                } else {
                    f39804b.a(viewGroup2, tagLayout2, view);
                }
            }
        }
    }

    private final void a(@Nullable ViewGroup viewGroup, Transition... transitionArr) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, transitionArr}, this, f39803a, false, 32405, new Class[]{ViewGroup.class, Transition[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, transitionArr}, this, f39803a, false, 32405, new Class[]{ViewGroup.class, Transition[].class}, Void.TYPE);
        } else if (viewGroup2 != null) {
            try {
                TransitionManager.beginDelayedTransition(viewGroup2, transitionArr[0]);
            } catch (NullPointerException unused) {
            }
        }
    }
}
