package com.ss.android.ugc.aweme.feedback.a.a;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "runtimeBehaviorDataBase", "Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorDataBase;", "deleteAll", "", "deleteExpiredEntityByType", "type", "", "validTime", "", "getValidEntityByType", "", "Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorEntity;", "insert", "entity", "Companion", "SingletonHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47117a;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static a f47118c = b.f47121a;

    /* renamed from: d  reason: collision with root package name */
    public static final C0566a f47119d = new C0566a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final RuntimeBehaviorDataBase f47120b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper;", "getInstance", "()Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper;", "setInstance", "(Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.feedback.a.a.a$a  reason: collision with other inner class name */
    public static final class C0566a {
        private C0566a() {
        }

        public /* synthetic */ C0566a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper;", "getHolder", "()Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        static final a f47121a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f47122b = new b();

        private b() {
        }

        static {
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            f47121a = new a(context, (byte) 0);
        }
    }

    private a(Context context) {
        RoomDatabase build = Room.databaseBuilder(context, RuntimeBehaviorDataBase.class, "runtimeBehavior").build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Room.databaseBuilder(con…runtimeBehavior\").build()");
        this.f47120b = (RuntimeBehaviorDataBase) build;
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
