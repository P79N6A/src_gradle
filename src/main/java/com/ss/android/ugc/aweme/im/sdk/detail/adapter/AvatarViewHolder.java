package com.ss.android.ugc.aweme.im.sdk.detail.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.b.a.b;
import com.ss.android.ugc.aweme.im.sdk.d.d;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.n;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0006\u0010\u001f\u001a\u00020\u001bJ\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0014J\b\u0010\"\u001a\u00020\u001bH\u0014J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0007J\u0012\u0010&\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/AvatarViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMemberItem;", "parent", "Landroid/view/ViewGroup;", "layoutId", "", "(Landroid/view/ViewGroup;I)V", "mAlphaAnimTouchHandle", "Lcom/ss/android/ugc/aweme/im/sdk/utils/TouchAnimationUtils$AlphaAnimTouchHandle;", "mAvatarView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mCurIMMember", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "getMCurIMMember", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "setMCurIMMember", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;)V", "mNameView", "Landroid/widget/TextView;", "getMNameView", "()Landroid/widget/TextView;", "setMNameView", "(Landroid/widget/TextView;)V", "mWaitRefreshUid", "", "attachView", "", "bind", "imMember", "position", "detachView", "initEvents", "initListeners", "initViewRefs", "onUserUpdate", "event", "Lcom/ss/android/ugc/aweme/im/sdk/core/UserUpdateEvent;", "updateViewInfo", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class AvatarViewHolder extends BaseViewHolder<b> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f3375c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    protected TextView f3376d;

    /* renamed from: e  reason: collision with root package name */
    String f3377e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.b.a.a f3378f;
    private RemoteImageView g;
    private au.a h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AvatarViewHolder f51413b;

        a(AvatarViewHolder avatarViewHolder) {
            this.f51413b = avatarViewHolder;
        }

        public final void onClick(View view) {
            IMUser iMUser;
            if (PatchProxy.isSupport(new Object[]{view}, this, f51412a, false, 52035, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51412a, false, 52035, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = this.f51413b.f3378f;
            IMUser iMUser2 = null;
            if (aVar != null) {
                iMUser = aVar.getUser();
            } else {
                iMUser = null;
            }
            if (iMUser != null) {
                View view2 = this.f51413b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar2 = this.f51413b.f3378f;
                if (aVar2 != null) {
                    iMUser2 = aVar2.getUser();
                }
                if (iMUser2 == null) {
                    Intrinsics.throwNpe();
                }
                d.a(context, (IMContact) iMUser2, "group_setting");
            }
        }
    }

    @NotNull
    public final TextView d() {
        if (PatchProxy.isSupport(new Object[0], this, f3375c, false, 52025, new Class[0], TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, f3375c, false, 52025, new Class[0], TextView.class);
        }
        TextView textView = this.f3376d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameView");
        }
        return textView;
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3375c, false, 52027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3375c, false, 52027, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        View findViewById = this.itemView.findViewById(C0906R.id.b3_);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_member_avatar)");
        this.g = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(C0906R.id.dek);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_member_name)");
        this.f3376d = (TextView) findViewById2;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3375c, false, 52028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3375c, false, 52028, new Class[0], Void.TYPE);
            return;
        }
        au.a h2 = au.a.h();
        Intrinsics.checkExpressionValueIsNotNull(h2, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.h = h2;
        au.a aVar = this.h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        RemoteImageView remoteImageView = this.g;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarView");
        }
        viewArr[0] = remoteImageView;
        aVar.a(viewArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3375c
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52034(0xcb42, float:7.2915E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3375c
            r3 = 0
            r4 = 52034(0xcb42, float:7.2915E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.g
            if (r0 != 0) goto L_0x003b
            java.lang.String r1 = "mAvatarView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x003b:
            r1 = 0
            if (r10 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r10.getUser()
            if (r2 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getDisplayAvatar()
            goto L_0x004a
        L_0x0049:
            r2 = r1
        L_0x004a:
            com.ss.android.ugc.aweme.base.c.b(r0, r2)
            android.widget.TextView r0 = r9.f3376d
            if (r0 != 0) goto L_0x0056
            java.lang.String r2 = "mNameView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0056:
            if (r10 == 0) goto L_0x005c
            java.lang.String r1 = r10.getMemberDisplayName()
        L_0x005c:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.adapter.AvatarViewHolder.a(com.ss.android.ugc.aweme.im.sdk.chat.b.a.a):void");
    }

    @Subscribe
    public final void onUserUpdate(@NotNull n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f3375c, false, 52033, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f3375c, false, 52033, new Class[]{n.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar, "event");
        if (TextUtils.equals(this.f3377e, nVar.f51302a)) {
            IMUser b2 = e.a().b(nVar.f51302a);
            if (b2 != null) {
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = this.f3378f;
                if (aVar != null) {
                    IMUser user = aVar.getUser();
                    if (user != null) {
                        user.copy(b2);
                    }
                }
                a(this.f3378f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarViewHolder(@NotNull ViewGroup viewGroup, int i) {
        super(viewGroup, i);
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
    }

    public void a(@Nullable b bVar, int i) {
        Long l;
        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f3375c, false, 52029, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f3375c, false, 52029, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(bVar, i);
        if (bVar instanceof com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) {
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) bVar;
            this.f3378f = aVar;
            RemoteImageView remoteImageView = this.g;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatarView");
            }
            c.a(remoteImageView, 2130839027);
            if (aVar.getUser() == null) {
                m member = aVar.getMember();
                if (member != null) {
                    l = Long.valueOf(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                IMUser a2 = e.a().a(valueOf, false);
                if (a2 != null) {
                    aVar.setUser(a2);
                } else {
                    this.f3377e = valueOf;
                }
            }
            a(aVar);
            if (PatchProxy.isSupport(new Object[0], this, f3375c, false, 52030, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3375c, false, 52030, new Class[0], Void.TYPE);
                return;
            }
            RemoteImageView remoteImageView2 = this.g;
            if (remoteImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatarView");
            }
            remoteImageView2.setOnClickListener(new a(this));
        }
    }
}
