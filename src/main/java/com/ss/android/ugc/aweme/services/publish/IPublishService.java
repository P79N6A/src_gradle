package com.ss.android.ugc.aweme.services.publish;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.ss.android.ugc.aweme.draft.a.c;

public interface IPublishService {

    public interface OnGetRecoverDraftCallback {
        void onFail();

        void onSuccess(c cVar);
    }

    public interface OnPublishCallback {
        void onStartPublish();

        void onStopPublish();
    }

    void cancelSynthetise(Context context);

    boolean checkIsAlreadyPublished(Context context);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    Class<? extends Service> getShortVideoPublishServiceClass();

    boolean inPublishPage(Context context);

    boolean isPublishServiceRunning(Context context);

    boolean isVideoPublishPreviewActivity(Context context);

    boolean processPublish(@NonNull FragmentActivity fragmentActivity, @NonNull Intent intent);

    void publishFromDraft(@NonNull FragmentActivity fragmentActivity, @NonNull c cVar);

    void setUploadRecoverPath(String str);

    void startPublish(@NonNull FragmentActivity fragmentActivity, @NonNull Bundle bundle);
}
