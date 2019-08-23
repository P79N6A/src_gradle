package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.b.b;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemVideoForwardViewHolder;
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
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0014J\b\u0010 \u001a\u00020\u0012H\u0014J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020\u0012H\u0014J\b\u0010'\u001a\u00020\u0012H\u0014J\b\u0010(\u001a\u00020\u0012H\u0014J\"\u0010)\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010#2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0014R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardVideoViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/adapter/FollowFlowItemVideoForwardViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/feed/DialogController;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "liveContentLayout", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bindDescView", "", "descView", "Lcom/ss/android/ugc/aweme/views/MentionTextView;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "bindExtraView", "bindForwardView", "bindOriginDescView", "bindShareView", "bindStatisticsView", "expandVideo", "getExtraDialogString", "", "", "handleOriginHeaderClick", "inflateStub", "root", "Landroid/view/View;", "isMomentStyle", "", "setOriginContentRoundCorner", "showTimeText", "updateDividerLine", "updateOriginContentLayoutParams", "contentView", "mediaWidth", "", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsForwardVideoViewHolder extends FollowFlowItemVideoForwardViewHolder {
    public static ChangeQuickRedirect w;
    private final DmtTextView u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "widget", "Landroid/view/View;", "kotlin.jvm.PlatformType", "struct", "Lcom/ss/android/ugc/aweme/model/TextExtraStruct;", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements MentionTextView.e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsForwardVideoViewHolder f57643b;

        a(InsForwardVideoViewHolder insForwardVideoViewHolder) {
            this.f57643b = insForwardVideoViewHolder;
        }

        public final void a(View view, TextExtraStruct textExtraStruct) {
            if (PatchProxy.isSupport(new Object[]{view, textExtraStruct}, this, f57642a, false, 62579, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, textExtraStruct}, this, f57642a, false, 62579, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
                return;
            }
            if (this.f57643b.f48318c != null) {
                this.f57643b.f48318c.a(view, textExtraStruct, this.f57643b.itemView, this.f57643b.f48319d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "widget", "Landroid/view/View;", "kotlin.jvm.PlatformType", "struct", "Lcom/ss/android/ugc/aweme/model/TextExtraStruct;", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements MentionTextView.e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsForwardVideoViewHolder f57645b;

        b(InsForwardVideoViewHolder insForwardVideoViewHolder) {
            this.f57645b = insForwardVideoViewHolder;
        }

        public final void a(View view, TextExtraStruct textExtraStruct) {
            if (PatchProxy.isSupport(new Object[]{view, textExtraStruct}, this, f57644a, false, 62580, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, textExtraStruct}, this, f57644a, false, 62580, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
                return;
            }
            if (this.f57645b.f48318c != null) {
                this.f57645b.f48318c.a(view, textExtraStruct, this.f57645b.itemView, this.f57645b.f48319d);
            }
        }
    }

    public final void I() {
    }

    public final boolean s() {
        return true;
    }

    public final void O() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62576, new Class[0], Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.aD()) {
            P();
        } else {
            super.O();
        }
    }

    public final void T() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62577, new Class[0], Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.aD()) {
            P();
        } else {
            super.T();
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62567, new Class[0], Void.TYPE);
            return;
        }
        C();
        E();
        D();
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62570, new Class[0], Void.TYPE);
            return;
        }
        View view = this.mLineDivider;
        Intrinsics.checkExpressionValueIsNotNull(view, "mLineDivider");
        view.setVisibility(8);
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62573, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62573, new Class[0], Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62568, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.f48319d;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        if (aweme.getAuthor() != null) {
            if (com.ss.android.ugc.aweme.newfollow.a.b.c(this.f48319d)) {
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
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62569, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, w, false, 62569, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!ex.a(this.f48319d) && ex.b(this.f48319d)) {
            arrayList.add(c().getString(C0906R.string.dpt));
        }
        return arrayList;
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62566, new Class[0], Void.TYPE);
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
            if (com.ss.android.ugc.aweme.newfollow.a.b.c(this.f48319d)) {
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
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62575, new Class[0], Void.TYPE);
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

    public void b(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, w, false, 62565, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, w, false, 62565, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        Intrinsics.checkExpressionValueIsNotNull(viewStub, "headStub");
        viewStub.setLayoutResource(C0906R.layout.a5b);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        Intrinsics.checkExpressionValueIsNotNull(viewStub2, "descStub");
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        Intrinsics.checkExpressionValueIsNotNull(viewStub3, "contentStub");
        viewStub3.setLayoutResource(C0906R.layout.a5e);
        a(viewStub3.inflate(), 12.0f, 0.0f, 0.0f, 0.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        Intrinsics.checkExpressionValueIsNotNull(viewStub4, "bottomStub");
        viewStub4.setLayoutResource(C0906R.layout.a5a);
        a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        Intrinsics.checkExpressionValueIsNotNull(viewStub5, "commentStub");
        viewStub5.setLayoutResource(C0906R.layout.a57);
        a(viewStub5.inflate(), 0.0f, 4.0f);
    }

    public final void a(@NotNull MentionTextView mentionTextView, @Nullable Aweme aweme) {
        MentionTextView mentionTextView2 = mentionTextView;
        if (PatchProxy.isSupport(new Object[]{mentionTextView2, aweme}, this, w, false, 62572, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionTextView2, aweme}, this, w, false, 62572, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mentionTextView2, "descView");
        if (aweme != null) {
            if (!com.ss.android.g.a.a() && !aweme.isHashTag()) {
                com.ss.android.ugc.aweme.newfollow.a.b.h(aweme);
            }
            if (!TextUtils.isEmpty(aweme.getDesc())) {
                mentionTextView2.setText(aweme.getDesc());
                mentionTextView2.setVisibility(0);
                g.a((TextView) mentionTextView2);
                mentionTextView2.setSpanSize(UIUtils.sp2px(c(), 15.0f));
                mentionTextView2.setHighlightColor(mentionTextView.getResources().getColor(C0906R.color.a7l));
                mentionTextView2.setOnSpanClickListener(new a(this));
                List<TextExtraStruct> textExtra = aweme.getTextExtra();
                AbTestManager.a();
                mentionTextView2.a(textExtra, (MentionTextView.d) new f(true));
                mentionTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            mentionTextView2.setVisibility(8);
        }
    }

    public final void b(@NotNull MentionTextView mentionTextView, @Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{mentionTextView, aweme}, this, w, false, 62571, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionTextView, aweme}, this, w, false, 62571, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mentionTextView, "descView");
        if (aweme != null) {
            if (!com.ss.android.g.a.a() && !aweme.isHashTag()) {
                com.ss.android.ugc.aweme.newfollow.a.b.h(aweme);
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
            mentionTextView.setOnSpanClickListener(new b(this));
            List<TextExtraStruct> a2 = a(aweme);
            AbTestManager.a();
            mentionTextView.a(a2, (MentionTextView.d) new f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void a(@Nullable View view, int i, int i2) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, w, false, 62574, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, w, false, 62574, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        float f2 = ((float) i2) / ((float) i);
        int screenWidth = UIUtils.getScreenWidth(c());
        int dip2Px = (int) UIUtils.dip2Px(c(), 16.0f);
        if (f2 > 1.2533333f) {
            iArr[1] = (int) (((float) screenWidth) * 1.2533333f);
            str = "vertical";
        } else {
            iArr[1] = (int) (((float) screenWidth) * f2);
            str = "horizontal";
        }
        if (view2 != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = screenWidth;
            marginLayoutParams.height = iArr[1];
            marginLayoutParams.setMargins(0, dip2Px, 0, 0);
            Intrinsics.checkExpressionValueIsNotNull(String.format("calculateSize: type=%s, srcWidth=%d, srcHeight=%d, dstWidth=%d, dstHeight=%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])}, 5)), "java.lang.String.format(format, *args)");
            view2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsForwardVideoViewHolder(@NotNull FollowFeedLayout followFeedLayout, @NotNull com.ss.android.ugc.aweme.forward.a.a aVar, @NotNull d dVar, @NotNull l lVar, @NotNull BaseFollowViewHolder.a aVar2, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3, true);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        Intrinsics.checkParameterIsNotNull(aVar3, "diggAwemeListener");
        View findViewById = followFeedLayout.findViewById(C0906R.id.dbz);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_forward)");
        this.u = (DmtTextView) findViewById;
        this.u.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57640a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ InsForwardVideoViewHolder f57641b;

            {
                this.f57641b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57640a, false, 62578, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57640a, false, 62578, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f57641b.T();
            }
        });
        FollowFeedCommentLayout followFeedCommentLayout = this.mCommentLayout;
        if (followFeedCommentLayout != null) {
            followFeedCommentLayout.setDisplayType(3);
        }
        ViewGroup viewGroup = this.mMusicLayout;
        Intrinsics.checkExpressionValueIsNotNull(viewGroup, "mMusicLayout");
        viewGroup.setVisibility(8);
    }
}
