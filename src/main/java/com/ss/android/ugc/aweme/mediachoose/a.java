package com.ss.android.ugc.aweme.mediachoose;

import a.g;
import a.i;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.view.c;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.e;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J¥\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001726\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00130\u001a2K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00130\u001fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/mediachoose/Editor1VideoLegalChecker;", "Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkerType", "", "getCheckerType", "()Ljava/lang/String;", "enterFrom", "getEnterFrom", "setEnterFrom", "(Ljava/lang/String;)V", "isLoadingDialogEnable", "", "()Z", "setLoadingDialogEnable", "(Z)V", "isCanImport", "", "mediaModel", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "minDuration", "", "maxDuration", "onSuccess", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "costTime", "onError", "Lkotlin/Function3;", "", "errorCode", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55234a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55235b = true;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private String f55236c = "";

    /* renamed from: d  reason: collision with root package name */
    private final Context f55237d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a$a  reason: collision with other inner class name */
    static final class C0635a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.b.a.a f55239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f55240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f55241d;

        C0635a(com.ss.android.ugc.aweme.music.b.a.a aVar, long j, long j2) {
            this.f55239b = aVar;
            this.f55240c = j;
            this.f55241d = j2;
        }

        public final /* synthetic */ Object call() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f55238a, false, 58418, new Class[0], Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55238a, false, 58418, new Class[0], Integer.TYPE)).intValue();
            } else {
                i = FFMpegManager.a().a(this.f55239b.f56315e, this.f55240c, this.f55241d);
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<Integer, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f55248b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f55249c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.b.a.a f55250d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function2 f55251e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f55252f;
        final /* synthetic */ Function3 g;

        b(a aVar, c cVar, com.ss.android.ugc.aweme.music.b.a.a aVar2, Function2 function2, long j, Function3 function3) {
            this.f55248b = aVar;
            this.f55249c = cVar;
            this.f55250d = aVar2;
            this.f55251e = function2;
            this.f55252f = j;
            this.g = function3;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f55247a, false, 58419, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f55247a, false, 58419, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            Integer num = (Integer) iVar.e();
            if (this.f55249c != null) {
                bc.b(this.f55249c);
            }
            if (Intrinsics.compare(num.intValue(), 0) >= 0) {
                if (Intrinsics.compare(num.intValue(), 0) > 0) {
                    this.f55250d.h = (long) num.intValue();
                }
                this.f55251e.invoke(a.a(), Long.valueOf(System.currentTimeMillis() - this.f55252f));
            } else {
                Function3 function3 = this.g;
                String a2 = a.a();
                Long valueOf = Long.valueOf(System.currentTimeMillis() - this.f55252f);
                Intrinsics.checkExpressionValueIsNotNull(num, "result");
                function3.invoke(a2, valueOf, num);
            }
            return null;
        }
    }

    @NotNull
    public static String a() {
        return "Editor1VideoLegalChecker";
    }

    public final void a(boolean z) {
        this.f55235b = z;
    }

    public a(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f55237d = context;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f55234a, false, 58416, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f55234a, false, 58416, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f55236c = str2;
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.music.b.a.a aVar, long j, long j2, @NotNull Function2<? super String, ? super Long, Unit> function2, @NotNull Function3<? super String, ? super Long, ? super Integer, Unit> function3) {
        c cVar;
        com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
        long j3 = j;
        long j4 = j2;
        Function2<? super String, ? super Long, Unit> function22 = function2;
        Function3<? super String, ? super Long, ? super Integer, Unit> function32 = function3;
        if (PatchProxy.isSupport(new Object[]{aVar2, new Long(j3), new Long(j4), function22, function32}, this, f55234a, false, 58417, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, Long.TYPE, Long.TYPE, Function2.class, Function3.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, new Long(j3), new Long(j4), function22, function32}, this, f55234a, false, 58417, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, Long.TYPE, Long.TYPE, Function2.class, Function3.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "mediaModel");
        Intrinsics.checkParameterIsNotNull(function22, "onSuccess");
        Intrinsics.checkParameterIsNotNull(function32, "onError");
        e a2 = e.a.a();
        String str = aVar2.f56315e;
        Intrinsics.checkExpressionValueIsNotNull(str, "mediaModel.filePath");
        a2.a(str, co.VIDEO);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f55235b) {
            cVar = c.a(this.f55237d, this.f55237d.getString(C0906R.string.brk));
        } else {
            cVar = null;
        }
        c cVar2 = cVar;
        C0635a aVar3 = new C0635a(aVar, j, j2);
        i a3 = i.a((Callable<TResult>) aVar3);
        b bVar = new b(this, cVar2, aVar, function2, currentTimeMillis, function3);
        a3.a((g<TResult, TContinuationResult>) bVar, i.f1052b);
    }
}
