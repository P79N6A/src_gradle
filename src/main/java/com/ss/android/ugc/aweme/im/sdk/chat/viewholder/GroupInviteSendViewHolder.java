package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/GroupInviteSendViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/GroupInviteViewHolder;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "statusIcon", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;", "getStatusIcon", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;", "statusIcon$delegate", "Lkotlin/Lazy;", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "baseContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "position", "initViewRefs", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupInviteSendViewHolder extends GroupInviteViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51073a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51074b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInviteSendViewHolder.class), "statusIcon", "getStatusIcon()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;"))};
    private final Lazy v = LazyKt.lazy(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<c> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInviteSendViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GroupInviteSendViewHolder groupInviteSendViewHolder) {
            super(0);
            this.this$0 = groupInviteSendViewHolder;
        }

        @NotNull
        public final c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51474, new Class[0], c.class)) {
                return new c(this.this$0.j);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51474, new Class[0], c.class);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51073a, false, 51471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51073a, false, 51471, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) this.itemView.findViewById(C0906R.id.cv9);
    }

    public final void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51073a, false, 51472, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51073a, false, 51472, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupInviteSendViewHolder(@NotNull View view, int i) {
        super(view, i);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    public final void a(@Nullable n nVar, @Nullable n nVar2, @Nullable BaseContent baseContent, int i) {
        Object value;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51073a, false, 51473, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51073a, false, 51473, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        if (PatchProxy.isSupport(new Object[0], this, f51073a, false, 51470, new Class[0], c.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51073a, false, 51470, new Class[0], c.class);
        } else {
            value = this.v.getValue();
        }
        ((c) value).a(this.m);
    }
}
