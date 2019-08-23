package io.reactivex.exceptions;

import com.google.a.a.a.a.a.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import io.reactivex.annotations.NonNull;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    static final class CompositeExceptionCausalChain extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        CompositeExceptionCausalChain() {
        }
    }

    static abstract class PrintStreamOrWriter {
        /* access modifiers changed from: package-private */
        public abstract void println(Object obj);

        PrintStreamOrWriter() {
        }
    }

    static final class WrappedPrintStream extends PrintStreamOrWriter {
        private final PrintStream printStream;

        WrappedPrintStream(PrintStream printStream2) {
            this.printStream = printStream2;
        }

        /* access modifiers changed from: package-private */
        public final void println(Object obj) {
            this.printStream.println(obj);
        }
    }

    static final class WrappedPrintWriter extends PrintStreamOrWriter {
        private final PrintWriter printWriter;

        WrappedPrintWriter(PrintWriter printWriter2) {
            this.printWriter = printWriter2;
        }

        /* access modifiers changed from: package-private */
        public final void println(Object obj) {
            this.printWriter.println(obj);
        }
    }

    @NonNull
    public final List<Throwable> getExceptions() {
        return this.exceptions;
    }

    @NonNull
    public final String getMessage() {
        return this.message;
    }

    public final void printStackTrace() {
        a.a((Throwable) this, System.err);
    }

    public final int size() {
        return this.exceptions.size();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|(4:12|(2:14|32)(2:15|33)|31|10)|16|17|18|19|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    @io.reactivex.annotations.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005b
            io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain r0 = new io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.util.List<java.lang.Throwable> r2 = r8.exceptions     // Catch:{ all -> 0x005f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005f }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x005f }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0016
            r1.add(r4)     // Catch:{ all -> 0x005f }
            java.util.List r5 = r8.getListOfCauses(r4)     // Catch:{ all -> 0x005f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005f }
        L_0x0033:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x005f }
            if (r6 == 0) goto L_0x0051
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x005f }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x004d
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x004d:
            r1.add(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x0051:
            r3.initCause(r4)     // Catch:{ Throwable -> 0x0054 }
        L_0x0054:
            java.lang.Throwable r3 = r8.getRootCause(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0016
        L_0x0059:
            r8.cause = r0     // Catch:{ all -> 0x005f }
        L_0x005b:
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x005f }
            monitor-exit(r8)
            return r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public final void printStackTrace(PrintStream printStream) {
        printStackTrace((PrintStreamOrWriter) new WrappedPrintStream(printStream));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CompositeException(@io.reactivex.annotations.NonNull java.lang.Throwable... r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x000e
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "exceptions was null"
            r2.<init>(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            goto L_0x0012
        L_0x000e:
            java.util.List r2 = java.util.Arrays.asList(r2)
        L_0x0012:
            r1.<init>((java.lang.Iterable<? extends java.lang.Throwable>) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.exceptions.CompositeException.<init>(java.lang.Throwable[]):void");
    }

    private List<Throwable> getListOfCauses(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause2 = th.getCause();
        if (cause2 == null || cause2 == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause2);
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return arrayList;
            }
            cause2 = cause3;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final Throwable getRootCause(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || this.cause == cause2) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause3;
        }
        return cause2;
    }

    public final void printStackTrace(PrintWriter printWriter) {
        printStackTrace((PrintStreamOrWriter) new WrappedPrintWriter(printWriter));
    }

    public CompositeException(@NonNull Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.exceptions = Collections.unmodifiableList(arrayList);
            this.message = this.exceptions.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void printStackTrace(PrintStreamOrWriter printStreamOrWriter) {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable appendStackTrace : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, appendStackTrace, "\t");
            i++;
        }
        printStreamOrWriter.println(sb.toString());
    }

    private void appendStackTrace(StringBuilder sb, Throwable th, String str) {
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append(10);
            for (StackTraceElement append : th.getStackTrace()) {
                sb.append("\t\tat ");
                sb.append(append);
                sb.append(10);
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }
}
