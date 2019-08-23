package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingNormalViewHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u0014\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aJ\u0006\u0010\u001b\u001a\u00020\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0006\u0010\u001f\u001a\u00020\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0014\u0010'\u001a\u00060\u0013R\u00020\u00002\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010-\u001a\u00020\u00162\b\u0010.\u001a\u0004\u0018\u00010/J\u0006\u00100\u001a\u00020\u0016J\u0006\u00101\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/adapter/PixaloopMattingAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/listener/OnPixaloopSelectListener;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/listener/OnPixaloopSelectListener;)V", "currentPixaloopData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopData;", "dataList", "Ljava/util/ArrayList;", "dataSize", "", "getDataSize", "()I", "footerView", "Landroid/view/View;", "footerViewHolder", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/adapter/PixaloopMattingAdapter$FooterViewHolder;", "prePosition", "addData", "", "pixaloopData", "addDataList", "pixaloopDataList", "", "clearData", "getItemCount", "getItemViewType", "position", "hideLoading", "isCurPixaloopData", "", "data", "onBindNormalViewHolder", "holder", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/ui/FaceMattingNormalViewHolder;", "onBindViewHolder", "onCreateViewFooterHolder", "parent", "Landroid/view/ViewGroup;", "onCreateViewHolder", "viewType", "onCreateViewNormalHolder", "selectData", "path", "", "showLoading", "unSelectData", "Companion", "FooterViewHolder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PixaloopMattingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69373a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f69374f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b f69375b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b> f69376c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public int f69377d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.b f69378e;
    private View g = LayoutInflater.from(this.i).inflate(C0906R.layout.s_, null);
    private FooterViewHolder h;
    private final Context i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/adapter/PixaloopMattingAdapter$FooterViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/adapter/PixaloopMattingAdapter;Landroid/view/View;)V", "mLoadingImage", "Landroid/widget/ImageView;", "mRotationAnim", "Landroid/animation/ObjectAnimator;", "bindViewHolder", "", "hide", "startRotationAnim", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class FooterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69379a;

        /* renamed from: b  reason: collision with root package name */
        ObjectAnimator f69380b;

        /* renamed from: c  reason: collision with root package name */
        final ImageView f69381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PixaloopMattingAdapter f69382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FooterViewHolder(PixaloopMattingAdapter pixaloopMattingAdapter, @NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f69382d = pixaloopMattingAdapter;
            View findViewById = view.findViewById(C0906R.id.b2w);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_loading)");
            this.f69381c = (ImageView) findViewById;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/adapter/PixaloopMattingAdapter$Companion;", "", "()V", "ITEM_TYPE_FOOTER", "", "ITEM_TYPE_NORMAL", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69383a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PixaloopMattingAdapter f69384b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FaceMattingNormalViewHolder f69385c;

        b(PixaloopMattingAdapter pixaloopMattingAdapter, FaceMattingNormalViewHolder faceMattingNormalViewHolder) {
            this.f69384b = pixaloopMattingAdapter;
            this.f69385c = faceMattingNormalViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f69383a, false, 78936, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69383a, false, 78936, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            int adapterPosition = this.f69385c.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f69384b.f69376c.size()) {
                this.f69384b.f69375b = this.f69384b.f69376c.get(adapterPosition);
                this.f69384b.notifyItemChanged(this.f69384b.f69377d);
                this.f69384b.notifyItemChanged(adapterPosition);
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.b bVar = this.f69384b.f69378e;
                if (bVar != null) {
                    bVar.a(this.f69384b.f69375b);
                }
                this.f69384b.f69377d = adapterPosition;
            }
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f69373a, false, 78917, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69373a, false, 78917, new Class[0], Integer.TYPE)).intValue();
        } else if (j.a((Collection<T>) this.f69376c)) {
            return 0;
        } else {
            return this.f69376c.size();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69373a, false, 78925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69373a, false, 78925, new Class[0], Void.TYPE);
            return;
        }
        this.f69375b = null;
        if (this.f69377d >= 0) {
            notifyItemChanged(this.f69377d);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69373a, false, 78931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69373a, false, 78931, new Class[0], Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = LayoutInflater.from(this.i).inflate(C0906R.layout.s_, null);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f69373a, false, 78932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69373a, false, 78932, new Class[0], Void.TYPE);
            return;
        }
        this.f69376c.clear();
        this.f69375b = null;
    }

    public final int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f69373a, false, 78921, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69373a, false, 78921, new Class[0], Integer.TYPE)).intValue();
        }
        int size = this.f69376c.size();
        if (this.g != null) {
            size++;
        }
        return size;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69373a, false, 78930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69373a, false, 78930, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            FooterViewHolder footerViewHolder = this.h;
            if (footerViewHolder == null) {
                Intrinsics.throwNpe();
            }
            if (PatchProxy.isSupport(new Object[0], footerViewHolder, FooterViewHolder.f69379a, false, 78935, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], footerViewHolder, FooterViewHolder.f69379a, false, 78935, new Class[0], Void.TYPE);
            } else {
                if (footerViewHolder.f69380b != null) {
                    ObjectAnimator objectAnimator = footerViewHolder.f69380b;
                    if (objectAnimator == null) {
                        Intrinsics.throwNpe();
                    }
                    objectAnimator.cancel();
                    footerViewHolder.f69380b = null;
                }
                if (footerViewHolder.itemView != null) {
                    View view = footerViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    view.setVisibility(8);
                }
            }
            this.g = null;
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69373a, false, 78926, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f69373a, false, 78926, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !j.a((Collection<T>) this.f69376c)) {
            int size = this.f69376c.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt.equals$default(str, this.f69376c.get(i2).f69361b, false, 2, null)) {
                    this.f69375b = this.f69376c.get(i2);
                    if (this.f69377d >= 0) {
                        notifyItemChanged(this.f69377d);
                    }
                    notifyItemChanged(i2);
                    this.f69377d = i2;
                }
            }
        }
    }

    public final int getItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69373a, false, 78920, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69373a, false, 78920, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g == null || i2 != getItemCount() - 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public final void a(@NotNull List<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f69373a, false, 78928, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f69373a, false, 78928, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "pixaloopDataList");
        this.f69376c.clear();
        this.f69376c.addAll(list);
        this.g = null;
        notifyDataSetChanged();
    }

    public PixaloopMattingAdapter(@NotNull Context context, @Nullable com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.b bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.i = context;
        this.f69378e = bVar;
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        FaceMattingNormalViewHolder faceMattingNormalViewHolder;
        FooterViewHolder footerViewHolder;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f69373a, false, 78918, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f69373a, false, 78918, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i2 == 1) {
            if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f69373a, false, 78923, new Class[]{ViewGroup.class}, FooterViewHolder.class)) {
                footerViewHolder = (FooterViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f69373a, false, 78923, new Class[]{ViewGroup.class}, FooterViewHolder.class);
            } else {
                View view = this.g;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                this.h = new FooterViewHolder(this, view);
                footerViewHolder = this.h;
                if (footerViewHolder == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter.FooterViewHolder");
                }
            }
            return footerViewHolder;
        }
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f69373a, false, 78924, new Class[]{ViewGroup.class}, FaceMattingNormalViewHolder.class)) {
            faceMattingNormalViewHolder = (FaceMattingNormalViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f69373a, false, 78924, new Class[]{ViewGroup.class}, FaceMattingNormalViewHolder.class);
        } else {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sb, viewGroup, false);
            if (Build.VERSION.SDK_INT >= 21) {
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                inflate.setOutlineProvider(new com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.a((int) UIUtils.dip2Px(viewGroup.getContext(), 6.0f)));
                inflate.setClipToOutline(true);
            }
            FaceMattingNormalViewHolder faceMattingNormalViewHolder2 = new FaceMattingNormalViewHolder(inflate);
            inflate.setOnClickListener(new b(this, faceMattingNormalViewHolder2));
            faceMattingNormalViewHolder = faceMattingNormalViewHolder2;
        }
        return faceMattingNormalViewHolder;
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f69373a, false, 78919, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f69373a, false, 78919, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        if (viewHolder2 instanceof FooterViewHolder) {
            FooterViewHolder footerViewHolder = (FooterViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], footerViewHolder, FooterViewHolder.f69379a, false, 78933, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], footerViewHolder, FooterViewHolder.f69379a, false, 78933, new Class[0], Void.TYPE);
            } else {
                View view = footerViewHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                view.setVisibility(0);
                if (PatchProxy.isSupport(new Object[0], footerViewHolder, FooterViewHolder.f69379a, false, 78934, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], footerViewHolder, FooterViewHolder.f69379a, false, 78934, new Class[0], Void.TYPE);
                } else {
                    footerViewHolder.f69380b = ObjectAnimator.ofFloat(footerViewHolder.f69381c, "rotation", new float[]{0.0f, 360.0f});
                    ObjectAnimator objectAnimator = footerViewHolder.f69380b;
                    if (objectAnimator == null) {
                        Intrinsics.throwNpe();
                    }
                    objectAnimator.setDuration(800);
                    ObjectAnimator objectAnimator2 = footerViewHolder.f69380b;
                    if (objectAnimator2 == null) {
                        Intrinsics.throwNpe();
                    }
                    objectAnimator2.setRepeatMode(1);
                    ObjectAnimator objectAnimator3 = footerViewHolder.f69380b;
                    if (objectAnimator3 == null) {
                        Intrinsics.throwNpe();
                    }
                    objectAnimator3.setRepeatCount(-1);
                    ObjectAnimator objectAnimator4 = footerViewHolder.f69380b;
                    if (objectAnimator4 == null) {
                        Intrinsics.throwNpe();
                    }
                    objectAnimator4.start();
                }
            }
        } else if (viewHolder2 instanceof FaceMattingNormalViewHolder) {
            FaceMattingNormalViewHolder faceMattingNormalViewHolder = (FaceMattingNormalViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[]{faceMattingNormalViewHolder, Integer.valueOf(i2)}, this, f69373a, false, 78922, new Class[]{FaceMattingNormalViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{faceMattingNormalViewHolder, Integer.valueOf(i2)}, this, f69373a, false, 78922, new Class[]{FaceMattingNormalViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar = this.f69376c.get(i3);
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f69373a, false, 78929, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f69373a, false, 78929, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (!(bVar == null || this.f69375b == null)) {
                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar2 = this.f69375b;
                    if (bVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!TextUtils.isEmpty(bVar2.f69361b)) {
                        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar3 = this.f69375b;
                        if (bVar3 == null) {
                            Intrinsics.throwNpe();
                        }
                        z = Intrinsics.areEqual((Object) bVar3.f69361b, (Object) bVar.f69361b);
                    }
                }
                z = false;
            }
            if (z) {
                ImageView imageView = faceMattingNormalViewHolder.f69459a;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "holder.selectedMark");
                imageView.setVisibility(0);
            } else {
                ImageView imageView2 = faceMattingNormalViewHolder.f69459a;
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "holder.selectedMark");
                imageView2.setVisibility(8);
            }
            String uri = Uri.fromFile(new File(this.f69376c.get(i3).f69361b)).toString();
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.fromFile(File(dataLi…ion].imgPath)).toString()");
            RemoteImageView remoteImageView = faceMattingNormalViewHolder.f69460b;
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "holder.imageView");
            int dip2Px = (int) UIUtils.dip2Px(remoteImageView.getContext(), 50.0f);
            c.a(faceMattingNormalViewHolder.f69460b, uri, dip2Px, dip2Px);
        }
    }
}
