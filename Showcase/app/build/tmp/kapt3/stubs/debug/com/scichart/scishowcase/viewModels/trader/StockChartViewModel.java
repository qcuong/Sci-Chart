package com.scichart.scishowcase.viewModels.trader;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/scichart/scishowcase/viewModels/trader/StockChartViewModel;", "Lcom/scichart/scishowcase/viewModels/ChartViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "maHighDataSeries", "Lcom/scichart/charting/model/dataSeries/XyDataSeries;", "Ljava/util/Date;", "", "maLowDataSeries", "stockDataSeries", "Lcom/scichart/charting/model/dataSeries/OhlcDataSeries;", "volumeDataSeries", "setData", "", "data", "Lcom/scichart/scishowcase/model/trader/TradeDataPoints;", "app_debug"})
public final class StockChartViewModel extends com.scichart.scishowcase.viewModels.ChartViewModel {
    private final com.scichart.charting.model.dataSeries.OhlcDataSeries<java.util.Date, java.lang.Double> stockDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.util.Date, java.lang.Double> volumeDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.util.Date, java.lang.Double> maLowDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.util.Date, java.lang.Double> maHighDataSeries = null;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.trader.TradeDataPoints data) {
    }
    
    public StockChartViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}