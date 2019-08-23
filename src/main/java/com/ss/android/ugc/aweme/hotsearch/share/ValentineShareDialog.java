package com.ss.android.ugc.aweme.hotsearch.share;

import android.app.Activity;
import android.content.Context;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.ck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0014¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/hotsearch/share/ValentineShareDialog;", "Lcom/ss/android/ugc/aweme/share/SimpleShareDialog;", "context", "Landroid/app/Activity;", "shareParams", "Lcom/ss/android/ugc/aweme/share/ShareParams;", "hitRankShareStruct", "Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;", "(Landroid/app/Activity;Lcom/ss/android/ugc/aweme/share/ShareParams;Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;)V", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "getShareParams", "()Lcom/ss/android/ugc/aweme/share/ShareParams;", "setShareParams", "(Lcom/ss/android/ugc/aweme/share/ShareParams;)V", "createBaseShares", "", "Lcom/douyin/baseshare/BaseShare;", "()[Lcom/douyin/baseshare/BaseShare;", "doShare", "", "baseShare", "isHideSecondLine", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ValentineShareDialog extends SimpleShareDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49793a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public Activity f49794b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public ck f49795c;
    private b k;

    public final boolean b() {
        return true;
    }

    @NotNull
    public final a[] c() {
        if (PatchProxy.isSupport(new Object[0], this, f49793a, false, 49792, new Class[0], a[].class)) {
            return (a[]) PatchProxy.accessDispatch(new Object[0], this, f49793a, false, 49792, new Class[0], a[].class);
        }
        IShareService iShareService = (IShareService) ServiceManager.get().getService(IShareService.class);
        ShareOrderService shareOrderService = (ShareOrderService) ServiceManager.get().getService(ShareOrderService.class);
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkExpressionValueIsNotNull(shareOrderService, "orderService");
        String[] imageShareList = shareOrderService.getImageShareList();
        Collections.addAll(arrayList, (String[]) Arrays.copyOf(imageShareList, imageShareList.length));
        arrayList.remove("chat_merge");
        a[] aVarArr = new a[arrayList.size()];
        int length = aVarArr.length;
        for (int i = 0; i < length; i++) {
            aVarArr[i] = iShareService.getShareChannel(this.h, (String) arrayList.get(i));
        }
        return aVarArr;
    }

    public final void a(@Nullable a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f49793a, false, 49793, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f49793a, false, 49793, new Class[]{a.class}, Void.TYPE);
        } else if (aVar != null) {
            if (aVar.a()) {
                Activity activity = this.f49794b;
                String d2 = aVar.d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "it.shareType");
                new a(activity, d2, this.k).show();
            } else {
                com.bytedance.ies.dmt.ui.d.a.c((Context) this.f49794b, aVar.c(), 0).a();
            }
            dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValentineShareDialog(@NotNull Activity activity, @NotNull ck ckVar, @NotNull b bVar) {
        super(activity, ckVar);
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(ckVar, "shareParams");
        Intrinsics.checkParameterIsNotNull(bVar, "hitRankShareStruct");
        this.f49794b = activity;
        this.f49795c = ckVar;
        this.k = bVar;
    }
}
