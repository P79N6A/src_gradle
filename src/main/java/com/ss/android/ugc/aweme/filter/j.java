package com.ss.android.ugc.aweme.filter;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.common.collect.ay;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000b\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;", "", "buildTabView", "Landroid/view/View;", "activity", "Landroid/support/v7/app/AppCompatActivity;", "getTabName", "", "makeDefaultFilterBean", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "makeListMultimap", "Lcom/google/common/collect/ListMultimap;", "K", "V", "setFilter", "", "filter", "triggerLoginIfNeeded", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface j {
    @NotNull
    View a(@NotNull AppCompatActivity appCompatActivity);

    @NotNull
    String a();

    void a(@NotNull h hVar);

    boolean b();

    @NotNull
    h c();

    @NotNull
    <K, V> ay<K, V> d();
}
