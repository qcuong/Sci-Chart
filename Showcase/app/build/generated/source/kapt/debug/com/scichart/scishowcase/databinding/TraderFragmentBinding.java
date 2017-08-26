package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class TraderFragmentBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.stockSymbol, 4);
        sViewsWithIds.put(R.id.interval, 5);
        sViewsWithIds.put(R.id.period, 6);
        sViewsWithIds.put(R.id.macdGuideline, 7);
        sViewsWithIds.put(R.id.rsiGuideline, 8);
    }
    // views
    public final android.widget.Spinner interval;
    public final com.scichart.charting.visuals.SciChartSurface macdChart;
    public final android.support.constraint.Guideline macdGuideline;
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.Spinner period;
    public final com.scichart.charting.visuals.SciChartSurface rsiChart;
    public final android.support.constraint.Guideline rsiGuideline;
    public final com.scichart.charting.visuals.SciChartSurface stockChart;
    public final android.widget.Spinner stockSymbol;
    // variables
    private com.scichart.scishowcase.viewModels.trader.TraderViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TraderFragmentBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.interval = (android.widget.Spinner) bindings[5];
        this.macdChart = (com.scichart.charting.visuals.SciChartSurface) bindings[2];
        this.macdChart.setTag(null);
        this.macdGuideline = (android.support.constraint.Guideline) bindings[7];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.period = (android.widget.Spinner) bindings[6];
        this.rsiChart = (com.scichart.charting.visuals.SciChartSurface) bindings[3];
        this.rsiChart.setTag(null);
        this.rsiGuideline = (android.support.constraint.Guideline) bindings[8];
        this.stockChart = (com.scichart.charting.visuals.SciChartSurface) bindings[1];
        this.stockChart.setTag(null);
        this.stockSymbol = (android.widget.Spinner) bindings[4];
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
                setViewModel((com.scichart.scishowcase.viewModels.trader.TraderViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.trader.TraderViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.trader.TraderViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.scichart.scishowcase.viewModels.trader.TraderViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.scichart.scishowcase.viewModels.trader.TraderViewModel ViewModel, int fieldId) {
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
        com.scichart.scishowcase.viewModels.trader.StockChartViewModel viewModelStockVM = null;
        com.scichart.scishowcase.viewModels.trader.RsiViewModel viewModelRsiVM = null;
        com.scichart.scishowcase.viewModels.trader.MacdViewModel viewModelMacdVM = null;
        com.scichart.scishowcase.viewModels.trader.TraderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.stockVM
                    viewModelStockVM = viewModel.getStockVM();
                    // read viewModel.rsiVM
                    viewModelRsiVM = viewModel.getRsiVM();
                    // read viewModel.macdVM
                    viewModelMacdVM = viewModel.getMacdVM();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceViewModel(this.macdChart, viewModelMacdVM);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceViewModel(this.rsiChart, viewModelRsiVM);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceViewModel(this.stockChart, viewModelStockVM);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static TraderFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TraderFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<TraderFragmentBinding>inflate(inflater, com.scichart.scishowcase.R.layout.trader_fragment, root, attachToRoot, bindingComponent);
    }
    public static TraderFragmentBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TraderFragmentBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.trader_fragment, null, false), bindingComponent);
    }
    public static TraderFragmentBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TraderFragmentBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/trader_fragment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new TraderFragmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}