package com.google.android.gms.common.images;

public final class Size {
    private final int zzrY;
    private final int zzrZ;

    public Size(int i, int i2) {
        this.zzrY = i;
        this.zzrZ = i2;
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zzcy(str);
                }
            } else {
                throw zzcy(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    private static NumberFormatException zzcy(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.zzrY == size.zzrY && this.zzrZ == size.zzrZ;
        }
    }

    public final int getHeight() {
        return this.zzrZ;
    }

    public final int getWidth() {
        return this.zzrY;
    }

    public final int hashCode() {
        return this.zzrZ ^ ((this.zzrY << 16) | (this.zzrY >>> 16));
    }

    public final String toString() {
        int i = this.zzrY;
        int i2 = this.zzrZ;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
