package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.c;
import com.mapbox.mapboxsdk.annotations.i;
import java.util.List;

public interface r {
    Marker a(@NonNull c cVar, @NonNull o oVar);

    List<Marker> a(@NonNull RectF rectF);

    void a();

    void a(@NonNull Marker marker, @NonNull o oVar);

    List<i> b(@NonNull RectF rectF);
}
