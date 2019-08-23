package com.ss.android.ugc.aweme.im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

@Keep
public interface IImplService {
    boolean enableExpressionTab();

    boolean enableMediaRecord();

    boolean enableSendEmoji();

    boolean enableSendVoice();

    Class getEmojiRClass();

    RecyclerView.ItemDecoration getItemDecoration(Context context);

    AbsRelationListAdapter getRelationListAdapter(boolean z);

    boolean isUserVerified(IMUser iMUser);

    boolean needAwemeMsgShowFollow();

    boolean needSessionListShowMore();

    void setTitleStyle(TextView textView);

    void setupStatusBar(Activity activity);

    void setupStatusBarWithHolder(Activity activity, View view);
}
