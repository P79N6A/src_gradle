package com.ss.android.ugc.aweme.im.sdk.chat;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.im.core.b.e.l;
import com.bytedance.im.core.d.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerMessageList;
import com.ss.android.ugc.aweme.im.sdk.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002'(B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleChatPanel;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel;", "Lcom/bytedance/im/core/internal/utils/WeakHandler$IHandler;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "view", "Landroid/view/View;", "currentSessionInfo", "Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleSessionInfo;", "(Landroid/arch/lifecycle/LifecycleOwner;Landroid/view/View;Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleSessionInfo;)V", "mCreateConversationTask", "Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleChatPanel$CreateConversationTask;", "mFollowBarHelper", "Lcom/ss/android/ugc/aweme/im/sdk/chat/FollowBarHelper;", "getMFollowBarHelper", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/FollowBarHelper;", "mFollowBarHelper$delegate", "Lkotlin/Lazy;", "mWeakHandler", "Lcom/bytedance/im/core/internal/utils/WeakHandler;", "handleMsg", "", "msg", "Landroid/os/Message;", "initMessageObserver", "messageObserver", "Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageHandle;", "onPause", "onResume", "refreshData", "refreshFollowBar", "sendUserAction", "action", "", "withExt", "", "updateTitleBar", "titleBar", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "Companion", "CreateConversationTask", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SingleChatPanel extends BaseChatPanel implements l.a {
    public static ChangeQuickRedirect s;
    static final /* synthetic */ KProperty[] t = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SingleChatPanel.class), "mFollowBarHelper", "getMFollowBarHelper()Lcom/ss/android/ugc/aweme/im/sdk/chat/FollowBarHelper;"))};
    public static final a v = new a((byte) 0);
    public final p u;
    private final l w = new l(this);
    private final Lazy x = LazyKt.lazy(new c(this));
    private final b y = new b(new WeakReference(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleChatPanel$Companion;", "", "()V", "FTC_NETWORK_ERROR_CODE", "", "WHAT_FETCH_STRANGER_MSG", "WHAT_QUERY_USER", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleChatPanel$CreateConversationTask;", "Ljava/lang/Runnable;", "chatPanel", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleChatPanel;", "(Ljava/lang/ref/WeakReference;)V", "run", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50268a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<SingleChatPanel> f50269b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f50268a, false, 50496, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50268a, false, 50496, new Class[0], Void.TYPE);
                return;
            }
            SingleChatPanel singleChatPanel = (SingleChatPanel) this.f50269b.get();
            if (singleChatPanel != null) {
                singleChatPanel.a(1, true);
            }
        }

        public b(@NotNull WeakReference<SingleChatPanel> weakReference) {
            Intrinsics.checkParameterIsNotNull(weakReference, "chatPanel");
            this.f50269b = weakReference;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/chat/FollowBarHelper;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<b> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SingleChatPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SingleChatPanel singleChatPanel) {
            super(0);
            this.this$0 = singleChatPanel;
        }

        @NotNull
        public final b invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50497, new Class[0], b.class)) {
                return new b(this.this$0.f50173c, this.this$0.u.getFromUser());
            }
            return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50497, new Class[0], b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/chat/SingleChatPanel$updateTitleBar$1", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar$OnTitlebarClickListener;", "onLeftClick", "", "onRightClick", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SingleChatPanel f50271b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f50270a, false, 50498, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50270a, false, 50498, new Class[0], Void.TYPE);
                return;
            }
            this.f50271b.f50175e.finish();
            z.i(this.f50271b.u.getConversationId(), PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
        }

        public final void b() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f50270a, false, 50499, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50270a, false, 50499, new Class[0], Void.TYPE);
                return;
            }
            IMUser fromUser = this.f50271b.u.getFromUser();
            if (fromUser != null) {
                FriendChatDetailActivity.a aVar = FriendChatDetailActivity.j;
                Activity activity = this.f50271b.f50175e;
                if (this.f50271b.u.getChatType() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (PatchProxy.isSupport(new Object[]{activity, fromUser, Byte.valueOf(z ? (byte) 1 : 0)}, aVar, FriendChatDetailActivity.a.f51372a, false, 51931, new Class[]{Activity.class, IMUser.class, Boolean.TYPE}, Void.TYPE)) {
                    FriendChatDetailActivity.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{activity, fromUser, Byte.valueOf(z)}, aVar2, FriendChatDetailActivity.a.f51372a, false, 51931, new Class[]{Activity.class, IMUser.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(activity, "context");
                    Intrinsics.checkParameterIsNotNull(fromUser, AllStoryActivity.f73306b);
                    Intent intent = new Intent(activity, FriendChatDetailActivity.class);
                    intent.putExtra("simple_uesr", fromUser);
                    intent.putExtra("is_stranger", z);
                    activity.startActivityForResult(intent, 1);
                    com.ss.android.ugc.aweme.im.sdk.d.a.a().f();
                }
            }
        }

        d(SingleChatPanel singleChatPanel) {
            this.f50271b = singleChatPanel;
        }
    }

    private final b c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 50487, new Class[0], b.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, s, false, 50487, new Class[0], b.class);
        } else {
            value = this.x.getValue();
        }
        return (b) value;
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 50491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 50491, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.u.getFromUser();
        a(2, false);
    }

    private final void d() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 50494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 50494, new Class[0], Void.TYPE);
            return;
        }
        IMUser fromUser = this.u.getFromUser();
        if (fromUser != null) {
            if (fromUser.getFollowStatus() != 0 || com.ss.android.ugc.aweme.im.sdk.utils.d.a(fromUser) || UserExtra.isDisableShowFollowBar(fromUser.getUid())) {
                c().a(8);
                return;
            }
            b c2 = c();
            boolean z = true;
            if (this.u.getEnterFrom() != 1) {
                z = false;
            }
            c2.j = z;
            c().i = this.u.getFromUserId();
            c().a(fromUser.getUid());
            c().a(0);
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 50490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 50490, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        d();
        this.u.getFromUser();
        new StringBuilder("chat fragment resume, ext: ").append(this.u.getChatExt());
        a(1, true);
    }

    public final void b() {
        String str;
        long j;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 50489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 50489, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        j jVar = j.f51270d;
        IMUser fromUser = this.u.getFromUser();
        IMUser fromUser2 = this.u.getFromUser();
        String str2 = null;
        if (fromUser2 != null) {
            str = fromUser2.getUid();
        } else {
            str = null;
        }
        String a2 = jVar.a(fromUser, str);
        Handler handler = this.w;
        IMUser fromUser3 = this.u.getFromUser();
        if (fromUser3 != null) {
            str2 = fromUser3.getUid();
        }
        r.a(handler, (CharSequence) str2, a2, 1);
        if (this.u.getChatType() == 1) {
            Handler handler2 = this.w;
            IMUser fromUser4 = this.u.getFromUser();
            if (fromUser4 != null) {
                String uid = fromUser4.getUid();
                if (uid != null) {
                    j = Long.parseLong(uid);
                    r.a(handler2, j, j.f51270d.b(this.u.getFromUser()), 0);
                }
            }
            j = 0;
            r.a(handler2, j, j.f51270d.b(this.u.getFromUser()), 0);
        }
    }

    public final void a(@NotNull j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, s, false, 50488, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, this, s, false, 50488, new Class[]{j.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(jVar2, "messageObserver");
        super.a(jVar);
        jVar2.f50670c = this.y;
    }

    public final void a(@NotNull Message message) {
        String str;
        if (PatchProxy.isSupport(new Object[]{message}, this, s, false, 50493, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, s, false, 50493, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(message, "msg");
        Object obj = message.obj;
        if (obj != null) {
            switch (message.what) {
                case 0:
                    if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                        UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.az5);
                        return;
                    }
                    if (obj instanceof StrangerMessageList) {
                        StrangerMessageList strangerMessageList = (StrangerMessageList) obj;
                        if (PatchProxy.isSupport(new Object[]{strangerMessageList}, this, BaseChatPanel.f50171a, false, 50208, new Class[]{StrangerMessageList.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strangerMessageList}, this, BaseChatPanel.f50171a, false, 50208, new Class[]{StrangerMessageList.class}, Void.TYPE);
                            break;
                        } else {
                            Intrinsics.checkParameterIsNotNull(strangerMessageList, "data");
                            this.k.a(strangerMessageList.toChatMessages());
                        }
                    }
                    return;
                case 1:
                    if (!(obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                        if (obj instanceof UserStruct) {
                            User user = ((UserStruct) obj).getUser();
                            if (user != null) {
                                this.u.setFromUser(IMUser.fromUser(user));
                                e.a().a(this.u.getFromUser());
                                d();
                                break;
                            } else {
                                com.ss.android.ugc.aweme.framework.a.a.a("IM Query User is null");
                                return;
                            }
                        }
                    } else if (((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorCode() == 2065) {
                        e a2 = e.a();
                        IMUser fromUser = this.u.getFromUser();
                        if (fromUser != null) {
                            str = fromUser.getUid();
                        } else {
                            str = null;
                        }
                        a2.c(str);
                        return;
                    }
                    break;
            }
        }
    }

    public final void a(@NotNull ImTextTitleBar imTextTitleBar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{imTextTitleBar}, this, s, false, 50492, new Class[]{ImTextTitleBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imTextTitleBar}, this, s, false, 50492, new Class[]{ImTextTitleBar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(imTextTitleBar, "titleBar");
        super.a(imTextTitleBar);
        IMUser fromUser = this.u.getFromUser();
        if (fromUser != null) {
            str = fromUser.getDisplayName();
        } else {
            str = null;
        }
        imTextTitleBar.setTitle(str);
        imTextTitleBar.setOnTitlebarClickListener(new d(this));
    }

    public final void a(int i, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, s, false, 50495, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, s, false, 50495, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!m.a()) {
            IMUser fromUser = this.u.getFromUser();
            if (fromUser != null) {
                CharSequence uid = fromUser.getUid();
                if (uid == null || uid.length() == 0) {
                    z2 = true;
                }
                if (!z2 && (fromUser.getCommerceUserLevel() != 0 || fromUser.isWithCommerceEntry())) {
                    com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(this.u.getConversationId());
                    if (a2 != null && !a2.isTemp()) {
                        r.a a3 = new r.a().a(i).a(a2);
                        if (z && this.u.getChatExt() != null) {
                            a3.a(this.u.getChatExt());
                        }
                        a3.a();
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleChatPanel(@NotNull LifecycleOwner lifecycleOwner, @NotNull View view, @NotNull p pVar) {
        super(lifecycleOwner, view, pVar);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(pVar, "currentSessionInfo");
        this.u = pVar;
    }
}
