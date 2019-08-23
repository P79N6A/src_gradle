package com.ss.android.ugc.aweme.challenge.ui.header.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;)V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getListener", "()Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;", "slideVideoCover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "bind", "", "Companion", "IHorizontalSlideListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HorizontalSlideVideoViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35620a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f35621e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final AnimatedImageView f35622b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f35623c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final b f35624d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35627a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;", "", "onVideoClick", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "order", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull Aweme aweme, int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalSlideVideoViewHolder(@NotNull View view, @NotNull b bVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f35624d = bVar;
        View findViewById = view.findViewById(C0906R.id.crv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.slide_aiv)");
        this.f35622b = (AnimatedImageView) findViewById;
        this.f35622b.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35625a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ HorizontalSlideVideoViewHolder f35626b;

            {
                this.f35626b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f35625a, false, 26425, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f35625a, false, 26425, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (this.f35626b.f35623c != null && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    b bVar = this.f35626b.f35624d;
                    Aweme aweme = this.f35626b.f35623c;
                    if (aweme == null) {
                        Intrinsics.throwNpe();
                    }
                    bVar.a(aweme, this.f35626b.getAdapterPosition() + 1);
                }
            }
        });
    }
}
