package com.ss.android.ugc.aweme.im.service.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface EnumType {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AwemeType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BlockStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BlockType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ChatEnterFrom {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ChatType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FollowStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FollowType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasMoreType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifySetting {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MESSAGE_SOURCE_AID {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessageContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RelationListItemType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SPAN_ACTION {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ServerResponseType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WithStatusType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface XPLAN_HEART_EMOJI_TYPE {
    }
}
