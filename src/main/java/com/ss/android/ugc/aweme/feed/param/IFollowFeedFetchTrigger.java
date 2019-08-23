package com.ss.android.ugc.aweme.feed.param;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/param/IFollowFeedFetchTrigger;", "", "ILoadMoreType", "IRefreshType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface IFollowFeedFetchTrigger {

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/param/IFollowFeedFetchTrigger$ILoadMoreType;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ILoadMoreType {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/param/IFollowFeedFetchTrigger$IRefreshType;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IRefreshType {
    }
}
