package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0004J\b\u0010\u0007\u001a\u00020\bH\u0004J\u0011\u0010\t\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater;", "", "()V", "buildErrorResponse", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "errMsg", "", "checkInIOThread", "", "update", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "DefaultUpdater", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48650a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f48651b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater$Companion;", "", "()V", "getSimOperationName", "", "getUpdater", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48652a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater$DefaultUpdater;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater;", "()V", "update", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.freeflowmember.b$b  reason: collision with other inner class name */
    public static final class C0577b extends b {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f48653c;

        /* renamed from: d  reason: collision with root package name */
        public static final C0577b f48654d = new C0577b();

        private C0577b() {
        }

        @Nullable
        public final Object a(@NotNull c<? super FreeFlowResponse> cVar) {
            if (!PatchProxy.isSupport(new Object[]{cVar}, this, f48653c, false, 46116, new Class[]{c.class}, Object.class)) {
                return new FreeFlowResponse();
            }
            return PatchProxy.accessDispatch(new Object[]{cVar}, this, f48653c, false, 46116, new Class[]{c.class}, Object.class);
        }
    }

    @Nullable
    public abstract Object a(@NotNull c<? super FreeFlowResponse> cVar);

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f48650a, false, 46112, new Class[0], Boolean.TYPE)) {
            return !Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48650a, false, 46112, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final FreeFlowResponse a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f48650a, false, 46113, new Class[]{String.class}, FreeFlowResponse.class)) {
            return (FreeFlowResponse) PatchProxy.accessDispatch(new Object[]{str2}, this, f48650a, false, 46113, new Class[]{String.class}, FreeFlowResponse.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "errMsg");
        FreeFlowResponse freeFlowResponse = new FreeFlowResponse();
        freeFlowResponse.setFromLocalError(true);
        freeFlowResponse.setPrompt(str2);
        return freeFlowResponse;
    }
}
