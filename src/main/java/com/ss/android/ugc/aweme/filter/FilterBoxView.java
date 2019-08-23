package com.ss.android.ugc.aweme.filter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.google.common.collect.ay;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 ,2\u00020\u0001:\u0005,-./0B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0010J$\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J$\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J$\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fJ\u0018\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001a\u0010*\u001a\u00020$2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ\u0012\u0010+\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView;", "Lcom/ss/android/ugc/aweme/common/widget/AbstractLoadingLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callback", "Lcom/ss/android/ugc/aweme/filter/FilterBoxView$OnItemChangeCallback;", "categoryMap", "Lcom/google/common/collect/ListMultimap;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "checkDrawable", "Landroid/graphics/drawable/Drawable;", "dependency", "Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;", "getDependency", "()Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;", "setDependency", "(Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;)V", "detailTable", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtPanelRecyleView;", "masterTable", "unCheckDrawable", "getCategoryByFilter", "filter", "onCreateEmptyView", "Landroid/view/View;", "onCreateErrorView", "onCreateLoadingView", "onMasterItemClick", "", "item", "onStateChanged", "oldState", "newState", "setCallback", "setCategoryMap", "showCorrespondingDetailPanel", "Companion", "DetailAdapter", "MasterAdapter", "OnItemChangeCallback", "SpaceItemDecoration", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FilterBoxView extends AbstractLoadingLayout {
    public static ChangeQuickRedirect g;
    public static final a l = new a((byte) 0);
    public b h;
    @NotNull
    public j i;
    public Drawable j;
    public Drawable k;
    private final AVDmtPanelRecyleView m;
    private final AVDmtPanelRecyleView n;
    private ay<EffectCategoryModel, o> o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView$DetailAdapter;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxView$DetailAdapter$ViewHolder;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxView;", "(Lcom/ss/android/ugc/aweme/filter/FilterBoxView;)V", "contextThemeWrapper", "Landroid/content/ContextWrapper;", "onBindViewHolder", "", "viewHolder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class DetailAdapter extends ListAdapter<o, ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47355a;

        /* renamed from: c  reason: collision with root package name */
        private ContextWrapper f47357c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView$DetailAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/widget/LinearLayout;", "(Lcom/ss/android/ugc/aweme/filter/FilterBoxView$DetailAdapter;Landroid/widget/LinearLayout;)V", "checkBox", "Landroid/widget/ImageView;", "iconView", "Lcom/ss/android/ugc/aweme/base/ui/CircleImageView;", "nameText", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "pressColor", "", "getPressColor", "()I", "bind", "", "filterBean", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "isInserting", "", "item", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public final class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47359a;
            @NotNull

            /* renamed from: b  reason: collision with root package name */
            public final TextView f47360b;

            /* renamed from: c  reason: collision with root package name */
            public final int f47361c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ DetailAdapter f47362d;

            /* renamed from: e  reason: collision with root package name */
            private final CircleImageView f47363e;

            /* renamed from: f  reason: collision with root package name */
            private final ImageView f47364f;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
            static final class a extends Lambda implements Function0<Unit> {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ ViewHolder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(ViewHolder viewHolder) {
                    super(0);
                    this.this$0 = viewHolder;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44177, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44177, new Class[0], Void.TYPE);
                        return;
                    }
                    if (this.this$0.getAdapterPosition() >= 0) {
                        o oVar = (o) this.this$0.f47362d.getItem(this.this$0.getAdapterPosition());
                        if (oVar != null) {
                            oVar.o = "filter_box";
                        }
                        FilterBoxView filterBoxView = FilterBoxView.this;
                        Intrinsics.checkExpressionValueIsNotNull(oVar, "item");
                        EffectCategoryModel a2 = filterBoxView.a(oVar);
                        if (oVar.m) {
                            b bVar = FilterBoxView.this.h;
                            if (bVar != null) {
                                bVar.a(a2, oVar);
                            }
                        } else {
                            oVar.l = !oVar.l;
                            this.this$0.a(oVar);
                            if (oVar.l) {
                                b bVar2 = FilterBoxView.this.h;
                                if (bVar2 != null) {
                                    bVar2.b(a2, oVar);
                                }
                            } else {
                                b bVar3 = FilterBoxView.this.h;
                                if (bVar3 != null) {
                                    bVar3.c(a2, oVar);
                                }
                            }
                        }
                    }
                }
            }

            public final void a(@NotNull o oVar) {
                Drawable drawable;
                float f2;
                if (PatchProxy.isSupport(new Object[]{oVar}, this, f47359a, false, 44174, new Class[]{o.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{oVar}, this, f47359a, false, 44174, new Class[]{o.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(oVar, "filterBean");
                c.a((RemoteImageView) this.f47363e, oVar.g.toString());
                this.f47360b.setText(oVar.f47599c);
                ImageView imageView = this.f47364f;
                if (oVar.l) {
                    drawable = FilterBoxView.this.k;
                } else {
                    drawable = FilterBoxView.this.j;
                }
                imageView.setImageDrawable(drawable);
                if (oVar.m) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                imageView.setAlpha(f2);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ViewHolder(DetailAdapter detailAdapter, @NotNull final LinearLayout linearLayout) {
                super(linearLayout);
                Intrinsics.checkParameterIsNotNull(linearLayout, "itemView");
                this.f47362d = detailAdapter;
                View childAt = linearLayout.getChildAt(0);
                if (childAt != null) {
                    this.f47363e = (CircleImageView) childAt;
                    View childAt2 = linearLayout.getChildAt(1);
                    if (childAt2 != null) {
                        this.f47360b = (TextView) childAt2;
                        View childAt3 = linearLayout.getChildAt(2);
                        if (childAt3 != null) {
                            this.f47364f = (ImageView) childAt3;
                            this.f47361c = com.ss.android.ugc.aweme.themechange.base.b.f74589e.a(false, false, false, false, true);
                            final Function0 aVar = new a(this);
                            linearLayout.setOnClickListener(new View.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f47365a;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f47365a, false, 44175, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f47365a, false, 44175, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    ClickInstrumentation.onClick(view);
                                    aVar.invoke();
                                }
                            });
                            linearLayout.setOnTouchListener(new View.OnTouchListener(this) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f47367a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ ViewHolder f47368b;

                                {
                                    this.f47368b = r1;
                                }

                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f47367a, false, 44176, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f47367a, false, 44176, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                                    }
                                    Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
                                    if (motionEvent.getAction() == 1) {
                                        ObjectAnimator ofInt = ObjectAnimator.ofInt(linearLayout, "backgroundColor", new int[]{this.f47368b.f47361c, 16777215});
                                        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
                                        ofInt.setDuration(500);
                                        ofInt.setEvaluator(new ArgbEvaluator());
                                        ofInt.start();
                                    }
                                    return false;
                                }
                            });
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.CircleImageView");
            }
        }

        public DetailAdapter() {
            super((DiffUtil.ItemCallback<T>) new DiffUtil.ItemCallback<o>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47358a;

                public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
                    o oVar = (o) obj;
                    o oVar2 = (o) obj2;
                    if (PatchProxy.isSupport(new Object[]{oVar, oVar2}, this, f47358a, false, 44173, new Class[]{o.class, o.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{oVar, oVar2}, this, f47358a, false, 44173, new Class[]{o.class, o.class}, Boolean.TYPE)).booleanValue();
                    }
                    Intrinsics.checkParameterIsNotNull(oVar, "p0");
                    Intrinsics.checkParameterIsNotNull(oVar2, "p1");
                    return Intrinsics.areEqual((Object) oVar.f47599c, (Object) oVar2.f47599c);
                }

                public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
                    o oVar = (o) obj;
                    o oVar2 = (o) obj2;
                    if (PatchProxy.isSupport(new Object[]{oVar, oVar2}, this, f47358a, false, 44172, new Class[]{o.class, o.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{oVar, oVar2}, this, f47358a, false, 44172, new Class[]{o.class, o.class}, Boolean.TYPE)).booleanValue();
                    }
                    Intrinsics.checkParameterIsNotNull(oVar, "p0");
                    Intrinsics.checkParameterIsNotNull(oVar2, "p1");
                    return Intrinsics.areEqual((Object) oVar.f47599c, (Object) oVar2.f47599c);
                }
            });
        }

        public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f47355a, false, 44171, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f47355a, false, 44171, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(viewHolder2, "viewHolder");
            Object item = getItem(i);
            Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
            viewHolder2.a((o) item);
        }

        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewHolder viewHolder;
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f47355a, false, 44170, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
                viewHolder = (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f47355a, false, 44170, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
                if (this.f47357c == null) {
                    Context context = viewGroup.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
                    this.f47357c = new ay(context);
                }
                ContextWrapper contextWrapper = this.f47357c;
                if (contextWrapper == null) {
                    Intrinsics.throwNpe();
                }
                View inflate = LayoutInflater.from(contextWrapper).inflate(C0906R.layout.f8, viewGroup, false);
                if (inflate != null) {
                    viewHolder = new ViewHolder(this, (LinearLayout) inflate);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
                }
            }
            return viewHolder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView$MasterAdapter;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxView$MasterAdapter$ViewHolder;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxView;", "(Lcom/ss/android/ugc/aweme/filter/FilterBoxView;)V", "selectedName", "", "onBindViewHolder", "", "viewHolder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class MasterAdapter extends ListAdapter<EffectCategoryModel, ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47370a;

        /* renamed from: b  reason: collision with root package name */
        public String f47371b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView$MasterAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/widget/FrameLayout;", "(Lcom/ss/android/ugc/aweme/filter/FilterBoxView$MasterAdapter;Landroid/widget/FrameLayout;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "bind", "", "item", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "selected", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public final class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47374a;
            @NotNull

            /* renamed from: b  reason: collision with root package name */
            public final TextView f47375b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MasterAdapter f47376c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ViewHolder(MasterAdapter masterAdapter, @NotNull FrameLayout frameLayout) {
                super(frameLayout);
                Intrinsics.checkParameterIsNotNull(frameLayout, "itemView");
                this.f47376c = masterAdapter;
                View childAt = frameLayout.getChildAt(0);
                if (childAt != null) {
                    this.f47375b = (TextView) childAt;
                    frameLayout.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f47377a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ ViewHolder f47378b;

                        {
                            this.f47378b = r1;
                        }

                        public final void onFocusChange(View view, boolean z) {
                            if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f47377a, false, 44183, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f47377a, false, 44183, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            if (z) {
                                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f47378b.f47376c.getItem(this.f47378b.getAdapterPosition());
                                FilterBoxView filterBoxView = FilterBoxView.this;
                                Intrinsics.checkExpressionValueIsNotNull(effectCategoryModel, "item");
                                if (PatchProxy.isSupport(new Object[]{effectCategoryModel}, filterBoxView, FilterBoxView.g, false, 44165, new Class[]{EffectCategoryModel.class}, Void.TYPE)) {
                                    FilterBoxView filterBoxView2 = filterBoxView;
                                    PatchProxy.accessDispatch(new Object[]{effectCategoryModel}, filterBoxView2, FilterBoxView.g, false, 44165, new Class[]{EffectCategoryModel.class}, Void.TYPE);
                                } else {
                                    Intrinsics.checkParameterIsNotNull(effectCategoryModel, "item");
                                    filterBoxView.a(effectCategoryModel);
                                }
                                this.f47378b.f47376c.f47371b = effectCategoryModel.name;
                                this.f47378b.f47376c.notifyDataSetChanged();
                            }
                        }
                    });
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        }

        public MasterAdapter() {
            super((DiffUtil.ItemCallback<T>) new DiffUtil.ItemCallback<EffectCategoryModel>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47373a;

                public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
                    EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
                    EffectCategoryModel effectCategoryModel2 = (EffectCategoryModel) obj2;
                    if (PatchProxy.isSupport(new Object[]{effectCategoryModel, effectCategoryModel2}, this, f47373a, false, 44181, new Class[]{EffectCategoryModel.class, EffectCategoryModel.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effectCategoryModel, effectCategoryModel2}, this, f47373a, false, 44181, new Class[]{EffectCategoryModel.class, EffectCategoryModel.class}, Boolean.TYPE)).booleanValue();
                    }
                    Intrinsics.checkParameterIsNotNull(effectCategoryModel, "p0");
                    Intrinsics.checkParameterIsNotNull(effectCategoryModel2, "p1");
                    return Intrinsics.areEqual((Object) effectCategoryModel.name, (Object) effectCategoryModel2.name);
                }

                public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
                    EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
                    EffectCategoryModel effectCategoryModel2 = (EffectCategoryModel) obj2;
                    if (PatchProxy.isSupport(new Object[]{effectCategoryModel, effectCategoryModel2}, this, f47373a, false, 44180, new Class[]{EffectCategoryModel.class, EffectCategoryModel.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effectCategoryModel, effectCategoryModel2}, this, f47373a, false, 44180, new Class[]{EffectCategoryModel.class, EffectCategoryModel.class}, Boolean.TYPE)).booleanValue();
                    }
                    Intrinsics.checkParameterIsNotNull(effectCategoryModel, "p0");
                    Intrinsics.checkParameterIsNotNull(effectCategoryModel2, "p1");
                    return Intrinsics.areEqual((Object) effectCategoryModel.name, (Object) effectCategoryModel2.name);
                }
            });
        }

        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewHolder viewHolder;
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f47370a, false, 44178, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
                viewHolder = (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f47370a, false, 44178, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.f9, viewGroup2, false);
                if (inflate != null) {
                    viewHolder = new ViewHolder(this, (FrameLayout) inflate);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
            }
            return viewHolder;
        }

        public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            float f2;
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f47370a, false, 44179, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f47370a, false, 44179, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(viewHolder2, "viewHolder");
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) getItem(i);
            if (this.f47371b == null) {
                Intrinsics.checkExpressionValueIsNotNull(effectCategoryModel, "item");
                this.f47371b = effectCategoryModel.name;
                z = true;
            } else {
                String str = this.f47371b;
                Intrinsics.checkExpressionValueIsNotNull(effectCategoryModel, "item");
                z = Intrinsics.areEqual((Object) str, (Object) effectCategoryModel.name);
            }
            if (PatchProxy.isSupport(new Object[]{effectCategoryModel, Byte.valueOf(z ? (byte) 1 : 0)}, viewHolder2, ViewHolder.f47374a, false, 44182, new Class[]{EffectCategoryModel.class, Boolean.TYPE}, Void.TYPE)) {
                ViewHolder viewHolder3 = viewHolder2;
                PatchProxy.accessDispatch(new Object[]{effectCategoryModel, Byte.valueOf(z)}, viewHolder3, ViewHolder.f47374a, false, 44182, new Class[]{EffectCategoryModel.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(effectCategoryModel, "item");
            viewHolder2.f47375b.setText(effectCategoryModel.name);
            TextView textView = viewHolder2.f47375b;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            textView.setAlpha(f2);
            if (z) {
                viewHolder2.f47375b.setTypeface(viewHolder2.f47375b.getTypeface(), 1);
            } else {
                viewHolder2.f47375b.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.c.g));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView$SpaceItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "space", "", "(Lcom/ss/android/ugc/aweme/filter/FilterBoxView;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class SpaceItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47379a;

        /* renamed from: c  reason: collision with root package name */
        private final int f47381c;

        public SpaceItemDecoration(int i) {
            this.f47381c = i;
        }

        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Rect rect2 = rect;
            View view2 = view;
            RecyclerView recyclerView2 = recyclerView;
            RecyclerView.State state2 = state;
            if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f47379a, false, 44184, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                Object[] objArr = {rect2, view2, recyclerView2, state2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f47379a, false, 44184, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(rect2, "outRect");
            Intrinsics.checkParameterIsNotNull(view2, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
            Intrinsics.checkParameterIsNotNull(state2, "state");
            if (recyclerView2.getChildAdapterPosition(view2) == 0) {
                rect2.top = this.f47381c;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView$Companion;", "", "()V", "ENTER_METHOD_FILTER_BOX", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxView$OnItemChangeCallback;", "", "onBuiltinItemClicked", "", "category", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "filter", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "onItemInserted", "onItemRemoved", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull EffectCategoryModel effectCategoryModel, @NotNull o oVar);

        void b(@NotNull EffectCategoryModel effectCategoryModel, @NotNull o oVar);

        void c(@NotNull EffectCategoryModel effectCategoryModel, @NotNull o oVar);
    }

    @NotNull
    public final j getDependency() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 44158, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], this, g, false, 44158, new Class[0], j.class);
        }
        j jVar = this.i;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dependency");
        }
        return jVar;
    }

    public final void setCallback(@Nullable b bVar) {
        this.h = bVar;
    }

    public final void setDependency(@NotNull j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, g, false, 44159, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, this, g, false, 44159, new Class[]{j.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(jVar2, "<set-?>");
        this.i = jVar2;
    }

    public final void setCategoryMap(@NotNull ay<EffectCategoryModel, o> ayVar) {
        if (PatchProxy.isSupport(new Object[]{ayVar}, this, g, false, 44164, new Class[]{ay.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ayVar}, this, g, false, 44164, new Class[]{ay.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(ayVar, "categoryMap");
        setState(0);
        this.o = ayVar;
        MasterAdapter masterAdapter = new MasterAdapter();
        this.m.setAdapter(masterAdapter);
        Set elementSet = ayVar.keys().elementSet();
        Intrinsics.checkExpressionValueIsNotNull(elementSet, "categoryMap.keys().elementSet()");
        masterAdapter.submitList(CollectionsKt.toList(elementSet));
        Set elementSet2 = ayVar.keys().elementSet();
        Intrinsics.checkExpressionValueIsNotNull(elementSet2, "categoryMap.keys().elementSet()");
        a((EffectCategoryModel) CollectionsKt.firstOrNull(CollectionsKt.toList(elementSet2)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterBoxView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new MasterAdapter());
        aVDmtPanelRecyleView.addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(aVDmtPanelRecyleView.getContext(), 8.0f)));
        this.m = aVDmtPanelRecyleView;
        this.m.setSecondPanel(true);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context3, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new DetailAdapter());
        aVDmtPanelRecyleView2.addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(aVDmtPanelRecyleView2.getContext(), 8.0f)));
        this.n = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.m, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.n, new LinearLayout.LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b2 = com.ss.android.ugc.aweme.themechange.base.b.f74589e.b(false);
        com.ss.android.ugc.aweme.themechange.base.b bVar = com.ss.android.ugc.aweme.themechange.base.b.f74589e;
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        this.j = bVar.a(com.ss.android.ugc.bytex.a.a.a.a(context4.getResources(), 2130838845), b2);
        Context context5 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context5, "context");
        this.k = com.ss.android.ugc.bytex.a.a.a.a(context5.getResources(), 2130838826);
    }

    @NotNull
    public final EffectCategoryModel a(@NotNull o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, g, false, 44167, new Class[]{o.class}, EffectCategoryModel.class)) {
            return (EffectCategoryModel) PatchProxy.accessDispatch(new Object[]{oVar}, this, g, false, 44167, new Class[]{o.class}, EffectCategoryModel.class);
        }
        Intrinsics.checkParameterIsNotNull(oVar, "filter");
        try {
            ay<EffectCategoryModel, o> ayVar = this.o;
            if (ayVar == null) {
                Intrinsics.throwNpe();
            }
            Collection entries = ayVar.entries();
            Intrinsics.checkExpressionValueIsNotNull(entries, "categoryMap!!.entries()");
            for (Object next : entries) {
                Object value = ((Map.Entry) next).getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
                if (Intrinsics.areEqual((Object) ((o) value).f47599c, (Object) oVar.f47599c)) {
                    Object key = ((Map.Entry) next).getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key, "categoryMap!!.entries().…r.name)\n            }.key");
                    return (EffectCategoryModel) key;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException e2) {
            StringBuilder sb = new StringBuilder("filter.name=");
            sb.append(oVar.f47599c);
            sb.append(", category.names=");
            ay<EffectCategoryModel, o> ayVar2 = this.o;
            if (ayVar2 == null) {
                Intrinsics.throwNpe();
            }
            Collection values = ayVar2.values();
            Intrinsics.checkExpressionValueIsNotNull(values, "categoryMap!!.values()");
            Iterable<o> iterable = values;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (o oVar2 : iterable) {
                Intrinsics.checkExpressionValueIsNotNull(oVar2, AdvanceSetting.NETWORK_TYPE);
                arrayList.add(oVar2.f47599c);
            }
            sb.append((List) arrayList);
            ai.b(sb.toString());
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(EffectCategoryModel effectCategoryModel) {
        List list;
        if (PatchProxy.isSupport(new Object[]{effectCategoryModel}, this, g, false, 44166, new Class[]{EffectCategoryModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryModel}, this, g, false, 44166, new Class[]{EffectCategoryModel.class}, Void.TYPE);
            return;
        }
        RecyclerView.Adapter adapter = this.n.getAdapter();
        if (adapter != null) {
            DetailAdapter detailAdapter = (DetailAdapter) adapter;
            if (effectCategoryModel == null) {
                list = CollectionsKt.emptyList();
            } else {
                ay<EffectCategoryModel, o> ayVar = this.o;
                if (ayVar != null) {
                    list = ayVar.get(effectCategoryModel);
                } else {
                    list = null;
                }
                if (list == null) {
                    Intrinsics.throwNpe();
                }
            }
            detailAdapter.submitList(list);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.FilterBoxView.DetailAdapter");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterBoxView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new MasterAdapter());
        aVDmtPanelRecyleView.addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(aVDmtPanelRecyleView.getContext(), 8.0f)));
        this.m = aVDmtPanelRecyleView;
        this.m.setSecondPanel(true);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context3, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new DetailAdapter());
        aVDmtPanelRecyleView2.addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(aVDmtPanelRecyleView2.getContext(), 8.0f)));
        this.n = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.m, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.n, new LinearLayout.LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b2 = com.ss.android.ugc.aweme.themechange.base.b.f74589e.b(false);
        com.ss.android.ugc.aweme.themechange.base.b bVar = com.ss.android.ugc.aweme.themechange.base.b.f74589e;
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        this.j = bVar.a(com.ss.android.ugc.bytex.a.a.a.a(context4.getResources(), 2130838845), b2);
        Context context5 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context5, "context");
        this.k = com.ss.android.ugc.bytex.a.a.a.a(context5.getResources(), 2130838826);
    }

    public final void a(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, g, false, 44163, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, g, false, 44163, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i2, i3);
        if (this.f40313b != null) {
            View view = this.f40313b;
            Intrinsics.checkExpressionValueIsNotNull(view, "mContentView");
            if (i3 == 0) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            view.setVisibility(i6);
        }
        View view2 = this.f40314c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "mLoadingView");
        int i7 = 8;
        if (i3 == 1) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view2.setVisibility(i4);
        View view3 = this.f40316e;
        Intrinsics.checkExpressionValueIsNotNull(view3, "mErrorView");
        if (i3 == 2) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        view3.setVisibility(i5);
        View view4 = this.f40315d;
        Intrinsics.checkExpressionValueIsNotNull(view4, "mEmptyView");
        if (i3 == 3) {
            i7 = 0;
        }
        view4.setVisibility(i7);
    }

    @Nullable
    public final View a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, g, false, 44160, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, g, false, 44160, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return new DmtLoadingLayout(context2, attributeSet2, i2);
    }

    @Nullable
    public final View b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet, Integer.valueOf(i2)}, this, g, false, 44161, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, attributeSet, Integer.valueOf(i2)}, this, g, false, 44161, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return new Space(context2);
    }

    @Nullable
    public final View c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet, Integer.valueOf(i2)}, this, g, false, 44162, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, attributeSet, Integer.valueOf(i2)}, this, g, false, 44162, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return new Space(context2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterBoxView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new MasterAdapter());
        aVDmtPanelRecyleView.addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(aVDmtPanelRecyleView.getContext(), 8.0f)));
        this.m = aVDmtPanelRecyleView;
        this.m.setSecondPanel(true);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context3, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new DetailAdapter());
        aVDmtPanelRecyleView2.addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(aVDmtPanelRecyleView2.getContext(), 8.0f)));
        this.n = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.m, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.n, new LinearLayout.LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b2 = com.ss.android.ugc.aweme.themechange.base.b.f74589e.b(false);
        com.ss.android.ugc.aweme.themechange.base.b bVar = com.ss.android.ugc.aweme.themechange.base.b.f74589e;
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        this.j = bVar.a(com.ss.android.ugc.bytex.a.a.a.a(context4.getResources(), 2130838845), b2);
        Context context5 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context5, "context");
        this.k = com.ss.android.ugc.bytex.a.a.a.a(context5.getResources(), 2130838826);
    }
}
