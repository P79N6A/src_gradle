package com.ss.android.ugc.aweme.mediachoose;

import a.i;
import a.j;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d;
import dmt.av.video.ah;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J=\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016J=\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/mediachoose/IVideoLegalCheckerAndToastServiceImpl;", "Lcom/ss/android/ugc/aweme/framework/services/IVideoLegalCheckerAndToastService;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getVideoTypeByPath", "", "videoPath", "isOneVideoLegalByMediaModel", "", "mediaModel", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "isShowErrToast", "onError", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "errCode", "", "isVideoLengthOrTypeSupportedAndShowErrToast", "videoPath2MediaModel", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements IVideoLegalCheckerAndToastService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55275a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f55276b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "checkerType", "", "costTime", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<String, Long, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ j $isLegalWaitTask;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(2);
            this.$isLegalWaitTask = jVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, ((Number) obj2).longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 58425, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 58425, new Class[]{String.class, Long.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "checkerType");
            this.$isLegalWaitTask.a(Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "checkerType", "", "costTime", "", "errorCode", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$b  reason: collision with other inner class name */
    static final class C0636b extends Lambda implements Function3<String, Long, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ j $isLegalWaitTask;
        final /* synthetic */ boolean $isShowErrToast;
        final /* synthetic */ int $minVideoDuration;
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0636b(b bVar, boolean z, int i, Function1 function1, j jVar) {
            super(3);
            this.this$0 = bVar;
            this.$isShowErrToast = z;
            this.$minVideoDuration = i;
            this.$onError = function1;
            this.$isLegalWaitTask = jVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str, long j, int i) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 58426, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 58426, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "checkerType");
            if (this.$isShowErrToast) {
                d.a(this.this$0.f55276b, i, this.$minVideoDuration);
            } else {
                int i2 = i;
            }
            Function1 function1 = this.$onError;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(i));
            }
            this.$isLegalWaitTask.a(Boolean.FALSE);
        }
    }

    public b(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f55276b = context;
    }

    private final String a(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f55275a, false, 58423, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f55275a, false, 58423, new Class[]{String.class}, String.class);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str3);
            str2 = mediaMetadataRetriever.extractMetadata(12);
        } catch (Exception unused) {
            str2 = null;
        }
        return str2;
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(@NotNull String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55275a, false, 58421, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f55275a, false, 58421, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "videoPath");
        return isVideoLengthOrTypeSupportedAndShowErrToast(str2, z, null);
    }

    private final boolean a(com.ss.android.ugc.aweme.music.b.a.a aVar, boolean z, Function1<? super Integer, Unit> function1) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0), function1}, this, f55275a, false, 58424, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, Boolean.TYPE, Function1.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z), function1}, this, f55275a, false, 58424, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, Boolean.TYPE, Function1.class}, Boolean.TYPE)).booleanValue();
        }
        j jVar = new j();
        com.ss.android.ugc.aweme.mediachoose.a.a a2 = com.ss.android.ugc.aweme.mediachoose.a.a.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
        int i = a2.f55245c;
        com.ss.android.ugc.aweme.mediachoose.a.a a3 = com.ss.android.ugc.aweme.mediachoose.a.a.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
        int i2 = a3.f55246d;
        d dVar = new d(this.f55276b);
        long j = (long) i2;
        C0636b bVar = new C0636b(this, z, i, function1, jVar);
        dVar.a(aVar, (long) i, j, new a(jVar), bVar);
        try {
            jVar.f1091a.a(1000, TimeUnit.MILLISECONDS);
            i<TResult> iVar = jVar.f1091a;
            Intrinsics.checkExpressionValueIsNotNull(iVar, "isLegalWaitTask.task");
            Boolean bool = (Boolean) iVar.e();
            if (bool != null) {
                z2 = bool.booleanValue();
            }
        } catch (InterruptedException unused) {
        }
        return z2;
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(@NotNull String str, boolean z, @Nullable Function1<? super Integer, Unit> function1) {
        com.ss.android.ugc.aweme.music.b.a.a aVar;
        String str2 = str;
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), function12}, this, f55275a, false, 58420, new Class[]{String.class, Boolean.TYPE, Function1.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), function12}, this, f55275a, false, 58420, new Class[]{String.class, Boolean.TYPE, Function1.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "videoPath");
        if (PatchProxy.isSupport(new Object[]{str2}, this, f55275a, false, 58422, new Class[]{String.class}, com.ss.android.ugc.aweme.music.b.a.a.class)) {
            aVar = (com.ss.android.ugc.aweme.music.b.a.a) PatchProxy.accessDispatch(new Object[]{str2}, this, f55275a, false, 58422, new Class[]{String.class}, com.ss.android.ugc.aweme.music.b.a.a.class);
        } else {
            int[] a2 = ah.a(str);
            if (a2 != null) {
                com.ss.android.ugc.aweme.music.b.a.a aVar2 = new com.ss.android.ugc.aweme.music.b.a.a(-1);
                aVar2.f56315e = str2;
                aVar2.l = a2[0];
                aVar2.m = a2[1];
                aVar2.h = (long) a2[3];
                aVar2.j = a(str);
                aVar = aVar2;
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            return a(aVar, z, function12);
        }
        return false;
    }
}
