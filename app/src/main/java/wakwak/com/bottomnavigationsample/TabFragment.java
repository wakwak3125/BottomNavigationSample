package wakwak.com.bottomnavigationsample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentStatePagerItemAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment extends Fragment {


    public TabFragment() {
        // Required empty public constructor
    }

    public static TabFragment newInstance() {

        Bundle args = new Bundle();

        TabFragment fragment = new TabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_tab, container, false);
        FragmentStatePagerItemAdapter adapter = new FragmentStatePagerItemAdapter(
                getChildFragmentManager(), FragmentPagerItems.with(getContext())
                .add("TAB1", PagerFragment1.class)
                .add("TAB2", PagerFragment2.class)
                .add("TAB3", PagerFragment3.class)
                .create());
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        SmartTabLayout tabLayout = (SmartTabLayout) rootView.findViewById(R.id.tab);
        tabLayout.setViewPager(viewPager);
        return rootView;
    }
}
