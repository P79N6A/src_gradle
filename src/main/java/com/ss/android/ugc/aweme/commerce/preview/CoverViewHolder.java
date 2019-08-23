package com.ss.android.ugc.aweme.commerce.preview;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\u00100\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/CoverViewHolder;", "Lcom/ss/android/ugc/aweme/common/adapter/AnimatedViewHolder;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "itemView", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/commerce/preview/OnClickListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/commerce/preview/OnClickListener;)V", "userDesc", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "getUserDesc", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "userDesc$delegate", "Lkotlin/Lazy;", "userIcon", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "getUserIcon", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "userIcon$delegate", "bind", "", "data", "position", "", "updateCover", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CoverViewHolder extends AnimatedViewHolder<Aweme> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37127a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37128b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CoverViewHolder.class), "userIcon", "getUserIcon()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CoverViewHolder.class), "userDesc", "getUserDesc()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f37129c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f37130d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28542, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.$itemView.findViewById(C0906R.id.doz);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28542, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<AvatarImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        public final AvatarImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28543, new Class[0], AvatarImageView.class)) {
                return (AvatarImageView) this.$itemView.findViewById(C0906R.id.dp0);
            }
            return (AvatarImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28543, new Class[0], AvatarImageView.class);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37127a, false, 28540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37127a, false, 28540, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            Object obj = this.g;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            Video video = ((Aweme) obj).getVideo();
            if (video == null) {
                Object obj2 = this.g;
                Intrinsics.checkExpressionValueIsNotNull(obj2, "mData");
                c.b(this.h, ((Aweme) obj2).getDynamicPreferredCover());
            } else if (!e() || !AnimatedViewHolder.a(video.getDynamicCover())) {
                c.b(this.h, video.getCover());
            } else {
                this.h.a(video.getDynamicCover());
                this.i = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoverViewHolder(@NotNull View view, @Nullable final c cVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f37129c = LazyKt.lazy(new b(view));
        this.f37130d = LazyKt.lazy(new a(view));
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.ep);
        this.h.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37131a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CoverViewHolder f37132b;

            {
                this.f37132b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f37131a, false, 28541, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f37131a, false, 28541, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                c cVar = cVar;
                if (cVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view, NotifyType.VIBRATE);
                    cVar.a(view, (Aweme) this.f37132b.g);
                }
            }
        });
    }

    public final void a(@Nullable Aweme aweme, int i) {
        Object value;
        Object value2;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f37127a, false, 28539, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f37127a, false, 28539, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (aweme != null) {
            super.a(aweme, i);
            this.g = aweme;
            Object obj = this.g;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            if (((Aweme) obj).isOrderShareRecommend()) {
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                ImageView imageView = (ImageView) view.findViewById(C0906R.id.dh4);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.tv_recommend");
                imageView.setVisibility(0);
            } else {
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                ImageView imageView2 = (ImageView) view2.findViewById(C0906R.id.dh4);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.tv_recommend");
                imageView2.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f37127a, false, 28537, new Class[0], AvatarImageView.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f37127a, false, 28537, new Class[0], AvatarImageView.class);
            } else {
                value = this.f37129c.getValue();
            }
            User author = aweme.getAuthor();
            Intrinsics.checkExpressionValueIsNotNull(author, "data.author");
            c.b((AvatarImageView) value, author.getAvatarThumb());
            User author2 = aweme.getAuthor();
            Intrinsics.checkExpressionValueIsNotNull(author2, "data.author");
            if (author2.getNickname() != null) {
                if (PatchProxy.isSupport(new Object[0], this, f37127a, false, 28538, new Class[0], DmtTextView.class)) {
                    value2 = PatchProxy.accessDispatch(new Object[0], this, f37127a, false, 28538, new Class[0], DmtTextView.class);
                } else {
                    value2 = this.f37130d.getValue();
                }
                DmtTextView dmtTextView = (DmtTextView) value2;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "userDesc");
                User author3 = aweme.getAuthor();
                Intrinsics.checkExpressionValueIsNotNull(author3, "data.author");
                dmtTextView.setText(author3.getNickname());
            }
            a();
        }
    }
}
