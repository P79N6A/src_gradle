package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonPrimitive extends JsonElement {
    private static final Class<?>[] PRIMITIVE_TYPES = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object value;

    public final JsonPrimitive deepCopy() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final Boolean getAsBooleanWrapper() {
        return (Boolean) this.value;
    }

    public final boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    public final boolean isNumber() {
        return this.value instanceof Number;
    }

    public final boolean isString() {
        return this.value instanceof String;
    }

    public final char getAsCharacter() {
        return getAsString().charAt(0);
    }

    public final BigDecimal getAsBigDecimal() {
        if (this.value instanceof BigDecimal) {
            return (BigDecimal) this.value;
        }
        return new BigDecimal(this.value.toString());
    }

    public final BigInteger getAsBigInteger() {
        if (this.value instanceof BigInteger) {
            return (BigInteger) this.value;
        }
        return new BigInteger(this.value.toString());
    }

    public final boolean getAsBoolean() {
        if (isBoolean()) {
            return getAsBooleanWrapper().booleanValue();
        }
        return Boolean.parseBoolean(getAsString());
    }

    public final byte getAsByte() {
        if (isNumber()) {
            return getAsNumber().byteValue();
        }
        return Byte.parseByte(getAsString());
    }

    public final double getAsDouble() {
        if (isNumber()) {
            return getAsNumber().doubleValue();
        }
        return Double.parseDouble(getAsString());
    }

    public final float getAsFloat() {
        if (isNumber()) {
            return getAsNumber().floatValue();
        }
        return Float.parseFloat(getAsString());
    }

    public final int getAsInt() {
        if (isNumber()) {
            return getAsNumber().intValue();
        }
        return Integer.parseInt(getAsString());
    }

    public final long getAsLong() {
        if (isNumber()) {
            return getAsNumber().longValue();
        }
        return Long.parseLong(getAsString());
    }

    public final Number getAsNumber() {
        if (this.value instanceof String) {
            return new LazilyParsedNumber((String) this.value);
        }
        return (Number) this.value;
    }

    public final short getAsShort() {
        if (isNumber()) {
            return getAsNumber().shortValue();
        }
        return Short.parseShort(getAsString());
    }

    public final String getAsString() {
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return getAsBooleanWrapper().toString();
        }
        return (String) this.value;
    }

    public final int hashCode() {
        if (this.value == null) {
            return 31;
        }
        if (isIntegral(this)) {
            long longValue = getAsNumber().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        } else if (!(this.value instanceof Number)) {
            return this.value.hashCode();
        } else {
            long doubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
            return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
        }
    }

    public JsonPrimitive(Boolean bool) {
        setValue(bool);
    }

    public JsonPrimitive(Character ch) {
        setValue(ch);
    }

    public JsonPrimitive(Number number) {
        setValue(number);
    }

    private static boolean isPrimitiveOrString(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : PRIMITIVE_TYPES) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    JsonPrimitive(Object obj) {
        setValue(obj);
    }

    private static boolean isIntegral(JsonPrimitive jsonPrimitive) {
        if (!(jsonPrimitive.value instanceof Number)) {
            return false;
        }
        Number number = (Number) jsonPrimitive.value;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void setValue(Object obj) {
        boolean z;
        if (obj instanceof Character) {
            this.value = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || isPrimitiveOrString(obj)) {
            z = true;
        } else {
            z = false;
        }
        C$Gson$Preconditions.checkArgument(z);
        this.value = obj;
    }

    public JsonPrimitive(String str) {
        setValue(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.value == null) {
            if (jsonPrimitive.value == null) {
                return true;
            }
            return false;
        } else if (!isIntegral(this) || !isIntegral(jsonPrimitive)) {
            if (!(this.value instanceof Number) || !(jsonPrimitive.value instanceof Number)) {
                return this.value.equals(jsonPrimitive.value);
            }
            double doubleValue = getAsNumber().doubleValue();
            double doubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                return true;
            }
            return false;
        } else if (getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue()) {
            return true;
        } else {
            return false;
        }
    }
}
