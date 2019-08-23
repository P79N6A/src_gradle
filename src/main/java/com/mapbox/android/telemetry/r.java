package com.mapbox.android.telemetry;

import android.os.Parcelable;
import java.util.EnumSet;

public abstract class r implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    public static EnumSet<a> f26122b = EnumSet.of(a.MAP_CLICK, a.MAP_DRAGEND);

    /* renamed from: c  reason: collision with root package name */
    static EnumSet<a> f26123c = EnumSet.of(a.NAV_DEPART, new a[]{a.NAV_ARRIVE, a.NAV_CANCEL, a.NAV_REROUTE, a.NAV_FEEDBACK, a.NAV_FASTER_ROUTE});

    /* renamed from: d  reason: collision with root package name */
    static EnumSet<a> f26124d = EnumSet.of(a.VIS_GENERAL, a.VIS_ATTACHMENT, a.VIS_OBJ_DETECTION);

    public enum a {
        TURNSTILE,
        MAP_LOAD,
        MAP_CLICK,
        MAP_DRAGEND,
        OFFLINE_DOWNLOAD_START,
        OFFLINE_DOWNLOAD_COMPLETE,
        LOCATION,
        NAV_DEPART,
        NAV_ARRIVE,
        NAV_CANCEL,
        NAV_REROUTE,
        NAV_FEEDBACK,
        NAV_FASTER_ROUTE,
        VIS_GENERAL,
        VIS_ATTACHMENT,
        VIS_OBJ_DETECTION
    }

    /* access modifiers changed from: package-private */
    public abstract a a();
}
