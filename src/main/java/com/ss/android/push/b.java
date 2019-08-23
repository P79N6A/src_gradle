package com.ss.android.push;

import java.io.Serializable;

public abstract class b<L, M, R> implements Serializable, Comparable<b<L, M, R>> {
    private static final long serialVersionUID = 1;

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getLeft() == null) {
            i = 0;
        } else {
            i = getLeft().hashCode();
        }
        if (getMiddle() == null) {
            i2 = 0;
        } else {
            i2 = getMiddle().hashCode();
        }
        int i4 = i ^ i2;
        if (getRight() != null) {
            i3 = getRight().hashCode();
        }
        return i4 ^ i3;
    }

    public String toString() {
        return "(" + getLeft() + ',' + getMiddle() + ',' + getRight() + ')';
    }

    public String toString(String str) {
        return String.format(str, new Object[]{getLeft(), getMiddle(), getRight()});
    }

    public int compareTo(b<L, M, R> bVar) {
        int compareTo = ((Comparable) getLeft()).compareTo(bVar.getLeft());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = ((Comparable) getMiddle()).compareTo(bVar.getMiddle());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((Comparable) getRight()).compareTo(bVar.getRight());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!a(getLeft(), bVar.getLeft()) || !a(getMiddle(), bVar.getMiddle()) || !a(getRight(), bVar.getRight())) {
            return false;
        }
        return true;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null || obj2 == null || (obj != obj2 && !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static <L, M, R> b<L, M, R> of(L l, M m, R r) {
        return new a(l, m, r);
    }
}
