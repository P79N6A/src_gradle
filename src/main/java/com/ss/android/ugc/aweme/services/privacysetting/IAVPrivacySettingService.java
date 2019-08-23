package com.ss.android.ugc.aweme.services.privacysetting;

import android.app.Activity;
import android.app.AlertDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/services/privacysetting/IAVPrivacySettingService;", "", "needShowPrivacyConfirmationDialog", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)Ljava/lang/Boolean;", "showPrivacyConfirmationDialog", "Landroid/app/AlertDialog;", "onPostNowClickListener", "Lkotlin/Function0;", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IAVPrivacySettingService {
    @Nullable
    Boolean needShowPrivacyConfirmationDialog(@NotNull Activity activity);

    @Nullable
    AlertDialog showPrivacyConfirmationDialog(@NotNull Activity activity, @NotNull Function0<Unit> function0);
}
