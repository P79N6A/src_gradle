package com.ss.android.ugc.aweme.im.sdk.chat;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bRL\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/GreetEmojiViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mClickListener", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "position", "", "getMClickListener", "()Lkotlin/jvm/functions/Function2;", "setMClickListener", "(Lkotlin/jvm/functions/Function2;)V", "mEmojiIv", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "bind", "emoji", "Lcom/ss/android/ugc/aweme/im/sdk/resources/model/Emoji;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GreetEmojiViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50206a;

    /* renamed from: b  reason: collision with root package name */
    final RemoteImageView f50207b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Function2<? super View, ? super Integer, Unit> f50208c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GreetEmojiViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v_, viewGroup, false));
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View findViewById = this.itemView.findViewById(C0906R.id.a9e);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.emoji_iv)");
        this.f50207b = (RemoteImageView) findViewById;
        this.f50207b.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50209a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GreetEmojiViewHolder f50210b;

            {
                this.f50210b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f50209a, false, 50294, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f50209a, false, 50294, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                Function2<? super View, ? super Integer, Unit> function2 = this.f50210b.f50208c;
                if (function2 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                    function2.invoke(view, Integer.valueOf(this.f50210b.getAdapterPosition()));
                }
            }
        });
    }
}
