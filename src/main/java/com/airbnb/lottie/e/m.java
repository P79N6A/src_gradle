package com.airbnb.lottie.e;

import android.util.JsonReader;
import java.io.IOException;

public final class m implements af<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final m f4818a = new m();

    private m() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f2) throws IOException {
        return Integer.valueOf(Math.round(n.b(jsonReader) * f2));
    }
}
