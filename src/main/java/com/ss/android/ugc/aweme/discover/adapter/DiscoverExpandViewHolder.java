package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;)V", "mIvwCover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mIvwHead", "mVwPointer", "bindAweme", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "selected", "", "bindSelect", "Companion", "OnItemClickListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverExpandViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41600a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f41601d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public RemoteImageView f41602b;

    /* renamed from: c  reason: collision with root package name */
    RemoteImageView f41603c;

    /* renamed from: e  reason: collision with root package name */
    private View f41604e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$Companion;", "", "()V", "createViewHolderView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41608a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@Nullable View view, int i);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41600a, false, 35566, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41600a, false, 35566, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            View view = this.f41604e;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View view2 = this.f41604e;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoverExpandViewHolder(@NotNull View view, @Nullable final b bVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f41602b = (RemoteImageView) view.findViewById(C0906R.id.b6k);
        this.f41603c = (RemoteImageView) view.findViewById(C0906R.id.b6m);
        this.f41604e = view.findViewById(C0906R.id.dw4);
        RemoteImageView remoteImageView = this.f41602b;
        if (remoteImageView != null) {
            remoteImageView.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41605a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ DiscoverExpandViewHolder f41606b;

                {
                    this.f41606b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41605a, false, 35568, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41605a, false, 35568, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    b bVar = bVar;
                    if (bVar != null) {
                        bVar.a(this.f41606b.f41602b, this.f41606b.getAdapterPosition());
                    }
                }
            });
        }
    }
}
