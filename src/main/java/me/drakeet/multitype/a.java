package me.drakeet.multitype;

import android.support.annotation.NonNull;

public final class a extends RuntimeException {
    a(@NonNull Class<?> cls) {
        super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
