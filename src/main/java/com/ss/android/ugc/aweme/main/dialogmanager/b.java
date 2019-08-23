package com.ss.android.ugc.aweme.main.dialogmanager;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog;", "", "getLevel", "", "shouldShow", "", "activity", "Landroid/app/Activity;", "show", "", "dismisListener", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "DialogDismissListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "", "onDialogDismiss", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
    }

    int a();

    void a(@NotNull Activity activity, @NotNull a aVar);

    boolean a(@NotNull Activity activity);
}
