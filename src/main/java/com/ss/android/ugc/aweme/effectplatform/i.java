package com.ss.android.ugc.aweme.effectplatform;

import com.google.common.a.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.f;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\bJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/MonitoredFetchCategoryListListener;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchCategoryEffectListener;", "panel", "", "count", "", "cursor", "delegate", "(Ljava/lang/String;IILcom/ss/android/ugc/effectmanager/effect/listener/IFetchCategoryEffectListener;)V", "getCount", "()I", "getCursor", "getDelegate", "()Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchCategoryEffectListener;", "getPanel", "()Ljava/lang/String;", "stopwatch", "Lcom/google/common/base/Stopwatch;", "onFail", "", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onSuccess", "response", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43851a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f43852f = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f43853b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43854c;

    /* renamed from: d  reason: collision with root package name */
    public final int f43855d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final f f43856e;
    private final q g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/MonitoredFetchCategoryListListener$Companion;", "", "()V", "wrap", "Lcom/ss/android/ugc/aweme/effectplatform/MonitoredFetchCategoryListListener;", "panel", "", "count", "", "cursor", "listener", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchCategoryEffectListener;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43857a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final i a(@NotNull String str, int i, int i2, @NotNull f fVar) {
            String str2 = str;
            f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), fVar2}, this, f43857a, false, 38996, new Class[]{String.class, Integer.TYPE, Integer.TYPE, f.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), fVar2}, this, f43857a, false, 38996, new Class[]{String.class, Integer.TYPE, Integer.TYPE, f.class}, i.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "panel");
            Intrinsics.checkParameterIsNotNull(fVar2, "listener");
            i iVar = new i(str, i, i2, fVar, (byte) 0);
            return iVar;
        }
    }

    @JvmStatic
    @NotNull
    public static final i a(@NotNull String str, int i, int i2, @NotNull f fVar) {
        String str2 = str;
        f fVar2 = fVar;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), fVar2}, null, f43851a, true, 38995, new Class[]{String.class, Integer.TYPE, Integer.TYPE, f.class}, i.class)) {
            return f43852f.a(str2, i, i2, fVar2);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), fVar2}, null, f43851a, true, 38995, new Class[]{String.class, Integer.TYPE, Integer.TYPE, f.class}, i.class);
    }

    public final void a(@Nullable c cVar) {
        String str;
        int i;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43851a, false, 38994, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f43851a, false, 38994, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (cVar == null) {
            i = -2;
            str = "unknown error";
        } else {
            i = cVar.f77315a;
            str = cVar.f77316b;
            Intrinsics.checkExpressionValueIsNotNull(str, "e.msg");
        }
        n.a("sticker_list_error_rate", 1, new bi().a("errorCode", Integer.valueOf(i)).a("errorDesc", str).a("count", Integer.valueOf(this.f43854c)).a("cursor", Integer.valueOf(this.f43855d)).a("panel", this.f43853b).b());
        f fVar = this.f43856e;
        if (fVar != null) {
            fVar.a(cVar);
        }
    }

    public final void a(@Nullable CategoryPageModel categoryPageModel) {
        if (PatchProxy.isSupport(new Object[]{categoryPageModel}, this, f43851a, false, 38993, new Class[]{CategoryPageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{categoryPageModel}, this, f43851a, false, 38993, new Class[]{CategoryPageModel.class}, Void.TYPE);
            return;
        }
        long a2 = this.g.a(TimeUnit.MILLISECONDS);
        f fVar = this.f43856e;
        if (fVar != null) {
            fVar.a(categoryPageModel);
        }
        n.a("sticker_list_error_rate", 0, new bi().a("duration", Long.valueOf(a2)).a("count", Integer.valueOf(this.f43854c)).a("cursor", Integer.valueOf(this.f43855d)).a("panel", this.f43853b).b());
    }

    private i(String str, int i, int i2, f fVar) {
        this.f43853b = str;
        this.f43854c = i;
        this.f43855d = i2;
        this.f43856e = fVar;
        q b2 = q.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "Stopwatch.createStarted()");
        this.g = b2;
    }

    public /* synthetic */ i(String str, int i, int i2, f fVar, byte b2) {
        this(str, i, i2, fVar);
    }
}
