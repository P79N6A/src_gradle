package com.ss.android.ugc.aweme.services.video;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.a;
import java.util.List;
import kotlin.jvm.functions.Function1;

public interface IAVPublishService {
    void addChallenge(c cVar);

    void cancelRestoreOnMain();

    List<c> getChallenges();

    e getCurMusic();

    int getMusicChooseType();

    String getShootWay();

    boolean isPublishFinished();

    boolean isPublishing();

    boolean isUnKnown();

    boolean needRestore();

    a queryKnowFriends(int i, int i2) throws Exception;

    void removeChallenges();

    void setCurMusic(e eVar);

    void setMusicChooseType(int i);

    void setPublishStatus(int i);

    void tryRestorePublish(@NonNull FragmentActivity fragmentActivity, @NonNull Function1<Boolean, Void> function1);
}
