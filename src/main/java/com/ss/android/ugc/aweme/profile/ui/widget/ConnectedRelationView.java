package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/widget/ConnectedRelationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDrawableIv", "Landroid/widget/ImageView;", "mMoreIv", "mRecommendReasonTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mRootView", "Landroid/view/View;", "bind", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "buildSecondRelationShip", "Landroid/text/SpannableStringBuilder;", "recommendReasonRelation", "", "showFirstRelationShip", "showSecondRelationShip", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62989a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f62990b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f62991c;

    /* renamed from: d  reason: collision with root package name */
    public final DmtTextView f62992d;

    /* renamed from: e  reason: collision with root package name */
    private final View f62993e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConnectedRelationView f62995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f62996c;

        public a(ConnectedRelationView connectedRelationView, User user) {
            this.f62995b = connectedRelationView;
            this.f62996c = user;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f62994a, false, 69666, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f62994a, false, 69666, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FollowRelationTabActivity.c cVar = FollowRelationTabActivity.f47976e;
            Context context = this.f62995b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            cVar.a(context, this.f62996c, "common_relation");
            r.a("enter_relation_tab", (Map) new d().a("enter_from", "others_homepage").a("enter_method", "click_relation").f34114b);
        }
    }

    @JvmOverloads
    public ConnectedRelationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ConnectedRelationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConnectedRelationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = View.inflate(context, C0906R.layout.aqh, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, R.…cted_relation_view, this)");
        this.f62993e = inflate;
        View findViewById = this.f62993e.findViewById(C0906R.id.aq8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.icon)");
        this.f62990b = (ImageView) findViewById;
        View findViewById2 = this.f62993e.findViewById(C0906R.id.bnh);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.more)");
        this.f62991c = (ImageView) findViewById2;
        View findViewById3 = this.f62993e.findViewById(C0906R.id.dh6);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.tv_recommend_reason)");
        this.f62992d = (DmtTextView) findViewById3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConnectedRelationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
