package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

public final class JsonTreeReader extends JsonReader {
    private static final Object SENTINEL_CLOSED = new Object();
    private static final Reader UNREADABLE_READER = new Reader() {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };
    private int[] pathIndices = new int[32];
    private String[] pathNames = new String[32];
    private Object[] stack = new Object[32];
    private int stackSize;

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    public final void close() throws IOException {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i = this.stackSize - 1;
        this.stackSize = i;
        Object obj = objArr[i];
        this.stack[this.stackSize] = null;
        return obj;
    }

    public final void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    public final void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    public final void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        if (this.stackSize > 0) {
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
        if (this.stackSize > 0) {
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        if (this.stackSize > 0) {
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
        }
        return asBoolean;
    }

    public final void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
        if (this.stackSize > 0) {
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final String nextName() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    public final void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.pathNames[this.stackSize - 2] = "null";
        } else {
            popStack();
            if (this.stackSize > 0) {
                this.pathNames[this.stackSize - 1] = "null";
            }
        }
        if (this.stackSize > 0) {
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final String getPath() {
        StringBuilder sb = new StringBuilder(ClassUtils.INNER_CLASS_SEPARATOR);
        int i = 0;
        while (i < this.stackSize) {
            if (this.stack[i] instanceof JsonArray) {
                i++;
                if (this.stack[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.pathIndices[i]);
                    sb.append(']');
                }
            } else if (this.stack[i] instanceof JsonObject) {
                i++;
                if (this.stack[i] instanceof Iterator) {
                    sb.append('.');
                    if (this.pathNames[i] != null) {
                        sb.append(this.pathNames[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
            if (isLenient() || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                popStack();
                if (this.stackSize > 0) {
                    int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
                    iArr[i] = iArr[i] + 1;
                }
                return asDouble;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + locationString());
    }

    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            int asInt = ((JsonPrimitive) peekStack()).getAsInt();
            popStack();
            if (this.stackSize > 0) {
                int[] iArr = this.pathIndices;
                int i = this.stackSize - 1;
                iArr[i] = iArr[i] + 1;
            }
            return asInt;
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + locationString());
    }

    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            long asLong = ((JsonPrimitive) peekStack()).getAsLong();
            popStack();
            if (this.stackSize > 0) {
                int[] iArr = this.pathIndices;
                int i = this.stackSize - 1;
                iArr[i] = iArr[i] + 1;
            }
            return asLong;
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + locationString());
    }

    public final String nextString() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.STRING || peek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) popStack()).getAsString();
            if (this.stackSize > 0) {
                int[] iArr = this.pathIndices;
                int i = this.stackSize - 1;
                iArr[i] = iArr[i] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + peek + locationString());
    }

    public final JsonToken peek() throws IOException {
        while (this.stackSize != 0) {
            Object peekStack = peekStack();
            if (peekStack instanceof Iterator) {
                boolean z = this.stack[this.stackSize - 2] instanceof JsonObject;
                Iterator it2 = (Iterator) peekStack;
                if (it2.hasNext()) {
                    if (z) {
                        return JsonToken.NAME;
                    }
                    push(it2.next());
                } else if (z) {
                    return JsonToken.END_OBJECT;
                } else {
                    return JsonToken.END_ARRAY;
                }
            } else if (peekStack instanceof JsonObject) {
                return JsonToken.BEGIN_OBJECT;
            } else {
                if (peekStack instanceof JsonArray) {
                    return JsonToken.BEGIN_ARRAY;
                }
                if (peekStack instanceof JsonPrimitive) {
                    JsonPrimitive jsonPrimitive = (JsonPrimitive) peekStack;
                    if (jsonPrimitive.isString()) {
                        return JsonToken.STRING;
                    }
                    if (jsonPrimitive.isBoolean()) {
                        return JsonToken.BOOLEAN;
                    }
                    if (jsonPrimitive.isNumber()) {
                        return JsonToken.NUMBER;
                    }
                    throw new AssertionError();
                } else if (peekStack instanceof JsonNull) {
                    return JsonToken.NULL;
                } else {
                    if (peekStack == SENTINEL_CLOSED) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return JsonToken.END_DOCUMENT;
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        push(jsonElement);
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    private void push(Object obj) {
        if (this.stackSize == this.stack.length) {
            Object[] objArr = new Object[(this.stackSize * 2)];
            int[] iArr = new int[(this.stackSize * 2)];
            String[] strArr = new String[(this.stackSize * 2)];
            System.arraycopy(this.stack, 0, objArr, 0, this.stackSize);
            System.arraycopy(this.pathIndices, 0, iArr, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = objArr;
            this.pathIndices = iArr;
            this.pathNames = strArr;
        }
        Object[] objArr2 = this.stack;
        int i = this.stackSize;
        this.stackSize = i + 1;
        objArr2[i] = obj;
    }
}
