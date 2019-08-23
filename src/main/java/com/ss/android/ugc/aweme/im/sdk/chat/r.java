package com.ss.android.ugc.aweme.im.sdk.chat;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.MessageAdapter;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001,B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020$H\u0002J\u0006\u0010&\u001a\u00020$J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u000eH\u0002J\b\u0010+\u001a\u00020$H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/UnreadMessageTipsDelegate;", "", "rootView", "Landroid/view/View;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "adapter", "Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageAdapter;", "(Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageAdapter;", "mContext", "Landroid/content/Context;", "mCurrentReadIndex", "", "mCurrentUnreadCount", "mCurrentUnreadPosition", "", "mHasCheckUnreadTips", "", "mHasClickUnreadTips", "mIsLoadMore", "mLinearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "mScheduledGeneration", "mSmoothScrollDistance", "mSmoothToUnreadMessage", "mUnreadMessageCount", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "mUnreadMessageTips", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "getRootView", "()Landroid/view/View;", "checkHideUnreadMessageTips", "", "checkShowUnreadMessageTips", "clearSegmentMessageTips", "hideUnreadMessageTips", "initUnreadTips", "showUnreadMessageTips", "unreadCount", "smoothToUnreadMessageTips", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50709a;
    public static final a q = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f50710b;

    /* renamed from: c  reason: collision with root package name */
    boolean f50711c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f50712d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f50713e;

    /* renamed from: f  reason: collision with root package name */
    public long f50714f;
    public long g;
    public int h = -1;
    final Context i;
    public int j;
    final View k;
    final DmtTextView l;
    public final LinearLayoutManager m;
    @NotNull
    public final View n;
    @NotNull
    public final RecyclerView o;
    @NotNull
    public final MessageAdapter p;
    private int r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/UnreadMessageTipsDelegate$Companion;", "", "()V", "DEFAULT_PAGE_LIMIT", "", "INVALID_INDEX", "", "MAX_LOAD_MORE_TIMES", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f50716b;

        b(r rVar) {
            this.f50716b = rVar;
        }

        public final void run() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f50715a, false, 50509, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50715a, false, 50509, new Class[0], Void.TYPE);
                return;
            }
            LinearLayoutManager linearLayoutManager = this.f50716b.m;
            if (linearLayoutManager != null) {
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (this.f50716b.g > ((long) ((linearLayoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1))) {
                    r rVar = this.f50716b;
                    long j = this.f50716b.g;
                    if (PatchProxy.isSupport(new Object[]{new Long(j)}, rVar, r.f50709a, false, 50506, new Class[]{Long.TYPE}, Void.TYPE)) {
                        r rVar2 = rVar;
                        PatchProxy.accessDispatch(new Object[]{new Long(j)}, rVar2, r.f50709a, false, 50506, new Class[]{Long.TYPE}, Void.TYPE);
                    } else {
                        if (j > 99) {
                            str = rVar.i.getResources().getString(C0906R.string.azd, new Object[]{rVar.i.getResources().getString(C0906R.string.azb)});
                            Intrinsics.checkExpressionValueIsNotNull(str, "mContext.resources.getSt…ng.im_unread_count_more))");
                        } else {
                            str = rVar.i.getResources().getString(C0906R.string.azd, new Object[]{String.valueOf(j)});
                            Intrinsics.checkExpressionValueIsNotNull(str, "mContext.resources.getSt…, unreadCount.toString())");
                        }
                        DmtTextView dmtTextView = rVar.l;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mUnreadMessageCount");
                        dmtTextView.setText(str);
                        rVar.k.setVisibility(0);
                        rVar.k.startAnimation(com.ss.android.ugc.aweme.im.sdk.utils.b.a(240, UIUtils.dip2Px(rVar.i, 120.0f), 0.0f, 0.0f, 0.0f));
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/im/sdk/chat/UnreadMessageTipsDelegate$initUnreadTips$1$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f50718b;

        c(r rVar) {
            this.f50718b = rVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f50717a, false, 50510, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f50717a, false, 50510, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f50718b.f50714f != -1 && !this.f50718b.f50710b) {
                this.f50718b.f50710b = true;
                this.f50718b.a();
                this.f50718b.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 1, 15})
    static final class d implements MessageAdapter.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f50720b;

        d(r rVar) {
            this.f50720b = rVar;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f50719a, false, 50511, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50719a, false, 50511, new Class[0], Void.TYPE);
            } else if (this.f50720b.f50713e) {
                this.f50720b.b();
            } else {
                r rVar = this.f50720b;
                if (PatchProxy.isSupport(new Object[0], rVar, r.f50709a, false, 50503, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], rVar, r.f50709a, false, 50503, new Class[0], Void.TYPE);
                } else if (rVar.p.getItemCount() > 0 && rVar.g > 0 && !rVar.f50711c) {
                    rVar.f50711c = true;
                    rVar.o.post(new b(rVar));
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50709a, false, 50505, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50709a, false, 50505, new Class[0], Void.TYPE);
            return;
        }
        this.k.startAnimation(com.ss.android.ugc.aweme.im.sdk.utils.b.a(240, 0.0f, (float) this.k.getWidth(), 0.0f, 0.0f));
        UIUtils.setViewVisibility(this.k, 8);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50709a, false, 50507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50709a, false, 50507, new Class[0], Void.TYPE);
            return;
        }
        this.h = this.p.a(this.f50714f);
        if (this.h == -1) {
            this.f50713e = true;
            this.r++;
            if (this.r > 10) {
                this.r = 0;
                this.f50713e = false;
            } else if (this.g > 50) {
                this.p.a(((int) this.g) + 1);
            } else {
                this.p.a(51);
            }
        } else {
            this.f50713e = false;
            this.f50712d = true;
            this.o.smoothScrollToPosition(this.h);
        }
    }

    public r(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull MessageAdapter messageAdapter) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(messageAdapter, "adapter");
        this.n = view;
        this.o = recyclerView;
        this.p = messageAdapter;
        Context context = this.n.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        this.i = context;
        this.j = (int) UIUtils.dip2Px(this.i, 60.0f);
        View findViewById = this.n.findViewById(C0906R.id.do7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById<Vi…R.id.unread_message_tips)");
        this.k = findViewById;
        this.l = (DmtTextView) this.n.findViewById(C0906R.id.do6);
        if (this.o.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager = this.o.getLayoutManager();
            if (layoutManager != null) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        } else {
            linearLayoutManager = null;
        }
        this.m = linearLayoutManager;
        if (PatchProxy.isSupport(new Object[0], this, f50709a, false, 50502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50709a, false, 50502, new Class[0], Void.TYPE);
            return;
        }
        View view2 = this.k;
        view2.setVisibility(8);
        view2.setOnClickListener(new c(this));
        com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(this.p.m.getConversationId());
        if (a2 != null) {
            this.f50714f = a2.getReadIndex();
            this.g = a2.getUnreadCount();
        }
        this.p.n = new d(this);
        this.o.addOnScrollListener(new UnreadMessageTipsDelegate$initUnreadTips$4(this));
    }
}
