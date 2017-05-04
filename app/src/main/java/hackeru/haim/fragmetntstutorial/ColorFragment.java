package hackeru.haim.fragmetntstutorial;


import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment implements View.OnClickListener {


    // Required only empty public constructor (in case needed)

    ConstraintLayout colorLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_color_fragment, container, false);

        colorLayout = (ConstraintLayout) v.findViewById(R.id.colorLayout);
        // no onclick via XML -> use setOnClickListener
        // no regular findViewById -> v.findViewById

        colorLayout.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        Random r = new Random();
        colorLayout.setBackgroundColor(Color.rgb(
                r.nextInt(256),
                r.nextInt(256),
                r.nextInt(256)
        ));
    }
}
