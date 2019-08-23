package io.fabric.sdk.android.services.concurrency;

public enum d {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    static <Y> int compareTo(h hVar, Y y) {
        d dVar;
        if (y instanceof h) {
            dVar = ((h) y).getPriority();
        } else {
            dVar = NORMAL;
        }
        return dVar.ordinal() - hVar.getPriority().ordinal();
    }
}
