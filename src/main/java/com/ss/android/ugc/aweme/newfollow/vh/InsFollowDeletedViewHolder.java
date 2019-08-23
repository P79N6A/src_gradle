package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.vh.ForwardTextViewHolder;
import com.ss.android.ugc.aweme.longvideo.b.b;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.a.b;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0014J\u0012\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020\u0018H\u0014J\b\u0010*\u001a\u00020\u0018H\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowDeletedViewHolder;", "Lcom/ss/android/ugc/aweme/forward/vh/ForwardTextViewHolder;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "getDiggAwemeListener", "()Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "getItemViewInteractListener", "()Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "getProvider", "()Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "getScrollStateManager", "()Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "getView", "()Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "bindExtraView", "", "bindForwardView", "bindOriginDescView", "descView", "Lcom/ss/android/ugc/aweme/views/MentionTextView;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "bindShareView", "bindStatisticsView", "getExtraDialogString", "", "", "inflateStub", "root", "Landroid/view/View;", "isMomentStyle", "", "showTimeText", "updateDividerLine", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class InsFollowDeletedViewHolder extends ForwardTextViewHolder {
    public static ChangeQuickRedirect t;
    @NotNull
    public final FollowFeedLayout u;
    @NotNull
    public final com.ss.android.ugc.aweme.forward.a.a v;
    @NotNull
    public final l w;
    @NotNull
    public final BaseFollowViewHolder.a x;
    @NotNull
    public final com.ss.android.ugc.aweme.newfollow.b.a y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "widget", "Landroid/view/View;", "kotlin.jvm.PlatformType", "struct", "Lcom/ss/android/ugc/aweme/model/TextExtraStruct;", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements MentionTextView.e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowDeletedViewHolder f57599b;

        a(InsFollowDeletedViewHolder insFollowDeletedViewHolder) {
            this.f57599b = insFollowDeletedViewHolder;
        }

        public final void a(View view, TextExtraStruct textExtraStruct) {
            if (PatchProxy.isSupport(new Object[]{view, textExtraStruct}, this, f57598a, false, 62403, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, textExtraStruct}, this, f57598a, false, 62403, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
                return;
            }
            if (this.f57599b.f48318c != null) {
                this.f57599b.f48318c.a(view, textExtraStruct, this.f57599b.itemView, this.f57599b.f48319d);
            }
        }
    }

    public final boolean s() {
        return true;
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 62401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 62401, new Class[0], Void.TYPE);
            return;
        }
        C();
        E();
        D();
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 62399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 62399, new Class[0], Void.TYPE);
            return;
        }
        View view = this.mLineDivider;
        Intrinsics.checkExpressionValueIsNotNull(view, "mLineDivider");
        view.setVisibility(8);
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 62394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 62394, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.f48319d;
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

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 62396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 62396, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.f48319d;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        if (aweme.getAuthor() != null) {
            if (b.c(this.f48319d)) {
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

    @NotNull
    public final List<String> K() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 62398, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, t, false, 62398, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!ex.a(this.f48319d) && ex.b(this.f48319d)) {
            arrayList.add(c().getString(C0906R.string.dpt));
        }
        return arrayList;
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 62397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 62397, new Class[0], Void.TYPE);
            return;
        }
        if (this.mIvExtraBtn != null) {
            if (this.j || com.ss.android.g.a.a()) {
                ImageView imageView = this.mIvExtraBtn;
                if (imageView == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(imageView, "mIvExtraBtn!!");
                imageView.setVisibility(8);
                return;
            }
            com.ss.android.ugc.aweme.forward.a.a b2 = b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "containerProvider");
            if (!(b2.a() instanceof FollowFeedAdapter)) {
                com.ss.android.ugc.aweme.forward.a.a b3 = b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "containerProvider");
                if (!(b3.a() instanceof UserStateFeedAdapter)) {
                    ImageView imageView2 = this.mIvExtraBtn;
                    if (imageView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "mIvExtraBtn!!");
                    imageView2.setVisibility(8);
                }
            }
            if (b.c(this.f48319d)) {
                ImageView imageView3 = this.mIvExtraBtn;
                if (imageView3 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "mIvExtraBtn!!");
                imageView3.setVisibility(8);
                return;
            }
            ImageView imageView4 = this.mIvExtraBtn;
            if (imageView4 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "mIvExtraBtn!!");
            imageView4.setVisibility(0);
        }
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 62402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 62402, new Class[0], Void.TYPE);
            return;
        }
        Context c2 = c();
        Aweme aweme = this.f48319d;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String d2 = eo.d(c2, aweme.getCreateTime() * 1000);
        Aweme aweme2 = this.f48319d;
        Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
        if (!TextUtils.isEmpty(aweme2.getOpenPlatformName())) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append("  ");
            Aweme aweme3 = this.f48319d;
            Intrinsics.checkExpressionValueIsNotNull(aweme3, "mAweme");
            sb.append(aweme3.getOpenPlatformName());
            d2 = sb.toString();
        }
        TextView textView = this.mCreateTimeView;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mCreateTimeView");
        textView.setText(c().getString(C0906R.string.afy, new Object[]{d2}));
    }

    public final void b(@Nullable View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4;
        ViewStub viewStub4;
        View view5;
        ViewStub viewStub5;
        if (PatchProxy.isSupport(new Object[]{view}, this, t, false, 62395, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, t, false, 62395, new Class[]{View.class}, Void.TYPE);
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
            viewStub3.setLayoutResource(C0906R.layout.a67);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        } else {
            view4 = null;
        }
        a(view4, 12.0f, 0.0f);
        if (view != null) {
            viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        } else {
            viewStub4 = null;
        }
        if (viewStub4 != null) {
            viewStub4.setLayoutResource(C0906R.layout.a5a);
        }
        if (viewStub4 != null) {
            view5 = viewStub4.inflate();
        } else {
            view5 = null;
        }
        a(view5, 16.0f);
        if (view != null) {
            viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        } else {
            viewStub5 = null;
        }
        if (viewStub5 != null) {
            viewStub5.setLayoutResource(C0906R.layout.a57);
        }
        if (viewStub5 != null) {
            view6 = viewStub5.inflate();
        }
        a(view6, 0.0f, 4.0f);
    }

    public final void b(@NotNull MentionTextView mentionTextView, @Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{mentionTextView, aweme}, this, t, false, 62400, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionTextView, aweme}, this, t, false, 62400, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mentionTextView, "descView");
        if (aweme != null) {
            if (!com.ss.android.g.a.a() && !aweme.isHashTag()) {
                b.h(aweme);
            }
            if (com.ss.android.ugc.aweme.longvideo.b.b.f53880b.b(aweme)) {
                b.a aVar = com.ss.android.ugc.aweme.longvideo.b.b.f53880b;
                Context c2 = c();
                Intrinsics.checkExpressionValueIsNotNull(c2, "context");
                String format = String.format("%s%s", Arrays.copyOf(new Object[]{H(), aweme.getDesc()}, 2));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                String str = this.i;
                Intrinsics.checkExpressionValueIsNotNull(str, "mEventType");
                mentionTextView.setText(aVar.a(c2, format, aweme, str, 0));
            } else {
                String format2 = String.format("%s%s", Arrays.copyOf(new Object[]{H(), aweme.getDesc()}, 2));
                Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(format, *args)");
                mentionTextView.setText(format2);
            }
            mentionTextView.setVisibility(0);
            g.a((TextView) mentionTextView);
            mentionTextView.setSpanSize(UIUtils.sp2px(c(), 15.0f));
            mentionTextView.setOnSpanClickListener(new a(this));
            List<TextExtraStruct> a2 = a(aweme);
            AbTestManager.a();
            mentionTextView.a(a2, (MentionTextView.d) new f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsFollowDeletedViewHolder(@NotNull FollowFeedLayout followFeedLayout, @NotNull com.ss.android.ugc.aweme.forward.a.a aVar, @NotNull l lVar, @NotNull BaseFollowViewHolder.a aVar2, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, lVar, aVar2, aVar3);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        Intrinsics.checkParameterIsNotNull(aVar3, "diggAwemeListener");
        this.u = followFeedLayout;
        this.v = aVar;
        this.w = lVar;
        this.x = aVar2;
        this.y = aVar3;
        FollowFeedCommentLayout followFeedCommentLayout = this.mCommentLayout;
        if (followFeedCommentLayout != null) {
            followFeedCommentLayout.setDisplayType(3);
        }
    }
}
