package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.f.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000e\u001a\u00020\u00072\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonAction;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/IDislikeReasonView;", "actionsManager", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;", "(Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;)V", "mActionManager", "mobClickBlockVideos", "", "mobClickDislikeReason", "dislikeReasonVO", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonVO;", "onClick", "v", "Landroid/view/View;", "onDislikeReasonFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDislikeReasonSuccess", "reasonId", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46760a;

    /* renamed from: b  reason: collision with root package name */
    final a f46761b;

    public final void a(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f46760a, false, 43441, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f46760a, false, 43441, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
    }

    public c(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "actionsManager");
        this.f46761b = aVar;
    }

    public final void a(@NotNull String str) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{str}, this, f46760a, false, 43440, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f46760a, false, 43440, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "reasonId");
        k kVar = this.f46761b.f46751b;
        String str2 = null;
        if (kVar != null) {
            context = kVar.getContext();
        } else {
            context = null;
        }
        a.a((Context) v.a(context), (int) C0906R.string.a65).a();
        Aweme aweme = this.f46761b.f46752c;
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        bg.a(new g(str2));
    }
}
