package com.mapbox.mapboxsdk.style.light;

import android.support.annotation.Keep;

public class Position {
    @Keep
    private float azimuthalAngle;
    @Keep
    private float polarAngle;
    @Keep
    private float radialCoordinate;

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.radialCoordinate != 0.0f) {
            i = Float.floatToIntBits(this.radialCoordinate);
        } else {
            i = 0;
        }
        int i4 = i * 31;
        if (this.azimuthalAngle != 0.0f) {
            i2 = Float.floatToIntBits(this.azimuthalAngle);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.polarAngle != 0.0f) {
            i3 = Float.floatToIntBits(this.polarAngle);
        }
        return i5 + i3;
    }

    public String toString() {
        return "Position{radialCoordinate=" + this.radialCoordinate + ", azimuthalAngle=" + this.azimuthalAngle + ", polarAngle=" + this.polarAngle + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Position position = (Position) obj;
        if (Float.compare(position.radialCoordinate, this.radialCoordinate) == 0 && Float.compare(position.azimuthalAngle, this.azimuthalAngle) == 0 && Float.compare(position.polarAngle, this.polarAngle) == 0) {
            return true;
        }
        return false;
    }

    @Keep
    public static Position fromPosition(float f2, float f3, float f4) {
        return new Position(f2, f3, f4);
    }

    private Position(float f2, float f3, float f4) {
        this.radialCoordinate = f2;
        this.azimuthalAngle = f3;
        this.polarAngle = f4;
    }
}
