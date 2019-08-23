package a;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class a extends Exception {
    private static final long serialVersionUID = 1;
    private List<Throwable> innerThrowables;

    public final List<Throwable> getInnerThrowables() {
        return this.innerThrowables;
    }

    @Deprecated
    public final Throwable[] getCauses() {
        return (Throwable[]) this.innerThrowables.toArray(new Throwable[this.innerThrowables.size()]);
    }

    @Deprecated
    public final List<Exception> getErrors() {
        ArrayList arrayList = new ArrayList();
        if (this.innerThrowables == null) {
            return arrayList;
        }
        for (Throwable next : this.innerThrowables) {
            if (next instanceof Exception) {
                arrayList.add((Exception) next);
            } else {
                arrayList.add(new Exception(next));
            }
        }
        return arrayList;
    }

    public a(List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }

    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable a2 : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(Integer.toString(i));
            printStream.append(": ");
            com.google.a.a.a.a.a.a.a(a2, printStream);
            printStream.append("\n");
        }
    }

    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable a2 : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(Integer.toString(i));
            printWriter.append(": ");
            com.google.a.a.a.a.a.a.a(a2, printWriter);
            printWriter.append("\n");
        }
    }

    public a(String str, Throwable[] thArr) {
        this(str, Arrays.asList(thArr));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r2, java.util.List<? extends java.lang.Throwable> r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0010
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0010
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r1.<init>(r2, r0)
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            r1.innerThrowables = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.<init>(java.lang.String, java.util.List):void");
    }
}
