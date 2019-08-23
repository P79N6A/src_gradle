package com.ss.android.ugc.aweme.following.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.friends.ui.an;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/view/ConnectedRelationItemView;", "Lcom/ss/android/ugc/aweme/friends/ui/RecommendUserItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bind", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "displayDislikeIcon", "displayRemarkEditView", "followStatus", "displayUserInfo", "textView", "Landroid/widget/TextView;", "getLayoutResId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48165a;

    public final int getLayoutResId() {
        return C0906R.layout.zf;
    }

    public final void a(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f48165a, false, 45142, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f48165a, false, 45142, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        super.a(user);
    }

    public final void b(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f48165a, false, 45144, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f48165a, false, 45144, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        super.b(user);
        getMBlockUserIv().setVisibility(8);
    }

    public final void a(@NotNull TextView textView, @NotNull User user) {
        TextView textView2 = textView;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{textView2, user2}, this, f48165a, false, 45143, new Class[]{TextView.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, user2}, this, f48165a, false, 45143, new Class[]{TextView.class, User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "textView");
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        super.a(textView, user);
        textView2.setVisibility(8);
    }

    public final void a(@NotNull User user, int i) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i)}, this, f48165a, false, 45145, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i)}, this, f48165a, false, 45145, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        super.a(user, i);
        getMRemarkEdit().setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }
}
