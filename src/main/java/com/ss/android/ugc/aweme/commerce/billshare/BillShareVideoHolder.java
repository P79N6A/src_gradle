package com.ss.android.ugc.aweme.commerce.billshare;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.u.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J@\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareVideoHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parentView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "adjustHeight", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "bind", "uid", "", "acb", "Lkotlin/Function3;", "Landroid/view/View;", "isStick", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BillShareVideoHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36721a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36722b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareVideoHolder$Companion;", "", "()V", "HEIGHT", "", "WIDTH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillShareVideoHolder f36724b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function3 f36725c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f36726d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f36727e;

        b(BillShareVideoHolder billShareVideoHolder, Function3 function3, Aweme aweme, String str) {
            this.f36724b = billShareVideoHolder;
            this.f36725c = function3;
            this.f36726d = aweme;
            this.f36727e = str;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36723a, false, 28003, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36723a, false, 28003, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function3 function3 = this.f36725c;
            if (function3 != null) {
                Aweme aweme = this.f36726d;
                View view2 = this.f36724b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view2.findViewById(C0906R.id.wv);
                Intrinsics.checkExpressionValueIsNotNull(linearGradientDraweeView, "itemView.commerce_item_logo");
                function3.invoke(aweme, linearGradientDraweeView, this.f36727e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f36729b;

        c(Aweme aweme) {
            this.f36729b = aweme;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36728a, false, 28004, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36728a, false, 28004, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            User author = this.f36729b.getAuthor();
            if (author != null && author.getUid() != null) {
                h a2 = h.a();
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                User author2 = this.f36729b.getAuthor();
                Intrinsics.checkExpressionValueIsNotNull(author2, "aweme.author");
                sb.append(author2.getUid());
                j a3 = j.a(sb.toString());
                User author3 = this.f36729b.getAuthor();
                Intrinsics.checkExpressionValueIsNotNull(author3, "aweme.author");
                a2.a(a3.a("sec_user_id", author3.getSecUid()).a());
                ((q) new q().a(this.f36729b.getAid(), this.f36729b.getAuthorUid()).a("click_head")).b("commodity_page").k(this.f36729b.getAuthorUid()).e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f36731b;

        d(Aweme aweme) {
            this.f36731b = aweme;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36730a, false, 28005, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36730a, false, 28005, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            User author = this.f36731b.getAuthor();
            if (author != null && author.getUid() != null) {
                h a2 = h.a();
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                User author2 = this.f36731b.getAuthor();
                Intrinsics.checkExpressionValueIsNotNull(author2, "aweme.author");
                sb.append(author2.getUid());
                j a3 = j.a(sb.toString());
                User author3 = this.f36731b.getAuthor();
                Intrinsics.checkExpressionValueIsNotNull(author3, "aweme.author");
                a2.a(a3.a("sec_user_id", author3.getSecUid()).a());
                ((q) new q().a(this.f36731b.getAid(), this.f36731b.getAuthorUid()).a("click_name")).b("commodity_page").k(this.f36731b.getAuthorUid()).e();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillShareVideoHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a23, viewGroup, false));
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
    }
}
