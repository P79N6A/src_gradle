package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.internal.u;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0010H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0018\u0010\t\u001a\u00020\u0003*\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\r\u001a\u00020\u0003*\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"DEBUG", "", "DEBUG_PROPERTY_NAME", "", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_OFF", "DEBUG_PROPERTY_VALUE_ON", "RECOVER_STACKTRACES", "STACKTRACE_RECOVERY_PROPERTY_NAME", "classSimpleName", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class ai {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f83795a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f83796b = u.a("kotlinx.coroutines.stacktrace.recovery", true);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0.equals("auto") != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0.equals("on") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0.equals("") != false) goto L_0x0048;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.u.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            goto L_0x0026
        L_0x000a:
            int r2 = r0.hashCode()
            if (r2 == 0) goto L_0x0040
            r3 = 3551(0xddf, float:4.976E-42)
            if (r2 == r3) goto L_0x0037
            r3 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 == r3) goto L_0x002d
            r3 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r2 != r3) goto L_0x0054
            java.lang.String r2 = "auto"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
        L_0x0026:
            java.lang.Class<kotlinx.coroutines.ad> r0 = kotlinx.coroutines.ad.class
            boolean r0 = r0.desiredAssertionStatus()
            goto L_0x0049
        L_0x002d:
            java.lang.String r2 = "off"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0049
        L_0x0037:
            java.lang.String r2 = "on"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
            goto L_0x0048
        L_0x0040:
            java.lang.String r2 = ""
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
        L_0x0048:
            r0 = 1
        L_0x0049:
            f83795a = r0
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.u.a(r0, r1)
            f83796b = r0
            return
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.<init>(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.ai.<clinit>():void");
    }

    @NotNull
    public static final String a(@NotNull Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "receiver$0");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        Intrinsics.checkExpressionValueIsNotNull(hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }

    @NotNull
    public static final String b(@NotNull Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "receiver$0");
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    @NotNull
    public static final String a(@NotNull c<?> cVar) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        if (cVar instanceof aq) {
            return cVar.toString();
        }
        try {
            obj = l.m673constructorimpl(cVar + '@' + a((Object) cVar));
        } catch (Throwable th) {
            obj = l.m673constructorimpl(m.a(th));
        }
        if (l.m676exceptionOrNullimpl(obj) != null) {
            obj = cVar.getClass().getName() + '@' + a((Object) cVar);
        }
        return (String) obj;
    }
}
