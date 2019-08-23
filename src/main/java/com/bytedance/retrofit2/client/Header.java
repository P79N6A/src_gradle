package com.bytedance.retrofit2.client;

public final class Header {
    private final String name;
    private final String value;

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.name != null) {
            i = this.name.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.value != null) {
            i2 = this.value.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            str = this.name;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(": ");
        if (this.value != null) {
            str2 = this.value;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        if (this.name == null ? header.name != null : !this.name.equals(header.name)) {
            return false;
        }
        if (this.value == null ? header.value == null : this.value.equals(header.value)) {
            return true;
        }
        return false;
    }

    public Header(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
