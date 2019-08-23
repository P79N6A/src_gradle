package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.GreetEmojiAdapter;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.AutoRTLImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/GreetMessageViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/SayHelloContent;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "mAdapter", "Lcom/ss/android/ugc/aweme/im/sdk/chat/GreetEmojiAdapter;", "mCloseIv", "Lcom/ss/android/ugc/aweme/im/sdk/widget/AutoRTLImageView;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "position", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GreetMessageViewHolder extends BaseViewHolder<SayHelloContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51066a;

    /* renamed from: b  reason: collision with root package name */
    private final AutoRTLImageView f51067b;
    private final RecyclerView p;
    private final GreetEmojiAdapter q = new GreetEmojiAdapter();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GreetMessageViewHolder f51069b;

        a(GreetMessageViewHolder greetMessageViewHolder) {
            this.f51069b = greetMessageViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51068a, false, 51467, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51068a, false, 51467, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            SayHelloContent sayHelloContent = (SayHelloContent) this.f51069b.k;
            if (sayHelloContent != null) {
                z a2 = z.a();
                String str = this.f51069b.h;
                n nVar = this.f51069b.m;
                Intrinsics.checkExpressionValueIsNotNull(nVar, "currentMessage");
                a2.a(str, nVar.getConversationId(), sayHelloContent.getEmoji(), true);
            }
            o.c(this.f51069b.m);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "position", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<View, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GreetMessageViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GreetMessageViewHolder greetMessageViewHolder) {
            super(2);
            this.this$0 = greetMessageViewHolder;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((View) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view, int i) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 51468, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 51468, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            final int i2 = i;
            new com.ss.android.ugc.aweme.im.sdk.a.b(view.getContext(), new c(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51070a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f51071b;

                {
                    this.f51071b = r1;
                }

                public final void sendMsg() {
                    if (PatchProxy.isSupport(new Object[0], this, f51070a, false, 51469, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51070a, false, 51469, new Class[0], Void.TYPE);
                        return;
                    }
                    o.c(this.f51071b.this$0.m);
                    n nVar = this.f51071b.this$0.m;
                    Intrinsics.checkExpressionValueIsNotNull(nVar, "currentMessage");
                    SayHelloContent sayHelloContent = (SayHelloContent) l.a(nVar.getContent(), SayHelloContent.class);
                    if (sayHelloContent != null && i2 >= 0 && i2 < sayHelloContent.getEmoji().size()) {
                        z a2 = z.a();
                        n nVar2 = this.f51071b.this$0.m;
                        Intrinsics.checkExpressionValueIsNotNull(nVar2, "currentMessage");
                        String conversationId = nVar2.getConversationId();
                        com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar = sayHelloContent.getEmoji().get(i2);
                        Intrinsics.checkExpressionValueIsNotNull(aVar, "emoji[position]");
                        a2.c(conversationId, "", String.valueOf(aVar.getId()));
                        ba a3 = ba.a();
                        n nVar3 = this.f51071b.this$0.m;
                        Intrinsics.checkExpressionValueIsNotNull(nVar3, "currentMessage");
                        a3.b(nVar3.getConversationId(), (BaseContent) EmojiContent.obtain(sayHelloContent.getEmoji().get(i2)));
                    }
                }
            }).sendMsg();
        }
    }

    public final void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51066a, false, 51465, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51066a, false, 51465, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.f51067b.setOnClickListener(new a(this));
        this.q.f50205c = new b(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GreetMessageViewHolder(@NotNull View view, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.ts);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.close_iv)");
        this.f51067b = (AutoRTLImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.alg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.greet_icon_list)");
        this.p = (RecyclerView) findViewById2;
        RecyclerView recyclerView = this.p;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.setAdapter(this.q);
    }

    public final /* synthetic */ void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        SayHelloContent sayHelloContent = (SayHelloContent) baseContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, sayHelloContent, Integer.valueOf(i)}, this, f51066a, false, 51466, new Class[]{n.class, n.class, SayHelloContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, sayHelloContent, Integer.valueOf(i)}, this, f51066a, false, 51466, new Class[]{n.class, n.class, SayHelloContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar3, "msg");
        super.a(nVar3, nVar4, sayHelloContent, i);
        if (sayHelloContent != null) {
            z.a().a(this.h, nVar.getConversationId(), sayHelloContent.getEmoji(), false);
            this.q.a(sayHelloContent.getEmoji(), null);
        }
    }
}
