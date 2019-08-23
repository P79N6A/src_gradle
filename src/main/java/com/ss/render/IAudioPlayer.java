package com.ss.render;

public interface IAudioPlayer {

    public interface IFactory {
        IAudioPlayer createAudioPlayer();

        void destroyAudioPlayer(IAudioPlayer iAudioPlayer);
    }

    int getCurLoop();

    float getCurrentPlayTime();

    int getLoopCnt();

    float getTotalPlayTime();

    int init();

    boolean isPlaying();

    void pause();

    int release();

    void restartPlay();

    void resume();

    boolean seek(int i);

    void setCurLoopCount(int i);

    void setDataSource(String str);

    void setLoop(int i);

    void setLoop(boolean z);

    boolean setVolume(float f2);

    void startPlay();

    void stopPlay();
}
