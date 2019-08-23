package com.ss.avframework.livestreamv2.control;

public interface IVideoCapturerControl {

    public static class Range {
        public float max;
        public float min;
    }

    void cancelAudioFocus();

    boolean currentSupportISPControl();

    Range getExposureCompensationRange();

    int setExposureCompensation(float f2);

    int setFocusAreas(int i, int i2, int i3, int i4);

    int toggleFlashLight(boolean z);
}
