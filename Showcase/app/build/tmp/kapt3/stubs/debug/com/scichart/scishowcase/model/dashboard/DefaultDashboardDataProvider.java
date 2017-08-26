package com.scichart.scishowcase.model.dashboard;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/scichart/scishowcase/model/dashboard/DefaultDashboardDataProvider;", "Lcom/scichart/scishowcase/model/DataProviderBase;", "Lcom/scichart/scishowcase/model/dashboard/DashboardData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getCpuUsage", "", "getMemoryUsage", "", "onNext", "app_debug"})
public final class DefaultDashboardDataProvider extends com.scichart.scishowcase.model.DataProviderBase<com.scichart.scishowcase.model.dashboard.DashboardData> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.scichart.scishowcase.model.dashboard.DashboardData onNext() {
        return null;
    }
    
    public final float getCpuUsage() {
        return 0.0F;
    }
    
    public final long getMemoryUsage() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public DefaultDashboardDataProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(0L, null);
    }
}