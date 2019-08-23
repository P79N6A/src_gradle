package com.ss.android.ugc.aweme.services.publish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&JB\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\bH&J\b\u0010\u001f\u001a\u00020\bH&J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0017H&J\r\u0010$\u001a\u00028\u0000H&¢\u0006\u0002\u0010%R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension;", "T", "", "name", "", "getName", "()Ljava/lang/String;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "publishOutput", "Lcom/ss/android/ugc/aweme/services/publish/PublishOutput;", "onCreate", "fragment", "Landroid/support/v4/app/Fragment;", "extensionWidgetContainer", "Landroid/widget/LinearLayout;", "savedInstanceState", "Landroid/os/Bundle;", "contentType", "Lcom/ss/android/ugc/aweme/services/publish/AVPublishContentType;", "extensionMisc", "Lcom/ss/android/ugc/aweme/services/publish/ExtensionMisc;", "callback", "Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension$Callback;", "onDestroy", "onEnterChildrenMode", "onPublish", "onSaveDraft", "onSaveInstanceState", "outState", "provideExtensionData", "()Ljava/lang/Object;", "Callback", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IAVPublishExtension<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension$Callback;", "", "onContentModified", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface Callback {
        void onContentModified();
    }

    @NotNull
    String getName();

    void onActivityResult(int i, int i2, @Nullable Intent intent);

    void onBackPressed(@NotNull PublishOutput publishOutput);

    void onCreate(@NotNull Fragment fragment, @NotNull LinearLayout linearLayout, @Nullable Bundle bundle, @NotNull AVPublishContentType aVPublishContentType, @NotNull PublishOutput publishOutput, @NotNull ExtensionMisc extensionMisc, @NotNull Callback callback);

    void onDestroy();

    void onEnterChildrenMode();

    void onPublish(@NotNull PublishOutput publishOutput);

    void onSaveDraft(@NotNull PublishOutput publishOutput);

    void onSaveInstanceState(@NotNull Bundle bundle);

    T provideExtensionData();
}
