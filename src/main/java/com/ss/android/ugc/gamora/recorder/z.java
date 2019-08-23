package com.ss.android.ugc.gamora.recorder;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class z extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new z();

    z() {
    }

    public final String getName() {
        return "tvChooseMusicVisible";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(RecordTitleState.class);
    }

    public final String getSignature() {
        return "getTvChooseMusicVisible()Z";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        return Boolean.valueOf(((RecordTitleState) obj).getTvChooseMusicVisible());
    }
}
