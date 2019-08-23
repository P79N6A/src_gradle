package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagLayout2;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.services.publish.PulishTitle;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0014J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0016H\u0014J\b\u0010%\u001a\u00020\u0016H\u0014J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0014J\u0012\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020\u0016H\u0014J\b\u0010.\u001a\u00020\u0016H\u0014J\b\u0010/\u001a\u00020\u0016H\u0014J\b\u00100\u001a\u00020\u0016H\u0014J\"\u00101\u001a\u00020\u00162\b\u0010\u0002\u001a\u0004\u0018\u00010\u00122\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001fH\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowImageViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/adapter/FollowFlowItemImageViewHolder;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "getDiggAwemeListener", "()Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "getProvider", "()Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "getScrollStateManager", "()Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "tagView", "Landroid/view/View;", "getView", "()Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "bindDescView", "", "bindExtraView", "bindForwardView", "bindPoiTagView", "bindShoppingView", "bindTagLayout", "bindViews", "calNewMediaItemSize", "screenWidth", "", "ratioHW", "", "dstSize", "", "checkDisableShareView", "expandImage", "getExtraDialogString", "", "", "inflateStub", "root", "isMomentStyle", "", "setRoundCorner", "setShareImage", "showTimeText", "updateDividerLine", "updateMediaItemLayoutParams", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsFollowImageViewHolder extends FollowFlowItemImageViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f57600f;
    @NotNull
    public final com.ss.android.ugc.aweme.forward.a.a S;
    @NotNull
    public final l T;
    @NotNull
    public final com.ss.android.ugc.aweme.newfollow.b.a U;

    /* renamed from: b  reason: collision with root package name */
    private final View f57601b = this.itemView.findViewById(C0906R.id.bhh);
    @NotNull
    public final FollowFeedLayout g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "widget", "Landroid/view/View;", "kotlin.jvm.PlatformType", "struct", "Lcom/ss/android/ugc/aweme/model/TextExtraStruct;", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements MentionTextView.e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowImageViewHolder f57603b;

        a(InsFollowImageViewHolder insFollowImageViewHolder) {
            this.f57603b = insFollowImageViewHolder;
        }

        public final void a(View view, TextExtraStruct textExtraStruct) {
            if (PatchProxy.isSupport(new Object[]{view, textExtraStruct}, this, f57602a, false, 62418, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, textExtraStruct}, this, f57602a, false, 62418, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
                return;
            }
            if (this.f57603b.n != null) {
                this.f57603b.n.a(view, textExtraStruct, this.f57603b.itemView, this.f57603b.j);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowImageViewHolder f57605b;

        b(InsFollowImageViewHolder insFollowImageViewHolder) {
            this.f57605b = insFollowImageViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57604a, false, 62419, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57604a, false, 62419, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FollowFeedTagLayout2 followFeedTagLayout2 = this.f57605b.mFeedTagLayout2;
            if (followFeedTagLayout2 != null) {
                followFeedTagLayout2.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowImageViewHolder f57607b;

        c(InsFollowImageViewHolder insFollowImageViewHolder) {
            this.f57607b = insFollowImageViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57606a, false, 62420, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57606a, false, 62420, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f57607b.n != null) {
                this.f57607b.n.d(this.f57607b.g, this.f57607b.itemView, this.f57607b.j);
            }
        }
    }

    public void H() {
    }

    public final boolean j() {
        return true;
    }

    public final void p() {
    }

    public final void ab() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62417, new Class[0], Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.aD()) {
            ac();
        } else {
            super.ab();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62407, new Class[0], Void.TYPE);
            return;
        }
        View view = this.mLineDivider;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62413, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        ae();
    }

    @NotNull
    public final List<String> B() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62409, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62409, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!ex.a(this.j) && ex.b(this.j)) {
            arrayList.add(X().getString(C0906R.string.dpt));
        }
        return arrayList;
    }

    public void ae() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62414, new Class[0], Void.TYPE);
            return;
        }
        FollowFeedTagLayout2 followFeedTagLayout2 = this.mFeedTagLayout2;
        if (followFeedTagLayout2 == null || followFeedTagLayout2.getVisibility() != 0) {
            TextView textView = this.mShoppingView;
            if (textView != null && textView.getVisibility() == 8) {
                View view = this.f57601b;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if ((r1.a() instanceof com.ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f57600f
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 62408(0xf3c8, float:8.7452E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f57600f
            r5 = 0
            r6 = 62408(0xf3c8, float:8.7452E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            android.widget.ImageView r1 = r9.q
            if (r1 == 0) goto L_0x007d
            boolean r1 = r9.H
            r2 = 8
            if (r1 != 0) goto L_0x0072
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x0036
            goto L_0x0072
        L_0x0036:
            com.ss.android.ugc.aweme.forward.a.a r1 = r9.B
            java.lang.String r3 = "mContainerStatusProvider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            java.lang.Object r1 = r1.a()
            boolean r1 = r1 instanceof com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter
            if (r1 != 0) goto L_0x0054
            com.ss.android.ugc.aweme.forward.a.a r1 = r9.B
            java.lang.String r3 = "mContainerStatusProvider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            java.lang.Object r1 = r1.a()
            boolean r1 = r1 instanceof com.ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter
            if (r1 == 0) goto L_0x0067
        L_0x0054:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            boolean r1 = com.ss.android.ugc.aweme.newfollow.a.b.c(r1)
            if (r1 != 0) goto L_0x0067
            android.widget.ImageView r1 = r9.q
            java.lang.String r2 = "mIvExtraBtn"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r0)
            return
        L_0x0067:
            android.widget.ImageView r0 = r9.q
            java.lang.String r1 = "mIvExtraBtn"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r2)
            goto L_0x007d
        L_0x0072:
            android.widget.ImageView r0 = r9.q
            java.lang.String r1 = "mIvExtraBtn"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r2)
            return
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolder.b():void");
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62404, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        if (aweme.getAuthor() != null) {
            if (com.ss.android.ugc.aweme.newfollow.a.b.c(this.j)) {
                ImageView imageView = this.mShareView;
                if (imageView == null) {
                    Intrinsics.throwNpe();
                }
                imageView.setImageResource(2130839644);
                TextView textView = this.mShareCountView;
                if (textView == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(textView, "mShareCountView!!");
                textView.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.mShareView;
            if (imageView2 == null) {
                Intrinsics.throwNpe();
            }
            imageView2.setImageResource(2130839302);
            TextView textView2 = this.mShareCountView;
            if (textView2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mShareCountView!!");
            textView2.setVisibility(0);
        }
    }

    public void t() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62412, new Class[0], Void.TYPE);
            return;
        }
        super.t();
        TextView textView = this.mShoppingView;
        if (textView != null && textView.getVisibility() == 0) {
            TextView textView2 = this.mShoppingView;
            if (textView2 != null) {
                textView2.setClickable(false);
            }
            View view = this.f57601b;
            if (view != null) {
                view.setOnClickListener(new c(this));
            }
        }
    }

    public void u() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62411, new Class[0], Void.TYPE);
            return;
        }
        super.u();
        FollowFeedTagLayout2 followFeedTagLayout2 = this.mFeedTagLayout2;
        if (followFeedTagLayout2 != null && followFeedTagLayout2.getVisibility() == 0) {
            View view = this.f57601b;
            if (view != null) {
                view.setOnClickListener(new b(this));
            }
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62405, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        if (aweme.isShowForwardEntrance()) {
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.M()) {
                v.a((View) this.mForwardLayout, 0);
                return;
            }
        }
        v.a((View) this.mForwardLayout, 8);
    }

    public final void E_() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62415, new Class[0], Void.TYPE);
            return;
        }
        Context X = X();
        Aweme aweme = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String d2 = eo.d(X, aweme.getCreateTime() * 1000);
        Aweme aweme2 = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
        if (!TextUtils.isEmpty(aweme2.getOpenPlatformName())) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append("  ");
            Aweme aweme3 = this.j;
            Intrinsics.checkExpressionValueIsNotNull(aweme3, "mAweme");
            sb.append(aweme3.getOpenPlatformName());
            d2 = sb.toString();
        }
        TextView textView = this.mCreateTimeView;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mCreateTimeView");
        textView.setText(X().getString(C0906R.string.afy, new Object[]{d2}));
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f57600f, false, 62410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57600f, false, 62410, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            Aweme aweme = this.j;
            Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
            if (!aweme.isHashTag()) {
                com.ss.android.ugc.aweme.newfollow.a.b.h(this.j);
            }
        }
        this.mDescView.setMaxSize(PulishTitle.MAX_WORDS);
        Aweme aweme2 = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
        String desc = aweme2.getDesc();
        if (!TextUtils.isEmpty(desc)) {
            SpannableString f2 = f(desc);
            MentionTextView mentionTextView = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView, "mDescView");
            mentionTextView.setText(f2);
            MentionTextView mentionTextView2 = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView2, "mDescView");
            mentionTextView2.setVisibility(0);
            MentionTextView mentionTextView3 = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView3, "mDescView");
            mentionTextView3.setSpanSize(UIUtils.sp2px(X(), 15.0f));
            this.mDescView.setOnSpanClickListener(new a(this));
            MentionTextView mentionTextView4 = this.mDescView;
            Aweme aweme3 = this.j;
            Intrinsics.checkExpressionValueIsNotNull(aweme3, "mAweme");
            List<TextExtraStruct> textExtra = aweme3.getTextExtra();
            AbTestManager.a();
            mentionTextView4.a(textExtra, (MentionTextView.d) new f(true));
            MentionTextView mentionTextView5 = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView5, "mDescView");
            mentionTextView5.setMovementMethod(LinkMovementMethod.getInstance());
            MentionTextView mentionTextView6 = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView6, "mDescView");
            MentionTextView mentionTextView7 = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView7, "mDescView");
            mentionTextView6.setHighlightColor(mentionTextView7.getResources().getColor(C0906R.color.a7l));
            return;
        }
        MentionTextView mentionTextView8 = this.mDescView;
        Intrinsics.checkExpressionValueIsNotNull(mentionTextView8, "mDescView");
        mentionTextView8.setVisibility(8);
    }

    public void a(@Nullable View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4;
        ViewStub viewStub4;
        ViewStub viewStub5;
        View view5;
        ViewStub viewStub6;
        if (PatchProxy.isSupport(new Object[]{view}, this, f57600f, false, 62406, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57600f, false, 62406, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View view6 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(C0906R.layout.a5b);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(C0906R.layout.a4g);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(C0906R.layout.a41);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        } else {
            view4 = null;
        }
        a(view4, 12.0f, 0.0f, 0.0f, 0.0f);
        if (view != null) {
            viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwz);
        } else {
            viewStub4 = null;
        }
        if (viewStub4 != null) {
            viewStub4.setLayoutResource(C0906R.layout.a5_);
        }
        if (viewStub4 != null) {
            viewStub4.inflate();
        }
        if (view != null) {
            viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwk);
        } else {
            viewStub5 = null;
        }
        if (viewStub5 != null) {
            viewStub5.setLayoutResource(C0906R.layout.a5a);
        }
        if (viewStub5 != null) {
            view5 = viewStub5.inflate();
        } else {
            view5 = null;
        }
        a(view5, 16.0f);
        if (view != null) {
            viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwg);
        } else {
            viewStub6 = null;
        }
        if (viewStub6 != null) {
            viewStub6.setLayoutResource(C0906R.layout.a57);
        }
        if (viewStub6 != null) {
            view6 = viewStub6.inflate();
        }
        a(view6, 0.0f, 4.0f);
    }

    public void a(@Nullable View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57600f, false, 62416, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57600f, false, 62416, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            int screenWidth = UIUtils.getScreenWidth(X());
            float f2 = ((float) i2) / ((float) i);
            iArr[0] = screenWidth;
            if (f2 > 1.2533333f) {
                iArr[1] = (int) (((float) screenWidth) * 1.2533333f);
            } else {
                iArr[1] = (int) (((float) screenWidth) * f2);
            }
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsFollowImageViewHolder(@NotNull FollowFeedLayout followFeedLayout, @NotNull com.ss.android.ugc.aweme.forward.a.a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        super(followFeedLayout, aVar, lVar, aVar2);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        this.g = followFeedLayout;
        this.S = aVar;
        this.T = lVar;
        this.U = aVar2;
        FollowFeedCommentLayout followFeedCommentLayout = this.mCommentLayout;
        if (followFeedCommentLayout != null) {
            followFeedCommentLayout.setDisplayType(3);
        }
    }
}