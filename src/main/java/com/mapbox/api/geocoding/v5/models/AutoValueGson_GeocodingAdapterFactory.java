package com.mapbox.api.geocoding.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.api.directions.v5.a.ag;
import com.mapbox.api.directions.v5.a.ah;
import com.mapbox.api.directions.v5.a.ai;
import com.mapbox.api.directions.v5.a.aj;
import com.mapbox.api.directions.v5.a.al;
import com.mapbox.api.directions.v5.a.am;
import com.mapbox.api.directions.v5.a.an;
import com.mapbox.api.directions.v5.a.ao;
import com.mapbox.api.directions.v5.a.ap;
import com.mapbox.api.directions.v5.a.aq;
import com.mapbox.api.directions.v5.a.ar;
import com.mapbox.api.directions.v5.a.as;
import com.mapbox.api.directions.v5.a.at;
import com.mapbox.api.directions.v5.a.au;
import com.mapbox.api.directions.v5.a.av;
import com.mapbox.api.directions.v5.a.aw;
import com.mapbox.api.matching.v5.models.i;
import com.mapbox.api.matching.v5.models.j;
import com.mapbox.api.matching.v5.models.k;
import com.mapbox.api.matching.v5.models.l;
import com.mapbox.api.matrix.v1.a.c;
import com.mapbox.api.optimization.v1.models.e;
import com.mapbox.api.optimization.v1.models.f;

public final class AutoValueGson_GeocodingAdapterFactory extends GeocodingAdapterFactory {
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (ag.class.isAssignableFrom(rawType)) {
            return ag.typeAdapter(gson);
        }
        if (ah.class.isAssignableFrom(rawType)) {
            return ah.typeAdapter(gson);
        }
        if (ai.class.isAssignableFrom(rawType)) {
            return ai.typeAdapter(gson);
        }
        if (g.class.isAssignableFrom(rawType)) {
            return g.typeAdapter(gson);
        }
        if (h.class.isAssignableFrom(rawType)) {
            return h.typeAdapter(gson);
        }
        if (aj.class.isAssignableFrom(rawType)) {
            return aj.typeAdapter(gson);
        }
        if (al.class.isAssignableFrom(rawType)) {
            return al.typeAdapter(gson);
        }
        if (am.class.isAssignableFrom(rawType)) {
            return am.typeAdapter(gson);
        }
        if (an.class.isAssignableFrom(rawType)) {
            return an.typeAdapter(gson);
        }
        if (i.class.isAssignableFrom(rawType)) {
            return i.typeAdapter(gson);
        }
        if (ao.class.isAssignableFrom(rawType)) {
            return ao.typeAdapter(gson);
        }
        if (ap.class.isAssignableFrom(rawType)) {
            return ap.typeAdapter(gson);
        }
        if (aq.class.isAssignableFrom(rawType)) {
            return aq.typeAdapter(gson);
        }
        if (i.class.isAssignableFrom(rawType)) {
            return i.typeAdapter(gson);
        }
        if (j.class.isAssignableFrom(rawType)) {
            return j.typeAdapter(gson);
        }
        if (k.class.isAssignableFrom(rawType)) {
            return k.typeAdapter(gson);
        }
        if (l.class.isAssignableFrom(rawType)) {
            return l.typeAdapter(gson);
        }
        if (c.class.isAssignableFrom(rawType)) {
            return c.typeAdapter(gson);
        }
        if (ar.class.isAssignableFrom(rawType)) {
            return ar.typeAdapter(gson);
        }
        if (e.class.isAssignableFrom(rawType)) {
            return e.typeAdapter(gson);
        }
        if (f.class.isAssignableFrom(rawType)) {
            return f.typeAdapter(gson);
        }
        if (as.class.isAssignableFrom(rawType)) {
            return as.typeAdapter(gson);
        }
        if (at.class.isAssignableFrom(rawType)) {
            return at.typeAdapter(gson);
        }
        if (au.class.isAssignableFrom(rawType)) {
            return au.typeAdapter(gson);
        }
        if (av.class.isAssignableFrom(rawType)) {
            return av.typeAdapter(gson);
        }
        if (aw.class.isAssignableFrom(rawType)) {
            return aw.typeAdapter(gson);
        }
        return null;
    }
}
