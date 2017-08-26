
package android.databinding;
import com.scichart.scishowcase.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 19;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.scichart.scishowcase.R.layout.ecg_blood_pressure_layout:
                    return com.scichart.scishowcase.databinding.EcgBloodPressureLayoutBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.trader_fragment:
                    return com.scichart.scishowcase.databinding.TraderFragmentBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.dashboard_fragment:
                    return com.scichart.scishowcase.databinding.DashboardFragmentBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.activity_intro:
                    return com.scichart.scishowcase.databinding.ActivityIntroBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.activity_main:
                    return com.scichart.scishowcase.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.ecg_heart_rate_layout:
                    return com.scichart.scishowcase.databinding.EcgHeartRateLayoutBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.home_page_item_layout:
                    return com.scichart.scishowcase.databinding.HomePageItemLayoutBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.ecg_blood_volume_layout:
                    return com.scichart.scishowcase.databinding.EcgBloodVolumeLayoutBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.audio_analyzer_fragment:
                    return com.scichart.scishowcase.databinding.AudioAnalyzerFragmentBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.ecg_blood_oxygenation_layout:
                    return com.scichart.scishowcase.databinding.EcgBloodOxygenationLayoutBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.home_page_fragment:
                    return com.scichart.scishowcase.databinding.HomePageFragmentBinding.bind(view, bindingComponent);
                case com.scichart.scishowcase.R.layout.ecg_fragment:
                    return com.scichart.scishowcase.databinding.EcgFragmentBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 986002933: {
                if(tag.equals("layout/ecg_blood_pressure_layout_0")) {
                    return com.scichart.scishowcase.R.layout.ecg_blood_pressure_layout;
                }
                break;
            }
            case 1824610221: {
                if(tag.equals("layout/trader_fragment_0")) {
                    return com.scichart.scishowcase.R.layout.trader_fragment;
                }
                break;
            }
            case 1741289041: {
                if(tag.equals("layout/dashboard_fragment_0")) {
                    return com.scichart.scishowcase.R.layout.dashboard_fragment;
                }
                break;
            }
            case 1378869810: {
                if(tag.equals("layout/activity_intro_0")) {
                    return com.scichart.scishowcase.R.layout.activity_intro;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.scichart.scishowcase.R.layout.activity_main;
                }
                break;
            }
            case 1240785670: {
                if(tag.equals("layout/ecg_heart_rate_layout_0")) {
                    return com.scichart.scishowcase.R.layout.ecg_heart_rate_layout;
                }
                break;
            }
            case -1966090798: {
                if(tag.equals("layout/home_page_item_layout_0")) {
                    return com.scichart.scishowcase.R.layout.home_page_item_layout;
                }
                break;
            }
            case -2093597504: {
                if(tag.equals("layout/ecg_blood_volume_layout_0")) {
                    return com.scichart.scishowcase.R.layout.ecg_blood_volume_layout;
                }
                break;
            }
            case -1807515988: {
                if(tag.equals("layout/audio_analyzer_fragment_0")) {
                    return com.scichart.scishowcase.R.layout.audio_analyzer_fragment;
                }
                break;
            }
            case -323525851: {
                if(tag.equals("layout/ecg_blood_oxygenation_layout_0")) {
                    return com.scichart.scishowcase.R.layout.ecg_blood_oxygenation_layout;
                }
                break;
            }
            case 896528406: {
                if(tag.equals("layout/home_page_fragment_0")) {
                    return com.scichart.scishowcase.R.layout.home_page_fragment;
                }
                break;
            }
            case -1952573956: {
                if(tag.equals("layout/ecg_fragment_0")) {
                    return com.scichart.scishowcase.R.layout.ecg_fragment;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"adapter"
            ,"itemAnimator"
            ,"layoutManager"
            ,"viewModel"};
    }
}