package com.ss.android.ugc.aweme.im.sdk.story;

import android.content.Context;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.b;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/story/StoryReplyManager;", "", "()V", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52428a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f52429b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J,\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/story/StoryReplyManager$Companion;", "", "()V", "KEY_STORY_STATE", "", "REQUEST_CODE_STORY_VIDEO", "STORY_STATE_UNEXPECTED", "", "VALUE_STORY_STATE_CHECKED", "VALUE_STORY_STATE_CHECKING", "VALUE_STORY_STATE_NET_ERROR", "sendReplyMessage", "", "context", "Landroid/content/Context;", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "baseContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "onSuccessTask", "Ljava/lang/Runnable;", "onFailureTask", "storyMessageReply", "storyStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "updateStoryCoverUnexpectedState", "storyMessage", "Lcom/bytedance/im/core/model/Message;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52430a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/story/StoryReplyManager$Companion$storyMessageReply$1", "Lcom/ss/android/ugc/aweme/im/sdk/abtest/ICommonSender;", "sendMsg", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.story.c$a$a  reason: collision with other inner class name */
        public static final class C0608a implements com.ss.android.ugc.aweme.im.sdk.a.c {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52431a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IShareService.ShareStruct f52432b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f52433c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Runnable f52434d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Runnable f52435e;

            public final void sendMsg() {
                if (PatchProxy.isSupport(new Object[0], this, f52431a, false, 53289, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52431a, false, 53289, new Class[0], Void.TYPE);
                    return;
                }
                BaseContent b2 = b.b(this.f52432b);
                if (b2 != null) {
                    IMUser iMUser = new IMUser();
                    iMUser.setUid(this.f52432b.uid4Share);
                    a aVar = c.f52429b;
                    Context context = this.f52433c;
                    Runnable runnable = this.f52434d;
                    Runnable runnable2 = this.f52435e;
                    if (PatchProxy.isSupport(new Object[]{context, iMUser, b2, runnable, runnable2}, aVar, a.f52430a, false, 53288, new Class[]{Context.class, IMUser.class, BaseContent.class, Runnable.class, Runnable.class}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{context, iMUser, b2, runnable, runnable2}, aVar2, a.f52430a, false, 53288, new Class[]{Context.class, IMUser.class, BaseContent.class, Runnable.class, Runnable.class}, Void.TYPE);
                        return;
                    }
                    ba.a().a(iMUser.getUid(), b2);
                    com.bytedance.ies.dmt.ui.d.a.a(context, (int) C0906R.string.axi, 0).a();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }

            public C0608a(IShareService.ShareStruct shareStruct, Context context, Runnable runnable, Runnable runnable2) {
                this.f52432b = shareStruct;
                this.f52433c = context;
                this.f52434d = runnable;
                this.f52435e = runnable2;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull n nVar) {
            n nVar2 = nVar;
            if (PatchProxy.isSupport(new Object[]{nVar2}, this, f52430a, false, 53286, new Class[]{n.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{nVar2}, this, f52430a, false, 53286, new Class[]{n.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(nVar2, "storyMessage");
            Map<String, String> localExt = nVar.getLocalExt();
            Intrinsics.checkExpressionValueIsNotNull(localExt, "storyMessage.localExt");
            localExt.put("story_state_unexpected", "story_state_unexpected");
            o.e(nVar);
        }
    }

    @JvmStatic
    public static final void a(@NotNull n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, null, f52428a, true, 53284, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, null, f52428a, true, 53284, new Class[]{n.class}, Void.TYPE);
            return;
        }
        f52429b.a(nVar2);
    }
}
