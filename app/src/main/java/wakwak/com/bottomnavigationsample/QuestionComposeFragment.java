package wakwak.com.bottomnavigationsample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuestionComposeFragment extends Fragment {


    public QuestionComposeFragment() {
        // Required empty public constructor
    }

    public static QuestionComposeFragment newInstance() {

        Bundle args = new Bundle();

        QuestionComposeFragment fragment = new QuestionComposeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_compose, container, false);
    }

}
