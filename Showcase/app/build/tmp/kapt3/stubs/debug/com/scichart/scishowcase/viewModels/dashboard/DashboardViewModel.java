package com.scichart.scishowcase.viewModels.dashboard;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/scichart/scishowcase/viewModels/dashboard/DashboardViewModel;", "Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;", "context", "Landroid/content/Context;", "dataProvider", "Lcom/scichart/scishowcase/model/IDataProvider;", "Lcom/scichart/scishowcase/model/dashboard/DashboardData;", "suspendable", "Lcom/scichart/core/framework/ISuspendable;", "(Landroid/content/Context;Lcom/scichart/scishowcase/model/IDataProvider;Lcom/scichart/core/framework/ISuspendable;)V", "dataSeries", "Lcom/scichart/charting/model/dataSeries/XyDataSeries;", "", "renderableSeries", "Lcom/scichart/charting/model/RenderableSeriesCollection;", "getRenderableSeries", "()Lcom/scichart/charting/model/RenderableSeriesCollection;", "xAxes", "Lcom/scichart/charting/model/AxisCollection;", "getXAxes", "()Lcom/scichart/charting/model/AxisCollection;", "yAxes", "getYAxes", "subscribe", "", "lifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "app_debug"})
public final class DashboardViewModel extends com.scichart.scishowcase.viewModels.FragmentViewModelBase {
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.charting.model.AxisCollection xAxes = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.charting.model.AxisCollection yAxes = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.charting.model.RenderableSeriesCollection renderableSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Long, java.lang.Long> dataSeries = null;
    private final com.scichart.scishowcase.model.IDataProvider<com.scichart.scishowcase.model.dashboard.DashboardData> dataProvider = null;
    private final com.scichart.core.framework.ISuspendable suspendable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.charting.model.AxisCollection getXAxes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.charting.model.AxisCollection getYAxes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.charting.model.RenderableSeriesCollection getRenderableSeries() {
        return null;
    }
    
    @java.lang.Override()
    public void subscribe(@org.jetbrains.annotations.NotNull()
    com.trello.rxlifecycle2.LifecycleProvider<?> lifecycleProvider) {
    }
    
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.IDataProvider<com.scichart.scishowcase.model.dashboard.DashboardData> dataProvider, @org.jetbrains.annotations.NotNull()
    com.scichart.core.framework.ISuspendable suspendable) {
        super(null);
    }
}