package com.ss.android.ugc.aweme.im;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.a.e;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/im/CommercializeShareDialogItemCallbackWrapper;", "Lcom/ss/android/ugc/aweme/im/service/callbacks/ShareDialogItemCallBack;", "context", "Landroid/content/Context;", "target", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/im/service/callbacks/ShareDialogItemCallBack;Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getContext", "()Landroid/content/Context;", "ctx", "kotlin.jvm.PlatformType", "getTarget", "()Lcom/ss/android/ugc/aweme/im/service/callbacks/ShareDialogItemCallBack;", "onCancel", "", "onItemClick", "shareChannel", "", "onPreShare", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50046a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Context f50047b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final e f50048c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Aweme f50049d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f50050e;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f50046a, false, 50017, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50046a, false, 50017, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (c.L(this.f50049d)) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f50050e, (int) C0906R.string.ca).a();
            return false;
        } else {
            e eVar = this.f50048c;
            if (eVar != null) {
                return eVar.a();
            }
            return true;
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50046a, false, 50015, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50046a, false, 50015, new Class[]{String.class}, Void.TYPE);
            return;
        }
        e eVar = this.f50048c;
        if (eVar != null) {
            eVar.a(str);
        }
        if (c.t(this.f50049d)) {
            g.x(this.f50050e, this.f50049d);
        }
    }

    public a(@Nullable Context context, @Nullable e eVar, @Nullable Aweme aweme) {
        this.f50047b = context;
        this.f50048c = eVar;
        this.f50049d = aweme;
        this.f50050e = this.f50047b == null ? GlobalContext.getContext() : this.f50047b;
    }
}
