package com.scichart.scishowcase.utils;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/scichart/scishowcase/utils/PrefManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DO_NOT_SHOW_THIS_AGAIN", "", "PREF_NAME", "PRIVATE_MODE", "", "getContext", "()Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "isDoNotShowAgain", "", "setDoNotShowAgain", "", "doNotShowAgain", "app_debug"})
public final class PrefManager {
    private final int PRIVATE_MODE = 0;
    private final java.lang.String PREF_NAME = "sciShowcasePreferences";
    private final java.lang.String DO_NOT_SHOW_THIS_AGAIN = "DoNotShowThisAgain";
    private android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final void setDoNotShowAgain(boolean doNotShowAgain) {
    }
    
    public final boolean isDoNotShowAgain() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public PrefManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}