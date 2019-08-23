package net.jpountz.lz4;

public enum LZ4Constants {
    ;
    
    static final int SKIP_STRENGTH = 0;

    static {
        SKIP_STRENGTH = Math.max(6, 2);
    }
}
