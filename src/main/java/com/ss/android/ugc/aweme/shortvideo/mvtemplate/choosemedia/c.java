package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MVMediaChoosePreProcess;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/IMediaChoosePreProcess;", "()V", "mvThemeChallenge", "Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "execute", "", "data", "Landroid/os/Bundle;", "fetchStickerChallenge", "challengeId", "", "getData", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68591a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f68592b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "avChallenge", "Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements b<com.ss.android.ugc.aweme.shortvideo.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f68593a;

        a(c cVar) {
            this.f68593a = cVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.f68593a.f68592b = (com.ss.android.ugc.aweme.shortvideo.c) obj;
        }
    }

    @Nullable
    public final Bundle a() {
        if (PatchProxy.isSupport(new Object[0], this, f68591a, false, 77931, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, f68591a, false, 77931, new Class[0], Bundle.class);
        } else if (this.f68592b == null) {
            return null;
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable("Key_mv_challenge", this.f68592b);
            return bundle;
        }
    }

    public final void a(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f68591a, false, 77930, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f68591a, false, 77930, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bundle2, "data");
        String string = bundle2.getString("Key_challenge_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "data.getString(MvThemeContants.KEY_CHALLENGE_ID)");
        if (PatchProxy.isSupport(new Object[]{string}, this, f68591a, false, 77932, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{string}, this, f68591a, false, 77932, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.port.in.a.f61122e.a(string, null, 0, 0, new a(this));
    }
}
