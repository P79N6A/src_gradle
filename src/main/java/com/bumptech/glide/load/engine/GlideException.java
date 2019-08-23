package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.google.a.a.a.a.a.a;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Key key;

    static final class IndentedAppendable implements Appendable {
        private final Appendable appendable;
        private boolean printedNewLine = true;

        @NonNull
        private CharSequence safeSequence(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        IndentedAppendable(Appendable appendable2) {
            this.appendable = appendable2;
        }

        public final Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence safeSequence = safeSequence(charSequence);
            return append(safeSequence, 0, safeSequence.length());
        }

        public final Appendable append(char c2) throws IOException {
            boolean z = false;
            if (this.printedNewLine) {
                this.printedNewLine = false;
                this.appendable.append("  ");
            }
            if (c2 == 10) {
                z = true;
            }
            this.printedNewLine = z;
            this.appendable.append(c2);
            return this;
        }

        public final Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence safeSequence = safeSequence(charSequence);
            boolean z = false;
            if (this.printedNewLine) {
                this.printedNewLine = false;
                this.appendable.append("  ");
            }
            if (safeSequence.length() > 0 && safeSequence.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.printedNewLine = z;
            this.appendable.append(safeSequence, i, i2);
            return this;
        }
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final List<Throwable> getCauses() {
        return this.causes;
    }

    public final void printStackTrace() {
        a.a((Throwable) this, System.err);
    }

    public final List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        if (this.dataClass != null) {
            str = ", " + this.dataClass;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.dataSource != null) {
            str2 = ", " + this.dataSource;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        } else {
            str3 = "";
        }
        sb.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" causes:");
        }
        for (Throwable next : rootCauses) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public final void logRootCauses(String str) {
        getRootCauses().size();
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new IndentedAppendable(appendable));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    /* access modifiers changed from: package-private */
    public final void setLoggingDetails(Key key2, DataSource dataSource2) {
        setLoggingDetails(key2, dataSource2, null);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable addRootCauses : ((GlideException) th).getCauses()) {
                addRootCauses(addRootCauses, list);
            }
            return;
        }
        list.add(th);
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th, appendable);
            }
            i = i2;
        }
    }

    private static void appendExceptionMessage(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setLoggingDetails(Key key2, DataSource dataSource2, Class<?> cls) {
        this.key = key2;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }
}
