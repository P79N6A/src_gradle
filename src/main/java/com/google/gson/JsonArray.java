package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    private final List<JsonElement> elements;

    public final int hashCode() {
        return this.elements.hashCode();
    }

    public final Iterator<JsonElement> iterator() {
        return this.elements.iterator();
    }

    public final int size() {
        return this.elements.size();
    }

    public JsonArray() {
        this.elements = new ArrayList();
    }

    public final BigDecimal getAsBigDecimal() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsBigDecimal();
        }
        throw new IllegalStateException();
    }

    public final BigInteger getAsBigInteger() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsBigInteger();
        }
        throw new IllegalStateException();
    }

    public final boolean getAsBoolean() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsBoolean();
        }
        throw new IllegalStateException();
    }

    public final byte getAsByte() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsByte();
        }
        throw new IllegalStateException();
    }

    public final char getAsCharacter() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsCharacter();
        }
        throw new IllegalStateException();
    }

    public final double getAsDouble() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsDouble();
        }
        throw new IllegalStateException();
    }

    public final float getAsFloat() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsFloat();
        }
        throw new IllegalStateException();
    }

    public final int getAsInt() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsInt();
        }
        throw new IllegalStateException();
    }

    public final long getAsLong() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsLong();
        }
        throw new IllegalStateException();
    }

    public final Number getAsNumber() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsNumber();
        }
        throw new IllegalStateException();
    }

    public final short getAsShort() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsShort();
        }
        throw new IllegalStateException();
    }

    public final String getAsString() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsString();
        }
        throw new IllegalStateException();
    }

    public final JsonArray deepCopy() {
        if (this.elements.isEmpty()) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(this.elements.size());
        for (JsonElement deepCopy : this.elements) {
            jsonArray.add(deepCopy.deepCopy());
        }
        return jsonArray;
    }

    public final void addAll(JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public final boolean contains(JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    public final boolean remove(JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public final void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.elements.add(jsonElement);
    }

    public final JsonElement get(int i) {
        return this.elements.get(i);
    }

    public final JsonElement remove(int i) {
        return this.elements.remove(i);
    }

    public JsonArray(int i) {
        this.elements = new ArrayList(i);
    }

    public final void add(Boolean bool) {
        Object obj;
        List<JsonElement> list = this.elements;
        if (bool == null) {
            obj = JsonNull.INSTANCE;
        } else {
            obj = new JsonPrimitive(bool);
        }
        list.add(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements))) {
            return true;
        }
        return false;
    }

    public final void add(Character ch) {
        Object obj;
        List<JsonElement> list = this.elements;
        if (ch == null) {
            obj = JsonNull.INSTANCE;
        } else {
            obj = new JsonPrimitive(ch);
        }
        list.add(obj);
    }

    public final void add(Number number) {
        Object obj;
        List<JsonElement> list = this.elements;
        if (number == null) {
            obj = JsonNull.INSTANCE;
        } else {
            obj = new JsonPrimitive(number);
        }
        list.add(obj);
    }

    public final void add(String str) {
        Object obj;
        List<JsonElement> list = this.elements;
        if (str == null) {
            obj = JsonNull.INSTANCE;
        } else {
            obj = new JsonPrimitive(str);
        }
        list.add(obj);
    }

    public final JsonElement set(int i, JsonElement jsonElement) {
        return this.elements.set(i, jsonElement);
    }
}
