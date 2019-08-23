package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class NavigationMetadataSerializer implements JsonSerializer<au> {
    NavigationMetadataSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        au auVar = (au) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("startTimestamp", auVar.f26029d);
        jsonObject.addProperty("distanceCompleted", (Number) Integer.valueOf(auVar.f26030e));
        jsonObject.addProperty("distanceRemaining", (Number) Integer.valueOf(auVar.f26031f));
        jsonObject.addProperty("durationRemaining", (Number) Integer.valueOf(auVar.g));
        jsonObject.addProperty("operatingSystem", auVar.h);
        jsonObject.addProperty("eventVersion", (Number) Integer.valueOf(auVar.i));
        jsonObject.addProperty("sdKIdentifier", auVar.j);
        jsonObject.addProperty("sdkVersion", auVar.k);
        jsonObject.addProperty("sessionIdentifier", auVar.l);
        jsonObject.addProperty("lat", (Number) Double.valueOf(auVar.m));
        jsonObject.addProperty("lng", (Number) Double.valueOf(auVar.n));
        jsonObject.addProperty("geometry", auVar.o);
        jsonObject.addProperty("profile", auVar.q);
        jsonObject.addProperty("simulation", Boolean.valueOf(auVar.u));
        jsonObject.addProperty("device", auVar.D);
        jsonObject.addProperty("locationEngine", auVar.E);
        jsonObject.addProperty("created", auVar.p);
        jsonObject.addProperty("absoluteDistanceToDestination", (Number) Integer.valueOf(auVar.f26026a));
        jsonObject.addProperty("tripIdentifier", auVar.L);
        jsonObject.addProperty("legIndex", (Number) Integer.valueOf(auVar.M));
        jsonObject.addProperty("legCount", (Number) Integer.valueOf(auVar.N));
        jsonObject.addProperty("stepIndex", (Number) Integer.valueOf(auVar.O));
        jsonObject.addProperty("stepCount", (Number) Integer.valueOf(auVar.B));
        jsonObject.addProperty("totalStepCount", (Number) Integer.valueOf(auVar.R));
        jsonObject.addProperty("estimatedDistance", (Number) auVar.r);
        jsonObject.addProperty("estimatedDuration", (Number) auVar.s);
        jsonObject.addProperty("rerouteCount", (Number) auVar.t);
        jsonObject.addProperty("originalRequestIdentifier", auVar.v);
        jsonObject.addProperty("requestIdentifier", auVar.w);
        jsonObject.addProperty("originalGeometry", auVar.x);
        jsonObject.addProperty("originalEstimatedDistance", (Number) auVar.y);
        jsonObject.addProperty("originalEstimatedDuration", (Number) auVar.z);
        jsonObject.addProperty("audioType", auVar.A);
        jsonObject.addProperty("originalStepCount", (Number) auVar.C);
        jsonObject.addProperty("volumeLevel", (Number) Integer.valueOf(auVar.F));
        jsonObject.addProperty("screenBrightness", (Number) Integer.valueOf(auVar.G));
        jsonObject.addProperty("applicationState", auVar.H);
        jsonObject.addProperty("batteryPluggedIn", auVar.I);
        jsonObject.addProperty("batteryLevel", (Number) Integer.valueOf(auVar.J));
        jsonObject.addProperty("connectivity", auVar.K);
        jsonObject.addProperty("percentTimeInPortrait", (Number) auVar.f26027b);
        jsonObject.addProperty("percentTimeInForeground", (Number) auVar.f26028c);
        jsonObject.addProperty("voiceIndex", (Number) auVar.P);
        jsonObject.addProperty("bannerIndex", (Number) auVar.Q);
        return jsonObject;
    }
}
