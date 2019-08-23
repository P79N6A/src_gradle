package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/RelativeUserAvatarListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDefaultAvatarSize", "mRightMargin", "mStartMargin", "bind", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "textView", "Landroid/widget/TextView;", "createItemView", "Landroid/view/View;", "relativeUserInfo", "Lcom/ss/android/ugc/aweme/profile/model/RelativeUserInfo;", "position", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelativeUserAvatarListView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49348a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49349b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49350c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49351d;

    @JvmOverloads
    public RelativeUserAvatarListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public RelativeUserAvatarListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View a(RelativeUserInfo relativeUserInfo, int i) {
        if (PatchProxy.isSupport(new Object[]{relativeUserInfo, Integer.valueOf(i)}, this, f49348a, false, 47463, new Class[]{RelativeUserInfo.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{relativeUserInfo, Integer.valueOf(i)}, this, f49348a, false, 47463, new Class[]{RelativeUserInfo.class, Integer.TYPE}, View.class);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.zs, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f49350c, this.f49350c);
        layoutParams.setMargins(this.f49349b * i, 0, 0, 0);
        inflate.setLayoutParams(layoutParams);
        c.b((RemoteImageView) inflate.findViewById(C0906R.id.hk), relativeUserInfo.getAvatar());
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return inflate;
    }

    public final void a(@NotNull User user, @Nullable TextView textView) {
        int i;
        if (PatchProxy.isSupport(new Object[]{user, textView}, this, f49348a, false, 47464, new Class[]{User.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, textView}, this, f49348a, false, 47464, new Class[]{User.class, TextView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        setVisibility(8);
        List<RelativeUserInfo> relativeUserInfos = user.getRelativeUserInfos();
        if (relativeUserInfos != null && !relativeUserInfos.isEmpty()) {
            setVisibility(0);
            removeAllViews();
            for (int size = relativeUserInfos.size() - 1; size >= 0; size--) {
                RelativeUserInfo relativeUserInfo = relativeUserInfos.get(size);
                Intrinsics.checkExpressionValueIsNotNull(relativeUserInfo, "this[i]");
                addView(a(relativeUserInfo, size));
            }
        }
        if (textView != null) {
            textView.setMaxLines(2);
            if (user.getRelativeUserInfos() == null) {
                i = 0;
            } else {
                i = user.getRelativeUserInfos().size();
            }
            if (!TextUtils.isEmpty(textView.getText())) {
                if (i > 0) {
                    textView.setPadding(0, (int) UIUtils.dip2Px(getContext(), 1.0f), 0, 0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(textView.getText());
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(this.f49350c + (this.f49349b * (i - 1)) + this.f49351d, 0), 0, spannableStringBuilder.length(), 17);
                    textView.setText(spannableStringBuilder);
                } else {
                    textView.setPadding(0, 0, 0, 0);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RelativeUserAvatarListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f49349b = (int) UIUtils.dip2Px(context, 16.0f);
        this.f49350c = (int) UIUtils.dip2Px(context, 20.0f);
        this.f49351d = (int) UIUtils.dip2Px(context, 1.0f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RelativeUserAvatarListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
