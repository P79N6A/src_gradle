package com.ss.android.ugc.aweme.shortvideo.upload.a;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/InvokeFilter;", "", "filterGap", "", "isDefaultSuccess", "", "(IZ)V", "lastActionTime", "", "actionSuccess", "", "invoke", "newFilterGap", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70964a;

    /* renamed from: d  reason: collision with root package name */
    public static final C0737a f70965d = new C0737a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public long f70966b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f70967c = false;

    /* renamed from: e  reason: collision with root package name */
    private final int f70968e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/InvokeFilter$Companion;", "", "()V", "ENABLE_LOG", "", "LOG_TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.a.a$a  reason: collision with other inner class name */
    public static final class C0737a {
        private C0737a() {
        }

        public /* synthetic */ C0737a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"isAllowInvoke", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ long $currentTime;
        final /* synthetic */ int $newFilterGap;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, int i, long j) {
            super(0);
            this.this$0 = aVar;
            this.$newFilterGap = i;
            this.$currentTime = j;
        }

        public final boolean invoke() {
            if (this.$currentTime - this.this$0.f70966b > ((long) this.$newFilterGap)) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"allowAction", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ long $currentTime;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, long j) {
            super(0);
            this.this$0 = aVar;
            this.$currentTime = j;
        }

        public final boolean invoke() {
            if (this.this$0.f70967c) {
                this.this$0.f70966b = this.$currentTime;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"blockAction", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class d extends Lambda implements Function0<Boolean> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(0);
        }

        public final boolean invoke() {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"log", "", "allow", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ long $currentTime;
        final /* synthetic */ int $newFilterGap;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a aVar, long j, int i) {
            super(1);
            this.this$0 = aVar;
            this.$currentTime = j;
            this.$newFilterGap = i;
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public a(int i, boolean z) {
        this.f70968e = i;
    }
}
