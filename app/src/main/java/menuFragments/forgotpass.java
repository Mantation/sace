package menuFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bombo.sace.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class forgotpass extends Fragment {
View myview;

    public forgotpass() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview = inflater.inflate(R.layout.fragment_forgotpass, container, false);
        return myview;
    }

}
