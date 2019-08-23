package org.libsdl.app;

public interface AudioRecorderInterface {
    int addPCMData(byte[] bArr, int i);

    int closeWavFile(boolean z);

    int initWavFile(int i, int i2, double d2);

    void lackPermission();

    void recordStatus(boolean z);
}
