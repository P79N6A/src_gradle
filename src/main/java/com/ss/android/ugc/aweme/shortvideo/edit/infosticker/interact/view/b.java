package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010,\u001a\u00020-H\u0003J\u0012\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101J\b\u00102\u001a\u00020-H\u0002J\u000e\u00103\u001a\u00020-2\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020-2\u0006\u00104\u001a\u000205R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/view/FakeFeedView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "groupBottomLine", "Landroid/view/View;", "getGroupBottomLine", "()Landroid/view/View;", "setGroupBottomLine", "(Landroid/view/View;)V", "groupRightLine", "getGroupRightLine", "setGroupRightLine", "ivOriginMusicCover", "Lcom/ss/android/ugc/aweme/base/ui/CircleImageView;", "getIvOriginMusicCover", "()Lcom/ss/android/ugc/aweme/base/ui/CircleImageView;", "setIvOriginMusicCover", "(Lcom/ss/android/ugc/aweme/base/ui/CircleImageView;)V", "mAvatarView", "Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;", "getMAvatarView", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;", "setMAvatarView", "(Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;)V", "mMusicCoverView", "getMMusicCoverView", "setMMusicCoverView", "tvMusic", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getTvMusic", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "setTvMusic", "(Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;)V", "tvName", "getTvName", "setTvName", "bindUserData", "", "getDisplayName", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "initView", "showBottomLineView", "show", "", "showRightLineView", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67320a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private View f67321b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private View f67322c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private AvatarWithBorderView f67323d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private CircleImageView f67324e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private CircleImageView f67325f;
    @Nullable
    private DmtTextView g;
    @Nullable
    private DmtTextView h;

    @Nullable
    public final View getGroupBottomLine() {
        return this.f67322c;
    }

    @Nullable
    public final View getGroupRightLine() {
        return this.f67321b;
    }

    @Nullable
    public final CircleImageView getIvOriginMusicCover() {
        return this.f67325f;
    }

    @Nullable
    public final AvatarWithBorderView getMAvatarView() {
        return this.f67323d;
    }

    @Nullable
    public final CircleImageView getMMusicCoverView() {
        return this.f67324e;
    }

    @Nullable
    public final DmtTextView getTvMusic() {
        return this.h;
    }

    @Nullable
    public final DmtTextView getTvName() {
        return this.g;
    }

    public final void setGroupBottomLine(@Nullable View view) {
        this.f67322c = view;
    }

    public final void setGroupRightLine(@Nullable View view) {
        this.f67321b = view;
    }

    public final void setIvOriginMusicCover(@Nullable CircleImageView circleImageView) {
        this.f67325f = circleImageView;
    }

    public final void setMAvatarView(@Nullable AvatarWithBorderView avatarWithBorderView) {
        this.f67323d = avatarWithBorderView;
    }

    public final void setMMusicCoverView(@Nullable CircleImageView circleImageView) {
        this.f67324e = circleImageView;
    }

    public final void setTvMusic(@Nullable DmtTextView dmtTextView) {
        this.h = dmtTextView;
    }

    public final void setTvName(@Nullable DmtTextView dmtTextView) {
        this.g = dmtTextView;
    }

    @Nullable
    private String a(@Nullable User user) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user}, this, f67320a, false, 77049, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, this, f67320a, false, 77049, new Class[]{User.class}, String.class);
        }
        String str2 = null;
        if (a.b()) {
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (user != null) {
                    str2 = user.getShortId();
                }
            } else if (user != null) {
                str2 = user.getUniqueId();
            }
        } else if (user != null) {
            str2 = user.getNickname();
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (a.a()) {
            return "tiktok";
        }
        return "抖音";
    }

    public final void b(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67320a, false, 77046, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67320a, false, 77046, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f67322c;
        if (view != null) {
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67320a, false, 77045, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67320a, false, 77045, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f67321b;
        if (view != null) {
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        UrlModel urlModel;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f67320a, false, 77047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67320a, false, 77047, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aqt, this, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…w_fake_feed, this, false)");
        this.f67321b = inflate.findViewById(C0906R.id.alu);
        this.f67322c = inflate.findViewById(C0906R.id.alj);
        this.f67323d = (AvatarWithBorderView) inflate.findViewById(C0906R.id.dp2);
        this.f67324e = (CircleImageView) inflate.findViewById(C0906R.id.boa);
        this.f67325f = (CircleImageView) inflate.findViewById(C0906R.id.bvc);
        this.g = (DmtTextView) inflate.findViewById(C0906R.id.df7);
        this.h = (DmtTextView) inflate.findViewById(C0906R.id.dey);
        AvatarWithBorderView avatarWithBorderView = this.f67323d;
        if (avatarWithBorderView != null) {
            avatarWithBorderView.setBorderColor(C0906R.color.bc);
        }
        View view = this.f67321b;
        if (view != null) {
            view.setVisibility(4);
        }
        addView(inflate);
        if (PatchProxy.isSupport(new Object[0], this, f67320a, false, 77048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67320a, false, 77048, new Class[0], Void.TYPE);
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        Intrinsics.checkExpressionValueIsNotNull(iUserService, "service");
        User currentUser = iUserService.getCurrentUser();
        UrlModel urlModel2 = null;
        if (currentUser != null) {
            urlModel = currentUser.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (urlModel != null) {
            c.a((RemoteImageView) this.f67323d, currentUser.getAvatarThumb(), (int) UIUtils.dip2Px(getContext(), 49.0f), (int) UIUtils.dip2Px(getContext(), 49.0f));
        } else {
            c.a((RemoteImageView) this.f67323d, com.ss.android.ugc.aweme.base.model.a.a(2130839027));
        }
        DmtTextView dmtTextView = this.g;
        if (dmtTextView != null) {
            dmtTextView.setText("@" + a(currentUser));
        }
        c.a(this.f67325f, currentUser != null ? currentUser.getAvatarThumb() : urlModel2, 27, 27);
        c.a((RemoteImageView) this.f67324e, 2130839026);
        if (a.c()) {
            DmtTextView dmtTextView2 = this.h;
            if (dmtTextView2 != null) {
                StringBuilder sb = new StringBuilder("@");
                sb.append(a(currentUser));
                sb.append(" ");
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                sb.append(context2.getResources().getString(C0906R.string.bkm));
                dmtTextView2.setText(sb.toString());
            }
            return;
        }
        DmtTextView dmtTextView3 = this.h;
        if (dmtTextView3 != null) {
            StringBuilder sb2 = new StringBuilder();
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            sb2.append(context3.getResources().getString(C0906R.string.bkm));
            sb2.append(" - ");
            sb2.append(a(currentUser));
            dmtTextView3.setText(sb2.toString());
        }
    }
}
