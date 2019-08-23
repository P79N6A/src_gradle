package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J4\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00160\fH\u0016J<\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010\u0019\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0016J*\u0010\u0019\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016J2\u0010\u0019\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J:\u0010\u0019\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0016¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/ProfileService;", "Lcom/ss/android/ugc/aweme/story/api/IProfileService;", "()V", "blockUserStory", "", "context", "Landroid/content/Context;", "uid", "", "blockType", "", "callback", "Lcom/ss/android/ugc/aweme/story/api/Callback;", "changeFollowStatus", "status", "gotoChat", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "openStoryChat", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "message", "", "isStoryReplySelf", "", "openStorySettingPage", "enterType", "theme", "topMargin", "isSubPage", "layout", "Landroid/widget/FrameLayout;", "openUserDetailPage", "secUid", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class w implements com.ss.android.ugc.aweme.story.api.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34290a;

    /* renamed from: b  reason: collision with root package name */
    public static int f34291b = 15;

    /* renamed from: c  reason: collision with root package name */
    public static final a f34292c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/ProfileService$Companion;", "", "()V", "IMAGE_FEED", "", "getIMAGE_FEED", "()I", "setIMAGE_FEED", "(I)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/os/Message;", "kotlin.jvm.PlatformType", "handleMsg"}, k = 3, mv = {1, 1, 15})
    static final class b implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.a f34294b;

        b(com.ss.android.ugc.aweme.story.api.a aVar) {
            this.f34294b = aVar;
        }

        public final void handleMsg(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f34293a, false, 23655, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f34293a, false, 23655, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            int i = message.what;
            Object obj = message.obj;
            if (i == 32) {
                if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    com.ss.android.ugc.aweme.story.api.a aVar = this.f34294b;
                    String errorMsg = ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg();
                    Intrinsics.checkExpressionValueIsNotNull(errorMsg, "obj.errorMsg");
                    aVar.a(errorMsg);
                } else if (obj instanceof Exception) {
                    com.ss.android.ugc.aweme.story.api.a aVar2 = this.f34294b;
                    String string = GlobalContext.getContext().getString(C0906R.string.bga);
                    Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…g(R.string.network_error)");
                    aVar2.a(string);
                } else if (obj instanceof BlockStruct) {
                    this.f34294b.a(Integer.valueOf(((BlockStruct) obj).blockStatus));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/app/services/ProfileService$changeFollowStatus$1", "Lcom/ss/android/ugc/aweme/profile/presenter/IFollowView;", "onFollowFail", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFollowSuccess", "followStatus", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.a f34296b;

        c(com.ss.android.ugc.aweme.story.api.a aVar) {
            this.f34296b = aVar;
        }

        public final void onFollowFail(@Nullable Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f34295a, false, 23657, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f34295a, false, 23657, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            this.f34296b.a("");
        }

        public final void onFollowSuccess(@Nullable FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f34295a, false, 23656, new Class[]{FollowStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f34295a, false, 23656, new Class[]{FollowStatus.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.api.a aVar = this.f34296b;
            if (followStatus2 != null) {
                i = followStatus2.followStatus;
            }
            aVar.a(Integer.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.a f34298b;

        d(com.ss.android.ugc.aweme.story.api.a aVar) {
            this.f34298b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34297a, false, 23658, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34297a, false, 23658, new Class[0], Void.TYPE);
                return;
            }
            this.f34298b.a("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.a f34300b;

        e(com.ss.android.ugc.aweme.story.api.a aVar) {
            this.f34300b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34299a, false, 23659, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34299a, false, 23659, new Class[0], Void.TYPE);
                return;
            }
            this.f34300b.a("");
        }
    }

    public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f34290a, false, 23645, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f34290a, false, 23645, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str3, "uid");
        Intrinsics.checkParameterIsNotNull(str4, "secUid");
        h a2 = h.a();
        p a3 = p.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeRuntime.inst()");
        Activity e2 = a3.e();
        a2.a(e2, j.a("aweme://user/profile/" + str3).a("sec_user_id", str4).a());
    }

    public final void a(@NotNull String str, int i, @NotNull com.ss.android.ugc.aweme.story.api.a<Integer> aVar) {
        String str2 = str;
        com.ss.android.ugc.aweme.story.api.a<Integer> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), aVar2}, this, f34290a, false, 23647, new Class[]{String.class, Integer.TYPE, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), aVar2}, this, f34290a, false, 23647, new Class[]{String.class, Integer.TYPE, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        i iVar = new i();
        iVar.a(new c(aVar2));
        iVar.a(new i.a().a(str2).a(i).a());
    }

    public final void a(@Nullable Context context, @Nullable User user) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, user}, this, f34290a, false, 23650, new Class[]{Context.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user}, this, f34290a, false, 23650, new Class[]{Context.class, User.class}, Void.TYPE);
        } else if (context2 != null && user != null) {
            com.ss.android.ugc.aweme.im.b.a().startChat(context2, com.ss.android.ugc.aweme.im.b.a(user));
        }
    }

    public final void a(@Nullable Context context, @Nullable LifeStory lifeStory, @Nullable String str, @NotNull com.ss.android.ugc.aweme.story.api.a<Object> aVar) {
        com.ss.android.ugc.aweme.story.api.a<Object> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, lifeStory, str, aVar2}, this, f34290a, false, 23648, new Class[]{Context.class, LifeStory.class, String.class, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE)) {
            Object[] objArr = {context, lifeStory, str, aVar2};
            PatchProxy.accessDispatch(objArr, this, f34290a, false, 23648, new Class[]{Context.class, LifeStory.class, String.class, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        a(context, lifeStory, str, aVar, false);
    }

    public final void a(@NotNull Context context, @NotNull String str, int i, @NotNull com.ss.android.ugc.aweme.story.api.a<Integer> aVar) {
        Context context2 = context;
        String str2 = str;
        com.ss.android.ugc.aweme.story.api.a<Integer> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i), aVar2}, this, f34290a, false, 23646, new Class[]{Context.class, String.class, Integer.TYPE, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i), aVar2}, this, f34290a, false, 23646, new Class[]{Context.class, String.class, Integer.TYPE, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        BlockApi.a(new WeakHandler(new b(aVar2)), str2, i, 1);
    }

    public final void a(@Nullable Context context, int i, int i2, int i3, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), 0, (byte) 0}, this, f34290a, false, 23653, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), 0, (byte) 0}, this, f34290a, false, 23653, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (context != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).startStorySettingActivity(v.a(context), i, i2, 0, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable android.content.Context r25, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.LifeStory r26, @org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.story.api.a<java.lang.Object> r28, boolean r29) {
        /*
            r24 = this;
            r0 = r25
            r2 = r27
            r3 = r28
            r4 = 5
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r26
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            java.lang.Byte r6 = java.lang.Byte.valueOf(r29)
            r16 = 4
            r5[r16] = r6
            com.meituan.robust.ChangeQuickRedirect r7 = f34290a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r6 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
            r10[r13] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r14] = r6
            java.lang.Class<com.ss.android.ugc.aweme.story.api.a> r6 = com.ss.android.ugc.aweme.story.api.a.class
            r10[r15] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r10[r16] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r8 = 0
            r9 = 23649(0x5c61, float:3.314E-41)
            r6 = r24
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x007a
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r26
            r5[r14] = r2
            r5[r15] = r3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r29)
            r5[r16] = r0
            com.meituan.robust.ChangeQuickRedirect r19 = f34290a
            r20 = 0
            r21 = 23649(0x5c61, float:3.314E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r1 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.a> r1 = com.ss.android.ugc.aweme.story.api.a.class
            r0[r15] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r16] = r1
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r5
            r18 = r24
            r22 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x007a:
            java.lang.String r4 = "callback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            if (r26 == 0) goto L_0x013a
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x013a
            if (r0 != 0) goto L_0x008e
            goto L_0x013a
        L_0x008e:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = new com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct
            r4.<init>()
            java.lang.String r5 = r26.getStoryId()
            r4.itemIdStr = r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r26.getAuthor()
            java.lang.String r6 = "story.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.String r5 = r5.getUid()
            r4.uid4Share = r5
            int r5 = r26.getAwemeType()
            int r6 = f34291b
            r7 = 0
            if (r5 != r6) goto L_0x00d8
            com.ss.android.ugc.aweme.feed.model.ImageInfo r5 = r26.getImageInfo()
            if (r5 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getLabelLarge()
        L_0x00bb:
            r4.videoCover = r7
            com.ss.android.ugc.aweme.feed.model.ImageInfo r5 = r26.getImageInfo()
            if (r5 == 0) goto L_0x00c8
            int r5 = r5.getWidth()
            goto L_0x00c9
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            r4.awemeWidth = r5
            com.ss.android.ugc.aweme.feed.model.ImageInfo r1 = r26.getImageInfo()
            if (r1 == 0) goto L_0x00d5
            int r12 = r1.getHeight()
        L_0x00d5:
            r4.awemeHeight = r12
            goto L_0x010d
        L_0x00d8:
            com.ss.android.ugc.aweme.feed.model.Video r5 = r26.getVideo()
            if (r5 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.getOriginCover()
            if (r5 != 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r7 = r5
            goto L_0x00f1
        L_0x00e7:
            com.ss.android.ugc.aweme.feed.model.Video r5 = r26.getVideo()
            if (r5 == 0) goto L_0x00f1
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCover()
        L_0x00f1:
            r4.videoCover = r7
            com.ss.android.ugc.aweme.feed.model.Video r5 = r26.getVideo()
            if (r5 == 0) goto L_0x00fe
            int r5 = r5.getWidth()
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            r4.awemeWidth = r5
            com.ss.android.ugc.aweme.feed.model.Video r1 = r26.getVideo()
            if (r1 == 0) goto L_0x010b
            int r12 = r1.getHeight()
        L_0x010b:
            r4.awemeHeight = r12
        L_0x010d:
            r4.shareText = r2
            if (r29 == 0) goto L_0x0114
            java.lang.String r1 = "story_self_reply"
            goto L_0x0116
        L_0x0114:
            java.lang.String r1 = "story_reply"
        L_0x0116:
            r4.itemType = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "share_struct"
            java.io.Serializable r4 = (java.io.Serializable) r4
            r1.putSerializable(r2, r4)
            com.ss.android.ugc.aweme.im.service.IIMService r2 = com.ss.android.ugc.aweme.im.b.a()
            com.ss.android.ugc.aweme.app.services.w$d r4 = new com.ss.android.ugc.aweme.app.services.w$d
            r4.<init>(r3)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            com.ss.android.ugc.aweme.app.services.w$e r5 = new com.ss.android.ugc.aweme.app.services.w$e
            r5.<init>(r3)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r2.storyMessageReply(r0, r1, r4, r5)
            return
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.services.w.a(android.content.Context, com.ss.android.ugc.aweme.story.api.model.LifeStory, java.lang.String, com.ss.android.ugc.aweme.story.api.a, boolean):void");
    }
}
