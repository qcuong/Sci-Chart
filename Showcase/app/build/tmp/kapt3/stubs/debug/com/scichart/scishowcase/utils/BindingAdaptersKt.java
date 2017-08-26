package com.scichart.scishowcase.utils;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u001a\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u001a\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0007\u00a8\u0006\u0016"}, d2 = {"configureRecyclerView", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "configuration", "Lcom/scichart/scishowcase/utils/RecyclerConfiguration;", "configureSurfaceLeftOuterAxesLayoutStrategy", "surface", "Lcom/scichart/charting/visuals/SciChartSurface;", "axisLayoutManager", "Lcom/scichart/charting/layoutManagers/IAxisLayoutStrategy;", "configureSurfaceRenderableSeries", "renderableSeries", "Lcom/scichart/charting/model/RenderableSeriesCollection;", "configureSurfaceViewModel", "viewModel", "Lcom/scichart/scishowcase/viewModels/ChartViewModel;", "configureSurfaceXAxes", "xAxes", "Lcom/scichart/charting/model/AxisCollection;", "configureSurfaceYAxes", "yAxes", "app_debug"})
public final class BindingAdaptersKt {
    
    @android.databinding.BindingAdapter(value = {"app:configuration"})
    public static final void configureRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.utils.RecyclerConfiguration configuration) {
    }
    
    @android.databinding.BindingAdapter(value = {"scichart:xAxes"})
    public static final void configureSurfaceXAxes(@org.jetbrains.annotations.NotNull()
    com.scichart.charting.visuals.SciChartSurface surface, @org.jetbrains.annotations.Nullable()
    com.scichart.charting.model.AxisCollection xAxes) {
    }
    
    @android.databinding.BindingAdapter(value = {"scichart:yAxes"})
    public static final void configureSurfaceYAxes(@org.jetbrains.annotations.NotNull()
    com.scichart.charting.visuals.SciChartSurface surface, @org.jetbrains.annotations.Nullable()
    com.scichart.charting.model.AxisCollection yAxes) {
    }
    
    @android.databinding.BindingAdapter(value = {"scichart:renderableSeries"})
    public static final void configureSurfaceRenderableSeries(@org.jetbrains.annotations.NotNull()
    com.scichart.charting.visuals.SciChartSurface surface, @org.jetbrains.annotations.Nullable()
    com.scichart.charting.model.RenderableSeriesCollection renderableSeries) {
    }
    
    @android.databinding.BindingAdapter(value = {"scichart:leftOuterAxesLayoutStrategy"})
    public static final void configureSurfaceLeftOuterAxesLayoutStrategy(@org.jetbrains.annotations.NotNull()
    com.scichart.charting.visuals.SciChartSurface surface, @org.jetbrains.annotations.NotNull()
    com.scichart.charting.layoutManagers.IAxisLayoutStrategy axisLayoutManager) {
    }
    
    @android.databinding.BindingAdapter(value = {"scichart:viewModel"})
    public static final void configureSurfaceViewModel(@org.jetbrains.annotations.NotNull()
    com.scichart.charting.visuals.SciChartSurface surface, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.viewModels.ChartViewModel viewModel) {
    }
}