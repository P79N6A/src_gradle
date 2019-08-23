package com.ss.android.vesdk.filterparam;

public class VETransitionFilterParam extends b {

    /* renamed from: a  reason: collision with root package name */
    public String f77992a = "";

    /* renamed from: b  reason: collision with root package name */
    public int f77993b = a.TransitionType_DEFAULT.ordinal();

    /* renamed from: c  reason: collision with root package name */
    public int f77994c = 500;

    public enum a {
        TransitionType_DEFAULT,
        TransitionType_VARIABLE_TIME
    }

    public VETransitionFilterParam() {
        this.filterName = "tran filter";
        this.filterType = 14;
    }

    public String toString() {
        return "transName=" + this.f77992a + " tranType=" + this.f77993b + " tranDuration=" + this.f77994c;
    }
}
