package com.ss.android.ugc.aweme.im.sdk.chat;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.group.a;
import com.ss.android.ugc.aweme.im.sdk.group.view.GroupTipsDialog;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.ao;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0016J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0017J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/GroupChatPanel;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "view", "Landroid/view/View;", "groupSessionInfo", "Lcom/ss/android/ugc/aweme/im/sdk/chat/GroupSessionInfo;", "(Landroid/arch/lifecycle/LifecycleOwner;Landroid/view/View;Lcom/ss/android/ugc/aweme/im/sdk/chat/GroupSessionInfo;)V", "mLogBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "addGroupGreetEmoji", "", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "emojis", "", "Lcom/ss/android/ugc/aweme/im/sdk/resources/model/Emoji;", "initParams", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "refreshData", "showCreateTipsDialog", "groupCheckMsg", "Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupCheckMsg;", "showGroupGreetEmoji", "", "updateTitleBar", "titleBar", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupChatPanel extends BaseChatPanel {
    public static ChangeQuickRedirect s;
    public static final a u = new a((byte) 0);
    public final d t;
    private final StringBuilder v = new StringBuilder();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/GroupChatPanel$Companion;", "", "()V", "MAX_LOG_LENGTH", "", "MAX_TITLE_LENGTH", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/chat/GroupChatPanel$addGroupGreetEmoji$1", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "Lcom/bytedance/im/core/model/Conversation;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b> {
        public final void a(@Nullable j jVar) {
        }

        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(GroupChatPanel groupChatPanel) {
            super(1);
            this.this$0 = groupChatPanel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 50302, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 50302, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.this$0.t.setGroupRole(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "emojis", "", "Lcom/ss/android/ugc/aweme/im/sdk/resources/model/Emoji;", "kotlin.jvm.PlatformType", "", "run", "com/ss/android/ugc/aweme/im/sdk/chat/GroupChatPanel$refreshData$1$1"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements com.ss.android.ugc.aweme.base.a<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.im.core.d.b f50212b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GroupChatPanel f50213c;

        d(com.bytedance.im.core.d.b bVar, GroupChatPanel groupChatPanel) {
            this.f50212b = bVar;
            this.f50213c = groupChatPanel;
        }

        public final /* synthetic */ void run(Object obj) {
            boolean z;
            Map<String, String> map;
            List list = (List) obj;
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{list}, this, f50211a, false, 50303, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f50211a, false, 50303, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                GroupChatPanel groupChatPanel = this.f50213c;
                com.bytedance.im.core.d.b bVar = this.f50212b;
                if (PatchProxy.isSupport(new Object[]{bVar, list}, groupChatPanel, GroupChatPanel.s, false, 50300, new Class[]{com.bytedance.im.core.d.b.class, List.class}, Void.TYPE)) {
                    GroupChatPanel groupChatPanel2 = groupChatPanel;
                    PatchProxy.accessDispatch(new Object[]{bVar, list}, groupChatPanel2, GroupChatPanel.s, false, 50300, new Class[]{com.bytedance.im.core.d.b.class, List.class}, Void.TYPE);
                    return;
                }
                SayHelloContent sayHelloContent = new SayHelloContent();
                sayHelloContent.setEmoji(list);
                n a2 = new n.a().a(bVar).a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR).a(l.a(sayHelloContent)).a();
                Intrinsics.checkExpressionValueIsNotNull(a2, AdvanceSetting.NETWORK_TYPE);
                a2.setMsgStatus(2);
                ad.b(a2);
                com.bytedance.im.core.d.e eVar = new com.bytedance.im.core.d.e(bVar.getConversationId());
                com.bytedance.im.core.d.f settingInfo = bVar.getSettingInfo();
                if (settingInfo != null) {
                    map = settingInfo.getExt();
                } else {
                    map = null;
                }
                if (map != null && !map.isEmpty()) {
                    z2 = false;
                }
                if (z2) {
                    map = new LinkedHashMap<>();
                }
                map.put("a:s_awe_greet_msg", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                eVar.a(map, (com.bytedance.im.core.a.a.b) new b());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.group.a.b $groupCheckMsg;
        final /* synthetic */ GroupChatPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GroupChatPanel groupChatPanel, com.ss.android.ugc.aweme.im.sdk.group.a.b bVar) {
            super(1);
            this.this$0 = groupChatPanel;
            this.$groupCheckMsg = bVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 50304, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 50304, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
            List<IMUser> invalidMembers = this.$groupCheckMsg.getInvalidMembers();
            if (invalidMembers != null) {
                com.ss.android.ugc.aweme.im.sdk.group.a a2 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
                String conversationId = this.this$0.t.getConversationId();
                Iterable<IMUser> iterable = invalidMembers;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (IMUser uid : iterable) {
                    arrayList.add(uid.getUid());
                }
                a2.c(conversationId, (List) arrayList);
            }
            Context context = this.this$0.f50174d;
            Context context2 = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
            com.bytedance.ies.dmt.ui.d.a.a(context, context2.getResources().getString(C0906R.string.asr)).a();
            z.a("start", "group_agree", this.$groupCheckMsg.getInvalidMembers(), "confirm");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.group.a.b $groupCheckMsg;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.ss.android.ugc.aweme.im.sdk.group.a.b bVar) {
            super(1);
            this.$groupCheckMsg = bVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 50305, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 50305, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            z.a("start", "group_agree", this.$groupCheckMsg.getInvalidMembers(), "cancel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/chat/GroupChatPanel$updateTitleBar$3", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar$OnTitlebarClickListener;", "onLeftClick", "", "onRightClick", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatPanel f50215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.im.core.d.b f50216c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f50214a, false, 50306, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50214a, false, 50306, new Class[0], Void.TYPE);
                return;
            }
            this.f50215b.f50175e.finish();
            z.i(this.f50215b.t.getConversationId(), "group");
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50214a, false, 50307, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50214a, false, 50307, new Class[0], Void.TYPE);
                return;
            }
            com.bytedance.im.core.d.b bVar = this.f50216c;
            if (bVar != null) {
                if (!bVar.isMember()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f50215b.f50175e, (int) C0906R.string.awr).a();
                } else if (com.ss.android.ugc.aweme.im.sdk.group.b.a.a(bVar)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f50215b.f50175e, (int) C0906R.string.as2).a();
                } else {
                    GroupChatDetailActivity.a aVar = GroupChatDetailActivity.j;
                    Context context = this.f50215b.f50175e;
                    if (PatchProxy.isSupport(new Object[]{context, bVar}, aVar, GroupChatDetailActivity.a.f51377a, false, 51971, new Class[]{Context.class, com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                        Object[] objArr = {context, bVar};
                        GroupChatDetailActivity.a aVar2 = aVar;
                        PatchProxy.accessDispatch(objArr, aVar2, GroupChatDetailActivity.a.f51377a, false, 51971, new Class[]{Context.class, com.bytedance.im.core.d.b.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(context, "context");
                        Intrinsics.checkParameterIsNotNull(bVar, "conversation");
                        Intent intent = new Intent(context, GroupChatDetailActivity.class);
                        intent.putExtra("conversation", bVar);
                        context.startActivity(intent);
                    }
                }
            }
        }

        g(GroupChatPanel groupChatPanel, com.bytedance.im.core.d.b bVar) {
            this.f50215b = groupChatPanel;
            this.f50216c = bVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    @android.annotation.SuppressLint({"CheckResult"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = s
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 50296(0xc478, float:7.048E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = s
            r5 = 0
            r6 = 50296(0xc478, float:7.048E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.b()
            com.bytedance.im.core.d.d r1 = com.bytedance.im.core.d.d.a()
            com.ss.android.ugc.aweme.im.sdk.chat.d r2 = r11.t
            java.lang.String r2 = r2.getConversationId()
            com.bytedance.im.core.d.b r1 = r1.a((java.lang.String) r2)
            if (r1 == 0) goto L_0x00a0
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = s
            r6 = 0
            r7 = 50299(0xc47b, float:7.0484E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.im.core.d.b> r4 = com.bytedance.im.core.d.b.class
            r8[r0] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r11
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0070
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = s
            r7 = 0
            r8 = 50299(0xc47b, float:7.0484E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.im.core.d.b> r2 = com.bytedance.im.core.d.b.class
            r9[r0] = r2
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0093
        L_0x0070:
            com.bytedance.im.core.d.f r3 = r1.getSettingInfo()
            if (r3 == 0) goto L_0x0085
            java.util.Map r3 = r3.getExt()
            if (r3 == 0) goto L_0x0085
            java.lang.String r4 = "a:s_awe_greet_msg"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0086
        L_0x0085:
            r3 = 0
        L_0x0086:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "1"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0093
            r0 = 1
        L_0x0093:
            if (r0 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$d r0 = new com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$d
            r0.<init>(r1, r11)
            com.ss.android.ugc.aweme.base.a r0 = (com.ss.android.ugc.aweme.base.a) r0
            com.ss.android.ugc.aweme.im.sdk.utils.r.a((com.ss.android.ugc.aweme.base.a<java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>>) r0)
        L_0x009f:
            return
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel.b():void");
    }

    public final void a() {
        GroupTipsDialog groupTipsDialog;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 50295, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 50295, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a().a(this.t.getConversationId());
        com.ss.android.ugc.aweme.im.sdk.group.a a2 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
        String conversationId = this.t.getConversationId();
        String obj = com.ss.android.ugc.aweme.im.sdk.utils.d.b().toString();
        Function1 cVar = new c(this);
        if (PatchProxy.isSupport(new Object[]{conversationId, obj, cVar}, a2, com.ss.android.ugc.aweme.im.sdk.group.a.f51527a, false, 52147, new Class[]{String.class, String.class, Function1.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.im.sdk.group.a aVar = a2;
            PatchProxy.accessDispatch(new Object[]{conversationId, obj, cVar}, aVar, com.ss.android.ugc.aweme.im.sdk.group.a.f51527a, false, 52147, new Class[]{String.class, String.class, Function1.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(conversationId, "conversationId");
            Intrinsics.checkParameterIsNotNull(obj, "uid");
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            new com.bytedance.im.core.d.e(conversationId).a(conversationId, obj, (com.bytedance.im.core.a.a.b<m>) new a.f<m>(cVar));
        }
        com.ss.android.ugc.aweme.im.sdk.group.a.b groupCheckMessage = this.t.getGroupCheckMessage();
        if (groupCheckMessage != null) {
            if (PatchProxy.isSupport(new Object[]{groupCheckMessage}, this, s, false, 50298, new Class[]{com.ss.android.ugc.aweme.im.sdk.group.a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{groupCheckMessage}, this, s, false, 50298, new Class[]{com.ss.android.ugc.aweme.im.sdk.group.a.b.class}, Void.TYPE);
            } else {
                Context context = this.f50174d;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                GroupTipsDialog.a aVar2 = new GroupTipsDialog.a(context);
                aVar2.f51641f = new e(this, groupCheckMessage);
                List<IMUser> invalidMembers = groupCheckMessage.getInvalidMembers();
                if (invalidMembers != null) {
                    StringBuilder sb = new StringBuilder();
                    for (IMUser iMUser : invalidMembers) {
                        IMUser a3 = com.ss.android.ugc.aweme.im.sdk.d.e.a().a(iMUser.getUid());
                        if (a3 != null) {
                            sb.append(a3.getDisplayName());
                            sb.append("、");
                            if (a3 != null) {
                            }
                        }
                        sb.append(iMUser.getDisplayName());
                        sb.append("、");
                    }
                    if (sb.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        sb.setLength(sb.length() - 1);
                    }
                    if (invalidMembers.size() > 1) {
                        Context context2 = GlobalContext.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
                        context2.getResources().getString(C0906R.string.asp, new Object[]{sb.toString(), Integer.valueOf(invalidMembers.size())});
                    } else {
                        Context context3 = GlobalContext.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
                        context3.getResources().getString(C0906R.string.aso, new Object[]{sb.toString()});
                    }
                    Context context4 = GlobalContext.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context4, "GlobalContext.getContext()");
                    aVar2.f51637b = context4.getResources().getString(C0906R.string.aso, new Object[]{sb.toString()});
                }
                Context context5 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context5, "GlobalContext.getContext()");
                aVar2.f51638c = context5.getResources().getString(C0906R.string.ask);
                aVar2.f51640e = new f(groupCheckMessage);
                if (PatchProxy.isSupport(new Object[0], aVar2, GroupTipsDialog.a.f51636a, false, 52319, new Class[0], GroupTipsDialog.class)) {
                    groupTipsDialog = (GroupTipsDialog) PatchProxy.accessDispatch(new Object[0], aVar2, GroupTipsDialog.a.f51636a, false, 52319, new Class[0], GroupTipsDialog.class);
                } else {
                    groupTipsDialog = new GroupTipsDialog(aVar2);
                }
                groupTipsDialog.show();
            }
        }
    }

    public final void a(@NotNull ImTextTitleBar imTextTitleBar) {
        int i;
        ImTextTitleBar imTextTitleBar2 = imTextTitleBar;
        if (PatchProxy.isSupport(new Object[]{imTextTitleBar2}, this, s, false, 50297, new Class[]{ImTextTitleBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imTextTitleBar2}, this, s, false, 50297, new Class[]{ImTextTitleBar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(imTextTitleBar2, "titleBar");
        super.a(imTextTitleBar);
        com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(this.t.getConversationId());
        com.bytedance.im.core.d.d a3 = com.bytedance.im.core.d.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "ConversationListModel.inst()");
        Map<String, com.bytedance.im.core.d.b> e2 = a3.e();
        if (e2 != null) {
            i = e2.size();
        } else {
            i = 0;
        }
        this.v.append(i);
        this.v.append(" ");
        if (a2 == null) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("conversation_id", this.t.getConversationId());
            String sb = this.v.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb, "mLogBuilder.toString()");
            int length = sb.length();
            if (length > 200) {
                int i2 = length - 200;
                if (sb != null) {
                    String substring = sb.substring(i2, length);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    linkedHashMap.put("tag", substring);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                linkedHashMap.put("tag", sb);
            }
            linkedHashMap.put("error", String.valueOf(this.t.getEnterFrom()));
            com.ss.android.ugc.aweme.im.sdk.utils.d.b("empty_conversation", linkedHashMap);
        }
        if (a2 != null) {
            com.bytedance.im.core.d.c coreInfo = a2.getCoreInfo();
            if (coreInfo != null) {
                String name = coreInfo.getName();
                if (name != null) {
                    if (PatchProxy.isSupport(new Object[]{name, 15}, null, ao.f52484a, true, 53686, new Class[]{String.class, Integer.TYPE}, String.class)) {
                        name = (String) PatchProxy.accessDispatch(new Object[]{name, 15}, null, ao.f52484a, true, 53686, new Class[]{String.class, Integer.TYPE}, String.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(name, "$this$substringForGroupTitle");
                        if (ao.b(name, 0, name.length()) > 15) {
                            int a4 = ao.b(name, 0, name.length());
                            name = ao.a(name, 0, 11) + "..." + ao.a(name, a4 - 4, a4);
                        }
                    }
                } else {
                    name = null;
                }
                imTextTitleBar2.setTitle(name);
            }
            imTextTitleBar2.setTitleCount(GlobalContext.getContext().getString(C0906R.string.ast, new Object[]{Integer.valueOf(a2.getMemberCount())}));
            if (!a2.isMember() || com.ss.android.ugc.aweme.im.sdk.group.b.a.a(a2)) {
                View rightView = imTextTitleBar.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView, "titleBar.rightView");
                rightView.setVisibility(8);
            } else {
                View rightView2 = imTextTitleBar.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView2, "titleBar.rightView");
                rightView2.setVisibility(0);
            }
        }
        imTextTitleBar2.setOnTitlebarClickListener(new g(this, a2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupChatPanel(@NotNull LifecycleOwner lifecycleOwner, @NotNull View view, @NotNull d dVar) {
        super(lifecycleOwner, view, dVar);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "groupSessionInfo");
        this.t = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
        if (r0 == null) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r14, int r15, @org.jetbrains.annotations.Nullable android.content.Intent r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r10 = 0
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 1
            r0[r11] = r1
            r12 = 2
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = s
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 50301(0xc47d, float:7.0487E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = s
            r3 = 0
            r4 = 50301(0xc47d, float:7.0487E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005f:
            super.a(r14, r15, r16)
            r0 = 223(0xdf, float:3.12E-43)
            r1 = r14
            if (r1 != r0) goto L_0x009a
            r0 = 0
            if (r8 == 0) goto L_0x0071
            java.lang.String r1 = "key_at_member"
            java.io.Serializable r1 = r8.getSerializableExtra(r1)
            goto L_0x0072
        L_0x0071:
            r1 = r0
        L_0x0072:
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
            if (r2 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r0 = r1
        L_0x0078:
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            if (r0 == 0) goto L_0x0093
            java.lang.String r1 = r0.getNickName()
            java.lang.String r2 = "this.nickName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r2 = r0.getUid()
            java.lang.String r3 = "uid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r13.a(r1, r2)
            if (r0 != 0) goto L_0x009a
        L_0x0093:
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            r13.a(r0, r1)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel.a(int, int, android.content.Intent):void");
    }
}
