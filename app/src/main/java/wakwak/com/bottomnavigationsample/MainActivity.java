package wakwak.com.bottomnavigationsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, TabFragment.newInstance())
                    .commit();
        }
    }

    @OnClick(R.id.nav_1)
    public void onClickNavigation1() {
        transaction(TabFragment.newInstance());
    }

    @OnClick(R.id.nav_2)
    public void onClickNavigation2() {
        transaction(NotificationFragment.newInstance());
    }

    @OnClick(R.id.nav_3)
    public void onClickNavigation3() {
        transaction(QuestionComposeFragment.newInstance());
    }

    @OnClick(R.id.nav_4)
    public void onClickNavigation4() {
        transaction(ProfileFragment.newInstance());
    }

    @OnClick(R.id.nav_5)
    public void onClickNavigation5() {
        transaction(SettingFragment.newInstance());
    }

    private void transaction(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
