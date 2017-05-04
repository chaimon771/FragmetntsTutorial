package hackeru.haim.fragmetntstutorial;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class RandomTextFragment extends Fragment implements View.OnClickListener {
    ArrayList<String> randomText = new ArrayList<>();

    TextView tvRandText;

    String[] a = {
            "Remarkable moons, to the solar system.",
            "Confucius says: the creator is like the teacher.",
            "Crushed, soaked pudding is best seasoned with warm orange juice.",
            "The doubloons loves with adventure, command the seychelles until it screams."
    };

    // Required empty public constructor

    ConstraintLayout randomTextLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_random_text, container, false);

        tvRandText = (TextView) v.findViewById(R.id.tvRandText);
        tvRandText.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        Random r = new Random();
        int rand = r.nextInt(a.length);
        String s = a[rand];

        tvRandText.setText(s);

    }
}
