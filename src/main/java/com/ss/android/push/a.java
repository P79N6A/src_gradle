package com.ss.android.push;

public final class a<L, M, R> extends b<L, M, R> {
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    public final L getLeft() {
        return this.left;
    }

    public final M getMiddle() {
        return this.middle;
    }

    public final R getRight() {
        return this.right;
    }

    public static <L, M, R> a<L, M, R> of(L l, M m, R r) {
        return new a<>(l, m, r);
    }

    public a(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }
}
