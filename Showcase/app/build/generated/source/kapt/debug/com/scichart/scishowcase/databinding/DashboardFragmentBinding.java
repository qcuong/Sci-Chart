package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class DashboardFragmentBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final com.scichart.charting.visuals.SciChartSurface chart;
    // variables
    private com.scichart.scishowcase.viewModels.dashboard.DashboardViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DashboardFragmentBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds);
        this.chart = (com.scichart.charting.visuals.SciChartSurface) bindings[0];
        this.chart.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.viewModel :
                setViewModel((com.scichart.scishowcase.viewModels.dashboard.DashboardViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.dashboard.DashboardViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.dashboard.DashboardViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.scichart.scishowcase.viewModels.dashboard.DashboardViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.scichart.scishowcase.viewModels.dashboard.DashboardViewModel ViewModel, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.scichart.charting.model.AxisCollection viewModelYAxes = null;
        com.scichart.charting.model.RenderableSeriesCollection viewModelRenderableSeries = null;
        com.scichart.charting.model.AxisCollection viewModelXAxes = null;
        com.scichart.scishowcase.viewModels.dashboard.DashboardViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.yAxes
                    viewModelYAxes = viewModel.getYAxes();
                    // read viewModel.renderableSeries
                    viewModelRenderableSeries = viewModel.getRenderableSeries();
                    // read viewModel.xAxes
                    viewModelXAxes = viewModel.getXAxes();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceRenderableSeries(this.chart, viewModelRenderableSeries);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceXAxes(this.chart, viewModelXAxes);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceYAxes(this.chart, viewModelYAxes);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static DashboardFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DashboardFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DashboardFragmentBinding>inflate(inflater, com.scichart.scishowcase.R.layout.dashboard_fragment, root, attachToRoot, bindingComponent);
    }
    public static DashboardFragmentBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DashboardFragmentBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.dashboard_fragment, null, false), bindingComponent);
    }
    public static DashboardFragmentBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DashboardFragmentBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/dashboard_fragment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DashboardFragmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}