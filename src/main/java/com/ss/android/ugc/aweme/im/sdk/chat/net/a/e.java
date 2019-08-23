package com.ss.android.ugc.aweme.im.sdk.chat.net.a;

import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.ab;
import com.ss.android.ugc.aweme.im.sdk.chat.net.c;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/net/video/VideoMsgSender;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/net/BaseMessageSender;", "()V", "addCallback", "", "chatMessage", "Lcom/bytedance/im/core/model/Message;", "uploadCallback", "Lcom/ss/android/ugc/aweme/im/sdk/chat/net/video/EncryptedVideoUploadCallback;", "obtainUploadItem", "Lcom/ss/android/ugc/aweme/im/sdk/chat/net/UploadItem;", "content", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "removeCallback", "resend", "sendEncryptMessage", "sessionId", "", "videoParam", "Lcom/ss/android/ugc/aweme/im/sdk/chat/net/video/VideoParam;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50896a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f50897b = new e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    public static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f50899b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f50900c;

        public a(f fVar, String str) {
            this.f50899b = fVar;
            this.f50900c = str;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f50898a, false, 51357, new Class[0], Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[0], this, f50898a, false, 51357, new Class[0], Void.class);
            }
            StoryVideoContent.Companion companion = StoryVideoContent.Companion;
            f fVar = this.f50899b;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            StoryVideoContent obtain = companion.obtain(fVar);
            ba a2 = ba.a();
            List singletonList = Collections.singletonList(this.f50900c);
            if (obtain != null) {
                a2.a(singletonList, Collections.singletonList(obtain), (ba.a) new ba.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50901a;

                    public final void onSendFailure(@Nullable j jVar) {
                    }

                    public final void onSendSuccess(@Nullable n nVar) {
                    }

                    public final void onSend(@Nullable b bVar, @Nullable List<n> list) {
                        if (PatchProxy.isSupport(new Object[]{bVar, list}, this, f50901a, false, 51358, new Class[]{b.class, List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar, list}, this, f50901a, false, 51358, new Class[]{b.class, List.class}, Void.TYPE);
                            return;
                        }
                        if (list != null && list.size() > 0) {
                            for (n nVar : list) {
                                if (nVar.getMsgType() == 30) {
                                    e.f50897b.a(nVar);
                                }
                            }
                        }
                    }
                }, StoryVideoContent.Companion.obtainAttachmentList(obtain));
                return null;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent");
        }
    }

    private e() {
    }

    public final void b(@NotNull n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50896a, false, 51356, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50896a, false, 51356, new Class[]{n.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar2, "chatMessage");
        Object obj = this.f50916d.get(b.a(nVar));
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar != null) {
            bVar.f50887d = null;
        }
    }

    @NotNull
    public final ab a(@Nullable n nVar, @Nullable BaseContent baseContent) {
        n nVar2 = nVar;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{nVar2, baseContent2}, this, f50896a, false, 51353, new Class[]{n.class, BaseContent.class}, ab.class)) {
            return (ab) PatchProxy.accessDispatch(new Object[]{nVar2, baseContent2}, this, f50896a, false, 51353, new Class[]{n.class, BaseContent.class}, ab.class);
        } else if (baseContent2 instanceof StoryVideoContent) {
            return new b(this.h, (StoryVideoContent) baseContent2, nVar2);
        } else {
            ab a2 = super.a(nVar, baseContent);
            Intrinsics.checkExpressionValueIsNotNull(a2, "super.obtainUploadItem(chatMessage, content)");
            return a2;
        }
    }

    public final void a(@NotNull n nVar, @NotNull a aVar) {
        n nVar2 = nVar;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{nVar2, aVar2}, this, f50896a, false, 51355, new Class[]{n.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2, aVar2}, this, f50896a, false, 51355, new Class[]{n.class, a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar2, "chatMessage");
        Intrinsics.checkParameterIsNotNull(aVar2, "uploadCallback");
        Object obj = this.f50916d.get(b.a(nVar));
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar != null) {
            bVar.f50887d = aVar2;
        }
    }
}
