package com.facebook.react.bridge;

import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Deque;

public class JsonWriter implements Closeable {
    private final Deque<Scope> mScopes = new ArrayDeque();
    private final Writer mWriter;

    enum Scope {
        EMPTY_OBJECT,
        OBJECT,
        EMPTY_ARRAY,
        ARRAY
    }

    public JsonWriter beginArray() throws IOException {
        open(Scope.EMPTY_ARRAY, '[');
        return this;
    }

    public JsonWriter beginObject() throws IOException {
        open(Scope.EMPTY_OBJECT, '{');
        return this;
    }

    public void close() throws IOException {
        this.mWriter.close();
    }

    public JsonWriter endArray() throws IOException {
        close(']');
        return this;
    }

    public JsonWriter endObject() throws IOException {
        close('}');
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        beforeValue();
        this.mWriter.write("null");
        return this;
    }

    private void beforeName() throws IOException {
        Scope peek = this.mScopes.peek();
        switch (peek) {
            case EMPTY_ARRAY:
            case ARRAY:
                throw new IllegalStateException("name not allowed in array");
            case EMPTY_OBJECT:
                replace(Scope.OBJECT);
                return;
            case OBJECT:
                this.mWriter.write(44);
                return;
            default:
                throw new IllegalStateException("Unknown scope: " + peek);
        }
    }

    private void beforeValue() throws IOException {
        Scope peek = this.mScopes.peek();
        switch (peek) {
            case EMPTY_ARRAY:
                replace(Scope.ARRAY);
                return;
            case EMPTY_OBJECT:
                throw new IllegalArgumentException(Scope.EMPTY_OBJECT.name());
            case ARRAY:
                this.mWriter.write(44);
                return;
            case OBJECT:
                return;
            default:
                throw new IllegalStateException("Unknown scope: " + peek);
        }
    }

    public JsonWriter(Writer writer) {
        this.mWriter = writer;
    }

    private void close(char c2) throws IOException {
        this.mScopes.pop();
        this.mWriter.write(c2);
    }

    private void replace(Scope scope) {
        this.mScopes.pop();
        this.mScopes.push(scope);
    }

    public JsonWriter rawValue(String str) throws IOException {
        beforeValue();
        this.mWriter.write(str);
        return this;
    }

    public JsonWriter value(double d2) throws IOException {
        beforeValue();
        this.mWriter.append(Double.toString(d2));
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        if (str != null) {
            beforeName();
            string(str);
            this.mWriter.write(58);
            return this;
        }
        throw new NullPointerException("name can not be null");
    }

    public JsonWriter value(long j) throws IOException {
        beforeValue();
        this.mWriter.write(Long.toString(j));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        beforeValue();
        this.mWriter.append(number.toString());
        return this;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        beforeValue();
        string(str);
        return this;
    }

    private void string(String str) throws IOException {
        this.mWriter.write(34);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case 8:
                    this.mWriter.write("\\b");
                    continue;
                case 9:
                    this.mWriter.write("\\t");
                    continue;
                case 10:
                    this.mWriter.write("\\n");
                    continue;
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    this.mWriter.write("\\f");
                    continue;
                case 13:
                    this.mWriter.write("\\r");
                    continue;
                case '\"':
                case '\\':
                    this.mWriter.write(92);
                    break;
                case 8232:
                case 8233:
                    this.mWriter.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    continue;
                default:
                    if (charAt <= 31) {
                        this.mWriter.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                        continue;
                    }
                    break;
            }
            this.mWriter.write(charAt);
        }
        this.mWriter.write(34);
    }

    public JsonWriter value(boolean z) throws IOException {
        String str;
        beforeValue();
        Writer writer = this.mWriter;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    private void open(Scope scope, char c2) throws IOException {
        this.mScopes.push(scope);
        this.mWriter.write(c2);
    }
}
