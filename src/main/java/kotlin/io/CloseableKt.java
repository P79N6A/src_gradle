package kotlin.io;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.b;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001a;\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0002\b\n\u0006\b\u0011(\n0\u0001¨\u0006\f"}, d2 = {"closeFinally", "", "Ljava/io/Closeable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class CloseableKt {
    @SinceKotlin
    @PublishedApi
    public static final void closeFinally(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                b.a(th, th2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (kotlin.internal.b.a(1, 1, 0) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r3 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        closeFinally(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r4 = move-exception;
     */
    @kotlin.internal.InlineOnly
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T extends java.io.Closeable, R> R use(T r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch:{ Throwable -> 0x0019 }
            boolean r0 = kotlin.internal.b.a(r2, r2, r0)
            if (r0 == 0) goto L_0x0011
            closeFinally(r3, r1)
            goto L_0x0016
        L_0x0011:
            if (r3 == 0) goto L_0x0016
            r3.close()
        L_0x0016:
            return r4
        L_0x0017:
            r4 = move-exception
            goto L_0x001b
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x001b:
            boolean r0 = kotlin.internal.b.a(r2, r2, r0)
            if (r0 != 0) goto L_0x002d
            if (r3 == 0) goto L_0x0030
            if (r1 != 0) goto L_0x0029
            r3.close()
            goto L_0x0030
        L_0x0029:
            r3.close()     // Catch:{ Throwable -> 0x0030 }
            goto L_0x0030
        L_0x002d:
            closeFinally(r3, r1)
        L_0x0030:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.CloseableKt.use(java.io.Closeable, kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
