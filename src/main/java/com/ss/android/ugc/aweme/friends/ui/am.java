package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.common.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.d.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\rB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/RecommendFriendItemViewWithTag;", "Lcom/ss/android/ugc/aweme/friends/ui/RecommendFriendItemViewV2;", "context", "Landroid/content/Context;", "followClickMap", "Ljava/util/HashMap;", "", "", "(Landroid/content/Context;Ljava/util/HashMap;)V", "canBeRemoved", "(Landroid/content/Context;Ljava/util/HashMap;Z)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/util/HashMap;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/util/HashMap;Z)V", "mRelativeUserAvatars", "Lcom/ss/android/ugc/aweme/friends/ui/RelativeUserAvatarListView;", "kotlin.jvm.PlatformType", "mTagLayout", "Landroid/widget/LinearLayout;", "mTagLayoutManager", "Lcom/ss/android/ugc/aweme/profile/util/ProfileTagLayoutManagerImpl;", "mTagWidth", "getLayoutId", "setData", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "showRelativeUserAvatar", "textView", "Landroid/widget/TextView;", "showUserTag", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class am extends ak {
    public static ChangeQuickRedirect l;
    private final LinearLayout m = ((LinearLayout) findViewById(C0906R.id.czc));
    private final RelativeUserAvatarListView n = ((RelativeUserAvatarListView) findViewById(C0906R.id.cd2));
    private final int o = (UIUtils.getScreenWidth(getContext()) - ((int) UIUtils.dip2Px(getContext(), 185.0f)));
    private final r p = new r(this.m, this.o);

    public final int getLayoutId() {
        return C0906R.layout.zg;
    }

    public final void setData(@NotNull User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, l, false, 47423, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, l, false, 47423, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        super.setData(user);
        if (this.k == 0 || this.k == 1) {
            a(user, this.f49413f);
            a(this.f49411d, user);
            return;
        }
        TextView textView = this.f49413f;
        Intrinsics.checkExpressionValueIsNotNull(textView, "txtDesc");
        if (PatchProxy.isSupport(new Object[]{user, textView}, this, l, false, 47425, new Class[]{User.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, textView}, this, l, false, 47425, new Class[]{User.class, TextView.class}, Void.TYPE);
        } else {
            RelativeUserAvatarListView relativeUserAvatarListView = this.n;
            Intrinsics.checkExpressionValueIsNotNull(relativeUserAvatarListView, "mRelativeUserAvatars");
            relativeUserAvatarListView.setVisibility(0);
            textView.setMaxLines(2);
            a(user, this.f49413f);
            this.n.a(user, textView);
        }
        if (PatchProxy.isSupport(new Object[]{user}, this, l, false, 47424, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, l, false, 47424, new Class[]{User.class}, Void.TYPE);
        } else {
            this.p.a(user, this.o);
        }
        TextView textView2 = this.f49411d;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "txtFollowInfo");
        textView2.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am(@NotNull Context context, @NotNull HashMap<String, Boolean> hashMap, boolean z) {
        super(context, null, 0, hashMap, z);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hashMap, "followClickMap");
        setBackground(c.e(getContext()));
    }
}
