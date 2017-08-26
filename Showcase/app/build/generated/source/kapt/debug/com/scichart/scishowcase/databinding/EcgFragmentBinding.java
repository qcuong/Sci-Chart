package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class EcgFragmentBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(2, 
            new String[] {"ecg_heart_rate_layout", "ecg_blood_pressure_layout", "ecg_blood_volume_layout", "ecg_blood_oxygenation_layout"},
            new int[] {3, 4, 5, 6},
            new int[] {R.layout.ecg_heart_rate_layout, R.layout.ecg_blood_pressure_layout, R.layout.ecg_blood_volume_layout, R.layout.ecg_blood_oxygenation_layout});
        sViewsWithIds = null;
    }
    // views
    public final com.scichart.charting.visuals.SciChartSurface chart;
    public final android.widget.LinearLayout linearLayout;
    private final android.support.constraint.ConstraintLayout mboundView0;
    private final com.scichart.scishowcase.databinding.EcgHeartRateLayoutBinding mboundView2;
    private final com.scichart.scishowcase.databinding.EcgBloodPressureLayoutBinding mboundView21;
    private final com.scichart.scishowcase.databinding.EcgBloodVolumeLayoutBinding mboundView22;
    private final com.scichart.scishowcase.databinding.EcgBloodOxygenationLayoutBinding mboundView23;
    // variables
    private com.scichart.scishowcase.viewModels.ecg.EcgViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EcgFragmentBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.chart = (com.scichart.charting.visuals.SciChartSurface) bindings[1];
        this.chart.setTag(null);
        this.linearLayout = (android.widget.LinearLayout) bindings[2];
        this.linearLayout.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.scichart.scishowcase.databinding.EcgHeartRateLayoutBinding) bindings[3];
        setContainedBinding(this.mboundView2);
        this.mboundView21 = (com.scichart.scishowcase.databinding.EcgBloodPressureLayoutBinding) bindings[4];
        setContainedBinding(this.mboundView21);
        this.mboundView22 = (com.scichart.scishowcase.databinding.EcgBloodVolumeLayoutBinding) bindings[5];
        setContainedBinding(this.mboundView22);
        this.mboundView23 = (com.scichart.scishowcase.databinding.EcgBloodOxygenationLayoutBinding) bindings[6];
        setContainedBinding(this.mboundView23);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView2.invalidateAll();
        mboundView21.invalidateAll();
        mboundView22.invalidateAll();
        mboundView23.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView2.hasPendingBindings()) {
            return true;
        }
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        if (mboundView22.hasPendingBindings()) {
            return true;
        }
        if (mboundView23.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.viewModel :
                setViewModel((com.scichart.scishowcase.viewModels.ecg.EcgViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.ecg.EcgViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.ecg.EcgViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.scichart.scishowcase.viewModels.ecg.EcgViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.scichart.scishowcase.viewModels.ecg.EcgViewModel ViewModel, int fieldId) {
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
        com.scichart.charting.layoutManagers.IAxisLayoutStrategy viewModelYAxisLayoutStrategy = null;
        com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel viewModelBloodPressureVM = null;
        com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel viewModelHrVM = null;
        com.scichart.charting.model.AxisCollection viewModelXAxes = null;
        com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel viewModelBloodVolumeVM = null;
        com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel viewModelBloodOxygenationVM = null;
        com.scichart.scishowcase.viewModels.ecg.EcgViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.yAxes
                    viewModelYAxes = viewModel.getYAxes();
                    // read viewModel.renderableSeries
                    viewModelRenderableSeries = viewModel.getRenderableSeries();
                    // read viewModel.yAxisLayoutStrategy
                    viewModelYAxisLayoutStrategy = viewModel.getYAxisLayoutStrategy();
                    // read viewModel.bloodPressureVM
                    viewModelBloodPressureVM = viewModel.getBloodPressureVM();
                    // read viewModel.hrVM
                    viewModelHrVM = viewModel.getHrVM();
                    // read viewModel.xAxes
                    viewModelXAxes = viewModel.getXAxes();
                    // read viewModel.bloodVolumeVM
                    viewModelBloodVolumeVM = viewModel.getBloodVolumeVM();
                    // read viewModel.bloodOxygenationVM
                    viewModelBloodOxygenationVM = viewModel.getBloodOxygenationVM();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceLeftOuterAxesLayoutStrategy(this.chart, viewModelYAxisLayoutStrategy);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceRenderableSeries(this.chart, viewModelRenderableSeries);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceXAxes(this.chart, viewModelXAxes);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceYAxes(this.chart, viewModelYAxes);
            this.mboundView2.setViewModel(viewModelHrVM);
            this.mboundView21.setViewModel(viewModelBloodPressureVM);
            this.mboundView22.setViewModel(viewModelBloodVolumeVM);
            this.mboundView23.setViewModel(viewModelBloodOxygenationVM);
        }
        executeBindingsOn(mboundView2);
        executeBindingsOn(mboundView21);
        executeBindingsOn(mboundView22);
        executeBindingsOn(mboundView23);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static EcgFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<EcgFragmentBinding>inflate(inflater, com.scichart.scishowcase.R.layout.ecg_fragment, root, attachToRoot, bindingComponent);
    }
    public static EcgFragmentBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgFragmentBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.ecg_fragment, null, false), bindingComponent);
    }
    public static EcgFragmentBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgFragmentBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/ecg_fragment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new EcgFragmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}