package com.mapbox.api.directions.v5.a;

import com.google.gson.GsonBuilder;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;

public class ak implements Serializable {
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }
}
