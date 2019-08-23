package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/NotInterestedAction;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionAction;", "actionsManager", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;", "(Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;)V", "mActionHandler", "Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;", "getMActionHandler", "()Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;", "setMActionHandler", "(Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;)V", "mShareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "getMShareStruct", "()Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "setMShareStruct", "(Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;)V", "doClick", "", "v", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n extends o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46783a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public p f46784b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public IShareService.ShareStruct f46785c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(@NotNull a aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "actionsManager");
        this.f46784b = aVar.f46754e;
        this.f46785c = aVar.f46755f;
    }

    public final void a(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46783a, false, 43467, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46783a, false, 43467, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        if (!TextUtils.isEmpty("dislike")) {
            this.f46784b.g = "long_press";
            this.f46784b.onAction(this.f46785c, "dislike");
        }
    }
}
